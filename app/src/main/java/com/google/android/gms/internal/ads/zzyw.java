package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
final class zzyw implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzyw zzb = new zzyw();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzyw() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(0);
    }

    public static zzyw zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zza = j;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e) {
                zzer.zzf("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i2 = this.zzf + 1;
                this.zzf = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i3 = this.zzf - 1;
                this.zzf = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.zza = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}

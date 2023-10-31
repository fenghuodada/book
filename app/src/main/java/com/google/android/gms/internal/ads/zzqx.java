package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzqx implements zzrl {
    private final zzfpp zzb;
    private final zzfpp zzc;

    public zzqx(int i, boolean z) {
        zzqv zzqvVar = new zzqv(i);
        zzqw zzqwVar = new zzqw(i);
        this.zzb = zzqvVar;
        this.zzc = zzqwVar;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzqz.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzqz.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzqz zzc(zzrk zzrkVar) throws IOException {
        MediaCodec mediaCodec;
        String str = zzrkVar.zza.zza;
        zzqz zzqzVar = null;
        try {
            int i = zzfn.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzqz zzqzVar2 = new zzqz(mediaCodec, zza(((zzqv) this.zzb).zza), zzb(((zzqw) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzqz.zzh(zzqzVar2, zzrkVar.zzb, zzrkVar.zzd, null, 0);
                    return zzqzVar2;
                } catch (Exception e) {
                    e = e;
                    zzqzVar = zzqzVar2;
                    if (zzqzVar != null) {
                        zzqzVar.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}

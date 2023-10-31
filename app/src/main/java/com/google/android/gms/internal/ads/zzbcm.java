package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbcm {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzffq zze;
    private final zzbco zzf;

    public zzbcm(Context context, ScheduledExecutorService scheduledExecutorService, zzbco zzbcoVar, zzffq zzffqVar) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbcoVar;
        this.zze = zzffqVar;
    }

    public final zzfwb zza() {
        return (zzfvi) zzfvr.zzn(zzfvi.zzv(zzfvr.zzh(null)), ((Long) zzbdc.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
        } else {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}

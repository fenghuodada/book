package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class zzju implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjy zzb;

    public zzju(zzjy zzjyVar, ComponentName componentName) {
        this.zzb = zzjyVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz.zzo(this.zzb.zza, this.zza);
    }
}

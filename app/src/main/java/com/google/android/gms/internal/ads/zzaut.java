package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzaut implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzaux zzb;

    public zzaut(zzaux zzauxVar, View view) {
        this.zzb = zzauxVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}

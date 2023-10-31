package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfrq extends zzfrr {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfrr zzc;

    public zzfrq(zzfrr zzfrrVar, int i, int i2) {
        this.zzc = zzfrrVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfoz.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfrr, java.util.List
    /* renamed from: zzh */
    public final zzfrr subList(int i, int i2) {
        zzfoz.zzg(i, i2, this.zzb);
        zzfrr zzfrrVar = this.zzc;
        int i3 = this.zza;
        return zzfrrVar.subList(i + i3, i2 + i3);
    }
}

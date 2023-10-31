package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzftb extends zzfrr {
    static final zzfrr zza = new zzftb(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzftb(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfoz.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr, com.google.android.gms.internal.ads.zzfrm
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final Object[] zzg() {
        return this.zzb;
    }
}

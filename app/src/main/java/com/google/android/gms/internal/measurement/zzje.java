package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzje extends zzja {
    static final zzja zza = new zzje(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzje(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zziw
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final Object[] zze() {
        return this.zzb;
    }
}

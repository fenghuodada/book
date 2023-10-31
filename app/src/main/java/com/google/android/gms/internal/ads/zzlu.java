package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzlu {
    private final zzah zza;
    private final SparseArray zzb;

    public zzlu(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int zza = zzahVar.zza(i);
            zzlt zzltVar = (zzlt) sparseArray.get(zza);
            zzltVar.getClass();
            sparseArray2.append(zza, zzltVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlt zzc(int i) {
        zzlt zzltVar = (zzlt) this.zzb.get(i);
        zzltVar.getClass();
        return zzltVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzwh extends zzdd {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwh() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public zzwh(Context context) {
        super.zzd(context);
        Point zzr = zzfn.zzr(context);
        zze(zzr.x, zzr.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public /* synthetic */ zzwh(zzwj zzwjVar, zzwg zzwgVar) {
        super(zzwjVar);
        this.zza = zzwjVar.zzG;
        this.zzb = zzwjVar.zzI;
        this.zzc = zzwjVar.zzK;
        this.zzd = zzwjVar.zzP;
        this.zze = zzwjVar.zzQ;
        this.zzf = zzwjVar.zzS;
        SparseArray zza = zzwj.zza(zzwjVar);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza.size(); i++) {
            sparseArray.put(zza.keyAt(i), new HashMap((Map) zza.valueAt(i)));
        }
        this.zzg = sparseArray;
        this.zzh = zzwj.zzb(zzwjVar).clone();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final /* synthetic */ zzdd zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzwh zzo(int i, boolean z) {
        if (this.zzh.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzh.put(i, true);
        } else {
            this.zzh.delete(i);
        }
        return this;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzye {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzya
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzyd) obj).zza - ((zzyd) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzyd) obj).zzc, ((zzyd) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzyd[] zzd = new zzyd[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzye(int i) {
    }

    public final float zza(float f) {
        ArrayList arrayList;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzyd zzydVar = (zzyd) this.zzc.get(i2);
            i += zzydVar.zzb;
            if (i >= 0.5f * f2) {
                return zzydVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzyd) this.zzc.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzyd zzydVar;
        int i2;
        zzyd zzydVar2;
        int i3;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i4 = this.zzh;
        if (i4 > 0) {
            zzyd[] zzydVarArr = this.zzd;
            int i5 = i4 - 1;
            this.zzh = i5;
            zzydVar = zzydVarArr[i5];
        } else {
            zzydVar = new zzyd(null);
        }
        int i6 = this.zzf;
        this.zzf = i6 + 1;
        zzydVar.zza = i6;
        zzydVar.zzb = i;
        zzydVar.zzc = f;
        this.zzc.add(zzydVar);
        int i7 = this.zzg + i;
        while (true) {
            this.zzg = i7;
            while (true) {
                int i8 = this.zzg;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                zzydVar2 = (zzyd) this.zzc.get(0);
                i3 = zzydVar2.zzb;
                if (i3 <= i2) {
                    this.zzg -= i3;
                    this.zzc.remove(0);
                    int i9 = this.zzh;
                    if (i9 < 5) {
                        zzyd[] zzydVarArr2 = this.zzd;
                        this.zzh = i9 + 1;
                        zzydVarArr2[i9] = zzydVar2;
                    }
                }
            }
            zzydVar2.zzb = i3 - i2;
            i7 = this.zzg - i2;
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}

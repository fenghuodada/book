package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class zzvt implements zzwx {
    protected final zzcz zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzvt(zzcz zzczVar, int[] iArr, int i) {
        int length = iArr.length;
        zzdy.zzf(length > 0);
        zzczVar.getClass();
        this.zza = zzczVar;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzczVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzam) obj2).zzi - ((zzam) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzczVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzvt zzvtVar = (zzvt) obj;
            if (this.zza == zzvtVar.zza && Arrays.equals(this.zzc, zzvtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final zzam zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final zzcz zze() {
        return this.zza;
    }
}

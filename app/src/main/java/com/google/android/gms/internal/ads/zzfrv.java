package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfrv extends zzfrk {
    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfrv() {
        super(4);
    }

    public zzfrv(int i) {
        super(i);
        this.zzd = new Object[zzfrw.zzh(i)];
    }

    @Override // com.google.android.gms.internal.ads.zzfrk, com.google.android.gms.internal.ads.zzfrl
    public final /* bridge */ /* synthetic */ zzfrl zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfrv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfrw.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int hashCode = obj.hashCode();
                int zza = zzfrj.zza(hashCode);
                while (true) {
                    Object[] objArr = this.zzd;
                    int i = zza & (length - 1);
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfrv zzg(Iterable iterable) {
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zzf(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfrw zzh() {
        zzfrw zzs;
        boolean zzt;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.zza[0];
                obj.getClass();
                return new zzfto(obj);
            }
            if (this.zzd == null || zzfrw.zzh(i) != this.zzd.length) {
                zzs = zzfrw.zzs(this.zzb, this.zza);
                this.zzb = zzs.size();
            } else {
                int i2 = this.zzb;
                Object[] objArr = this.zza;
                zzt = zzfrw.zzt(i2, objArr.length);
                if (zzt) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.zze;
                Object[] objArr2 = this.zzd;
                zzs = new zzfth(objArr, i3, objArr2, objArr2.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzs;
        }
        return zzfth.zza;
    }
}

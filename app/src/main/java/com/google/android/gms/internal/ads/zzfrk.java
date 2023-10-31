package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfrk extends zzfrl {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    public zzfrk(int i) {
        this.zza = new Object[i];
    }

    private final void zzf(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzfrl.zze(length, i));
        } else if (!this.zzc) {
            return;
        } else {
            this.zza = (Object[]) objArr.clone();
        }
        this.zzc = false;
    }

    public final zzfrk zza(Object obj) {
        obj.getClass();
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrl
    public /* bridge */ /* synthetic */ zzfrl zzb(Object obj) {
        throw null;
    }

    public final zzfrl zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size() + this.zzb);
            if (collection instanceof zzfrm) {
                this.zzb = ((zzfrm) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i) {
        zzfsz.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}

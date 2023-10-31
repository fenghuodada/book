package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfth extends zzfrw {
    static final zzfth zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfth(objArr, 0, objArr, 0, 0);
    }

    public zzfth(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzb = zzfrj.zzb(obj);
        while (true) {
            int i = zzb & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzg);
        return i + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzftr zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final zzfrr zzi() {
        return zzfrr.zzi(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final boolean zzr() {
        return true;
    }
}

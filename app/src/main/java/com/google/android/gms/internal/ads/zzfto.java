package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfto extends zzfrw {
    final transient Object zza;

    public zzfto(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfrz(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C0663f.m12005a("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzfrr zzd() {
        return zzfrr.zzm(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzftr zze() {
        return new zzfrz(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        throw null;
    }
}

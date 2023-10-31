package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfte extends zzfrw {
    private final transient zzfru zza;
    private final transient zzfrr zzb;

    public zzfte(zzfru zzfruVar, zzfrr zzfrrVar) {
        this.zza = zzfruVar;
        this.zzb = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzfrr zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzftr zze() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        throw null;
    }
}

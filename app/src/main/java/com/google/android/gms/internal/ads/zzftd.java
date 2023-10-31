package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzftd extends zzfrw {
    private final transient zzfru zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzftd(zzfru zzfruVar, Object[] objArr, int i, int i2) {
        this.zza = zzfruVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfrm
    public final zzftr zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final zzfrr zzi() {
        return new zzftc(this);
    }
}

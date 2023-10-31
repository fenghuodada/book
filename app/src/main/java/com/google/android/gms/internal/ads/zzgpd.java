package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgpd extends AbstractList {
    private final List zza;
    private final zzgpc zzb;

    public zzgpd(List list, zzgpc zzgpcVar) {
        this.zza = list;
        this.zzb = zzgpcVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzaxv zzb = zzaxv.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb == null ? zzaxv.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}

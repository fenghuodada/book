package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfqz extends AbstractCollection {
    final /* synthetic */ zzfra zza;

    public zzfqz(zzfra zzfraVar) {
        this.zza = zzfraVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfra zzfraVar = this.zza;
        Map zzj = zzfraVar.zzj();
        return zzj != null ? zzj.values().iterator() : new zzfqt(zzfraVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfqx extends AbstractSet {
    final /* synthetic */ zzfra zza;

    public zzfqx(zzfra zzfraVar) {
        this.zza = zzfraVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfra zzfraVar = this.zza;
        Map zzj = zzfraVar.zzj();
        return zzj != null ? zzj.keySet().iterator() : new zzfqr(zzfraVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object zzs;
        Object obj2;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.keySet().remove(obj);
        }
        zzs = this.zza.zzs(obj);
        obj2 = zzfra.zzd;
        return zzs != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

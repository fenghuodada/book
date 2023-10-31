package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfqa extends zzfsj {
    final /* synthetic */ zzfqk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqa(zzfqk zzfqkVar, Map map) {
        super(map);
        this.zza = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzfsb.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfsj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfpz(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfsj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int i;
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqk zzfqkVar = this.zza;
            i = zzfqkVar.zzb;
            zzfqkVar.zzb = i - size;
            return size > 0;
        }
        return false;
    }
}

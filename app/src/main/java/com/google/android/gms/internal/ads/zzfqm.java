package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfqm extends AbstractCollection {
    final /* synthetic */ zzfqn zza;

    public zzfqm(zzfqn zzfqnVar) {
        this.zza = zzfqnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        for (Collection collection : this.zza.zzs().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zze();
    }
}

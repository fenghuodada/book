package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfpz implements Iterator, p060j$.util.Iterator {
    @CheckForNull
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfqa zzc;

    public zzfpz(zzfqa zzfqaVar, Iterator it) {
        this.zzc = zzfqaVar;
        this.zzb = it;
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        int i;
        zzfoz.zzi(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfqk zzfqkVar = this.zzc.zza;
        i = zzfqkVar.zzb;
        zzfqkVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }
}

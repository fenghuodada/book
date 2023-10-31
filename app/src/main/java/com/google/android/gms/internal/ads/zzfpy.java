package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfpy implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    @CheckForNull
    Object zzb;
    @CheckForNull
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzfqk zze;

    public zzfpy(zzfqk zzfqkVar) {
        Map map;
        this.zze = zzfqkVar;
        map = zzfqkVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfsa.INSTANCE;
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfqk zzfqkVar = this.zze;
        i = zzfqkVar.zzb;
        zzfqkVar.zzb = i - 1;
    }
}

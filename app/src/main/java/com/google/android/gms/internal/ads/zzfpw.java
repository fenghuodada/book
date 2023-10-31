package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
final class zzfpw implements Iterator, p060j$.util.Iterator {
    final Iterator zza;
    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzfpx zzc;

    public zzfpw(zzfpx zzfpxVar) {
        this.zzc = zzfpxVar;
        this.zza = zzfpxVar.zza.entrySet().iterator();
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
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        int i;
        zzfoz.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfqk zzfqkVar = this.zzc.zzb;
        i = zzfqkVar.zzb;
        zzfqkVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}

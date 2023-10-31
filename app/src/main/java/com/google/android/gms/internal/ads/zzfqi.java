package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class zzfqi extends zzfqg implements ListIterator {
    final /* synthetic */ zzfqj zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqi(zzfqj zzfqjVar) {
        super(zzfqjVar);
        this.zzd = zzfqjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqi(zzfqj zzfqjVar, int i) {
        super(zzfqjVar, ((List) zzfqjVar.zzb).listIterator(i));
        this.zzd = zzfqjVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfqk zzfqkVar = this.zzd.zzf;
        i = zzfqkVar.zzb;
        zzfqkVar.zzb = i + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}

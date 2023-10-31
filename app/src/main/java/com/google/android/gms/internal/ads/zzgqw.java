package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
final class zzgqw implements Iterator, p060j$.util.Iterator {
    private final ArrayDeque zza;
    private zzgnj zzb;

    public /* synthetic */ zzgqw(zzgno zzgnoVar, zzgqv zzgqvVar) {
        zzgnj zzgnjVar;
        zzgno zzgnoVar2;
        if (zzgnoVar instanceof zzgqy) {
            zzgqy zzgqyVar = (zzgqy) zzgnoVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgqyVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgqyVar);
            zzgnoVar2 = zzgqyVar.zzd;
            zzgnjVar = zzb(zzgnoVar2);
        } else {
            this.zza = null;
            zzgnjVar = (zzgnj) zzgnoVar;
        }
        this.zzb = zzgnjVar;
    }

    private final zzgnj zzb(zzgno zzgnoVar) {
        while (zzgnoVar instanceof zzgqy) {
            zzgqy zzgqyVar = (zzgqy) zzgnoVar;
            this.zza.push(zzgqyVar);
            zzgnoVar = zzgqyVar.zzd;
        }
        return (zzgnj) zzgnoVar;
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
        return this.zzb != null;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    /* renamed from: zza */
    public final zzgnj next() {
        zzgnj zzgnjVar;
        zzgno zzgnoVar;
        zzgnj zzgnjVar2 = this.zzb;
        if (zzgnjVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgnjVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgnoVar = ((zzgqy) this.zza.pop()).zze;
                zzgnjVar = zzb(zzgnoVar);
            } while (zzgnjVar.zzd() == 0);
            this.zzb = zzgnjVar;
            return zzgnjVar2;
        }
        throw new NoSuchElementException();
    }
}

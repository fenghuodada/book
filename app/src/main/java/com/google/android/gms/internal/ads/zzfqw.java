package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
abstract class zzfqw implements Iterator, p060j$.util.Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfra zze;

    public /* synthetic */ zzfqw(zzfra zzfraVar, zzfqv zzfqvVar) {
        int i;
        this.zze = zzfraVar;
        i = zzfraVar.zzf;
        this.zzb = i;
        this.zzc = zzfraVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
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
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        zzb();
        zzfoz.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfra zzfraVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzfraVar.zzb;
        objArr.getClass();
        zzfraVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}

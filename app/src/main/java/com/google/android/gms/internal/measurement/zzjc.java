package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzjc extends zzjh {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzjc(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}

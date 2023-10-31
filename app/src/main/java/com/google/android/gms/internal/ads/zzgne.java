package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgne extends zzgng {
    final /* synthetic */ zzgno zza;
    private int zzb = 0;
    private final int zzc;

    public zzgne(zzgno zzgnoVar) {
        this.zza = zzgnoVar;
        this.zzc = zzgnoVar.zzd();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}

package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzgqs extends zzgng {
    final zzgqw zza;
    zzgni zzb = zzb();
    final /* synthetic */ zzgqy zzc;

    public zzgqs(zzgqy zzgqyVar) {
        this.zzc = zzgqyVar;
        this.zza = new zzgqw(zzgqyVar, null);
    }

    private final zzgni zzb() {
        zzgqw zzgqwVar = this.zza;
        if (zzgqwVar.hasNext()) {
            return zzgqwVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final byte zza() {
        zzgni zzgniVar = this.zzb;
        if (zzgniVar != null) {
            byte zza = zzgniVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}

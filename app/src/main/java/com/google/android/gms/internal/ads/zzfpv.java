package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfpv extends zzfsi {
    final /* synthetic */ zzfpx zza;

    public zzfpv(zzfpx zzfpxVar) {
        this.zza = zzfpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfqq.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfpw(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzfqk.zzo(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsi
    public final Map zza() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class zzfpt extends zzfqk implements zzfsc {
    public zzfpt(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfqk
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    public final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}

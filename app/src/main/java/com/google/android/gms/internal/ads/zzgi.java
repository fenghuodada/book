package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzgi extends zzfrh {
    private final Map zza;

    public zzgi(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final Set entrySet() {
        return zzftn.zzb(this.zza.entrySet(), new zzfpa() { // from class: com.google.android.gms.internal.ads.zzgg
            @Override // com.google.android.gms.internal.ads.zzfpa
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final Set keySet() {
        return zzftn.zzb(this.zza.keySet(), new zzfpa() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // com.google.android.gms.internal.ads.zzfpa
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, com.google.android.gms.internal.ads.zzfri
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final Map zzb() {
        return this.zza;
    }
}

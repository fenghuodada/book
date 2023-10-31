package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class zzbut extends zzbuv {
    private final String zza;
    private final int zzb;

    public zzbut(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbut)) {
            zzbut zzbutVar = (zzbut) obj;
            if (Objects.equal(this.zza, zzbutVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbutVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final String zzc() {
        return this.zza;
    }
}

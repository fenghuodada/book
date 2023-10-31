package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzeqj implements zzeqq {
    private final boolean zza;

    public zzeqj(@Nullable zzexa zzexaVar) {
        this.zza = zzexaVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzh(this.zza ? new zzeqp() { // from class: com.google.android.gms.internal.ads.zzeqi
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}

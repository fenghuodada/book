package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzemk implements zzeqq {
    @Nullable
    private final zzewd zza;

    public zzemk(@Nullable zzewd zzewdVar) {
        this.zza = zzewdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzewd zzewdVar = this.zza;
        zzeqp zzeqpVar = null;
        if (zzewdVar != null && zzewdVar.zza() != null && !zzewdVar.zza().isEmpty()) {
            zzeqpVar = new zzeqp() { // from class: com.google.android.gms.internal.ads.zzemj
                @Override // com.google.android.gms.internal.ads.zzeqp
                public final void zzh(Object obj) {
                    zzemk.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfvr.zzh(zzeqpVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzfna extends zzfnm {
    final /* synthetic */ zzfnb zza;
    private final zzfng zzb;

    public zzfna(zzfnb zzfnbVar, zzfng zzfngVar) {
        this.zza = zzfnbVar;
        this.zzb = zzfngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfne zzc = zzfnf.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}

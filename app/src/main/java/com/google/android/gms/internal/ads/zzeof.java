package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeof implements zzeqp {
    public final zzeze zza;

    public zzeof(zzeze zzezeVar) {
        this.zza = zzezeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzeze zzezeVar = this.zza;
        if (zzezeVar != null) {
            bundle.putBoolean("render_in_browser", zzezeVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}

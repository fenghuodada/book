package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzelw implements zzeqp {
    @Nullable
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzelw(@Nullable String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle zza = zzfal.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", this.zza);
        zza.putInt("pvid_s", this.zzb);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import libv2ray.V2rayConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhz implements zzlo {
    final /* synthetic */ zzik zza;

    public zzhz(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD(V2rayConfig.DEFAULT_SECURITY, "_err", bundle);
        } else {
            this.zza.zzF(V2rayConfig.DEFAULT_SECURITY, "_err", bundle, str);
        }
    }
}

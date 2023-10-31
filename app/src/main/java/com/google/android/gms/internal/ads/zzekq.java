package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzekq implements zzeqp {
    @Nullable
    private final String zza;

    public zzekq(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}

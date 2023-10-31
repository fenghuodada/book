package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzepy implements zzeqp {
    @Nullable
    private final String zza;

    public zzepy(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza)) {
            return;
        }
        bundle.putString("query_info", this.zza);
    }
}

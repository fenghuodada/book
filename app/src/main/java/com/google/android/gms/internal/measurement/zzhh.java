package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C0482i;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzhh {
    private final C0482i zza;

    public zzhh(C0482i c0482i) {
        this.zza = c0482i;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        C0482i c0482i;
        if (uri != null) {
            c0482i = (C0482i) this.zza.getOrDefault(uri.toString(), null);
        } else {
            c0482i = null;
        }
        if (c0482i == null) {
            return null;
        }
        return (String) c0482i.getOrDefault("".concat(str3), null);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* loaded from: classes.dex */
public final class zzbnm extends zzbzy {
    private final zzbnl zza;

    public zzbnm(zzbnl zzbnlVar, @Nullable String str) {
        super(str);
        this.zza = zzbnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzy, com.google.android.gms.internal.ads.zzbzl
    @WorkerThread
    public final boolean zza(String str) {
        zzbzt.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzbzt.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}

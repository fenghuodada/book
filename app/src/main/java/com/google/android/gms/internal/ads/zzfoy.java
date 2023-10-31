package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfoy {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzfoy.class.getName());
    private static final zzfox zzc = new zzfox(null);

    private zzfoy() {
    }

    public static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}

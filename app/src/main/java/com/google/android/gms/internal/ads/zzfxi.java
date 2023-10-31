package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfxi {
    public static zzfxh zza(String str) throws GeneralSecurityException {
        zzfxh zzfxhVar = (zzfxh) zzfyd.zzd().get("AES128_GCM");
        if (zzfxhVar != null) {
            return zzfxhVar;
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}

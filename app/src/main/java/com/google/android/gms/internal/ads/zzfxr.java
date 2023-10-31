package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzfxr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfxq zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfxq zzfxqVar = (zzfxq) it.next();
            if (zzfxqVar.zza()) {
                return zzfxqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}

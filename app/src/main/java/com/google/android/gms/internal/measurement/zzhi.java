package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzhi {
    public static Object zza(zzhj zzhjVar) {
        try {
            return zzhjVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzhjVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}

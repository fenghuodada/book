package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class zzape implements Runnable {
    private zzape() {
    }

    public /* synthetic */ zzape(zzapd zzapdVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzapf.zzc(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            zzapf.zzb.countDown();
            throw th;
        }
        zzapf.zzb.countDown();
    }
}

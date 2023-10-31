package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfwj {
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}

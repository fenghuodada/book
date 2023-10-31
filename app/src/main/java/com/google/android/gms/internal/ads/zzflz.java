package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzflz extends zzflx {
    private static zzflz zzc;

    private zzflz(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzflz zzj(Context context) {
        zzflz zzflzVar;
        synchronized (zzflz.class) {
            if (zzc == null) {
                zzc = new zzflz(context);
            }
            zzflzVar = zzc;
        }
        return zzflzVar;
    }

    public final zzflw zzh(long j, boolean z) throws IOException {
        zzflw zzb;
        synchronized (zzflz.class) {
            zzb = zzb(null, null, j, z);
        }
        return zzb;
    }

    public final zzflw zzi(String str, String str2, long j, boolean z) throws IOException {
        zzflw zzb;
        synchronized (zzflz.class) {
            zzb = zzb(str, str2, j, z);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzflz.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzflz.class) {
            zzf(true);
        }
    }
}

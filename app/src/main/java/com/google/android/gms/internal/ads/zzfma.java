package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzfma extends zzflx {
    private static zzfma zzc;

    private zzfma(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfma zzi(Context context) {
        zzfma zzfmaVar;
        synchronized (zzfma.class) {
            if (zzc == null) {
                zzc = new zzfma(context);
            }
            zzfmaVar = zzc;
        }
        return zzfmaVar;
    }

    public final zzflw zzh(long j, boolean z) throws IOException {
        synchronized (zzfma.class) {
            if (zzo()) {
                return zzb(null, null, j, z);
            }
            return new zzflw();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfma.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}

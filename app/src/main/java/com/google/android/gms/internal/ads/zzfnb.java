package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* loaded from: classes.dex */
final class zzfnb {
    private static final zzfno zzb = new zzfno("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    @Nullable
    @VisibleForTesting
    final zzfnz zza;
    private final String zzd;

    public zzfnb(Context context) {
        this.zza = zzfoc.zza(context) ? new zzfnz(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfmw.zza, null) : null;
        this.zzd = context.getPackageName();
    }

    public final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    public final void zzd(zzfms zzfmsVar, zzfng zzfngVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfmy(this, taskCompletionSource, zzfmsVar, zzfngVar, taskCompletionSource), taskCompletionSource);
    }

    public final void zze(zzfnd zzfndVar, zzfng zzfngVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else if (zzfndVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfmx(this, taskCompletionSource, zzfndVar, zzfngVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfne zzc2 = zzfnf.zzc();
            zzc2.zzb(8160);
            zzfngVar.zza(zzc2.zzc());
        }
    }

    public final void zzf(zzfni zzfniVar, zzfng zzfngVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfmz(this, taskCompletionSource, zzfniVar, i, zzfngVar, taskCompletionSource), taskCompletionSource);
    }
}

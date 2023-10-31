package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes.dex */
public final class zzduq implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzduq(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzdul) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzfgo {
    public static zzfgo zza(zzfgp zzfgpVar, zzfgq zzfgqVar) {
        if (zzfgm.zzb()) {
            return new zzfgs(zzfgpVar, zzfgqVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfgu zzfguVar, @Nullable String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}

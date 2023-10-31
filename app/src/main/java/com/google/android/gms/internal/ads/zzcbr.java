package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzcbr {
    private final Context zza;
    private final zzccc zzb;
    private final ViewGroup zzc;
    private zzcbq zzd;

    public zzcbr(Context context, ViewGroup viewGroup, zzcfb zzcfbVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfbVar;
        this.zzd = null;
    }

    public final zzcbq zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        zzcbq zzcbqVar = this.zzd;
        if (zzcbqVar != null) {
            return zzcbqVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbq zzcbqVar = this.zzd;
        if (zzcbqVar != null) {
            zzcbqVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzccb zzccbVar) {
        if (this.zzd != null) {
            return;
        }
        zzbbu.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzccc zzcccVar = this.zzb;
        zzcbq zzcbqVar = new zzcbq(context, zzcccVar, i5, z, zzcccVar.zzm().zza(), zzccbVar);
        this.zzd = zzcbqVar;
        this.zzc.addView(zzcbqVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbq zzcbqVar = this.zzd;
        if (zzcbqVar != null) {
            zzcbqVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbq zzcbqVar = this.zzd;
        if (zzcbqVar != null) {
            zzcbqVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbq zzcbqVar = this.zzd;
        if (zzcbqVar != null) {
            zzcbqVar.zzC(i);
        }
    }
}

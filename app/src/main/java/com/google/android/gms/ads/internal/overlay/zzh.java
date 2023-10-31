package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfb;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcfb zzcfbVar) throws zzf {
        this.zzb = zzcfbVar.getLayoutParams();
        ViewParent parent = zzcfbVar.getParent();
        this.zzd = zzcfbVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcfbVar.zzF());
        viewGroup.removeView(zzcfbVar.zzF());
        zzcfbVar.zzan(true);
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzcff implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbwu zza;
    final /* synthetic */ zzcfi zzb;

    public zzcff(zzcfi zzcfiVar, zzbwu zzbwuVar) {
        this.zzb = zzcfiVar;
        this.zza = zzbwuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

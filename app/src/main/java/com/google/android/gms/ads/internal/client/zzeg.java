package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeg extends zzcz {
    private zzeg() {
    }

    public /* synthetic */ zzeg(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(@Nullable zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzej.zzf().zzh;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}

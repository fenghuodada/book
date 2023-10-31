package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdlg implements zzbed {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdlh zzb;

    public zzdlg(zzdlh zzdlhVar, String str) {
        this.zzb = zzdlhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzc() {
        zzdgx zzdgxVar;
        zzdgx zzdgxVar2;
        zzdlh zzdlhVar = this.zzb;
        zzdgxVar = zzdlhVar.zzd;
        if (zzdgxVar != null) {
            zzdgxVar2 = zzdlhVar.zzd;
            zzdgxVar2.zzE(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzd(MotionEvent motionEvent) {
    }
}

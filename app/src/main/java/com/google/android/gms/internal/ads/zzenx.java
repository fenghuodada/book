package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzenx implements zzeqp {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzenx(String str, boolean z, boolean z2, boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziH)).booleanValue()) {
            if (this.zzb || this.zzc) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
        }
    }
}

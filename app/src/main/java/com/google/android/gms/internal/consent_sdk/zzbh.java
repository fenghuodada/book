package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* loaded from: classes.dex */
public final class zzbh implements zzch<zzbg> {
    private final zzcl<zzbi> zza;
    private final zzcl<Handler> zzb;
    private final zzcl<zzbm> zzc;

    public zzbh(zzcl<zzbi> zzclVar, zzcl<Handler> zzclVar2, zzcl<zzbm> zzclVar3) {
        this.zza = zzclVar;
        this.zzb = zzclVar2;
        this.zzc = zzclVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* renamed from: zza */
    public final zzbg zzb() {
        Handler handler = zzcd.zza;
        zzck.zza(handler);
        return new zzbg(this.zza.zzb(), handler, ((zzbn) this.zzc).zzb());
    }
}

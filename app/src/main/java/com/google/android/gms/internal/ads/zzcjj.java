package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjj implements zzevt {
    private final zzcir zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcjj(zzcir zzcirVar, zzcji zzcjiVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* synthetic */ zzevt zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* synthetic */ zzevt zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* synthetic */ zzevt zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final zzevu zzd() {
        zzgvw.zzc(this.zzb, Context.class);
        zzgvw.zzc(this.zzc, String.class);
        zzgvw.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcjl(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

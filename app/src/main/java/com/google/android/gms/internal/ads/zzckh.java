package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckh implements zzexk {
    private final zzcir zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzckh(zzcir zzcirVar, zzckg zzckgVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexk
    public final /* synthetic */ zzexk zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexk
    public final /* synthetic */ zzexk zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexk
    public final /* synthetic */ zzexk zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexk
    public final zzexl zzd() {
        zzgvw.zzc(this.zzb, Context.class);
        zzgvw.zzc(this.zzc, String.class);
        zzgvw.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzckj(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

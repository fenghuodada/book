package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckl implements zzeyy {
    private final zzcir zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzckl(zzcir zzcirVar, zzckk zzckkVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyy
    public final /* synthetic */ zzeyy zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyy
    public final /* synthetic */ zzeyy zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyy
    public final zzeyz zzc() {
        zzgvw.zzc(this.zzb, Context.class);
        return new zzckn(this.zza, this.zzb, this.zzc, null);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzciz implements zzeuf {
    private final zzcir zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzciz(zzcir zzcirVar, zzciy zzciyVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuf
    public final /* synthetic */ zzeuf zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuf
    public final /* synthetic */ zzeuf zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuf
    public final zzeug zzc() {
        zzgvw.zzc(this.zzb, Context.class);
        zzgvw.zzc(this.zzc, String.class);
        return new zzcjb(this.zza, this.zzb, this.zzc, null);
    }
}

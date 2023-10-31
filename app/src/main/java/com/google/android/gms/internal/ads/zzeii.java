package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzeii extends com.google.android.gms.ads.internal.client.zzbp {
    @VisibleForTesting
    final zzezy zza;
    @VisibleForTesting
    final zzdhl zzb;
    private final Context zzc;
    private final zzcgw zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzeii(zzcgw zzcgwVar, Context context, String str) {
        zzezy zzezyVar = new zzezy();
        this.zza = zzezyVar;
        this.zzb = new zzdhl();
        this.zzd = zzcgwVar;
        zzezyVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdhn zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzezy zzezyVar = this.zza;
        if (zzezyVar.zzg() == null) {
            zzezyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzeij(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfo zzbfoVar) {
        this.zzb.zza(zzbfoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfr zzbfrVar) {
        this.zzb.zzb(zzbfrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbfx zzbfxVar, @Nullable zzbfu zzbfuVar) {
        this.zzb.zzc(str, zzbfxVar, zzbfuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbkz zzbkzVar) {
        this.zzb.zzd(zzbkzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgb zzbgbVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbgbVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbge zzbgeVar) {
        this.zzb.zzf(zzbgeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbkq zzbkqVar) {
        this.zza.zzv(zzbkqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbee zzbeeVar) {
        this.zza.zzA(zzbeeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzQ(zzcfVar);
    }
}

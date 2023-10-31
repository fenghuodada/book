package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdxk {
    @VisibleForTesting
    public zzfwb zza;
    private final zzcyb zzb;
    private final zzdws zzc;
    private final zzfed zzd;
    private final zzfaa zze;
    private final zzbzz zzf;
    private final zzfft zzg;
    private final zzffq zzh;
    private final Context zzi;
    private final zzfwc zzj;

    public zzdxk(zzcyb zzcybVar, zzdws zzdwsVar, zzfed zzfedVar, zzfaa zzfaaVar, zzbzz zzbzzVar, zzfft zzfftVar, zzffq zzffqVar, Context context, zzfwc zzfwcVar) {
        this.zzb = zzcybVar;
        this.zzc = zzdwsVar;
        this.zzd = zzfedVar;
        this.zze = zzfaaVar;
        this.zzf = zzbzzVar;
        this.zzg = zzfftVar;
        this.zzh = zzffqVar;
        this.zzi = context;
        this.zzj = zzfwcVar;
    }

    public final /* synthetic */ zzbto zza(zzbug zzbugVar, zzdyv zzdyvVar) {
        Context context = this.zzi;
        zzdyvVar.zzc.put("Content-Type", zzdyvVar.zze);
        zzdyvVar.zzc.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbugVar.zzb.zza));
        String str = zzdyvVar.zza;
        int i = zzdyvVar.zzb;
        Map map = zzdyvVar.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbto(str, i, bundle, zzdyvVar.zzd, zzdyvVar.zzf, zzbugVar.zzd, zzbugVar.zzh);
    }

    public final zzfwb zzc(final zzbug zzbugVar, final JSONObject jSONObject, final zzbuj zzbujVar) {
        this.zzb.zzbA(zzbugVar);
        zzfdu zzb = this.zzd.zzb(zzfdx.PROXY, zzfvr.zzl(this.zzd.zzb(zzfdx.PREPARE_HTTP_REQUEST, zzfvr.zzh(new zzdyz(jSONObject, zzbujVar))).zze(new zzdza(zzbugVar.zzg, this.zzh, zzffe.zza(this.zzi, 9))).zza(), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return zzdxk.this.zza(zzbugVar, (zzdyv) obj);
            }
        }, this.zzj));
        final zzdws zzdwsVar = this.zzc;
        zzfdi zza = zzb.zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdws.this.zzc((zzbto) obj);
            }
        }).zza();
        this.zza = zza;
        zzfwb zzm = zzfvr.zzm(this.zzd.zzb(zzfdx.PRE_PROCESS, zza).zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                return new zzdyi(zzdyw.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbujVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdyi.zza, zzbmv.zzb)).zza(), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdxk.this.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzfvr.zzq(zzm, new zzdxj(this), this.zzj);
        return zzm;
    }

    public final /* synthetic */ zzfwb zzd(InputStream inputStream) throws Exception {
        return zzfvr.zzh(new zzezr(new zzezo(this.zze), zzezq.zza(new InputStreamReader(inputStream))));
    }
}

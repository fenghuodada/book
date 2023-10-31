package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzele implements zzeqq {
    private final zzfwc zza;
    private final zzdnx zzb;
    private final zzdse zzc;
    private final zzelg zzd;

    public zzele(zzfwc zzfwcVar, zzdnx zzdnxVar, zzdse zzdseVar, zzelg zzelgVar) {
        this.zza = zzfwcVar;
        this.zzb = zzdnxVar;
        this.zzc = zzdseVar;
        this.zzd = zzelgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzbbc zzbbcVar = zzbbk.zzjX;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue() && this.zzd.zza() != null) {
            zzelf zza = this.zzd.zza();
            zza.getClass();
            return zzfvr.zzh(zza);
        }
        if (zzfpo.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbn)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzfvr.zzh(new zzelf(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzele.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzelf zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbn)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfav zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjX)).booleanValue() || zzt) {
                    try {
                        zzbqj zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfaf unused) {
                    }
                }
                try {
                    zzbqj zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfaf unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfaf unused3) {
            }
        }
        zzelf zzelfVar = new zzelf(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjX)).booleanValue()) {
            this.zzd.zzb(zzelfVar);
        }
        return zzelfVar;
    }
}

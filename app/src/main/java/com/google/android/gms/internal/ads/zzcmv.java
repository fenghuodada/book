package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcmv implements zzcml {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcmv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (parseBoolean) {
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcC)).booleanValue()) {
                        zzflz.zzj(this.zza).zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcL)).booleanValue()) {
                        zzflz.zzj(this.zza).zzl();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcD)).booleanValue()) {
                        zzfma.zzi(this.zza).zzj();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcH)).booleanValue()) {
                            zzfma.zzi(this.zza).zzk();
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcI)).booleanValue()) {
                            zzfma.zzi(this.zza).zzl();
                        }
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzau)).booleanValue()) {
                this.zzb.zzH(parseBoolean);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue() && parseBoolean) {
                    this.zza.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzap)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
        }
    }
}

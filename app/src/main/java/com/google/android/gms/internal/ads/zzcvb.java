package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzcvb extends com.google.android.gms.ads.internal.client.zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeca zzh;
    private final Bundle zzi;

    public zzcvb(zzezf zzezfVar, String str, zzeca zzecaVar, zzezi zzeziVar, String str2) {
        String str3 = null;
        this.zzb = zzezfVar == null ? null : zzezfVar.zzac;
        this.zzc = str2;
        this.zzd = zzeziVar == null ? null : zzeziVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = zzezfVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzecaVar.zzc();
        this.zzh = zzecaVar;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000;
        this.zzi = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgB)).booleanValue() || zzeziVar == null) ? new Bundle() : zzeziVar.zzj;
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziI)).booleanValue() || zzeziVar == null || TextUtils.isEmpty(zzeziVar.zzh)) ? "" : zzeziVar.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzeca zzecaVar = this.zzh;
        if (zzecaVar != null) {
            return zzecaVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

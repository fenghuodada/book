package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfwb;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzw implements zzfvn {
    final /* synthetic */ zzfwb zza;
    final /* synthetic */ zzbyo zzb;
    final /* synthetic */ zzbyh zzc;
    final /* synthetic */ zzfff zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    public zzw(zzaa zzaaVar, zzfwb zzfwbVar, zzbyo zzbyoVar, zzbyh zzbyhVar, zzfff zzfffVar, long j) {
        this.zzf = zzaaVar;
        this.zza = zzfwbVar;
        this.zzb = zzbyoVar;
        this.zzc = zzbyhVar;
        this.zzd = zzfffVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzdqh zzdqhVar;
        zzdpx zzdpxVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdqhVar = zzaaVar.zzr;
        zzdpxVar = zzaaVar.zzj;
        zzf.zzc(zzdqhVar, zzdpxVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzffq zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbcw.zze.zze()).booleanValue() && zzr != null) {
            zzfff zzfffVar = this.zzd;
            zzfffVar.zzg(th);
            zzfffVar.zzf(false);
            zzr.zza(zzfffVar);
            zzr.zzg();
        }
        try {
            zzbyh zzbyhVar = this.zzc;
            zzbyhVar.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        zzfff zzfffVar;
        zzdqh zzdqhVar;
        zzdpx zzdpxVar;
        zzdpx zzdpxVar2;
        boolean z;
        boolean z2;
        zzdqh zzdqhVar2;
        zzdpx zzdpxVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzbzz zzbzzVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdqh zzdqhVar3;
        zzdpx zzdpxVar4;
        zzdqh zzdqhVar4;
        zzdpx zzdpxVar5;
        zzam zzamVar = (zzam) obj;
        zzffq zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzhm)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
            try {
                try {
                    if (zzamVar == null) {
                        this.zzc.zzc(null, null, null);
                        zzaa zzaaVar = this.zzf;
                        zzdqhVar4 = zzaaVar.zzr;
                        zzdpxVar5 = zzaaVar.zzj;
                        zzf.zzc(zzdqhVar4, zzdpxVar5, "sgs", new Pair("rid", "-1"));
                        this.zzd.zzf(true);
                        if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                zzbzt.zzj("The request ID is empty in request JSON.");
                                this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                                zzaa zzaaVar2 = this.zzf;
                                zzdqhVar3 = zzaaVar2.zzr;
                                zzdpxVar4 = zzaaVar2.zzj;
                                zzf.zzc(zzdqhVar3, zzdpxVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                                zzfff zzfffVar2 = this.zzd;
                                zzfffVar2.zzc("Request ID empty");
                                zzfffVar2.zzf(false);
                                if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                                    return;
                                }
                            } else {
                                zzaa zzaaVar3 = this.zzf;
                                String str7 = zzamVar.zzb;
                                zzdpxVar2 = zzaaVar3.zzj;
                                zzaa.zzG(zzaaVar3, optString, str7, zzdpxVar2);
                                Bundle bundle = zzamVar.zzc;
                                zzaa zzaaVar4 = this.zzf;
                                z = zzaaVar4.zzw;
                                if (z && bundle != null) {
                                    str5 = zzaaVar4.zzy;
                                    if (bundle.getInt(str5, -1) == -1) {
                                        zzaa zzaaVar5 = this.zzf;
                                        str6 = zzaaVar5.zzy;
                                        atomicInteger = zzaaVar5.zzz;
                                        bundle.putInt(str6, atomicInteger.get());
                                    }
                                }
                                zzaa zzaaVar6 = this.zzf;
                                z2 = zzaaVar6.zzv;
                                if (z2 && bundle != null) {
                                    str = zzaaVar6.zzx;
                                    if (TextUtils.isEmpty(bundle.getString(str))) {
                                        str2 = this.zzf.zzB;
                                        if (TextUtils.isEmpty(str2)) {
                                            zzaa zzaaVar7 = this.zzf;
                                            com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                            zzaa zzaaVar8 = this.zzf;
                                            context = zzaaVar8.zzg;
                                            zzbzzVar = zzaaVar8.zzA;
                                            zzaaVar7.zzB = zzp.zzc(context, zzbzzVar.zza);
                                        }
                                        zzaa zzaaVar9 = this.zzf;
                                        str3 = zzaaVar9.zzx;
                                        str4 = zzaaVar9.zzB;
                                        bundle.putString(str3, str4);
                                    }
                                }
                                this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                                zzaa zzaaVar10 = this.zzf;
                                zzdqhVar2 = zzaaVar10.zzr;
                                zzdpxVar3 = zzaaVar10.zzj;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                                String str8 = "na";
                                if (((Boolean) zzba.zzc().zzb(zzbbk.zziW)).booleanValue()) {
                                    try {
                                        str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e) {
                                        zzbzt.zzh("Error retrieving JSONObject from the requestJson, ", e);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str8);
                                zzf.zzc(zzdqhVar2, zzdpxVar3, "sgs", pairArr);
                                this.zzd.zzf(true);
                                if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            zzbzt.zzj("Failed to create JSON object from the request string.");
                            zzbyh zzbyhVar = this.zzc;
                            String obj2 = e2.toString();
                            zzbyhVar.zzb("Internal error for request JSON: " + obj2);
                            zzaa zzaaVar11 = this.zzf;
                            zzdqhVar = zzaaVar11.zzr;
                            zzdpxVar = zzaaVar11.zzj;
                            zzf.zzc(zzdqhVar, zzdpxVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                            zzfff zzfffVar3 = this.zzd;
                            zzfffVar3.zzg(e2);
                            zzfffVar3.zzf(false);
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e3) {
                    zzfff zzfffVar4 = this.zzd;
                    zzfffVar4.zzg(e3);
                    zzfffVar4.zzf(false);
                    zzbzt.zzh("", e3);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                }
                zzfffVar = this.zzd;
            } catch (Throwable th) {
                if (((Boolean) zzbcw.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } else {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e4) {
                zzbzt.zzg("QueryInfo generation has been disabled.".concat(e4.toString()));
            }
            if (!((Boolean) zzbcw.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfffVar = this.zzd;
            zzfffVar.zzc("QueryInfo generation has been disabled.");
            zzfffVar.zzf(false);
        }
        zzr.zza(zzfffVar);
        zzr.zzg();
    }
}

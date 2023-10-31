package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdza implements zzfdg {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfff zzc;
    private final zzffq zzd;

    public zzdza(String str, zzffq zzffqVar, zzfff zzfffVar) {
        this.zzb = str;
        this.zzd = zzffqVar;
        this.zzc = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbuj zzbujVar;
        zzdtz zzdtzVar;
        zzbuj zzbujVar2;
        zzbuj zzbujVar3;
        zzbuj zzbujVar4;
        zzbuj zzbujVar5;
        zzbuj zzbujVar6;
        zzbuj zzbujVar7;
        zzbuj zzbujVar8;
        JSONObject jSONObject2;
        String str;
        zzdyz zzdyzVar = (zzdyz) obj;
        jSONObject = zzdyzVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbujVar = zzdyzVar.zzb;
        String str2 = "";
        if (zzbujVar.zza() != -2) {
            if (zzbujVar.zza() == 1) {
                if (zzbujVar.zzf() != null) {
                    str2 = TextUtils.join(", ", zzbujVar.zzf());
                    zzbzt.zzg(str2);
                }
                zzdtzVar = new zzdtz(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdtzVar = new zzdtz(1);
            }
            zzffq zzffqVar = this.zzd;
            zzfff zzfffVar = this.zzc;
            zzfffVar.zzg(zzdtzVar);
            zzfffVar.zzf(false);
            zzffqVar.zza(zzfffVar);
            throw zzdtzVar;
        }
        HashMap hashMap = new HashMap();
        zzbujVar2 = zzdyzVar.zzb;
        if (zzbujVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaL)).booleanValue()) {
                String str3 = this.zzb;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = zza.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            Locale locale = Locale.ROOT;
                            if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("Cookie", str);
                }
            } else {
                hashMap.put("Cookie", this.zzb);
            }
        }
        zzbujVar3 = zzdyzVar.zzb;
        if (zzbujVar3.zzi()) {
            jSONObject2 = zzdyzVar.zza;
            zzdzb.zza(hashMap, jSONObject2);
        }
        zzbujVar4 = zzdyzVar.zzb;
        if (zzbujVar4 != null) {
            zzbujVar7 = zzdyzVar.zzb;
            if (!TextUtils.isEmpty(zzbujVar7.zzd())) {
                zzbujVar8 = zzdyzVar.zzb;
                str2 = zzbujVar8.zzd();
            }
        }
        zzffq zzffqVar2 = this.zzd;
        zzfff zzfffVar2 = this.zzc;
        zzfffVar2.zzf(true);
        zzffqVar2.zza(zzfffVar2);
        zzbujVar5 = zzdyzVar.zzb;
        String zze = zzbujVar5.zze();
        byte[] bytes = str2.getBytes(zzfol.zzc);
        zzbujVar6 = zzdyzVar.zzb;
        return new zzdyv(zze, optInt, hashMap, bytes, "", zzbujVar6.zzi());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbih {
    public static final zzbii zza = new zzbii() { // from class: com.google.android.gms.internal.ads.zzbhm
        @Override // com.google.android.gms.internal.ads.zzbii
        public final void zza(Object obj, Map map) {
            zzcgc zzcgcVar = (zzcgc) obj;
            zzbii zzbiiVar = zzbih.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzbzt.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgcVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzblb) zzcgcVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbii zzb = new zzbii() { // from class: com.google.android.gms.internal.ads.zzbhn
        @Override // com.google.android.gms.internal.ads.zzbii
        public final void zza(Object obj, Map map) {
            zzcgc zzcgcVar = (zzcgc) obj;
            zzbii zzbiiVar = zzbih.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhL)).booleanValue()) {
                zzbzt.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzbzt.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcgcVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzblb) zzcgcVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbii zzc = new zzbii() { // from class: com.google.android.gms.internal.ads.zzbhf
        @Override // com.google.android.gms.internal.ads.zzbii
        public final void zza(Object obj, Map map) {
            zzbih.zzb((zzcgc) obj, map);
        }
    };
    public static final zzbii zzd = new zzbhz();
    public static final zzbii zze = new zzbia();
    public static final zzbii zzf = new zzbii() { // from class: com.google.android.gms.internal.ads.zzbhl
        @Override // com.google.android.gms.internal.ads.zzbii
        public final void zza(Object obj, Map map) {
            zzcgc zzcgcVar = (zzcgc) obj;
            zzbii zzbiiVar = zzbih.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzbzt.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcgcVar.getContext(), ((zzcgk) zzcgcVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbii zzg = new zzbib();
    public static final zzbii zzh = new zzbic();
    public static final zzbii zzi = new zzbii() { // from class: com.google.android.gms.internal.ads.zzbhk
        @Override // com.google.android.gms.internal.ads.zzbii
        public final void zza(Object obj, Map map) {
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbii zzbiiVar = zzbih.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaqq zzI = zzcgjVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzbzt.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbii zzj = new zzbid();
    public static final zzbii zzk = new zzbie();
    public static final zzbii zzl = new zzcdb();
    public static final zzbii zzm = new zzcdc();
    public static final zzbii zzn = new zzbhe();
    public static final zzbiw zzo = new zzbiw();
    public static final zzbii zzp = new zzbif();
    public static final zzbii zzq = new zzbig();
    public static final zzbii zzr = new zzbho();
    public static final zzbii zzs = new zzbhp();
    public static final zzbii zzt = new zzbhq();
    public static final zzbii zzu = new zzbhr();
    public static final zzbii zzv = new zzbhs();
    public static final zzbii zzw = new zzbht();
    public static final zzbii zzx = new zzbhu();
    public static final zzbii zzy = new zzbhv();
    public static final zzbii zzz = new zzbhw();
    public static final zzbii zzA = new zzbhx();

    public static zzfwb zza(zzcfb zzcfbVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaqq zzI = zzcfbVar.zzI();
            if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcfbVar.getContext(), zzcfbVar.zzF(), zzcfbVar.zzi());
            }
        } catch (zzaqr unused) {
            zzbzt.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzbya.zzb(parse, zzcfbVar.getContext());
        long longValue = ((Long) zzbdc.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 231710100) {
            return zzfvr.zzh(zzb2);
        }
        zzfvi zzv2 = zzfvi.zzv(zzcfbVar.zzR());
        zzbhg zzbhgVar = new zzfon() { // from class: com.google.android.gms.internal.ads.zzbhg
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbii zzbiiVar = zzbih.zza;
                if (((Boolean) zzbdc.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        };
        zzfwc zzfwcVar = zzcag.zzf;
        return zzfvr.zze(zzfvr.zzl(zzfvr.zze(zzv2, Throwable.class, zzbhgVar, zzfwcVar), new zzfon() { // from class: com.google.android.gms.internal.ads.zzbhh
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                String str2 = zzb2;
                String str3 = (String) obj;
                zzbii zzbiiVar = zzbih.zza;
                if (str3 != null) {
                    if (((Boolean) zzbdc.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbdc.zza.zze();
                    String str5 = (String) zzbdc.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str2.replace(str4, str3);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, zzfwcVar), Throwable.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzbhi
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                String str2 = zzb2;
                Throwable th = (Throwable) obj;
                zzbii zzbiiVar = zzbih.zza;
                if (((Boolean) zzbdc.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzfwcVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:51|52|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r7 = r0;
        r0 = "Error constructing openable urls response.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        com.google.android.gms.internal.ads.zzbzt.zzh(r0, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgc r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbih.zzb(com.google.android.gms.internal.ads.zzcgc, java.util.Map):void");
    }

    public static void zzc(Map map, zzdcw zzdcwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjo)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdcwVar != null) {
            zzdcwVar.zzr();
        }
    }
}

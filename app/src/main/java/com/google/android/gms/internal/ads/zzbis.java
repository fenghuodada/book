package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbis implements zzbii {
    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;
    @Nullable
    private final zzdqc zzb;
    @Nullable
    private final zzfen zzc;
    @Nullable
    private final zzbqs zze;
    @Nullable
    private final zzebc zzf;
    private com.google.android.gms.ads.internal.overlay.zzx zzg = null;
    private final zzbzy zzd = new zzbzy(null);

    public zzbis(com.google.android.gms.ads.internal.zzb zzbVar, zzbqs zzbqsVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar) {
        this.zza = zzbVar;
        this.zze = zzbqsVar;
        this.zzf = zzebcVar;
        this.zzb = zzdqcVar;
        this.zzc = zzfenVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzaqq zzaqqVar, Uri uri, View view, @Nullable Activity activity) {
        if (zzaqqVar == null) {
            return uri;
        }
        try {
            return zzaqqVar.zze(uri) ? zzaqqVar.zza(uri, context, view, activity) : uri;
        } catch (zzaqr unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzbzt.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (com.google.android.gms.internal.ads.zzbir.zzc(r11, r5, r6, r7) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbis.zzh(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z) {
        zzbqs zzbqsVar = this.zze;
        if (zzbqsVar != null) {
            zzbqsVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(r6)).booleanValue() != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzj(com.google.android.gms.ads.internal.client.zza r19, android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbis.zzj(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue()) {
            zzdqb zza = this.zzb.zza();
            zza.zzb("action", "cct_action");
            zza.zzb("cct_open_status", zzbck.zza(i));
            zza.zzg();
            return;
        }
        zzfen zzfenVar = this.zzc;
        String zza2 = zzbck.zza(i);
        zzfem zzb = zzfem.zzb("cct_action");
        zzb.zza("cct_open_status", zza2);
        zzfenVar.zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    /* renamed from: zze */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        zzcfb zzcfbVar = (zzcfb) zzaVar;
        String zzc = zzbya.zzc((String) map.get("u"), zzcfbVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzbzt.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzezf zzD = zzcfbVar.zzD();
        zzezi zzP = zzcfbVar.zzP();
        boolean z2 = false;
        if (zzD == null || zzP == null) {
            str = "";
            z = false;
        } else {
            z = zzD.zzaj;
            str = zzP.zzb;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjn)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfbVar.zzaA()) {
                zzbzt.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzi(false);
            ((zzcgg) zzaVar).zzaF(zzf(map), zzb(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzi(false);
            if (zzc != null) {
                ((zzcgg) zzaVar).zzaG(zzf(map), zzb(map), zzc, z3);
            } else {
                ((zzcgg) zzaVar).zzaH(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcfbVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzel)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzer)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzep)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeq);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfpm.zzc(zzfok.zzc(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zzg = zzbcl.zzg(zzcfbVar.getContext());
            if (z2) {
                if (zzg) {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        zzbzt.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcfbVar.getContext(), zzcfbVar.zzI(), Uri.parse(zzc), zzcfbVar.zzF(), zzcfbVar.zzi()));
                    if (z && this.zzf != null && zzj(zzaVar, zzcfbVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbip(this);
                    ((zzcgg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
                zzk(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzh(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhL)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzbzt.zzj("Package name missing from open app action.");
                } else if (!z || this.zzf == null || !zzj(zzaVar, zzcfbVar.getContext(), str5, str)) {
                    PackageManager packageManager = zzcfbVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzbzt.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcgg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    }
                }
            }
        } else {
            zzi(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e) {
                    zzbzt.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcfbVar.getContext(), zzcfbVar.zzI(), data, zzcfbVar.zzF(), zzcfbVar.zzi()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhM)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhZ)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.zzg = new zzbiq(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.zzf == null || !zzj(zzaVar, zzcfbVar.getContext(), intent2.getData().toString(), str)) {
                    ((zzcgg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzblb) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zzd(zzc(zzcfbVar.getContext(), zzcfbVar.zzI(), Uri.parse(zzc), zzcfbVar.zzF(), zzcfbVar.zzi())).toString();
            }
            if (!z || this.zzf == null || !zzj(zzaVar, zzcfbVar.getContext(), zzc, str)) {
                ((zzcgg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzc, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzblb) zzaVar).zzd("openIntentAsync", hashMap4);
            }
        }
    }
}

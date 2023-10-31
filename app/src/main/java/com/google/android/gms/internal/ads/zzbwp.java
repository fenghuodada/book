package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbwp implements zzbwu {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    @VisibleForTesting
    boolean zza;
    private final zzgsv zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwr zzi;
    private final zzbwq zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbwp(Context context, zzbzz zzbzzVar, zzbwr zzbwrVar, @Nullable String str, zzbwq zzbwqVar) {
        Preconditions.checkNotNull(zzbwrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbwqVar;
        this.zzi = zzbwrVar;
        for (String str2 : zzbwrVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgsv zza = zzguk.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgsw zza2 = zzgsx.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza2.zza(str3);
        }
        zza.zzg((zzgsx) zza2.zzal());
        zzgue zza3 = zzguf.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzbzzVar.zza;
        if (str4 != null) {
            zza3.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzguf) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final zzbwr zza() {
        return this.zzi;
    }

    public final /* synthetic */ zzfwb zzb(Map map) throws Exception {
        zzguc zzgucVar;
        zzfwb zzl;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgucVar = (zzguc) this.zze.get(str);
                            }
                            if (zzgucVar == null) {
                                zzbwt.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgucVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbdl.zzb.zze()).booleanValue()) {
                    zzbzt.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfvr.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfvr.zzh(null);
        }
        synchronized (this.zzj) {
            for (zzguc zzgucVar2 : this.zze.values()) {
                this.zzd.zzc((zzgud) zzgucVar2.zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbwt.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgud zzgudVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgudVar.zza());
                    sb.append("] ");
                    sb.append(zzgudVar.zze());
                }
                zzbwt.zza(sb.toString());
            }
            zzfwb zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzguk) this.zzd.zzal()).zzax());
            if (zzbwt.zzb()) {
                zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbwt.zza("Pinged SB successfully.");
                    }
                }, zzcag.zza);
            }
            zzl = zzfvr.zzl(zzb2, new zzfon() { // from class: com.google.android.gms.internal.ads.zzbwl
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    int i2 = zzbwp.zzb;
                    return null;
                }
            }, zzcag.zzf);
        }
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzguc) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzguc zzc2 = zzgud.zzc();
            int zza = zzgub.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgti zza2 = zzgtl.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgtg zza3 = zzgth.zza();
                        zza3.zza(zzgno.zzw(str2));
                        zza3.zzb(zzgno.zzw(str3));
                        zza2.zza((zzgth) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzgtl) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfwb zzh = zzfvr.zzh(Collections.emptyMap());
            zzfuy zzfuyVar = new zzfuy() { // from class: com.google.android.gms.internal.ads.zzbwm
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzbwp.this.zzb((Map) obj);
                }
            };
            zzfwc zzfwcVar = zzcag.zzf;
            zzfwb zzm = zzfvr.zzm(zzh, zzfuyVar, zzfwcVar);
            zzfwb zzn = zzfvr.zzn(zzm, 10L, TimeUnit.SECONDS, zzcag.zzd);
            zzfvr.zzq(zzm, new zzbwo(this, zzn), zzfwcVar);
            zzc.add(zzn);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgnl zzt = zzgno.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgsv zzgsvVar = this.zzd;
            zzgtv zza = zzgtx.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgsvVar.zzi((zzgtx) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbwr r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzbzt.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzbzt.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzbzt.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbwt.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbwn r8 = new com.google.android.gms.internal.ads.zzbwn
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzfwc r0 = com.google.android.gms.internal.ads.zzcag.zza
            r0.execute(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwp.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}

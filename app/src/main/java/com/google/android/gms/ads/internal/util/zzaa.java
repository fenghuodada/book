package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgd;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class zzaa {
    private zzaa() {
    }

    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public static zzaa zzo(int i) {
        return i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : i >= 24 ? new zzu() : i >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    @Nullable
    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbzt.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcfi zzd(zzcfb zzcfbVar, zzawx zzawxVar, boolean z) {
        return new zzcgd(zzcfbVar, zzawxVar, z);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    public Intent zzg(Activity activity) {
        if (activity == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public void zzl(Activity activity) {
    }

    public int zzn(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}

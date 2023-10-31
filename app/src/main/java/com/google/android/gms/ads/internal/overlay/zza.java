package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzzVar, @Nullable zzx zzxVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzzVar, zzxVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + uri);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzP(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzbzt.zzj(e.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, @Nullable zzc zzcVar, zzz zzzVar, @Nullable zzx zzxVar) {
        String concat;
        int i = 0;
        if (zzcVar != null) {
            zzbbk.zza(context);
            Intent intent = zzcVar.zzh;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(zzcVar.zzb)) {
                    concat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(zzcVar.zzc)) {
                        intent.setData(Uri.parse(zzcVar.zzb));
                    } else {
                        intent.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(zzcVar.zzd)) {
                        intent.setPackage(zzcVar.zzd);
                    }
                    if (!TextUtils.isEmpty(zzcVar.zze)) {
                        String[] split = zzcVar.zze.split(RemoteSettings.FORWARD_SLASH_STRING, 2);
                        if (split.length < 2) {
                            concat = "Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze));
                        } else {
                            intent.setClassName(split[0], split[1]);
                        }
                    }
                    String str = zzcVar.zzf;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i = Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
                            zzbzt.zzj("Could not parse intent flags.");
                        }
                        intent.addFlags(i);
                    }
                    if (((Boolean) zzba.zzc().zzb(zzbbk.zzek)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbk.zzej)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            com.google.android.gms.ads.internal.util.zzs.zzm(context, intent);
                        }
                    }
                }
            }
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        concat = "No intent data for launcher overlay.";
        zzbzt.zzj(concat);
        return false;
    }

    private static final boolean zzc(Context context, Uri uri, zzz zzzVar, zzx zzxVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzt.zzp().zzk(context, uri);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
        } catch (ActivityNotFoundException e) {
            zzbzt.zzj(e.getMessage());
            i = 6;
        }
        if (zzxVar != null) {
            zzxVar.zzb(i);
        }
        return i == 5;
    }
}

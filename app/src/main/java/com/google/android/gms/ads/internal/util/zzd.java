package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzfwb;

/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = zzbzs.zza;
        if (((Boolean) zzbcz.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || zzbzs.zzl()) {
                    return;
                }
                zzfwb zzb = new zzc(context).zzb();
                zzbzt.zzi("Updating ad debug logging enablement.");
                zzcaj.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                zzbzt.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}

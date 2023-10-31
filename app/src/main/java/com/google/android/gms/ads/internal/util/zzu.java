package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;

@TargetApi(24)
/* loaded from: classes.dex */
public class zzu extends zzt {
    @VisibleForTesting
    public static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        boolean isInMultiWindowMode;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeA)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeC)).booleanValue()) {
                isInMultiWindowMode = activity.isInMultiWindowMode();
                return isInMultiWindowMode;
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzx = zzbzm.zzx(activity, configuration.screenHeightDp);
            int zzx2 = zzbzm.zzx(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzq = zzs.zzq((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzq.heightPixels;
            int i2 = zzq.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzey)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
            return (zzf(i, zzx + dimensionPixelSize, intValue) && zzf(i2, zzx2, intValue)) ? false : true;
        }
        return false;
    }
}

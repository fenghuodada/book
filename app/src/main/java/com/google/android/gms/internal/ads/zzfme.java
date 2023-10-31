package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfme {
    public static final int zza = 67108864;
    public static final ClipData zzb = ClipData.newIntent("", new Intent());

    @Nullable
    public static PendingIntent zza(Context context, int i, Intent intent, int i2, int i3) {
        boolean zzb2;
        String str;
        zzfoz.zzf((i2 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfoz.zzf((i2 & 1) == 0 || zzb(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzfoz.zzf((i2 & 2) == 0 || zzb(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzfoz.zzf((i2 & 4) == 0 || zzb(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzfoz.zzf((i2 & 128) == 0 || zzb(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzfoz.zzf(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzb2 = !zzb(i2, 67108864);
            str = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
        } else {
            zzb2 = zzb(i2, 67108864);
            str = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
        }
        zzfoz.zzf(zzb2, str);
        Intent intent2 = new Intent(intent);
        if (!zzb(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    private static boolean zzb(int i, int i2) {
        return (i & i2) == i2;
    }
}

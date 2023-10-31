package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C7513R;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbqv extends zzbqy {
    private final Map zza;
    private final Context zzb;

    public zzbqv(zzcfb zzcfbVar, Map map) {
        super(zzcfbVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfbVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbau(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                return;
            }
            Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(this.zzb);
            zzG.setTitle(zzd != null ? zzd.getString(C7513R.string.f14275s1) : "Save image");
            zzG.setMessage(zzd != null ? zzd.getString(C7513R.string.f14276s2) : "Allow Ad to store image in Picture gallery?");
            zzG.setPositiveButton(zzd != null ? zzd.getString(C7513R.string.f14277s3) : "Accept", new zzbqt(this, str, lastPathSegment));
            zzG.setNegativeButton(zzd != null ? zzd.getString(C7513R.string.f14278s4) : "Decline", new zzbqu(this));
            zzG.create().show();
        }
    }
}

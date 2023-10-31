package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbiz implements zzbii {
    private final Context zza;

    public zzbiz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(AppIntroBaseFragmentKt.ARG_TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(AppIntroBaseFragmentKt.ARG_TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzP(this.zza, intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbho implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq((WindowManager) zzcfbVar.getContext().getSystemService("window"));
        int i = zzq.widthPixels;
        int i2 = zzq.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcfbVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcfbVar.zzd("locationReady", hashMap);
        zzbzt.zzj("GET LOCATION COMPILED");
    }
}

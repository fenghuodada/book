package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbqx extends zzbqy implements zzbii {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbau zzk;
    private float zzl;
    private int zzm;

    public zzbqx(zzcfb zzcfbVar, Context context, zzbau zzbauVar) {
        super(zzcfbVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfbVar;
        this.zzi = context;
        this.zzk = zzbauVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        zzcfb zzcfbVar = (zzcfb) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbzm.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbzm.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            i = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzbzm.zzv(this.zza, zzM[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            i = zzbzm.zzv(this.zza, zzM[1]);
        }
        this.zze = i;
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbqw zzbqwVar = new zzbqw();
        zzbau zzbauVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbqwVar.zze(zzbauVar.zza(intent));
        zzbau zzbauVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbqwVar.zzc(zzbauVar2.zza(intent2));
        zzbqwVar.zza(this.zzk.zzb());
        zzbqwVar.zzd(this.zzk.zzc());
        zzbqwVar.zzb(true);
        z = zzbqwVar.zza;
        z2 = zzbqwVar.zzb;
        z3 = zzbqwVar.zzc;
        z4 = zzbqwVar.zzd;
        z5 = zzbqwVar.zze;
        zzcfb zzcfbVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            zzbzt.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcfbVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zzbzt.zzm(2)) {
            zzbzt.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzN((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzS)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i4 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i, i2);
    }
}

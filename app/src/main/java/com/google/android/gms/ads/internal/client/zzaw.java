package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p039h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbgp zzd;
    private final zzbwb zze;
    private final zzbrs zzf;
    private final zzbgq zzg;
    private zzbta zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbgp zzbgpVar, zzbwb zzbwbVar, zzbrs zzbrsVar, zzbgq zzbgqVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbgpVar;
        this.zze = zzbwbVar;
        this.zzf = zzbrsVar;
        this.zzg = zzbgqVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbny zzbnyVar) {
        return (zzbq) new zzao(this, context, str, zzbnyVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbny zzbnyVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbnyVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbny zzbnyVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbnyVar).zzd(context, false);
    }

    @Nullable
    public final zzdj zzf(Context context, zzbny zzbnyVar) {
        return (zzdj) new zzac(this, context, zzbnyVar).zzd(context, false);
    }

    public final zzbeu zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbeu) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfa zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbfa) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    @RequiresApi(api = 21)
    public final zzbji zzl(Context context, zzbny zzbnyVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbji) new zzai(this, context, zzbnyVar, onH5AdsEventListener).zzd(context, false);
    }

    @Nullable
    public final zzbro zzm(Context context, zzbny zzbnyVar) {
        return (zzbro) new zzag(this, context, zzbnyVar).zzd(context, false);
    }

    @Nullable
    public final zzbrv zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzbzt.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbrv) zzaaVar.zzd(activity, z);
    }

    public final zzbvp zzq(Context context, String str, zzbny zzbnyVar) {
        return (zzbvp) new zzav(this, context, str, zzbnyVar).zzd(context, false);
    }

    @Nullable
    public final zzbyk zzr(Context context, zzbny zzbnyVar) {
        return (zzbyk) new zzae(this, context, zzbnyVar).zzd(context, false);
    }
}

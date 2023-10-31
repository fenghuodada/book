package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C0627k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
public final class zzbqn implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzbzt.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzbzt.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzbzt.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzbzt.zzj("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzbzt.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else if (!zzbcl.zzg(context)) {
            zzbzt.zzj("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzbzt.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            C0627k.m12066b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbqm(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(intent, null), null, new zzbql(this), null, new zzbzz(0, 0, false, false, false), null, null)));
        com.google.android.gms.ads.internal.zzt.zzo().zzp();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0499a;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbqh extends zzbpu {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbqh(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        zzbzt.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzbzt.zzh("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzm.zzr();
    }

    @Nullable
    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzbzt.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbqj zzf() throws RemoteException {
        return zzbqj.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbqj zzg() throws RemoteException {
        return zzbqj.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpy zzbpyVar) throws RemoteException {
        char c;
        AdFormat adFormat;
        try {
            zzbqf zzbqfVar = new zzbqf(this, zzbpyVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5) {
                                    adFormat = AdFormat.APP_OPEN_AD;
                                } else {
                                    throw new IllegalArgumentException("Internal Error");
                                }
                            } else {
                                adFormat = AdFormat.NATIVE;
                            }
                        } else {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        }
                    } else {
                        adFormat = AdFormat.REWARDED;
                    }
                } else {
                    adFormat = AdFormat.INTERSTITIAL;
                }
            } else {
                adFormat = AdFormat.BANNER;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbqfVar);
        } catch (Throwable th) {
            throw C0499a.m12384a("Error generating signals for RTB", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, zzboe zzboeVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqe(this, zzbpgVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render app open ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpj zzbpjVar, zzboe zzboeVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbqa(this, zzbpjVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render banner ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpj zzbpjVar, zzboe zzboeVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbqb(this, zzbpjVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpm zzbpmVar, zzboe zzboeVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqc(this, zzbpmVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpp zzbppVar, zzboe zzboeVar) throws RemoteException {
        zzn(str, str2, zzlVar, iObjectWrapper, zzbppVar, zzboeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpp zzbppVar, zzboe zzboeVar, zzbee zzbeeVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze, zzbeeVar), new zzbqd(this, zzbppVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render native ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbps zzbpsVar, zzboe zzboeVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqg(this, zzbpsVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbps zzbpsVar, zzboe zzboeVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqg(this, zzbpsVar, zzboeVar));
        } catch (Throwable th) {
            throw C0499a.m12384a("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzt.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzt.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzt.zzh("", th);
                return true;
            }
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0499a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzboy extends zzboa {
    private final Object zza;
    private zzbpa zzb;
    private zzbvh zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzboy(@NonNull Adapter adapter) {
        this.zza = adapter;
    }

    public zzboy(@NonNull MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }

    private final Bundle zzU(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        zzbzt.zze("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw C0499a.m12384a("", th);
        }
    }

    private static final boolean zzW(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzm.zzr();
    }

    @Nullable
    private static final String zzX(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbow(this, zzboeVar));
                return;
            } catch (Exception e) {
                zzbzt.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzlVar, str, new zzbpb((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbow(this, zzboeVar));
                return;
            } catch (Exception e) {
                zzbzt.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th) {
            throw C0499a.m12384a("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th) {
            throw C0499a.m12384a("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzbzt.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzj;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzbzt.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzI() throws RemoteException {
        if (this.zza instanceof MediationInterstitialAdapter) {
            zzbzt.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                throw C0499a.m12384a("", th);
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            }
            zzbzt.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzbzt.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzbzt.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzL() throws RemoteException {
        if (this.zza instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } else {
                zzbzt.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final boolean zzN() throws RemoteException {
        if (this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzboj zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzbok zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzbzt.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzbfk zzi() {
        zzbpa zzbpaVar = this.zzb;
        if (zzbpaVar != null) {
            NativeCustomTemplateAd zza = zzbpaVar.zza();
            if (zza instanceof zzbfl) {
                return ((zzbfl) zza).zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzboh zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzboz(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzbon zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
                return null;
            }
            return new zzbpd(unifiedNativeAdMapper);
        }
        zzbpa zzbpaVar = this.zzb;
        if (zzbpaVar == null || (zzb = zzbpaVar.zzb()) == null) {
            return null;
        }
        return new zzbpd(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzbqj zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbqj.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    @Nullable
    public final zzbqj zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbqj.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw C0499a.m12384a("", th);
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbzt.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th) {
            throw C0499a.m12384a("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvh zzbvhVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbvhVar;
            zzbvhVar.zzl(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzq(IObjectWrapper iObjectWrapper, zzbki zzbkiVar, List list) throws RemoteException {
        char c;
        if (!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbos zzbosVar = new zzbos(this, zzbkiVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbko zzbkoVar = (zzbko) it.next();
            String str = zzbkoVar.zza;
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
            AdFormat adFormat = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? null : AdFormat.APP_OPEN_AD : AdFormat.NATIVE : AdFormat.REWARDED_INTERSTITIAL : AdFormat.REWARDED : AdFormat.INTERSTITIAL : AdFormat.BANNER;
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbkoVar.zzb));
            }
        }
        ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbosVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, List list) throws RemoteException {
        zzbzt.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbox(this, zzboeVar));
                return;
            } catch (Exception e) {
                zzbzt.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzboeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        AdSize zzc;
        RemoteException m12384a;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            zzbzt.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.zza.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzbzt.zze("Requesting banner ad from adapter.");
        if (zzqVar.zzn) {
            zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzboq zzboqVar = new zzboq(date, zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbpa(zzboeVar), zzV(str, zzlVar, str2), adSize, zzboqVar, bundle);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), adSize, this.zzk), new zzbot(this, zzboeVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        if (this.zza instanceof Adapter) {
            zzbzt.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbor(this, zzboeVar, adapter));
                return;
            } catch (Exception e) {
                zzbzt.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbzt.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzboeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        RemoteException m12384a;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbzt.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        zzbzt.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                HashSet hashSet2 = hashSet;
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzboq zzboqVar = new zzboq(date, zzlVar.zzd, hashSet2, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbpa(zzboeVar), zzV(str, zzlVar, str2), zzboqVar, bundle);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk), new zzbou(this, zzboeVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar, zzbee zzbeeVar, List list) throws RemoteException {
        RemoteException m12384a;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            zzbzt.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.zza.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzbzt.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.zze;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                HashSet hashSet2 = hashSet;
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbpc zzbpcVar = new zzbpc(date, zzlVar.zzd, hashSet2, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzbeeVar, list, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.zzb = new zzbpa(zzboeVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzlVar, str2), zzbpcVar, bundle);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk, zzbeeVar), new zzbov(this, zzboeVar));
            } finally {
            }
        }
    }
}

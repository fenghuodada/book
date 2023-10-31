package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaxg implements zzgpa {
    static final zzgpa zza = new zzaxg();

    private zzaxg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zza(int i) {
        zzaxh zzaxhVar;
        zzaxh zzaxhVar2 = zzaxh.AD_INITIATER_UNSPECIFIED;
        switch (i) {
            case 0:
                zzaxhVar = zzaxh.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zzaxhVar = zzaxh.BANNER;
                break;
            case 2:
                zzaxhVar = zzaxh.DFP_BANNER;
                break;
            case 3:
                zzaxhVar = zzaxh.INTERSTITIAL;
                break;
            case 4:
                zzaxhVar = zzaxh.DFP_INTERSTITIAL;
                break;
            case 5:
                zzaxhVar = zzaxh.NATIVE_EXPRESS;
                break;
            case 6:
                zzaxhVar = zzaxh.AD_LOADER;
                break;
            case 7:
                zzaxhVar = zzaxh.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzaxhVar = zzaxh.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzaxhVar = zzaxh.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzaxhVar = zzaxh.APP_OPEN;
                break;
            case 11:
                zzaxhVar = zzaxh.REWARDED_INTERSTITIAL;
                break;
            default:
                zzaxhVar = null;
                break;
        }
        return zzaxhVar != null;
    }
}

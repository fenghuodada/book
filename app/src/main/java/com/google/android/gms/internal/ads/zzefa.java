package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzefa implements zzebv {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(zzezr zzezrVar, zzezf zzezfVar) {
        String optString = zzezfVar.zzw.optString("pubid", "");
        zzfaa zzfaaVar = zzezrVar.zza.zza;
        zzezy zzezyVar = new zzezy();
        zzezyVar.zzp(zzfaaVar);
        zzezyVar.zzs(optString);
        Bundle zzd = zzd(zzfaaVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzezfVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzezfVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzezfVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzezfVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfaaVar.zzd;
        zzezyVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfaa zzG = zzezyVar.zzG();
        Bundle bundle = new Bundle();
        zzezi zzeziVar = zzezrVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzeziVar.zza));
        bundle2.putInt("refresh_interval", zzeziVar.zzc);
        bundle2.putString("gws_query_id", zzeziVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzezrVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzezfVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzezfVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzezfVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzezfVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzezfVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzezfVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzezfVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzezfVar.zzj));
        bundle3.putString("transaction_id", zzezfVar.zzk);
        bundle3.putString("valid_from_timestamp", zzezfVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzezfVar.zzQ);
        bundle3.putString("recursive_server_response_data", zzezfVar.zzap);
        if (zzezfVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzezfVar.zzm.zzb);
            bundle4.putString("rb_type", zzezfVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle, zzezfVar, zzezrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        return !TextUtils.isEmpty(zzezfVar.zzw.optString("pubid", ""));
    }

    public abstract zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar);
}

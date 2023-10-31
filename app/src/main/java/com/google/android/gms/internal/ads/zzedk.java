package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.C0627k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzedk implements zzebv {
    private final Context zza;
    private final zzdeq zzb;
    private final Executor zzc;
    private final zzeze zzd;

    public zzedk(Context context, Executor executor, zzdeq zzdeqVar, zzeze zzezeVar) {
        this.zza = context;
        this.zzb = zzdeqVar;
        this.zzc = executor;
        this.zzd = zzezeVar;
    }

    @Nullable
    private static String zzd(zzezf zzezfVar) {
        try {
            return zzezfVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        String zzd = zzd(zzezfVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzedk.this.zzc(parse, zzezrVar, zzezfVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbcl.zzg(context) && !TextUtils.isEmpty(zzd(zzezfVar));
    }

    public final zzfwb zzc(Uri uri, zzezr zzezrVar, zzezf zzezfVar, Object obj) throws Exception {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                C0627k.m12066b(bundle, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            final zzcal zzcalVar = new zzcal();
            zzddq zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, null), new zzddt(new zzdey() { // from class: com.google.android.gms.internal.ads.zzedj
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
                    zzcal zzcalVar2 = zzcal.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcalVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcalVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzbzz(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfvr.zzh(zze.zzg());
        } catch (Throwable th) {
            zzbzt.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}

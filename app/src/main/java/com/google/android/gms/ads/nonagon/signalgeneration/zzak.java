package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzak implements zzfuy {
    private final Executor zza;
    private final zzduy zzb;

    public zzak(Executor executor, zzduy zzduyVar) {
        this.zza = executor;
        this.zzb = zzduyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ zzfwb zza(Object obj) throws Exception {
        final zzbug zzbugVar = (zzbug) obj;
        return zzfvr.zzm(this.zzb.zzb(zzbugVar), new zzfuy() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj2) {
                zzbug zzbugVar2 = zzbug.this;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().zzh(zzbugVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzfvr.zzh(zzamVar);
            }
        }, this.zza);
    }
}

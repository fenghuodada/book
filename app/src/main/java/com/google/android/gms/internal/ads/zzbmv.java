package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbmv {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbms zza = new zzbmu();
    public static final zzbmq zzb = new zzbmq() { // from class: com.google.android.gms.internal.ads.zzbmt
        @Override // com.google.android.gms.internal.ads.zzbmq
        public final Object zza(JSONObject jSONObject) {
            return zzbmv.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}

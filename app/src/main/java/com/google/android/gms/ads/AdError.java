package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdError {
    @NonNull
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    @NonNull
    private final String zzb;
    @NonNull
    private final String zzc;
    @Nullable
    private final AdError zzd;

    public AdError(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    @Nullable
    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    @NonNull
    public String getDomain() {
        return this.zzc;
    }

    @NonNull
    public String getMessage() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.zzd == null) {
            zzeVar = null;
        } else {
            AdError adError = this.zzd;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    @NonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        jSONObject.put("Cause", adError == null ? "null" : adError.zzb());
        return jSONObject;
    }
}

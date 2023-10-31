package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzezi {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    @Nullable
    public final zzezh zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;

    public zzezi(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        int i = 0;
        int i2 = 0;
        boolean z = false;
        zzezh zzezhVar = null;
        long j = 0;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str7 = str2;
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                String str8 = str6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhO)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzezhVar = new zzezh(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str4 = jsonReader.nextString();
                } else if ("adapter_response_replacement_key".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgB)).booleanValue()) {
                        try {
                            Bundle zza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    jsonReader.skipValue();
                } else {
                    if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziK)).booleanValue()) {
                            str6 = jsonReader.nextString();
                            str2 = str7;
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziK)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        }
                    }
                    jsonReader.skipValue();
                }
                str6 = str8;
                str2 = str7;
            }
            str2 = str7;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        this.zzb = str;
        this.zzd = str3;
        this.zze = i2;
        this.zzf = j;
        this.zzi = zzezhVar;
        this.zzg = z;
        this.zzh = str4;
        this.zzj = bundle;
        this.zzk = str5;
        this.zzl = str6;
        this.zzm = str2;
    }
}

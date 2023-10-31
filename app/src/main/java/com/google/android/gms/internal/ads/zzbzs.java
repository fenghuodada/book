package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzbzs {
    public static final /* synthetic */ int zza = 0;
    @GuardedBy("lock")
    private static boolean zzc = false;
    @GuardedBy("lock")
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzbzs() {
        this(null);
    }

    public zzbzs(@Nullable String str) {
        this.zzg = !zzk() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzbzt.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzbzs.class) {
            zzbzt.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                zzbzt.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            zzbzt.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzbzr zzbzrVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzbzrVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzbzt.zzh("unable to log", e);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(@Nullable final String str) {
        zzn("onNetworkRequestError", new zzbzr() { // from class: com.google.android.gms.internal.ads.zzbzo
            @Override // com.google.android.gms.internal.ads.zzbzr
            public final void zza(JsonWriter jsonWriter) {
                String str2 = str;
                int i = zzbzs.zza;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, @Nullable final Map map, @Nullable final byte[] bArr) {
        zzn("onNetworkRequest", new zzbzr() { // from class: com.google.android.gms.internal.ads.zzbzp
            @Override // com.google.android.gms.internal.ads.zzbzr
            public final void zza(JsonWriter jsonWriter) {
                zzbzs.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(@Nullable final Map map, final int i) {
        zzn("onNetworkResponse", new zzbzr() { // from class: com.google.android.gms.internal.ads.zzbzn
            @Override // com.google.android.gms.internal.ads.zzbzr
            public final void zza(JsonWriter jsonWriter) {
                zzbzs.zzb(i, map, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, @Nullable Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzbzt.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (zzk()) {
            zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (zzk()) {
            zzp(str, "GET", map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        if (zzk()) {
            String str = null;
            zzq(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzbzt.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                zzo(str);
            }
        }
    }

    public final void zzf(@Nullable Map map, int i) {
        if (zzk()) {
            zzq(map, i);
            if (i < 200 || i >= 300) {
                zzo(null);
            }
        }
    }

    public final void zzg(@Nullable String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzbzr() { // from class: com.google.android.gms.internal.ads.zzbzq
            @Override // com.google.android.gms.internal.ads.zzbzr
            public final void zza(JsonWriter jsonWriter) {
                String str;
                byte[] bArr2 = bArr;
                int i = zzbzs.zza;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length >= 10000) {
                    encode = zzbzm.zze(encode);
                    str = encode != null ? "bodydigest" : "bodydigest";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                str = "body";
                jsonWriter.name(str).value(encode);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}

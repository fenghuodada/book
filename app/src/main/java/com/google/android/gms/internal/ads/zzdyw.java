package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdyw {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzdyw zza(Reader reader) throws zzezj {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j = -1;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzdyw zzdywVar = new zzdyw();
                zzdywVar.zza = i;
                if (str != null) {
                    zzdywVar.zzc = str;
                }
                zzdywVar.zzd = j;
                zzdywVar.zzb = hashMap;
                return zzdywVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
                throw new zzezj("Unable to parse Response", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}

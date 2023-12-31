package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.ump.C7925d;
import com.google.android.ump.InterfaceC7923b;
import com.google.android.ump.InterfaceC7924c;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzv {
    private final Application zza;
    private final zzac zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzam zze;
    private final zzba zzf;
    private final zzn zzg;
    private final zzz zzh;
    private final zzh zzi;

    public zzv(Application application, zzac zzacVar, Handler handler, Executor executor, zzam zzamVar, zzba zzbaVar, zzn zznVar, zzz zzzVar, zzh zzhVar) {
        this.zza = application;
        this.zzb = zzacVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzamVar;
        this.zzf = zzbaVar;
        this.zzg = zznVar;
        this.zzh = zzzVar;
        this.zzi = zzhVar;
    }

    @WorkerThread
    private final zzbw zzd(zzbu zzbuVar) throws zzj {
        String str;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            String str2 = zzbuVar.zza;
            if (str2 != null) {
                jsonWriter.name("admob_app_id");
                jsonWriter.value(str2);
            }
            Boolean bool = zzbuVar.zzb;
            if (bool != null) {
                jsonWriter.name("is_lat");
                jsonWriter.value(bool.booleanValue());
            }
            String str3 = zzbuVar.zzc;
            if (str3 != null) {
                jsonWriter.name("adid");
                jsonWriter.value(str3);
            }
            zzbq zzbqVar = zzbuVar.zzd;
            if (zzbqVar != null) {
                jsonWriter.name("device_info");
                jsonWriter.beginObject();
                int i = zzbqVar.zzc;
                if (i != 1) {
                    jsonWriter.name("os_type");
                    if (i == 0) {
                        throw null;
                    }
                    zzbp zzbpVar = zzbp.DEBUG_PARAM_UNKNOWN;
                    jsonWriter.value(i + (-1) != 0 ? "ANDROID" : "UNKNOWN");
                }
                String str4 = zzbqVar.zza;
                if (str4 != null) {
                    jsonWriter.name("model");
                    jsonWriter.value(str4);
                }
                Integer num = zzbqVar.zzb;
                if (num != null) {
                    jsonWriter.name("android_api_level");
                    jsonWriter.value(num);
                }
                jsonWriter.endObject();
            }
            String str5 = zzbuVar.zze;
            if (str5 != null) {
                jsonWriter.name("language_code");
                jsonWriter.value(str5);
            }
            Boolean bool2 = zzbuVar.zzf;
            if (bool2 != null) {
                jsonWriter.name("tag_for_under_age_of_consent");
                jsonWriter.value(bool2.booleanValue());
            }
            Map<String, String> map = zzbuVar.zzg;
            if (!map.isEmpty()) {
                jsonWriter.name("stored_infos_map");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jsonWriter.name(entry.getKey());
                    jsonWriter.value(entry.getValue());
                }
                jsonWriter.endObject();
            }
            zzbs zzbsVar = zzbuVar.zzh;
            if (zzbsVar != null) {
                jsonWriter.name("screen_info");
                jsonWriter.beginObject();
                Integer num2 = zzbsVar.zza;
                if (num2 != null) {
                    jsonWriter.name("width");
                    jsonWriter.value(num2);
                }
                Integer num3 = zzbsVar.zzb;
                if (num3 != null) {
                    jsonWriter.name("height");
                    jsonWriter.value(num3);
                }
                Double d = zzbsVar.zzc;
                if (d != null) {
                    jsonWriter.name("density");
                    jsonWriter.value(d);
                }
                List<zzbr> list = zzbsVar.zzd;
                if (!list.isEmpty()) {
                    jsonWriter.name("screen_insets");
                    jsonWriter.beginArray();
                    for (zzbr zzbrVar : list) {
                        jsonWriter.beginObject();
                        Integer num4 = zzbrVar.zza;
                        if (num4 != null) {
                            jsonWriter.name("top");
                            jsonWriter.value(num4);
                        }
                        Integer num5 = zzbrVar.zzb;
                        if (num5 != null) {
                            jsonWriter.name("left");
                            jsonWriter.value(num5);
                        }
                        Integer num6 = zzbrVar.zzc;
                        if (num6 != null) {
                            jsonWriter.name("right");
                            jsonWriter.value(num6);
                        }
                        Integer num7 = zzbrVar.zzd;
                        if (num7 != null) {
                            jsonWriter.name("bottom");
                            jsonWriter.value(num7);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            zzbo zzboVar = zzbuVar.zzi;
            if (zzboVar != null) {
                jsonWriter.name("app_info");
                jsonWriter.beginObject();
                String str6 = zzboVar.zza;
                if (str6 != null) {
                    jsonWriter.name("package_name");
                    jsonWriter.value(str6);
                }
                String str7 = zzboVar.zzb;
                if (str7 != null) {
                    jsonWriter.name("publisher_display_name");
                    jsonWriter.value(str7);
                }
                String str8 = zzboVar.zzc;
                if (str8 != null) {
                    jsonWriter.name(MediationMetaData.KEY_VERSION);
                    jsonWriter.value(str8);
                }
                jsonWriter.endObject();
            }
            zzbt zzbtVar = zzbuVar.zzj;
            if (zzbtVar != null) {
                jsonWriter.name("sdk_info");
                jsonWriter.beginObject();
                String str9 = zzbtVar.zza;
                if (str9 != null) {
                    jsonWriter.name(MediationMetaData.KEY_VERSION);
                    jsonWriter.value(str9);
                }
                jsonWriter.endObject();
            }
            List<zzbp> list2 = zzbuVar.zzk;
            if (!list2.isEmpty()) {
                jsonWriter.name("debug_params");
                jsonWriter.beginArray();
                for (zzbp zzbpVar2 : list2) {
                    zzbp zzbpVar3 = zzbp.DEBUG_PARAM_UNKNOWN;
                    int ordinal = zzbpVar2.ordinal();
                    if (ordinal == 0) {
                        str = "DEBUG_PARAM_UNKNOWN";
                    } else if (ordinal == 1) {
                        str = "ALWAYS_SHOW";
                    } else if (ordinal == 2) {
                        str = "GEO_OVERRIDE_EEA";
                    } else if (ordinal == 3) {
                        str = "GEO_OVERRIDE_NON_EEA";
                    } else if (ordinal == 4) {
                        str = "PREVIEWING_DEBUG_MESSAGES";
                    }
                    jsonWriter.value(str);
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            outputStreamWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 31);
                sb.append("Http error code - ");
                sb.append(responseCode);
                sb.append(".\n");
                sb.append(next);
                throw new IOException(sb.toString());
            }
            String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
            if (headerField != null) {
                zzbw zza = zzbw.zza(new JsonReader(new StringReader(headerField)));
                zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                return zza;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            bufferedReader.readLine();
            JsonReader jsonReader = new JsonReader(bufferedReader);
            zzbw zza2 = zzbw.zza(jsonReader);
            jsonReader.close();
            bufferedReader.close();
            return zza2;
        } catch (SocketTimeoutException e) {
            throw new zzj(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzj(2, "Error making request.", e2);
        }
    }

    public final /* synthetic */ void zza(final InterfaceC7924c interfaceC7924c) {
        Handler handler = this.zzc;
        interfaceC7924c.getClass();
        handler.post(new Runnable(interfaceC7924c) { // from class: com.google.android.gms.internal.consent_sdk.zzu
            public final /* synthetic */ InterfaceC7924c zza;

            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        });
    }

    public final void zzb(Activity activity, C7925d c7925d, InterfaceC7924c interfaceC7924c, final InterfaceC7923b interfaceC7923b) {
        try {
            throw null;
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(Log.getStackTraceString(e));
            final zzj zzjVar = new zzj(1, valueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(valueOf) : new String("Caught exception when trying to request consent info update: "));
            this.zzc.post(new Runnable(interfaceC7923b, zzjVar) { // from class: com.google.android.gms.internal.consent_sdk.zzt
                public final /* synthetic */ InterfaceC7923b zza;
                public final /* synthetic */ zzj zzb;

                {
                    this.zzb = zzjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zza();
                    throw null;
                }
            });
        }
    }

    public final void zzc(@Nullable final Activity activity, final C7925d c7925d, final InterfaceC7924c interfaceC7924c, final InterfaceC7923b interfaceC7923b) {
        this.zzd.execute(new Runnable(activity, c7925d, interfaceC7924c, interfaceC7923b) { // from class: com.google.android.gms.internal.consent_sdk.zzq
            public final /* synthetic */ Activity zzb;
            public final /* synthetic */ C7925d zzc;
            public final /* synthetic */ InterfaceC7924c zzd;
            public final /* synthetic */ InterfaceC7923b zze;

            @Override // java.lang.Runnable
            public final void run() {
                zzv.this.zzb(this.zzb, null, null, null);
            }
        });
    }
}

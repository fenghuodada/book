package com.adcolony.sdk;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.C10806j;
import kotlin.collections.C10764t;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.p061io.C10805a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.d2 */
/* loaded from: classes.dex */
public final class C2081d2 {
    @NotNull

    /* renamed from: e */
    public static final LinkedHashMap f5064e;
    @NotNull

    /* renamed from: a */
    public final String f5065a;
    @NotNull

    /* renamed from: b */
    public final String f5066b;
    @NotNull

    /* renamed from: c */
    public final String f5067c;
    @NotNull

    /* renamed from: d */
    public final String f5068d;

    static {
        C10806j[] c10806jArr = {new C10806j("default", "truefalse"), new C10806j("la-req-01", "\"iphoneos\"ipados\"cell\"tablet\"{\"carrier_name\":\",\"data_path\":\",\"device_api\":,\"screen_width\":,\"screen_height\":,\"display_dpi\":,\"device_type\":\"phone\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"mac_address\":\"\",\"manufacturer\":\",\"device_brand\":\",\"media_path\":\",\"temp_storage_path\":\",\"memory_class\":,\"memory_used_mb\":,\"model\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"wifi\",\"os_version\":\",\"os_name\":\"android\",\"platform\":\"android\",\"arch\":\",\"user_id\":\"\",\"app_id\":\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":1,\"cell_service_country_code\":\",\"timezone_ietf\":\",\"timezone_gmt_m\":,\"timezone_dst_m\":,\"controller_version\":\"3.\",\"current_orientation\":0,\"cleartext_permitted\":true,\"density\":,\"dark_mode\":false,\"available_stores\":[],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\"}"), new C10806j("la-res-01", "{\"controller\":{\"url\":\"https://adc-ad-assets.adtilt.com/launch/__controllers__/4.0.0/controller.js\",\"sha1\":,\"version\":\"3.\"},\"libraries\":[],\"item\":0,\"logging\":{\"log_private\":false,\"send_level\":1,\"enable_crash_reporting\":false,\"print_level\":3,\"report_interval_ms\":5000},\"metadata\":{\"controller_heartbeat_interval\":300000,\"controller_heartbeat_timeout\":15000,\"ad_request_timeout\":20000,\"iab_url\":\"https://adc-ad-assets.adtilt.com/launch/__libs__/omsdk/omsdk-v1.js\",\"odt_config\":{\"version\":,\"streams\":[{\"stream\":\"events\",\"request_types\":[\"start\",\"html5_interaction\",\"in_video_engagement\",\"download\",\"info\",\"viewable_impression\",\"complete\",\"skip\",\"continue\",\"midpoint\",\"first_quartile\",\"third_quartile\",\"reward_v4vc\"configure\"session_start\",\"session_end\",\"session_resume\",\"session_pause\"]\"table_name\"max_rows\": GROUP BY ]},\"calculate_odt_timeout\":500,\"async_odt_query\":false},\"status\":\"success\",\"pie\":\"}")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10764t.m468a(3));
        for (int i = 0; i < 3; i++) {
            C10806j c10806j = c10806jArr[i];
            linkedHashMap.put(c10806j.f21397a, c10806j.f21398b);
        }
        f5064e = linkedHashMap;
    }

    public C2081d2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f5065a = str;
        this.f5066b = str2;
        this.f5067c = str3;
        this.f5068d = str4;
    }

    @JvmStatic
    @JvmName(name = "createOrNull")
    @Nullable
    /* renamed from: a */
    public static final C2081d2 m9652a(@Nullable String str, @Nullable String str2) {
        C2081d2 c2081d2;
        if (str != null && str2 != null) {
            LinkedHashMap linkedHashMap = f5064e;
            synchronized (linkedHashMap) {
                if (!linkedHashMap.containsKey(str)) {
                    str = "default";
                }
                if (!linkedHashMap.containsKey(str2)) {
                    str2 = "default";
                }
                c2081d2 = new C2081d2(str, str2, (String) linkedHashMap.get(str), (String) linkedHashMap.get(str2));
            }
            return c2081d2;
        }
        return null;
    }

    @JvmName(name = "compress")
    @NotNull
    /* renamed from: b */
    public final byte[] m9651b(@NotNull byte[] bArr) throws UnsupportedEncodingException {
        Deflater deflater = new Deflater();
        try {
            Charset charset = C2108f2.f5107a;
            String str = this.f5067c;
            if (str != null) {
                deflater.setDictionary(str.getBytes(charset));
                deflater.setInput(bArr);
                deflater.finish();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C10805a.m443a(byteArrayOutputStream, null);
                return byteArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } finally {
            deflater.end();
        }
    }

    @JvmName(name = "decompress")
    @NotNull
    /* renamed from: c */
    public final String m9650c(@NotNull byte[] bArr) throws DataFormatException, UnsupportedEncodingException, IllegalArgumentException {
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                if (inflater.needsDictionary()) {
                    Charset charset = C2108f2.f5107a;
                    String str = this.f5068d;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    inflater.setDictionary(str.getBytes(charset));
                }
            }
            String str2 = new String(byteArrayOutputStream.toByteArray(), C2108f2.f5107a);
            C10805a.m443a(byteArrayOutputStream, null);
            return str2;
        } finally {
            inflater.end();
        }
    }
}

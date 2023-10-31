package com.adcolony.sdk;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.a */
/* loaded from: classes.dex */
public final class RunnableC2036a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f4912a;

    /* renamed from: b */
    public final /* synthetic */ C2383z4 f4913b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2357x f4914c;

    /* renamed from: com.adcolony.sdk.a$a */
    /* loaded from: classes.dex */
    public class RunnableC2037a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f4915a;

        public RunnableC2037a(String str) {
            this.f4915a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f4915a;
            boolean isEmpty = str.isEmpty();
            RunnableC2036a runnableC2036a = RunnableC2036a.this;
            if (isEmpty) {
                runnableC2036a.f4914c.onFailure();
            } else {
                runnableC2036a.f4914c.onSuccess(str);
            }
        }
    }

    public RunnableC2036a(C2058b3 c2058b3, C2383z4 c2383z4, AbstractC2357x abstractC2357x) {
        this.f4912a = c2058b3;
        this.f4913b = c2383z4;
        this.f4914c = abstractC2357x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m9549n;
        String encodeToString;
        C2058b3 c2058b3 = this.f4912a;
        C2383z4 c2383z4 = this.f4913b;
        long j = c2058b3.f4975Q;
        C2247p4 m9691l = c2058b3.m9691l();
        C2367y1 c2367y1 = c2058b3.m9687p().f5362b;
        ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
        c2367y1.m9454e(new String[]{"ads_to_restore"});
        C2367y1 m9527d = m9691l.m9527d();
        m9527d.m9454e(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", "model", "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        ArrayList arrayList = new ArrayList(Arrays.asList(c2367y1, m9527d));
        if (j > 0) {
            C2229o4 c2229o4 = new C2229o4();
            if (m9691l.f5465a.f5701a) {
                arrayList.add(m9691l.m9529b());
            } else {
                c2229o4.m9567b(new CallableC2184k4(m9691l, j));
            }
            if (m9691l.f5466b.f5701a) {
                arrayList.add(m9691l.m9528c());
            } else {
                c2229o4.m9567b(new CallableC2205m4(m9691l, j));
            }
            if (c2058b3.f4977S) {
                c2229o4.m9567b(new CallableC2065c(j));
            } else {
                arrayList.add(C2074d.m9672e(-1L));
            }
            if (!c2229o4.f5428a.isEmpty()) {
                arrayList.addAll(c2229o4.m9568a());
            }
        } else {
            arrayList.add(m9691l.m9529b());
            arrayList.add(m9691l.m9528c());
            arrayList.add(C2074d.m9672e(-1L));
        }
        arrayList.add(c2058b3.f4974P);
        C2367y1 m9664d = C2080d1.m9664d((C2367y1[]) arrayList.toArray(new C2367y1[0]));
        int i = c2383z4.f5721b + 1;
        c2383z4.f5721b = i;
        C2080d1.m9657k(i, m9664d, "signals_count");
        Context context = C2201m0.f5363a;
        if (context == null) {
            m9549n = false;
        } else {
            m9549n = C2232o6.m9549n(C2232o6.m9560c(context));
        }
        C2080d1.m9656l(m9664d, "device_audio", m9549n);
        synchronized (m9664d.f5690a) {
            Iterator<String> keys = m9664d.f5690a.keys();
            while (keys.hasNext()) {
                Object m9437v = m9664d.m9437v(keys.next());
                if (m9437v == null || (((m9437v instanceof JSONArray) && ((JSONArray) m9437v).length() == 0) || (((m9437v instanceof JSONObject) && ((JSONObject) m9437v).length() == 0) || m9437v.equals("")))) {
                    keys.remove();
                }
            }
        }
        byte[] bytes = m9664d.toString().getBytes(C2108f2.f5107a);
        if (c2058b3.f4982X) {
            try {
                byte[] m9651b = new C2081d2("sa01", "", "{\"origin_store\":\"google\",\"app_id\":\",\"bundle_id\":\",\"os_name\":\"android\",\"zone_ids\":[\"],\"carrier_name\":\",\"screen_width\":,\"screen_height\":,\"device_type\":\"phonetablet\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"manufacturer\":\",\"device_brand\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"cellwifi\",\"os_version\":\",\"platform\":\"android\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":,\"cell_service_country_code\":\",\"controller_version\":\",\"current_orientation\":,\"cleartext_permitted\":,\"available_stores\":[\"],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\",\"odt_payload\":{\"config\":{\"Q1\":[\",\\\"session_start\\\"\"],\"Q2\":[\",\\\"configure\\\"\"],\"Q3\":[\"],\"Q4\":[\"],\"Q5\":[\"],\"Q6\":[\"]},\"session\":{},\"events\":{},\"version\":},\"signals_count\":,\"device_audio\":true}", "").m9651b(bytes);
                C2367y1 c2367y12 = new C2367y1();
                c2367y12.m9455d("a", "sa01");
                c2367y12.m9455d("b", Base64.encodeToString(m9651b, 0));
                encodeToString = c2367y12.toString();
            } catch (UnsupportedEncodingException | JSONException unused) {
                encodeToString = Base64.encodeToString(bytes, 0);
            }
        } else {
            encodeToString = Base64.encodeToString(bytes, 0);
        }
        C2232o6.m9548o(new RunnableC2037a(encodeToString));
    }
}

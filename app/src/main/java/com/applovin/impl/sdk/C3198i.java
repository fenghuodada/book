package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.C2813c;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.network.C3238a;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.i */
/* loaded from: classes.dex */
public class C3198i implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C3214m f8339a;

    /* renamed from: b */
    private final AppLovinCommunicator f8340b;

    public C3198i(C3214m c3214m) {
        this.f8339a = c3214m;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(c3214m.m7476L());
        this.f8340b = appLovinCommunicator;
        if (c3214m.m7409e() || !((Boolean) c3214m.m7456a(C3109b.f8028eX)).booleanValue()) {
            return;
        }
        appLovinCommunicator.m9309a(c3214m);
        appLovinCommunicator.subscribe(this, C2813c.f6719a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle m7526b(com.applovin.impl.mediation.p011a.AbstractC2823a r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.m8798f()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = "network_name"
            java.lang.String r2 = r4.m8743L()
            r0.putString(r1, r2)
            java.lang.String r1 = "max_ad_unit_id"
            java.lang.String r2 = r4.getAdUnitId()
            r0.putString(r1, r2)
            java.lang.String r1 = "third_party_ad_placement_id"
            java.lang.String r2 = r4.m8792l()
            r0.putString(r1, r2)
            com.applovin.mediation.MaxAdFormat r1 = r4.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getCreativeId()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L49
            java.lang.String r1 = "creative_id"
            java.lang.String r2 = r4.getCreativeId()
            r0.putString(r1, r2)
        L49:
            java.lang.String r1 = r4.getDspName()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L5c
            java.lang.String r1 = "dsp_name"
            java.lang.String r2 = r4.getDspName()
            r0.putString(r1, r2)
        L5c:
            boolean r1 = r4.m8793k()
            if (r1 == 0) goto L6c
            java.lang.String r1 = "custom_js_network_name"
        L64:
            java.lang.String r2 = r4.getNetworkName()
            r0.putString(r1, r2)
            goto L7b
        L6c:
            java.lang.String r1 = "CUSTOM_NETWORK_SDK"
            java.lang.String r2 = r4.m8743L()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L7b
            java.lang.String r1 = "custom_sdk_network_name"
            goto L64
        L7b:
            org.json.JSONObject r1 = r4.m8802b()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle(r1)
            r0.putAll(r1)
            boolean r1 = r4 instanceof com.applovin.impl.mediation.p011a.C2824b
            if (r1 == 0) goto Lbe
            com.applovin.impl.mediation.a.b r4 = (com.applovin.impl.mediation.p011a.C2824b) r4
            android.view.View r4 = r4.m8778w()
            if (r4 == 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto Lb9
        Lb7:
            java.lang.String r4 = "N/A"
        Lb9:
            java.lang.String r1 = "ad_view"
            r0.putString(r1, r4)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3198i.m7526b(com.applovin.impl.mediation.a.a):android.os.Bundle");
    }

    /* renamed from: a */
    public void m7536a() {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            m7535a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* renamed from: a */
    public void m7535a(Bundle bundle, String str) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue() && !this.f8339a.m7409e()) {
            this.f8340b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f8339a.m7423b(C3109b.f8027eW).contains(str)));
        }
    }

    /* renamed from: a */
    public void m7534a(AbstractC2823a abstractC2823a) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue() && this.f8340b.hasSubscriber("max_revenue_events")) {
            Bundle m7526b = m7526b(abstractC2823a);
            m7526b.putAll(JsonUtils.toBundle(abstractC2823a.m8801c()));
            m7526b.putString("country_code", this.f8339a.m7393s().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f8339a.m7395q().getName(), m7526b);
            m7535a(m7526b, "max_revenue_events");
        }
    }

    /* renamed from: a */
    public void m7533a(AbstractC2823a abstractC2823a, String str) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue() && this.f8340b.hasSubscriber("max_ad_events")) {
            Bundle m7526b = m7526b(abstractC2823a);
            m7526b.putString("type", str);
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f8339a.m7487A();
                m7487A.m6855b("CommunicatorService", "Sending \"max_ad_events\" message: " + m7526b);
            }
            m7535a(m7526b, "max_ad_events");
        }
    }

    /* renamed from: a */
    public void m7532a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            m7535a(bundle, "adapter_initialization_status");
        }
    }

    /* renamed from: a */
    public void m7530a(String str, String str2) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            m7535a(bundle, "network_sdk_version_updated");
        }
    }

    /* renamed from: a */
    public void m7529a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(FacebookAdapter.KEY_ID, str);
            bundle.putString(ImagesContract.URL, str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean(FirebaseAnalytics.Param.SUCCESS, z);
            BundleUtils.putString("error_message", str3, bundle);
            m7535a(bundle, "receive_http_response");
        }
    }

    /* renamed from: a */
    public void m7528a(String str, String str2, String str3) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            m7535a(bundle, "responses");
        }
    }

    /* renamed from: a */
    public void m7527a(JSONObject jSONObject, boolean z) {
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8339a.m7386z());
            bundle.putString("applovin_random_token", this.f8339a.m7397o());
            bundle.putString("compass_random_token", this.f8339a.m7398n());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(this.f8339a.m7476L()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(C2895c.m8458a(this.f8339a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", new JSONObject());
            Bundle bundle2 = (Bundle) bundle.clone();
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "user_engagement_sdk_settings", new JSONObject());
            JsonUtils.putString(jSONObject3, "lsc", "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=");
            JsonUtils.putString(jSONObject3, "psp", "Y29tLmFuZHJvaWQudmVuZGluZw==");
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            m7535a(bundle2, "user_engagement_sdk_init");
            Bundle bundle3 = (Bundle) bundle.clone();
            bundle3.putString("user_id", this.f8339a.m7399m());
            bundle3.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject())));
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f8339a.m7487A();
                m7487A.m6855b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            m7535a(bundle3, "safedk_init");
            Bundle bundle4 = (Bundle) bundle.clone();
            bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
            m7535a(bundle4, "adjust_init");
            Bundle bundle5 = (Bundle) bundle.clone();
            bundle5.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "discovery_settings", new JSONObject())));
            m7535a(bundle5, "discovery_init");
        }
    }

    /* renamed from: a */
    public boolean m7531a(String str) {
        return C2813c.f6719a.contains(str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        int i;
        if (((Boolean) this.f8339a.m7456a(C3109b.f8028eX)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString(FacebookAdapter.KEY_ID, "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8339a.m7386z());
                }
                this.f8339a.m7467U().m7253a(new C3262h.C3264a().m7205c(messageData.getString(ImagesContract.URL)).m7201d(messageData.getString("backup_url")).m7212a(stringMap).m7204c(map2).m7208b(stringMap2).m7211a(((Boolean) this.f8339a.m7456a(C3109b.f8044ep)).booleanValue()).m7213a(string).m7215a());
            } else if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8339a.m7391u().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8339a.m7391u().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8339a.m7483E().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                }
            } else {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", "POST");
                long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f8339a.m7456a(C3109b.f7986dh)).longValue();
                int i2 = messageData2.getInt("retry_count", ((Integer) this.f8339a.m7456a(C3109b.f7987di)).intValue());
                long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f8339a.m7456a(C3109b.f7988dj)).longValue();
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j = millis2;
                if ("GET".equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f8339a.m7466V().m7143a(null, false, false))));
                    }
                    i = i2;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map<String, Object> m7132h = this.f8339a.m7466V().m7132h();
                        Map<String, Object> m7136d = this.f8339a.m7466V().m7136d();
                        if (m7136d.containsKey("idfv") && m7136d.containsKey("idfv_scope")) {
                            i = i2;
                            String str = (String) m7136d.get("idfv");
                            int intValue = ((Integer) m7136d.get("idfv_scope")).intValue();
                            m7136d.remove("idfv");
                            m7136d.remove("idfv_scope");
                            m7132h.put("idfv", str);
                            m7132h.put("idfv_scope", Integer.valueOf(intValue));
                        } else {
                            i = i2;
                        }
                        m7132h.put("server_installed_at", this.f8339a.m7456a(C3109b.f7827af));
                        m7132h.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8339a.m7386z());
                        map.put("app", m7132h);
                        map.put("device", m7136d);
                    } else {
                        i = i2;
                    }
                }
                this.f8339a.m7469S().m7620a(new C3238a(appLovinCommunicatorMessage.getPublisherId(), C3245c.m7323a(this.f8339a).mo7186a(messageData2.getString(ImagesContract.URL)).mo7175c(messageData2.getString("backup_url")).mo7185a(stringMap3).mo7179b(string2).mo7178b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo7184a(map != null ? new JSONObject(map) : null).mo7182b((int) millis).mo7189a(i).mo7176c((int) j).mo7187a((C3245c.C3246a) new JSONObject()).mo7173c(messageData2.getBoolean("is_encoding_enabled", false)).mo7190a(), this.f8339a), C3163o.EnumC3165a.MAIN);
            }
        }
    }
}

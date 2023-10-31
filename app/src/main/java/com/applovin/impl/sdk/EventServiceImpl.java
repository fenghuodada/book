package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {

    /* renamed from: a */
    private final C3214m f7546a;

    /* renamed from: b */
    private final Map<String, Object> f7547b;

    /* renamed from: c */
    private final AtomicBoolean f7548c = new AtomicBoolean();

    public EventServiceImpl(C3214m c3214m) {
        this.f7546a = c3214m;
        if (((Boolean) c3214m.m7456a(C3109b.f7879be)).booleanValue()) {
            this.f7547b = JsonUtils.toStringObjectMap((String) c3214m.m7421b((C3111d<C3111d<String>>) C3111d.f8084t, (C3111d<String>) JsonUtils.EMPTY_JSON), new HashMap());
            return;
        }
        this.f7547b = new HashMap();
        c3214m.m7453a((C3111d<C3111d<String>>) C3111d.f8084t, (C3111d<String>) JsonUtils.EMPTY_JSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m8084a() {
        return C0484a.m12392a(new StringBuilder(), (String) this.f7546a.m7456a(C3109b.f7817aV), "4.0/pix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m8080a(C3276p c3276p, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.f7546a.m7423b(C3109b.f7877bc).contains(c3276p.m7111a());
        hashMap.put("AppLovin-Event", contains ? c3276p.m7111a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", c3276p.m7111a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m8079a(C3276p c3276p, boolean z) {
        boolean contains = this.f7546a.m7423b(C3109b.f7877bc).contains(c3276p.m7111a());
        Map<String, Object> m7143a = this.f7546a.m7466V().m7143a(null, z, false);
        m7143a.put("event", contains ? c3276p.m7111a() : "postinstall");
        m7143a.put("event_id", c3276p.m7108d());
        m7143a.put("ts", Long.toString(c3276p.m7109c()));
        if (!contains) {
            m7143a.put("sub_event", c3276p.m7111a());
        }
        return Utils.stringifyObjectMap(m7143a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m8078b() {
        return C0484a.m12392a(new StringBuilder(), (String) this.f7546a.m7456a(C3109b.f7818aW), "4.0/pix");
    }

    /* renamed from: c */
    private void m8076c() {
        if (((Boolean) this.f7546a.m7456a(C3109b.f7879be)).booleanValue()) {
            this.f7546a.m7453a((C3111d<C3111d<String>>) C3111d.f8084t, (C3111d<String>) CollectionUtils.toJsonString(this.f7547b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f7547b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f7548c.compareAndSet(false, true)) {
            this.f7546a.m7389w().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinEventService", "Super property key cannot be null or empty");
                return;
            }
            return;
        }
        if (obj == null) {
            this.f7547b.remove(str);
        } else {
            List<String> m7423b = this.f7546a.m7423b(C3109b.f7878bd);
            if (!Utils.objectIsOfType(obj, m7423b, this.f7546a)) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + m7423b);
                    return;
                }
                return;
            }
            this.f7547b.put(str, Utils.sanitizeSuperProperty(obj, this.f7546a));
        }
        m8076c();
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap(1);
        hashMap.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f7546a.m7487A();
            m7487A.m6855b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final C3276p c3276p = new C3276p(str, map, this.f7547b);
        try {
            this.f7546a.m7469S().m7620a(new C3189z(this.f7546a, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.f7546a.m7467U().m7253a(C3262h.m7216o().m7205c(EventServiceImpl.this.m8084a()).m7201d(EventServiceImpl.this.m8078b()).m7212a(EventServiceImpl.this.m8079a(c3276p, false)).m7208b(EventServiceImpl.this.m8080a(c3276p, map2)).m7204c(c3276p.m7110b()).m7207b(((Boolean) EventServiceImpl.this.f7546a.m7456a(C3109b.f8053ey)).booleanValue()).m7211a(((Boolean) EventServiceImpl.this.f7546a.m7456a(C3109b.f8044ep)).booleanValue()).m7215a());
                }
            }), C3163o.EnumC3165a.BACKGROUND);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v m7487A2 = this.f7546a.m7487A();
                m7487A2.m6854b("AppLovinEventService", "Unable to track event: " + c3276p, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f7546a.m7487A();
            m7487A.m6855b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C3276p c3276p = new C3276p(str, new HashMap(), this.f7547b);
        this.f7546a.m7467U().m7253a(C3262h.m7216o().m7205c(m8084a()).m7201d(m8078b()).m7212a(m8079a(c3276p, true)).m7208b(m8080a(c3276p, (Map<String, String>) null)).m7204c(c3276p.m7110b()).m7207b(((Boolean) this.f7546a.m7456a(C3109b.f8053ey)).booleanValue()).m7211a(((Boolean) this.f7546a.m7456a(C3109b.f8044ep)).booleanValue()).m7215a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            }
        }
        trackEvent("iap", hashMap);
    }
}

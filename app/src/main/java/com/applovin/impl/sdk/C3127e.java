package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e */
/* loaded from: classes.dex */
public class C3127e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C3214m f8182a;

    /* renamed from: b */
    private final Object f8183b = new Object();

    /* renamed from: c */
    private final LinkedHashMap<String, Bundle> f8184c = new LinkedHashMap<String, Bundle>() { // from class: com.applovin.impl.sdk.e.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Bundle> entry) {
            return size() > 16;
        }
    };

    /* renamed from: d */
    private final Set<InterfaceC3130a> f8185d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.sdk.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3130a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C3127e(C3214m c3214m) {
        this.f8182a = c3214m;
        AppLovinCommunicator.getInstance(c3214m.m7476L()).subscribe(this, "safedk_ad_info");
    }

    /* renamed from: a */
    public static String m7713a() {
        return m7706d("getVersion");
    }

    /* renamed from: b */
    public static String m7710b() {
        return m7706d("getSdkKey");
    }

    /* renamed from: d */
    private static String m7706d(String str) {
        try {
            return (String) Class.forName("com.applovin.quality.AppLovinQualityService").getMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Nullable
    /* renamed from: a */
    public String m7711a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BundleUtils.getString("ad_review_creative_id", m7708b(str));
    }

    /* renamed from: a */
    public void m7712a(InterfaceC3130a interfaceC3130a) {
        this.f8185d.add(interfaceC3130a);
    }

    @Nullable
    /* renamed from: b */
    public Bundle m7708b(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f8183b) {
            bundle = this.f8184c.get(str);
        }
        return bundle;
    }

    /* renamed from: b */
    public void m7709b(InterfaceC3130a interfaceC3130a) {
        this.f8185d.remove(interfaceC3130a);
    }

    /* renamed from: c */
    public void m7707c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8183b) {
            this.f8184c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "e";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                if (C3349v.m6862a()) {
                    this.f8182a.m7487A().m6851d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                if (C3349v.m6862a()) {
                    this.f8182a.m7487A().m6851d("AppLovinSdk", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) == null) {
                if (C3349v.m6862a()) {
                    this.f8182a.m7487A().m6851d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else {
                final String string = bundle2.getString(FacebookAdapter.KEY_ID);
                if (TextUtils.isEmpty(string)) {
                    if (C3349v.m6862a()) {
                        this.f8182a.m7487A().m6851d("AppLovinSdk", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f8183b) {
                    C3349v m7487A = this.f8182a.m7487A();
                    m7487A.m6855b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                    this.f8184c.put(string, bundle);
                }
                final String string2 = bundle.getString("ad_review_creative_id");
                if (!StringUtils.isValidString(string2) || this.f8185d.isEmpty()) {
                    return;
                }
                Iterator it = new HashSet(this.f8185d).iterator();
                while (it.hasNext()) {
                    final InterfaceC3130a interfaceC3130a = (InterfaceC3130a) it.next();
                    this.f8182a.m7469S().m7620a(new C3189z(this.f8182a, new Runnable() { // from class: com.applovin.impl.sdk.e.2
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC3130a.onCreativeIdGenerated(string, string2);
                        }
                    }), C3163o.EnumC3165a.BACKGROUND);
                }
            }
        }
    }
}

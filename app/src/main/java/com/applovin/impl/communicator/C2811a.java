package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.a */
/* loaded from: classes.dex */
public class C2811a {

    /* renamed from: a */
    private final Context f6711a;

    /* renamed from: b */
    private final Set<C2812b> f6712b = new HashSet(32);

    /* renamed from: c */
    private final Object f6713c = new Object();

    public C2811a(Context context) {
        this.f6711a = context;
    }

    /* renamed from: a */
    private C2812b m8847a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (C2812b c2812b : this.f6712b) {
            if (str.equals(c2812b.m8845a()) && appLovinCommunicatorSubscriber.equals(c2812b.m8843b())) {
                return c2812b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m8849a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
                return false;
            }
            return false;
        }
        synchronized (this.f6713c) {
            C2812b m8847a = m8847a(str, appLovinCommunicatorSubscriber);
            if (m8847a == null) {
                C2812b c2812b = new C2812b(str, appLovinCommunicatorSubscriber);
                this.f6712b.add(c2812b);
                AppLovinBroadcastManager.getInstance(this.f6711a).registerReceiver(c2812b, new IntentFilter(str));
                return true;
            }
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            }
            if (!m8847a.m8842c()) {
                m8847a.m8844a(true);
                AppLovinBroadcastManager.getInstance(this.f6711a).registerReceiver(m8847a, new IntentFilter(str));
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean m8848a(String str) {
        synchronized (this.f6713c) {
            for (C2812b c2812b : this.f6712b) {
                if (str.equals(c2812b.m8845a())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void m8846b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        C2812b m8847a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f6713c) {
                m8847a = m8847a(str, appLovinCommunicatorSubscriber);
            }
            if (m8847a != null) {
                m8847a.m8844a(false);
                AppLovinBroadcastManager.getInstance(this.f6711a).unregisterReceiver(m8847a);
            }
        }
    }
}

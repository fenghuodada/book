package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3349v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.b */
/* loaded from: classes.dex */
public class C2812b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b */
    private final String f6715b;

    /* renamed from: c */
    private final WeakReference<AppLovinCommunicatorSubscriber> f6716c;

    /* renamed from: a */
    private boolean f6714a = true;

    /* renamed from: d */
    private final Set<CommunicatorMessageImpl> f6717d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f6718e = new Object();

    public C2812b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f6715b = str;
        this.f6716c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public String m8845a() {
        return this.f6715b;
    }

    /* renamed from: a */
    public void m8844a(boolean z) {
        this.f6714a = z;
    }

    /* renamed from: b */
    public AppLovinCommunicatorSubscriber m8843b() {
        return this.f6716c.get();
    }

    /* renamed from: c */
    public boolean m8842c() {
        return this.f6714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2812b) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f6716c.get();
            C2812b c2812b = (C2812b) obj;
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = c2812b.f6716c.get();
            if (m8845a().equals(c2812b.m8845a())) {
                if (appLovinCommunicatorSubscriber != null) {
                    if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                        return true;
                    }
                } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f6715b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f6716c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        boolean z;
        if (m8843b() == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinCommunicator", "Message received for GC'd subscriber");
                return;
            }
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f6718e) {
            if (this.f6717d.contains(communicatorMessageImpl)) {
                z = false;
            } else {
                this.f6717d.add(communicatorMessageImpl);
                z = true;
            }
        }
        if (z) {
            m8843b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}

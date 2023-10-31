package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.C2811a;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: a */
    private static AppLovinCommunicator f6233a;

    /* renamed from: b */
    private static final Object f6234b = new Object();

    /* renamed from: c */
    private C3214m f6235c;

    /* renamed from: d */
    private C3349v f6236d;

    /* renamed from: e */
    private final C2811a f6237e;

    /* renamed from: f */
    private final MessagingServiceImpl f6238f;

    private AppLovinCommunicator(Context context) {
        this.f6237e = new C2811a(context);
        this.f6238f = new MessagingServiceImpl(context);
    }

    /* renamed from: a */
    private void m9308a(String str) {
        C3349v c3349v = this.f6236d;
        if (c3349v != null) {
            c3349v.m6855b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6234b) {
            if (f6233a == null) {
                f6233a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f6233a;
    }

    /* renamed from: a */
    public void m9309a(C3214m c3214m) {
        this.f6235c = c3214m;
        this.f6236d = c3214m.m7487A();
        if (C3349v.m6862a()) {
            m9308a("Attached SDK instance: " + c3214m + "...");
        }
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6238f;
    }

    public boolean hasSubscriber(String str) {
        return this.f6237e.m8848a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6235c.m7433ag().m7531a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f6237e.m8849a(appLovinCommunicatorSubscriber, str)) {
                this.f6238f.maybeFlushStickyMessages(str);
            } else if (C3349v.m6862a()) {
                m9308a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6235c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (C3349v.m6862a()) {
                m9308a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            }
            this.f6237e.m8846b(appLovinCommunicatorSubscriber, str);
        }
    }
}

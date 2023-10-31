package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.C3086f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c */
/* loaded from: classes.dex */
public class C3107c {

    /* renamed from: a */
    private final C3214m f7738a;

    /* renamed from: b */
    private final C3349v f7739b;

    /* renamed from: d */
    private final Map<C3079d, C3352x> f7741d = new HashMap();

    /* renamed from: e */
    private final Map<C3079d, C3352x> f7742e = new HashMap();

    /* renamed from: c */
    private final Object f7740c = new Object();

    public C3107c(C3214m c3214m) {
        this.f7738a = c3214m;
        this.f7739b = c3214m.m7487A();
        for (C3079d c3079d : C3079d.m7981f()) {
            this.f7741d.put(c3079d, new C3352x());
            this.f7742e.put(c3079d, new C3352x());
        }
    }

    /* renamed from: d */
    private C3352x m7815d(C3079d c3079d) {
        C3352x c3352x;
        synchronized (this.f7740c) {
            c3352x = this.f7741d.get(c3079d);
            if (c3352x == null) {
                c3352x = new C3352x();
                this.f7741d.put(c3079d, c3352x);
            }
        }
        return c3352x;
    }

    /* renamed from: e */
    private C3352x m7814e(C3079d c3079d) {
        C3352x c3352x;
        synchronized (this.f7740c) {
            c3352x = this.f7742e.get(c3079d);
            if (c3352x == null) {
                c3352x = new C3352x();
                this.f7742e.put(c3079d, c3352x);
            }
        }
        return c3352x;
    }

    /* renamed from: f */
    private C3352x m7813f(C3079d c3079d) {
        synchronized (this.f7740c) {
            C3352x m7814e = m7814e(c3079d);
            if (m7814e.m6841a() > 0) {
                return m7814e;
            }
            return m7815d(c3079d);
        }
    }

    @Nullable
    /* renamed from: a */
    public AppLovinAdImpl m7818a(C3079d c3079d) {
        C3086f c3086f;
        synchronized (this.f7740c) {
            C3352x m7815d = m7815d(c3079d);
            if (m7815d.m6841a() > 0) {
                m7814e(c3079d).m6840a(m7815d.m6838c());
                c3086f = new C3086f(c3079d, this.f7738a);
            } else {
                c3086f = null;
            }
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7739b;
            StringBuilder sb = c3086f != null ? new StringBuilder("Retrieved ad of zone ") : new StringBuilder("Unable to retrieve ad of zone ");
            sb.append(c3079d);
            sb.append("...");
            c3349v.m6855b("AdPreloadManager", sb.toString());
        }
        return c3086f;
    }

    /* renamed from: a */
    public void m7819a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f7740c) {
            m7815d(appLovinAdImpl.getAdZone()).m6840a(appLovinAdImpl);
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f7739b;
                c3349v.m6855b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public AppLovinAdImpl m7817b(C3079d c3079d) {
        AppLovinAdImpl m6838c;
        synchronized (this.f7740c) {
            m6838c = m7813f(c3079d).m6838c();
        }
        return m6838c;
    }

    /* renamed from: c */
    public AppLovinAdBase m7816c(C3079d c3079d) {
        AppLovinAdImpl m6837d;
        synchronized (this.f7740c) {
            m6837d = m7813f(c3079d).m6837d();
        }
        return m6837d;
    }
}

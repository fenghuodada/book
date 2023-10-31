package com.applovin.impl.sdk.p032d;

import android.annotation.TargetApi;
import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p032d.C3121c;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3295h;

/* renamed from: com.applovin.impl.sdk.d.d */
/* loaded from: classes.dex */
public class C3123d {

    /* renamed from: a */
    private final C3214m f8146a;

    /* renamed from: b */
    private final C3126g f8147b;

    /* renamed from: c */
    private final C3121c.C3122a f8148c;

    /* renamed from: d */
    private final Object f8149d = new Object();

    /* renamed from: e */
    private final long f8150e;

    /* renamed from: f */
    private long f8151f;

    /* renamed from: g */
    private long f8152g;

    /* renamed from: h */
    private long f8153h;

    public C3123d(AppLovinAdImpl appLovinAdImpl, C3214m c3214m) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8146a = c3214m;
        this.f8147b = c3214m.m7468T();
        C3121c.C3122a m7756a = c3214m.m7437ac().m7756a(appLovinAdImpl);
        this.f8148c = m7756a;
        m7756a.m7753a(C3120b.f8114a, appLovinAdImpl.getSource().ordinal()).m7755a();
        this.f8150e = appLovinAdImpl.getCreatedAtMillis();
    }

    /* renamed from: a */
    public static void m7749a(long j, AppLovinAdBase appLovinAdBase, C3214m c3214m) {
        if (appLovinAdBase == null || c3214m == null) {
            return;
        }
        c3214m.m7437ac().m7756a(appLovinAdBase).m7753a(C3120b.f8115b, j).m7755a();
    }

    /* renamed from: a */
    public static void m7748a(AppLovinAdBase appLovinAdBase, C3214m c3214m) {
        if (appLovinAdBase == null || c3214m == null) {
            return;
        }
        c3214m.m7437ac().m7756a(appLovinAdBase).m7753a(C3120b.f8116c, appLovinAdBase.getFetchLatencyMillis()).m7753a(C3120b.f8117d, appLovinAdBase.getFetchResponseSize()).m7755a();
    }

    /* renamed from: a */
    private void m7747a(C3120b c3120b) {
        synchronized (this.f8149d) {
            if (this.f8151f > 0) {
                this.f8148c.m7753a(c3120b, System.currentTimeMillis() - this.f8151f).m7755a();
            }
        }
    }

    /* renamed from: a */
    public static void m7746a(C3124e c3124e, AppLovinAdBase appLovinAdBase, C3214m c3214m) {
        if (appLovinAdBase == null || c3214m == null || c3124e == null) {
            return;
        }
        c3214m.m7437ac().m7756a(appLovinAdBase).m7753a(C3120b.f8118e, c3124e.m7730c()).m7753a(C3120b.f8119f, c3124e.m7729d()).m7753a(C3120b.f8134u, c3124e.m7726g()).m7753a(C3120b.f8135v, c3124e.m7725h()).m7753a(C3120b.f8136w, c3124e.m7732b() ? 1L : 0L).m7755a();
    }

    @TargetApi(24)
    /* renamed from: a */
    public void m7751a() {
        boolean isInMultiWindowMode;
        this.f8148c.m7753a(C3120b.f8123j, this.f8147b.m7719a(C3125f.f8162b)).m7753a(C3120b.f8122i, this.f8147b.m7719a(C3125f.f8164d));
        synchronized (this.f8149d) {
            long j = 0;
            if (this.f8150e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8151f = currentTimeMillis;
                long m7473O = currentTimeMillis - this.f8146a.m7473O();
                long j2 = this.f8151f - this.f8150e;
                long j3 = C3295h.m7013a(this.f8146a.m7476L()) ? 1L : 0L;
                Activity m8070a = this.f8146a.m7434af().m8070a();
                if (C3294g.m7021f() && m8070a != null) {
                    isInMultiWindowMode = m8070a.isInMultiWindowMode();
                    if (isInMultiWindowMode) {
                        j = 1;
                    }
                }
                this.f8148c.m7753a(C3120b.f8121h, m7473O).m7753a(C3120b.f8120g, j2).m7753a(C3120b.f8129p, j3).m7753a(C3120b.f8137x, j);
            }
        }
        this.f8148c.m7755a();
    }

    /* renamed from: a */
    public void m7750a(long j) {
        this.f8148c.m7753a(C3120b.f8131r, j).m7755a();
    }

    /* renamed from: b */
    public void m7745b() {
        synchronized (this.f8149d) {
            if (this.f8152g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8152g = currentTimeMillis;
                long j = this.f8151f;
                if (j > 0) {
                    this.f8148c.m7753a(C3120b.f8126m, currentTimeMillis - j).m7755a();
                }
            }
        }
    }

    /* renamed from: b */
    public void m7744b(long j) {
        this.f8148c.m7753a(C3120b.f8130q, j).m7755a();
    }

    /* renamed from: c */
    public void m7743c() {
        m7747a(C3120b.f8124k);
    }

    /* renamed from: c */
    public void m7742c(long j) {
        this.f8148c.m7753a(C3120b.f8132s, j).m7755a();
    }

    /* renamed from: d */
    public void m7741d() {
        m7747a(C3120b.f8127n);
    }

    /* renamed from: d */
    public void m7740d(long j) {
        synchronized (this.f8149d) {
            if (this.f8153h < 1) {
                this.f8153h = j;
                this.f8148c.m7753a(C3120b.f8133t, j).m7755a();
            }
        }
    }

    /* renamed from: e */
    public void m7739e() {
        m7747a(C3120b.f8128o);
    }

    /* renamed from: f */
    public void m7738f() {
        m7747a(C3120b.f8125l);
    }

    /* renamed from: g */
    public void m7737g() {
        this.f8148c.m7754a(C3120b.f8138y).m7755a();
    }
}

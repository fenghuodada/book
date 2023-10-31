package com.applovin.impl.mediation.p011a;

import android.os.SystemClock;
import com.applovin.impl.mediation.C2980g;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p031c.C3108a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.c */
/* loaded from: classes.dex */
public class C2825c extends AbstractC2823a {

    /* renamed from: c */
    private final AtomicReference<C3105c> f6785c;

    /* renamed from: d */
    private final AtomicBoolean f6786d;

    /* renamed from: e */
    private final AtomicBoolean f6787e;

    private C2825c(C2825c c2825c, C2980g c2980g) {
        super(c2825c.m8735T(), c2825c.m8745J(), c2825c.m8746I(), c2980g, c2825c.f6791b);
        this.f6787e = new AtomicBoolean();
        this.f6785c = c2825c.f6785c;
        this.f6786d = c2825c.f6786d;
    }

    public C2825c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, null, c3214m);
        this.f6787e = new AtomicBoolean();
        this.f6785c = new AtomicReference<>();
        this.f6786d = new AtomicBoolean();
    }

    /* renamed from: A */
    public long m8774A() {
        return m8717b("ahdm", ((Long) this.f6791b.m7456a(C3108a.f7788x)).longValue());
    }

    /* renamed from: B */
    public boolean m8773B() {
        return m8716b("susaode", (Boolean) this.f6791b.m7456a(C3108a.f7787w)).booleanValue();
    }

    /* renamed from: C */
    public String m8772C() {
        return m8715b("bcode", "");
    }

    /* renamed from: D */
    public String m8771D() {
        return m8722a("mcode", "");
    }

    /* renamed from: E */
    public boolean m8770E() {
        return this.f6786d.get();
    }

    /* renamed from: F */
    public void m8769F() {
        this.f6786d.set(true);
    }

    /* renamed from: G */
    public C3105c m8768G() {
        return this.f6785c.getAndSet(null);
    }

    /* renamed from: H */
    public AtomicBoolean m8767H() {
        return this.f6787e;
    }

    @Override // com.applovin.impl.mediation.p011a.AbstractC2823a
    /* renamed from: a */
    public AbstractC2823a mo8759a(C2980g c2980g) {
        return new C2825c(this, c2980g);
    }

    /* renamed from: a */
    public void m8766a(C3105c c3105c) {
        this.f6785c.set(c3105c);
    }

    /* renamed from: u */
    public long m8765u() {
        long m8717b = m8717b("ad_expiration_ms", -1L);
        return m8717b >= 0 ? m8717b : m8725a("ad_expiration_ms", ((Long) this.f6791b.m7456a(C3108a.f7746D)).longValue());
    }

    /* renamed from: v */
    public long m8764v() {
        long m8717b = m8717b("ad_hidden_timeout_ms", -1L);
        return m8717b >= 0 ? m8717b : m8725a("ad_hidden_timeout_ms", ((Long) this.f6791b.m7456a(C3108a.f7749G)).longValue());
    }

    /* renamed from: w */
    public boolean m8763w() {
        if (m8716b("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return m8724a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f6791b.m7456a(C3108a.f7750H)).booleanValue();
    }

    /* renamed from: x */
    public long m8762x() {
        long m8717b = m8717b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return m8717b >= 0 ? m8717b : m8725a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f6791b.m7456a(C3108a.f7751I)).longValue());
    }

    /* renamed from: y */
    public long m8761y() {
        if (m8787q() > 0) {
            return SystemClock.elapsedRealtime() - m8787q();
        }
        return -1L;
    }

    /* renamed from: z */
    public long m8760z() {
        long m8717b = m8717b("fullscreen_display_delay_ms", -1L);
        return m8717b >= 0 ? m8717b : ((Long) this.f6791b.m7456a(C3108a.f7786v)).longValue();
    }
}

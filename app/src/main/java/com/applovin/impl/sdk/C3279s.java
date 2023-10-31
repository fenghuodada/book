package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.s */
/* loaded from: classes.dex */
public class C3279s {

    /* renamed from: a */
    private final C3214m f8655a;

    /* renamed from: c */
    private long f8657c;

    /* renamed from: f */
    private long f8660f;

    /* renamed from: g */
    private Object f8661g;

    /* renamed from: b */
    private final AtomicBoolean f8656b = new AtomicBoolean();

    /* renamed from: d */
    private final Object f8658d = new Object();

    /* renamed from: e */
    private final AtomicBoolean f8659e = new AtomicBoolean();

    public C3279s(C3214m c3214m) {
        this.f8655a = c3214m;
    }

    /* renamed from: a */
    public void m7070a(final Object obj) {
        if (!C2895c.m8456a(obj) && this.f8656b.compareAndSet(false, true)) {
            this.f8661g = obj;
            this.f8657c = System.currentTimeMillis();
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f8655a.m7487A();
                m7487A.m6855b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f8657c);
            }
            this.f8655a.m7430aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f8655a.m7456a(C3109b.f7933cg)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3279s.this.f8656b.get() && System.currentTimeMillis() - C3279s.this.f8657c >= longValue) {
                            if (C3349v.m6862a()) {
                                C3279s.this.f8655a.m7487A().m6855b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            C3279s.this.m7066b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    /* renamed from: a */
    public void m7069a(boolean z) {
        synchronized (this.f8658d) {
            this.f8659e.set(z);
            if (z) {
                this.f8660f = System.currentTimeMillis();
                if (C3349v.m6862a()) {
                    C3349v m7487A = this.f8655a.m7487A();
                    m7487A.m6855b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f8660f);
                }
                final long longValue = ((Long) this.f8655a.m7456a(C3109b.f7932cf)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C3279s.this.m7072a() && System.currentTimeMillis() - C3279s.this.f8660f >= longValue) {
                                if (C3349v.m6862a()) {
                                    C3279s.this.f8655a.m7487A().m6855b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                C3279s.this.f8659e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f8660f = 0L;
                if (C3349v.m6862a()) {
                    C3349v m7487A2 = this.f8655a.m7487A();
                    m7487A2.m6855b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m7072a() {
        return this.f8659e.get();
    }

    /* renamed from: b */
    public void m7066b(Object obj) {
        if (!C2895c.m8456a(obj) && this.f8656b.compareAndSet(true, false)) {
            this.f8661g = null;
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f8655a.m7487A();
                m7487A.m6855b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f8655a.m7430aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: b */
    public boolean m7068b() {
        return this.f8656b.get();
    }

    @Nullable
    /* renamed from: c */
    public Object m7065c() {
        return this.f8661g;
    }
}

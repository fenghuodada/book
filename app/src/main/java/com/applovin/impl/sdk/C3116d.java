package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.utils.C3337o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.d */
/* loaded from: classes.dex */
public class C3116d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C3337o f8097a;

    /* renamed from: b */
    private final Object f8098b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f8099c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f8100d;

    /* renamed from: e */
    private final C3214m f8101e;

    /* renamed from: f */
    private final WeakReference<InterfaceC3118a> f8102f;

    /* renamed from: g */
    private long f8103g;

    /* renamed from: com.applovin.impl.sdk.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3118a {
        void onAdRefresh();
    }

    public C3116d(C3214m c3214m, InterfaceC3118a interfaceC3118a) {
        this.f8102f = new WeakReference<>(interfaceC3118a);
        this.f8101e = c3214m;
    }

    /* renamed from: i */
    private void m7766i() {
        synchronized (this.f8098b) {
            C3337o c3337o = this.f8097a;
            if (c3337o != null) {
                c3337o.m6903b();
            } else {
                if (C3349v.m6862a()) {
                    this.f8101e.m7487A().m6855b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f8099c.set(true);
            }
        }
    }

    /* renamed from: j */
    private void m7765j() {
        synchronized (this.f8098b) {
            C3337o c3337o = this.f8097a;
            if (c3337o != null) {
                c3337o.m6901c();
            } else {
                this.f8099c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m7764k() {
        synchronized (this.f8098b) {
            this.f8097a = null;
            if (!((Boolean) this.f8101e.m7456a(C3108a.f7783s)).booleanValue()) {
                this.f8101e.m7430aj().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: l */
    private void m7763l() {
        if (((Boolean) this.f8101e.m7456a(C3108a.f7782r)).booleanValue()) {
            m7766i();
        }
    }

    /* renamed from: m */
    private void m7762m() {
        if (((Boolean) this.f8101e.m7456a(C3108a.f7782r)).booleanValue()) {
            synchronized (this.f8098b) {
                if (this.f8100d) {
                    if (C3349v.m6862a()) {
                        this.f8101e.m7487A().m6855b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8101e.m7436ad().m6836a()) {
                    if (C3349v.m6862a()) {
                        this.f8101e.m7487A().m6855b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    C3337o c3337o = this.f8097a;
                    if (c3337o != null) {
                        c3337o.m6901c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m7776a(long j) {
        synchronized (this.f8098b) {
            m7772c();
            this.f8103g = j;
            this.f8097a = C3337o.m6906a(j, this.f8101e, new Runnable() { // from class: com.applovin.impl.sdk.d.1
                @Override // java.lang.Runnable
                public void run() {
                    C3116d.this.m7764k();
                    InterfaceC3118a interfaceC3118a = (InterfaceC3118a) C3116d.this.f8102f.get();
                    if (interfaceC3118a != null) {
                        interfaceC3118a.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f8101e.m7456a(C3108a.f7783s)).booleanValue()) {
                this.f8101e.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f8101e.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f8101e.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f8101e.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f8101e.m7456a(C3108a.f7782r)).booleanValue() && (this.f8101e.m7435ae().m7068b() || this.f8101e.m7436ad().m6836a())) {
                this.f8097a.m6903b();
            }
            if (this.f8099c.compareAndSet(true, false) && ((Boolean) this.f8101e.m7456a(C3108a.f7784t)).booleanValue()) {
                if (C3349v.m6862a()) {
                    this.f8101e.m7487A().m6855b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f8097a.m6903b();
            }
        }
    }

    /* renamed from: a */
    public boolean m7777a() {
        boolean z;
        synchronized (this.f8098b) {
            z = this.f8097a != null;
        }
        return z;
    }

    /* renamed from: b */
    public long m7774b() {
        long m6907a;
        synchronized (this.f8098b) {
            C3337o c3337o = this.f8097a;
            m6907a = c3337o != null ? c3337o.m6907a() : -1L;
        }
        return m6907a;
    }

    /* renamed from: c */
    public void m7772c() {
        synchronized (this.f8098b) {
            C3337o c3337o = this.f8097a;
            if (c3337o != null) {
                c3337o.m6899d();
                m7764k();
            }
        }
    }

    /* renamed from: d */
    public void m7771d() {
        synchronized (this.f8098b) {
            m7766i();
            this.f8100d = true;
        }
    }

    /* renamed from: e */
    public void m7770e() {
        synchronized (this.f8098b) {
            m7765j();
            this.f8100d = false;
        }
    }

    /* renamed from: f */
    public boolean m7769f() {
        return this.f8100d;
    }

    /* renamed from: g */
    public void m7768g() {
        if (((Boolean) this.f8101e.m7456a(C3108a.f7781q)).booleanValue()) {
            m7766i();
        }
    }

    /* renamed from: h */
    public void m7767h() {
        InterfaceC3118a interfaceC3118a;
        if (((Boolean) this.f8101e.m7456a(C3108a.f7781q)).booleanValue()) {
            synchronized (this.f8098b) {
                if (this.f8100d) {
                    if (C3349v.m6862a()) {
                        this.f8101e.m7487A().m6855b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8101e.m7435ae().m7068b()) {
                    if (C3349v.m6862a()) {
                        this.f8101e.m7487A().m6855b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                } else {
                    boolean z = false;
                    if (this.f8097a != null) {
                        long m7774b = this.f8103g - m7774b();
                        long longValue = ((Long) this.f8101e.m7456a(C3108a.f7780p)).longValue();
                        if (longValue < 0 || m7774b <= longValue) {
                            this.f8097a.m6901c();
                        } else {
                            m7772c();
                            z = true;
                        }
                    }
                    if (!z || (interfaceC3118a = this.f8102f.get()) == null) {
                        return;
                    }
                    interfaceC3118a.onAdRefresh();
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            m7768g();
        } else if ("com.applovin.application_resumed".equals(action)) {
            m7767h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m7763l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m7762m();
        }
    }
}

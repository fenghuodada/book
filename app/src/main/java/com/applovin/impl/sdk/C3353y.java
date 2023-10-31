package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.y */
/* loaded from: classes.dex */
public class C3353y {

    /* renamed from: b */
    private static final AtomicBoolean f8834b = new AtomicBoolean();

    /* renamed from: a */
    final C3214m f8835a;

    /* renamed from: c */
    private final AtomicBoolean f8836c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f8837d = new AtomicBoolean();

    /* renamed from: e */
    private final AtomicInteger f8838e = new AtomicInteger();

    /* renamed from: f */
    private Date f8839f;

    /* renamed from: g */
    private Date f8840g;

    public C3353y(final C3214m c3214m) {
        this.f8835a = c3214m;
        final Application application = (Application) c3214m.m7476L();
        application.registerActivityLifecycleCallbacks(new AbstractC3287a() { // from class: com.applovin.impl.sdk.y.1
            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                C3353y.this.m6829e();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.y.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                C3353y.this.f8838e.set(i);
                if (i == 20) {
                    C3353y.this.m6828f();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.y.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        C3353y.this.m6829e();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C3353y.this.m6828f();
                }
            }
        }, intentFilter);
        if (((Boolean) c3214m.m7456a(C3109b.f7942cp)).booleanValue() && f8834b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            c3214m.m7430aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.y.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent2, @Nullable Map<String, Object> map) {
                    application.stopService(intent);
                    c3214m.m7430aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6829e() {
        if (this.f8837d.compareAndSet(true, false)) {
            m6826h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m6828f() {
        if (this.f8837d.compareAndSet(false, true)) {
            m6827g();
        }
    }

    /* renamed from: g */
    private void m6827g() {
        if (C3349v.m6862a()) {
            this.f8835a.m7487A().m6855b("SessionTracker", "Application Paused");
        }
        this.f8835a.m7430aj().sendBroadcastSync(new Intent("com.applovin.application_paused"), null);
        if (this.f8836c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f8835a.m7456a(C3109b.f7990dl)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8835a.m7456a(C3109b.f7992dn)).longValue());
        if (this.f8839f == null || System.currentTimeMillis() - this.f8839f.getTime() >= millis) {
            ((EventServiceImpl) this.f8835a.m7389w()).trackEvent("paused");
            if (booleanValue) {
                this.f8839f = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f8839f = new Date();
    }

    /* renamed from: h */
    private void m6826h() {
        if (C3349v.m6862a()) {
            this.f8835a.m7487A().m6855b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f8835a.m7456a(C3109b.f7990dl)).booleanValue();
        long longValue = ((Long) this.f8835a.m7456a(C3109b.f7991dm)).longValue();
        this.f8835a.m7430aj().sendBroadcastSync(new Intent("com.applovin.application_resumed"), null);
        if (this.f8836c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f8840g == null || System.currentTimeMillis() - this.f8840g.getTime() >= millis) {
            ((EventServiceImpl) this.f8835a.m7389w()).trackEvent("resumed");
            if (booleanValue) {
                this.f8840g = new Date();
            }
        }
        if (!booleanValue) {
            this.f8840g = new Date();
        }
        this.f8835a.m7468T().m7719a(C3125f.f8171k);
    }

    /* renamed from: a */
    public boolean m6836a() {
        return this.f8837d.get();
    }

    /* renamed from: b */
    public int m6834b() {
        return this.f8838e.get();
    }

    /* renamed from: c */
    public void m6832c() {
        this.f8836c.set(true);
    }

    /* renamed from: d */
    public void m6830d() {
        this.f8836c.set(false);
    }
}

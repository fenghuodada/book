package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.utils.C3337o;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b */
/* loaded from: classes.dex */
public class C3088b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C3214m f7698a;

    /* renamed from: b */
    private final InterfaceC3090a f7699b;

    /* renamed from: c */
    private C3337o f7700c;

    /* renamed from: d */
    private final Object f7701d = new Object();

    /* renamed from: e */
    private long f7702e;

    /* renamed from: com.applovin.impl.sdk.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3090a {
        void onAdExpired();
    }

    public C3088b(C3214m c3214m, InterfaceC3090a interfaceC3090a) {
        this.f7698a = c3214m;
        this.f7699b = interfaceC3090a;
    }

    /* renamed from: b */
    private void m7864b() {
        C3337o c3337o = this.f7700c;
        if (c3337o != null) {
            c3337o.m6899d();
            this.f7700c = null;
        }
    }

    /* renamed from: c */
    private void m7863c() {
        synchronized (this.f7701d) {
            m7864b();
        }
    }

    /* renamed from: d */
    private void m7862d() {
        boolean z;
        synchronized (this.f7701d) {
            long currentTimeMillis = this.f7702e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                m7867a();
                z = true;
            } else {
                m7866a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f7699b.onAdExpired();
        }
    }

    /* renamed from: a */
    public void m7867a() {
        synchronized (this.f7701d) {
            m7864b();
            this.f7698a.m7430aj().unregisterReceiver(this);
        }
    }

    /* renamed from: a */
    public void m7866a(long j) {
        synchronized (this.f7701d) {
            m7867a();
            this.f7702e = System.currentTimeMillis() + j;
            this.f7698a.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.f7698a.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.f7698a.m7456a(C3108a.f7747E)).booleanValue() || !this.f7698a.m7436ad().m6836a()) {
                this.f7700c = C3337o.m6906a(j, this.f7698a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3088b.this.m7867a();
                        C3088b.this.f7699b.onAdExpired();
                    }
                });
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            m7863c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            m7862d();
        }
    }
}

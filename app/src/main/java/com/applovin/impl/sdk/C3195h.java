package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.h */
/* loaded from: classes.dex */
public class C3195h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    public static int f8328a = -1;

    /* renamed from: b */
    private final AudioManager f8329b;

    /* renamed from: c */
    private final Context f8330c;

    /* renamed from: d */
    private final C3214m f8331d;

    /* renamed from: e */
    private final Set<InterfaceC3197a> f8332e = new HashSet();

    /* renamed from: f */
    private final Object f8333f = new Object();

    /* renamed from: g */
    private boolean f8334g;

    /* renamed from: h */
    private int f8335h;

    /* renamed from: com.applovin.impl.sdk.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3197a {
        /* renamed from: a */
        void mo7537a(int i);
    }

    public C3195h(C3214m c3214m) {
        this.f8331d = c3214m;
        Context m7476L = c3214m.m7476L();
        this.f8330c = m7476L;
        this.f8329b = (AudioManager) m7476L.getSystemService("audio");
    }

    /* renamed from: a */
    public static boolean m7543a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    private void m7541b() {
        if (C3349v.m6862a()) {
            this.f8331d.m7487A().m6855b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f8335h = f8328a;
        this.f8330c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f8331d.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f8331d.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    private void m7540b(final int i) {
        if (this.f8334g) {
            return;
        }
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f8331d.m7487A();
            m7487A.m6855b("AudioSessionManager", "Ringer mode is " + i);
        }
        synchronized (this.f8333f) {
            for (final InterfaceC3197a interfaceC3197a : this.f8332e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC3197a.mo7537a(i);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m7538c() {
        if (C3349v.m6862a()) {
            this.f8331d.m7487A().m6855b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f8330c.unregisterReceiver(this);
        this.f8331d.m7430aj().unregisterReceiver(this);
    }

    /* renamed from: a */
    public int m7544a() {
        return this.f8329b.getRingerMode();
    }

    /* renamed from: a */
    public void m7542a(InterfaceC3197a interfaceC3197a) {
        synchronized (this.f8333f) {
            if (this.f8332e.contains(interfaceC3197a)) {
                return;
            }
            this.f8332e.add(interfaceC3197a);
            if (this.f8332e.size() == 1) {
                m7541b();
            }
        }
    }

    /* renamed from: b */
    public void m7539b(InterfaceC3197a interfaceC3197a) {
        synchronized (this.f8333f) {
            if (this.f8332e.contains(interfaceC3197a)) {
                this.f8332e.remove(interfaceC3197a);
                if (this.f8332e.isEmpty()) {
                    m7538c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m7540b(this.f8329b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8334g = true;
            this.f8335h = this.f8329b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8334g = false;
            if (this.f8335h != this.f8329b.getRingerMode()) {
                this.f8335h = f8328a;
                m7540b(this.f8329b.getRingerMode());
            }
        }
    }
}

package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3214m;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.e */
/* loaded from: classes.dex */
public class C3291e implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private static final Set<C3291e> f8686a = new HashSet();

    /* renamed from: b */
    private final C3337o f8687b;

    /* renamed from: c */
    private final C3214m f8688c;

    private C3291e(long j, C3214m c3214m, final Runnable runnable) {
        this.f8687b = C3337o.m6906a(j, c3214m, new Runnable() { // from class: com.applovin.impl.sdk.utils.e.1
            @Override // java.lang.Runnable
            public void run() {
                C3291e.this.m7032a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f8688c = c3214m;
        f8686a.add(this);
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public static C3291e m7031a(long j, C3214m c3214m, Runnable runnable) {
        return new C3291e(j, c3214m, runnable);
    }

    /* renamed from: a */
    public void m7032a() {
        this.f8687b.m6899d();
        this.f8688c.m7430aj().unregisterReceiver(this);
        f8686a.remove(this);
    }

    /* renamed from: b */
    public long m7030b() {
        return this.f8687b.m6907a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8687b.m6903b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8687b.m6901c();
        }
    }
}

package com.applovin.impl.mediation.p014c;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.c.a */
/* loaded from: classes.dex */
public class C2869a extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final List<C2828f> f6936a;

    /* renamed from: c */
    private final Activity f6937c;

    /* renamed from: com.applovin.impl.mediation.c.a$a */
    /* loaded from: classes.dex */
    public static class C2871a extends AbstractRunnableC3131a {

        /* renamed from: a */
        private final C2828f f6940a;

        /* renamed from: c */
        private final List<C2828f> f6941c;

        /* renamed from: d */
        private final Activity f6942d;

        private C2871a(C2828f c2828f, List<C2828f> list, C3214m c3214m, Activity activity) {
            super("TaskSequentialInitAdapter:" + c2828f.m8744K(), c3214m, true);
            this.f6942d = activity;
            this.f6940a = c2828f;
            this.f6941c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3349v.m6862a()) {
                m7705a("Auto-initing " + this.f6940a + "...");
            }
            this.f8192b.m7484D().m8185a(this.f6940a, this.f6942d, new Runnable() { // from class: com.applovin.impl.mediation.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C3349v.m6862a()) {
                        C2871a c2871a = C2871a.this;
                        c2871a.m7705a("Initialization task for adapter '" + C2871a.this.f6940a.m8743L() + "' finished");
                    }
                    int indexOf = C2871a.this.f6941c.indexOf(C2871a.this.f6940a);
                    if (indexOf < C2871a.this.f6941c.size() - 1) {
                        C2828f c2828f = (C2828f) C2871a.this.f6941c.get(indexOf + 1);
                        ((AbstractRunnableC3131a) C2871a.this).f8192b.m7469S().m7619a(new C2871a(c2828f, C2871a.this.f6941c, ((AbstractRunnableC3131a) C2871a.this).f8192b, C2871a.this.f6942d), C3163o.EnumC3165a.MAIN, c2828f.m8730Y());
                    } else if (C3349v.m6862a()) {
                        C2871a.this.m7705a("Finished initializing adapters");
                    }
                }
            });
        }
    }

    public C2869a(List<C2828f> list, Activity activity, C3214m c3214m) {
        super("TaskAutoInitAdapters", c3214m, true);
        this.f6936a = list;
        this.f6937c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f6936a.size() > 0) {
                if (C3349v.m6862a()) {
                    StringBuilder sb = new StringBuilder("Auto-initing ");
                    sb.append(this.f6936a.size());
                    sb.append(" adapters");
                    sb.append(this.f8192b.m7478J().m8198a() ? " in test mode" : "");
                    sb.append("...");
                    m7705a(sb.toString());
                }
                if (TextUtils.isEmpty(this.f8192b.m7392t())) {
                    this.f8192b.m7412c(AppLovinMediationProvider.MAX);
                } else if (!this.f8192b.m7407f() && C3349v.m6862a()) {
                    C3349v.m6846i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f8192b.m7392t());
                }
                if (C3349v.m6862a() && this.f6937c == null) {
                    C3349v.m6846i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f8192b.m7456a(C3108a.f7759Q)).booleanValue()) {
                    C2828f c2828f = this.f6936a.get(0);
                    this.f8192b.m7469S().m7619a(new C2871a(c2828f, this.f6936a, this.f8192b, this.f6937c), C3163o.EnumC3165a.MAIN, c2828f.m8730Y());
                    return;
                }
                for (final C2828f c2828f2 : this.f6936a) {
                    this.f8192b.m7469S().m7615a(new Runnable() { // from class: com.applovin.impl.mediation.c.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C3349v.m6862a()) {
                                C2869a c2869a = C2869a.this;
                                c2869a.m7705a("Auto-initing adapter: " + c2828f2);
                            }
                            ((AbstractRunnableC3131a) C2869a.this).f8192b.m7484D().m8186a(c2828f2, C2869a.this.f6937c);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Failed to auto-init adapters", th);
            }
        }
    }
}

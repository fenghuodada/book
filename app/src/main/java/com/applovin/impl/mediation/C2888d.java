package com.applovin.impl.mediation;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p014c.C2873b;
import com.applovin.impl.mediation.p014c.C2877c;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.d */
/* loaded from: classes.dex */
public class C2888d {

    /* renamed from: a */
    private final C3214m f6993a;

    /* renamed from: b */
    private final Map<String, C2892b> f6994b = new HashMap(4);

    /* renamed from: c */
    private final Object f6995c = new Object();

    /* renamed from: d */
    private final Map<String, AbstractC2823a> f6996d = new HashMap(4);

    /* renamed from: e */
    private final Object f6997e = new Object();

    /* renamed from: com.applovin.impl.mediation.d$a */
    /* loaded from: classes.dex */
    public static class C2890a implements AbstractC2854a.InterfaceC2855a {

        /* renamed from: a */
        private final C3214m f7005a;

        /* renamed from: b */
        private final WeakReference<Context> f7006b;

        /* renamed from: c */
        private final C2888d f7007c;

        /* renamed from: d */
        private final C2892b f7008d;

        /* renamed from: e */
        private final MaxAdFormat f7009e;

        /* renamed from: f */
        private final Map<String, Object> f7010f;

        /* renamed from: g */
        private final Map<String, Object> f7011g;

        /* renamed from: h */
        private final int f7012h;

        private C2890a(Map<String, Object> map, Map<String, Object> map2, C2892b c2892b, MaxAdFormat maxAdFormat, C2888d c2888d, C3214m c3214m, Context context) {
            this.f7005a = c3214m;
            this.f7006b = new WeakReference<>(context);
            this.f7007c = c2888d;
            this.f7008d = c2892b;
            this.f7009e = maxAdFormat;
            this.f7011g = map2;
            this.f7010f = map;
            this.f7012h = CollectionUtils.getBoolean(map2, "disable_auto_retries") ? -1 : (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? Math.min(2, ((Integer) c3214m.m7456a(C3108a.f7756N)).intValue()) : ((Integer) c3214m.m7456a(C3108a.f7756N)).intValue();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (this.f7005a.m7455a(C3108a.f7757O, this.f7009e) && this.f7008d.f7018c < this.f7012h) {
                C2892b.m8460e(this.f7008d);
                final int pow = (int) Math.pow(2.0d, this.f7008d.f7018c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2890a.this.f7011g.put("retry_delay_sec", Integer.valueOf(pow));
                        C2890a.this.f7011g.put("retry_attempt", Integer.valueOf(C2890a.this.f7008d.f7018c));
                        Context context = (Context) C2890a.this.f7006b.get();
                        if (context == null) {
                            context = C2890a.this.f7005a.m7476L();
                        }
                        C2890a.this.f7007c.m8484a(str, C2890a.this.f7009e, C2890a.this.f7010f, C2890a.this.f7011g, context, C2890a.this);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.f7008d.f7018c = 0;
            this.f7008d.f7017b.set(false);
            if (this.f7008d.f7019d != null) {
                ((MaxErrorImpl) maxError).setLoadTag(this.f7008d.f7016a);
                C3298j.m6978a(this.f7008d.f7019d, str, maxError);
                this.f7008d.f7019d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AbstractC2823a abstractC2823a = (AbstractC2823a) maxAd;
            abstractC2823a.m8805a(this.f7008d.f7016a);
            this.f7008d.f7018c = 0;
            if (this.f7008d.f7019d != null) {
                abstractC2823a.m8797g().m8143e().m8815a(this.f7008d.f7019d);
                this.f7008d.f7019d.onAdLoaded(abstractC2823a);
                if (abstractC2823a.m8800d().endsWith("load")) {
                    this.f7008d.f7019d.onAdRevenuePaid(abstractC2823a);
                }
                this.f7008d.f7019d = null;
                if ((this.f7005a.m7423b(C3108a.f7755M).contains(maxAd.getAdUnitId()) || this.f7005a.m7455a(C3108a.f7754L, maxAd.getFormat())) && !this.f7005a.m7478J().m8198a() && !this.f7005a.m7478J().m8194b()) {
                    Context context = this.f7006b.get();
                    if (context == null) {
                        context = this.f7005a.m7476L();
                    }
                    this.f7007c.m8484a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f7010f, this.f7011g, context, this);
                    return;
                }
            } else {
                this.f7007c.m8489a(abstractC2823a);
            }
            this.f7008d.f7017b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$b */
    /* loaded from: classes.dex */
    public static class C2892b {

        /* renamed from: a */
        private final String f7016a;

        /* renamed from: b */
        private final AtomicBoolean f7017b;

        /* renamed from: c */
        private int f7018c;

        /* renamed from: d */
        private volatile AbstractC2854a.InterfaceC2855a f7019d;

        private C2892b(String str) {
            this.f7017b = new AtomicBoolean();
            this.f7016a = str;
        }

        /* renamed from: e */
        public static /* synthetic */ int m8460e(C2892b c2892b) {
            int i = c2892b.f7018c;
            c2892b.f7018c = i + 1;
            return i;
        }
    }

    public C2888d(C3214m c3214m) {
        this.f6993a = c3214m;
    }

    /* renamed from: a */
    private C2892b m8483a(String str, String str2) {
        String str3;
        C2892b c2892b;
        synchronized (this.f6995c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (StringUtils.isValidString(str2)) {
                str3 = "-" + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            String sb2 = sb.toString();
            c2892b = this.f6994b.get(sb2);
            if (c2892b == null) {
                c2892b = new C2892b(str2);
                this.f6994b.put(sb2, c2892b);
            }
        }
        return c2892b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8489a(AbstractC2823a abstractC2823a) {
        synchronized (this.f6997e) {
            if (this.f6996d.containsKey(abstractC2823a.getAdUnitId()) && C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdk", "Ad in cache already: " + abstractC2823a.getAdUnitId());
            }
            this.f6996d.put(abstractC2823a.getAdUnitId(), abstractC2823a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8484a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final Map<String, Object> map2, final Context context, final AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        this.f6993a.m7469S().m7620a(new C2873b(maxAdFormat, map, context, this.f6993a, new C2873b.InterfaceC2875a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.p014c.C2873b.InterfaceC2875a
            /* renamed from: a */
            public void mo8480a(JSONArray jSONArray) {
                C2888d.this.f6993a.m7469S().m7621a((AbstractRunnableC3131a) new C2877c(str, maxAdFormat, map, map2, jSONArray, context, C2888d.this.f6993a, interfaceC2855a));
            }
        }), C2895c.m8457a(maxAdFormat));
    }

    @Nullable
    /* renamed from: b */
    private AbstractC2823a m8481b(String str) {
        AbstractC2823a abstractC2823a;
        synchronized (this.f6997e) {
            abstractC2823a = this.f6996d.get(str);
            this.f6996d.remove(str);
        }
        return abstractC2823a;
    }

    /* renamed from: a */
    public void m8482a(String str, @Nullable String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        AbstractC2823a m8481b = (this.f6993a.m7478J().m8194b() || Utils.isDspDemoApp(this.f6993a.m7476L())) ? null : m8481b(str);
        if (m8481b != null) {
            m8481b.m8805a(str2);
            m8481b.m8797g().m8143e().m8815a(interfaceC2855a);
            interfaceC2855a.onAdLoaded(m8481b);
            if (m8481b.m8800d().endsWith("load")) {
                interfaceC2855a.onAdRevenuePaid(m8481b);
            }
        }
        C2892b m8483a = m8483a(str, str2);
        if (m8483a.f7017b.compareAndSet(false, true)) {
            if (m8481b == null) {
                m8483a.f7019d = interfaceC2855a;
            }
            m8484a(str, maxAdFormat, map, map2, context, new C2890a(map, map2, m8483a, maxAdFormat, this, this.f6993a, context));
            return;
        }
        if (m8483a.f7019d != null && m8483a.f7019d != interfaceC2855a && C3349v.m6862a()) {
            C3349v.m6847h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        m8483a.f7019d = interfaceC2855a;
    }

    /* renamed from: a */
    public boolean m8485a(String str) {
        boolean z;
        synchronized (this.f6997e) {
            z = this.f6996d.get(str) != null;
        }
        return z;
    }
}

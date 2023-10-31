package com.applovin.impl.mediation.p014c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p015d.C2893a;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p032d.C3126g;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.C3291e;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.e */
/* loaded from: classes.dex */
public class C2881e extends AbstractRunnableC3131a {

    /* renamed from: a */
    private static final AtomicBoolean f6973a = new AtomicBoolean();

    /* renamed from: c */
    private final String f6974c;

    /* renamed from: d */
    private final MaxAdFormat f6975d;

    /* renamed from: e */
    private final JSONObject f6976e;

    /* renamed from: f */
    private final List<AbstractC2823a> f6977f;

    /* renamed from: g */
    private final AbstractC2854a.InterfaceC2855a f6978g;

    /* renamed from: h */
    private final WeakReference<Context> f6979h;

    /* renamed from: i */
    private long f6980i;

    /* renamed from: j */
    private final List<MaxNetworkResponseInfo> f6981j;

    /* renamed from: com.applovin.impl.mediation.c.e$a */
    /* loaded from: classes.dex */
    public class C2884a extends AbstractRunnableC3131a {

        /* renamed from: c */
        private final long f6986c;

        /* renamed from: d */
        private final int f6987d;

        /* renamed from: e */
        private final AbstractC2823a f6988e;

        /* renamed from: f */
        private final List<AbstractC2823a> f6989f;

        public C2884a(int i, List<AbstractC2823a> list) {
            super(C2881e.this.m7699e(), C2881e.this.f8192b);
            this.f6986c = SystemClock.elapsedRealtime();
            this.f6987d = i;
            this.f6988e = list.get(i);
            this.f6989f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8500a(AbstractC2823a abstractC2823a, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, @Nullable MaxError maxError) {
            C2881e.this.f6981j.add(new MaxNetworkResponseInfoImpl(adLoadState, abstractC2823a.m8796h(), new MaxMediatedNetworkInfoImpl(C2895c.m8455a(abstractC2823a.m8744K(), this.f8192b)), j, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m8490e(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3349v.m6862a()) {
                m7705a("Loading ad " + (this.f6987d + 1) + " of " + this.f6989f.size() + ": " + this.f6988e.m8743L());
            }
            m8490e("started to load ad");
            Context context = (Context) C2881e.this.f6979h.get();
            this.f8192b.m7483E().loadThirdPartyMediatedAd(C2881e.this.f6974c, this.f6988e, context instanceof Activity ? (Activity) context : this.f8192b.m7426an(), new C2893a(C2881e.this.f6978g) { // from class: com.applovin.impl.mediation.c.e.a.1
                @Override // com.applovin.impl.mediation.p015d.C2893a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C2884a.this.f6986c;
                    if (C3349v.m6862a()) {
                        C2884a c2884a = C2884a.this;
                        c2884a.m7705a("Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    if (C3349v.m6862a()) {
                        C2884a c2884a2 = C2884a.this;
                        c2884a2.m8490e("failed to load ad: " + maxError.getCode());
                    }
                    C2884a c2884a3 = C2884a.this;
                    c2884a3.m8500a(c2884a3.f6988e, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (C2884a.this.f6987d >= C2884a.this.f6989f.size() - 1) {
                        C2881e.this.m8507a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                        return;
                    }
                    C2884a c2884a4 = C2884a.this;
                    ((AbstractRunnableC3131a) C2884a.this).f8192b.m7469S().m7620a(new C2884a(c2884a4.f6987d + 1, C2884a.this.f6989f), C2895c.m8457a(C2881e.this.f6975d));
                }

                @Override // com.applovin.impl.mediation.p015d.C2893a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    C2884a.this.m8490e("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C2884a.this.f6986c;
                    if (C3349v.m6862a()) {
                        C2884a c2884a = C2884a.this;
                        c2884a.m7705a("Ad loaded in " + elapsedRealtime + "ms");
                    }
                    AbstractC2823a abstractC2823a = (AbstractC2823a) maxAd;
                    C2884a.this.m8500a(abstractC2823a, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                    int i = C2884a.this.f6987d;
                    while (true) {
                        i++;
                        if (i >= C2884a.this.f6989f.size()) {
                            C2881e.this.m8511a(abstractC2823a);
                            return;
                        } else {
                            C2884a c2884a2 = C2884a.this;
                            c2884a2.m8500a((AbstractC2823a) c2884a2.f6989f.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2881e(java.lang.String r3, com.applovin.mediation.MaxAdFormat r4, java.util.Map<java.lang.String, java.lang.Object> r5, org.json.JSONObject r6, android.content.Context r7, com.applovin.impl.sdk.C3214m r8, com.applovin.impl.mediation.ads.AbstractC2854a.InterfaceC2855a r9) {
        /*
            r2 = this;
            java.lang.String r0 = "TaskProcessMediationWaterfall:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = androidx.activity.result.C0063d.m13052b(r0, r3, r1)
            java.lang.String r1 = r4.getLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r8)
            r2.f6974c = r3
            r2.f6975d = r4
            r2.f6976e = r6
            r2.f6978g = r9
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            r2.f6979h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.length()
            r3.<init>(r4)
            r2.f6977f = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r6, r4, r3)
            r4 = 0
        L3c:
            int r7 = r3.length()
            if (r4 >= r7) goto L53
            r7 = 0
            org.json.JSONObject r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(r3, r4, r7)
            java.util.List<com.applovin.impl.mediation.a.a> r9 = r2.f6977f
            com.applovin.impl.mediation.a.a r7 = com.applovin.impl.mediation.p011a.AbstractC2823a.m8804a(r5, r7, r6, r8)
            r9.add(r7)
            int r4 = r4 + 1
            goto L3c
        L53:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.applovin.impl.mediation.a.a> r4 = r2.f6977f
            int r4 = r4.size()
            r3.<init>(r4)
            r2.f6981j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.p014c.C2881e.<init>(java.lang.String, com.applovin.mediation.MaxAdFormat, java.util.Map, org.json.JSONObject, android.content.Context, com.applovin.impl.sdk.m, com.applovin.impl.mediation.ads.a$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8511a(AbstractC2823a abstractC2823a) {
        this.f8192b.m7482F().m6844a(abstractC2823a);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6980i;
        if (C3349v.m6862a()) {
            StringBuilder m12390a = C0486c.m12390a("Waterfall loaded in ", elapsedRealtime, "ms for ");
            m12390a.append(abstractC2823a.m8743L());
            m7703b(m12390a.toString());
        }
        abstractC2823a.m8806a(new MaxAdWaterfallInfoImpl(abstractC2823a, elapsedRealtime, this.f6981j));
        C3298j.m6984a((MaxAdListener) this.f6978g, (MaxAd) abstractC2823a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8507a(MaxError maxError) {
        C3126g m7468T;
        C3125f c3125f;
        if (maxError.getCode() == 204) {
            m7468T = this.f8192b.m7468T();
            c3125f = C3125f.f8176p;
        } else if (maxError.getCode() == -5001) {
            m7468T = this.f8192b.m7468T();
            c3125f = C3125f.f8177q;
        } else {
            m7468T = this.f8192b.m7468T();
            c3125f = C3125f.f8178r;
        }
        m7468T.m7719a(c3125f);
        ArrayList arrayList = new ArrayList(this.f6981j.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f6981j) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6980i;
        if (C3349v.m6862a()) {
            m7703b("Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f6976e, "waterfall_name", ""), JsonUtils.getString(this.f6976e, "waterfall_test_name", ""), elapsedRealtime, this.f6981j));
        C3298j.m6978a(this.f6978g, this.f6974c, maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6980i = SystemClock.elapsedRealtime();
        if (this.f6976e.optBoolean("is_testing", false) && !this.f8192b.m7478J().m8198a() && f6973a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", ((AbstractRunnableC3131a) C2881e.this).f8192b.m7426an());
                }
            });
        }
        if (this.f6977f.size() > 0) {
            if (C3349v.m6862a()) {
                m7705a("Starting waterfall for " + this.f6977f.size() + " ad(s)...");
            }
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) new C2884a(0, this.f6977f));
            return;
        }
        if (C3349v.m6862a()) {
            m7702c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f6974c, this.f6975d, this.f6976e, this.f8192b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f6976e, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j <= 0) {
            m8507a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C2881e.this.m8507a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            C3291e.m7031a(millis, this.f8192b, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}

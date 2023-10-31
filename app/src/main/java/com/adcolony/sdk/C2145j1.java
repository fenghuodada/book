package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.core.provider.C0758e;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2249q;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p060j$.util.DesugarCollections;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.j1 */
/* loaded from: classes.dex */
public final class C2145j1 {

    /* renamed from: a */
    public ConcurrentHashMap<String, Runnable> f5264a;

    /* renamed from: b */
    public HashMap<String, C2135i1> f5265b;

    /* renamed from: c */
    public ConcurrentHashMap<String, C2249q> f5266c;

    /* renamed from: d */
    public ConcurrentHashMap<String, AbstractC2187l> f5267d;

    /* renamed from: e */
    public ConcurrentHashMap<String, AbstractC2187l> f5268e;

    /* renamed from: f */
    public Map<String, C2178k> f5269f;

    /* renamed from: g */
    public final Object f5270g = new Object();

    /* renamed from: com.adcolony.sdk.j1$a */
    /* loaded from: classes.dex */
    public class C2146a implements InterfaceC2203m2 {
        public C2146a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w(FacebookAdapter.KEY_ID);
            if (c2367y1.m9441r("type") == 0) {
                C2249q remove = c2145j1.f5266c.remove(m9436w);
                if (C2201m0.m9587e() && remove != null && remove.m9520b()) {
                    C2232o6.m9548o(new RunnableC2181k1());
                } else {
                    C2145j1.m9606d(c2100e2.f5097a, m9436w);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j1$b */
    /* loaded from: classes.dex */
    public class C2147b implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.j1$b$a */
        /* loaded from: classes.dex */
        public class RunnableC2148a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5273a;

            public RunnableC2148a(C2100e2 c2100e2) {
                this.f5273a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2317u abstractC2317u;
                C2249q c2249q = C2145j1.this.f5266c.get(this.f5273a.f5098b.m9436w(FacebookAdapter.KEY_ID));
                if (c2249q != null && (abstractC2317u = c2249q.f5476a) != null) {
                    abstractC2317u.onAudioStopped(c2249q);
                }
            }
        }

        public C2147b() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2232o6.m9548o(new RunnableC2148a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.j1$c */
    /* loaded from: classes.dex */
    public class C2149c implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.j1$c$a */
        /* loaded from: classes.dex */
        public class RunnableC2150a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5276a;

            public RunnableC2150a(C2100e2 c2100e2) {
                this.f5276a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2317u abstractC2317u;
                C2249q c2249q = C2145j1.this.f5266c.get(this.f5276a.f5098b.m9436w(FacebookAdapter.KEY_ID));
                if (c2249q != null && (abstractC2317u = c2249q.f5476a) != null) {
                    abstractC2317u.onAudioStarted(c2249q);
                }
            }
        }

        public C2149c() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2232o6.m9548o(new RunnableC2150a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.j1$d */
    /* loaded from: classes.dex */
    public class C2151d implements InterfaceC2203m2 {
        public C2151d() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            boolean z;
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w(FacebookAdapter.KEY_ID);
            C2249q c2249q = c2145j1.f5266c.get(m9436w);
            if (c2249q != null) {
                if (c2249q.f5487l == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    AbstractC2317u abstractC2317u = c2249q.f5476a;
                    if (abstractC2317u == null) {
                        C2145j1.m9606d(c2100e2.f5097a, m9436w);
                        return;
                    }
                    C2232o6.m9545r(c2145j1.f5264a.remove(m9436w));
                    if (!C2201m0.m9587e()) {
                        C2145j1.m9608b(c2249q);
                        return;
                    }
                    c2249q.f5487l = 2;
                    c2249q.f5483h = c2367y1.m9436w("ad_id");
                    c2367y1.m9436w("creative_id");
                    c2249q.f5486k = c2367y1.m9436w("ad_request_id");
                    C2232o6.m9548o(new RunnableC2202m1(c2100e2, c2249q, abstractC2317u));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j1$e */
    /* loaded from: classes.dex */
    public class C2152e implements InterfaceC2203m2 {
        public C2152e() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            AbstractC2317u abstractC2317u;
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            String m9436w = c2100e2.f5098b.m9436w(FacebookAdapter.KEY_ID);
            C2249q remove = c2145j1.f5266c.remove(m9436w);
            if (remove == null) {
                abstractC2317u = null;
            } else {
                abstractC2317u = remove.f5476a;
            }
            if (abstractC2317u == null) {
                C2145j1.m9606d(c2100e2.f5097a, m9436w);
                return;
            }
            C2232o6.m9545r(c2145j1.f5264a.remove(m9436w));
            C2145j1.m9608b(remove);
        }
    }

    /* renamed from: com.adcolony.sdk.j1$f */
    /* loaded from: classes.dex */
    public class C2153f implements InterfaceC2203m2 {
        public C2153f() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1.this.getClass();
            String m9436w = c2100e2.f5098b.m9436w(FacebookAdapter.KEY_ID);
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, m9436w);
            Context context = C2201m0.f5363a;
            if (context == null) {
                C2080d1.m9656l(c2367y1, "has_audio", false);
            } else {
                boolean m9549n = C2232o6.m9549n(C2232o6.m9560c(context));
                double m9562a = C2232o6.m9562a(C2232o6.m9560c(context));
                C2080d1.m9656l(c2367y1, "has_audio", m9549n);
                C2080d1.m9663e(c2367y1, "volume", m9562a);
            }
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.j1$g */
    /* loaded from: classes.dex */
    public class C2154g implements InterfaceC2203m2 {
        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.j1$h */
    /* loaded from: classes.dex */
    public class C2155h implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.j1$h$a */
        /* loaded from: classes.dex */
        public class RunnableC2156a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5281a;

            public RunnableC2156a(C2100e2 c2100e2) {
                this.f5281a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2100e2 c2100e2 = this.f5281a;
                c2100e2.m9641a(c2100e2.f5098b).m9640b();
            }
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2232o6.m9548o(new RunnableC2156a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.j1$i */
    /* loaded from: classes.dex */
    public class C2157i implements InterfaceC2203m2 {
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
            r5 = r3.f5708e;
            r6 = r5.length;
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
            if (r7 >= r6) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
            if (r1.equals(r5[r7]) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
            r7 = r7 + 1;
         */
        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo9422a(com.adcolony.sdk.C2100e2 r10) {
            /*
                r9 = this;
                com.adcolony.sdk.f4 r0 = com.adcolony.sdk.C2110f4.m9634c()
                com.adcolony.sdk.z3 r1 = r0.f5110a
                if (r1 != 0) goto La
                goto Ld1
            La:
                com.adcolony.sdk.y1 r10 = r10.f5098b
                if (r10 != 0) goto L10
                goto Ld1
            L10:
                java.lang.String r1 = "payload"
                com.adcolony.sdk.y1 r10 = r10.m9438u(r1)
                if (r10 != 0) goto L1a
                goto Ld1
            L1a:
                java.lang.String r1 = "request_type"
                java.lang.String r1 = r10.m9436w(r1)
                com.adcolony.sdk.z3 r2 = r0.f5110a
                r2.getClass()
                boolean r3 = r1.isEmpty()
                r4 = 0
                if (r3 == 0) goto L2d
                goto L63
            L2d:
                java.util.ArrayList r2 = r2.f5703b
                java.util.Iterator r2 = r2.iterator()
            L33:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L63
                java.lang.Object r3 = r2.next()
                com.adcolony.sdk.z3$a r3 = (com.adcolony.sdk.C2378z3.C2379a) r3
                java.lang.String[] r5 = r3.f5707d
                int r6 = r5.length
                r7 = r4
            L43:
                if (r7 >= r6) goto L51
                r8 = r5[r7]
                boolean r8 = r1.equals(r8)
                if (r8 == 0) goto L4e
                goto L64
            L4e:
                int r7 = r7 + 1
                goto L43
            L51:
                java.lang.String[] r5 = r3.f5708e
                int r6 = r5.length
                r7 = r4
            L55:
                if (r7 >= r6) goto L33
                r8 = r5[r7]
                boolean r8 = r1.equals(r8)
                if (r8 == 0) goto L60
                goto L64
            L60:
                int r7 = r7 + 1
                goto L55
            L63:
                r3 = 0
            L64:
                if (r3 == 0) goto Ld1
                android.content.ContentValues r2 = com.adcolony.sdk.C2110f4.m9636a(r10, r3)     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                com.adcolony.sdk.r5 r5 = com.adcolony.sdk.C2279r5.m9508a()     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                java.lang.String r6 = r3.f5705b     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                r5.m9507b(r2, r6)     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                com.adcolony.sdk.r5 r5 = com.adcolony.sdk.C2279r5.m9508a()     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                r5.m9506c(r3, r2)     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                r0.f5113d = r4     // Catch: java.lang.NullPointerException -> L7d java.lang.NumberFormatException -> L7f
                goto Ld1
            L7d:
                r2 = move-exception
                goto L80
            L7f:
                r2 = move-exception
            L80:
                r2.printStackTrace()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Error parsing event:"
                r5.<init>(r6)
                r5.append(r1)
                java.lang.String r1 = " "
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r3.append(r5)
                java.lang.String r10 = r10.toString()
                r3.append(r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r5 = "Schema version: "
                r10.<init>(r5)
                com.adcolony.sdk.z3 r0 = r0.f5110a
                int r0 = r0.f5702a
                r10.append(r0)
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                r3.append(r10)
                java.lang.String r10 = " e: "
                r3.append(r10)
                java.lang.String r10 = r2.toString()
                r3.append(r10)
                java.lang.String r10 = r3.toString()
                r0 = 1
                androidx.datastore.preferences.protobuf.C1169e.m11129c(r10, r4, r0, r0)
            Ld1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2145j1.C2157i.mo9422a(com.adcolony.sdk.e2):void");
        }
    }

    /* renamed from: com.adcolony.sdk.j1$j */
    /* loaded from: classes.dex */
    public class C2158j implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.j1$j$a */
        /* loaded from: classes.dex */
        public class RunnableC2159a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5283a;

            public RunnableC2159a(C2100e2 c2100e2) {
                this.f5283a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Rect m9523h;
                C2145j1 c2145j1 = C2145j1.this;
                c2145j1.getClass();
                Context context = C2201m0.f5363a;
                if (context != null) {
                    C2100e2 c2100e2 = this.f5283a;
                    C2367y1 c2367y1 = c2100e2.f5098b;
                    String m9436w = c2367y1.m9436w("ad_session_id");
                    C2135i1 c2135i1 = new C2135i1(context.getApplicationContext(), m9436w);
                    c2135i1.f5192a = new HashMap<>();
                    c2135i1.f5193b = new HashMap<>();
                    c2135i1.f5194c = new HashMap<>();
                    c2135i1.f5195d = new HashMap<>();
                    c2135i1.f5196e = new HashMap<>();
                    c2135i1.f5197f = new HashMap<>();
                    c2135i1.f5198g = new HashMap<>();
                    c2135i1.f5210s = new ArrayList<>();
                    c2135i1.f5211t = new ArrayList<>();
                    C2367y1 c2367y12 = c2100e2.f5098b;
                    if (c2367y12.m9444o("transparent")) {
                        c2135i1.setBackgroundColor(0);
                    }
                    c2135i1.f5201j = c2367y12.m9441r(FacebookAdapter.KEY_ID);
                    c2135i1.f5199h = c2367y12.m9441r("width");
                    c2135i1.f5200i = c2367y12.m9441r("height");
                    c2135i1.f5202k = c2367y12.m9441r("module_id");
                    c2135i1.f5205n = c2367y12.m9444o("viewability_enabled");
                    if (c2135i1.f5201j == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c2135i1.f5212u = z;
                    C2058b3 m9588d = C2201m0.m9588d();
                    if (c2135i1.f5199h == 0 && c2135i1.f5200i == 0) {
                        boolean z2 = c2135i1.f5214w;
                        m9588d.m9691l().getClass();
                        if (z2) {
                            m9523h = C2247p4.m9522i();
                        } else {
                            m9523h = C2247p4.m9523h();
                        }
                        c2135i1.f5199h = m9523h.width();
                        c2135i1.f5200i = m9523h.height();
                    } else {
                        c2135i1.setLayoutParams(new FrameLayout.LayoutParams(c2135i1.f5199h, c2135i1.f5200i));
                    }
                    ArrayList<InterfaceC2203m2> arrayList = c2135i1.f5210s;
                    C2318u0 c2318u0 = new C2318u0(c2135i1);
                    C2201m0.m9589c("VideoView.create", c2318u0);
                    arrayList.add(c2318u0);
                    ArrayList<InterfaceC2203m2> arrayList2 = c2135i1.f5210s;
                    C2327v0 c2327v0 = new C2327v0(c2135i1);
                    C2201m0.m9589c("VideoView.destroy", c2327v0);
                    arrayList2.add(c2327v0);
                    ArrayList<InterfaceC2203m2> arrayList3 = c2135i1.f5210s;
                    C2350w0 c2350w0 = new C2350w0(c2135i1);
                    C2201m0.m9589c("WebView.create", c2350w0);
                    arrayList3.add(c2350w0);
                    ArrayList<InterfaceC2203m2> arrayList4 = c2135i1.f5210s;
                    C2358x0 c2358x0 = new C2358x0(c2135i1);
                    C2201m0.m9589c("WebView.destroy", c2358x0);
                    arrayList4.add(c2358x0);
                    ArrayList<InterfaceC2203m2> arrayList5 = c2135i1.f5210s;
                    C2366y0 c2366y0 = new C2366y0(c2135i1);
                    C2201m0.m9589c("TextView.create", c2366y0);
                    arrayList5.add(c2366y0);
                    ArrayList<InterfaceC2203m2> arrayList6 = c2135i1.f5210s;
                    C2375z0 c2375z0 = new C2375z0(c2135i1);
                    C2201m0.m9589c("TextView.destroy", c2375z0);
                    arrayList6.add(c2375z0);
                    ArrayList<InterfaceC2203m2> arrayList7 = c2135i1.f5210s;
                    C2039a1 c2039a1 = new C2039a1(c2135i1);
                    C2201m0.m9589c("ImageView.create", c2039a1);
                    arrayList7.add(c2039a1);
                    ArrayList<InterfaceC2203m2> arrayList8 = c2135i1.f5210s;
                    C2056b1 c2056b1 = new C2056b1(c2135i1);
                    C2201m0.m9589c("ImageView.destroy", c2056b1);
                    arrayList8.add(c2056b1);
                    c2135i1.f5211t.add("VideoView.create");
                    c2135i1.f5211t.add("VideoView.destroy");
                    c2135i1.f5211t.add("WebView.create");
                    c2135i1.f5211t.add("WebView.destroy");
                    c2135i1.f5211t.add("TextView.create");
                    c2135i1.f5211t.add("TextView.destroy");
                    c2135i1.f5211t.add("ImageView.create");
                    c2135i1.f5211t.add("ImageView.destroy");
                    VideoView videoView = new VideoView(c2135i1.f5216y);
                    c2135i1.f5217z = videoView;
                    videoView.setVisibility(8);
                    c2135i1.addView(c2135i1.f5217z);
                    c2135i1.setClipToPadding(false);
                    if (c2135i1.f5205n) {
                        C2232o6.m9556g(new RunnableC2067c1(c2135i1, c2100e2.f5098b.m9444o("advanced_viewability")), 200L);
                    }
                    c2145j1.f5265b.put(m9436w, c2135i1);
                    if (c2367y1.m9441r("width") == 0) {
                        C2249q c2249q = c2145j1.f5266c.get(m9436w);
                        if (c2249q == null) {
                            C2145j1.m9606d(c2100e2.f5097a, m9436w);
                            return;
                        }
                        c2249q.f5478c = c2135i1;
                    } else {
                        c2135i1.f5212u = false;
                    }
                    C2367y1 c2367y13 = new C2367y1();
                    C2080d1.m9656l(c2367y13, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y13).m9640b();
                }
            }
        }

        public C2158j() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2232o6.m9548o(new RunnableC2159a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.j1$k */
    /* loaded from: classes.dex */
    public class RunnableC2160k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2135i1 f5285a;

        public RunnableC2160k(C2135i1 c2135i1) {
            this.f5285a = c2135i1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (int i = 0; i < this.f5285a.f5210s.size(); i++) {
                String str = this.f5285a.f5211t.get(i);
                InterfaceC2203m2 interfaceC2203m2 = this.f5285a.f5210s.get(i);
                C2117g2 m9688o = C2201m0.m9588d().m9688o();
                synchronized (m9688o.f5126c) {
                    ArrayList<InterfaceC2203m2> arrayList = m9688o.f5126c.get(str);
                    if (arrayList != null) {
                        arrayList.remove(interfaceC2203m2);
                    }
                }
            }
            this.f5285a.f5211t.clear();
            this.f5285a.f5210s.clear();
            this.f5285a.removeAllViews();
            C2135i1 c2135i1 = this.f5285a;
            c2135i1.f5217z = null;
            c2135i1.f5216y = null;
            for (C2218o0 c2218o0 : c2135i1.f5194c.values()) {
                if (!(c2218o0 instanceof C2352w1)) {
                    if (c2218o0 instanceof C2088e1) {
                        C2058b3 m9588d = C2201m0.m9588d();
                        C2088e1 c2088e1 = (C2088e1) c2218o0;
                        m9588d.f5004v.remove(Integer.valueOf(c2088e1.getAdc3ModuleId()));
                        C2117g2 c2117g2 = m9588d.f4983a;
                        c2117g2.getClass();
                        c2117g2.m9631c(c2088e1.getAdcModuleId());
                    } else if (!c2218o0.f5408k) {
                        c2218o0.f5408k = true;
                        C2232o6.m9548o(new RunnableC2292t0(c2218o0));
                    }
                }
            }
            for (TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 : this.f5285a.f5192a.values()) {
                textureView$SurfaceTextureListenerC2142j0.m9611e();
                textureView$SurfaceTextureListenerC2142j0.f5255t = true;
            }
            this.f5285a.f5192a.clear();
            this.f5285a.f5193b.clear();
            this.f5285a.f5194c.clear();
            this.f5285a.f5196e.clear();
            this.f5285a.f5198g.clear();
            this.f5285a.f5195d.clear();
            this.f5285a.f5197f.clear();
            this.f5285a.f5204m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.j1$l */
    /* loaded from: classes.dex */
    public class C2161l implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.j1$l$a */
        /* loaded from: classes.dex */
        public class RunnableC2162a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5287a;

            public RunnableC2162a(C2100e2 c2100e2) {
                this.f5287a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2145j1 c2145j1 = C2145j1.this;
                c2145j1.getClass();
                C2100e2 c2100e2 = this.f5287a;
                String m9436w = c2100e2.f5098b.m9436w("ad_session_id");
                C2135i1 c2135i1 = c2145j1.f5265b.get(m9436w);
                if (c2135i1 == null) {
                    C2145j1.m9606d(c2100e2.f5097a, m9436w);
                } else {
                    c2145j1.m9607c(c2135i1);
                }
            }
        }

        public C2161l() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2232o6.m9548o(new RunnableC2162a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.j1$m */
    /* loaded from: classes.dex */
    public class C2163m implements InterfaceC2203m2 {
        public C2163m() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w("ad_session_id");
            int m9441r = c2367y1.m9441r("view_id");
            C2135i1 c2135i1 = c2145j1.f5265b.get(m9436w);
            String str = c2100e2.f5097a;
            if (c2135i1 == null) {
                C2145j1.m9606d(str, m9436w);
                return;
            }
            View view = c2135i1.f5198g.get(Integer.valueOf(m9441r));
            if (view == null) {
                C2145j1.m9606d(str, "" + m9441r);
                return;
            }
            view.bringToFront();
        }
    }

    /* renamed from: com.adcolony.sdk.j1$n */
    /* loaded from: classes.dex */
    public class C2164n implements InterfaceC2203m2 {
        public C2164n() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w("ad_session_id");
            int m9441r = c2367y1.m9441r("view_id");
            C2135i1 c2135i1 = c2145j1.f5265b.get(m9436w);
            String str = c2100e2.f5097a;
            if (c2135i1 == null) {
                C2145j1.m9606d(str, m9436w);
                return;
            }
            View view = c2135i1.f5198g.get(Integer.valueOf(m9441r));
            if (view == null) {
                C2145j1.m9606d(str, "" + m9441r);
                return;
            }
            c2135i1.removeView(view);
            c2135i1.addView(view, view.getLayoutParams());
        }
    }

    /* renamed from: com.adcolony.sdk.j1$o */
    /* loaded from: classes.dex */
    public class C2165o implements InterfaceC2203m2 {
        public C2165o() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            AbstractC2317u abstractC2317u;
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            int m9441r = c2367y1.m9441r("status");
            if (m9441r != 5 && m9441r != 1 && m9441r != 0 && m9441r != 6) {
                String m9436w = c2367y1.m9436w(FacebookAdapter.KEY_ID);
                C2249q remove = c2145j1.f5266c.remove(m9436w);
                if (remove == null) {
                    abstractC2317u = null;
                } else {
                    abstractC2317u = remove.f5476a;
                }
                if (abstractC2317u == null) {
                    C2145j1.m9606d(c2100e2.f5097a, m9436w);
                    return;
                }
                C2232o6.m9548o(new RunnableC2255q1(abstractC2317u, remove));
                remove.m9521a();
                remove.f5478c = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j1$p */
    /* loaded from: classes.dex */
    public class C2166p implements InterfaceC2203m2 {
        public C2166p() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            boolean z;
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w(FacebookAdapter.KEY_ID);
            C2249q c2249q = c2145j1.f5266c.get(m9436w);
            C2178k c2178k = c2145j1.f5269f.get(m9436w);
            int m9458a = c2367y1.m9458a("orientation", -1);
            if (c2178k != null) {
                z = true;
            } else {
                z = false;
            }
            if (c2249q == null && !z) {
                C2145j1.m9606d(c2100e2.f5097a, m9436w);
                return;
            }
            C2080d1.m9660h(new C2367y1(), FacebookAdapter.KEY_ID, m9436w);
            if (c2249q != null) {
                c2249q.f5481f = m9458a;
                C2249q.C2250a c2250a = c2249q.f5490o;
                C2232o6.m9545r(c2250a);
                Context context = C2201m0.f5363a;
                if (context != null && C2201m0.m9586f() && !c2250a.f5491a) {
                    C2201m0.m9588d().f4994l = c2249q.f5478c;
                    C2201m0.m9588d().f4997o = c2249q;
                    C2232o6.m9554i(new Intent(context, AdColonyInterstitialActivity.class), false);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j1$q */
    /* loaded from: classes.dex */
    public class C2167q implements InterfaceC2203m2 {
        public C2167q() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            String m9436w = c2100e2.f5098b.m9436w(FacebookAdapter.KEY_ID);
            AbstractC2187l remove = c2145j1.f5267d.remove(m9436w);
            if (remove == null) {
                C2145j1.m9606d(c2100e2.f5097a, m9436w);
                return;
            }
            c2145j1.f5268e.put(m9436w, remove);
            C2232o6.m9545r(c2145j1.f5264a.remove(m9436w));
            Context context = C2201m0.f5363a;
            if (context == null) {
                C2232o6.m9548o(new RunnableC2211n1(remove));
            } else {
                C2232o6.m9548o(new RunnableC2189l1(c2145j1, context, c2100e2, remove, m9436w));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j1$r */
    /* loaded from: classes.dex */
    public class C2168r implements InterfaceC2203m2 {
        public C2168r() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2145j1 c2145j1 = C2145j1.this;
            c2145j1.getClass();
            String m9436w = c2100e2.f5098b.m9436w(FacebookAdapter.KEY_ID);
            AbstractC2187l remove = c2145j1.f5267d.remove(m9436w);
            if (remove == null) {
                C2145j1.m9606d(c2100e2.f5097a, m9436w);
                return;
            }
            C2232o6.m9545r(c2145j1.f5264a.remove(m9436w));
            C2232o6.m9548o(new RunnableC2211n1(remove));
        }
    }

    /* renamed from: a */
    public static void m9609a(@NonNull Context context, @NonNull C2367y1 c2367y1, @NonNull String str) {
        C2100e2 c2100e2 = new C2100e2("AdSession.finish_fullscreen_ad", 0);
        C2080d1.m9657k(1, c2367y1, "status");
        c2100e2.f5098b = c2367y1;
        C1169e.m11129c(str, 0, 0, false);
        ((ActivityC2209n0) context).mo9582b(c2100e2);
    }

    /* renamed from: b */
    public static void m9608b(C2249q c2249q) {
        c2249q.f5487l = 3;
        AbstractC2317u abstractC2317u = c2249q.f5476a;
        if (abstractC2317u != null) {
            C2232o6.m9548o(new RunnableC2291t(c2249q, abstractC2317u));
        }
        if (!C2201m0.m9587e()) {
            StringBuilder sb = new StringBuilder("RequestNotFilled called due to a missing context. ");
            sb.append("Interstitial with adSessionId(" + c2249q.f5482g + ").");
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: d */
    public static void m9606d(String str, String str2) {
        C1169e.m11129c(C0758e.m11827a("Message '", str, "' sent with invalid id: ", str2), 0, 0, false);
    }

    /* renamed from: c */
    public final void m9607c(C2135i1 c2135i1) {
        C2232o6.m9548o(new RunnableC2160k(c2135i1));
        C2178k c2178k = this.f5269f.get(c2135i1.f5203l);
        if (c2178k == null || c2178k.f5320l) {
            this.f5265b.remove(c2135i1.f5203l);
            c2135i1.f5216y = null;
        }
    }

    /* renamed from: e */
    public final void m9605e() {
        HashSet hashSet = new HashSet();
        synchronized (this.f5270g) {
            for (String str : this.f5268e.keySet()) {
                AbstractC2187l remove = this.f5268e.remove(str);
                if (remove != null) {
                    hashSet.add(remove);
                }
            }
            for (String str2 : this.f5267d.keySet()) {
                AbstractC2187l remove2 = this.f5267d.remove(str2);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C2232o6.m9548o(new RunnableC2211n1((AbstractC2187l) it.next()));
        }
        for (String str3 : this.f5266c.keySet()) {
            C2249q c2249q = this.f5266c.get(str3);
            if (c2249q != null) {
                boolean z = true;
                if (c2249q.f5487l != 1) {
                    z = false;
                }
                if (z) {
                    this.f5266c.remove(str3);
                    m9608b(c2249q);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m9604f() {
        this.f5264a = new ConcurrentHashMap<>();
        this.f5265b = new HashMap<>();
        this.f5266c = new ConcurrentHashMap<>();
        this.f5267d = new ConcurrentHashMap<>();
        this.f5268e = new ConcurrentHashMap<>();
        this.f5269f = DesugarCollections.synchronizedMap(new HashMap());
        C2201m0.m9590b("AdContainer.create", new C2158j());
        C2201m0.m9590b("AdContainer.destroy", new C2161l());
        C2201m0.m9590b("AdContainer.move_view_to_index", new C2163m());
        C2201m0.m9590b("AdContainer.move_view_to_front", new C2164n());
        C2201m0.m9590b("AdSession.finish_fullscreen_ad", new C2165o());
        C2201m0.m9590b("AdSession.start_fullscreen_ad", new C2166p());
        C2201m0.m9590b("AdSession.ad_view_available", new C2167q());
        C2201m0.m9590b("AdSession.ad_view_unavailable", new C2168r());
        C2201m0.m9590b("AdSession.expiring", new C2146a());
        C2201m0.m9590b("AdSession.audio_stopped", new C2147b());
        C2201m0.m9590b("AdSession.audio_started", new C2149c());
        C2201m0.m9590b("AdSession.interstitial_available", new C2151d());
        C2201m0.m9590b("AdSession.interstitial_unavailable", new C2152e());
        C2201m0.m9590b("AdSession.has_audio", new C2153f());
        C2201m0.m9590b("WebView.prepare", new C2154g());
        C2201m0.m9590b("AdSession.expanded", new C2155h());
        C2201m0.m9590b("AdColony.odt_event", new C2157i());
    }
}

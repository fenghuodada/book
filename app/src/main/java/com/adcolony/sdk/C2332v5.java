package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0499a;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.RejectedExecutionException;
import libv2ray.V2rayConfig;

/* renamed from: com.adcolony.sdk.v5 */
/* loaded from: classes.dex */
public final class C2332v5 {

    /* renamed from: com.adcolony.sdk.v5$a */
    /* loaded from: classes.dex */
    public class C2333a implements InterfaceC2203m2 {
        public C2333a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            C2145j1 m9692k = C2201m0.m9588d().m9692k();
            String m9436w = c2367y1.m9436w("ad_session_id");
            C2249q c2249q = m9692k.f5266c.get(m9436w);
            C2178k c2178k = m9692k.f5269f.get(m9436w);
            if ((c2249q != null && c2249q.f5476a != null && c2249q.f5478c != null) || (c2178k != null && c2178k.getListener() != null)) {
                if (c2178k == null) {
                    new C2100e2("AdUnit.make_in_app_purchase", c2249q.f5478c.f5202k).m9640b();
                }
                C2332v5.m9478b(m9436w);
                C2332v5.m9477c(m9436w);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$b */
    /* loaded from: classes.dex */
    public class C2334b implements InterfaceC2203m2 {
        public C2334b() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            Activity activity;
            C2332v5.this.getClass();
            String m9436w = c2100e2.f5098b.m9436w("ad_session_id");
            Context context = C2201m0.f5363a;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            boolean z = activity instanceof AdColonyAdViewActivity;
            if (activity instanceof ActivityC2209n0) {
                if (z) {
                    ((AdColonyAdViewActivity) activity).m9710e();
                    return;
                }
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, m9436w);
                new C2100e2(((ActivityC2209n0) activity).f5378c, c2367y1, "AdSession.on_request_close").m9640b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$c */
    /* loaded from: classes.dex */
    public class C2335c implements InterfaceC2203m2 {
        public C2335c() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            Context context = C2201m0.f5363a;
            if (context != null && C2201m0.m9586f()) {
                String m9436w = c2367y1.m9436w("ad_session_id");
                C2058b3 m9588d = C2201m0.m9588d();
                C2178k c2178k = m9588d.m9692k().f5269f.get(m9436w);
                if (c2178k != null) {
                    if ((c2178k.getTrustedDemandSource() || c2178k.f5322n) && m9588d.f4996n != c2178k) {
                        c2178k.setExpandMessage(c2100e2);
                        c2178k.setExpandedWidth(c2367y1.m9441r("width"));
                        c2178k.setExpandedHeight(c2367y1.m9441r("height"));
                        c2178k.setOrientation(c2367y1.m9458a("orientation", -1));
                        c2178k.setNoCloseButton(c2367y1.m9444o("use_custom_close"));
                        m9588d.f4996n = c2178k;
                        m9588d.f4994l = c2178k.getContainer();
                        Intent intent = new Intent(context, AdColonyAdViewActivity.class);
                        C2332v5.m9477c(m9436w);
                        C2332v5.m9478b(m9436w);
                        C2232o6.m9554i(intent, false);
                    }
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$d */
    /* loaded from: classes.dex */
    public class C2336d implements InterfaceC2203m2 {
        public C2336d() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2178k c2178k = C2201m0.m9588d().m9692k().f5269f.get(c2100e2.f5098b.m9436w("ad_session_id"));
            if (c2178k != null) {
                c2178k.setNoCloseButton(c2100e2.f5098b.m9444o("use_custom_close"));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$e */
    /* loaded from: classes.dex */
    public class C2337e implements InterfaceC2203m2 {
        public C2337e() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int orientation;
            int i;
            C2332v5.this.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9436w("ad_session_id");
            int m9441r = c2367y1.m9441r("orientation");
            C2145j1 m9692k = C2201m0.m9588d().m9692k();
            C2178k c2178k = m9692k.f5269f.get(m9436w);
            C2249q c2249q = m9692k.f5266c.get(m9436w);
            Context context = C2201m0.f5363a;
            if (c2178k != null) {
                c2178k.setOrientation(m9441r);
            } else if (c2249q != null) {
                c2249q.f5481f = m9441r;
            }
            if (c2249q == null && c2178k == null) {
                C1169e.m11129c(C0552c.m12192b("Invalid ad session id sent with set orientation properties message: ", m9436w), 0, 0, true);
            } else if (context instanceof ActivityC2209n0) {
                ActivityC2209n0 activityC2209n0 = (ActivityC2209n0) context;
                if (c2178k == null) {
                    orientation = c2249q.f5481f;
                } else {
                    orientation = c2178k.getOrientation();
                }
                activityC2209n0.getClass();
                if (orientation != 0) {
                    if (orientation != 1) {
                        i = 4;
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
                activityC2209n0.setRequestedOrientation(i);
                activityC2209n0.f5377b = orientation;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$f */
    /* loaded from: classes.dex */
    public class C2338f implements InterfaceC2203m2 {
        public C2338f() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            String m9436w = c2367y1.m9439t("clickOverride").m9436w(ImagesContract.URL);
            String m9436w2 = c2367y1.m9436w("ad_session_id");
            C2145j1 m9692k = C2201m0.m9588d().m9692k();
            C2249q c2249q = m9692k.f5266c.get(m9436w2);
            C2178k c2178k = m9692k.f5269f.get(m9436w2);
            if (c2249q != null) {
                c2249q.f5485j = m9436w;
            } else if (c2178k != null) {
                c2178k.setClickOverride(m9436w);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$g */
    /* loaded from: classes.dex */
    public class RunnableC2339g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f5651a;

        public RunnableC2339g(String str) {
            this.f5651a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, "type", "open_hook");
            C2080d1.m9660h(c2367y1, "message", this.f5651a);
            new C2100e2(0, c2367y1, "CustomMessage.controller_send").m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.v5$h */
    /* loaded from: classes.dex */
    public class C2340h implements InterfaceC2203m2 {
        public C2340h() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2332v5.m9474f(c2100e2);
        }
    }

    /* renamed from: com.adcolony.sdk.v5$i */
    /* loaded from: classes.dex */
    public class C2341i implements InterfaceC2203m2 {
        public C2341i() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = c2100e2.f5098b;
            Intent intent = new Intent("android.intent.action.DIAL");
            Intent data = intent.setData(Uri.parse("tel:" + c2367y12.m9436w("phone_number")));
            String m9436w = c2367y12.m9436w("ad_session_id");
            if (C2232o6.m9554i(data, false)) {
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                c2100e2.m9641a(c2367y1).m9640b();
                C2332v5.m9476d(m9436w);
                C2332v5.m9478b(m9436w);
                C2332v5.m9477c(m9436w);
                return;
            }
            C2232o6.m9555h("Failed to dial number.");
            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.v5$j */
    /* loaded from: classes.dex */
    public class C2342j implements InterfaceC2203m2 {
        public C2342j() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            C2367y1 c2367y12 = new C2367y1();
            String m9436w = c2367y1.m9436w("ad_session_id");
            C2328v1 m9666b = C2080d1.m9666b(c2367y1, "recipients");
            String str = "";
            for (int i = 0; i < m9666b.m9484c(); i++) {
                if (i != 0) {
                    str = C0063d.m13053a(str, ";");
                }
                StringBuilder m12383b = C0499a.m12383b(str);
                m12383b.append(m9666b.m9480g(i));
                str = m12383b.toString();
            }
            if (C2232o6.m9554i(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", c2367y1.m9436w("body")), false)) {
                C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                c2100e2.m9641a(c2367y12).m9640b();
                C2332v5.m9476d(m9436w);
                C2332v5.m9478b(m9436w);
                C2332v5.m9477c(m9436w);
                return;
            }
            C2232o6.m9555h("Failed to create sms.");
            C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
            c2100e2.m9641a(c2367y12).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.v5$k */
    /* loaded from: classes.dex */
    public class C2343k implements InterfaceC2203m2 {
        public C2343k() {
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo9422a(com.adcolony.sdk.C2100e2 r11) {
            /*
                r10 = this;
                com.adcolony.sdk.v5 r0 = com.adcolony.sdk.C2332v5.this
                r0.getClass()
                android.content.Context r0 = com.adcolony.sdk.C2201m0.f5363a
                if (r0 != 0) goto Lb
                goto La5
            Lb:
                com.adcolony.sdk.y1 r1 = r11.f5098b
                java.lang.String r2 = "length_ms"
                r3 = 500(0x1f4, float:7.0E-43)
                int r1 = r1.m9458a(r2, r3)
                com.adcolony.sdk.y1 r2 = new com.adcolony.sdk.y1
                r2.<init>()
                java.util.concurrent.ThreadPoolExecutor r3 = com.adcolony.sdk.C2232o6.f5446a
                com.adcolony.sdk.v1 r3 = new com.adcolony.sdk.v1
                r3.<init>()
                r4 = 0
                android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch: java.lang.Exception -> L48
                java.lang.String r6 = r0.getPackageName()     // Catch: java.lang.Exception -> L48
                r7 = 4096(0x1000, float:5.74E-42)
                android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r7)     // Catch: java.lang.Exception -> L48
                java.lang.String[] r6 = r5.requestedPermissions     // Catch: java.lang.Exception -> L48
                if (r6 == 0) goto L48
                com.adcolony.sdk.v1 r6 = new com.adcolony.sdk.v1     // Catch: java.lang.Exception -> L48
                r6.<init>()     // Catch: java.lang.Exception -> L48
                r3 = r4
            L3a:
                java.lang.String[] r7 = r5.requestedPermissions     // Catch: java.lang.Exception -> L47
                int r8 = r7.length     // Catch: java.lang.Exception -> L47
                if (r3 >= r8) goto L47
                r7 = r7[r3]     // Catch: java.lang.Exception -> L47
                r6.m9483d(r7)     // Catch: java.lang.Exception -> L47
                int r3 = r3 + 1
                goto L3a
            L47:
                r3 = r6
            L48:
                r5 = r4
                r6 = r5
            L4a:
                int r7 = r3.m9484c()
                r8 = 1
                if (r5 >= r7) goto L61
                java.lang.String r7 = r3.m9480g(r5)
                java.lang.String r9 = "android.permission.VIBRATE"
                boolean r7 = r7.equals(r9)
                if (r7 == 0) goto L5e
                r6 = r8
            L5e:
                int r5 = r5 + 1
                goto L4a
            L61:
                java.lang.String r3 = "success"
                if (r6 != 0) goto L6b
                java.lang.String r0 = "No vibrate permission detected."
                androidx.datastore.preferences.protobuf.C1169e.m11129c(r0, r4, r8, r4)
                goto L9b
            L6b:
                int r5 = android.os.Build.VERSION.SDK_INT
                long r6 = (long) r1
                java.lang.String r1 = "vibrator"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L8f
                android.os.Vibrator r0 = (android.os.Vibrator) r0     // Catch: java.lang.Exception -> L8f
                if (r0 == 0) goto L94
                boolean r1 = r0.hasVibrator()     // Catch: java.lang.Exception -> L8f
                if (r1 == 0) goto L94
                r1 = 26
                if (r5 < r1) goto L8a
                android.os.VibrationEffect r1 = com.adcolony.sdk.C2199l6.m9595a(r6)     // Catch: java.lang.Exception -> L8f
                androidx.appcompat.widget.C0352h0.m12628b(r0, r1)     // Catch: java.lang.Exception -> L8f
                goto L8d
            L8a:
                r0.vibrate(r6)     // Catch: java.lang.Exception -> L8f
            L8d:
                r0 = r8
                goto L95
            L8f:
                java.lang.String r0 = "Vibrate command failed."
                androidx.datastore.preferences.protobuf.C1169e.m11129c(r0, r4, r8, r4)
            L94:
                r0 = r4
            L95:
                if (r0 == 0) goto L9b
                com.adcolony.sdk.C2080d1.m9656l(r2, r3, r8)
                goto L9e
            L9b:
                com.adcolony.sdk.C2080d1.m9656l(r2, r3, r4)
            L9e:
                com.adcolony.sdk.e2 r11 = r11.m9641a(r2)
                r11.m9640b()
            La5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2332v5.C2343k.mo9422a(com.adcolony.sdk.e2):void");
        }
    }

    /* renamed from: com.adcolony.sdk.v5$l */
    /* loaded from: classes.dex */
    public class C2344l implements InterfaceC2203m2 {
        public C2344l() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = c2100e2.f5098b;
            String m9436w = c2367y12.m9436w(ImagesContract.URL);
            String m9436w2 = c2367y12.m9436w("ad_session_id");
            C2178k c2178k = C2201m0.m9588d().m9692k().f5269f.get(m9436w2);
            if (c2178k == null || c2178k.getTrustedDemandSource() || c2178k.f5322n) {
                if (m9436w.startsWith("browser")) {
                    m9436w = m9436w.replaceFirst("browser", V2rayConfig.HTTP);
                }
                if (m9436w.startsWith("safari")) {
                    m9436w = m9436w.replaceFirst("safari", V2rayConfig.HTTP);
                }
                C2332v5.m9475e(m9436w);
                if (C2232o6.m9554i(new Intent("android.intent.action.VIEW", Uri.parse(m9436w)), false)) {
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y1).m9640b();
                    C2332v5.m9476d(m9436w2);
                    C2332v5.m9478b(m9436w2);
                    C2332v5.m9477c(m9436w2);
                    return;
                }
                C2232o6.m9555h("Failed to launch browser.");
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                c2100e2.m9641a(c2367y1).m9640b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$m */
    /* loaded from: classes.dex */
    public class C2345m implements InterfaceC2203m2 {
        public C2345m() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = c2100e2.f5098b;
            C2328v1 m9666b = C2080d1.m9666b(c2367y12, "recipients");
            boolean m9444o = c2367y12.m9444o("html");
            String m9436w = c2367y12.m9436w("subject");
            String m9436w2 = c2367y12.m9436w("body");
            String m9436w3 = c2367y12.m9436w("ad_session_id");
            String[] strArr = new String[m9666b.m9484c()];
            for (int i = 0; i < m9666b.m9484c(); i++) {
                strArr[i] = m9666b.m9480g(i);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (!m9444o) {
                intent.setType("plain/text");
            }
            intent.putExtra("android.intent.extra.SUBJECT", m9436w).putExtra("android.intent.extra.TEXT", m9436w2).putExtra("android.intent.extra.EMAIL", strArr);
            if (C2232o6.m9554i(intent, false)) {
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                c2100e2.m9641a(c2367y1).m9640b();
                C2332v5.m9476d(m9436w3);
                C2332v5.m9478b(m9436w3);
                C2332v5.m9477c(m9436w3);
                return;
            }
            C2232o6.m9555h("Failed to send email.");
            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.v5$n */
    /* loaded from: classes.dex */
    public class C2346n implements InterfaceC2203m2 {
        public C2346n() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = c2100e2.f5098b;
            String m9436w = c2367y12.m9436w("ad_session_id");
            if (c2367y12.m9444o("deep_link")) {
                C2332v5.m9474f(c2100e2);
                return;
            }
            Context context = C2201m0.f5363a;
            if (context != null) {
                if (C2232o6.m9554i(context.getPackageManager().getLaunchIntentForPackage(c2367y12.m9436w("handle")), false)) {
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y1).m9640b();
                    C2332v5.m9476d(m9436w);
                    C2332v5.m9478b(m9436w);
                    C2332v5.m9477c(m9436w);
                    return;
                }
                C2232o6.m9555h("Failed to launch external application.");
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                c2100e2.m9641a(c2367y1).m9640b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v5$o */
    /* loaded from: classes.dex */
    public class C2347o implements InterfaceC2203m2 {
        public C2347o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01de  */
        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo9422a(com.adcolony.sdk.C2100e2 r24) {
            /*
                Method dump skipped, instructions count: 507
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2332v5.C2347o.mo9422a(com.adcolony.sdk.e2):void");
        }
    }

    /* renamed from: com.adcolony.sdk.v5$p */
    /* loaded from: classes.dex */
    public class C2348p implements InterfaceC2203m2 {
        public C2348p() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2332v5.this.getClass();
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = c2100e2.f5098b;
            Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
            Intent putExtra = type.putExtra("android.intent.extra.TEXT", c2367y12.m9436w("text") + " " + c2367y12.m9436w(ImagesContract.URL));
            String m9436w = c2367y12.m9436w("ad_session_id");
            if (C2232o6.m9554i(putExtra, true)) {
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                c2100e2.m9641a(c2367y1).m9640b();
                C2332v5.m9476d(m9436w);
                C2332v5.m9478b(m9436w);
                C2332v5.m9477c(m9436w);
                return;
            }
            C2232o6.m9555h("Unable to create social post.");
            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: b */
    public static void m9478b(String str) {
        AbstractC2187l abstractC2187l;
        AbstractC2317u abstractC2317u;
        C2145j1 m9692k = C2201m0.m9588d().m9692k();
        C2249q c2249q = m9692k.f5266c.get(str);
        if (c2249q != null && (abstractC2317u = c2249q.f5476a) != null && c2249q.f5488m) {
            abstractC2317u.onClicked(c2249q);
            return;
        }
        C2178k c2178k = m9692k.f5269f.get(str);
        if (c2178k != null) {
            abstractC2187l = c2178k.getListener();
        } else {
            abstractC2187l = null;
        }
        if (c2178k != null && abstractC2187l != null && c2178k.f5322n) {
            abstractC2187l.onClicked(c2178k);
        }
    }

    /* renamed from: c */
    public static void m9477c(@NonNull String str) {
        if (C2201m0.m9588d().m9692k().f5269f.get(str) == null) {
            return;
        }
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, "ad_session_id", str);
        new C2100e2(1, c2367y1, "MRAID.on_event").m9640b();
    }

    /* renamed from: d */
    public static void m9476d(String str) {
        AbstractC2187l abstractC2187l;
        AbstractC2317u abstractC2317u;
        C2145j1 m9692k = C2201m0.m9588d().m9692k();
        C2249q c2249q = m9692k.f5266c.get(str);
        if (c2249q != null && (abstractC2317u = c2249q.f5476a) != null) {
            abstractC2317u.onLeftApplication(c2249q);
            return;
        }
        C2178k c2178k = m9692k.f5269f.get(str);
        if (c2178k != null) {
            abstractC2187l = c2178k.getListener();
        } else {
            abstractC2187l = null;
        }
        if (c2178k != null && abstractC2187l != null) {
            abstractC2187l.onLeftApplication(c2178k);
        }
    }

    /* renamed from: e */
    public static void m9475e(String str) {
        boolean z;
        try {
            C2232o6.f5446a.execute(new RunnableC2339g(str));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            C1169e.m11129c("Executing ADCSystem.sendOpenCustomMessage failed", 0, 0, true);
        }
    }

    /* renamed from: f */
    public static boolean m9474f(C2100e2 c2100e2) {
        C2367y1 c2367y1 = new C2367y1();
        C2367y1 c2367y12 = c2100e2.f5098b;
        String m9436w = c2367y12.m9436w("product_id");
        String m9436w2 = c2367y12.m9436w("ad_session_id");
        if (m9436w.equals("")) {
            m9436w = c2367y12.m9436w("handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(m9436w));
        m9475e(m9436w);
        if (C2232o6.m9554i(intent, false)) {
            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
            c2100e2.m9641a(c2367y1).m9640b();
            m9476d(m9436w2);
            m9478b(m9436w2);
            m9477c(m9436w2);
            return true;
        }
        C2232o6.m9555h("Unable to open.");
        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
        c2100e2.m9641a(c2367y1).m9640b();
        return false;
    }

    /* renamed from: a */
    public final void m9479a() {
        C2201m0.m9590b("System.open_store", new C2340h());
        C2201m0.m9590b("System.telephone", new C2341i());
        C2201m0.m9590b("System.sms", new C2342j());
        C2201m0.m9590b("System.vibrate", new C2343k());
        C2201m0.m9590b("System.open_browser", new C2344l());
        C2201m0.m9590b("System.mail", new C2345m());
        C2201m0.m9590b("System.launch_app", new C2346n());
        C2201m0.m9590b("System.create_calendar_event", new C2347o());
        C2201m0.m9590b("System.social_post", new C2348p());
        C2201m0.m9590b("System.make_in_app_purchase", new C2333a());
        C2201m0.m9590b("System.close", new C2334b());
        C2201m0.m9590b("System.expand", new C2335c());
        C2201m0.m9590b("System.use_custom_close", new C2336d());
        C2201m0.m9590b("System.set_orientation_properties", new C2337e());
        C2201m0.m9590b("System.click_override", new C2338f());
    }
}

package com.adcolony.sdk;

import android.os.Handler;
import androidx.constraintlayout.motion.widget.C0561g;
import androidx.datastore.preferences.protobuf.C1169e;
import com.iab.omid.library.adcolony.adsession.AbstractC8712b;
import com.iab.omid.library.adcolony.adsession.C8711a;
import com.iab.omid.library.adcolony.adsession.C8713c;
import com.iab.omid.library.adcolony.adsession.C8714d;
import com.iab.omid.library.adcolony.adsession.C8720j;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.adsession.EnumC8715e;
import com.iab.omid.library.adcolony.adsession.EnumC8716f;
import com.iab.omid.library.adcolony.adsession.EnumC8719i;
import com.iab.omid.library.adcolony.adsession.media.C8724b;
import com.iab.omid.library.adcolony.p040a.C8710b;
import com.iab.omid.library.adcolony.p041b.C8728a;
import com.iab.omid.library.adcolony.p041b.C8729b;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p041b.C8735g;
import com.iab.omid.library.adcolony.walking.C8751b;
import com.iab.omid.library.adcolony.walking.RunnableC8750a;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.g4 */
/* loaded from: classes.dex */
public final class C2120g4 {

    /* renamed from: a */
    public C8722l f5137a;

    /* renamed from: b */
    public C8711a f5138b;

    /* renamed from: c */
    public C8724b f5139c;

    /* renamed from: e */
    public final int f5141e;

    /* renamed from: g */
    public boolean f5143g;

    /* renamed from: h */
    public boolean f5144h;

    /* renamed from: i */
    public boolean f5145i;

    /* renamed from: j */
    public final boolean f5146j;

    /* renamed from: k */
    public boolean f5147k;

    /* renamed from: l */
    public final int f5148l;

    /* renamed from: m */
    public final int f5149m;

    /* renamed from: n */
    public final String f5150n;

    /* renamed from: o */
    public final String f5151o;

    /* renamed from: d */
    public final ArrayList f5140d = new ArrayList();

    /* renamed from: f */
    public String f5142f = "";

    /* renamed from: com.adcolony.sdk.g4$a */
    /* loaded from: classes.dex */
    public class RunnableC2121a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f5152a;

        public RunnableC2121a(String str) {
            this.f5152a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = new C2367y1();
            C2120g4 c2120g4 = C2120g4.this;
            C2080d1.m9657k(c2120g4.f5141e, c2367y12, "session_type");
            C2080d1.m9660h(c2367y12, "session_id", c2120g4.f5142f);
            C2080d1.m9660h(c2367y12, "event", this.f5152a);
            C2080d1.m9660h(c2367y1, "type", "iab_hook");
            C2080d1.m9660h(c2367y1, "message", c2367y12.toString());
            new C2100e2(0, c2367y1, "CustomMessage.controller_send").m9640b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2120g4(com.adcolony.sdk.C2367y1 r11, java.lang.String r12) {
        /*
            r10 = this;
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f5140d = r0
            r0 = -1
            r10.f5141e = r0
            java.lang.String r1 = ""
            r10.f5142f = r1
            r10.f5150n = r1
            r10.f5151o = r1
            java.lang.String r2 = "ad_unit_type"
            int r2 = r11.m9441r(r2)
            java.lang.String r3 = "ad_type"
            java.lang.String r3 = r11.m9436w(r3)
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L26
            goto L30
        L26:
            if (r2 != r4) goto L4d
            java.lang.String r2 = "video"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L32
        L30:
            r0 = r5
            goto L4d
        L32:
            java.lang.String r2 = "display"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3c
            r0 = r4
            goto L4d
        L3c:
            java.lang.String r2 = "banner_display"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            java.lang.String r2 = "interstitial_display"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4d
        L4c:
            r0 = 2
        L4d:
            r10.f5141e = r0
            java.lang.String r0 = "skippable"
            boolean r0 = r11.m9444o(r0)
            r10.f5146j = r0
            java.lang.String r0 = "skip_offset"
            int r0 = r11.m9441r(r0)
            r10.f5148l = r0
            java.lang.String r0 = "video_duration"
            int r0 = r11.m9441r(r0)
            r10.f5149m = r0
            java.lang.String r0 = "js_resources"
            com.adcolony.sdk.v1 r0 = com.adcolony.sdk.C2080d1.m9666b(r11, r0)
            java.lang.String r2 = "verification_params"
            com.adcolony.sdk.v1 r2 = com.adcolony.sdk.C2080d1.m9666b(r11, r2)
            java.lang.String r3 = "vendor_keys"
            com.adcolony.sdk.v1 r3 = com.adcolony.sdk.C2080d1.m9666b(r11, r3)
            r10.f5151o = r12
            r12 = r5
        L7c:
            int r6 = r0.m9484c()
            if (r12 >= r6) goto Lc3
            java.lang.String r6 = r2.m9480g(r12)     // Catch: java.net.MalformedURLException -> Lbb
            java.lang.String r7 = r3.m9480g(r12)     // Catch: java.net.MalformedURLException -> Lbb
            java.net.URL r8 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lbb
            java.lang.String r9 = r0.m9480g(r12)     // Catch: java.net.MalformedURLException -> Lbb
            r8.<init>(r9)     // Catch: java.net.MalformedURLException -> Lbb
            boolean r9 = r6.equals(r1)     // Catch: java.net.MalformedURLException -> Lbb
            if (r9 != 0) goto Laf
            boolean r9 = r7.equals(r1)     // Catch: java.net.MalformedURLException -> Lbb
            if (r9 != 0) goto Laf
            java.lang.String r9 = "VendorKey is null or empty"
            androidx.constraintlayout.motion.widget.C0561g.m12181b(r7, r9)     // Catch: java.net.MalformedURLException -> Lbb
            java.lang.String r9 = "VerificationParameters is null or empty"
            androidx.constraintlayout.motion.widget.C0561g.m12181b(r6, r9)     // Catch: java.net.MalformedURLException -> Lbb
            com.iab.omid.library.adcolony.adsession.k r9 = new com.iab.omid.library.adcolony.adsession.k     // Catch: java.net.MalformedURLException -> Lbb
            r9.<init>(r7, r8, r6)     // Catch: java.net.MalformedURLException -> Lbb
            goto Lb5
        Laf:
            com.iab.omid.library.adcolony.adsession.k r9 = new com.iab.omid.library.adcolony.adsession.k     // Catch: java.net.MalformedURLException -> Lbb
            r6 = 0
            r9.<init>(r6, r8, r6)     // Catch: java.net.MalformedURLException -> Lbb
        Lb5:
            java.util.ArrayList r6 = r10.f5140d     // Catch: java.net.MalformedURLException -> Lbb
            r6.add(r9)     // Catch: java.net.MalformedURLException -> Lbb
            goto Lc0
        Lbb:
            java.lang.String r6 = "Invalid js resource url passed to Omid"
            androidx.datastore.preferences.protobuf.C1169e.m11129c(r6, r5, r5, r4)
        Lc0:
            int r12 = r12 + 1
            goto L7c
        Lc3:
            com.adcolony.sdk.b3 r12 = com.adcolony.sdk.C2201m0.m9588d()     // Catch: java.io.IOException -> Ldf
            com.adcolony.sdk.t5 r12 = r12.m9690m()     // Catch: java.io.IOException -> Ldf
            java.lang.String r0 = "filepath"
            java.lang.String r11 = r11.m9436w(r0)     // Catch: java.io.IOException -> Ldf
            r12.getClass()     // Catch: java.io.IOException -> Ldf
            java.lang.StringBuilder r11 = com.adcolony.sdk.C2298t5.m9498a(r11, r4)     // Catch: java.io.IOException -> Ldf
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> Ldf
            r10.f5150n = r11     // Catch: java.io.IOException -> Ldf
            goto Le4
        Ldf:
            java.lang.String r11 = "Error loading IAB JS Client"
            androidx.datastore.preferences.protobuf.C1169e.m11129c(r11, r5, r5, r4)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2120g4.<init>(com.adcolony.sdk.y1, java.lang.String):void");
    }

    /* renamed from: a */
    public final void m9626a(C2218o0 c2218o0) throws IllegalArgumentException {
        String str;
        ArrayList arrayList;
        C8714d m3192a;
        C8713c m3193a;
        int i = this.f5141e;
        if (i >= 0 && (str = this.f5150n) != null && !str.equals("") && (arrayList = this.f5140d) != null) {
            if (!arrayList.isEmpty() || i == 2) {
                C2058b3 m9588d = C2201m0.m9588d();
                EnumC8719i enumC8719i = EnumC8719i.NATIVE;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            EnumC8716f enumC8716f = EnumC8716f.HTML_DISPLAY;
                            C8720j c8720j = m9588d.f4973O;
                            C0561g.m12182a(c8720j, "Partner is null");
                            C0561g.m12182a(c2218o0, "WebView is null");
                            C8722l m3194b = AbstractC8712b.m3194b(C8713c.m3193a(enumC8716f, null), new C8714d(c8720j, c2218o0, null, null, "", EnumC8715e.HTML));
                            this.f5137a = m3194b;
                            this.f5142f = m3194b.f16576h;
                            return;
                        }
                        return;
                    }
                    EnumC8716f enumC8716f2 = EnumC8716f.NATIVE_DISPLAY;
                    m3192a = C8714d.m3192a(m9588d.f4973O, str, arrayList);
                    m3193a = C8713c.m3193a(enumC8716f2, null);
                } else {
                    EnumC8716f enumC8716f3 = EnumC8716f.VIDEO;
                    m3192a = C8714d.m3192a(m9588d.f4973O, str, arrayList);
                    m3193a = C8713c.m3193a(enumC8716f3, enumC8719i);
                }
                C8722l m3194b2 = AbstractC8712b.m3194b(m3193a, m3192a);
                this.f5137a = m3194b2;
                this.f5142f = m3194b2.f16576h;
                m9622e("inject_javascript");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9625b(com.adcolony.sdk.C2135i1 r9) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2120g4.m9625b(com.adcolony.sdk.i1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public final void m9624c(String str, float f) {
        char c;
        if (C2201m0.m9587e() && this.f5137a != null) {
            if (this.f5139c == null && !str.equals("start") && !str.equals("skip") && !str.equals("continue") && !str.equals("cancel")) {
                return;
            }
            try {
                switch (str.hashCode()) {
                    case -1941887438:
                        if (str.equals("first_quartile")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1710060637:
                        if (str.equals("buffer_start")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1638835128:
                        if (str.equals("midpoint")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1367724422:
                        if (str.equals("cancel")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -934426579:
                        if (str.equals("resume")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -651914917:
                        if (str.equals("third_quartile")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -599445191:
                        if (str.equals("complete")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -567202649:
                        if (str.equals("continue")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -342650039:
                        if (str.equals("sound_mute")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3532159:
                        if (str.equals("skip")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 583742045:
                        if (str.equals("in_video_engagement")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 823102269:
                        if (str.equals("html5_interaction")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1648173410:
                        if (str.equals("sound_unmute")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1906584668:
                        if (str.equals("buffer_end")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.f5138b.m3195a();
                        C8724b c8724b = this.f5139c;
                        if (c8724b != null) {
                            if (f <= 0.0f) {
                                f = this.f5149m;
                            }
                            c8724b.m3186b(f);
                        }
                        m9622e(str);
                        return;
                    case 1:
                        C8722l c8722l = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l);
                        c8722l.f16573e.m3170d("firstQuartile");
                        m9622e(str);
                        return;
                    case 2:
                        C8722l c8722l2 = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l2);
                        c8722l2.f16573e.m3170d("midpoint");
                        m9622e(str);
                        return;
                    case 3:
                        C8722l c8722l3 = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l3);
                        c8722l3.f16573e.m3170d("thirdQuartile");
                        m9622e(str);
                        return;
                    case 4:
                        this.f5147k = true;
                        C8722l c8722l4 = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l4);
                        c8722l4.f16573e.m3170d("complete");
                        m9622e(str);
                        return;
                    case 5:
                        m9622e(str);
                        m9623d();
                        return;
                    case 6:
                    case 7:
                        C8724b c8724b2 = this.f5139c;
                        if (c8724b2 != null) {
                            C8722l c8722l5 = c8724b2.f16582a;
                            C0561g.m12179d(c8722l5);
                            c8722l5.f16573e.m3170d("skipped");
                        }
                        m9622e(str);
                        m9623d();
                        return;
                    case '\b':
                        this.f5139c.m3185c(0.0f);
                        m9622e(str);
                        return;
                    case '\t':
                        this.f5139c.m3185c(1.0f);
                        m9622e(str);
                        return;
                    case '\n':
                        if (!this.f5143g && !this.f5144h && !this.f5147k) {
                            C8722l c8722l6 = this.f5139c.f16582a;
                            C0561g.m12179d(c8722l6);
                            c8722l6.f16573e.m3170d("pause");
                            m9622e(str);
                            this.f5143g = true;
                            this.f5144h = false;
                            return;
                        }
                        return;
                    case 11:
                        if (this.f5143g && !this.f5147k) {
                            C8722l c8722l7 = this.f5139c.f16582a;
                            C0561g.m12179d(c8722l7);
                            c8722l7.f16573e.m3170d("resume");
                            m9622e(str);
                            this.f5143g = false;
                            return;
                        }
                        return;
                    case '\f':
                        C8722l c8722l8 = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l8);
                        c8722l8.f16573e.m3170d("bufferStart");
                        m9622e(str);
                        return;
                    case '\r':
                        C8722l c8722l9 = this.f5139c.f16582a;
                        C0561g.m12179d(c8722l9);
                        c8722l9.f16573e.m3170d("bufferFinish");
                        m9622e(str);
                        return;
                    case 14:
                    case 15:
                        this.f5139c.m3187a();
                        m9622e(str);
                        if (this.f5144h && !this.f5143g && !this.f5147k) {
                            C8722l c8722l10 = this.f5139c.f16582a;
                            C0561g.m12179d(c8722l10);
                            c8722l10.f16573e.m3170d("pause");
                            m9622e("pause");
                            this.f5143g = true;
                            this.f5144h = false;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                StringBuilder sb = new StringBuilder("Recording IAB event for ");
                sb.append(str);
                sb.append(" caused " + e.getClass());
                C1169e.m11129c(sb.toString(), 0, 1, true);
            }
        }
    }

    /* renamed from: d */
    public final void m9623d() {
        boolean z;
        ExecutorService executorService = C2074d.f5043a;
        boolean z2 = true;
        if (!C2201m0.f5365c) {
            C1169e.m11129c("Ignoring call to AdColony.removeCustomMessageListener as AdColony has not yet been configured.", 0, 1, false);
        } else {
            C2201m0.m9588d().f4999q.remove("viewability_ad_event");
        }
        C8722l c8722l = this.f5137a;
        if (!c8722l.f16575g) {
            c8722l.f16572d.clear();
            if (!c8722l.f16575g) {
                c8722l.f16571c.clear();
            }
            c8722l.f16575g = true;
            C8734f.m3182a(c8722l.f16573e.m3169f(), "finishSession", new Object[0]);
            C8728a c8728a = C8728a.f16591c;
            if (c8728a.f16593b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            c8728a.f16592a.remove(c8722l);
            ArrayList<C8722l> arrayList = c8728a.f16593b;
            arrayList.remove(c8722l);
            if (z) {
                if (arrayList.size() <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    C8735g m3181a = C8735g.m3181a();
                    m3181a.getClass();
                    C8751b c8751b = C8751b.f16637h;
                    c8751b.getClass();
                    Handler handler = C8751b.f16639j;
                    if (handler != null) {
                        handler.removeCallbacks(C8751b.f16641l);
                        C8751b.f16639j = null;
                    }
                    c8751b.f16642a.clear();
                    C8751b.f16638i.post(new RunnableC8750a(c8751b));
                    C8729b c8729b = C8729b.f16594d;
                    c8729b.f16595a = false;
                    c8729b.f16596b = false;
                    c8729b.f16597c = null;
                    C8710b c8710b = m3181a.f16610d;
                    c8710b.f16523a.getContentResolver().unregisterContentObserver(c8710b);
                }
            }
            c8722l.f16573e.mo3166e();
            c8722l.f16573e = null;
        }
        m9622e("end_session");
        this.f5137a = null;
    }

    /* renamed from: e */
    public final void m9622e(String str) {
        boolean z;
        try {
            C2232o6.f5446a.execute(new RunnableC2121a(str));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            C1169e.m11129c("Executing ADCOmidManager.sendIabCustomMessage failed", 0, 0, true);
        }
    }
}

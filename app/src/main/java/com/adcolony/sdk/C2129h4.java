package com.adcolony.sdk;

import java.math.BigDecimal;

/* renamed from: com.adcolony.sdk.h4 */
/* loaded from: classes.dex */
public final class C2129h4 implements InterfaceC2217o {

    /* renamed from: a */
    public final /* synthetic */ C2120g4 f5168a;

    /* renamed from: com.adcolony.sdk.h4$a */
    /* loaded from: classes.dex */
    public class RunnableC2130a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f5169a;

        /* renamed from: b */
        public final /* synthetic */ String f5170b;

        /* renamed from: c */
        public final /* synthetic */ float f5171c;

        public RunnableC2130a(String str, String str2, float f) {
            this.f5169a = str;
            this.f5170b = str2;
            this.f5171c = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2120g4 c2120g4;
            C2129h4 c2129h4 = C2129h4.this;
            String str = c2129h4.f5168a.f5151o;
            String str2 = this.f5169a;
            boolean equals = str2.equals(str);
            float f = this.f5171c;
            String str3 = this.f5170b;
            if (equals) {
                c2120g4 = c2129h4.f5168a;
            } else {
                C2178k c2178k = C2201m0.m9588d().m9692k().f5269f.get(str2);
                if (c2178k != null) {
                    c2120g4 = c2178k.getOmidManager();
                } else {
                    c2120g4 = null;
                }
                if (c2120g4 == null) {
                    return;
                }
            }
            c2120g4.m9624c(str3, f);
        }
    }

    public C2129h4(C2120g4 c2120g4) {
        this.f5168a = c2120g4;
    }

    @Override // com.adcolony.sdk.InterfaceC2217o
    /* renamed from: a */
    public final void mo9579a(C2208n c2208n) {
        double optDouble;
        C2367y1 m9665c = C2080d1.m9665c(c2208n.f5375a, null);
        String m9436w = m9665c.m9436w("event_type");
        synchronized (m9665c.f5690a) {
            optDouble = m9665c.f5690a.optDouble("duration", 0.0d);
        }
        float floatValue = BigDecimal.valueOf(optDouble).floatValue();
        boolean m9444o = m9665c.m9444o("replay");
        boolean equals = m9665c.m9436w("skip_type").equals("dec");
        String m9436w2 = m9665c.m9436w("asi");
        if (m9436w.equals("skip") && equals) {
            this.f5168a.f5147k = true;
        } else if (!m9444o || (!m9436w.equals("start") && !m9436w.equals("first_quartile") && !m9436w.equals("midpoint") && !m9436w.equals("third_quartile") && !m9436w.equals("complete"))) {
            C2232o6.m9548o(new RunnableC2130a(m9436w2, m9436w, floatValue));
        }
    }
}

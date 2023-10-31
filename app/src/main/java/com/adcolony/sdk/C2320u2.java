package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.u2 */
/* loaded from: classes.dex */
public final class C2320u2 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5625a;

    /* renamed from: com.adcolony.sdk.u2$a */
    /* loaded from: classes.dex */
    public class C2321a implements InterfaceC2356w5<C2061b4> {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5626a;

        public C2321a(C2100e2 c2100e2) {
            this.f5626a = c2100e2;
        }

        @Override // com.adcolony.sdk.InterfaceC2356w5
        /* renamed from: a */
        public final void mo9462a(C2061b4 c2061b4) {
            C2061b4 c2061b42 = c2061b4;
            C2367y1 c2367y1 = new C2367y1();
            if (c2061b42 != null) {
                C2080d1.m9661g(c2367y1, "odt", c2061b42.m9684a());
            }
            this.f5626a.m9641a(c2367y1).m9640b();
        }
    }

    public C2320u2(C2058b3 c2058b3) {
        this.f5625a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2058b3 c2058b3 = this.f5625a;
        if (c2058b3.f4977S) {
            C2110f4.m9634c().m9635b(new C2321a(c2100e2), c2058b3.f4976R);
            return;
        }
        C2061b4 c2061b4 = C2110f4.m9634c().f5112c;
        C2367y1 c2367y1 = new C2367y1();
        if (c2061b4 != null) {
            C2080d1.m9661g(c2367y1, "odt", c2061b4.m9684a());
        }
        c2100e2.m9641a(c2367y1).m9640b();
    }
}

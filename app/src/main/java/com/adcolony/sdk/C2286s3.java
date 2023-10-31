package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.s3 */
/* loaded from: classes.dex */
public final class C2286s3 implements InterfaceC2203m2 {

    /* renamed from: com.adcolony.sdk.s3$a */
    /* loaded from: classes.dex */
    public class RunnableC2287a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f5558a;

        /* renamed from: b */
        public final /* synthetic */ String f5559b;

        public RunnableC2287a(String str, String str2) {
            this.f5558a = str;
            this.f5559b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f5558a;
            try {
                InterfaceC2217o interfaceC2217o = C2201m0.m9588d().f4999q.get(str);
                if (interfaceC2217o != null) {
                    interfaceC2217o.mo9579a(new C2208n(str, this.f5559b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public C2286s3() {
        C2201m0.m9590b("CustomMessage.controller_send", this);
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        C2232o6.m9548o(new RunnableC2287a(c2367y1.m9436w("type"), c2367y1.m9436w("message")));
    }
}

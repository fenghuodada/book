package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.b8 */
/* loaded from: assets/audience_network.dex */
public final class C6149b8 implements InterfaceC42876E {
    public EnumC43316w A00;
    public C43557K A01;
    public RunnableC43567L A02;
    public final C42856C A03;
    public final C43166h A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C6149b8(C42856C c42856c, C43166h c43166h) {
        this.A03 = c42856c;
        this.A04 = c43166h;
    }

    private final synchronized void A04() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C43517G.A00().A04();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.7L] */
    public final synchronized void A05(final EnumC43316w enumC43316w) {
        if (this.A05.get() || enumC43316w == null) {
            return;
        }
        if (this.A03.A0k() && C43547J.A0E(enumC43316w)) {
            this.A01 = new C43557K(C43517G.A00().A03().getLooper());
            this.A00 = enumC43316w;
            final Runnable runnable = new Runnable(enumC43316w) { // from class: com.facebook.ads.redexgen.X.6G
                public EnumC43316w A00;

                {
                    this.A00 = enumC43316w;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C43166h c43166h;
                    C43557K c43557k;
                    RunnableC43567L runnableC43567L;
                    C42856C c42856c;
                    if (C5158L0.A02(this)) {
                        return;
                    }
                    try {
                        c43166h = C6149b8.this.A04;
                        c43166h.A04(EnumC43336y.A03, this.A00, null);
                        c43557k = C6149b8.this.A01;
                        runnableC43567L = C6149b8.this.A02;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        c42856c = C6149b8.this.A03;
                        c43557k.A02(runnableC43567L, timeUnit.toMillis(c42856c.A0T()));
                    } catch (Throwable th) {
                        C5158L0.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.7L
                public final Runnable A00;

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() {
                    if (C5158L0.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t) {
                        try {
                            C42976O.A03(t);
                        } catch (Throwable t2) {
                            C5158L0.A00(t2, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC43316w);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42876E
    public final synchronized void AFL(EnumC43316w enumC43316w) {
        if (this.A00 == enumC43316w) {
            return;
        }
        this.A00 = enumC43316w;
        if (enumC43316w == EnumC43316w.A04) {
            A04();
        } else {
            A05(enumC43316w);
        }
    }
}

package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6i */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC43176i {
    public final Context A00;
    public final C42856C A01;

    public AbstractC43176i(Context context, C42856C c42856c) {
        this.A00 = context;
        this.A01 = c42856c;
    }

    private int A00(C42856C c42856c, C43276s c43276s) {
        if (c42856c.A0e(c43276s.A00()) != null) {
            return c42856c.A0e(c43276s.A00()).intValue();
        }
        if (c43276s.A03().contains(EnumC43346z.A0B)) {
            return c42856c.A0S();
        }
        if (c43276s.A03().contains(EnumC43346z.A08)) {
            return c42856c.A0R();
        }
        return c42856c.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A01(EnumC43316w enumC43316w, List<C43276s> list) {
        AbstractC43457A A5J;
        AbstractC43457A abstractC43457A;
        Map<Integer, C42906H<AbstractC43457A>> A03 = C43326x.A01().A03();
        for (C43276s c43276s : list) {
            InterfaceC43306v signalExecutor = c43276s.A02(enumC43316w);
            if (signalExecutor != null && (A5J = signalExecutor.A5J()) != null && A5J.A07() != null) {
                if (c43276s.A03().contains(EnumC43346z.A0B) && A03.containsKey(Integer.valueOf(c43276s.A00()))) {
                    C42906H<AbstractC43457A> c42906h = A03.get(Integer.valueOf(c43276s.A00()));
                    if (c42906h != null) {
                        abstractC43457A = c42906h.A02();
                    } else {
                        abstractC43457A = null;
                    }
                    if (c42906h == null) {
                        c42906h = new C42906H<>(A00(this.A01, c43276s));
                    }
                    if (abstractC43457A == null || !A5J.A0B(abstractC43457A, c43276s.A03())) {
                        c42906h.A04(A5J);
                        C43326x.A01().A04(c43276s.A00(), c42906h, A5J.A05());
                    }
                } else {
                    C42906H<AbstractC43457A> c42906h2 = new C42906H<>(A00(this.A01, c43276s));
                    c42906h2.A04(A5J);
                    C43326x.A01().A04(c43276s.A00(), c42906h2, A5J.A05());
                }
            }
        }
    }
}

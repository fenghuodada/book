package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6W */
/* loaded from: assets/audience_network.dex */
public final class C43056W {
    public final C42856C A00;
    public final Map<Integer, C43276s> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C43056W(C42856C c42856c, Map<Integer, C43276s> map) {
        this.A00 = c42856c;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i) {
        if (this.A00.A0e(i) != null) {
            return this.A00.A0e(i).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(AbstractC43457A abstractC43457A, C43276s c43276s) {
        int A00 = c43276s.A00();
        Map<Integer, C42906H<AbstractC43457A>> A03 = C43326x.A01().A03();
        if (A03.containsKey(Integer.valueOf(A00))) {
            C42906H<AbstractC43457A> c42906h = A03.get(Integer.valueOf(A00));
            AbstractC43457A A02 = c42906h != null ? c42906h.A02() : null;
            if (c42906h == null) {
                c42906h = new C42906H<>(A00(A00));
            }
            if (!abstractC43457A.A0B(A02, c43276s.A03())) {
                c42906h.A04(abstractC43457A);
                C43326x.A01().A04(A00, c42906h, abstractC43457A.A05());
            }
        } else {
            C42906H<AbstractC43457A> c42906h2 = new C42906H<>(A00(A00));
            c42906h2.A04(abstractC43457A);
            C43326x.A01().A04(A00, c42906h2, abstractC43457A.A05());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(AbstractC43457A abstractC43457A, EnumC43046V enumC43046V) {
        if (!this.A02.get()) {
            return;
        }
        try {
            switch (enumC43046V) {
                case A0E:
                    C43276s c43276s = this.A01.get(10800);
                    if (abstractC43457A != null && c43276s != null) {
                        A01(abstractC43457A, c43276s);
                        break;
                    } else {
                        return;
                    }
                case A03:
                    C43276s c43276s2 = this.A01.get(10810);
                    if (abstractC43457A != null && c43276s2 != null) {
                        A01(abstractC43457A, c43276s2);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A09:
                    C43276s c43276s3 = this.A01.get(10812);
                    if (abstractC43457A != null && c43276s3 != null) {
                        A01(abstractC43457A, c43276s3);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A06:
                    C43276s c43276s4 = this.A01.get(10813);
                    if (abstractC43457A != null && c43276s4 != null) {
                        A01(abstractC43457A, c43276s4);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0A:
                    C43276s c43276s5 = this.A01.get(10814);
                    if (abstractC43457A != null && c43276s5 != null) {
                        A01(abstractC43457A, c43276s5);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0B:
                    C43276s c43276s6 = this.A01.get(10815);
                    if (abstractC43457A != null && c43276s6 != null) {
                        A01(abstractC43457A, c43276s6);
                        break;
                    } else {
                        return;
                    }
                case A0D:
                    C43276s c43276s7 = this.A01.get(10816);
                    if (abstractC43457A != null && c43276s7 != null) {
                        A01(abstractC43457A, c43276s7);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A08:
                    C43276s c43276s8 = this.A01.get(10817);
                    if (abstractC43457A != null && c43276s8 != null) {
                        A01(abstractC43457A, c43276s8);
                        break;
                    } else {
                        return;
                    }
                case A05:
                    C43276s c43276s9 = this.A01.get(10818);
                    if (abstractC43457A != null && c43276s9 != null) {
                        A01(abstractC43457A, c43276s9);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A04:
                    C43276s c43276s10 = this.A01.get(10819);
                    if (abstractC43457A != null && c43276s10 != null) {
                        A01(abstractC43457A, c43276s10);
                        break;
                    } else {
                        return;
                    }
                case A0C:
                    C43276s c43276s11 = this.A01.get(10820);
                    if (abstractC43457A != null && c43276s11 != null) {
                        A01(abstractC43457A, c43276s11);
                        break;
                    } else {
                        return;
                    }
                    break;
            }
        } catch (Throwable th) {
            C42976O.A03(th);
        }
    }
}

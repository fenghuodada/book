package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6S */
/* loaded from: assets/audience_network.dex */
public final class C43016S {
    @Nullable
    public static C43016S A07;
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public HandlerC43006R A00 = new HandlerC43006R(this, C43517G.A00().A03().getLooper());
    public C43106b A01;
    public C43116c A02;
    public List<EnumC43146f> A03;
    public final Context A04;
    public final C42856C A05;
    public final EnumC43346z A06;

    public C43016S(C42856C c42856c, Context context) {
        this.A05 = c42856c;
        this.A04 = context;
        this.A06 = c42856c.A0a();
    }

    public static synchronized C43016S A00(Context context, C42856C c42856c) {
        C43016S c43016s;
        synchronized (C43016S.class) {
            if (A07 == null) {
                A07 = new C43016S(c42856c, context);
            }
            c43016s = A07;
        }
        return c43016s;
    }

    private synchronized void A02() {
        A08.set(false);
        this.A03 = new ArrayList();
    }

    public final synchronized void A03() {
        if (this.A01 != null) {
            this.A01.A03(this.A03);
        }
        A02();
    }

    public final synchronized void A04(Map<Integer, C43276s> map, EnumC43316w enumC43316w) {
        A02();
        C43056W c43056w = new C43056W(this.A05, map);
        for (Map.Entry<Integer, C43276s> entry : map.entrySet()) {
            C43276s value = entry.getValue();
            if (value != null && value.A04(enumC43316w)) {
                int intValue = entry.getKey().intValue();
                if (intValue != 10800) {
                    switch (intValue) {
                        case 10810:
                            this.A03.add(EnumC43146f.A04);
                            continue;
                        case 10811:
                            this.A03.add(EnumC43146f.A08);
                            continue;
                        case 10812:
                            this.A03.add(EnumC43146f.A0A);
                            continue;
                        case 10813:
                            this.A03.add(EnumC43146f.A07);
                            continue;
                        case 10814:
                            this.A03.add(EnumC43146f.A0B);
                            continue;
                        case 10815:
                            this.A03.add(EnumC43146f.A0C);
                            continue;
                        case 10816:
                            this.A03.add(EnumC43146f.A0E);
                            continue;
                        case 10817:
                            this.A03.add(EnumC43146f.A09);
                            continue;
                        case 10818:
                            this.A03.add(EnumC43146f.A06);
                            continue;
                        case 10819:
                            this.A03.add(EnumC43146f.A05);
                            continue;
                        case 10820:
                            this.A03.add(EnumC43146f.A0D);
                            continue;
                        default:
                            continue;
                    }
                } else {
                    this.A02 = new C43116c(this.A04, c43056w, this.A06);
                    A08.set(true);
                }
            }
        }
        this.A01 = new C43106b(this.A04, c43056w, this.A06);
        this.A01.A02(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new HandlerC43006R(this, C43517G.A00().A03().getLooper());
        }
    }

    public final synchronized boolean A05(MotionEvent motionEvent) {
        if (!A08.get()) {
            return false;
        }
        Message message = new Message();
        message.what = EnumC42996Q.A03.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}

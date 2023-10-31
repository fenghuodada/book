package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dS */
/* loaded from: assets/audience_network.dex */
public final class C6290dS extends AbstractC39560p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C6290dS.class.getSimpleName();
    public C6292dU A00;
    public boolean A01;
    public final C5953Xy A02;
    public final InterfaceC5080Jh A03;
    public final AbstractC5346O6 A04;

    public C6290dS(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, AbstractC5346O6 abstractC5346O6, C5521Qw c5521Qw, AbstractC39570q abstractC39570q) {
        super(c5953Xy, abstractC39570q, c5521Qw);
        this.A03 = interfaceC5080Jh;
        this.A04 = abstractC5346O6;
        this.A02 = c5953Xy;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39560p
    public final void A06(Map<String, String> map) {
        C6292dU c6292dU = this.A00;
        if (c6292dU != null && !TextUtils.isEmpty(c6292dU.A65())) {
            this.A02.A0D().A2Y();
            C403829.A00(this.A00.A05());
            InterfaceC5080Jh interfaceC5080Jh = this.A03;
            String A65 = this.A00.A65();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC5080Jh.A93(A65, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC5239MM.A00(new C6291dT(this));
            }
        }
    }

    public final void A08(C6292dU c6292dU) {
        this.A00 = c6292dU;
    }
}

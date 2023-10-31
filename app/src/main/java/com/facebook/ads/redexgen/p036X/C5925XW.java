package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* renamed from: com.facebook.ads.redexgen.X.XW */
/* loaded from: assets/audience_network.dex */
public final class C5925XW implements InterfaceC44168W {
    public static C5925XW A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    @Nullable
    public InterfaceC39360U A00;
    @Nullable
    public InterfaceC44158V A01;
    @Nullable
    public InterfaceC44318l A02;
    @Nullable
    public C44709P A03;
    @Nullable
    public InterfaceC5092Jt A04;
    @Nullable
    public InterfaceC4885GU A05;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.p036X.C5925XW.A07
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5925XW.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5925XW.A08
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5925XW.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5925XW.A08
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5925XW.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A07 = new byte[]{-57, -64, -10, -56, -56, -64, -59, -63, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC42585k A00(C5952Xx c5952Xx, @Nullable InterfaceC4885GU interfaceC4885GU) {
        if (!C5064JR.A1B(c5952Xx) || interfaceC4885GU == null) {
            return null;
        }
        return AbstractC42595l.A00().A01(interfaceC4885GU);
    }

    public static InterfaceC44318l A01(C5952Xx c5952Xx) {
        return AbstractC44328m.A00().A01(c5952Xx, new C5932Xd());
    }

    public static synchronized C5925XW A02() {
        C5925XW c5925xw;
        synchronized (C5925XW.class) {
            if (A06 == null) {
                A06 = new C5925XW();
            }
            c5925xw = A06;
        }
        return c5925xw;
    }

    @Nullable
    public static InterfaceC5527R2 A03(C5952Xx c5952Xx) {
        if (!C5064JR.A17(c5952Xx)) {
            return null;
        }
        return C5545RK.A01(c5952Xx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    @Nullable
    /* renamed from: A04 */
    public final synchronized InterfaceC4885GU A7d() {
        return this.A05;
    }

    @Nullable
    public static InterfaceC4885GU A05(C5952Xx c5952Xx, InterfaceC44318l interfaceC44318l, @Nullable InterfaceC5527R2 interfaceC5527R2) {
        if (!C5064JR.A1u(c5952Xx) || interfaceC5527R2 == null) {
            return null;
        }
        return AbstractC5568Rh.A00().A01(c5952Xx, interfaceC44318l, interfaceC5527R2, C5147Ko.A04(c5952Xx), new C5926XX(new C5140Kh(c5952Xx, A06(0, 0, 122), null, EnumC5119KM.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c5952Xx), AdSettings.isMixedAudience(), new C5124KR(), C5227MA.A01(C5064JR.A0H(c5952Xx)), null, null), c5952Xx), C5566Rf.A00().A00());
    }

    public static void A08() {
        String A062 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        C5128KV.A05(A062, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C5952Xx c5952Xx, @Nullable InterfaceC42585k interfaceC42585k) {
        if (!C5064JR.A1B(c5952Xx) || interfaceC42585k == null) {
            return;
        }
        AbstractC42565i.A00().A01(interfaceC42585k, c5952Xx);
    }

    public static void A0A(C5952Xx c5952Xx, @Nullable InterfaceC4885GU interfaceC4885GU) {
        if (!C5064JR.A0h(c5952Xx) || interfaceC4885GU == null) {
            return;
        }
        new C427865(c5952Xx, interfaceC4885GU, new C427966(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C5952Xx c5952Xx, @Nullable InterfaceC4885GU interfaceC4885GU) {
        if (interfaceC4885GU == null) {
            return;
        }
        C5067JU.A00(c5952Xx, interfaceC4885GU);
    }

    public final synchronized void A0C(C5952Xx c5952Xx) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c5952Xx);
        this.A05 = A05(c5952Xx, this.A02, A03(c5952Xx));
        A09(c5952Xx, A00(c5952Xx, this.A05));
        A0A(c5952Xx, this.A05);
        A0B(c5952Xx, this.A05);
        if (this.A05 != null) {
            this.A05.A5U();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final InterfaceC5080Jh A5c(C5952Xx c5952Xx) {
        return C5743UX.A01(c5952Xx);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC44158V A5q(C44148U c44148u) {
        if (this.A01 == null) {
            this.A01 = new C5927XY(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC44318l A6L(C44148U c44148u) {
        if (this.A02 == null) {
            this.A02 = A01(c44148u.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC44448y A6M(C44148U c44148u) {
        return new C5941Xm(c44148u);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC44178X A6V(C44148U c44148u) {
        return new C4756EL(this, c44148u);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    @Nullable
    public final synchronized InterfaceC39360U A6i(C44148U c44148u) {
        if (!C5064JR.A0s(c44148u)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC39370V.A00().A01(new C5930Xb(c44148u));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC44198Z A7L(C44148U c44148u) {
        return new C5928XZ(c44148u);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final C5952Xx A7M(Context context) {
        C5952Xx A00 = C44138T.A00();
        if (A00 == null) {
            C5952Xx c5952Xx = new C5952Xx(context, this);
            C44138T.A01(c5952Xx);
            return c5952Xx;
        }
        return A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized InterfaceC5092Jt A7N(C5952Xx c5952Xx) {
        if (this.A04 == null) {
            this.A04 = new C5750Ue(c5952Xx);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44168W
    public final synchronized C44709P A7T() {
        if (this.A03 == null) {
            this.A03 = new C44709P();
            A08();
        }
        return this.A03;
    }
}

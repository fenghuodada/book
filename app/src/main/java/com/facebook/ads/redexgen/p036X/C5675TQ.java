package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TQ */
/* loaded from: assets/audience_network.dex */
public class C5675TQ implements InterfaceC5201Lk {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ C5673TO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public C5675TQ(C5673TO c5673to) {
        this.A00 = c5673to;
    }

    public /* synthetic */ C5675TQ(C5673TO c5673to, C5680TV c5680tv) {
        this(c5673to);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AAN() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.X.Mp r3 = r0.A0V
            r2 = 0
            r1 = 0
            r0 = 7
            java.lang.String r0 = A00(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.p036X.C5673TO.A0S(r0)
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.p036X.C5673TO.A0b(r0)
            r3 = 0
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.p036X.C5673TO.A0g(r0)
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.X.Mp r1 = r0.A0V
            r0 = 1
            r1.setToolbarActionMode(r0)
        L2c:
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            boolean r4 = com.facebook.ads.redexgen.p036X.C5673TO.A0f(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C5675TQ.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L4c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.X.Mp r0 = r0.A0V
            r0.setToolbarActionMode(r3)
            goto L2c
        L4c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5675TQ.A02
            java.lang.String r1 = "RNuzR8"
            r0 = 4
            r2[r0] = r1
            if (r4 != 0) goto L6d
            com.facebook.ads.redexgen.X.TO r1 = r5.A00
            r0 = 500(0x1f4, float:7.0E-43)
            com.facebook.ads.redexgen.p036X.C5245MS.A0U(r1, r0)
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.X.T1 r0 = com.facebook.ads.redexgen.p036X.C5673TO.A0A(r0)
            if (r0 == 0) goto L6d
            com.facebook.ads.redexgen.X.TO r0 = r5.A00
            com.facebook.ads.redexgen.X.T1 r0 = com.facebook.ads.redexgen.p036X.C5673TO.A0A(r0)
            com.facebook.ads.redexgen.p036X.C5245MS.A0N(r0, r3)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5675TQ.AAN():void");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    public final void ABy(float f) {
        boolean z;
        C39991W c39991w;
        boolean z2;
        AbstractC397518 abstractC397518;
        float A03;
        AbstractC397518 abstractC3975182;
        AbstractC397518 abstractC3975183;
        boolean z3;
        AbstractC397518 abstractC3975184;
        boolean z4;
        AbstractC397518 abstractC3975185;
        this.A00.A0Q((int) f);
        z = this.A00.A0U;
        if (!z) {
            c39991w = this.A00.A0E;
            float percentage = 100.0f * (1.0f - (f / c39991w.A07()));
            this.A00.A0V.setProgress(percentage);
            return;
        }
        z2 = this.A00.A09;
        if (z2) {
            abstractC3975184 = this.A00.A0D;
            A03 = 1.0f - (f / abstractC3975184.A0O().A0D().A02());
            z4 = this.A00.A0C;
            if (z4 || A03 < 1.0f) {
                this.A00.A0C = false;
                abstractC3975185 = this.A00.A0D;
                String A00 = abstractC3975185.A0S().A00();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                this.A00.A0V.setToolbarActionMessage(A00.replace(A00(0, 6, 65), String.valueOf((int) f)));
            } else {
                this.A00.A0C = true;
                this.A00.A0V.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC397518 = this.A00.A0D;
            A03 = 1.0f - (f / abstractC397518.A0O().A0D().A03());
        }
        this.A00.A0V.setProgress(100.0f * A03);
        abstractC3975182 = this.A00.A0D;
        abstractC3975183 = this.A00.A0D;
        boolean z5 = ((float) abstractC3975182.A0O().A0D().A02()) - f >= ((float) abstractC3975183.A0O().A0D().A03());
        z3 = this.A00.A0C;
        if (!z3 && z5) {
            this.A00.A0V.setToolbarActionMode(1);
        }
    }
}

package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.bN */
/* loaded from: assets/audience_network.dex */
public final class C6164bN implements InterfaceC42555h {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC42585k A00;
    public final C43657U A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, Utf8.REPLACEMENT_BYTE, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, Utf8.REPLACEMENT_BYTE, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C6164bN.class.getSimpleName();
    }

    public C6164bN(InterfaceC42585k interfaceC42585k, C5952Xx c5952Xx) {
        this.A00 = interfaceC42585k;
        this.A00.A3D(new C6166bP(this));
        this.A01 = new C43657U(c5952Xx);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5j().size()));
        }
        for (InterfaceC42615n interfaceC42615n : this.A00.A5j()) {
            int i = C42575j.A00[interfaceC42615n.A7j().ordinal()];
            if (i == 1) {
                A04(interfaceC42615n.getUrl());
            } else if (i == 2) {
                A06(interfaceC42615n.getUrl());
            } else if (i == 3) {
                A05(interfaceC42615n.getUrl());
            }
        }
        this.A01.A0W(new C6165bO(this), new C43587N(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C43637S c43637s = new C43637S(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c43637s.A01 = A00(117, 8, 90);
        this.A01.A0b(c43637s);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C43617Q c43617q = new C43617Q(str, A00(81, 36, 11), A00(125, 7, 46));
        c43617q.A04 = true;
        c43617q.A02 = A00(117, 8, 90);
        this.A01.A0X(c43617q);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C43617Q c43617q = new C43617Q(str, A00(81, 36, 11), A00(125, 7, 46));
        c43617q.A04 = false;
        c43617q.A02 = A00(117, 8, 90);
        this.A01.A0a(c43617q);
    }
}

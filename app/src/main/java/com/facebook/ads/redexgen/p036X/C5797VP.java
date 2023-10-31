package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.VP */
/* loaded from: assets/audience_network.dex */
public final class C5797VP implements InterfaceC4889GY {
    public static String[] A01 = {"uyzG6nZhYmNB4VufbjNeT4Wu24aJjB", "gpgsRAJrUCyLiJ0U4KQoajYft8d2IWSs", "V6tp6oNeuWY4Rz4wk", "QxLD6Qr0", "n2jYEAQ7ylPlmaGFo", "iuLvneSMbLfhzIa7Pvm7Ht11vKly078I", "9KvTRZ4e8scFY8IRtC8ize1aHWfIVCyu", "s0mDJJaIHWanY7Mz7gNVqOFT5NJr2uCg"};
    public final List<C4888GX> A00;

    public C5797VP(List<C4888GX> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final List<C4888GX> A6B(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final long A6b(int i) {
        C4997IK.A03(i == 0);
        String[] strArr = A01;
        if (strArr[6].charAt(12) != strArr[7].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "k5niKSSkUsmLECakjkbMaTYSf6uR41";
        strArr2[3] = "iDI18Hfk";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A6c() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A70(long j) {
        return j < 0 ? 0 : -1;
    }
}

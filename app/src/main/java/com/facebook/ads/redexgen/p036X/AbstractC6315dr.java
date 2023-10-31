package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dr */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6315dr<T> implements InterfaceC39390X<T> {
    public static byte[] A01;
    public static String[] A02 = {"MK0lJZb1G2RRFZEaFDTiwbPmIpRtYmde", "mY0WYGn7", "KMPGaiIzki7l9AH4HVkge6", "m9KV7hMB", "q4luaSiM5kuOIYzPzCoa1lP4AmyDrsGF", "uYbWOwnO0fDov", "", "4k"};
    public final String A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 99;
            if (A02[0].charAt(9) != '2') {
                throw new RuntimeException();
            }
            A02[4] = "xalbLzqPtLNAZMxuuBcoxRjt1J2nAJYQ";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{54, 61, 52, 52};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC6315dr(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C39380W A04(@Nullable T t) {
        return new C39380W(this, t == null ? A02(0, 4, 101) : t.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39390X
    public final String getName() {
        return this.A00;
    }
}

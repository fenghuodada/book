package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.do */
/* loaded from: assets/audience_network.dex */
public final class C6312do extends AbstractC39470f {
    public static byte[] A02;
    public static String[] A03 = {"jy5CHS8ciK95qvgyZPKNzTZ", "EsJYGwS5VmRo2OpDKfhEPxAAyWa", "TXamSNcIJ7UnME9", "aAqXHcETEDrJIQ0", "iKc7fPJ", "AeuUMR7bsIhvkygvb", "MOi5LCZvXht1yXQHfTxaoFALkw", "2sehTzR2RD89PLQKMZ0CUhyomJdrMDfZ"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {42, 40, 51, 53, 40, 51, 46, 35, 75, 70, 79, 90};
        String[] strArr = A03;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A03[5] = "wR51MZdRiuTx9tajcMEJR1ABXy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C6312do.class.getSimpleName();
    }

    public C6312do(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, Uri uri, Map<String, String> mExtraData) {
        super(c5953Xy, interfaceC5080Jh, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39470f
    public final void A0C() {
        EnumC5082Jj enumC5082Jj = EnumC5082Jj.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 58));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                enumC5082Jj = EnumC5082Jj.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.A9B(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 95)), enumC5082Jj);
    }
}

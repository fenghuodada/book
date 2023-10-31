package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bW */
/* loaded from: assets/audience_network.dex */
public final class C6173bW implements InterfaceC40211s {
    public static byte[] A03;
    public C42385Q A00;
    public C5953Xy A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public C6173bW(C42385Q c42385q, C5953Xy c5953Xy, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c42385q;
        this.A01 = c5953Xy;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40211s
    public final void AAi(C5115KH c5115kh) {
        C5157Kz.A00(new C6176bZ(this, c5115kh));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40211s
    public final void ABd(List<C6298da> list) {
        C43657U c43657u = new C43657U(this.A01);
        String A02 = A02(6, 7, 70);
        for (C6298da c6298da : list) {
            if (A02(6, 7, 70).equals(A02)) {
                A02 = c6298da.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c6298da.A0E().A0G() != null) {
                    c43657u.A0b(new C43637S(c6298da.A0E().A0G().getUrl(), c6298da.A0E().A0G().getHeight(), c6298da.A0E().A0G().getWidth(), c6298da.A0G(), A02(0, 6, 2)));
                }
                if (c6298da.A0E().A0F() != null) {
                    c43657u.A0b(new C43637S(c6298da.A0E().A0F().getUrl(), c6298da.A0E().A0F().getHeight(), c6298da.A0E().A0F().getWidth(), c6298da.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c6298da.A0E().A0d())) {
                    c43657u.A0a(new C43617Q(c6298da.A0E().A0d(), c6298da.A0G(), A02(0, 6, 2), c6298da.A0E().A0A()));
                }
            }
        }
        c43657u.A0W(new C6174bX(this, list), new C43587N(A02, A02(0, 6, 2)));
    }
}

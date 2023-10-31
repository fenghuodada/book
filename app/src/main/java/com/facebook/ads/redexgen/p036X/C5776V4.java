package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.V4 */
/* loaded from: assets/audience_network.dex */
public final class C5776V4 implements InterfaceC4955He {
    public static byte[] A00;
    public static final InterfaceC4954Hd A01;
    public static final C5776V4 A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, Utf8.REPLACEMENT_BYTE, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new C5776V4();
        A01 = new C5777V5();
    }

    public C5776V4() {
    }

    public /* synthetic */ C5776V4(C5777V5 c5777v5) {
        this();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final Uri A7k() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final long ACw(C4959Hi c4959Hi) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}

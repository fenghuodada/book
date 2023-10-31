package com.facebook.ads.redexgen.p036X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Bz */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4629Bz extends AbstractC5893X0<C4627Bx, AbstractC4619Bp, C4890GZ> implements InterfaceC5800VS {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{Utf8.REPLACEMENT_BYTE, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract InterfaceC4889GY A0b(byte[] bArr, int i, boolean z) throws C4890GZ;

    public AbstractC4629Bz(String str) {
        super(new C4627Bx[2], new AbstractC4619Bp[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC5893X0
    /* renamed from: A0E */
    public final C4890GZ A0W(C4627Bx c4627Bx, AbstractC4619Bp abstractC4619Bp, boolean z) {
        try {
            ByteBuffer byteBuffer = c4627Bx.A01;
            abstractC4619Bp.A09(((C5895X2) c4627Bx).A00, A0b(byteBuffer.array(), byteBuffer.limit(), z), c4627Bx.A00);
            abstractC4619Bp.A01(Integer.MIN_VALUE);
            return null;
        } catch (C4890GZ e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC5893X0
    /* renamed from: A0F */
    public final C4890GZ A0X(Throwable th) {
        return new C4890GZ(A0I(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC5893X0
    /* renamed from: A0G */
    public final C4627Bx A0T() {
        return new C4627Bx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC5893X0
    /* renamed from: A0H */
    public final AbstractC4619Bp A0V() {
        return new AbstractC4619Bp(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC4629Bz A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC4619Bp
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5893X0
    /* renamed from: A0c */
    public final void A0a(AbstractC4619Bp abstractC4619Bp) {
        super.A0a(abstractC4619Bp);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5800VS
    public final void AEg(long j) {
    }
}

package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.33 */
/* loaded from: assets/audience_network.dex */
public final class C409333 extends AbstractC4741E4 implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC5800VS A03;
    public C4627Bx A04;
    public AbstractC4619Bp A05;
    public AbstractC4619Bp A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C4541AZ A0A;
    public final InterfaceC4891Ga A0B;
    public final InterfaceC4892Gb A0C;

    public C409333(InterfaceC4892Gb interfaceC4892Gb, Looper looper) {
        this(interfaceC4892Gb, looper, InterfaceC4891Ga.A00);
    }

    public C409333(InterfaceC4892Gb interfaceC4892Gb, Looper looper, InterfaceC4891Ga interfaceC4891Ga) {
        super(3);
        this.A0C = (InterfaceC4892Gb) C4997IK.A01(interfaceC4892Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC4891Ga;
        this.A0A = new C4541AZ();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6c()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6b(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC4619Bp abstractC4619Bp = this.A06;
        if (abstractC4619Bp != null) {
            abstractC4619Bp.A08();
            this.A06 = null;
        }
        AbstractC4619Bp abstractC4619Bp2 = this.A05;
        if (abstractC4619Bp2 != null) {
            abstractC4619Bp2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADm();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A05(List<C4888GX> list) {
        this.A0C.AAS(list);
    }

    private void A06(List<C4888GX> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        InterfaceC5800VS interfaceC5800VS = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        interfaceC5800VS.flush();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A17(Format[] formatArr, long j) throws C4529AM {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A8R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A8c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        A02();
        r9.A08 = true;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ADz(long r10, long r12) throws com.facebook.ads.redexgen.p036X.C4529AM {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C409333.ADz(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4562Au
    public final int AF7(Format format) {
        if (this.A0B.AF8(format)) {
            return AbstractC4741E4.A0x(null, format.A0H) ? 4 : 2;
        } else if (C5015Ic.A0A(format.A0O)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}

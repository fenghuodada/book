package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.E4 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4741E4 implements InterfaceC5909XG, InterfaceC4562Au {
    public int A00;
    public int A01;
    public long A02;
    public C4563Av A03;
    public InterfaceC4852Fv A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC4741E4(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable InterfaceC4650CM<?> interfaceC4650CM, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC4650CM == null) {
            return false;
        }
        return interfaceC4650CM.A3x(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.AEs(j - this.A02);
    }

    public final int A10(C4541AZ c4541az, C5895X2 c5895x2, boolean z) {
        int ADa = this.A04.ADa(c4541az, c5895x2, z);
        if (ADa == -4) {
            if (c5895x2.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c5895x2.A00 += this.A02;
        } else if (ADa == -5) {
            Format format = c4541az.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c4541az.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return ADa;
    }

    public final C4563Av A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws C4529AM {
    }

    public void A14() throws C4529AM {
    }

    public void A15(long j, boolean z) throws C4529AM {
    }

    public void A16(boolean z) throws C4529AM {
    }

    public void A17(Format[] formatArr, long j) throws C4529AM {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8c();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void A4n() {
        C4997IK.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void A5A(C4563Av c4563Av, Format[] formatArr, InterfaceC4852Fv interfaceC4852Fv, long j, boolean z, long j2) throws C4529AM {
        C4997IK.A04(this.A01 == 0);
        this.A03 = c4563Av;
        this.A01 = 1;
        A16(z);
        AE1(formatArr, interfaceC4852Fv, j2);
        A15(j, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final InterfaceC4562Au A5y() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public InterfaceC5013Ia A6w() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final int A7W() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final InterfaceC4852Fv A7b() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG, com.facebook.ads.redexgen.p036X.InterfaceC4562Au
    public final int A7i() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4559Ar
    public void A7z(int i, Object obj) throws C4529AM {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A84() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A8O() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void A9a() throws IOException {
        this.A04.A9X();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void AE1(Format[] formatArr, InterfaceC4852Fv interfaceC4852Fv, long j) throws C4529AM {
        C4997IK.A04(!this.A06);
        this.A04 = interfaceC4852Fv;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void AEC(long j) throws C4529AM {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void AEX() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void AEZ(int i) {
        this.A00 = i;
    }

    public int AF9() throws C4529AM {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void start() throws C4529AM {
        C4997IK.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void stop() throws C4529AM {
        C4997IK.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}

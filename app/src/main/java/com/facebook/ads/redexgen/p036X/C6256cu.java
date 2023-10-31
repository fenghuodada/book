package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cu */
/* loaded from: assets/audience_network.dex */
public class C6256cu implements InterfaceC397114 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ C4816FL A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{85, 3, 84, 4, 2, 82, 7, 95, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, Byte.MAX_VALUE, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    static {
        A01();
    }

    public C6256cu(C4816FL c4816fl, Runnable runnable) {
        this.A00 = c4816fl;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void AC9(AbstractC6288dQ abstractC6288dQ) {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACA(AbstractC6288dQ abstractC6288dQ) {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACB(AbstractC6288dQ abstractC6288dQ) {
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACC(AbstractC6288dQ abstractC6288dQ) {
        this.A00.A0C().removeCallbacks(this.A01);
        C4816FL c4816fl = this.A00;
        c4816fl.A01 = abstractC6288dQ;
        c4816fl.A0F();
        this.A00.A06.A0F(abstractC6288dQ);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACD(AbstractC6288dQ abstractC6288dQ) {
        C5128KV.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACE(AbstractC6288dQ abstractC6288dQ) {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void ACF(AbstractC6288dQ abstractC6288dQ, AdError adError) {
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0B.A0D().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && C5064JR.A1H(this.A00.A0B)) {
            this.A00.A06.A0G(C5115KH.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            C4816FL c4816fl = this.A00;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            c4816fl.A06.A0G(C5115KH.A00(AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0K(abstractC6288dQ);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC397114
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}

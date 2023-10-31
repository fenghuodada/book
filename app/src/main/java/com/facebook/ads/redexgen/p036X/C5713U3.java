package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.U3 */
/* loaded from: assets/audience_network.dex */
public class C5713U3 extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C5140Kh A00;
    public final /* synthetic */ C5143Kk A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public C5713U3(C5143Kk c5143Kk, C5140Kh c5140Kh) {
        this.A01 = c5143Kk;
        this.A00 = c5140Kh;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5953Xy c5953Xy;
        C5953Xy c5953Xy2;
        C5953Xy c5953Xy3;
        C5953Xy c5953Xy4;
        C5953Xy c5953Xy5;
        long j;
        C5953Xy c5953Xy6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC5528R3 A032;
        C5953Xy c5953Xy7;
        C5953Xy c5953Xy8;
        C5953Xy c5953Xy9;
        C5953Xy c5953Xy10;
        long j2;
        c5953Xy = this.A01.A04;
        if (C5234MH.A00(c5953Xy) != EnumC5233MG.A07) {
            c5953Xy2 = this.A01.A04;
            C445498.A08(c5953Xy2);
            c5953Xy3 = this.A01.A04;
            C42665s.A07(c5953Xy3);
            C5140Kh c5140Kh = this.A00;
            C44759U A00 = C44759U.A00();
            c5953Xy4 = this.A01.A04;
            boolean z = true;
            Map<String, String> A08 = c5140Kh.A08(A00.A01(c5953Xy4, true).A6W());
            this.A01.A02 = A08;
            try {
                c5953Xy7 = this.A01.A04;
                PackageManager packageManager = c5953Xy7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb = new StringBuilder();
                    c5953Xy8 = this.A01.A04;
                    sb.append(c5953Xy8.getPackageName());
                    sb.append(A00(0, 1, 93));
                    c5953Xy9 = this.A01.A04;
                    sb.append(packageManager.getInstallerPackageName(c5953Xy9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != EnumC5119KM.A03 && this.A00.A05() != EnumC5119KM.A05 && this.A00.A05() != EnumC5119KM.A04 && this.A00.A05() != null) {
                    z = false;
                }
                c5953Xy6 = this.A01.A04;
                InterfaceC5527R2 A022 = C5545RK.A02(z, c5953Xy6);
                str = this.A01.A06;
                C5541RG c5541rg = new C5541RG();
                map = this.A01.A02;
                byte[] A082 = c5541rg.A05(map).A08();
                A032 = this.A01.A03(C5236MJ.A00(), this.A00);
                A022.ADC(str, A082, A032);
                return;
            } catch (Exception e) {
                AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
                String message = e.getMessage();
                c5953Xy5 = this.A01.A04;
                InterfaceC39330R A0D = c5953Xy5.A0D();
                String errorMessage = A03[5];
                if (errorMessage.length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j = this.A01.A00;
                A0D.A2j(C5236MJ.A01(j), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
                this.A01.A0D(C5115KH.A01(adErrorType, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
        String A003 = A00(13, 21, 92);
        c5953Xy10 = this.A01.A04;
        InterfaceC39330R A0D2 = c5953Xy10.A0D();
        j2 = this.A01.A00;
        A0D2.A2j(C5236MJ.A01(j2), adErrorType2.getErrorCode(), A003, adErrorType2.isPublicError());
        this.A01.A0D(new C5115KH(adErrorType2, A003));
    }
}

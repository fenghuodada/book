package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.cw */
/* loaded from: assets/audience_network.dex */
public final class C6258cw implements InterfaceC5142Kj {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    @Nullable
    public InterfaceC40211s A00;
    public C44639H A01;
    @Nullable
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    @Nullable
    public final AdSize A06;
    public final C39590s A07;
    public final C5953Xy A08;
    public final InterfaceC5080Jh A09;
    public final EnumC5119KM A0A;
    public final C5143Kk A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, Utf8.REPLACEMENT_BYTE, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        C5247MU.A02();
    }

    public C6258cw(C5953Xy c5953Xy, String str, EnumC5119KM enumC5119KM, @Nullable AdSize adSize, int i) {
        this.A08 = c5953Xy;
        this.A0D = str;
        this.A0A = enumC5119KM;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new C5143Kk(this.A08);
        this.A0B.A0P(this);
        this.A07 = new C39590s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C4817FM(this);
        this.A09 = c5953Xy.A08();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C6298da> A04() {
        C44639H c44639h = this.A01;
        ArrayList arrayList = new ArrayList(c44639h.A02());
        for (C44619F A04 = c44639h.A04(); A04 != null; A04 = c44639h.A04()) {
            InterfaceC39540n A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A7B() == AdPlacementType.NATIVE) {
                C6298da c6298da = (C6298da) A00;
                c6298da.A0L(this.A08, new C4818FN(this, arrayList, c6298da), this.A09, new C40191q(A04.A04(), c44639h.A05(), this.A0D, c44639h.A05().A0C()), C5721UB.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            C5124KR c5124kr = new C5124KR(this.A08, null, null, null);
            C5953Xy c5953Xy = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C5140Kh(c5953Xy, str, adSize != null ? new C5221M4(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), c5124kr, C5227MA.A01(C5064JR.A0H(this.A08)), this.A02, null));
        } catch (C5116KI e) {
            AAi(C5115KH.A02(e));
        }
    }

    public final void A08(InterfaceC40211s interfaceC40211s) {
        this.A00 = interfaceC40211s;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C44639H c44639h = this.A01;
        return c44639h == null || c44639h.A0A();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5142Kj
    public final void AAi(C5115KH c5115kh) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC40211s interfaceC40211s = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC40211s != null) {
            interfaceC40211s.AAi(c5115kh);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5142Kj
    public final void ACS(C5708Ty c5708Ty) {
        C44639H A00 = c5708Ty.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C6298da> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.AAi(C5115KH.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ABd(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}

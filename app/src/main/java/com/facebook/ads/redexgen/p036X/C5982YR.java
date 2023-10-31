package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YR */
/* loaded from: assets/audience_network.dex */
public final class C5982YR extends C43216m {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{15, 7, 14, 13, 4};
    }

    public C5982YR(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 99));
    }

    public static int A01(CellInfo cellInfo) {
        if (cellInfo != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                if (cellInfo instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                }
                throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
            }
            throw new UnsupportedOperationException();
        }
        throw new NullPointerException();
    }

    public final InterfaceC43306v A0G() {
        return new C5992Yb(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC43306v A0H() {
        return new C5991Ya(this);
    }

    public final InterfaceC43306v A0I() {
        return new C5987YW(this);
    }

    public final InterfaceC43306v A0J() {
        return new C5986YV(this);
    }

    public final InterfaceC43306v A0K() {
        return new C5988YX(this);
    }

    public final InterfaceC43306v A0L() {
        return new C5989YY(this);
    }

    public final InterfaceC43306v A0M() {
        return new C5983YS(this);
    }

    public final InterfaceC43306v A0N() {
        return new C5995Ye(this);
    }

    public final InterfaceC43306v A0O() {
        return new C5985YU(this);
    }

    public final InterfaceC43306v A0P() {
        return new C5984YT(this);
    }

    public final InterfaceC43306v A0Q() {
        return new C5994Yd(this);
    }

    public final InterfaceC43306v A0R() {
        return new C5993Yc(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC43306v A0S() {
        return new C5990YZ(this);
    }
}

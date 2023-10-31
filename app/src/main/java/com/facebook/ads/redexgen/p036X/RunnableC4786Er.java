package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Er */
/* loaded from: assets/audience_network.dex */
public class RunnableC4786Er implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C4795F0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public RunnableC4786Er(C4795F0 c4795f0) {
        this.A00 = c4795f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4777Eg c4777Eg;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            c4777Eg = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] A03 = c4777Eg.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC4785Eq(this, A03));
        }
    }
}

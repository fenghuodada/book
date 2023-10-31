package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nq */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5330Nq implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C5953Xy A00;
    public final /* synthetic */ C5332Ns A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, 28, 41, 28, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    public View$OnClickListenerC5330Nq(C5332Ns c5332Ns, C5953Xy c5953Xy) {
        this.A01 = c5332Ns;
        this.A00 = c5953Xy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            str = this.A01.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A01.A06;
            if (!A00.equals(str2)) {
                String A002 = A00(22, 26, 33);
                str3 = this.A01.A06;
                Intent intent = new Intent(A002, C5191La.A00(str3));
                intent.addFlags(268435456);
                this.A00.A0D().A8A();
                try {
                    C5180LN.A0B(this.A00, intent);
                } catch (C5178LL e) {
                    Throwable cause = e.getCause();
                    Throwable th = e;
                    if (cause != null) {
                        th = e.getCause();
                    }
                    this.A00.A06().A8y(A00(11, 11, 113), C44458z.A00, new C444690(th));
                }
            }
        } catch (Throwable th2) {
            C5158L0.A00(th2, this);
        }
    }
}

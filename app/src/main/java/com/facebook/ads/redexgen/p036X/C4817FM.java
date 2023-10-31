package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.FM */
/* loaded from: assets/audience_network.dex */
public final class C4817FM extends AbstractC5694Tk<C6258cw> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public C4817FM(C6258cw c6258cw) {
        super(c6258cw);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5953Xy c5953Xy;
        Handler handler;
        Runnable runnable;
        C6258cw A07 = A07();
        if (A07 == null) {
            return;
        }
        c5953Xy = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C5262Mj.A02(c5953Xy)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}

package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.AM */
/* loaded from: assets/audience_network.dex */
public final class C4529AM extends Exception {
    public final int A00;
    public final int A01;

    public C4529AM(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static C4529AM A00(IOException iOException) {
        return new C4529AM(0, null, iOException, -1);
    }

    public static C4529AM A01(Exception exc, int i) {
        return new C4529AM(1, null, exc, i);
    }

    public static C4529AM A02(RuntimeException runtimeException) {
        return new C4529AM(2, null, runtimeException, -1);
    }
}

package com.facebook.ads.redexgen.p036X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8p */
/* loaded from: assets/audience_network.dex */
public final class C44358p implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C5952Xx A00;
    public final InterfaceC44428w A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C44358p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C5952Xx c5952Xx, InterfaceC44348o interfaceC44348o) {
        this(uncaughtExceptionHandler, c5952Xx, interfaceC44348o, C44438x.A00());
    }

    public C44358p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C5952Xx c5952Xx, InterfaceC44348o interfaceC44348o, InterfaceC44428w interfaceC44428w) {
        this.A02 = uncaughtExceptionHandler;
        if (c5952Xx != null) {
            this.A00 = c5952Xx;
            this.A03 = interfaceC44348o.A7U(c5952Xx);
            this.A01 = interfaceC44428w;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = C5227MA.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03) && A03.contains(A00(17, 16, 41))) {
                Map<String, String> A02 = new C44338n(A03, this.A03).A02();
                A02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable A00 = AbstractRunnableC5153Kv.A00();
                String A002 = A00(45, 12, 98);
                if (A00 != th) {
                    A02.put(A002, A00(0, 1, 91));
                } else {
                    A02.put(A002, A00(1, 1, 108));
                }
                this.A01.AFj(new C444993(this.A00.A07().A01(), this.A00.A07().A02(), A02), this.A00);
                if (C5064JR.A1R(this.A00)) {
                    C5064JR.A0b(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}

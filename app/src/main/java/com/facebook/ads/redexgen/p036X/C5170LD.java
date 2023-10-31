package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.LD */
/* loaded from: assets/audience_network.dex */
public final class C5170LD {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<C5170LD> A02 = new ThreadLocal<>();
    public final C5154Kw A00 = new C5154Kw();

    public static C5154Kw A00() {
        return A02().A00;
    }

    public static C5154Kw A01(C5169LC c5169lc) {
        C5154Kw c5154Kw = new C5154Kw(A00());
        c5154Kw.add(c5169lc);
        return c5154Kw;
    }

    public static C5170LD A02() {
        C5170LD c5170ld = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (c5170ld == null) {
                C5170LD c5170ld2 = new C5170LD();
                A02.set(c5170ld2);
                return c5170ld2;
            }
            return c5170ld;
        }
        throw new RuntimeException();
    }

    public static void A03(AbstractRunnableC5165L8 abstractRunnableC5165L8) {
        C5154Kw createRunnableAsyncStackTrace = abstractRunnableC5165L8.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A04(AbstractRunnableC5165L8 abstractRunnableC5165L8) {
        C5154Kw createRunnableAsyncStackTrace = abstractRunnableC5165L8.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}

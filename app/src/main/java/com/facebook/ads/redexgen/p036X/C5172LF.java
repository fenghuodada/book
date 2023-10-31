package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.LF */
/* loaded from: assets/audience_network.dex */
public final class C5172LF {
    public static String[] A00 = {"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    public static final AtomicReference<InterfaceC5171LE> A01 = new AtomicReference<>(null);

    public static InterfaceC5171LE A00() {
        InterfaceC5171LE interfaceC5171LE = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (interfaceC5171LE == null) {
            InterfaceC5171LE errorLogger = new C5706Tw();
            return errorLogger;
        }
        return interfaceC5171LE;
    }

    public static void A01(InterfaceC5171LE interfaceC5171LE) {
        A01.set(interfaceC5171LE);
    }
}

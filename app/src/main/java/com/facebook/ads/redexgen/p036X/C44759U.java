package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9U */
/* loaded from: assets/audience_network.dex */
public final class C44759U {
    public static C44759U A00 = new C44759U();

    public static C44759U A00() {
        return A00;
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final InterfaceC44749T A01(C44148U c44148u, boolean z) {
        return new C5922XT(c44148u, z, new C427966());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A02(C44148U c44148u) {
        try {
            return A01(c44148u, false).A6W();
        } catch (Throwable th) {
            c44148u.A06().A3R(th);
            return C44719Q.A01(c44148u);
        }
    }
}

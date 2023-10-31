package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.L0 */
/* loaded from: assets/audience_network.dex */
public final class C5158L0 {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC5156Ky> A02 = new AtomicReference<>();

    @SuppressLint({"RethrownThrowableArgument"})
    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            C5172LF.A00().A8p(3306, th);
            InterfaceC5156Ky interfaceC5156Ky = A02.get();
            if (interfaceC5156Ky != null) {
                interfaceC5156Ky.AE0(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC5156Ky interfaceC5156Ky) {
        A01.set(z);
        A02.set(interfaceC5156Ky);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}

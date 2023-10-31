package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.PB */
/* loaded from: assets/audience_network.dex */
public final class C5412PB {
    public static final Map<String, WeakReference<C5411PA>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C5411PA A01(C5953Xy c5953Xy, AbstractC397518 abstractC397518, int i, InterfaceC5409P8 interfaceC5409P8) {
        C5411PA c5411pa = new C5411PA(c5953Xy, abstractC397518, c5953Xy.A00().A08(), i);
        c5411pa.A0b(interfaceC5409P8);
        c5411pa.A0X();
        A00.put(abstractC397518.A0Z(), new WeakReference<>(c5411pa));
        return c5411pa;
    }

    @Nullable
    public static C5411PA A02(String str) {
        WeakReference<C5411PA> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC397518 abstractC397518, C5411PA c5411pa) {
        A00.put(abstractC397518.A0Z(), new WeakReference<>(c5411pa));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}

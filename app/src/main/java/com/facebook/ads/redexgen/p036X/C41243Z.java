package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3Z */
/* loaded from: assets/audience_network.dex */
public final class C41243Z {
    public static final InterfaceC41233Y A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C4808FD();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C4809FE();
        } else {
            A01 = new C6217cF();
        }
    }

    public C41243Z() {
        this.A00 = A01.A9h(this);
    }

    public C41243Z(Object obj) {
        this.A00 = obj;
    }

    @Nullable
    public final C41223X A00(int i) {
        return null;
    }

    @Nullable
    public final C41223X A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    @Nullable
    public final List<C41223X> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}

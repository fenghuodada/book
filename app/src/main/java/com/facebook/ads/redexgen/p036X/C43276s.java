package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6s */
/* loaded from: assets/audience_network.dex */
public final class C43276s {
    public final int A00;
    public final InterfaceC43306v A01;
    public final EnumSet<EnumC43346z> A02;

    public C43276s(int i, EnumSet<EnumC43346z> enumSet, InterfaceC43306v interfaceC43306v) {
        this.A00 = i;
        this.A02 = enumSet;
        this.A01 = interfaceC43306v;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC43306v A01() {
        if (this.A02.contains(EnumC43346z.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC43306v A02(EnumC43316w enumC43316w) {
        if (A04(enumC43316w)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC43346z> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC43316w enumC43316w) {
        return C43547J.A0E(enumC43316w) && this.A02.contains(EnumC43346z.A00(enumC43316w.A03()));
    }
}

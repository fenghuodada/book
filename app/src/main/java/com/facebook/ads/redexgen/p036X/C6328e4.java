package com.facebook.ads.redexgen.p036X;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.e4 */
/* loaded from: assets/audience_network.dex */
public final class C6328e4 implements InterfaceC390903<File> {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390903
    public final C390802<File> A3A(File file, InterfaceC39270L interfaceC39270L) {
        if (file.exists()) {
            return new C390802<>(true, file);
        }
        return new C390802<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390903
    public final void A4B(File file, InterfaceC39270L interfaceC39270L) {
    }
}

package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a1 */
/* loaded from: assets/audience_network.dex */
public class C6080a1 implements InterfaceC43306v {
    public final /* synthetic */ C6060Zh A00;

    public C6080a1(C6060Zh c6060Zh) {
        this.A00 = c6060Zh;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(EnumC434176.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0E(Arrays.asList(strArr));
        }
        return this.A00.A07(EnumC434176.A07);
    }
}

package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.applovin.mediation.MaxErrorCode;

/* renamed from: com.facebook.ads.redexgen.X.F5 */
/* loaded from: assets/audience_network.dex */
public final class C4800F5 {
    public final InterfaceC4952Hb A00;
    public final InterfaceC4954Hd A01;
    public final InterfaceC4954Hd A02;
    public final InterfaceC4981I4 A03;
    public final C5026In A04;

    public C4800F5(InterfaceC4981I4 interfaceC4981I4, InterfaceC4954Hd interfaceC4954Hd) {
        this(interfaceC4981I4, interfaceC4954Hd, null, null, null);
    }

    public C4800F5(InterfaceC4981I4 interfaceC4981I4, InterfaceC4954Hd interfaceC4954Hd, @Nullable InterfaceC4954Hd interfaceC4954Hd2, @Nullable InterfaceC4952Hb interfaceC4952Hb, @Nullable C5026In c5026In) {
        C4997IK.A01(interfaceC4954Hd);
        this.A03 = interfaceC4981I4;
        this.A02 = interfaceC4954Hd;
        this.A01 = interfaceC4954Hd2;
        this.A00 = interfaceC4952Hb;
        this.A04 = c5026In;
    }

    public final InterfaceC4981I4 A00() {
        return this.A03;
    }

    public final C5762Uq A01(boolean z) {
        InterfaceC4955He cacheReadDataSource;
        InterfaceC4953Hc c5763Ur;
        InterfaceC4954Hd interfaceC4954Hd = this.A01;
        if (interfaceC4954Hd != null) {
            cacheReadDataSource = interfaceC4954Hd.A4E();
        } else {
            cacheReadDataSource = new C5775V3();
        }
        if (z) {
            return new C5762Uq(this.A03, C5776V4.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC4952Hb interfaceC4952Hb = this.A00;
        if (interfaceC4952Hb != null) {
            c5763Ur = interfaceC4952Hb.createDataSink();
        } else {
            c5763Ur = new C5763Ur(this.A03, 2097152L);
        }
        InterfaceC4955He A4E = this.A02.A4E();
        C5026In c5026In = this.A04;
        if (c5026In != null) {
            A4E = new C5767Uv(A4E, c5026In, MaxErrorCode.NETWORK_ERROR);
        }
        return new C5762Uq(this.A03, A4E, cacheReadDataSource, c5763Ur, 1, null);
    }

    public final C5026In A02() {
        C5026In c5026In = this.A04;
        return c5026In != null ? c5026In : new C5026In();
    }
}

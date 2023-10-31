package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.VY */
/* loaded from: assets/audience_network.dex */
public final class C5806VY implements InterfaceC4877GM {
    @Nullable
    public InterfaceC4661Cf A02;
    @Nullable
    public Object A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final InterfaceC4954Hd A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public C5806VY(InterfaceC4954Hd interfaceC4954Hd) {
        this.A06 = interfaceC4954Hd;
    }

    public final C5806VY A00(String str) {
        C4997IK.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final C4630C0 A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C5886Wt();
        }
        return new C4630C0(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}

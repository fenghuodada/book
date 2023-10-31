package com.facebook.ads.redexgen.p036X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.So */
/* loaded from: assets/audience_network.dex */
public class C5637So implements InterfaceC5340O0 {
    public final /* synthetic */ C5635Sm A00;

    public C5637So(C5635Sm c5635Sm) {
        this.A00 = c5635Sm;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABg(String str) {
        C5333Nt c5333Nt;
        C5333Nt c5333Nt2;
        this.A00.A0I = false;
        c5333Nt = this.A00.A0C;
        c5333Nt.setProgress(100);
        c5333Nt2 = this.A00.A0C;
        C5245MS.A0N(c5333Nt2, 8);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABi(String str) {
        C5333Nt c5333Nt;
        C5332Ns c5332Ns;
        this.A00.A0I = true;
        c5333Nt = this.A00.A0C;
        C5245MS.A0N(c5333Nt, 0);
        c5332Ns = this.A00.A0B;
        c5332Ns.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void ABz(int i) {
        boolean z;
        C5333Nt c5333Nt;
        z = this.A00.A0I;
        if (z) {
            c5333Nt = this.A00.A0C;
            c5333Nt.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    public final void AC4(String str) {
        C5332Ns c5332Ns;
        c5332Ns = this.A00.A0B;
        c5332Ns.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5340O0
    @RequiresApi(api = 26)
    public final void AC6() {
        C5385Oj c5385Oj;
        c5385Oj = this.A00.A0E;
        c5385Oj.A09().AAF(14);
    }
}

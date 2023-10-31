package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Y2 */
/* loaded from: assets/audience_network.dex */
public class C5957Y2 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ InterfaceC43577M A00;
    public final /* synthetic */ C43587N A01;
    public final /* synthetic */ C43657U A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C5957Y2(C43657U c43657u, ArrayList arrayList, InterfaceC43577M interfaceC43577M, C43587N c43587n, ArrayList arrayList2) {
        this.A02 = c43657u;
        this.A03 = arrayList;
        this.A00 = interfaceC43577M;
        this.A01 = c43587n;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        AtomicBoolean A0D;
        C44148U c44148u;
        Handler handler;
        C44148U c44148u2;
        long j;
        long j2;
        A0D = C43657U.A0D(this.A03);
        c44148u = this.A02.A04;
        if (c44148u instanceof C5953Xy) {
            c44148u2 = this.A02.A04;
            C5953Xy c5953Xy = (C5953Xy) c44148u2;
            if (A0D.get()) {
                InterfaceC39330R A0D2 = c5953Xy.A0D();
                j2 = this.A02.A00;
                A0D2.A3w(C5236MJ.A01(j2));
            } else {
                InterfaceC39330R A0D3 = c5953Xy.A0D();
                j = this.A02.A00;
                A0D3.A3v(C5236MJ.A01(j));
            }
        }
        handler = this.A02.A02;
        handler.post(new C5958Y3(this, A0D));
        C43657U.A0D(this.A04);
    }
}

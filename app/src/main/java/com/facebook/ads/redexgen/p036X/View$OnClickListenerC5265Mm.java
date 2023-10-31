package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mm */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5265Mm implements View.OnClickListener {
    public final /* synthetic */ C39971U A00;
    public final /* synthetic */ C5088Jp A01;
    public final /* synthetic */ C5266Mn A02;
    public final /* synthetic */ InterfaceC5269Mq A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC5265Mm(C5266Mn c5266Mn, C5088Jp c5088Jp, InterfaceC5269Mq interfaceC5269Mq, String str, C39971U c39971u) {
        this.A02 = c5266Mn;
        this.A01 = c5088Jp;
        this.A03 = interfaceC5269Mq;
        this.A04 = str;
        this.A00 = c39971u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C40422D c40422d;
        C5953Xy c5953Xy;
        C5953Xy c5953Xy2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC5087Jo.A0A, null);
            c40422d = this.A02.A02;
            c5953Xy = this.A02.A03;
            if (c40422d.A0O(c5953Xy.A00(), true)) {
                this.A03.A8j(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C5190LZ c5190lz = new C5190LZ();
                c5953Xy2 = this.A02.A03;
                C5190LZ.A0E(c5190lz, c5953Xy2, C5191La.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}

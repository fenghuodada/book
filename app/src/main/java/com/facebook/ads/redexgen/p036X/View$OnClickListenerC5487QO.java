package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QO */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5487QO implements View.OnClickListener {
    public final /* synthetic */ C43246p A00;

    public View$OnClickListenerC5487QO(C43246p c43246p) {
        this.A00 = c43246p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View v;
        C5088Jp c5088Jp;
        C5953Xy c5953Xy;
        C5483QK videoView;
        C5483QK videoView2;
        C5483QK videoView3;
        C5088Jp c5088Jp2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            v = this.A00.getVideoView();
            if (v != null) {
                c5088Jp = this.A00.A02;
                if (c5088Jp != null) {
                    c5088Jp2 = this.A00.A02;
                    c5088Jp2.A02(EnumC5087Jo.A0p, null);
                }
                c5953Xy = this.A00.A01;
                c5953Xy.A0D().A2t();
                int[] iArr = C5488QP.A00;
                videoView = this.A00.getVideoView();
                int i = iArr[videoView.getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    videoView2 = this.A00.getVideoView();
                    videoView2.A0b(EnumC5469Q6.A04, 12);
                } else if (i == 5) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}

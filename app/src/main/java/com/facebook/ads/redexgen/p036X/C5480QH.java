package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.QH */
/* loaded from: assets/audience_network.dex */
public class C5480QH extends AnimatorListenerAdapter {
    public final /* synthetic */ C43817o A00;

    public C5480QH(C43817o c43817o) {
        this.A00 = c43817o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C5127KU(this), 2000L);
    }
}

package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Tl */
/* loaded from: assets/audience_network.dex */
public class C5695Tl extends animationAnimation$AnimationListenerC5244MR {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C5695Tl(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.p036X.animationAnimation$AnimationListenerC5244MR, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}

package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Mx  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class animationAnimation$AnimationListenerC5276Mx implements Animation.AnimationListener {
    public final /* synthetic */ C422159 A00;
    public final /* synthetic */ AbstractC5681TW A01;
    public final /* synthetic */ AbstractC5681TW A02;

    public animationAnimation$AnimationListenerC5276Mx(AbstractC5681TW abstractC5681TW, AbstractC5681TW abstractC5681TW2, C422159 c422159) {
        this.A01 = abstractC5681TW;
        this.A02 = abstractC5681TW2;
        this.A00 = c422159;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        C5245MS.A0H(this.A02);
        new Handler().postDelayed(new C5684TZ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

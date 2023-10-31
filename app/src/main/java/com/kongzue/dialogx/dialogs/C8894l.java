package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.ambrose.overwall.R;
import com.kongzue.dialogx.dialogs.C8887i;
import com.kongzue.dialogx.interfaces.AbstractC8933e;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* renamed from: com.kongzue.dialogx.dialogs.l */
/* loaded from: classes3.dex */
public final class C8894l extends AbstractC8933e<C8887i> {

    /* renamed from: a */
    public final /* synthetic */ C8887i.C8888a f16951a;

    public C8894l(C8887i.C8888a c8888a) {
        this.f16951a = c8888a;
    }

    /* renamed from: a */
    public final void m2907a(BaseDialog baseDialog) {
        C8887i c8887i = (C8887i) baseDialog;
        C8887i.C8888a c8888a = this.f16951a;
        C8887i.this.f17020i.getClass();
        C8887i c8887i2 = C8887i.this;
        c8887i2.f17020i.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(c8887i2.m2871k(), R.anim.anim_dialogx_default_exit);
        long m2909b = c8888a.m2909b(loadAnimation);
        loadAnimation.setInterpolator(new AccelerateInterpolator());
        loadAnimation.setDuration(m2909b);
        c8888a.f16934c.startAnimation(loadAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(m2909b);
        ofFloat.addUpdateListener(new C8893k(this));
        ofFloat.start();
    }

    /* renamed from: b */
    public final void m2906b(BaseDialog baseDialog) {
        Animation animation;
        long j;
        C8887i c8887i = (C8887i) baseDialog;
        C8887i.C8888a c8888a = this.f16951a;
        C8887i.this.f17020i.getClass();
        C8887i c8887i2 = C8887i.this;
        c8887i2.f17020i.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(c8887i2.m2871k(), R.anim.anim_dialogx_default_enter);
        MaxRelativeLayout maxRelativeLayout = c8888a.f16934c;
        if (loadAnimation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        } else {
            animation = loadAnimation;
        }
        if (animation != null && animation.getDuration() != 0) {
            j = animation.getDuration();
        } else {
            j = 300;
        }
        long j2 = c8887i2.f17024m;
        if (j2 >= 0) {
            j = j2;
        }
        loadAnimation.setDuration(j);
        loadAnimation.setInterpolator(new DecelerateInterpolator());
        maxRelativeLayout.startAnimation(loadAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C8892j(this));
        ofFloat.start();
    }
}

package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.ambrose.overwall.R;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.interfaces.AbstractC8933e;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* renamed from: com.kongzue.dialogx.dialogs.w */
/* loaded from: classes3.dex */
public final class C8912w extends AbstractC8933e<C8897o> {

    /* renamed from: a */
    public final /* synthetic */ C8897o.C8899b f16992a;

    public C8912w(C8897o.C8899b c8899b) {
        this.f16992a = c8899b;
    }

    /* renamed from: a */
    public final void m2891a(BaseDialog baseDialog) {
        C8897o c8897o = (C8897o) baseDialog;
        C8897o.C8899b c8899b = this.f16992a;
        Context m2871k = C8897o.this.m2871k();
        if (m2871k == null) {
            m2871k = c8899b.f16971b.getContext();
        }
        if (m2871k != null) {
            C8897o.this.getClass();
            Animation loadAnimation = AnimationUtils.loadAnimation(m2871k, R.anim.anim_dialogx_default_exit);
            long m2894b = c8899b.m2894b(loadAnimation);
            loadAnimation.setDuration(m2894b);
            loadAnimation.setInterpolator(new AccelerateInterpolator());
            c8899b.f16972c.startAnimation(loadAnimation);
            c8899b.f16971b.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(m2894b);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(m2894b);
            ofFloat.addUpdateListener(new C8911v(this));
            ofFloat.start();
        }
    }

    /* renamed from: b */
    public final void m2890b(BaseDialog baseDialog) {
        Animation animation;
        long j;
        C8897o c8897o = (C8897o) baseDialog;
        C8897o.C8899b c8899b = this.f16992a;
        C8897o.this.getClass();
        C8897o c8897o2 = C8897o.this;
        Animation loadAnimation = AnimationUtils.loadAnimation(c8897o2.m2871k(), R.anim.anim_dialogx_default_enter);
        if (loadAnimation == null && c8899b.f16972c.getAnimation() != null) {
            animation = c8899b.f16972c.getAnimation();
        } else {
            animation = loadAnimation;
        }
        if (animation != null && animation.getDuration() != 0) {
            j = animation.getDuration();
        } else {
            j = 300;
        }
        long j2 = c8897o2.f17024m;
        if (j2 >= 0) {
            j = j2;
        }
        loadAnimation.setInterpolator(new DecelerateInterpolator());
        loadAnimation.setDuration(j);
        c8899b.f16972c.startAnimation(loadAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C8910u(this));
        ofFloat.start();
        c8899b.f16971b.animate().setDuration(j).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
    }
}

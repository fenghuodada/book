package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.C7769a;

/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes3.dex */
public final class C7871h extends AbstractC7890u {

    /* renamed from: e */
    public final int f15502e;

    /* renamed from: f */
    public final int f15503f;
    @NonNull

    /* renamed from: g */
    public final TimeInterpolator f15504g;
    @NonNull

    /* renamed from: h */
    public final TimeInterpolator f15505h;
    @Nullable

    /* renamed from: i */
    public EditText f15506i;

    /* renamed from: j */
    public final View$OnClickListenerC7866d f15507j;

    /* renamed from: k */
    public final View$OnFocusChangeListenerC7868e f15508k;

    /* renamed from: l */
    public AnimatorSet f15509l;

    /* renamed from: m */
    public ValueAnimator f15510m;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.d] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.e] */
    public C7871h(@NonNull C7885t c7885t) {
        super(c7885t);
        this.f15507j = new View.OnClickListener() { // from class: com.google.android.material.textfield.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7871h c7871h = C7871h.this;
                EditText editText = c7871h.f15506i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c7871h.m4342q();
            }
        };
        this.f15508k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C7871h c7871h = C7871h.this;
                c7871h.m4379t(c7871h.m4378u());
            }
        };
        this.f15502e = C7769a.m4500c(c7885t.getContext(), R.attr.motionDurationShort3, 100);
        this.f15503f = C7769a.m4500c(c7885t.getContext(), R.attr.motionDurationShort3, 150);
        this.f15504g = C7769a.m4499d(c7885t.getContext(), R.attr.motionEasingLinearInterpolator, C7556a.f14282a);
        this.f15505h = C7769a.m4499d(c7885t.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7556a.f14285d);
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: a */
    public final void mo4358a() {
        if (this.f15566b.f15551p != null) {
            return;
        }
        m4379t(m4378u());
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: c */
    public final int mo4356c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: d */
    public final int mo4355d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: e */
    public final View.OnFocusChangeListener mo4354e() {
        return this.f15508k;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: f */
    public final View.OnClickListener mo4353f() {
        return this.f15507j;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: g */
    public final View.OnFocusChangeListener mo4352g() {
        return this.f15508k;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: m */
    public final void mo4346m(@Nullable EditText editText) {
        this.f15506i = editText;
        this.f15565a.setEndIconVisible(m4378u());
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: p */
    public final void mo4343p(boolean z) {
        if (this.f15566b.f15551p == null) {
            return;
        }
        m4379t(z);
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: r */
    public final void mo4341r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f15505h);
        ofFloat.setDuration(this.f15503f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7871h c7871h = C7871h.this;
                c7871h.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c7871h.f15568d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15504g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.f15502e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7871h c7871h = C7871h.this;
                c7871h.getClass();
                c7871h.f15568d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15509l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f15509l.addListener(new C7869f(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7871h c7871h = C7871h.this;
                c7871h.getClass();
                c7871h.f15568d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f15510m = ofFloat3;
        ofFloat3.addListener(new C7870g(this));
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: s */
    public final void mo4340s() {
        EditText editText = this.f15506i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.a
                @Override // java.lang.Runnable
                public final void run() {
                    C7871h.this.m4379t(true);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m4379t(boolean z) {
        boolean z2 = this.f15566b.m4370c() == z;
        if (z && !this.f15509l.isRunning()) {
            this.f15510m.cancel();
            this.f15509l.start();
            if (z2) {
                this.f15509l.end();
            }
        } else if (z) {
        } else {
            this.f15509l.cancel();
            this.f15510m.start();
            if (z2) {
                this.f15510m.end();
            }
        }
    }

    /* renamed from: u */
    public final boolean m4378u() {
        EditText editText = this.f15506i;
        return editText != null && (editText.hasFocus() || this.f15568d.hasFocus()) && this.f15506i.getText().length() > 0;
    }
}

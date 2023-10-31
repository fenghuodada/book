package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0383m0;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.animation.C7557b;
import com.google.android.material.motion.C7769a;
import com.google.android.material.resources.C7774c;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.textfield.w */
/* loaded from: classes3.dex */
public final class C7892w {
    @Nullable

    /* renamed from: A */
    public ColorStateList f15569A;

    /* renamed from: B */
    public Typeface f15570B;

    /* renamed from: a */
    public final int f15571a;

    /* renamed from: b */
    public final int f15572b;

    /* renamed from: c */
    public final int f15573c;
    @NonNull

    /* renamed from: d */
    public final TimeInterpolator f15574d;
    @NonNull

    /* renamed from: e */
    public final TimeInterpolator f15575e;
    @NonNull

    /* renamed from: f */
    public final TimeInterpolator f15576f;

    /* renamed from: g */
    public final Context f15577g;
    @NonNull

    /* renamed from: h */
    public final TextInputLayout f15578h;

    /* renamed from: i */
    public LinearLayout f15579i;

    /* renamed from: j */
    public int f15580j;

    /* renamed from: k */
    public FrameLayout f15581k;
    @Nullable

    /* renamed from: l */
    public Animator f15582l;

    /* renamed from: m */
    public final float f15583m;

    /* renamed from: n */
    public int f15584n;

    /* renamed from: o */
    public int f15585o;
    @Nullable

    /* renamed from: p */
    public CharSequence f15586p;

    /* renamed from: q */
    public boolean f15587q;
    @Nullable

    /* renamed from: r */
    public C0383m0 f15588r;
    @Nullable

    /* renamed from: s */
    public CharSequence f15589s;

    /* renamed from: t */
    public int f15590t;

    /* renamed from: u */
    public int f15591u;
    @Nullable

    /* renamed from: v */
    public ColorStateList f15592v;

    /* renamed from: w */
    public CharSequence f15593w;

    /* renamed from: x */
    public boolean f15594x;
    @Nullable

    /* renamed from: y */
    public C0383m0 f15595y;

    /* renamed from: z */
    public int f15596z;

    /* renamed from: com.google.android.material.textfield.w$a */
    /* loaded from: classes3.dex */
    public class C7893a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f15597a;

        /* renamed from: b */
        public final /* synthetic */ TextView f15598b;

        /* renamed from: c */
        public final /* synthetic */ int f15599c;

        /* renamed from: d */
        public final /* synthetic */ TextView f15600d;

        public C7893a(int i, TextView textView, int i2, TextView textView2) {
            this.f15597a = i;
            this.f15598b = textView;
            this.f15599c = i2;
            this.f15600d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C0383m0 c0383m0;
            int i = this.f15597a;
            C7892w c7892w = C7892w.this;
            c7892w.f15584n = i;
            c7892w.f15582l = null;
            TextView textView = this.f15598b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f15599c == 1 && (c0383m0 = c7892w.f15588r) != null) {
                    c0383m0.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f15600d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f15600d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public C7892w(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15577g = context;
        this.f15578h = textInputLayout;
        this.f15583m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f15571a = C7769a.m4500c(context, R.attr.motionDurationShort4, 217);
        this.f15572b = C7769a.m4500c(context, R.attr.motionDurationMedium4, 167);
        this.f15573c = C7769a.m4500c(context, R.attr.motionDurationShort4, 167);
        this.f15574d = C7769a.m4499d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C7556a.f14285d);
        LinearInterpolator linearInterpolator = C7556a.f14282a;
        this.f15575e = C7769a.m4499d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f15576f = C7769a.m4499d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m4335a(TextView textView, int i) {
        if (this.f15579i == null && this.f15581k == null) {
            Context context = this.f15577g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15579i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15579i;
            TextInputLayout textInputLayout = this.f15578h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15581k = new FrameLayout(context);
            this.f15579i.addView(this.f15581k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m4334b();
            }
        }
        if (i == 0 || i == 1) {
            this.f15581k.setVisibility(0);
            this.f15581k.addView(textView);
        } else {
            this.f15579i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15579i.setVisibility(0);
        this.f15580j++;
    }

    /* renamed from: b */
    public final void m4334b() {
        boolean z;
        LinearLayout linearLayout = this.f15579i;
        TextInputLayout textInputLayout = this.f15578h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f15577g;
            boolean m4492d = C7774c.m4492d(context);
            LinearLayout linearLayout2 = this.f15579i;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            int m11740f = ViewCompat.C0815e.m11740f(editText);
            if (m4492d) {
                m11740f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (m4492d) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int m11741e = ViewCompat.C0815e.m11741e(editText);
            if (m4492d) {
                m11741e = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            ViewCompat.C0815e.m11735k(linearLayout2, m11740f, dimensionPixelSize, m11741e, 0);
        }
    }

    /* renamed from: c */
    public final void m4333c() {
        Animator animator = this.f15582l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void m4332d(@NonNull ArrayList arrayList, boolean z, @Nullable TextView textView, int i, int i2, int i3) {
        boolean z2;
        boolean z3;
        float f;
        int i4;
        TimeInterpolator timeInterpolator;
        boolean z4;
        if (textView != null && z) {
            if (i != i3 && i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (i3 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                int i5 = this.f15573c;
                if (z3) {
                    i4 = this.f15572b;
                } else {
                    i4 = i5;
                }
                ofFloat.setDuration(i4);
                if (z3) {
                    timeInterpolator = this.f15575e;
                } else {
                    timeInterpolator = this.f15576f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ofFloat.setStartDelay(i5);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f15583m, 0.0f);
                    ofFloat2.setDuration(this.f15571a);
                    ofFloat2.setInterpolator(this.f15574d);
                    ofFloat2.setStartDelay(i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public final TextView m4331e(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f15595y;
        }
        return this.f15588r;
    }

    /* renamed from: f */
    public final void m4330f() {
        this.f15586p = null;
        m4333c();
        if (this.f15584n == 1) {
            this.f15585o = (!this.f15594x || TextUtils.isEmpty(this.f15593w)) ? 0 : 2;
        }
        m4327i(this.f15584n, this.f15585o, m4328h(this.f15588r, ""));
    }

    /* renamed from: g */
    public final void m4329g(TextView textView, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f15579i;
        if (viewGroup2 == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (viewGroup = this.f15581k) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i2 = this.f15580j - 1;
        this.f15580j = i2;
        LinearLayout linearLayout = this.f15579i;
        if (i2 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m4328h(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        TextInputLayout textInputLayout = this.f15578h;
        if (ViewCompat.C0817g.m11729c(textInputLayout) && textInputLayout.isEnabled() && (this.f15585o != this.f15584n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m4327i(int i, int i2, boolean z) {
        TextView m4331e;
        TextView m4331e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15582l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m4332d(arrayList, this.f15594x, this.f15595y, 2, i, i2);
            m4332d(arrayList, this.f15587q, this.f15588r, 1, i, i2);
            C7557b.m4808a(animatorSet, arrayList);
            animatorSet.addListener(new C7893a(i2, m4331e(i), i, m4331e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (m4331e2 = m4331e(i2)) != null) {
                m4331e2.setVisibility(0);
                m4331e2.setAlpha(1.0f);
            }
            if (i != 0 && (m4331e = m4331e(i)) != null) {
                m4331e.setVisibility(4);
                if (i == 1) {
                    m4331e.setText((CharSequence) null);
                }
            }
            this.f15584n = i2;
        }
        TextInputLayout textInputLayout = this.f15578h;
        textInputLayout.m4392p();
        textInputLayout.m4389s(z, false);
        textInputLayout.m4386v();
    }
}

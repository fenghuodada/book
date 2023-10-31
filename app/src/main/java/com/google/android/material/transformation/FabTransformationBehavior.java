package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.C0171d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.res.C0672b;
import com.google.android.material.animation.C7556a;
import com.google.android.material.animation.C7563h;
import com.google.android.material.animation.C7564i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f15665c;

    /* renamed from: d */
    public final RectF f15666d;

    /* renamed from: e */
    public final RectF f15667e;

    /* renamed from: f */
    public final int[] f15668f;

    /* renamed from: g */
    public float f15669g;

    /* renamed from: h */
    public float f15670h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes3.dex */
    public class C7912a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f15671a;

        /* renamed from: b */
        public final /* synthetic */ View f15672b;

        /* renamed from: c */
        public final /* synthetic */ View f15673c;

        public C7912a(boolean z, View view, View view2) {
            this.f15671a = z;
            this.f15672b = view;
            this.f15673c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f15671a) {
                return;
            }
            this.f15672b.setVisibility(4);
            View view = this.f15673c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f15671a) {
                this.f15672b.setVisibility(0);
                View view = this.f15673c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes3.dex */
    public static class C7913b {
        @Nullable

        /* renamed from: a */
        public C7563h f15674a;

        /* renamed from: b */
        public C0672b f15675b;
    }

    public FabTransformationBehavior() {
        this.f15665c = new Rect();
        this.f15666d = new RectF();
        this.f15667e = new RectF();
        this.f15668f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15665c = new Rect();
        this.f15666d = new RectF();
        this.f15667e = new RectF();
        this.f15668f = new int[2];
    }

    @NonNull
    /* renamed from: v */
    public static Pair m4303v(float f, float f2, boolean z, @NonNull C7913b c7913b) {
        C7564i m4805c;
        C7563h c7563h;
        String str;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            m4805c = c7913b.f15674a.m4805c("translationXLinear");
            c7563h = c7913b.f15674a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            m4805c = c7913b.f15674a.m4805c("translationXCurveDownwards");
            c7563h = c7913b.f15674a;
            str = "translationYCurveDownwards";
        } else {
            m4805c = c7913b.f15674a.m4805c("translationXCurveUpwards");
            c7563h = c7913b.f15674a;
            str = "translationYCurveUpwards";
        }
        return new Pair(m4805c, c7563h.m4805c(str));
    }

    /* renamed from: y */
    public static float m4300y(@NonNull C7913b c7913b, @NonNull C7564i c7564i, float f) {
        long j = c7564i.f14296a;
        C7564i m4805c = c7913b.f15674a.m4805c("expansion");
        float interpolation = c7564i.m4803b().getInterpolation(((float) (((m4805c.f14296a + m4805c.f14297b) + 17) - j)) / ((float) c7564i.f14297b));
        LinearInterpolator linearInterpolator = C7556a.f14282a;
        return C0171d.m12907a(0.0f, f, interpolation, f);
    }

    /* renamed from: A */
    public abstract C7913b mo4297A(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @CallSuper
    /* renamed from: b */
    public final boolean mo2731b(@NonNull View view, @NonNull View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @CallSuper
    /* renamed from: c */
    public final void mo4304c(@NonNull CoordinatorLayout.C0590e c0590e) {
        if (c0590e.f2220h == 0) {
            c0590e.f2220h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ee A[LOOP:0: B:122:0x03ec->B:123:0x03ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036e  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @androidx.annotation.NonNull
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet mo4298u(@androidx.annotation.NonNull android.view.View r26, @androidx.annotation.NonNull android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo4298u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: w */
    public final float m4302w(@NonNull View view, @NonNull View view2, @NonNull C0672b c0672b) {
        RectF rectF = this.f15666d;
        RectF rectF2 = this.f15667e;
        m4299z(view, rectF);
        rectF.offset(this.f15669g, this.f15670h);
        m4299z(view2, rectF2);
        c0672b.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: x */
    public final float m4301x(@NonNull View view, @NonNull View view2, @NonNull C0672b c0672b) {
        RectF rectF = this.f15666d;
        RectF rectF2 = this.f15667e;
        m4299z(view, rectF);
        rectF.offset(this.f15669g, this.f15670h);
        m4299z(view2, rectF2);
        c0672b.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: z */
    public final void m4299z(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f15668f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }
}

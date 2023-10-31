package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.C7557b;
import com.google.android.material.animation.C7564i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C7564i f15676c;

    /* renamed from: d */
    public final C7564i f15677d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes3.dex */
    public class C7914a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f15678a;

        /* renamed from: b */
        public final /* synthetic */ View f15679b;

        public C7914a(boolean z, View view) {
            this.f15678a = z;
            this.f15679b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f15678a) {
                return;
            }
            this.f15679b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f15678a) {
                this.f15679b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f15676c = new C7564i(75L);
        this.f15677d = new C7564i(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15676c = new C7564i(75L);
        this.f15677d = new C7564i(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: b */
    public final boolean mo2731b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    public final boolean mo2597s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    /* renamed from: u */
    public final AnimatorSet mo4298u(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        C7564i c7564i;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            c7564i = this.f15676c;
        } else {
            c7564i = this.f15677d;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        c7564i.m4804a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C7557b.m4808a(animatorSet, arrayList);
        animatorSet.addListener(new C7914a(z, view2));
        return animatorSet;
    }
}

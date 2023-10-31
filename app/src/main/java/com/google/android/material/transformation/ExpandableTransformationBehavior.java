package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @Nullable

    /* renamed from: b */
    public AnimatorSet f15664b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    /* renamed from: t */
    public void mo4296t(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f15664b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo4298u = mo4298u(view, view2, z, z3);
        this.f15664b = mo4298u;
        mo4298u.addListener(new C7915a(this));
        this.f15664b.start();
        if (z2) {
            return;
        }
        this.f15664b.end();
    }

    @NonNull
    /* renamed from: u */
    public abstract AnimatorSet mo4298u(View view, View view2, boolean z, boolean z2);
}

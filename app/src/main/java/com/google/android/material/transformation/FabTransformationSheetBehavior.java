package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.res.C0672b;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7563h;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @Nullable

    /* renamed from: i */
    public HashMap f15680i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    /* renamed from: A */
    public final FabTransformationBehavior.C7913b mo4297A(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C7913b c7913b = new FabTransformationBehavior.C7913b();
        c7913b.f15674a = C7563h.m4807a(context, i);
        c7913b.f15675b = new C0672b();
        return c7913b;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    /* renamed from: t */
    public final void mo4296t(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        boolean z3;
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f15680i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.C0590e) && (((CoordinatorLayout.C0590e) childAt.getLayoutParams()).f2213a instanceof FabTransformationScrimBehavior)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.f15680i;
                    if (!z) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            i = ((Integer) this.f15680i.get(childAt)).intValue();
                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                        i = 4;
                    }
                    ViewCompat.C0814d.m11746s(childAt, i);
                }
            }
            if (!z) {
                this.f15680i = null;
            }
        }
        super.mo4296t(view, view2, z, z2);
    }
}

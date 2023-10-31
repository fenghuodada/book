package com.qmuiteam.qmui.nestedScroll;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0952j;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class QMUIContinuousNestedBottomAreaBehavior extends QMUIViewOffsetBehavior<View> {

    /* renamed from: c */
    public final Rect f17404c;

    /* renamed from: d */
    public final Rect f17405d;

    public QMUIContinuousNestedBottomAreaBehavior() {
        this.f17404c = new Rect();
        this.f17405d = new Rect();
    }

    public QMUIContinuousNestedBottomAreaBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17404c = new Rect();
        this.f17405d = new Rect();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: b */
    public final boolean mo2731b(@NonNull View view, @NonNull View view2) {
        return view2 instanceof InterfaceC9083c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: d */
    public final boolean mo2730d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        mo2721v(view2.getBottom() - m2723t());
        return false;
    }

    @Override // com.qmuiteam.qmui.nestedScroll.QMUIViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public final boolean mo2724h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.mo2724h(coordinatorLayout, view, i);
        ArrayList m12125d = coordinatorLayout.m12125d(view);
        if (m12125d.isEmpty()) {
            return true;
        }
        mo2721v(((View) m12125d.get(0)).getBottom() - m2723t());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: i */
    public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 == -1 || i4 == -2) {
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.m12117r(view, i, i2, View.MeasureSpec.makeMeasureSpec(size - 0, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }
        return false;
    }

    @Override // com.qmuiteam.qmui.nestedScroll.QMUIViewOffsetBehavior
    /* renamed from: u */
    public final void mo2722u(CoordinatorLayout coordinatorLayout, View view, int i) {
        ArrayList m12125d = coordinatorLayout.m12125d(view);
        if (!m12125d.isEmpty()) {
            View view2 = (View) m12125d.get(0);
            CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0590e).leftMargin;
            int bottom = view2.getBottom() + ((ViewGroup.MarginLayoutParams) c0590e).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0590e).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f17404c;
            rect.set(paddingLeft, bottom, width, ((view2.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0590e).bottomMargin);
            Rect rect2 = this.f17405d;
            int i2 = c0590e.f2215c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0952j.m11434b(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            return;
        }
        coordinatorLayout.m12118q(i, view);
    }
}

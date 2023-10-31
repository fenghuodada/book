package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C0728a;
import androidx.core.view.C0922g2;
import androidx.core.view.C0952j;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.appbar.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7579h extends C7580i<View> {

    /* renamed from: c */
    public final Rect f14367c;

    /* renamed from: d */
    public final Rect f14368d;

    /* renamed from: e */
    public int f14369e;

    /* renamed from: f */
    public int f14370f;

    public AbstractC7579h() {
        this.f14367c = new Rect();
        this.f14368d = new Rect();
        this.f14369e = 0;
    }

    public AbstractC7579h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14367c = new Rect();
        this.f14368d = new Rect();
        this.f14369e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: i */
    public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        AppBarLayout mo4777v;
        int i4;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo4777v = mo4777v(coordinatorLayout.m12125d(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0814d.m11763b(mo4777v) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m11642b() + lastWindowInsets.m11639e();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo4775x = mo4775x(mo4777v) + size;
            int measuredHeight = mo4777v.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                mo4775x -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m12117r(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo4775x, i4));
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.C7580i
    /* renamed from: u */
    public final void mo4773u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        AppBarLayout mo4777v = mo4777v(coordinatorLayout.m12125d(view));
        int i2 = 0;
        if (mo4777v != null) {
            CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0590e).leftMargin;
            int bottom = mo4777v.getBottom() + ((ViewGroup.MarginLayoutParams) c0590e).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0590e).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f14367c;
            rect.set(paddingLeft, bottom, width, ((mo4777v.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0590e).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0814d.m11763b(coordinatorLayout) && !ViewCompat.C0814d.m11763b(view)) {
                    rect.left = lastWindowInsets.m11641c() + rect.left;
                    rect.right -= lastWindowInsets.m11640d();
                }
            }
            Rect rect2 = this.f14368d;
            int i3 = c0590e.f2215c;
            if (i3 == 0) {
                i3 = 8388659;
            }
            C0952j.m11434b(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f14370f != 0) {
                float mo4776w = mo4776w(mo4777v);
                int i4 = this.f14370f;
                i2 = C0728a.m11870a((int) (mo4776w * i4), 0, i4);
            }
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            i2 = rect2.top - mo4777v.getBottom();
        } else {
            coordinatorLayout.m12118q(i, view);
        }
        this.f14369e = i2;
    }

    @Nullable
    /* renamed from: v */
    public abstract AppBarLayout mo4777v(ArrayList arrayList);

    /* renamed from: w */
    public float mo4776w(View view) {
        return 1.0f;
    }

    /* renamed from: x */
    public int mo4775x(@NonNull View view) {
        return view.getMeasuredHeight();
    }
}

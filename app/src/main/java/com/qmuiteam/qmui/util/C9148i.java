package com.qmuiteam.qmui.util;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qmuiteam.qmui.util.i */
/* loaded from: classes3.dex */
public final class C9148i {

    /* renamed from: a */
    public static final /* synthetic */ int f17583a = 0;

    /* renamed from: com.qmuiteam.qmui.util.i$a */
    /* loaded from: classes3.dex */
    public static class C9149a {

        /* renamed from: a */
        public static final ThreadLocal<Matrix> f17584a = new ThreadLocal<>();

        /* renamed from: b */
        public static final ThreadLocal<RectF> f17585b = new ThreadLocal<>();

        /* renamed from: a */
        public static void m2627a(ViewParent viewParent, View view, Matrix matrix) {
            ViewParent parent = view.getParent();
            if ((parent instanceof View) && parent != viewParent) {
                View view2 = (View) parent;
                m2627a(viewParent, view2, matrix);
                matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
            }
            matrix.preTranslate(view.getLeft(), view.getTop());
            if (view.getMatrix().isIdentity()) {
                return;
            }
            matrix.preConcat(view.getMatrix());
        }
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static void m2629a(ViewGroup viewGroup, ViewGroup viewGroup2, Rect rect) {
        rect.set(0, 0, viewGroup2.getWidth(), viewGroup2.getHeight());
        ThreadLocal<Matrix> threadLocal = C9149a.f17584a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        C9149a.m2627a(viewGroup, viewGroup2, matrix);
        ThreadLocal<RectF> threadLocal2 = C9149a.f17585b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: b */
    public static void m2628b(View view, Drawable drawable) {
        int[] iArr = {view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        view.setBackground(drawable);
        view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}

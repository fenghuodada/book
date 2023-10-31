package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes3.dex */
public final class C7745d {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f15085a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f15086b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m4517a(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal = f15085a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m4516b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f15086b;
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
    public static void m4516b(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m4516b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}

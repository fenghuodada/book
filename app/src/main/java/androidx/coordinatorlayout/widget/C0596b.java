package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes.dex */
public final class C0596b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f2236a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f2237b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m12106a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m12106a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}

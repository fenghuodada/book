package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.view.d2 */
/* loaded from: classes.dex */
public final class C0907d2 {
    @DoNotInline
    /* renamed from: a */
    public static boolean m11506a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m11505b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11504c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    @DoNotInline
    /* renamed from: d */
    public static void m11503d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    @DoNotInline
    /* renamed from: e */
    public static void m11502e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    @DoNotInline
    /* renamed from: f */
    public static boolean m11501f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    @DoNotInline
    /* renamed from: g */
    public static void m11500g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}

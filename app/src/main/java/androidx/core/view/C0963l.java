package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* renamed from: androidx.core.view.l */
/* loaded from: classes.dex */
public final class C0963l {
    @DoNotInline
    /* renamed from: a */
    public static int m11423a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    @DoNotInline
    /* renamed from: b */
    public static int m11422b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @DoNotInline
    /* renamed from: c */
    public static int m11421c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @DoNotInline
    /* renamed from: d */
    public static boolean m11420d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @DoNotInline
    /* renamed from: e */
    public static void m11419e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    @DoNotInline
    /* renamed from: f */
    public static void m11418f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    @DoNotInline
    /* renamed from: g */
    public static void m11417g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    @DoNotInline
    /* renamed from: h */
    public static void m11416h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}

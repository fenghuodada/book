package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* renamed from: androidx.core.view.j */
/* loaded from: classes.dex */
public final class C0952j {
    @DoNotInline
    /* renamed from: a */
    public static void m11435a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    @DoNotInline
    /* renamed from: b */
    public static void m11434b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11433c(int i, Rect rect, Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }
}

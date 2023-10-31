package androidx.core.widget;

import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: androidx.core.widget.k */
/* loaded from: classes.dex */
public final class C1056k {
    @DoNotInline
    /* renamed from: a */
    public static boolean m11248a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    @DoNotInline
    /* renamed from: b */
    public static int m11247b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11246c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    @DoNotInline
    /* renamed from: d */
    public static void m11245d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}

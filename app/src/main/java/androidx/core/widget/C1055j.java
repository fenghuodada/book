package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C1055j {
    @DoNotInline
    /* renamed from: a */
    public static void m11249a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}

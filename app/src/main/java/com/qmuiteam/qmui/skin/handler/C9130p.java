package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.widget.C9206e;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.p */
/* loaded from: classes3.dex */
public final class C9130p extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateList);
        } else if (view instanceof C9094c) {
            ((C9094c) view).setTextColor(colorStateList.getDefaultColor());
        } else if (view instanceof C9206e) {
            ((C9206e) view).setTextColor(colorStateList.getDefaultColor());
        } else {
            int i = C9106f.f17535a;
            view.getClass();
        }
    }
}

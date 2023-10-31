package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import com.qmuiteam.qmui.layout.IQMUILayout;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.widget.C9209f;
import com.qmuiteam.qmui.widget.C9210g;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.e */
/* loaded from: classes3.dex */
public final class C9119e extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        if (view instanceof IQMUILayout) {
            ((IQMUILayout) view).setBorderColor(colorStateList.getDefaultColor());
        } else if (view instanceof C9209f) {
            ((C9209f) view).setBorderColor(colorStateList.getDefaultColor());
        } else if (view instanceof QMUIRoundButton) {
            ((QMUIRoundButton) view).setStrokeColors(colorStateList);
        } else if (view instanceof C9210g.C9212b) {
            ((C9210g.C9212b) view).setBorderColor(colorStateList.getDefaultColor());
        } else {
            int i = C9106f.f17535a;
            view.getClass();
        }
    }
}

package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.core.widget.C1045b;
import androidx.core.widget.C1052g;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.widget.QMUILoadingView;
import com.qmuiteam.qmui.widget.pullRefreshLayout.C9233b;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.s */
/* loaded from: classes3.dex */
public final class C9133s extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        if (view instanceof QMUILoadingView) {
            ((QMUILoadingView) view).setColor(colorStateList.getDefaultColor());
        } else if (view instanceof C9233b.C9239f) {
            ((C9233b.C9239f) view).setColorSchemeColors(colorStateList.getDefaultColor());
        } else if (view instanceof ImageView) {
            C1052g.m11253c((ImageView) view, colorStateList);
        } else if (view instanceof CompoundButton) {
            C1045b.m11266c((CompoundButton) view, colorStateList);
        } else {
            int i = C9106f.f17535a;
            view.getClass();
        }
    }
}

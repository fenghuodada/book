package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.r */
/* loaded from: classes3.dex */
public final class C9132r extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setCompoundDrawableTintList(colorStateList);
            return;
        }
        int i = C9106f.f17535a;
        view.getClass();
    }
}

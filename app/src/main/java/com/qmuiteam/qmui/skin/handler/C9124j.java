package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.widget.C9210g;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.j */
/* loaded from: classes3.dex */
public final class C9124j extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (view instanceof TextView) {
            ((TextView) view).setHintTextColor(colorStateList);
        } else if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setHintTextColor(colorStateList);
        } else if (view instanceof C9210g) {
            ((C9210g) view).setRecordProgressColor(colorStateList.getDefaultColor());
        } else {
            int i = C9106f.f17535a;
            view.getClass();
        }
    }
}

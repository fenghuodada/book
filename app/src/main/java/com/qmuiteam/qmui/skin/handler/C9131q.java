package com.qmuiteam.qmui.skin.handler;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.q */
/* loaded from: classes3.dex */
public final class C9131q extends AbstractC9122h {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9122h
    /* renamed from: b */
    public final void mo2659b(@NotNull View view, @NotNull String str, Drawable drawable) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if ("tclSrc".equals(str)) {
                compoundDrawables[0] = drawable;
            } else if ("tctSrc".equals(str)) {
                compoundDrawables[1] = drawable;
            } else if ("tcrSrc".equals(str)) {
                compoundDrawables[2] = drawable;
            } else if ("tcbSrc".equals(str)) {
                compoundDrawables[3] = drawable;
            }
            textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return;
        }
        int i = C9106f.f17535a;
        view.getClass();
    }
}

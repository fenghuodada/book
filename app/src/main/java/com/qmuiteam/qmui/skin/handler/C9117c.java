package com.qmuiteam.qmui.skin.handler;

import android.content.res.Resources;
import android.view.View;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.widget.C9206e;
import com.qmuiteam.qmui.widget.C9210g;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.c */
/* loaded from: classes3.dex */
public final class C9117c implements InterfaceC9115a {
    @Override // com.qmuiteam.qmui.skin.handler.InterfaceC9115a
    /* renamed from: a */
    public final void mo2661a(@NotNull View view, @NotNull Resources.Theme theme, @NotNull String str, int i) {
        if (view instanceof QMUIRoundButton) {
            ((QMUIRoundButton) view).setBgData(C9145f.m2637d(i, view.getContext(), theme));
        } else if (view instanceof C9206e) {
            view.setBackgroundColor(C9145f.m2639b(i, theme));
        } else if (view instanceof C9210g) {
            ((C9210g) view).setBarNormalColor(C9145f.m2639b(i, theme));
        } else {
            C9148i.m2628b(view, C9145f.m2635f(i, view.getContext(), theme));
        }
    }
}

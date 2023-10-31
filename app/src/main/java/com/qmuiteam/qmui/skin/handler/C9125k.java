package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.k */
/* loaded from: classes3.dex */
public final class C9125k extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (view instanceof C9094c) {
            ((C9094c) view).setMoreActionBgColor(colorStateList);
            return;
        }
        int i = C9106f.f17535a;
        view.getClass();
    }
}

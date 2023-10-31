package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.InterfaceC0969m0;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.d */
/* loaded from: classes3.dex */
public final class C9118d extends AbstractC9121g {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9121g
    /* renamed from: b */
    public final void mo2658b(@NotNull View view, ColorStateList colorStateList) {
        if (view instanceof InterfaceC0969m0) {
            ((InterfaceC0969m0) view).setSupportBackgroundTintList(colorStateList);
            return;
        }
        int i = C9106f.f17535a;
        view.getClass();
    }
}

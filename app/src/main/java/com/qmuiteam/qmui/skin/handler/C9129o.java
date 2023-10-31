package com.qmuiteam.qmui.skin.handler;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.o */
/* loaded from: classes3.dex */
public final class C9129o extends AbstractC9122h {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9122h
    /* renamed from: b */
    public final void mo2659b(@NotNull View view, @NotNull String str, Drawable drawable) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        } else if (view instanceof CompoundButton) {
            ((CompoundButton) view).setButtonDrawable(drawable);
        } else {
            int i = C9106f.f17535a;
            view.getClass();
        }
    }
}

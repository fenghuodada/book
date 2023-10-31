package com.qmuiteam.qmui.skin.handler;

import android.view.View;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.widget.C9206e;
import com.qmuiteam.qmui.widget.C9210g;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.m */
/* loaded from: classes3.dex */
public final class C9127m extends AbstractC9120f {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9120f
    /* renamed from: b */
    public final void mo2660b(int i, @NotNull View view, @NotNull String str) {
        if (view instanceof C9206e) {
            ((C9206e) view).setProgressColor(i);
        } else if (view instanceof C9210g) {
            ((C9210g) view).setBarProgressColor(i);
        } else {
            int i2 = C9106f.f17535a;
            view.getClass();
        }
    }
}

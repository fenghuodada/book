package com.qmuiteam.qmui.skin.handler;

import android.view.View;
import com.qmuiteam.qmui.layout.IQMUILayout;
import com.qmuiteam.qmui.skin.C9106f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.n */
/* loaded from: classes3.dex */
public final class C9128n extends AbstractC9120f {
    @Override // com.qmuiteam.qmui.skin.handler.AbstractC9120f
    /* renamed from: b */
    public final void mo2660b(int i, @NotNull View view, @NotNull String str) {
        if (view instanceof IQMUILayout) {
            if ("topSeparator".equals(str)) {
                ((IQMUILayout) view).mo2540p(i);
                return;
            } else if ("bottomSeparator".equals(str)) {
                ((IQMUILayout) view).mo2544e(i);
                return;
            } else if ("LeftSeparator".equals(str)) {
                ((IQMUILayout) view).mo2542h(i);
                return;
            } else if ("rightSeparator".equals(str)) {
                ((IQMUILayout) view).mo2539q(i);
                return;
            } else {
                return;
            }
        }
        int i2 = C9106f.f17535a;
        view.getClass();
    }
}

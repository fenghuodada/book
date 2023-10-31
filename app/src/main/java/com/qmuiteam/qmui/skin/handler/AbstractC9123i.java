package com.qmuiteam.qmui.skin.handler;

import android.content.res.Resources;
import android.view.View;
import com.qmuiteam.qmui.util.C9145f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.i */
/* loaded from: classes3.dex */
public abstract class AbstractC9123i implements InterfaceC9115a {
    @Override // com.qmuiteam.qmui.skin.handler.InterfaceC9115a
    /* renamed from: a */
    public final void mo2661a(@NotNull View view, @NotNull Resources.Theme theme, @NotNull String str, int i) {
        view.setAlpha(C9145f.m2633h(i, theme));
    }
}

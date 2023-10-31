package com.qmuiteam.qmui.skin.handler;

import android.content.res.Resources;
import android.view.View;
import androidx.annotation.NonNull;
import com.qmuiteam.qmui.util.C9145f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9120f implements InterfaceC9115a {
    @Override // com.qmuiteam.qmui.skin.handler.InterfaceC9115a
    /* renamed from: a */
    public final void mo2661a(@NotNull View view, @NotNull Resources.Theme theme, @NotNull String str, int i) {
        mo2660b(C9145f.m2639b(i, theme), view, str);
    }

    /* renamed from: b */
    public abstract void mo2660b(int i, @NonNull View view, @NonNull String str);
}

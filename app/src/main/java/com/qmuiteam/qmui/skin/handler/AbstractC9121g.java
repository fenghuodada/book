package com.qmuiteam.qmui.skin.handler;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.NonNull;
import com.qmuiteam.qmui.util.C9145f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.g */
/* loaded from: classes3.dex */
public abstract class AbstractC9121g implements InterfaceC9115a {
    @Override // com.qmuiteam.qmui.skin.handler.InterfaceC9115a
    /* renamed from: a */
    public final void mo2661a(@NotNull View view, @NotNull Resources.Theme theme, @NotNull String str, int i) {
        mo2658b(view, C9145f.m2637d(i, view.getContext(), theme));
    }

    /* renamed from: b */
    public abstract void mo2658b(@NonNull View view, ColorStateList colorStateList);
}

package com.qmuiteam.qmui.skin.handler;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.qmuiteam.qmui.util.C9145f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.skin.handler.h */
/* loaded from: classes3.dex */
public abstract class AbstractC9122h implements InterfaceC9115a {
    @Override // com.qmuiteam.qmui.skin.handler.InterfaceC9115a
    /* renamed from: a */
    public final void mo2661a(@NonNull @NotNull View view, @NonNull @NotNull Resources.Theme theme, @NonNull @NotNull String str, int i) {
        mo2659b(view, str, C9145f.m2635f(i, view.getContext(), theme));
    }

    /* renamed from: b */
    public abstract void mo2659b(@NonNull View view, @NonNull String str, Drawable drawable);
}

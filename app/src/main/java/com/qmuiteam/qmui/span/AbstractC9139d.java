package com.qmuiteam.qmui.span;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.qmuiteam.qmui.link.InterfaceC9067a;
import com.qmuiteam.qmui.skin.InterfaceC9102d;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.span.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9139d extends ClickableSpan implements InterfaceC9067a, InterfaceC9102d {

    /* renamed from: a */
    public boolean f17572a;

    @Override // com.qmuiteam.qmui.skin.InterfaceC9102d
    /* renamed from: a */
    public final void mo2650a(@NotNull Resources.Theme theme) {
    }

    @Override // com.qmuiteam.qmui.link.InterfaceC9067a
    /* renamed from: b */
    public final void mo2649b(boolean z) {
        this.f17572a = z;
    }

    /* renamed from: c */
    public abstract void m2648c();

    @Override // android.text.style.ClickableSpan, com.qmuiteam.qmui.link.InterfaceC9067a
    public final void onClick(View view) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0817g.m11730b(view)) {
            m2648c();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(0);
        textPaint.bgColor = 0;
        textPaint.setUnderlineText(false);
    }
}

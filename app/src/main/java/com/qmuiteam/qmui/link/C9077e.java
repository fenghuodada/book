package com.qmuiteam.qmui.link;

import android.content.res.ColorStateList;
import android.text.TextPaint;
import com.qmuiteam.qmui.link.C9070d;
import com.qmuiteam.qmui.span.InterfaceC9138c;

/* renamed from: com.qmuiteam.qmui.link.e */
/* loaded from: classes3.dex */
public final class C9077e extends C9070d.AbstractC9076f {

    /* renamed from: d */
    public final /* synthetic */ ColorStateList f17402d;

    /* renamed from: e */
    public final /* synthetic */ ColorStateList f17403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9077e(String str, InterfaceC9138c interfaceC9138c, ColorStateList colorStateList, ColorStateList colorStateList2) {
        super(str, interfaceC9138c);
        this.f17402d = colorStateList;
        this.f17403e = colorStateList2;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        ColorStateList colorStateList = this.f17402d;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(new int[]{16842910, -16842919}, 0);
            int colorForState2 = colorStateList.getColorForState(new int[]{16842919}, colorForState);
            if (this.f17399a) {
                colorForState = colorForState2;
            }
            textPaint.linkColor = colorForState;
        }
        ColorStateList colorStateList2 = this.f17403e;
        if (colorStateList2 != null) {
            int colorForState3 = colorStateList2.getColorForState(new int[]{16842910, -16842919}, 0);
            int colorForState4 = colorStateList2.getColorForState(new int[]{16842919}, colorForState3);
            if (this.f17399a) {
                colorForState3 = colorForState4;
            }
            textPaint.bgColor = colorForState3;
        }
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

package com.qmuiteam.qmui.widget.roundwidget;

import android.content.res.ColorStateList;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.alpha.C8999a;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;

/* loaded from: classes3.dex */
public class QMUIRoundButton extends C8999a implements InterfaceC9103a {

    /* renamed from: f */
    public static final C0482i<String, Integer> f17941f;

    /* renamed from: e */
    public C9240a f17942e;

    static {
        C0482i<String, Integer> c0482i = new C0482i<>(3);
        f17941f = c0482i;
        c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_round_btn_bg_color));
        c0482i.put("border", Integer.valueOf((int) R.attr.qmui_skin_support_round_btn_border_color));
        c0482i.put("textColor", Integer.valueOf((int) R.attr.qmui_skin_support_round_btn_text_color));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
        if (r11 > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QMUIRoundButton(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 0
            r0.<init>(r1, r2, r3)
            int r4 = com.qmuiteam.qmui.widget.roundwidget.C9240a.f17943d
            int[] r4 = com.qmuiteam.qmui.C9056b.f17322q
            r5 = 2130968576(0x7f040000, float:1.754581E38)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r4, r5, r3)
            android.content.res.ColorStateList r2 = r1.getColorStateList(r3)
            r4 = 1
            android.content.res.ColorStateList r5 = r1.getColorStateList(r4)
            r6 = 2
            int r7 = r1.getDimensionPixelSize(r6, r3)
            r8 = 3
            boolean r9 = r1.getBoolean(r8, r3)
            r10 = 4
            int r11 = r1.getDimensionPixelSize(r10, r3)
            r12 = 7
            int r13 = r1.getDimensionPixelSize(r12, r3)
            r14 = 8
            int r15 = r1.getDimensionPixelSize(r14, r3)
            r12 = 5
            int r10 = r1.getDimensionPixelSize(r12, r3)
            r12 = 6
            int r8 = r1.getDimensionPixelSize(r12, r3)
            r1.recycle()
            com.qmuiteam.qmui.widget.roundwidget.a r1 = new com.qmuiteam.qmui.widget.roundwidget.a
            r1.<init>()
            r1.setColor(r2)
            r1.f17945b = r7
            r1.f17946c = r5
            r1.setStroke(r7, r5)
            if (r13 > 0) goto L63
            if (r15 > 0) goto L63
            if (r10 > 0) goto L63
            if (r8 <= 0) goto L5c
            goto L63
        L5c:
            float r2 = (float) r11
            r1.setCornerRadius(r2)
            if (r11 <= 0) goto L81
            goto L80
        L63:
            float[] r2 = new float[r14]
            float r5 = (float) r13
            r2[r3] = r5
            r2[r4] = r5
            float r4 = (float) r15
            r2[r6] = r4
            r5 = 3
            r2[r5] = r4
            float r4 = (float) r8
            r5 = 4
            r2[r5] = r4
            r5 = 5
            r2[r5] = r4
            float r4 = (float) r10
            r2[r12] = r4
            r5 = 7
            r2[r5] = r4
            r1.setCornerRadii(r2)
        L80:
            r9 = r3
        L81:
            r1.f17944a = r9
            r0.f17942e = r1
            com.qmuiteam.qmui.util.C9148i.m2628b(r0, r1)
            r0.setChangeAlphaWhenDisable(r3)
            r0.setChangeAlphaWhenPress(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return f17941f;
    }

    public int getStrokeWidth() {
        return this.f17942e.f17945b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f17942e.setColor(ColorStateList.valueOf(i));
    }

    public void setBgData(@Nullable ColorStateList colorStateList) {
        this.f17942e.setColor(colorStateList);
    }

    public void setStrokeColors(ColorStateList colorStateList) {
        C9240a c9240a = this.f17942e;
        int i = c9240a.f17945b;
        c9240a.f17945b = i;
        c9240a.f17946c = colorStateList;
        c9240a.setStroke(i, colorStateList);
    }
}

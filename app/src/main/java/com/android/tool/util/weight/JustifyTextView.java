package com.android.tool.util.weight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;

/* loaded from: classes.dex */
public class JustifyTextView extends QMUILinkTextView {

    /* renamed from: v */
    public int f6126v;

    /* renamed from: w */
    public int f6127w;

    public JustifyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        this.f6127w = getMeasuredWidth();
        String charSequence = getText().toString();
        int i3 = 0;
        this.f6126v = 0;
        this.f6126v = (int) (getTextSize() + 0);
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int spacingAdd = (int) (layout.getSpacingAdd() + (layout.getSpacingMultiplier() * ((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent))));
        int i4 = 0;
        while (i4 < layout.getLineCount()) {
            int lineStart = layout.getLineStart(i4);
            int lineEnd = layout.getLineEnd(i4);
            float desiredWidth = Layout.getDesiredWidth(charSequence, lineStart, lineEnd, getPaint());
            String substring = charSequence.substring(lineStart, lineEnd);
            float f = 0.0f;
            if (i4 < layout.getLineCount() - 1) {
                if (substring != null && substring.length() != 0 && substring.charAt(substring.length() - 1) != '\n') {
                    i = 1;
                } else {
                    i = i3;
                }
                if (i != 0) {
                    if (substring.length() > 3 && substring.charAt(i3) == ' ' && substring.charAt(1) == ' ') {
                        i2 = 1;
                    } else {
                        i2 = i3;
                    }
                    if (i2 != 0) {
                        canvas.drawText(" ", 0.0f, this.f6126v, getPaint());
                        f = 0.0f + Layout.getDesiredWidth(" ", getPaint());
                        substring = substring.substring(3);
                    }
                    int length = substring.length() - 1;
                    int i5 = 2;
                    if (substring.length() > 2 && substring.charAt(i3) == 12288 && substring.charAt(1) == 12288) {
                        String substring2 = substring.substring(i3, 2);
                        float desiredWidth2 = Layout.getDesiredWidth(substring2, getPaint());
                        canvas.drawText(substring2, f, this.f6126v, getPaint());
                        f += desiredWidth2;
                    } else {
                        i5 = 0;
                    }
                    float f2 = (this.f6127w - desiredWidth) / length;
                    while (i5 < substring.length()) {
                        String valueOf = String.valueOf(substring.charAt(i5));
                        float desiredWidth3 = Layout.getDesiredWidth(valueOf, getPaint());
                        canvas.drawText(valueOf, f, this.f6126v, getPaint());
                        f += desiredWidth3 + f2;
                        i5++;
                    }
                    this.f6126v += spacingAdd;
                    i4++;
                    i3 = 0;
                }
            }
            canvas.drawText(substring, 0.0f, this.f6126v, paint);
            this.f6126v += spacingAdd;
            i4++;
            i3 = 0;
        }
    }

    @Override // androidx.appcompat.widget.C0383m0, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}

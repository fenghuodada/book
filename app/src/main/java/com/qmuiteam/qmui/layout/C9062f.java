package com.qmuiteam.qmui.layout;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.qmuiteam.qmui.layout.f */
/* loaded from: classes3.dex */
public final class C9062f extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ C9063g f17330a;

    public C9062f(C9063g c9063g) {
        this.f17330a = c9063g;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width != 0 && height != 0) {
            C9063g c9063g = this.f17330a;
            float m2752l = c9063g.m2752l();
            float min = Math.min(width, height);
            if (m2752l * 2.0f > min) {
                m2752l = min / 2.0f;
            }
            float f = m2752l;
            if (c9063g.f17334D) {
                int i9 = c9063g.f17332B;
                if (i9 == 4) {
                    i7 = (int) (0 - f);
                    i5 = width;
                    i6 = height;
                    i8 = 0;
                } else if (i9 == 1) {
                    i8 = (int) (0 - f);
                    i5 = width;
                    i6 = height;
                    i7 = 0;
                } else {
                    if (i9 == 2) {
                        width = (int) (width + f);
                    } else if (i9 == 3) {
                        height = (int) (height + f);
                    }
                    i5 = width;
                    i6 = height;
                    i7 = 0;
                    i8 = 0;
                }
                outline.setRoundRect(i7, i8, i5, i6, f);
                return;
            }
            int i10 = c9063g.f17348R;
            int max = Math.max(i10 + 1, height - c9063g.f17349S);
            int i11 = c9063g.f17346P;
            int i12 = width - c9063g.f17347Q;
            if (c9063g.f17340J) {
                i4 = view.getPaddingLeft() + i11;
                int paddingTop = view.getPaddingTop() + i10;
                int max2 = Math.max(i4 + 1, i12 - view.getPaddingRight());
                i2 = Math.max(paddingTop + 1, max - view.getPaddingBottom());
                i = max2;
                i3 = paddingTop;
            } else {
                i = i12;
                i2 = max;
                i3 = i10;
                i4 = i11;
            }
            float f2 = c9063g.f17344N;
            if (c9063g.f17343M == 0) {
                f2 = 1.0f;
            }
            outline.setAlpha(f2);
            if (f <= 0.0f) {
                outline.setRect(i4, i3, i, i2);
            } else {
                outline.setRoundRect(i4, i3, i, i2, f);
            }
        }
    }
}

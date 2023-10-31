package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.C9065i;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9145f;

/* loaded from: classes3.dex */
public class QMUIBottomSheetRootLayout extends C9065i {

    /* renamed from: e */
    public final int f17678e;

    /* renamed from: f */
    public final float f17679f;

    /* renamed from: g */
    public final int f17680g;

    public QMUIBottomSheetRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setBackground(C9145f.m2635f(R.attr.qmui_skin_support_bottom_sheet_bg, context, context.getTheme()));
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2656b(R.attr.qmui_skin_support_bottom_sheet_bg);
        int i = C9106f.f17535a;
        C9106f.m2677c(this, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        int m2636e = C9145f.m2636e(context, R.attr.qmui_bottom_sheet_radius);
        if (m2636e > 0) {
            C9063g c9063g = this.f17376b;
            if (c9063g.f17331A != m2636e || 3 != c9063g.f17332B) {
                c9063g.m2744v(m2636e, c9063g.f17344N, 3, c9063g.f17343M);
            }
        }
        this.f17678e = C9145f.m2636e(context, R.attr.qmui_bottom_sheet_use_percent_min_height);
        this.f17679f = C9145f.m2633h(R.attr.qmui_bottom_sheet_height_percent, context.getTheme());
        this.f17680g = C9145f.m2636e(context, R.attr.qmui_bottom_sheet_max_width);
    }

    @Override // com.qmuiteam.qmui.layout.C9065i, com.qmuiteam.qmui.layout.C9064h, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f17680g;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 >= this.f17678e) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.f17679f), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}

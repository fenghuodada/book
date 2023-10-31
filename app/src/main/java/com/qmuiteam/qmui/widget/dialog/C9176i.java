package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.C9058b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.defaultAttr.C9104b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;

/* renamed from: com.qmuiteam.qmui.widget.dialog.i */
/* loaded from: classes3.dex */
public final class C9176i extends C9058b {

    /* renamed from: s */
    public final AppCompatImageView f17717s;

    /* renamed from: t */
    public AppCompatImageView f17718t;

    /* renamed from: u */
    public final QMUISpanTouchFixTextView f17719u;

    /* renamed from: v */
    public Object f17720v;

    public C9176i(Context context) {
        super(context, 0);
        setChangeAlphaWhenPress(true);
        setPadding(0, C9145f.m2636e(context, R.attr.qmui_bottom_sheet_grid_item_padding_top), 0, C9145f.m2636e(context, R.attr.qmui_bottom_sheet_grid_item_padding_bottom));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.f17717s = appCompatImageView;
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int m2636e = C9145f.m2636e(context, R.attr.qmui_bottom_sheet_grid_item_icon_size);
        ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(m2636e, m2636e);
        c0562a.f1960e = 0;
        c0562a.f1966h = 0;
        c0562a.f1968i = 0;
        addView(appCompatImageView, c0562a);
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView = new QMUISpanTouchFixTextView(context, null);
        this.f17719u = qMUISpanTouchFixTextView;
        qMUISpanTouchFixTextView.setId(View.generateViewId());
        C9104b c9104b = new C9104b();
        c9104b.f17534a.put("textColor", Integer.valueOf((int) R.attr.qmui_skin_support_bottom_sheet_grid_item_text_color));
        C9145f.m2640a(qMUISpanTouchFixTextView, R.attr.qmui_bottom_sheet_grid_item_text_style);
        int i = C9106f.f17535a;
        qMUISpanTouchFixTextView.setTag(R.id.qmui_skin_default_attr_provider, c9104b);
        ConstraintLayout.C0562a c0562a2 = new ConstraintLayout.C0562a(-2, -2);
        c0562a2.f1960e = 0;
        c0562a2.f1966h = 0;
        c0562a2.f1970j = appCompatImageView.getId();
        ((ViewGroup.MarginLayoutParams) c0562a2).topMargin = C9145f.m2636e(context, R.attr.qmui_bottom_sheet_grid_item_text_margin_top);
        addView(qMUISpanTouchFixTextView, c0562a2);
    }

    public Object getModelTag() {
        return this.f17720v;
    }
}

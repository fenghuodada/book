package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.alpha.C9002d;
import com.qmuiteam.qmui.layout.C9059c;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.util.C9152l;
import com.qmuiteam.qmui.util.C9156m;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;

/* loaded from: classes3.dex */
public class QMUITopBarLayout extends C9059c implements InterfaceC9103a {

    /* renamed from: c */
    public final QMUITopBar f17642c;

    /* renamed from: d */
    public final C0482i<String, Integer> f17643d;

    public QMUITopBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.QMUITopBarStyle);
        C0482i<String, Integer> c0482i = new C0482i<>(2);
        this.f17643d = c0482i;
        c0482i.put("bottomSeparator", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_separator_color));
        c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_bg));
        QMUITopBar qMUITopBar = new QMUITopBar(context, attributeSet, 0);
        this.f17642c = qMUITopBar;
        qMUITopBar.setBackground(null);
        qMUITopBar.setVisibility(0);
        qMUITopBar.setFitsSystemWindows(false);
        qMUITopBar.setId(View.generateViewId());
        C9063g c9063g = qMUITopBar.f17326b;
        c9063g.f17360k = 0;
        c9063g.f17361l = 0;
        c9063g.f17362m = 0;
        c9063g.f17359j = 0;
        qMUITopBar.invalidate();
        addView(qMUITopBar, new FrameLayout.LayoutParams(-1, qMUITopBar.getTopBarHeight()));
        C9152l.m2621a(this, new C9156m(), true);
    }

    /* renamed from: d */
    public final C9002d m2609d() {
        QMUITopBar qMUITopBar = this.f17642c;
        if (qMUITopBar.f17629n) {
            int i = C9148i.f17583a;
            if (qMUITopBar.getPaddingLeft() != 0) {
                qMUITopBar.setPadding(0, qMUITopBar.getPaddingTop(), qMUITopBar.getPaddingRight(), qMUITopBar.getPaddingBottom());
            }
        }
        int i2 = qMUITopBar.f17628m;
        int i3 = qMUITopBar.f17627l;
        if (i2 > 0) {
            return qMUITopBar.m2617f(i3, R.id.qmui_topbar_item_left_back, i2);
        }
        return qMUITopBar.m2617f(i3, R.id.qmui_topbar_item_left_back, -1);
    }

    /* renamed from: f */
    public final C9094c m2608f(String str) {
        return this.f17642c.m2611o(str);
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return this.f17643d;
    }

    @Nullable
    public QMUISpanTouchFixTextView getSubTitleView() {
        return this.f17642c.getSubTitleView();
    }

    @Nullable
    public C9094c getTitleView() {
        return this.f17642c.getTitleView();
    }

    public QMUITopBar getTopBar() {
        return this.f17642c;
    }

    public void setBackgroundAlpha(int i) {
        getBackground().mutate().setAlpha(i);
    }

    public void setCenterView(View view) {
        this.f17642c.setCenterView(view);
    }

    public void setTitleGravity(int i) {
        this.f17642c.setTitleGravity(i);
    }
}

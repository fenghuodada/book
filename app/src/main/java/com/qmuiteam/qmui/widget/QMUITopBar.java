package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.alpha.C9002d;
import com.qmuiteam.qmui.layout.QMUIRelativeLayout;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.InterfaceC9105e;
import com.qmuiteam.qmui.skin.defaultAttr.C9104b;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import com.qmuiteam.qmui.skin.handler.InterfaceC9115a;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class QMUITopBar extends QMUIRelativeLayout implements InterfaceC9105e, InterfaceC9103a {

    /* renamed from: E */
    public static final C0482i<String, Integer> f17613E;

    /* renamed from: A */
    public Rect f17614A;

    /* renamed from: B */
    public boolean f17615B;

    /* renamed from: C */
    public TextUtils.TruncateAt f17616C;

    /* renamed from: D */
    public C9104b f17617D;

    /* renamed from: c */
    public int f17618c;

    /* renamed from: d */
    public int f17619d;

    /* renamed from: e */
    public View f17620e;

    /* renamed from: f */
    public LinearLayout f17621f;

    /* renamed from: g */
    public C9094c f17622g;

    /* renamed from: h */
    public QMUISpanTouchFixTextView f17623h;

    /* renamed from: i */
    public ArrayList f17624i;

    /* renamed from: j */
    public ArrayList f17625j;

    /* renamed from: k */
    public int f17626k;

    /* renamed from: l */
    public int f17627l;

    /* renamed from: m */
    public int f17628m;

    /* renamed from: n */
    public boolean f17629n;

    /* renamed from: o */
    public int f17630o;

    /* renamed from: p */
    public Typeface f17631p;

    /* renamed from: q */
    public Typeface f17632q;

    /* renamed from: r */
    public int f17633r;

    /* renamed from: s */
    public int f17634s;

    /* renamed from: t */
    public int f17635t;

    /* renamed from: u */
    public int f17636u;

    /* renamed from: v */
    public int f17637v;

    /* renamed from: w */
    public int f17638w;

    /* renamed from: x */
    public int f17639x;

    /* renamed from: y */
    public int f17640y;

    /* renamed from: z */
    public int f17641z;

    static {
        C0482i<String, Integer> c0482i = new C0482i<>(4);
        f17613E = c0482i;
        c0482i.put("bottomSeparator", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_separator_color));
        c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_bg));
    }

    public QMUITopBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QMUITopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Typeface typeface;
        Typeface typeface2;
        TextUtils.TruncateAt truncateAt;
        this.f17641z = -1;
        this.f17615B = false;
        this.f17618c = -1;
        this.f17619d = -1;
        this.f17624i = new ArrayList();
        this.f17625j = new ArrayList();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9056b.f17325t, R.attr.QMUITopBarStyle, 0);
        this.f17627l = obtainStyledAttributes.getResourceId(4, R.drawable.qmui_icon_topbar_back);
        this.f17628m = obtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.f17629n = obtainStyledAttributes.getBoolean(1, false);
        this.f17626k = obtainStyledAttributes.getInt(16, 17);
        this.f17630o = obtainStyledAttributes.getDimensionPixelSize(18, C9141b.m2645b(context, 17));
        this.f17633r = obtainStyledAttributes.getDimensionPixelSize(19, C9141b.m2645b(context, 16));
        this.f17634s = obtainStyledAttributes.getDimensionPixelSize(8, C9141b.m2645b(context, 11));
        this.f17635t = obtainStyledAttributes.getColor(14, C9145f.m2639b(R.attr.qmui_config_color_gray_1, context.getTheme()));
        this.f17636u = obtainStyledAttributes.getColor(7, C9145f.m2639b(R.attr.qmui_config_color_gray_4, context.getTheme()));
        this.f17637v = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.f17638w = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f17639x = obtainStyledAttributes.getDimensionPixelSize(3, C9141b.m2646a(context, 48));
        this.f17640y = obtainStyledAttributes.getDimensionPixelSize(2, C9141b.m2646a(context, 48));
        obtainStyledAttributes.getDimensionPixelSize(11, C9141b.m2646a(context, 12));
        obtainStyledAttributes.getColorStateList(10);
        obtainStyledAttributes.getDimensionPixelSize(12, C9141b.m2645b(context, 16));
        if (obtainStyledAttributes.getBoolean(13, false)) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = null;
        }
        this.f17631p = typeface;
        if (obtainStyledAttributes.getBoolean(6, false)) {
            typeface2 = Typeface.DEFAULT_BOLD;
        } else {
            typeface2 = null;
        }
        this.f17632q = typeface2;
        if (obtainStyledAttributes.getBoolean(9, false)) {
            Typeface typeface3 = Typeface.DEFAULT_BOLD;
        }
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    this.f17616C = null;
                    obtainStyledAttributes.recycle();
                }
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            truncateAt = TextUtils.TruncateAt.START;
        }
        this.f17616C = truncateAt;
        obtainStyledAttributes.recycle();
    }

    @Override // com.qmuiteam.qmui.skin.InterfaceC9105e
    /* renamed from: d */
    public final void mo2553d(@NotNull C9108h c9108h, @NotNull Resources.Theme theme, @Nullable C0482i c0482i) {
        InterfaceC9115a interfaceC9115a;
        if (c0482i != null) {
            for (int i = 0; i < c0482i.f1531c; i++) {
                String str = (String) c0482i.m12398h(i);
                Integer num = (Integer) c0482i.m12397l(i);
                if (num != null && (!(getParent() instanceof QMUITopBarLayout) || (!"background".equals(str) && !"bottomSeparator".equals(str)))) {
                    int intValue = num.intValue();
                    c9108h.getClass();
                    if (intValue != 0 && (interfaceC9115a = C9108h.f17546l.get(str)) != null) {
                        interfaceC9115a.mo2661a(this, theme, str, intValue);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final C9002d m2617f(int i, int i2, int i3) {
        C9002d m2614l = m2614l(i);
        RelativeLayout.LayoutParams m2613m = m2613m(i3);
        int i4 = this.f17618c;
        if (i4 == -1) {
            m2613m.addRule(9);
        } else {
            m2613m.addRule(1, i4);
        }
        m2613m.alignWithParent = true;
        this.f17618c = i2;
        m2614l.setId(i2);
        this.f17624i.add(m2614l);
        addView(m2614l, m2613m);
        return m2614l;
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return f17613E;
    }

    @Nullable
    public QMUISpanTouchFixTextView getSubTitleView() {
        return this.f17623h;
    }

    public CharSequence getTitle() {
        C9094c c9094c = this.f17622g;
        if (c9094c == null) {
            return null;
        }
        return c9094c.getText();
    }

    public Rect getTitleContainerRect() {
        if (this.f17614A == null) {
            this.f17614A = new Rect();
        }
        LinearLayout linearLayout = this.f17621f;
        if (linearLayout == null) {
            this.f17614A.set(0, 0, 0, 0);
        } else {
            C9148i.m2629a(this, linearLayout, this.f17614A);
        }
        return this.f17614A;
    }

    public LinearLayout getTitleContainerView() {
        return this.f17621f;
    }

    @Nullable
    public C9094c getTitleView() {
        return this.f17622g;
    }

    public int getTopBarHeight() {
        if (this.f17641z == -1) {
            this.f17641z = C9145f.m2636e(getContext(), R.attr.qmui_topbar_height);
        }
        return this.f17641z;
    }

    /* renamed from: j */
    public final C9002d m2616j(int i, int i2) {
        C9002d m2614l = m2614l(i);
        RelativeLayout.LayoutParams m2613m = m2613m(-1);
        int i3 = this.f17619d;
        if (i3 == -1) {
            m2613m.addRule(11);
        } else {
            m2613m.addRule(0, i3);
        }
        m2613m.alignWithParent = true;
        this.f17619d = i2;
        m2614l.setId(i2);
        this.f17625j.add(m2614l);
        addView(m2614l, m2613m);
        return m2614l;
    }

    /* renamed from: k */
    public final void m2615k() {
        this.f17615B = true;
        super.setBackgroundDrawable(null);
    }

    /* renamed from: l */
    public final C9002d m2614l(int i) {
        C9002d c9002d = new C9002d(getContext());
        if (this.f17617D == null) {
            C9104b c9104b = new C9104b();
            c9104b.f17534a.put("tintColor", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_image_tint_color));
            this.f17617D = c9104b;
        }
        c9002d.setTag(R.id.qmui_skin_default_attr_provider, this.f17617D);
        c9002d.setBackgroundColor(0);
        c9002d.setImageResource(i);
        return c9002d;
    }

    /* renamed from: m */
    public final RelativeLayout.LayoutParams m2613m(int i) {
        int i2 = this.f17640y;
        if (i <= 0) {
            i = this.f17639x;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.topMargin = Math.max(0, (getTopBarHeight() - i2) / 2);
        return layoutParams;
    }

    /* renamed from: n */
    public final LinearLayout m2612n() {
        if (this.f17621f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f17621f = linearLayout;
            linearLayout.setOrientation(1);
            this.f17621f.setGravity(17);
            LinearLayout linearLayout2 = this.f17621f;
            int i = this.f17638w;
            linearLayout2.setPadding(i, 0, i, 0);
            addView(this.f17621f, new RelativeLayout.LayoutParams(-1, C9145f.m2636e(getContext(), R.attr.qmui_topbar_height)));
        }
        return this.f17621f;
    }

    /* renamed from: o */
    public final C9094c m2611o(String str) {
        int i;
        if (this.f17622g == null) {
            C9094c c9094c = new C9094c(getContext());
            this.f17622g = c9094c;
            c9094c.setGravity(17);
            this.f17622g.setSingleLine(true);
            this.f17622g.setEllipsize(this.f17616C);
            this.f17622g.setTypeface(this.f17631p);
            this.f17622g.setTextColor(this.f17635t);
            C9104b c9104b = new C9104b();
            c9104b.f17534a.put("textColor", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_title_color));
            this.f17622g.setTag(R.id.qmui_skin_default_attr_provider, c9104b);
            m2610r();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f17626k;
            m2612n().addView(this.f17622g, layoutParams);
        }
        C9094c c9094c2 = this.f17622g;
        c9094c2.setText(str);
        if (C9143d.m2642c(str)) {
            i = 8;
        } else {
            i = 0;
        }
        c9094c2.setVisibility(i);
        return c9094c2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C9160c) {
                m2612n();
                return;
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.f17621f;
        if (linearLayout != null) {
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = this.f17621f.getMeasuredHeight();
            int measuredHeight2 = ((i4 - i2) - this.f17621f.getMeasuredHeight()) / 2;
            int paddingLeft = getPaddingLeft();
            if ((this.f17626k & 7) == 1) {
                max = ((i3 - i) - this.f17621f.getMeasuredWidth()) / 2;
            } else {
                for (int i5 = 0; i5 < this.f17624i.size(); i5++) {
                    View view = (View) this.f17624i.get(i5);
                    if (view.getVisibility() != 8) {
                        paddingLeft = view.getMeasuredWidth() + paddingLeft;
                    }
                }
                max = Math.max(paddingLeft, this.f17637v);
            }
            this.f17621f.layout(max, measuredHeight2, measuredWidth + max, measuredHeight + measuredHeight2);
        }
    }

    @Override // com.qmuiteam.qmui.layout.QMUIRelativeLayout, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f17621f != null) {
            int paddingLeft = getPaddingLeft();
            for (int i3 = 0; i3 < this.f17624i.size(); i3++) {
                View view = (View) this.f17624i.get(i3);
                if (view.getVisibility() != 8) {
                    paddingLeft = view.getMeasuredWidth() + paddingLeft;
                }
            }
            int paddingRight = getPaddingRight();
            for (int i4 = 0; i4 < this.f17625j.size(); i4++) {
                View view2 = (View) this.f17625j.get(i4);
                if (view2.getVisibility() != 8) {
                    paddingRight = view2.getMeasuredWidth() + paddingRight;
                }
            }
            int max = Math.max(this.f17637v, paddingLeft);
            int max2 = Math.max(this.f17637v, paddingRight);
            int i5 = this.f17626k & 7;
            int size = View.MeasureSpec.getSize(i);
            this.f17621f.measure(View.MeasureSpec.makeMeasureSpec(i5 == 1 ? size - (Math.max(max, max2) * 2) : (size - max) - max2, 1073741824), i2);
        }
    }

    /* renamed from: r */
    public final void m2610r() {
        C9094c c9094c;
        int i;
        if (this.f17622g != null) {
            QMUISpanTouchFixTextView qMUISpanTouchFixTextView = this.f17623h;
            if (qMUISpanTouchFixTextView == null || C9143d.m2642c(qMUISpanTouchFixTextView.getText())) {
                c9094c = this.f17622g;
                i = this.f17630o;
            } else {
                c9094c = this.f17622g;
                i = this.f17633r;
            }
            c9094c.setTextSize(i);
        }
    }

    public void setBackgroundAlpha(int i) {
        getBackground().mutate().setAlpha(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f17615B) {
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCenterView(View view) {
        View view2 = this.f17620e;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            removeView(view2);
        }
        this.f17620e = view;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        addView(view, layoutParams);
    }

    public void setTitleGravity(int i) {
        this.f17626k = i;
        C9094c c9094c = this.f17622g;
        if (c9094c != null) {
            ((LinearLayout.LayoutParams) c9094c.getLayoutParams()).gravity = i;
            if (i == 17 || i == 1) {
                this.f17622g.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingLeft(), getPaddingBottom());
            }
        }
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView = this.f17623h;
        if (qMUISpanTouchFixTextView != null) {
            ((LinearLayout.LayoutParams) qMUISpanTouchFixTextView.getLayoutParams()).gravity = i;
        }
        requestLayout();
    }
}

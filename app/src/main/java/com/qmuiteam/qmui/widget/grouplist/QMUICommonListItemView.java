package com.qmuiteam.qmui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0343f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.layout.C9058b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9145f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class QMUICommonListItemView extends C9058b {

    /* renamed from: A */
    public ImageView f17822A;

    /* renamed from: B */
    public ImageView f17823B;

    /* renamed from: C */
    public boolean f17824C;

    /* renamed from: s */
    public int f17825s;

    /* renamed from: t */
    public int f17826t;

    /* renamed from: u */
    public int f17827u;

    /* renamed from: v */
    public ImageView f17828v;

    /* renamed from: w */
    public ViewGroup f17829w;

    /* renamed from: x */
    public TextView f17830x;

    /* renamed from: y */
    public TextView f17831y;

    /* renamed from: z */
    public C0343f f17832z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface QMUICommonListItemAccessoryType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface QMUICommonListItemOrientation {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface QMUICommonListItemTipPosition {
    }

    /* renamed from: com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView$a */
    /* loaded from: classes3.dex */
    public static class C9213a {
    }

    public QMUICommonListItemView(Context context) {
        super(context, R.attr.QMUICommonListItemViewStyle);
        this.f17826t = 1;
        this.f17827u = 0;
        this.f17824C = false;
        LayoutInflater.from(context).inflate(R.layout.qmui_common_list_item, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C9056b.f17307b, R.attr.QMUICommonListItemViewStyle, 0);
        int i = obtainStyledAttributes.getInt(3, 1);
        int i2 = obtainStyledAttributes.getInt(0, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f17828v = (ImageView) findViewById(R.id.group_list_item_imageView);
        this.f17830x = (TextView) findViewById(R.id.group_list_item_textView);
        this.f17822A = (ImageView) findViewById(R.id.group_list_item_tips_dot);
        this.f17823B = (ImageView) findViewById(R.id.group_list_item_tips_new);
        this.f17831y = (TextView) findViewById(R.id.group_list_item_detailTextView);
        this.f17830x.setTextColor(color);
        this.f17831y.setTextColor(color2);
        this.f17829w = (ViewGroup) findViewById(R.id.group_list_item_accessoryView);
        setOrientation(i);
        setAccessoryType(i2);
    }

    private ImageView getAccessoryImageView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setLayoutParams(getAccessoryLayoutParams());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        C9135i m2657a = C9135i.m2657a();
        m2657a.f17563a.put("tintColor", String.valueOf((int) R.attr.qmui_skin_support_common_list_chevron_color));
        int i = C9106f.f17535a;
        C9106f.m2677c(appCompatImageView, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        return appCompatImageView;
    }

    private ViewGroup.LayoutParams getAccessoryLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public ViewGroup getAccessoryContainerView() {
        return this.f17829w;
    }

    public int getAccessoryType() {
        return this.f17825s;
    }

    public CharSequence getDetailText() {
        return this.f17831y.getText();
    }

    public TextView getDetailTextView() {
        return this.f17831y;
    }

    public int getOrientation() {
        return this.f17826t;
    }

    public CheckBox getSwitch() {
        return this.f17832z;
    }

    public CharSequence getText() {
        return this.f17830x.getText();
    }

    public TextView getTextView() {
        return this.f17830x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r5 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAccessoryType(int r5) {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r4.f17829w
            r0.removeAllViews()
            r4.f17825s = r5
            r0 = 8
            r1 = 0
            if (r5 == 0) goto L75
            r2 = 1
            if (r5 == r2) goto L58
            r2 = 2
            if (r5 == r2) goto L16
            r2 = 3
            if (r5 == r2) goto L6f
            goto L7a
        L16:
            androidx.appcompat.widget.f r5 = r4.f17832z
            if (r5 != 0) goto L50
            androidx.appcompat.widget.f r5 = new androidx.appcompat.widget.f
            android.content.Context r2 = r4.getContext()
            r3 = 0
            r5.<init>(r2, r3)
            r4.f17832z = r5
            r5.setBackground(r3)
            androidx.appcompat.widget.f r5 = r4.f17832z
            android.content.Context r2 = r4.getContext()
            r3 = 2130969618(0x7f040412, float:1.7547923E38)
            android.graphics.drawable.Drawable r2 = com.qmuiteam.qmui.util.C9145f.m2634g(r2, r3)
            r5.setButtonDrawable(r2)
            androidx.appcompat.widget.f r5 = r4.f17832z
            android.view.ViewGroup$LayoutParams r2 = r4.getAccessoryLayoutParams()
            r5.setLayoutParams(r2)
            boolean r5 = r4.f17824C
            if (r5 == 0) goto L50
            androidx.appcompat.widget.f r5 = r4.f17832z
            r5.setClickable(r1)
            androidx.appcompat.widget.f r5 = r4.f17832z
            r5.setEnabled(r1)
        L50:
            android.view.ViewGroup r5 = r4.f17829w
            androidx.appcompat.widget.f r2 = r4.f17832z
            r5.addView(r2)
            goto L6f
        L58:
            android.widget.ImageView r5 = r4.getAccessoryImageView()
            android.content.Context r2 = r4.getContext()
            r3 = 2130969610(0x7f04040a, float:1.7547907E38)
            android.graphics.drawable.Drawable r2 = com.qmuiteam.qmui.util.C9145f.m2634g(r2, r3)
            r5.setImageDrawable(r2)
            android.view.ViewGroup r2 = r4.f17829w
            r2.addView(r5)
        L6f:
            android.view.ViewGroup r5 = r4.f17829w
            r5.setVisibility(r1)
            goto L7a
        L75:
            android.view.ViewGroup r5 = r4.f17829w
            r5.setVisibility(r0)
        L7a:
            android.widget.TextView r5 = r4.f17830x
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0562a) r5
            android.widget.TextView r2 = r4.f17831y
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.C0562a) r2
            android.view.ViewGroup r3 = r4.f17829w
            int r3 = r3.getVisibility()
            if (r3 == r0) goto L9b
            int r0 = r2.rightMargin
            r2.f1993y = r0
            int r0 = r5.rightMargin
            r5.f1993y = r0
            goto L9f
        L9b:
            r2.f1993y = r1
            r5.f1993y = r1
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView.setAccessoryType(int):void");
    }

    public void setDetailText(CharSequence charSequence) {
        TextView textView;
        int i;
        this.f17831y.setText(charSequence);
        if (C9143d.m2642c(charSequence)) {
            textView = this.f17831y;
            i = 8;
        } else {
            textView = this.f17831y;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setDisableSwitchSelf(boolean z) {
        this.f17824C = z;
        C0343f c0343f = this.f17832z;
        if (c0343f != null) {
            boolean z2 = !z;
            c0343f.setClickable(z2);
            this.f17832z.setEnabled(z2);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        ImageView imageView;
        int i;
        if (drawable == null) {
            imageView = this.f17828v;
            i = 8;
        } else {
            this.f17828v.setImageDrawable(drawable);
            imageView = this.f17828v;
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setOrientation(int i) {
        if (this.f17826t == i) {
            return;
        }
        this.f17826t = i;
        m2575x();
    }

    public void setSkinConfig(C9213a c9213a) {
        C9135i.m2657a();
        throw null;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        int i;
        this.f17830x.setText(charSequence);
        if (C9143d.m2642c(charSequence)) {
            textView = this.f17830x;
            i = 8;
        } else {
            textView = this.f17830x;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTipPosition(int i) {
        if (this.f17827u != i) {
            this.f17827u = i;
            m2575x();
        }
    }

    /* renamed from: x */
    public final void m2575x() {
        int m2636e;
        this.f17823B.setVisibility(8);
        this.f17822A.setVisibility(8);
        ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) this.f17830x.getLayoutParams();
        ConstraintLayout.C0562a c0562a2 = (ConstraintLayout.C0562a) this.f17831y.getLayoutParams();
        ConstraintLayout.C0562a c0562a3 = (ConstraintLayout.C0562a) this.f17823B.getLayoutParams();
        ConstraintLayout.C0562a c0562a4 = (ConstraintLayout.C0562a) this.f17822A.getLayoutParams();
        if (this.f17826t == 0) {
            this.f17830x.setTextSize(0, C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_title_v_text_size));
            this.f17831y.setTextSize(0, C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_detail_v_text_size));
            c0562a.f1936K = 2;
            c0562a.f1974l = -1;
            c0562a.f1972k = this.f17831y.getId();
            c0562a2.f1935J = -1;
            c0562a2.f1936K = 2;
            c0562a2.f1960e = this.f17830x.getId();
            c0562a2.f1962f = -1;
            c0562a2.f1930E = 0.0f;
            c0562a2.f1968i = -1;
            c0562a2.f1970j = this.f17830x.getId();
            ((ViewGroup.MarginLayoutParams) c0562a2).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0562a2).topMargin = C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_detail_v_margin_with_title);
            m2636e = C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_accessory_margin_left);
            c0562a.f1935J = -1;
            c0562a.f1964g = this.f17829w.getId();
            ((ViewGroup.MarginLayoutParams) c0562a).rightMargin = m2636e;
            c0562a.f1993y = 0;
            c0562a2.f1962f = this.f17829w.getId();
        } else {
            this.f17830x.setTextSize(0, C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_title_h_text_size));
            this.f17831y.setTextSize(0, C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_detail_h_text_size));
            c0562a.f1936K = -1;
            c0562a.f1974l = 0;
            c0562a.f1972k = -1;
            c0562a2.f1936K = -1;
            c0562a2.f1960e = -1;
            c0562a2.f1968i = 0;
            c0562a2.f1970j = -1;
            ((ViewGroup.MarginLayoutParams) c0562a2).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0562a2).leftMargin = C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_detail_h_margin_with_title);
            m2636e = C9145f.m2636e(getContext(), R.attr.qmui_common_list_item_accessory_margin_left);
            c0562a.f1935J = -1;
            c0562a.f1964g = this.f17829w.getId();
            ((ViewGroup.MarginLayoutParams) c0562a).rightMargin = m2636e;
            c0562a.f1993y = 0;
            c0562a2.f1962f = this.f17830x.getId();
            c0562a2.f1964g = this.f17829w.getId();
        }
        ((ViewGroup.MarginLayoutParams) c0562a2).rightMargin = m2636e;
        c0562a2.f1993y = 0;
    }
}

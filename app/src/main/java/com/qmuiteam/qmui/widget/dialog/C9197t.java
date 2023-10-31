package com.qmuiteam.qmui.widget.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.layout.C9058b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;

/* renamed from: com.qmuiteam.qmui.widget.dialog.t */
/* loaded from: classes3.dex */
public class C9197t extends C9058b {

    /* renamed from: s */
    public int f17753s;

    /* renamed from: t */
    public InterfaceC9200c f17754t;

    /* renamed from: u */
    public boolean f17755u;

    @SuppressLint({"ViewConstructor", "CustomViewStyleable"})
    /* renamed from: com.qmuiteam.qmui.widget.dialog.t$a */
    /* loaded from: classes3.dex */
    public static class C9198a extends C9197t {

        /* renamed from: v */
        public final Context f17756v;

        /* renamed from: w */
        public final QMUISpanTouchFixTextView f17757w;

        /* renamed from: x */
        public final AppCompatImageView f17758x;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
            r6 = r6.resourceId;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9198a(android.content.Context r11, java.lang.CharSequence r12) {
            /*
                r10 = this;
                r10.<init>(r11)
                r10.f17756v = r11
                androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
                r1 = 0
                r0.<init>(r11, r1)
                r10.f17758x = r0
                int r2 = android.view.View.generateViewId()
                r0.setId(r2)
                int[] r0 = com.qmuiteam.qmui.C9056b.f17310e
                r2 = 2130969666(0x7f040442, float:1.754802E38)
                r3 = 0
                android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r1, r0, r2, r3)
                int r2 = r0.getIndexCount()
                r4 = r3
                r5 = r4
            L24:
                if (r4 >= r2) goto L5e
                int r6 = r0.getIndex(r4)
                r7 = 1
                if (r6 != r7) goto L32
                int r5 = r0.getDimensionPixelSize(r6, r3)
                goto L5b
            L32:
                if (r6 != 0) goto L5b
                androidx.appcompat.widget.AppCompatImageView r7 = r10.f17758x
                android.util.TypedValue r6 = r0.peekValue(r6)
                if (r6 == 0) goto L57
                int r8 = r6.type
                r9 = 2
                if (r8 == r9) goto L57
                int r6 = r6.resourceId
                if (r6 == 0) goto L57
                int r8 = com.qmuiteam.qmui.util.C9142c.f17578a
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.C0158a.m12920a(r11, r6)     // Catch: java.lang.Exception -> L4c
                goto L58
            L4c:
                r8 = move-exception
                android.content.res.Resources r9 = r11.getResources()
                r9.getResourceName(r6)
                r8.getMessage()
            L57:
                r6 = r1
            L58:
                r7.setImageDrawable(r6)
            L5b:
                int r4 = r4 + 1
                goto L24
            L5e:
                r0.recycle()
                androidx.constraintlayout.widget.ConstraintLayout$a r11 = new androidx.constraintlayout.widget.ConstraintLayout$a
                r0 = -2
                r11.<init>(r0, r0)
                r11.f1968i = r3
                r11.f1974l = r3
                r11.f1966h = r3
                com.qmuiteam.qmui.skin.i r0 = com.qmuiteam.qmui.skin.C9135i.m2657a()
                java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f17563a
                java.lang.String r2 = "src"
                r4 = 2130969859(0x7f040503, float:1.7548412E38)
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.put(r2, r4)
                androidx.appcompat.widget.AppCompatImageView r1 = r10.f17758x
                java.lang.String r2 = r0.m2655c()
                com.qmuiteam.qmui.skin.C9106f.m2677c(r1, r2)
                com.qmuiteam.qmui.skin.C9135i.m2653e(r0)
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f17758x
                r10.addView(r0, r11)
                android.content.Context r11 = r10.f17756v
                com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView r11 = com.qmuiteam.qmui.widget.dialog.C9197t.m2579x(r11)
                r10.f17757w = r11
                androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
                r0.<init>(r3, r3)
                r0.f1960e = r3
                androidx.appcompat.widget.AppCompatImageView r1 = r10.f17758x
                int r1 = r1.getId()
                r0.f1964g = r1
                r0.rightMargin = r5
                r0.f1968i = r3
                r0.f1974l = r3
                r10.addView(r11, r0)
                r10.setText(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.dialog.C9197t.C9198a.<init>(android.content.Context, java.lang.CharSequence):void");
        }

        public CharSequence getText() {
            return this.f17757w.getText();
        }

        public void setText(CharSequence charSequence) {
            this.f17757w.setText(charSequence);
        }

        @Override // com.qmuiteam.qmui.widget.dialog.C9197t
        /* renamed from: y */
        public final void mo2578y(boolean z) {
            AppCompatImageView appCompatImageView = this.f17758x;
            int i = C9148i.f17583a;
            Drawable drawable = appCompatImageView.getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                appCompatImageView.setSelected(z);
                if (drawable.getIntrinsicWidth() != intrinsicWidth || drawable.getIntrinsicHeight() != intrinsicHeight) {
                    appCompatImageView.requestLayout();
                }
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.t$b */
    /* loaded from: classes3.dex */
    public static class C9199b extends C9197t {

        /* renamed from: v */
        public final Context f17759v;

        /* renamed from: w */
        public final QMUISpanTouchFixTextView f17760w;

        /* renamed from: x */
        public final AppCompatImageView f17761x;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            r6 = r6.resourceId;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9199b(android.content.Context r11, java.lang.CharSequence r12) {
            /*
                r10 = this;
                r10.<init>(r11)
                r10.f17759v = r11
                androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
                r1 = 0
                r0.<init>(r11, r1)
                r10.f17761x = r0
                int r2 = android.view.View.generateViewId()
                r0.setId(r2)
                int[] r0 = com.qmuiteam.qmui.C9056b.f17312g
                r2 = 2130969666(0x7f040442, float:1.754802E38)
                r3 = 0
                android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r1, r0, r2, r3)
                int r2 = r0.getIndexCount()
                r4 = r3
                r5 = r4
            L24:
                if (r4 >= r2) goto L5e
                int r6 = r0.getIndex(r4)
                if (r6 != 0) goto L31
                int r5 = r0.getDimensionPixelSize(r6, r3)
                goto L5b
            L31:
                r7 = 1
                if (r6 != r7) goto L5b
                androidx.appcompat.widget.AppCompatImageView r7 = r10.f17761x
                android.util.TypedValue r6 = r0.peekValue(r6)
                if (r6 == 0) goto L57
                int r8 = r6.type
                r9 = 2
                if (r8 == r9) goto L57
                int r6 = r6.resourceId
                if (r6 == 0) goto L57
                int r8 = com.qmuiteam.qmui.util.C9142c.f17578a
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.C0158a.m12920a(r11, r6)     // Catch: java.lang.Exception -> L4c
                goto L58
            L4c:
                r8 = move-exception
                android.content.res.Resources r9 = r11.getResources()
                r9.getResourceName(r6)
                r8.getMessage()
            L57:
                r6 = r1
            L58:
                r7.setImageDrawable(r6)
            L5b:
                int r4 = r4 + 1
                goto L24
            L5e:
                r0.recycle()
                com.qmuiteam.qmui.skin.i r11 = com.qmuiteam.qmui.skin.C9135i.m2657a()
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.f17563a
                java.lang.String r1 = "src"
                r2 = 2130969828(0x7f0404e4, float:1.7548349E38)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.put(r1, r2)
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f17761x
                java.lang.String r1 = r11.m2655c()
                com.qmuiteam.qmui.skin.C9106f.m2677c(r0, r1)
                com.qmuiteam.qmui.skin.C9135i.m2653e(r11)
                androidx.constraintlayout.widget.ConstraintLayout$a r11 = new androidx.constraintlayout.widget.ConstraintLayout$a
                r0 = -2
                r11.<init>(r0, r0)
                r11.f1966h = r3
                r11.f1968i = r3
                r11.f1974l = r3
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f17761x
                r10.addView(r0, r11)
                android.content.Context r11 = r10.f17759v
                com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView r11 = com.qmuiteam.qmui.widget.dialog.C9197t.m2579x(r11)
                r10.f17760w = r11
                androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
                r0.<init>(r3, r3)
                r0.f1960e = r3
                r0.f1968i = r3
                r0.f1974l = r3
                androidx.appcompat.widget.AppCompatImageView r1 = r10.f17761x
                int r1 = r1.getId()
                r0.f1964g = r1
                r0.rightMargin = r5
                r10.addView(r11, r0)
                androidx.appcompat.widget.AppCompatImageView r11 = r10.f17761x
                r0 = 4
                r11.setVisibility(r0)
                r10.setText(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.dialog.C9197t.C9199b.<init>(android.content.Context, java.lang.CharSequence):void");
        }

        public void setText(CharSequence charSequence) {
            this.f17760w.setText(charSequence);
        }

        @Override // com.qmuiteam.qmui.widget.dialog.C9197t
        /* renamed from: y */
        public final void mo2578y(boolean z) {
            this.f17761x.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.t$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9200c {
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.t$d */
    /* loaded from: classes3.dex */
    public static class C9201d extends C9197t {

        /* renamed from: v */
        public QMUISpanTouchFixTextView f17762v;

        public C9201d(Context context, CharSequence charSequence) {
            super(context);
            this.f17762v = C9197t.m2579x(getContext());
            ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(0, 0);
            c0562a.f1960e = 0;
            c0562a.f1966h = 0;
            c0562a.f1974l = 0;
            c0562a.f1968i = 0;
            addView(this.f17762v, c0562a);
            setText(charSequence);
        }

        public void setText(CharSequence charSequence) {
            this.f17762v.setText(charSequence);
        }

        @Deprecated
        public void setTextColor(int i) {
            this.f17762v.setTextColor(i);
        }

        public void setTextColorAttr(int i) {
            this.f17762v.setTextColor(C9145f.m2639b(i, C9106f.m2678b(this)));
            C9135i m2657a = C9135i.m2657a();
            m2657a.m2652f(i);
            C9106f.m2677c(this.f17762v, m2657a.m2655c());
            C9135i.m2653e(m2657a);
        }
    }

    public C9197t(Context context) {
        super(context, R.attr.qmui_dialog_menu_item_style);
        this.f17753s = -1;
        this.f17755u = false;
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2656b(R.attr.qmui_skin_support_s_dialog_menu_item_bg);
        int i = C9106f.f17535a;
        C9106f.m2677c(this, m2657a.m2655c());
        C9135i.m2653e(m2657a);
    }

    @SuppressLint({"CustomViewStyleable"})
    /* renamed from: x */
    public static QMUISpanTouchFixTextView m2579x(Context context) {
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView = new QMUISpanTouchFixTextView(context, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C9056b.f17313h, R.attr.qmui_dialog_menu_item_style, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 2) {
                qMUISpanTouchFixTextView.setGravity(obtainStyledAttributes.getInt(index, -1));
            } else if (index == 1) {
                qMUISpanTouchFixTextView.setTextColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 0) {
                qMUISpanTouchFixTextView.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        obtainStyledAttributes.recycle();
        qMUISpanTouchFixTextView.setId(View.generateViewId());
        qMUISpanTouchFixTextView.setSingleLine(true);
        qMUISpanTouchFixTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        qMUISpanTouchFixTextView.setDuplicateParentStateEnabled(false);
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2652f(R.attr.qmui_skin_support_dialog_menu_item_text_color);
        int i2 = C9106f.f17535a;
        C9106f.m2677c(qMUISpanTouchFixTextView, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        return qMUISpanTouchFixTextView;
    }

    public int getMenuIndex() {
        return this.f17753s;
    }

    @Override // android.view.View
    public final boolean performClick() {
        InterfaceC9200c interfaceC9200c = this.f17754t;
        if (interfaceC9200c != null) {
            int i = this.f17753s;
            C9191o c9191o = C9191o.this;
            c9191o.f17745c.mo2582i(i);
            DialogInterface.OnClickListener onClickListener = c9191o.f17744b;
            if (onClickListener != null) {
                onClickListener.onClick(c9191o.f17745c.f17689b, i);
            }
        }
        return super.performClick();
    }

    public void setChecked(boolean z) {
        this.f17755u = z;
        mo2578y(z);
    }

    public void setListener(InterfaceC9200c interfaceC9200c) {
        if (!isClickable()) {
            setClickable(true);
        }
        this.f17754t = interfaceC9200c;
    }

    public void setMenuIndex(int i) {
        this.f17753s = i;
    }

    /* renamed from: y */
    public void mo2578y(boolean z) {
    }
}

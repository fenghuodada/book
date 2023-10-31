package com.qmuiteam.qmui.widget.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.constraintlayout.core.C0499a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.layout.C9057a;
import com.qmuiteam.qmui.layout.C9064h;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.span.C9137b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.dialog.C9202u;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class QMUIDialogBuilder<T extends QMUIDialogBuilder> {

    /* renamed from: a */
    public final Context f17688a;

    /* renamed from: b */
    public DialogC9181l f17689b;

    /* renamed from: c */
    public String f17690c;

    /* renamed from: e */
    public C9202u f17692e;

    /* renamed from: f */
    public C9204v f17693f;

    /* renamed from: j */
    public C9108h f17697j;

    /* renamed from: d */
    public boolean f17691d = true;

    /* renamed from: g */
    public final ArrayList f17694g = new ArrayList();

    /* renamed from: h */
    public final boolean f17695h = true;

    /* renamed from: i */
    public final int f17696i = R.attr.qmui_skin_support_dialog_action_divider_color;

    /* renamed from: k */
    public final float f17698k = 0.75f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Orientation {
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder$a */
    /* loaded from: classes3.dex */
    public class C9167a implements C9202u.InterfaceC9203a {
        public C9167a() {
        }
    }

    public QMUIDialogBuilder(FragmentActivity fragmentActivity) {
        this.f17688a = fragmentActivity;
    }

    /* renamed from: a */
    public final void m2595a(String str, int i, QMUIDialogAction.InterfaceC9166a interfaceC9166a) {
        QMUIDialogAction qMUIDialogAction = new QMUIDialogAction(str);
        qMUIDialogAction.f17682b = 0;
        qMUIDialogAction.f17683c = i;
        qMUIDialogAction.f17685e = interfaceC9166a;
        this.f17694g.add(qMUIDialogAction);
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: b */
    public final DialogC9181l m2594b(@StyleRes int i) {
        Context context;
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView;
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView2;
        int i2;
        int i3;
        int id;
        int id2;
        int i4;
        boolean z;
        int i5;
        C9064h c9064h;
        DialogC9181l dialogC9181l = new DialogC9181l(this.f17688a, i);
        this.f17689b = dialogC9181l;
        Context context2 = dialogC9181l.getContext();
        C9204v c9204v = new C9204v(context2);
        c9204v.setBackground(C9145f.m2635f(R.attr.qmui_skin_support_dialog_bg, context2, context2.getTheme()));
        c9204v.setRadius(C9145f.m2636e(context2, R.attr.qmui_dialog_radius));
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2656b(R.attr.qmui_skin_support_dialog_bg);
        int i6 = C9106f.f17535a;
        C9106f.m2677c(c9204v, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        this.f17693f = c9204v;
        C9202u c9202u = new C9202u(context2, this.f17693f, new FrameLayout.LayoutParams(-2, -2));
        this.f17692e = c9202u;
        int i7 = 0;
        c9202u.setCheckKeyboardOverlay(false);
        this.f17692e.setOverlayOccurInMeasureCallback(new C9167a());
        this.f17692e.setMaxPercent(this.f17698k);
        C9204v dialogView = this.f17692e.getDialogView();
        this.f17693f = dialogView;
        C9064h c9064h2 = null;
        dialogView.setOnDecorationListener(null);
        QMUISpanTouchFixTextView mo2585g = mo2585g(this.f17689b, this.f17693f, context2);
        ArrayList arrayList = this.f17694g;
        int size = arrayList.size();
        int i8 = 2;
        if (size > 0) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, C9056b.f17308c, R.attr.qmui_dialog_action_container_style, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            int i10 = 0;
            int i11 = 1;
            int i12 = -1;
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == 1) {
                    i11 = obtainStyledAttributes.getInteger(index, i11);
                } else if (index == 0) {
                    i10 = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 3) {
                    i9 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    i12 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (i11 == 0) {
                i4 = size;
            } else if (i11 == 1) {
                i4 = 0;
            } else if (i11 == 3) {
                i4 = i10;
            } else {
                i4 = -1;
            }
            C9064h c9064h3 = new C9064h(context2, 0);
            c9064h3.setId(R.id.qmui_dialog_operator_layout_id);
            c9064h3.setOrientation(0);
            C9135i m2657a2 = C9135i.m2657a();
            m2657a2.m2651g(R.attr.qmui_skin_support_dialog_action_container_separator_color);
            int i14 = C9106f.f17535a;
            C9106f.m2677c(c9064h3, m2657a2.m2655c());
            C9135i.m2653e(m2657a2);
            int i15 = 0;
            while (i15 < size) {
                if (i4 == i15) {
                    View space = new Space(context2);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i7, i7);
                    layoutParams.weight = 1.0f;
                    space.setLayoutParams(layoutParams);
                    c9064h3.addView(space);
                }
                QMUIDialogAction qMUIDialogAction = (QMUIDialogAction) arrayList.get(i15);
                qMUIDialogAction.f17684d = this.f17696i;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, i12);
                if (i4 >= 0) {
                    if (i15 >= i4) {
                        layoutParams2.leftMargin = i9;
                    } else {
                        layoutParams2.rightMargin = i9;
                    }
                }
                if (i11 == i8) {
                    layoutParams2.weight = 1.0f;
                }
                DialogC9181l dialogC9181l2 = this.f17689b;
                Context context3 = dialogC9181l2.getContext();
                int i16 = qMUIDialogAction.f17682b;
                int i17 = i9;
                C9057a c9057a = new C9057a(context3);
                ArrayList arrayList2 = arrayList;
                c9057a.setBackground(null);
                c9057a.setMinHeight(0);
                c9057a.setMinimumHeight(0);
                c9057a.setChangeAlphaWhenDisable(true);
                c9057a.setChangeAlphaWhenPress(true);
                int i18 = i12;
                QMUISpanTouchFixTextView qMUISpanTouchFixTextView3 = mo2585g;
                int i19 = i11;
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(null, C9056b.f17309d, R.attr.qmui_dialog_action_style, 0);
                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                Context context4 = context2;
                int i20 = size;
                int i21 = i4;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                ColorStateList colorStateList = null;
                ColorStateList colorStateList2 = null;
                while (i22 < indexCount2) {
                    int i25 = indexCount2;
                    int index2 = obtainStyledAttributes2.getIndex(i22);
                    LinearLayout.LayoutParams layoutParams3 = layoutParams2;
                    if (index2 == 3) {
                        c9057a.setGravity(obtainStyledAttributes2.getInt(index2, -1));
                    } else if (index2 == 2) {
                        c9057a.setTextColor(obtainStyledAttributes2.getColorStateList(index2));
                    } else if (index2 == 0) {
                        c9057a.setTextSize(0, obtainStyledAttributes2.getDimensionPixelSize(index2, 0));
                        c9064h = c9064h3;
                        i22++;
                        indexCount2 = i25;
                        layoutParams2 = layoutParams3;
                        c9064h3 = c9064h;
                    } else {
                        c9064h = c9064h3;
                        if (index2 == 6) {
                            i23 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                        } else if (index2 == 4) {
                            c9057a.setBackground(obtainStyledAttributes2.getDrawable(index2));
                        } else if (index2 == 5) {
                            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                            c9057a.setMinWidth(dimensionPixelSize);
                            c9057a.setMinimumWidth(dimensionPixelSize);
                        } else if (index2 == 9) {
                            colorStateList2 = obtainStyledAttributes2.getColorStateList(index2);
                        } else if (index2 == 8) {
                            colorStateList = obtainStyledAttributes2.getColorStateList(index2);
                        } else if (index2 == 7) {
                            i24 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                        } else if (index2 == 1) {
                            c9057a.setTypeface(null, obtainStyledAttributes2.getInt(index2, -1));
                            i22++;
                            indexCount2 = i25;
                            layoutParams2 = layoutParams3;
                            c9064h3 = c9064h;
                        }
                        i22++;
                        indexCount2 = i25;
                        layoutParams2 = layoutParams3;
                        c9064h3 = c9064h;
                    }
                    c9064h = c9064h3;
                    i22++;
                    indexCount2 = i25;
                    layoutParams2 = layoutParams3;
                    c9064h3 = c9064h;
                }
                LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                C9064h c9064h4 = c9064h3;
                obtainStyledAttributes2.recycle();
                c9057a.setPadding(i23, 0, i23, 0);
                CharSequence charSequence = qMUIDialogAction.f17681a;
                if (i16 <= 0) {
                    c9057a.setText(charSequence);
                    z = true;
                } else {
                    Object obj = ContextCompat.f2323a;
                    Drawable m12032b = ContextCompat.C0651c.m12032b(context3, i16);
                    if (m12032b == null) {
                        z = true;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        m12032b.setBounds(0, 0, m12032b.getIntrinsicWidth(), m12032b.getIntrinsicHeight());
                        spannableStringBuilder.append((CharSequence) "[icon]");
                        int length = spannableStringBuilder.length();
                        C9137b c9137b = new C9137b(m12032b, 0, i24);
                        c9137b.f17568e = 0;
                        Drawable drawable = c9137b.f17567d;
                        z = true;
                        c9137b.f17565b = true;
                        spannableStringBuilder.setSpan(c9137b, 0, length, 17);
                        spannableStringBuilder.append(charSequence);
                        charSequence = spannableStringBuilder;
                    }
                    c9057a.setText(charSequence);
                }
                c9057a.setClickable(z);
                c9057a.setEnabled(qMUIDialogAction.f17687g);
                int i26 = qMUIDialogAction.f17683c;
                if (i26 == 2) {
                    c9057a.setTextColor(colorStateList);
                    i5 = R.attr.qmui_skin_support_dialog_negative_action_text_color;
                } else if (i26 == 0) {
                    c9057a.setTextColor(colorStateList2);
                    i5 = R.attr.qmui_skin_support_dialog_positive_action_text_color;
                } else {
                    i5 = R.attr.qmui_skin_support_dialog_action_text_color;
                }
                C9135i m2657a3 = C9135i.m2657a();
                m2657a3.m2656b(R.attr.qmui_skin_support_dialog_action_bg);
                m2657a3.m2652f(i5);
                int i27 = qMUIDialogAction.f17684d;
                if (i27 != 0) {
                    m2657a3.m2651g(i27);
                    m2657a3.f17563a.put("LeftSeparator", String.valueOf(qMUIDialogAction.f17684d));
                }
                int i28 = C9106f.f17535a;
                C9106f.m2677c(c9057a, m2657a3.m2655c());
                C9135i.m2653e(m2657a3);
                qMUIDialogAction.f17686f = c9057a;
                c9057a.setOnClickListener(new View$OnClickListenerC9195r(qMUIDialogAction, dialogC9181l2, i15));
                C9057a c9057a2 = qMUIDialogAction.f17686f;
                boolean z2 = this.f17695h;
                c9057a2.setChangeAlphaWhenDisable(z2);
                c9057a2.setChangeAlphaWhenPress(z2);
                c9064h4.addView(c9057a2, layoutParams4);
                i15++;
                c9064h3 = c9064h4;
                i9 = i17;
                arrayList = arrayList2;
                i12 = i18;
                i11 = i19;
                mo2585g = qMUISpanTouchFixTextView3;
                context2 = context4;
                size = i20;
                i4 = i21;
                i7 = 0;
                i8 = 2;
            }
            Context context5 = context2;
            qMUISpanTouchFixTextView = mo2585g;
            C9064h c9064h5 = c9064h3;
            if (i4 == size) {
                context = context5;
                View space2 = new Space(context);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, 0);
                layoutParams5.weight = 1.0f;
                space2.setLayoutParams(layoutParams5);
                c9064h5.addView(space2);
            } else {
                context = context5;
            }
            c9064h5.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC9196s(this, c9064h5));
            c9064h2 = c9064h5;
        } else {
            context = context2;
            qMUISpanTouchFixTextView = mo2585g;
        }
        View mo2583e = mo2583e(this.f17689b, this.f17693f, context);
        if (qMUISpanTouchFixTextView != null) {
            i2 = -1;
            if (qMUISpanTouchFixTextView.getId() == -1) {
                qMUISpanTouchFixTextView2 = qMUISpanTouchFixTextView;
                qMUISpanTouchFixTextView2.setId(R.id.qmui_dialog_title_id);
            } else {
                qMUISpanTouchFixTextView2 = qMUISpanTouchFixTextView;
            }
        } else {
            qMUISpanTouchFixTextView2 = qMUISpanTouchFixTextView;
            i2 = -1;
        }
        if (c9064h2 != null && c9064h2.getId() == i2) {
            c9064h2.setId(R.id.qmui_dialog_operator_layout_id);
        }
        if (mo2583e != null && mo2583e.getId() == i2) {
            mo2583e.setId(R.id.qmui_dialog_content_id);
        }
        if (qMUISpanTouchFixTextView2 != null) {
            ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(0, -2);
            c0562a.f1960e = 0;
            c0562a.f1966h = 0;
            c0562a.f1968i = 0;
            c0562a.f1936K = 2;
            if (mo2583e != null) {
                id2 = mo2583e.getId();
            } else if (c9064h2 != null) {
                id2 = c9064h2.getId();
            } else {
                c0562a.f1974l = 0;
                this.f17693f.addView(qMUISpanTouchFixTextView2, c0562a);
            }
            c0562a.f1972k = id2;
            this.f17693f.addView(qMUISpanTouchFixTextView2, c0562a);
        }
        if (mo2583e != null) {
            ConstraintLayout.C0562a mo2586f = mo2586f(context);
            if (qMUISpanTouchFixTextView2 != null) {
                mo2586f.f1970j = qMUISpanTouchFixTextView2.getId();
                i3 = 0;
            } else {
                i3 = 0;
                mo2586f.f1968i = 0;
            }
            if (c9064h2 != null) {
                mo2586f.f1972k = c9064h2.getId();
            } else {
                mo2586f.f1974l = i3;
            }
            this.f17693f.addView(mo2583e, mo2586f);
        } else {
            i3 = 0;
        }
        if (c9064h2 != null) {
            ConstraintLayout.C0562a c0562a2 = new ConstraintLayout.C0562a(i3, -2);
            c0562a2.f1960e = i3;
            c0562a2.f1966h = i3;
            c0562a2.f1974l = i3;
            c0562a2.f1936K = 2;
            if (mo2583e != null) {
                id = mo2583e.getId();
            } else if (qMUISpanTouchFixTextView2 != null) {
                id = qMUISpanTouchFixTextView2.getId();
            } else {
                c0562a2.f1968i = i3;
                this.f17693f.addView(c9064h2, c0562a2);
            }
            c0562a2.f1970j = id;
            this.f17693f.addView(c9064h2, c0562a2);
        }
        this.f17689b.addContentView(this.f17692e, new ViewGroup.LayoutParams(-2, -2));
        this.f17689b.setCancelable(true);
        this.f17689b.setCanceledOnTouchOutside(this.f17691d);
        DialogC9181l dialogC9181l3 = this.f17689b;
        C9108h c9108h = this.f17697j;
        C9108h c9108h2 = dialogC9181l3.f17703i;
        if (c9108h2 != null) {
            c9108h2.m2664l(dialogC9181l3);
        }
        dialogC9181l3.f17703i = c9108h;
        if (dialogC9181l3.isShowing() && c9108h != null) {
            dialogC9181l3.f17703i.m2665k(dialogC9181l3);
        }
        mo2587d(this.f17689b, context);
        return this.f17689b;
    }

    /* renamed from: c */
    public final boolean m2593c() {
        String str = this.f17690c;
        return (str == null || str.length() == 0) ? false : true;
    }

    /* renamed from: d */
    public void mo2587d(@NonNull DialogC9181l dialogC9181l, @NonNull Context context) {
    }

    @Nullable
    /* renamed from: e */
    public abstract View mo2583e(@NonNull DialogC9181l dialogC9181l, @NonNull C9204v c9204v, @NonNull Context context);

    /* renamed from: f */
    public ConstraintLayout.C0562a mo2586f(@NonNull Context context) {
        ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(0, -2);
        c0562a.f1960e = 0;
        c0562a.f1966h = 0;
        c0562a.f1949X = true;
        return c0562a;
    }

    @Nullable
    /* renamed from: g */
    public QMUISpanTouchFixTextView mo2585g(@NonNull DialogC9181l dialogC9181l, @NonNull C9204v c9204v, @NonNull Context context) {
        if (!m2593c()) {
            return null;
        }
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView = new QMUISpanTouchFixTextView(context, null);
        qMUISpanTouchFixTextView.setId(R.id.qmui_dialog_title_id);
        qMUISpanTouchFixTextView.setText(this.f17690c);
        C9145f.m2640a(qMUISpanTouchFixTextView, R.attr.qmui_dialog_title_style);
        C9135i m2657a = C9135i.m2657a();
        m2657a.m2652f(R.attr.qmui_skin_support_dialog_title_text_color);
        int i = C9106f.f17535a;
        C9106f.m2677c(qMUISpanTouchFixTextView, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        return qMUISpanTouchFixTextView;
    }

    /* renamed from: h */
    public final void m2592h(String str) {
        if (str != null && str.length() > 0) {
            StringBuilder m12383b = C0499a.m12383b(str);
            m12383b.append(this.f17688a.getString(R.string.qmui_tool_fixellipsize));
            this.f17690c = m12383b.toString();
        }
    }
}

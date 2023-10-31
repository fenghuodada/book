package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0368k;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.layout.C9058b;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.C9064h;
import com.qmuiteam.qmui.link.C9069c;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.C9216h;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.qmuiteam.qmui.widget.dialog.l */
/* loaded from: classes3.dex */
public final class DialogC9181l extends DialogC9168a {

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$a */
    /* loaded from: classes3.dex */
    public static class C9182a extends C9184c<C9182a> {

        /* renamed from: n */
        public int f17730n;

        public C9182a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f17730n = -1;
        }

        @Override // com.qmuiteam.qmui.widget.dialog.DialogC9181l.C9184c, com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: e */
        public final View mo2583e(DialogC9181l dialogC9181l, C9204v c9204v, Context context) {
            View mo2583e = super.mo2583e(dialogC9181l, c9204v, context);
            int i = this.f17730n;
            if (i > -1) {
                ArrayList<C9197t> arrayList = this.f17736m;
                if (i < arrayList.size()) {
                    arrayList.get(this.f17730n).setChecked(true);
                }
            }
            return mo2583e;
        }

        @Override // com.qmuiteam.qmui.widget.dialog.DialogC9181l.C9184c
        /* renamed from: i */
        public final void mo2582i(int i) {
            int i2 = 0;
            while (true) {
                ArrayList<C9197t> arrayList = this.f17736m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                C9197t c9197t = arrayList.get(i2);
                if (i2 == i) {
                    c9197t.setChecked(true);
                    this.f17730n = i;
                } else {
                    c9197t.setChecked(false);
                }
                i2++;
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$b */
    /* loaded from: classes3.dex */
    public static class C9183b extends QMUIDialogBuilder<C9183b> {

        /* renamed from: l */
        public String f17731l;

        /* renamed from: m */
        public C0368k f17732m;

        /* renamed from: n */
        public AppCompatImageView f17733n;

        /* renamed from: o */
        public int f17734o;

        public C9183b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f17734o = 1;
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        /* renamed from: d */
        public final void mo2587d(DialogC9181l dialogC9181l, Context context) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            dialogC9181l.setOnDismissListener(new DialogInterface$OnDismissListenerC9189m(this, inputMethodManager));
            this.f17732m.postDelayed(new RunnableC9190n(this, inputMethodManager), 300L);
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: e */
        public final View mo2583e(DialogC9181l dialogC9181l, C9204v c9204v, Context context) {
            C9058b c9058b = new C9058b(context);
            int m2636e = C9145f.m2636e(context, R.attr.qmui_dialog_edit_bottom_line_height);
            int m2639b = C9145f.m2639b(R.attr.qmui_skin_support_dialog_edit_bottom_line_color, context.getTheme());
            C9063g c9063g = c9058b.f17328r;
            c9063g.f17360k = 0;
            c9063g.f17361l = 0;
            c9063g.f17362m = m2639b;
            c9063g.f17359j = m2636e;
            c9063g.f17364o = 0;
            c9063g.f17369t = 0;
            c9063g.f17354e = 0;
            c9058b.invalidate();
            C9135i m2657a = C9135i.m2657a();
            HashMap<String, String> hashMap = m2657a.f17563a;
            hashMap.put("bottomSeparator", String.valueOf((int) R.attr.qmui_skin_support_dialog_edit_bottom_line_color));
            int i = C9106f.f17535a;
            C9106f.m2677c(c9058b, m2657a.m2655c());
            C0368k c0368k = new C0368k(context, null);
            this.f17732m = c0368k;
            c0368k.setBackgroundResource(0);
            C9187e.m2584i(this.f17732m, m2593c(), R.attr.qmui_dialog_edit_content_style);
            this.f17732m.setFocusable(true);
            this.f17732m.setFocusableInTouchMode(true);
            this.f17732m.setImeOptions(2);
            this.f17732m.setId(R.id.qmui_dialog_edit_input);
            if (!C9143d.m2642c(null)) {
                this.f17732m.setText((CharSequence) null);
            }
            m2657a.m2654d();
            m2657a.m2652f(R.attr.qmui_skin_support_dialog_edit_text_color);
            hashMap.put("hintColor", String.valueOf((int) R.attr.qmui_skin_support_dialog_edit_text_hint_color));
            C9106f.m2677c(this.f17732m, m2657a.m2655c());
            C9135i.m2653e(m2657a);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
            this.f17733n = appCompatImageView;
            appCompatImageView.setId(R.id.qmui_dialog_edit_right_icon);
            this.f17733n.setVisibility(8);
            this.f17732m.setInputType(this.f17734o);
            String str = this.f17731l;
            if (str != null) {
                this.f17732m.setHint(str);
            }
            C0368k c0368k2 = this.f17732m;
            ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(0, -2);
            c0562a.f1960e = 0;
            c0562a.f1968i = 0;
            c0562a.f1964g = R.id.qmui_dialog_edit_right_icon;
            c0562a.f1966h = C9141b.m2646a(context, 5);
            c0562a.f1993y = 0;
            c9058b.addView(c0368k2, c0562a);
            AppCompatImageView appCompatImageView2 = this.f17733n;
            ConstraintLayout.C0562a c0562a2 = new ConstraintLayout.C0562a(-2, -2);
            c0562a2.f1966h = 0;
            c0562a2.f1974l = R.id.qmui_dialog_edit_input;
            c9058b.addView(appCompatImageView2, c0562a2);
            return c9058b;
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        /* renamed from: f */
        public final ConstraintLayout.C0562a mo2586f(Context context) {
            ConstraintLayout.C0562a mo2586f = super.mo2586f(context);
            int m2636e = C9145f.m2636e(context, R.attr.qmui_dialog_padding_horizontal);
            ((ViewGroup.MarginLayoutParams) mo2586f).leftMargin = m2636e;
            ((ViewGroup.MarginLayoutParams) mo2586f).rightMargin = m2636e;
            ((ViewGroup.MarginLayoutParams) mo2586f).topMargin = C9145f.m2636e(context, R.attr.qmui_dialog_edit_margin_top);
            ((ViewGroup.MarginLayoutParams) mo2586f).bottomMargin = C9145f.m2636e(context, R.attr.qmui_dialog_edit_margin_bottom);
            return mo2586f;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$c */
    /* loaded from: classes3.dex */
    public static class C9184c<T extends QMUIDialogBuilder> extends QMUIDialogBuilder<T> {

        /* renamed from: l */
        public final ArrayList<InterfaceC9185a> f17735l;

        /* renamed from: m */
        public final ArrayList<C9197t> f17736m;

        /* renamed from: com.qmuiteam.qmui.widget.dialog.l$c$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC9185a {
            /* renamed from: a */
            C9197t mo2580a(Context context);
        }

        public C9184c(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f17736m = new ArrayList<>();
            this.f17735l = new ArrayList<>();
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: e */
        public View mo2583e(DialogC9181l dialogC9181l, C9204v c9204v, Context context) {
            C9064h c9064h = new C9064h(context);
            c9064h.setOrientation(1);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C9056b.f17311f, R.attr.qmui_dialog_menu_container_style, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = -1;
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 0) {
                    i = obtainStyledAttributes.getDimensionPixelSize(index, i);
                } else if (index == 1) {
                    i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                } else if (index == 4) {
                    i2 = obtainStyledAttributes.getDimensionPixelSize(index, i2);
                } else if (index == 3) {
                    i4 = obtainStyledAttributes.getDimensionPixelSize(index, i4);
                } else if (index == 2) {
                    i5 = obtainStyledAttributes.getDimensionPixelSize(index, i5);
                } else if (index == 5) {
                    i6 = obtainStyledAttributes.getDimensionPixelSize(index, i6);
                }
            }
            obtainStyledAttributes.recycle();
            ArrayList<InterfaceC9185a> arrayList = this.f17735l;
            if (arrayList.size() == 1) {
                i = i2;
            } else {
                i2 = i3;
            }
            if (!m2593c()) {
                i4 = i;
            }
            if (this.f17694g.size() <= 0) {
                i5 = i2;
            }
            c9064h.setPadding(0, i4, 0, i5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i6);
            layoutParams.gravity = 16;
            ArrayList<C9197t> arrayList2 = this.f17736m;
            arrayList2.clear();
            Iterator<InterfaceC9185a> it = arrayList.iterator();
            while (it.hasNext()) {
                C9197t mo2580a = it.next().mo2580a(context);
                c9064h.addView(mo2580a, layoutParams);
                arrayList2.add(mo2580a);
            }
            C9216h c9216h = new C9216h(c9064h.getContext());
            c9216h.addView(c9064h);
            c9216h.setVerticalScrollBarEnabled(false);
            return c9216h;
        }

        /* renamed from: i */
        public void mo2582i(int i) {
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$d */
    /* loaded from: classes3.dex */
    public static class C9186d extends C9184c<C9186d> {
        public C9186d(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$e */
    /* loaded from: classes3.dex */
    public static class C9187e extends QMUIDialogBuilder<C9187e> {

        /* renamed from: l */
        public CharSequence f17737l;

        public C9187e(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        /* renamed from: i */
        public static void m2584i(TextView textView, boolean z, int i) {
            C9145f.m2640a(textView, i);
            if (z) {
                return;
            }
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, C9056b.f17314i, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    textView.setPadding(textView.getPaddingLeft(), obtainStyledAttributes.getDimensionPixelSize(index, textView.getPaddingTop()), textView.getPaddingRight(), textView.getPaddingBottom());
                }
            }
            obtainStyledAttributes.recycle();
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: e */
        public final View mo2583e(@NonNull DialogC9181l dialogC9181l, @NonNull C9204v c9204v, @NonNull Context context) {
            CharSequence charSequence = this.f17737l;
            if (charSequence == null || charSequence.length() == 0) {
                return null;
            }
            QMUISpanTouchFixTextView qMUISpanTouchFixTextView = new QMUISpanTouchFixTextView(context, null);
            m2584i(qMUISpanTouchFixTextView, m2593c(), R.attr.qmui_dialog_message_content_style);
            qMUISpanTouchFixTextView.setText(this.f17737l);
            if (C9069c.f17388a == null) {
                C9069c.f17388a = new C9069c();
            }
            qMUISpanTouchFixTextView.setMovementMethodCompat(C9069c.f17388a);
            C9135i m2657a = C9135i.m2657a();
            m2657a.m2652f(R.attr.qmui_skin_support_dialog_message_text_color);
            int i = C9106f.f17535a;
            C9106f.m2677c(qMUISpanTouchFixTextView, m2657a.m2655c());
            C9135i.m2653e(m2657a);
            C9216h c9216h = new C9216h(qMUISpanTouchFixTextView.getContext());
            c9216h.addView(qMUISpanTouchFixTextView);
            c9216h.setVerticalScrollBarEnabled(false);
            return c9216h;
        }

        @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: g */
        public final QMUISpanTouchFixTextView mo2585g(@NonNull DialogC9181l dialogC9181l, @NonNull C9204v c9204v, @NonNull Context context) {
            CharSequence charSequence;
            QMUISpanTouchFixTextView mo2585g = super.mo2585g(dialogC9181l, c9204v, context);
            if (mo2585g != null && ((charSequence = this.f17737l) == null || charSequence.length() == 0)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C9056b.f17315j, R.attr.qmui_dialog_title_style, 0);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 0) {
                        mo2585g.setPadding(mo2585g.getPaddingLeft(), mo2585g.getPaddingTop(), mo2585g.getPaddingRight(), obtainStyledAttributes.getDimensionPixelSize(index, mo2585g.getPaddingBottom()));
                    }
                }
                obtainStyledAttributes.recycle();
            }
            return mo2585g;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.dialog.l$f */
    /* loaded from: classes3.dex */
    public static class C9188f extends C9184c<C9188f> {

        /* renamed from: n */
        public final BitSet f17738n;

        public C9188f(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f17738n = new BitSet();
        }

        @Override // com.qmuiteam.qmui.widget.dialog.DialogC9181l.C9184c, com.qmuiteam.qmui.widget.dialog.QMUIDialogBuilder
        @Nullable
        /* renamed from: e */
        public final View mo2583e(DialogC9181l dialogC9181l, C9204v c9204v, Context context) {
            View mo2583e = super.mo2583e(dialogC9181l, c9204v, context);
            int i = 0;
            while (true) {
                ArrayList<C9197t> arrayList = this.f17736m;
                if (i >= arrayList.size()) {
                    return mo2583e;
                }
                arrayList.get(i).setChecked(this.f17738n.get(i));
                i++;
            }
        }

        @Override // com.qmuiteam.qmui.widget.dialog.DialogC9181l.C9184c
        /* renamed from: i */
        public final void mo2582i(int i) {
            C9197t c9197t = this.f17736m.get(i);
            c9197t.setChecked(!c9197t.f17755u);
            this.f17738n.set(i, c9197t.f17755u);
        }

        /* renamed from: j */
        public final int[] m2581j() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C9197t> arrayList2 = this.f17736m;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C9197t c9197t = arrayList2.get(i);
                if (c9197t.f17755u) {
                    arrayList.add(Integer.valueOf(c9197t.getMenuIndex()));
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            return iArr;
        }
    }

    public DialogC9181l(Context context, int i) {
        super(context, i);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }
}

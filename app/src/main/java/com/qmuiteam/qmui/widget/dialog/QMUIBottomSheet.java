package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.VpnService;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.ambrose.overwall.R;
import com.ambrose.overwall.fragment.C2448d;
import com.ambrose.overwall.fragment.C2450e;
import com.ambrose.overwall.fragment.C2453f;
import com.ambrose.overwall.fragment.C2455g;
import com.ambrose.overwall.fragment.C2457h;
import com.ambrose.overwall.fragment.C2468m;
import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.fragment.C2479o;
import com.ambrose.overwall.fragment.DialogInterface$OnClickListenerC2409c;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.android.tool.bean.SectionServerBean;
import com.android.tool.util.util.C2603g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class QMUIBottomSheet extends DialogC9168a {

    /* renamed from: j */
    public final QMUIBottomSheetRootLayout f17668j;

    /* renamed from: k */
    public final QMUIBottomSheetBehavior<QMUIBottomSheetRootLayout> f17669k;

    /* renamed from: l */
    public boolean f17670l;

    /* renamed from: m */
    public boolean f17671m;

    /* loaded from: classes3.dex */
    public static class BottomGridSheetBuilder extends AbstractC9174g<BottomGridSheetBuilder> implements View.OnClickListener {

        /* renamed from: h */
        public static final C9164a f17672h = new C9164a();

        /* renamed from: e */
        public final ArrayList<C9175h> f17673e;

        /* renamed from: f */
        public final ArrayList<C9175h> f17674f;

        /* renamed from: g */
        public InterfaceC9165b f17675g;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Style {
        }

        /* renamed from: com.qmuiteam.qmui.widget.dialog.QMUIBottomSheet$BottomGridSheetBuilder$a */
        /* loaded from: classes3.dex */
        public static class C9164a {
            /* renamed from: a */
            public final C9176i m2600a(@NonNull QMUIBottomSheet qMUIBottomSheet, @NonNull C9175h c9175h) {
                Drawable drawable;
                C9176i c9176i = new C9176i(qMUIBottomSheet.getContext());
                Object obj = c9175h.f17714c;
                c9176i.f17720v = obj;
                c9176i.setTag(obj);
                C9135i m2657a = C9135i.m2657a();
                Drawable drawable2 = null;
                if (c9175h.f17712a != 0) {
                    Context context = c9176i.getContext();
                    int i = c9175h.f17712a;
                    Object obj2 = ContextCompat.f2323a;
                    drawable = ContextCompat.C0651c.m12032b(context, i);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.mutate();
                }
                AppCompatImageView appCompatImageView = c9176i.f17717s;
                appCompatImageView.setImageDrawable(drawable);
                C9106f.m2677c(appCompatImageView, "");
                m2657a.m2654d();
                QMUISpanTouchFixTextView qMUISpanTouchFixTextView = c9176i.f17719u;
                qMUISpanTouchFixTextView.setText(c9175h.f17713b);
                C9106f.m2677c(qMUISpanTouchFixTextView, m2657a.m2655c());
                Typeface typeface = c9175h.f17716e;
                if (typeface != null) {
                    qMUISpanTouchFixTextView.setTypeface(typeface);
                }
                m2657a.m2654d();
                if (c9175h.f17715d == 0) {
                    AppCompatImageView appCompatImageView2 = c9176i.f17718t;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                } else {
                    if (c9176i.f17718t == null) {
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(c9176i.getContext(), null);
                        c9176i.f17718t = appCompatImageView3;
                        appCompatImageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(-2, -2);
                        c0562a.f1966h = appCompatImageView.getId();
                        c0562a.f1968i = appCompatImageView.getId();
                        c9176i.addView(c9176i.f17718t, c0562a);
                    }
                    c9176i.f17718t.setVisibility(0);
                    if (c9175h.f17715d != 0) {
                        Context context2 = c9176i.getContext();
                        int i2 = c9175h.f17715d;
                        Object obj3 = ContextCompat.f2323a;
                        drawable2 = ContextCompat.C0651c.m12032b(context2, i2);
                    }
                    if (drawable2 != null) {
                        drawable2.mutate();
                    }
                    c9176i.f17718t.setImageDrawable(drawable2);
                    C9106f.m2677c(c9176i.f17718t, "");
                }
                C9135i.m2653e(m2657a);
                return c9176i;
            }
        }

        /* renamed from: com.qmuiteam.qmui.widget.dialog.QMUIBottomSheet$BottomGridSheetBuilder$b */
        /* loaded from: classes3.dex */
        public interface InterfaceC9165b {
        }

        public BottomGridSheetBuilder(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f17673e = new ArrayList<>();
            this.f17674f = new ArrayList<>();
        }

        /* renamed from: a */
        public final void m2601a(int i, String str, Integer num) {
            C9175h c9175h = new C9175h(str, num);
            c9175h.f17712a = i;
            c9175h.f17715d = 0;
            c9175h.f17716e = null;
            this.f17673e.add(c9175h);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z;
            InterfaceC9165b interfaceC9165b = this.f17675g;
            if (interfaceC9165b != null) {
                this.f17708a.dismiss();
                int intValue = ((Integer) view.getTag()).intValue();
                C2470n c2470n = ((C2453f) interfaceC9165b).f5883a;
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                z = true;
                            } else {
                                return;
                            }
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                    if (c2470n.f5914P.booleanValue()) {
                        c2470n.f5906H.getClass();
                        if (C2603g.m9338b(C2507n.m9406b()) == null) {
                            DialogC9181l.C9187e c9187e = new DialogC9181l.C9187e(c2470n.getActivity());
                            c9187e.m2592h(c2470n.getString(R.string.connection_tips_title));
                            c9187e.f17737l = c2470n.f5915Q;
                            c9187e.f17697j = C9108h.m2670f(c2470n.getContext());
                            c9187e.m2595a(c2470n.getString(R.string.show_cancal), 1, new C2457h());
                            c9187e.m2595a(c2470n.getString(R.string.show_ok), 0, new C2455g(c2470n));
                            c9187e.m2594b(2132017573).show();
                            return;
                        }
                    }
                    if (c2470n.f5905G.f5763i.f9009f) {
                        c2470n.f5906H.getClass();
                        C2507n.m9402f();
                    }
                    VpnService.prepare(c2470n.m2811m());
                    if (!z) {
                        if (!z) {
                            if (z) {
                                c2470n.m9413B(false);
                                return;
                            }
                            return;
                        } else if (c2470n.f5911M >= 70) {
                            DialogC9181l.C9187e c9187e2 = new DialogC9181l.C9187e(c2470n.getActivity());
                            c9187e2.m2592h(c2470n.getString(R.string.connection_tips_title));
                            c9187e2.f17737l = c2470n.getString(R.string.test_all_server);
                            c9187e2.f17697j = C9108h.m2670f(c2470n.getContext());
                            c9187e2.m2595a(c2470n.getString(R.string.show_cancal), 1, new C2479o());
                            c9187e2.m2595a(c2470n.getString(R.string.show_ok), 0, new C2468m(c2470n));
                            c9187e2.m2594b(2132017573).show();
                            return;
                        } else {
                            c2470n.m9413B(true);
                            return;
                        }
                    }
                    int size = c2470n.f5907I.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        if (((SectionServerBean) c2470n.f5907I.get(i)).getTitle().contains(" ")) {
                            strArr[i] = ((SectionServerBean) c2470n.f5907I.get(i)).getTitle().split(" ")[C2603g.m9339a("LocaleLan")] + "(" + ((SectionServerBean) c2470n.f5907I.get(i)).getResultsBeanList().size() + ")";
                        } else {
                            strArr[i] = ((SectionServerBean) c2470n.f5907I.get(i)).getTitle() + "(" + ((SectionServerBean) c2470n.f5907I.get(i)).getResultsBeanList().size() + ")";
                        }
                    }
                    DialogC9181l.C9188f c9188f = new DialogC9181l.C9188f(c2470n.getActivity());
                    c9188f.f17691d = false;
                    c9188f.f17697j = C9108h.m2670f(c2470n.getContext());
                    DialogInterface$OnClickListenerC2409c dialogInterface$OnClickListenerC2409c = new DialogInterface$OnClickListenerC2409c();
                    for (int i2 = 0; i2 < size; i2++) {
                        c9188f.f17735l.add(new C9191o(c9188f, new C9194q(strArr[i2]), dialogInterface$OnClickListenerC2409c));
                    }
                    c9188f.m2595a(c2470n.getString(R.string.ping_cancel), 1, new C2448d());
                    c9188f.m2595a(c2470n.getString(R.string.ping_commit), 1, new C2450e(c2470n, c9188f));
                    c9188f.m2594b(2132017573).show();
                    return;
                }
                C2470n.m9408z(c2470n, c2470n.f5927w);
            }
        }
    }

    public QMUIBottomSheet(Context context) {
        super(context, 2132017561);
        this.f17670l = false;
        this.f17671m = false;
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.qmui_bottom_sheet_dialog, (ViewGroup) null);
        QMUIBottomSheetRootLayout qMUIBottomSheetRootLayout = (QMUIBottomSheetRootLayout) viewGroup.findViewById(R.id.bottom_sheet);
        this.f17668j = qMUIBottomSheetRootLayout;
        QMUIBottomSheetBehavior<QMUIBottomSheetRootLayout> qMUIBottomSheetBehavior = new QMUIBottomSheetBehavior<>();
        this.f17669k = qMUIBottomSheetBehavior;
        qMUIBottomSheetBehavior.m4756C(this.f17700f);
        C9169b c9169b = new C9169b(this);
        ArrayList<BottomSheetBehavior.AbstractC7602c> arrayList = qMUIBottomSheetBehavior.f14466W;
        if (!arrayList.contains(c9169b)) {
            arrayList.add(c9169b);
        }
        qMUIBottomSheetBehavior.m4755D(0);
        qMUIBottomSheetBehavior.f17676e0 = false;
        qMUIBottomSheetBehavior.f14453J = true;
        ((CoordinatorLayout.C0590e) qMUIBottomSheetRootLayout.getLayoutParams()).m12108b(qMUIBottomSheetBehavior);
        viewGroup.findViewById(R.id.touch_outside).setOnClickListener(new View$OnClickListenerC9170c(this));
        qMUIBottomSheetRootLayout.setOnTouchListener(new View$OnTouchListenerC9171d());
        super.setContentView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException("Use addContentView(View, QMUIPriorityLinearLayout.LayoutParams) for replacement");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        QMUIBottomSheetBehavior<QMUIBottomSheetRootLayout> qMUIBottomSheetBehavior = this.f17669k;
        if (qMUIBottomSheetBehavior.f14455L == 5) {
            this.f17670l = false;
            super.cancel();
            return;
        }
        this.f17670l = true;
        qMUIBottomSheetBehavior.m4754E(5);
    }

    @Override // com.qmuiteam.qmui.widget.dialog.DialogC9168a, androidx.appcompat.app.DialogC0147v, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        QMUIBottomSheetBehavior<QMUIBottomSheetRootLayout> qMUIBottomSheetBehavior = this.f17669k;
        if (qMUIBottomSheetBehavior.f14455L == 5) {
            this.f17671m = false;
            super.dismiss();
            return;
        }
        this.f17671m = true;
        qMUIBottomSheetBehavior.m4754E(5);
    }

    @Override // com.qmuiteam.qmui.widget.dialog.DialogC9168a
    /* renamed from: e */
    public final void mo2591e(boolean z) {
        this.f17669k.m4756C(z);
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0818h.m11722c(this.f17668j);
    }

    @Override // com.qmuiteam.qmui.widget.dialog.DialogC9168a, androidx.activity.DialogC0048j, android.app.Dialog
    public final void onStart() {
        super.onStart();
        QMUIBottomSheetBehavior<QMUIBottomSheetRootLayout> qMUIBottomSheetBehavior = this.f17669k;
        if (qMUIBottomSheetBehavior.f14455L == 5) {
            qMUIBottomSheetBehavior.m4754E(4);
        }
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void setContentView(int i) {
        throw new IllegalStateException("Use addContentView(int) for replacement");
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void setContentView(View view) {
        throw new IllegalStateException("Use addContentView(View, ConstraintLayout.LayoutParams) for replacement");
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException("Use addContentView(View, QMUIPriorityLinearLayout.LayoutParams) for replacement");
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        if (this.f17669k.f14455L != 3) {
            this.f17668j.postOnAnimation(new RunnableC9172e(this));
        }
        this.f17670l = false;
        this.f17671m = false;
    }
}

package com.ambrose.overwall.p006ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.fragment.C2470n;
import com.android.tool.util.manager.C2560c;
import com.qmuiteam.qmui.arch.AbstractC9008b;
import com.qmuiteam.qmui.layout.C9059c;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.popup.C9227c;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ambrose.overwall.ui.d */
/* loaded from: classes.dex */
public abstract class AbstractC2518d extends AbstractC9008b {

    /* renamed from: t */
    public int f5996t = -1;

    /* renamed from: u */
    public final C2519a f5997u = new C2519a();

    /* renamed from: com.ambrose.overwall.ui.d$a */
    /* loaded from: classes.dex */
    public class C2519a implements QMUILinkTextView.InterfaceC9253b {
        public C2519a() {
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: a */
        public final void mo2550a() {
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: b */
        public final void mo2549b(String str) {
            AbstractC2518d abstractC2518d = AbstractC2518d.this;
            try {
                abstractC2518d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
                Toast.makeText(MyApplication.f5741c, abstractC2518d.getString(R.string.ic_wrong), 0).show();
            }
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: c */
        public final void mo2548c() {
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: h */
    public final int mo2815h() {
        return C9141b.m2646a(getContext(), 150);
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: i */
    public final int mo2814i(Context context, int i) {
        if (i == 4 || i == 8) {
            return 0;
        }
        return C9141b.m2646a(context, 100);
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C2560c c2560c = C2560c.f6059f;
        if (c2560c != null) {
            int i = this.f5996t;
            SparseArray<HashMap<View, C2560c.C2565e>> sparseArray = c2560c.f6062b;
            c2560c.m9362j(sparseArray.get(i));
            sparseArray.remove(i);
            this.f5996t = -1;
            return;
        }
        throw new RuntimeException("must invoke init() to init sSkinMaker");
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        MyApplication myApplication = MyApplication.f5741c;
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: s */
    public Object mo2806s() {
        return new C2470n();
    }

    /* renamed from: w */
    public final void m9401w(QMUITopBarLayout qMUITopBarLayout, String str) {
        C9135i m2657a = C9135i.m2657a();
        C9059c c9059c = new C9059c(getContext());
        c9059c.setBackground(C9145f.m2634g(getContext(), R.attr.qmui_skin_support_popup_bg));
        m2657a.m2656b(R.attr.qmui_skin_support_popup_bg);
        int i = C9106f.f17535a;
        C9106f.m2677c(c9059c, m2657a.m2655c());
        c9059c.setRadius(C9141b.m2646a(getContext(), 8));
        int m2646a = C9141b.m2646a(getContext(), 6);
        c9059c.setPadding(m2646a, m2646a, m2646a, m2646a);
        QMUILinkTextView qMUILinkTextView = new QMUILinkTextView(getContext());
        qMUILinkTextView.setLineSpacing(C9141b.m2646a(getContext(), 4), 1.0f);
        qMUILinkTextView.setPadding(m2646a, m2646a, m2646a, m2646a);
        qMUILinkTextView.setText(str);
        qMUILinkTextView.setTextSize(12.0f);
        qMUILinkTextView.setOnLinkClickListener(this.f5997u);
        qMUILinkTextView.setTextColor(C9145f.m2638c(getContext(), R.attr.app_skin_common_title_text_color));
        m2657a.m2654d();
        m2657a.m2652f(R.attr.app_skin_common_title_text_color);
        C9106f.m2677c(qMUILinkTextView, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        int m2646a2 = C9141b.m2646a(getContext(), 320);
        c9059c.addView(qMUILinkTextView, new FrameLayout.LayoutParams(m2646a2, m2646a2));
        C9227c c9227c = new C9227c(getContext());
        ArrayList<C9227c.C9230c> arrayList = c9227c.f17911o;
        ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(-2, -2);
        c0562a.f1960e = 0;
        c0562a.f1966h = 0;
        c0562a.f1968i = 0;
        c0562a.f1974l = 0;
        arrayList.add(new C9227c.C9230c(c9059c, c0562a));
        c9227c.f17898g = C9108h.m2670f(getContext());
        c9227c.f17907k = true;
        c9227c.f17906j = new C2517c();
        c9227c.f17897f = new C2516b();
        c9227c.m2562c(qMUITopBarLayout);
    }
}

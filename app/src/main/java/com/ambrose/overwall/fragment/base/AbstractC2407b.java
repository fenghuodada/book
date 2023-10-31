package com.ambrose.overwall.fragment.base;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.C9064h;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;

/* renamed from: com.ambrose.overwall.fragment.base.b */
/* loaded from: classes.dex */
public abstract class AbstractC2407b extends AbstractC2518d {

    /* renamed from: com.ambrose.overwall.fragment.base.b$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2408a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ String f5790a;

        /* renamed from: b */
        public final /* synthetic */ C9064h f5791b;

        public View$OnClickListenerC2408a(String str, C9064h c9064h) {
            this.f5790a = str;
            this.f5791b = c9064h;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2603g.m9336d(this.f5790a, "ok");
            this.f5791b.setVisibility(8);
        }
    }

    /* renamed from: y */
    public static int m9419y(int i) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * i) + 0.5f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: x */
    public final C9064h m9420x(String str, String str2, Boolean bool, Boolean bool2) {
        C9135i m2657a = C9135i.m2657a();
        C9135i m2657a2 = C9135i.m2657a();
        C9064h c9064h = new C9064h(getContext());
        c9064h.setBackground(C9145f.m2634g(getContext(), R.attr.qmui_skin_support_popup_bg));
        m2657a.m2656b(R.attr.qmui_skin_support_popup_bg);
        int i = C9106f.f17535a;
        C9106f.m2677c(c9064h, m2657a.m2655c());
        c9064h.setRadius(C9141b.m2646a(getContext(), 8));
        int m2646a = C9141b.m2646a(getContext(), 6);
        c9064h.setPadding(m2646a, m2646a, m2646a, m2646a);
        QMUILinkTextView qMUILinkTextView = new QMUILinkTextView(getContext());
        qMUILinkTextView.setLineSpacing(C9141b.m2646a(getContext(), 4), 1.0f);
        qMUILinkTextView.setPadding(m2646a, m2646a, m2646a, m2646a);
        qMUILinkTextView.setText(str);
        qMUILinkTextView.setTextSize(14.0f);
        AbstractC2518d.C2519a c2519a = this.f5997u;
        qMUILinkTextView.setOnLinkClickListener(c2519a);
        qMUILinkTextView.setTextColor(C9145f.m2638c(getContext(), R.attr.selectbackground));
        QMUILinkTextView qMUILinkTextView2 = new QMUILinkTextView(getContext());
        qMUILinkTextView2.setLineSpacing(C9141b.m2646a(getContext(), 4), 1.0f);
        qMUILinkTextView2.setPadding(m2646a, m2646a, m2646a, m2646a);
        qMUILinkTextView2.setText(getString(R.string.noshow));
        qMUILinkTextView2.setGravity(5);
        qMUILinkTextView2.setTextSize(12.0f);
        qMUILinkTextView2.setOnLinkClickListener(c2519a);
        qMUILinkTextView2.setTextColor(C9145f.m2638c(getContext(), R.attr.app_skin_common_title_text_color));
        if (!bool.booleanValue()) {
            qMUILinkTextView2.setOnClickListener(new View$OnClickListenerC2408a(str2, c9064h));
        } else {
            qMUILinkTextView2.setVisibility(8);
        }
        if (bool2.booleanValue()) {
            qMUILinkTextView.setGravity(17);
        }
        m2657a2.m2654d();
        m2657a2.m2652f(R.attr.selectbackground);
        m2657a.m2654d();
        m2657a.m2652f(R.attr.app_skin_common_title_text_color);
        C9106f.m2677c(qMUILinkTextView, m2657a2.m2655c());
        C9106f.m2677c(qMUILinkTextView2, m2657a.m2655c());
        C9135i.m2653e(m2657a);
        C9135i.m2653e(m2657a2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        c9064h.addView(qMUILinkTextView, layoutParams);
        c9064h.addView(qMUILinkTextView2, layoutParams);
        c9064h.setOrientation(1);
        int m2646a2 = C9141b.m2646a(MyApplication.f5741c, 15);
        C9063g c9063g = c9064h.f17376b;
        c9063g.m2744v(8, 0.18f, c9063g.f17332B, m2646a2);
        return c9064h;
    }
}

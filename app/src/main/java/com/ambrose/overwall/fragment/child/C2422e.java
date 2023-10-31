package com.ambrose.overwall.fragment.child;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.viewbinding.C1806b;
import cn.hutool.core.codec.C2026c;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2396d;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

/* renamed from: com.ambrose.overwall.fragment.child.e */
/* loaded from: classes.dex */
public class C2422e extends AbstractC2518d {

    /* renamed from: z */
    public static final /* synthetic */ int f5812z = 0;

    /* renamed from: v */
    public C2396d f5813v;

    /* renamed from: w */
    public int f5814w;

    /* renamed from: x */
    public int f5815x;

    /* renamed from: y */
    public QMUICommonListItemView f5816y;

    /* renamed from: com.ambrose.overwall.fragment.child.e$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2423a implements View.OnClickListener {
        public View$OnClickListenerC2423a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2422e.f5812z;
            C2422e.this.m2804u();
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.e$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2424b implements View.OnClickListener {

        /* renamed from: com.ambrose.overwall.fragment.child.e$b$a */
        /* loaded from: classes.dex */
        public class C2425a implements QMUIDialogAction.InterfaceC9166a {

            /* renamed from: a */
            public final /* synthetic */ DialogC9181l.C9183b f5819a;

            public C2425a(DialogC9181l.C9183b c9183b) {
                this.f5819a = c9183b;
            }

            @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogAction.InterfaceC9166a
            /* renamed from: a */
            public final void mo2596a(DialogC9181l dialogC9181l) {
                Editable text = this.f5819a.f17732m.getText();
                View$OnClickListenerC2424b view$OnClickListenerC2424b = View$OnClickListenerC2424b.this;
                if (text != null && text.length() > 0) {
                    C2603g.m9336d("CUSTOMDOMAIN", text.toString().trim());
                    C2422e.this.f5816y.setDetailText(text.toString().trim());
                    C2422e c2422e = C2422e.this;
                    Toast.makeText(c2422e.getActivity(), c2422e.getString(R.string.success_set_domain), 0).show();
                    dialogC9181l.dismiss();
                    return;
                }
                Toast.makeText(C2422e.this.getActivity(), C2422e.this.getString(R.string.hint_domain), 0).show();
            }
        }

        /* renamed from: com.ambrose.overwall.fragment.child.e$b$b */
        /* loaded from: classes.dex */
        public class C2426b implements QMUIDialogAction.InterfaceC9166a {
            public C2426b() {
            }

            @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogAction.InterfaceC9166a
            /* renamed from: a */
            public final void mo2596a(DialogC9181l dialogC9181l) {
                C2603g.m9336d("CUSTOMDOMAIN", C2026c.m9721b("b250b3dhbGwuY29t"));
                View$OnClickListenerC2424b view$OnClickListenerC2424b = View$OnClickListenerC2424b.this;
                C2422e c2422e = C2422e.this;
                c2422e.f5816y.setDetailText(c2422e.getString(R.string.default_name));
                C2422e c2422e2 = C2422e.this;
                Toast.makeText(c2422e2.getActivity(), c2422e2.getString(R.string.success_set_domain), 0).show();
                dialogC9181l.dismiss();
            }
        }

        public View$OnClickListenerC2424b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2422e c2422e = C2422e.this;
            DialogC9181l.C9183b c9183b = new DialogC9181l.C9183b(c2422e.getActivity());
            c9183b.f17697j = C9108h.m2670f(c2422e.getContext());
            c9183b.m2592h(c2422e.getString(R.string.custom_name));
            c9183b.f17731l = c2422e.getString(R.string.hint_domain);
            c9183b.f17734o = 1;
            c9183b.m2595a(c2422e.getString(R.string.default_name), 1, new C2426b());
            c9183b.m2595a(c2422e.getString(R.string.committok), 1, new C2425a(c9183b));
            c9183b.m2594b(2132017573).show();
        }
    }

    @Override // com.ambrose.overwall.p006ui.AbstractC2518d, com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        String m9338b;
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_custom_domain, (ViewGroup) null, false);
        int i = R.id.groupListView;
        QMUIGroupListView qMUIGroupListView = (QMUIGroupListView) C1806b.m9912a(R.id.groupListView, inflate);
        if (qMUIGroupListView != null) {
            i = R.id.mtopbar;
            QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
            if (qMUITopBarLayout != null) {
                this.f5813v = new C2396d((QMUIWindowInsetLayout) inflate, qMUIGroupListView, qMUITopBarLayout);
                qMUITopBarLayout.m2608f(getString(R.string.custom_name));
                this.f5813v.f5767c.m2609d().setOnClickListener(new View$OnClickListenerC2423a());
                this.f5814w = C9145f.m2636e(getContext(), R.attr.qmui_list_item_height);
                this.f5815x = C9141b.m2646a(getContext(), 20);
                if (C2603g.m9338b("CUSTOMDOMAIN").equals(C2603g.m9338b("DOMAIN"))) {
                    m9338b = getString(R.string.default_name);
                } else {
                    m9338b = C2603g.m9338b("CUSTOMDOMAIN");
                }
                QMUICommonListItemView m2574a = this.f5813v.f5766b.m2574a(null, "Request", m9338b, 1, this.f5814w);
                m2574a.getTextView().setTextSize(13.0f);
                m2574a.getTextView().setTypeface(Typeface.SERIF);
                m2574a.getDetailTextView().setTextSize(10.0f);
                m2574a.getDetailTextView().setTypeface(Typeface.defaultFromStyle(0));
                this.f5816y = m2574a;
                m2574a.setOnClickListener(new View$OnClickListenerC2424b());
                Context context = getContext();
                int i2 = QMUIGroupListView.f17833b;
                QMUIGroupListView.C9214a c9214a = new QMUIGroupListView.C9214a(context);
                int i3 = this.f5815x;
                c9214a.f17845k = -2;
                c9214a.f17844j = i3;
                c9214a.m2572a(this.f5816y, null);
                c9214a.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a.f17843i = 0;
                c9214a.m2570c(getString(R.string.domain_detail_explain));
                c9214a.f17841g = true;
                c9214a.m2571b(this.f5813v.f5766b);
                return this.f5813v.f5765a;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}

package com.ambrose.overwall.fragment.child;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2398f;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.util.C2597b;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

/* renamed from: com.ambrose.overwall.fragment.child.g */
/* loaded from: classes.dex */
public class C2430g extends AbstractC2518d {

    /* renamed from: F */
    public static final /* synthetic */ int f5827F = 0;

    /* renamed from: A */
    public QMUICommonListItemView f5828A;

    /* renamed from: B */
    public QMUICommonListItemView f5829B;

    /* renamed from: C */
    public QMUICommonListItemView f5830C;

    /* renamed from: D */
    public QMUICommonListItemView f5831D;

    /* renamed from: E */
    public C2398f f5832E;

    /* renamed from: v */
    public int f5833v;

    /* renamed from: w */
    public int f5834w;

    /* renamed from: x */
    public final int f5835x = 2132017573;

    /* renamed from: y */
    public QMUICommonListItemView f5836y;

    /* renamed from: z */
    public QMUICommonListItemView f5837z;

    /* renamed from: com.ambrose.overwall.fragment.child.g$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2431a implements View.OnClickListener {
        public View$OnClickListenerC2431a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2430g.f5827F;
            C2430g.this.m2804u();
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_other_setting, (ViewGroup) null, false);
        int i = R.id.groupListView;
        QMUIGroupListView qMUIGroupListView = (QMUIGroupListView) C1806b.m9912a(R.id.groupListView, inflate);
        if (qMUIGroupListView != null) {
            i = R.id.topbar;
            QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.topbar, inflate);
            if (qMUITopBarLayout != null) {
                this.f5832E = new C2398f((QMUIWindowInsetLayout) inflate, qMUIGroupListView, qMUITopBarLayout);
                this.f5833v = C9145f.m2636e(getContext(), R.attr.qmui_list_item_height);
                this.f5834w = C9141b.m2646a(getContext(), 20);
                this.f5832E.f5774c.m2608f(getString(R.string.other_setting));
                this.f5832E.f5774c.m2609d().setOnClickListener(new View$OnClickListenerC2431a());
                QMUICommonListItemView m9417x = m9417x(getString(R.string.animstyle));
                this.f5836y = m9417x;
                m9417x.setOnClickListener(new View$OnClickListenerC2432h(this));
                try {
                    QMUICommonListItemView m9417x2 = m9417x(getString(R.string.clear));
                    this.f5828A = m9417x2;
                    m9417x2.setDetailText(C2597b.m9343c(MyApplication.f5741c));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f5828A.setOnClickListener(new View$OnClickListenerC2433i(this));
                QMUICommonListItemView m2573b = this.f5832E.f5773b.m2573b(getString(R.string.proxy_tips_show));
                this.f5829B = m2573b;
                m2573b.setAccessoryType(2);
                this.f5829B.getTextView().setTextSize(13.0f);
                this.f5829B.getTextView().setTypeface(Typeface.SERIF);
                if (C2603g.m9338b("ProxyTips") == null) {
                    this.f5829B.getSwitch().setChecked(true);
                } else {
                    this.f5829B.getSwitch().setChecked(false);
                }
                this.f5829B.getSwitch().setButtonDrawable(C9145f.m2634g(getContext(), R.attr.qmui_common_list_item_switch));
                this.f5829B.getSwitch().setOnCheckedChangeListener(new C2434j());
                QMUICommonListItemView m2573b2 = this.f5832E.f5773b.m2573b(getString(R.string.openrecommendation));
                this.f5830C = m2573b2;
                m2573b2.setAccessoryType(2);
                this.f5830C.getTextView().setTextSize(13.0f);
                this.f5830C.getTextView().setTypeface(Typeface.SERIF);
                if (C2603g.m9338b("ADSOUND") != null) {
                    this.f5830C.getSwitch().setChecked(true);
                } else {
                    this.f5830C.getSwitch().setChecked(false);
                }
                this.f5830C.getSwitch().setButtonDrawable(C9145f.m2634g(getContext(), R.attr.qmui_common_list_item_switch));
                this.f5830C.getSwitch().setOnCheckedChangeListener(new C2435k());
                QMUICommonListItemView m2573b3 = this.f5832E.f5773b.m2573b(getString(R.string.last_connect));
                this.f5831D = m2573b3;
                m2573b3.setAccessoryType(2);
                this.f5831D.getTextView().setTextSize(13.0f);
                this.f5831D.getTextView().setTypeface(Typeface.SERIF);
                if (C2603g.m9338b("LASTCONNECT") != null) {
                    this.f5831D.getSwitch().setChecked(true);
                } else {
                    this.f5831D.getSwitch().setChecked(false);
                }
                this.f5831D.getSwitch().setButtonDrawable(C9145f.m2634g(getContext(), R.attr.qmui_common_list_item_switch));
                this.f5831D.getSwitch().setOnCheckedChangeListener(new C2436l());
                QMUICommonListItemView m2573b4 = this.f5832E.f5773b.m2573b(getString(R.string.nightmode));
                this.f5837z = m2573b4;
                m2573b4.setAccessoryType(2);
                this.f5837z.getTextView().setTextSize(13.0f);
                this.f5837z.getTextView().setTypeface(Typeface.SERIF);
                if (C9108h.m2670f(ApplicationC2534a.f6025a).f17555f == 2 || (MyApplication.f5741c.getResources().getConfiguration().uiMode & 48) == 32) {
                    this.f5837z.getSwitch().setChecked(true);
                } else {
                    this.f5837z.getSwitch().setChecked(false);
                }
                this.f5837z.getSwitch().setButtonDrawable(C9145f.m2634g(getContext(), R.attr.qmui_common_list_item_switch));
                this.f5837z.getSwitch().setOnCheckedChangeListener(new C2437m(this));
                QMUIGroupListView.C9214a c9214a = new QMUIGroupListView.C9214a(getContext());
                int i2 = this.f5834w;
                c9214a.f17845k = -2;
                c9214a.f17844j = i2;
                c9214a.m2572a(this.f5829B, null);
                c9214a.m2572a(this.f5837z, null);
                c9214a.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a.f17843i = 0;
                c9214a.f17841g = true;
                c9214a.m2571b(this.f5832E.f5773b);
                QMUIGroupListView.C9214a c9214a2 = new QMUIGroupListView.C9214a(getContext());
                int i3 = this.f5834w;
                c9214a2.f17845k = -2;
                c9214a2.f17844j = i3;
                c9214a2.m2572a(this.f5830C, null);
                c9214a2.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a2.f17843i = 0;
                c9214a2.f17841g = true;
                c9214a2.m2571b(this.f5832E.f5773b);
                QMUIGroupListView.C9214a c9214a3 = new QMUIGroupListView.C9214a(getContext());
                int i4 = this.f5834w;
                c9214a3.f17845k = -2;
                c9214a3.f17844j = i4;
                c9214a3.m2572a(this.f5828A, null);
                c9214a3.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a3.f17843i = 0;
                c9214a3.f17841g = true;
                c9214a3.m2571b(this.f5832E.f5773b);
                QMUIGroupListView.C9214a c9214a4 = new QMUIGroupListView.C9214a(getContext());
                int i5 = this.f5834w;
                c9214a4.f17845k = -2;
                c9214a4.f17844j = i5;
                c9214a4.m2572a(this.f5831D, null);
                c9214a4.m2570c(getString(R.string.last_connect_tips));
                c9214a4.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a4.f17843i = 0;
                c9214a4.f17841g = true;
                c9214a4.m2571b(this.f5832E.f5773b);
                QMUIGroupListView.C9214a c9214a5 = new QMUIGroupListView.C9214a(getContext());
                int i6 = this.f5834w;
                c9214a5.f17845k = -2;
                c9214a5.f17844j = i6;
                c9214a5.m2572a(this.f5836y, null);
                c9214a5.m2570c(getString(R.string.amin_style_tips));
                c9214a5.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a5.f17843i = 0;
                c9214a5.f17841g = true;
                c9214a5.m2571b(this.f5832E.f5773b);
                return this.f5832E.f5772a;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: x */
    public final QMUICommonListItemView m9417x(String str) {
        QMUICommonListItemView m2574a = this.f5832E.f5773b.m2574a(null, str, null, 1, this.f5833v);
        m2574a.getTextView().setTextSize(13.0f);
        m2574a.getTextView().setTypeface(Typeface.SERIF);
        m2574a.getDetailTextView().setTextSize(10.0f);
        m2574a.getDetailTextView().setTypeface(Typeface.defaultFromStyle(0));
        return m2574a;
    }
}

package com.ambrose.overwall.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2401i;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.qmuiteam.qmui.arch.AbstractC9008b;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import java.util.Locale;

/* renamed from: com.ambrose.overwall.fragment.e0 */
/* loaded from: classes.dex */
public class C2451e0 extends AbstractC2518d {

    /* renamed from: L */
    public static final /* synthetic */ int f5865L = 0;

    /* renamed from: A */
    public QMUICommonListItemView f5866A;

    /* renamed from: B */
    public QMUICommonListItemView f5867B;

    /* renamed from: C */
    public QMUICommonListItemView f5868C;

    /* renamed from: D */
    public QMUICommonListItemView f5869D;

    /* renamed from: E */
    public QMUICommonListItemView f5870E;

    /* renamed from: F */
    public QMUICommonListItemView f5871F;

    /* renamed from: G */
    public QMUICommonListItemView f5872G;

    /* renamed from: H */
    public QMUICommonListItemView f5873H;

    /* renamed from: I */
    public int f5874I;

    /* renamed from: J */
    public int f5875J;

    /* renamed from: K */
    public C2401i f5876K;

    /* renamed from: v */
    public QMUICommonListItemView f5877v;

    /* renamed from: w */
    public QMUICommonListItemView f5878w;

    /* renamed from: x */
    public QMUICommonListItemView f5879x;

    /* renamed from: y */
    public QMUICommonListItemView f5880y;

    /* renamed from: z */
    public QMUICommonListItemView f5881z;

    /* renamed from: com.ambrose.overwall.fragment.e0$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2452a implements View.OnClickListener {
        public View$OnClickListenerC2452a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2451e0.f5865L;
            C2451e0.this.m2804u();
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_setting, (ViewGroup) null, false);
        int i = R.id.groupListView;
        QMUIGroupListView qMUIGroupListView = (QMUIGroupListView) C1806b.m9912a(R.id.groupListView, inflate);
        if (qMUIGroupListView != null) {
            i = R.id.topbar;
            QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.topbar, inflate);
            if (qMUITopBarLayout != null) {
                this.f5876K = new C2401i((QMUIWindowInsetLayout) inflate, qMUIGroupListView, qMUITopBarLayout);
                this.f5874I = C9145f.m2636e(getContext(), R.attr.qmui_list_item_height);
                this.f5875J = C9141b.m2646a(getContext(), 20);
                this.f5876K.f5787c.m2608f(getString(R.string.ic_set));
                this.f5876K.f5787c.m2609d().setOnClickListener(new View$OnClickListenerC2452a());
                QMUICommonListItemView m9415x = m9415x(getString(R.string.group));
                this.f5869D = m9415x;
                m9415x.setOnClickListener(new View$OnClickListenerC2454f0(this));
                QMUICommonListItemView m9415x2 = m9415x(getString(R.string.appvp));
                this.f5879x = m9415x2;
                m9415x2.setOnClickListener(new View$OnClickListenerC2456g0(this));
                QMUICommonListItemView m9415x3 = m9415x(getString(R.string.announcement));
                this.f5871F = m9415x3;
                m9415x3.setOnClickListener(new View$OnClickListenerC2458h0(this));
                QMUICommonListItemView m9415x4 = m9415x(getString(R.string.other_setting));
                this.f5868C = m9415x4;
                m9415x4.setOnClickListener(new View$OnClickListenerC2460i0(this));
                QMUICommonListItemView m9415x5 = m9415x(getString(R.string.about));
                this.f5880y = m9415x5;
                m9415x5.setOnClickListener(new View$OnClickListenerC2462j0(this));
                QMUICommonListItemView m9415x6 = m9415x(getString(R.string.contact));
                this.f5881z = m9415x6;
                m9415x6.setOnClickListener(new View$OnClickListenerC2464k0(this));
                QMUICommonListItemView m9415x7 = m9415x(getString(R.string.question));
                this.f5870E = m9415x7;
                m9415x7.setOnClickListener(new View$OnClickListenerC2467l0(this));
                QMUICommonListItemView m9415x8 = m9415x(getString(R.string.leave));
                this.f5866A = m9415x8;
                m9415x8.setOnClickListener(new View$OnClickListenerC2469m0(this));
                QMUICommonListItemView m9415x9 = m9415x(getString(R.string.share));
                this.f5867B = m9415x9;
                m9415x9.setOnClickListener(new View$OnClickListenerC2490y(this));
                m9415x(getString(R.string.wifi_proxy)).setOnClickListener(new View$OnClickListenerC2491z(this));
                QMUICommonListItemView m9415x10 = m9415x(getString(R.string.exemption));
                this.f5878w = m9415x10;
                m9415x10.setOnClickListener(new View$OnClickListenerC2403a0(this));
                QMUICommonListItemView m9415x11 = m9415x(getString(R.string.evaluate));
                this.f5877v = m9415x11;
                m9415x11.setOnClickListener(new View$OnClickListenerC2405b0());
                QMUICommonListItemView m9415x12 = m9415x(getString(R.string.custom_name));
                this.f5873H = m9415x12;
                m9415x12.setOnClickListener(new View$OnClickListenerC2410c0(this));
                Context context = getContext();
                int i2 = QMUIGroupListView.f17833b;
                QMUIGroupListView.C9214a c9214a = new QMUIGroupListView.C9214a(context);
                int i3 = this.f5875J;
                c9214a.f17845k = -2;
                c9214a.f17844j = i3;
                c9214a.m2572a(this.f5871F, null);
                c9214a.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a.f17843i = 0;
                c9214a.f17841g = true;
                c9214a.m2571b(this.f5876K.f5786b);
                QMUIGroupListView.C9214a c9214a2 = new QMUIGroupListView.C9214a(getContext());
                int i4 = this.f5875J;
                c9214a2.f17845k = -2;
                c9214a2.f17844j = i4;
                c9214a2.m2572a(this.f5873H, null);
                c9214a2.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a2.f17843i = 0;
                c9214a2.f17841g = true;
                c9214a2.m2571b(this.f5876K.f5786b);
                QMUIGroupListView.C9214a c9214a3 = new QMUIGroupListView.C9214a(getContext());
                int i5 = this.f5875J;
                c9214a3.f17845k = -2;
                c9214a3.f17844j = i5;
                c9214a3.m2572a(this.f5879x, null);
                c9214a3.m2572a(this.f5868C, null);
                c9214a3.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a3.f17843i = 0;
                c9214a3.f17841g = true;
                c9214a3.m2571b(this.f5876K.f5786b);
                if (Locale.getDefault().toString().contains("zh")) {
                    QMUICommonListItemView m9415x13 = m9415x(getString(R.string.sub_youtube));
                    this.f5872G = m9415x13;
                    m9415x13.setOnClickListener(new View$OnClickListenerC2449d0());
                    QMUIGroupListView.C9214a c9214a4 = new QMUIGroupListView.C9214a(getContext());
                    int i6 = this.f5875J;
                    c9214a4.f17845k = -2;
                    c9214a4.f17844j = i6;
                    c9214a4.m2572a(this.f5872G, null);
                    c9214a4.f17842h = C9141b.m2646a(getContext(), 16);
                    c9214a4.f17843i = 0;
                    c9214a4.f17841g = true;
                    c9214a4.m2571b(this.f5876K.f5786b);
                }
                QMUIGroupListView.C9214a c9214a5 = new QMUIGroupListView.C9214a(getContext());
                int i7 = this.f5875J;
                c9214a5.f17845k = -2;
                c9214a5.f17844j = i7;
                c9214a5.m2572a(this.f5881z, null);
                c9214a5.m2572a(this.f5869D, null);
                c9214a5.m2572a(this.f5867B, null);
                c9214a5.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a5.f17843i = 0;
                c9214a5.f17841g = true;
                c9214a5.m2571b(this.f5876K.f5786b);
                QMUIGroupListView.C9214a c9214a6 = new QMUIGroupListView.C9214a(getContext());
                int i8 = this.f5875J;
                c9214a6.f17845k = -2;
                c9214a6.f17844j = i8;
                c9214a6.m2572a(this.f5870E, null);
                c9214a6.m2572a(this.f5880y, null);
                c9214a6.m2572a(this.f5878w, null);
                c9214a6.m2572a(this.f5877v, null);
                c9214a6.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a6.f17843i = 0;
                c9214a6.f17841g = true;
                c9214a6.m2571b(this.f5876K.f5786b);
                QMUIGroupListView.C9214a c9214a7 = new QMUIGroupListView.C9214a(getContext());
                int i9 = this.f5875J;
                c9214a7.f17845k = -2;
                c9214a7.f17844j = i9;
                c9214a7.m2572a(this.f5866A, null);
                c9214a7.f17842h = C9141b.m2646a(getContext(), 16);
                c9214a7.f17843i = 0;
                c9214a7.m2570c("");
                c9214a7.m2571b(this.f5876K.f5786b);
                return this.f5876K.f5785a;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: r */
    public final AbstractC9008b.C9016g mo2807r() {
        return AbstractC9008b.f17202q;
    }

    /* renamed from: x */
    public final QMUICommonListItemView m9415x(String str) {
        QMUICommonListItemView m2574a = this.f5876K.f5786b.m2574a(null, str, null, 1, this.f5874I);
        m2574a.getTextView().setTextSize(13.0f);
        m2574a.getTextView().setTypeface(Typeface.SERIF);
        m2574a.getDetailTextView().setTextSize(10.0f);
        m2574a.getDetailTextView().setTypeface(Typeface.defaultFromStyle(0));
        return m2574a;
    }
}

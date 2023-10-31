package com.ambrose.overwall.fragment.child;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2399g;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.util.proxy.C2594b;
import com.android.tool.util.proxy.WifiDirectService;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.disposables.C10160a;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.internal.observers.C10187b;
import io.reactivex.rxjava3.internal.operators.observable.C10195d;
import io.reactivex.rxjava3.internal.util.C10233b;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ambrose.overwall.fragment.child.o */
/* loaded from: classes.dex */
public class C2439o extends AbstractC2518d {

    /* renamed from: C */
    public static final /* synthetic */ int f5842C = 0;

    /* renamed from: A */
    public String f5843A;

    /* renamed from: B */
    public C2399g f5844B;

    /* renamed from: v */
    public QMUICommonListItemView f5845v;

    /* renamed from: w */
    public QMUICommonListItemView f5846w;

    /* renamed from: x */
    public QMUICommonListItemView f5847x;

    /* renamed from: y */
    public final int f5848y = 2132017573;

    /* renamed from: z */
    public C10160a f5849z;

    /* renamed from: com.ambrose.overwall.fragment.child.o$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2440a implements View.OnClickListener {
        public View$OnClickListenerC2440a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2439o.f5842C;
            C2439o.this.m2804u();
        }
    }

    /* renamed from: x */
    public static String m9416x() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress nextElement = inetAddresses.nextElement();
                if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                    return nextElement.getHostAddress().toString();
                }
            }
        }
        return "0.0.0.0";
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C10160a c10160a = this.f5849z;
        if (c10160a != null) {
            if (!c10160a.f20425b) {
                synchronized (c10160a) {
                    if (!c10160a.f20425b) {
                        C10233b<InterfaceC10161b> c10233b = c10160a.f20424a;
                        c10160a.f20424a = null;
                        C10160a.m1217f(c10233b);
                    }
                }
            }
            this.f5849z = null;
        }
        super.onDestroy();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    @RequiresApi(api = 26)
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_proxy, (ViewGroup) null, false);
        int i = R.id.groupListView;
        QMUIGroupListView qMUIGroupListView = (QMUIGroupListView) C1806b.m9912a(R.id.groupListView, inflate);
        if (qMUIGroupListView != null) {
            i = R.id.loacliptips;
            TextView textView = (TextView) C1806b.m9912a(R.id.loacliptips, inflate);
            if (textView != null) {
                i = R.id.mtopbar;
                QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
                if (qMUITopBarLayout != null) {
                    i = R.id.neds;
                    if (((NestedScrollView) C1806b.m9912a(R.id.neds, inflate)) != null) {
                        i = R.id.qmtextview;
                        QMUILinkTextView qMUILinkTextView = (QMUILinkTextView) C1806b.m9912a(R.id.qmtextview, inflate);
                        if (qMUILinkTextView != null) {
                            QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
                            this.f5844B = new C2399g(qMUIWindowInsetLayout, qMUIGroupListView, textView, qMUITopBarLayout, qMUILinkTextView, qMUIWindowInsetLayout);
                            try {
                                this.f5843A = m9416x();
                            } catch (SocketException e) {
                                e.printStackTrace();
                            }
                            if (C2603g.m9338b("ProxyTips") == null) {
                                this.f5844B.f5779e.setOnLinkClickListener(this.f5997u);
                            } else {
                                this.f5844B.f5779e.setVisibility(8);
                            }
                            C2594b.m9346a(MyApplication.f5741c);
                            int m2636e = C9145f.m2636e(getContext(), R.attr.qmui_list_item_height);
                            int m2646a = C9141b.m2646a(getContext(), 20);
                            QMUICommonListItemView m2573b = this.f5844B.f5776b.m2573b(getString(R.string.enable_proxy));
                            this.f5847x = m2573b;
                            m2573b.setAccessoryType(2);
                            this.f5847x.getTextView().setTextSize(13.0f);
                            this.f5847x.getTextView().setTypeface(Typeface.SERIF);
                            if (WifiDirectService.f6096c) {
                                this.f5847x.getSwitch().setChecked(true);
                            } else {
                                this.f5847x.getSwitch().setChecked(false);
                            }
                            if (this.f5849z == null) {
                                C10160a c10160a = new C10160a();
                                this.f5849z = c10160a;
                                C10195d m1223b = AbstractC10151d.m1224a(TimeUnit.SECONDS).m1223b(C10142b.m1225a());
                                C10187b c10187b = new C10187b(new C2441p(this), C10179a.f20440d);
                                m1223b.m1221d(c10187b);
                                c10160a.mo1209c(c10187b);
                            }
                            this.f5847x.getSwitch().setButtonDrawable(C9145f.m2634g(getContext(), R.attr.qmui_common_list_item_switch));
                            this.f5847x.getSwitch().setOnClickListener(new View$OnClickListenerC2442q(this));
                            QMUICommonListItemView m2574a = this.f5844B.f5776b.m2574a(null, getString(R.string.proxy_port), C2603g.m9338b("ProxyPort"), 1, m2636e);
                            this.f5845v = m2574a;
                            m2574a.getTextView().setTextSize(13.0f);
                            this.f5845v.getTextView().setTypeface(Typeface.SERIF);
                            this.f5845v.getDetailTextView().setTextSize(10.0f);
                            this.f5845v.getDetailTextView().setTypeface(Typeface.defaultFromStyle(0));
                            this.f5845v.setOnClickListener(new View$OnClickListenerC2443r(this));
                            QMUICommonListItemView m2574a2 = this.f5844B.f5776b.m2574a(null, getString(R.string.proxy_ip), this.f5843A, 1, m2636e);
                            this.f5846w = m2574a2;
                            m2574a2.getTextView().setTextSize(13.0f);
                            this.f5846w.getTextView().setTypeface(Typeface.SERIF);
                            this.f5846w.getDetailTextView().setTextSize(10.0f);
                            this.f5846w.getDetailTextView().setTypeface(Typeface.defaultFromStyle(0));
                            QMUIGroupListView.C9214a c9214a = new QMUIGroupListView.C9214a(getContext());
                            c9214a.f17845k = -2;
                            c9214a.f17844j = m2646a;
                            c9214a.m2572a(this.f5845v, null);
                            c9214a.m2572a(this.f5846w, null);
                            c9214a.m2572a(this.f5847x, null);
                            c9214a.f17842h = C9141b.m2646a(getContext(), 16);
                            c9214a.f17843i = 0;
                            c9214a.f17841g = true;
                            c9214a.m2571b(this.f5844B.f5776b);
                            this.f5844B.f5778d.m2609d().setOnClickListener(new View$OnClickListenerC2440a());
                            this.f5844B.f5778d.m2608f(getString(R.string.wifi_proxy));
                            C9135i m2657a = C9135i.m2657a();
                            m2657a.m2656b(R.attr.app_skin_common_background);
                            QMUIWindowInsetLayout qMUIWindowInsetLayout2 = this.f5844B.f5780f;
                            int i2 = C9106f.f17535a;
                            C9106f.m2677c(qMUIWindowInsetLayout2, m2657a.m2655c());
                            C9135i m2657a2 = C9135i.m2657a();
                            m2657a2.m2652f(R.attr.selectbackground);
                            C9106f.m2677c(this.f5844B.f5779e, m2657a2.m2655c());
                            return this.f5844B.f5775a;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}

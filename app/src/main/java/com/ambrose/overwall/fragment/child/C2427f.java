package com.ambrose.overwall.fragment.child;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2397e;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.weight.JustifyTextView;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9144e;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;

/* renamed from: com.ambrose.overwall.fragment.child.f */
/* loaded from: classes.dex */
public class C2427f extends AbstractC2518d {

    /* renamed from: x */
    public static final /* synthetic */ int f5822x = 0;

    /* renamed from: v */
    public C2397e f5823v;

    /* renamed from: w */
    public final C2429b f5824w = new C2429b();

    /* renamed from: com.ambrose.overwall.fragment.child.f$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2428a implements View.OnClickListener {
        public View$OnClickListenerC2428a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2427f.f5822x;
            C2427f.this.m2804u();
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.f$b */
    /* loaded from: classes.dex */
    public class C2429b implements QMUILinkTextView.InterfaceC9253b {
        public C2429b() {
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: a */
        public final void mo2550a() {
            C2427f c2427f = C2427f.this;
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto: ambroseyuwoquan@gmail.com"));
                intent.putExtra("android.intent.extra.SUBJECT", "From " + c2427f.getString(R.string.app_name) + "___V-" + C9144e.m2641a(c2427f.getContext()) + "___PhotoType：" + Build.MANUFACTURER + Build.MODEL);
                intent.putExtra("android.intent.extra.TEXT", R.string.mail_detail);
                c2427f.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(ApplicationC2534a.f6025a, c2427f.getString(R.string.mial_tips), 0).show();
            }
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: b */
        public final void mo2549b(String str) {
            try {
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse(str));
                intent.addFlags(268435456);
                C2427f.this.getActivity().startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(ApplicationC2534a.f6025a, (int) R.string.ic_wrong, 0).show();
            }
        }

        @Override // com.qmuiteam.qmui.widget.textview.QMUILinkTextView.InterfaceC9253b
        /* renamed from: c */
        public final void mo2548c() {
        }
    }

    @Override // com.ambrose.overwall.p006ui.AbstractC2518d, com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_disclaimer, (ViewGroup) null, false);
        int i = R.id.mtopbar;
        QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
        if (qMUITopBarLayout != null) {
            QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
            JustifyTextView justifyTextView = (JustifyTextView) C1806b.m9912a(R.id.text, inflate);
            if (justifyTextView != null) {
                this.f5823v = new C2397e(qMUIWindowInsetLayout, qMUITopBarLayout, qMUIWindowInsetLayout, justifyTextView);
                C9135i m2657a = C9135i.m2657a();
                m2657a.m2656b(R.attr.app_skin_common_background);
                QMUIWindowInsetLayout qMUIWindowInsetLayout2 = this.f5823v.f5770c;
                int i2 = C9106f.f17535a;
                C9106f.m2677c(qMUIWindowInsetLayout2, m2657a.m2655c());
                this.f5823v.f5769b.m2608f(getString(R.string.disclaimer));
                this.f5823v.f5769b.m2609d().setOnClickListener(new View$OnClickListenerC2428a());
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_one));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_two));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_three));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_four));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_five));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_six));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_seven));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_eight));
                stringBuffer.append("\n\u3000" + getString(R.string.dis_msg_nine));
                this.f5823v.f5771d.setText(stringBuffer);
                this.f5823v.f5771d.setOnLinkClickListener(this.f5824w);
                return this.f5823v.f5768a;
            }
            i = R.id.text;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}

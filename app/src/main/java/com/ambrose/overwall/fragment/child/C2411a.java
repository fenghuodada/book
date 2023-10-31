package com.ambrose.overwall.fragment.child;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2393a;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.fragment.child.a */
/* loaded from: classes.dex */
public class C2411a extends AbstractC2518d {

    /* renamed from: w */
    public static final /* synthetic */ int f5793w = 0;

    /* renamed from: v */
    public C2393a f5794v;

    /* renamed from: com.ambrose.overwall.fragment.child.a$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2412a implements View.OnClickListener {
        public View$OnClickListenerC2412a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2411a.f5793w;
            C2411a.this.m2804u();
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.a$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2413b implements View.OnClickListener {
        public View$OnClickListenerC2413b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2411a c2411a = C2411a.this;
            c2411a.m9401w(c2411a.f5794v.f5746c, c2411a.getString(R.string.introduce_three));
        }
    }

    @Override // com.ambrose.overwall.p006ui.AbstractC2518d, com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        String str = null;
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_about, (ViewGroup) null, false);
        int i = R.id.fname;
        TextView textView = (TextView) C1806b.m9912a(R.id.fname, inflate);
        if (textView != null) {
            i = R.id.headImage;
            if (((ImageView) C1806b.m9912a(R.id.headImage, inflate)) != null) {
                i = R.id.mtopbar;
                QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
                if (qMUITopBarLayout != null) {
                    i = R.id.name;
                    if (((TextView) C1806b.m9912a(R.id.name, inflate)) != null) {
                        QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
                        i = R.id.textview;
                        TextView textView2 = (TextView) C1806b.m9912a(R.id.textview, inflate);
                        if (textView2 != null) {
                            this.f5794v = new C2393a(qMUIWindowInsetLayout, textView, qMUITopBarLayout, qMUIWindowInsetLayout, textView2);
                            qMUITopBarLayout.m2608f(getString(R.string.about));
                            this.f5794v.f5746c.m2609d().setOnClickListener(new View$OnClickListenerC2412a());
                            this.f5794v.f5746c.f17642c.m2616j(R.mipmap.ic_about, R.id.topbar_view_right).setOnClickListener(new View$OnClickListenerC2413b());
                            C9135i m2657a = C9135i.m2657a();
                            m2657a.m2656b(R.attr.app_skin_common_background);
                            QMUIWindowInsetLayout qMUIWindowInsetLayout2 = this.f5794v.f5747d;
                            int i2 = C9106f.f17535a;
                            C9106f.m2677c(qMUIWindowInsetLayout2, m2657a.m2655c());
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(getString(R.string.about_one) + "\n");
                            stringBuffer.append(getString(R.string.about_two) + "\n");
                            stringBuffer.append(getString(R.string.about_three) + "\n");
                            stringBuffer.append(getString(R.string.about_four) + "\n");
                            stringBuffer.append(getString(R.string.about_five) + "\n");
                            this.f5794v.f5748e.setText(stringBuffer);
                            TextView textView3 = this.f5794v.f5745b;
                            StringBuilder sb = new StringBuilder();
                            sb.append(getString(R.string.version));
                            MyApplication myApplication = MyApplication.f5741c;
                            try {
                                str = myApplication.getPackageManager().getPackageInfo(myApplication.getPackageName(), 0).versionName;
                            } catch (Exception e) {
                                Log.e("VersionInfo", "Exception", e);
                            }
                            sb.append(str);
                            textView3.setText(sb.toString());
                            return this.f5794v.f5744a;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}

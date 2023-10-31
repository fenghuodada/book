package com.ambrose.overwall.fragment;

import android.view.View;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.android.tool.util.util.C2603g;

/* renamed from: com.ambrose.overwall.fragment.h0 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2458h0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2451e0 f5887a;

    public View$OnClickListenerC2458h0(C2451e0 c2451e0) {
        this.f5887a = c2451e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String m9338b = C2603g.m9338b("announcement");
        C2451e0 c2451e0 = this.f5887a;
        if (m9338b != null) {
            c2451e0.m9401w(c2451e0.f5876K.f5787c, C2603g.m9338b("announcement"));
            return;
        }
        Toast.makeText(MyApplication.f5741c, c2451e0.getString(R.string.announcement_tips), 0).show();
    }
}

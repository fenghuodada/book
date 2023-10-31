package com.ambrose.overwall.fragment.child;

import android.view.View;
import com.ambrose.overwall.R;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.widget.dialog.C9180k;
import com.qmuiteam.qmui.widget.dialog.C9191o;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;

/* renamed from: com.ambrose.overwall.fragment.child.h */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2432h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2430g f5839a;

    public View$OnClickListenerC2432h(C2430g c2430g) {
        this.f5839a = c2430g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = C2430g.f5827F;
        C2430g c2430g = this.f5839a;
        String[] strArr = {c2430g.getString(R.string.amin_style_ios), c2430g.getString(R.string.amin_style_scle), c2430g.getString(R.string.amin_style_top), c2430g.getString(R.string.amin_style_bottom), c2430g.getString(R.string.amin_style_left), c2430g.getString(R.string.amin_style_right)};
        DialogC9181l.C9182a c9182a = new DialogC9181l.C9182a(c2430g.getActivity());
        c9182a.f17730n = C2603g.m9339a("AnimStyle") - 1;
        c9182a.f17697j = C9108h.m2670f(c2430g.getContext());
        DialogInterface$OnClickListenerC2438n dialogInterface$OnClickListenerC2438n = new DialogInterface$OnClickListenerC2438n();
        for (int i2 = 0; i2 < 6; i2++) {
            c9182a.f17735l.add(new C9191o(c9182a, new C9180k(strArr[i2]), dialogInterface$OnClickListenerC2438n));
        }
        c9182a.m2594b(c2430g.f5835x).show();
    }
}

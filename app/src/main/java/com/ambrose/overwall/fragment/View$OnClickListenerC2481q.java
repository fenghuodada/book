package com.ambrose.overwall.fragment;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.weight.sectionDialog.C2628d;
import com.android.tool.util.weight.sectionDialog.C2634e;
import com.android.tool.util.weight.sectionDialog.C2636g;
import com.android.tool.util.weight.sectionDialog.C2637h;
import com.android.tool.util.weight.sectionDialog.C2638i;
import com.android.tool.util.weight.sectionDialog.C2639j;
import com.android.tool.util.weight.sectionDialog.C2640k;
import com.android.tool.util.weight.sectionDialog.CenterLayoutManager;
import com.android.tool.util.weight.sectionDialog.View$OnClickListenerC2624b;
import com.qmuiteam.qmui.arch.AbstractActivityC9024f;
import com.qmuiteam.qmui.skin.defaultAttr.C9104b;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;
import java.util.ArrayList;

/* renamed from: com.ambrose.overwall.fragment.q */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2481q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5940a;

    /* renamed from: b */
    public final /* synthetic */ C2470n f5941b;

    /* renamed from: com.ambrose.overwall.fragment.q$a */
    /* loaded from: classes.dex */
    public class C2482a implements C2640k.InterfaceC2642b {
        public C2482a() {
        }
    }

    public View$OnClickListenerC2481q(C2470n c2470n, int i) {
        this.f5941b = c2470n;
        this.f5940a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        C2470n c2470n = this.f5941b;
        AbstractActivityC9024f m2811m = c2470n.m2811m();
        C2640k.C2641a c2641a = new C2640k.C2641a(m2811m);
        c2641a.f6195j = new C2482a();
        ArrayList arrayList = c2470n.f5908J;
        ArrayList arrayList2 = c2470n.f5909K;
        int i2 = c2470n.f5930z;
        int i3 = c2470n.f5899A;
        int i4 = c2470n.f5902D;
        int i5 = c2470n.f5903E;
        c2641a.f6198m = new View$OnClickListenerC2624b(m2811m);
        ApplicationC2534a applicationC2534a = ApplicationC2534a.f6025a;
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager();
        c2641a.f6208w = centerLayoutManager;
        RecyclerView recyclerView = c2641a.f6196k;
        recyclerView.setLayoutManager(centerLayoutManager);
        recyclerView.setAdapter(c2641a.f6198m);
        View$OnClickListenerC2624b view$OnClickListenerC2624b = c2641a.f6198m;
        view$OnClickListenerC2624b.f6164i = arrayList;
        view$OnClickListenerC2624b.notifyDataSetChanged();
        c2641a.f6209x = new GridLayoutManager();
        c2641a.f6199n = new C2628d(m2811m);
        GridLayoutManager gridLayoutManager = c2641a.f6209x;
        RecyclerView recyclerView2 = c2641a.f6197l;
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(c2641a.f6199n);
        C2628d c2628d = c2641a.f6199n;
        c2628d.f6174j = arrayList2;
        c2628d.notifyDataSetChanged();
        String string = m2811m.getString(R.string.serverlist);
        QMUITopBar qMUITopBar = c2641a.f6202q;
        qMUITopBar.m2611o(string);
        String str = m2811m.getString(R.string.ic_num) + "\u3000" + this.f5940a + "\u3000" + m2811m.getString(R.string.ic_num_tiao);
        if (qMUITopBar.f17623h == null) {
            QMUISpanTouchFixTextView qMUISpanTouchFixTextView = new QMUISpanTouchFixTextView(qMUITopBar.getContext(), null);
            qMUITopBar.f17623h = qMUISpanTouchFixTextView;
            qMUISpanTouchFixTextView.setGravity(17);
            qMUITopBar.f17623h.setSingleLine(true);
            qMUITopBar.f17623h.setTypeface(qMUITopBar.f17632q);
            qMUITopBar.f17623h.setEllipsize(qMUITopBar.f17616C);
            qMUITopBar.f17623h.setTextSize(0, qMUITopBar.f17634s);
            qMUITopBar.f17623h.setTextColor(qMUITopBar.f17636u);
            C9104b c9104b = new C9104b();
            c9104b.f17534a.put("textColor", Integer.valueOf((int) R.attr.qmui_skin_support_topbar_subtitle_color));
            qMUITopBar.f17623h.setTag(R.id.qmui_skin_default_attr_provider, c9104b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = qMUITopBar.f17626k;
            layoutParams.topMargin = C9141b.m2646a(qMUITopBar.getContext(), 1);
            qMUITopBar.m2612n().addView(qMUITopBar.f17623h, layoutParams);
        }
        QMUISpanTouchFixTextView qMUISpanTouchFixTextView2 = qMUITopBar.f17623h;
        qMUISpanTouchFixTextView2.setText(str);
        if (C9143d.m2642c(str)) {
            qMUISpanTouchFixTextView2.setVisibility(8);
            i = 0;
        } else {
            i = 0;
            qMUISpanTouchFixTextView2.setVisibility(0);
        }
        qMUITopBar.m2610r();
        SparseIntArray sparseIntArray = C2640k.f6194a;
        if (arrayList2 != null) {
            for (int i6 = i; i6 < arrayList2.size(); i6++) {
                if (((C2634e) arrayList2.get(i6)).f6186d == 1) {
                    C2640k.f6194a.put(i, i6);
                    i++;
                }
            }
        }
        c2641a.f6198m.f6165j = new C2636g(c2641a);
        c2641a.f6199n.f6175k = new C2637h(c2641a);
        recyclerView2.m10369h(new C2638i(c2641a));
        recyclerView.m10369h(new C2639j(c2641a));
        c2641a.f6203r = i2;
        c2641a.f6204s = i3;
        c2641a.f6205t = i4;
        c2641a.f6206u = i5;
        GridLayoutManager gridLayoutManager2 = c2641a.f6209x;
        if (gridLayoutManager2 != null && i3 >= 0) {
            gridLayoutManager2.m10418d1(i3, i2);
        }
        CenterLayoutManager centerLayoutManager2 = c2641a.f6208w;
        if (centerLayoutManager2 != null && i5 >= 0) {
            centerLayoutManager2.m10418d1(i5, i4);
        }
        c2641a.m9323e();
    }
}

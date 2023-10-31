package com.ambrose.overwall.fragment;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.C9057a;
import com.qmuiteam.qmui.layout.C9063g;
import com.qmuiteam.qmui.layout.C9065i;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.dialog.C9175h;
import com.qmuiteam.qmui.widget.dialog.C9176i;
import com.qmuiteam.qmui.widget.dialog.C9177j;
import com.qmuiteam.qmui.widget.dialog.QMUIBottomSheet;
import com.qmuiteam.qmui.widget.dialog.View$OnClickListenerC9173f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ambrose.overwall.fragment.b */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2404b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5789a;

    public View$OnClickListenerC2404b(C2470n c2470n) {
        this.f5789a = c2470n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        int i = C2470n.f5898e0;
        C2470n c2470n = this.f5789a;
        FragmentActivity activity = c2470n.getActivity();
        QMUIBottomSheet.BottomGridSheetBuilder bottomGridSheetBuilder = new QMUIBottomSheet.BottomGridSheetBuilder(activity);
        if (c2470n.f5927w != null) {
            bottomGridSheetBuilder.m2601a(R.mipmap.ic_serverlsit, c2470n.getString(R.string.delat_lsit), 0);
        }
        bottomGridSheetBuilder.m2601a(R.mipmap.ic_server_custom, c2470n.getString(R.string.custom_lsit), 1);
        bottomGridSheetBuilder.m2601a(R.mipmap.ic_server_all, c2470n.getString(R.string.all_lsit), 2);
        bottomGridSheetBuilder.m2601a(R.mipmap.ic_server_random, c2470n.getString(R.string.random_lsit), 3);
        bottomGridSheetBuilder.f17709b = true;
        bottomGridSheetBuilder.f17710c = c2470n.getString(R.string.show_cancal);
        bottomGridSheetBuilder.f17711d = C9108h.m2670f(c2470n.getContext());
        bottomGridSheetBuilder.f17675g = new C2453f(c2470n);
        QMUIBottomSheet qMUIBottomSheet = new QMUIBottomSheet(activity);
        bottomGridSheetBuilder.f17708a = qMUIBottomSheet;
        Context context = qMUIBottomSheet.getContext();
        bottomGridSheetBuilder.f17708a.f17668j.removeAllViews();
        QMUIBottomSheet qMUIBottomSheet2 = bottomGridSheetBuilder.f17708a;
        ArrayList<C9175h> arrayList2 = bottomGridSheetBuilder.f17673e;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList<C9175h> arrayList3 = bottomGridSheetBuilder.f17674f;
        ArrayList arrayList4 = null;
        C9177j c9177j = null;
        if (!isEmpty || !arrayList3.isEmpty()) {
            boolean isEmpty2 = arrayList2.isEmpty();
            QMUIBottomSheet.BottomGridSheetBuilder.C9164a c9164a = QMUIBottomSheet.BottomGridSheetBuilder.f17672h;
            if (!isEmpty2) {
                arrayList = new ArrayList();
                Iterator<C9175h> it = arrayList2.iterator();
                while (it.hasNext()) {
                    C9176i m2600a = c9164a.m2600a(qMUIBottomSheet2, it.next());
                    m2600a.setOnClickListener(bottomGridSheetBuilder);
                    arrayList.add(new Pair(m2600a, new LinearLayout.LayoutParams(-2, -2)));
                }
            } else {
                arrayList = null;
            }
            if (!arrayList3.isEmpty()) {
                arrayList4 = new ArrayList();
                Iterator<C9175h> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C9176i m2600a2 = c9164a.m2600a(qMUIBottomSheet2, it2.next());
                    m2600a2.setOnClickListener(bottomGridSheetBuilder);
                    arrayList4.add(new Pair(m2600a2, new LinearLayout.LayoutParams(-2, -2)));
                }
            }
            c9177j = new C9177j(bottomGridSheetBuilder.f17708a, arrayList, arrayList4);
        }
        if (c9177j != null) {
            C9065i.C9066a c9066a = new C9065i.C9066a(-2);
            c9066a.f17379a = 1;
            bottomGridSheetBuilder.f17708a.f17668j.addView(c9177j, c9066a);
        }
        QMUIBottomSheet qMUIBottomSheet3 = bottomGridSheetBuilder.f17708a;
        if (bottomGridSheetBuilder.f17709b) {
            C9057a c9057a = new C9057a(context);
            c9057a.setId(R.id.qmui_bottom_sheet_cancel);
            String str = bottomGridSheetBuilder.f17710c;
            if (str == null || str.isEmpty()) {
                bottomGridSheetBuilder.f17710c = context.getString(R.string.qmui_cancel);
            }
            c9057a.setPadding(0, 0, 0, 0);
            c9057a.setBackground(C9145f.m2635f(R.attr.qmui_skin_support_bottom_sheet_cancel_bg, context, context.getTheme()));
            c9057a.setText(bottomGridSheetBuilder.f17710c);
            C9145f.m2640a(c9057a, R.attr.qmui_bottom_sheet_cancel_style);
            c9057a.setOnClickListener(new View$OnClickListenerC9173f(qMUIBottomSheet3));
            int m2639b = C9145f.m2639b(R.attr.qmui_skin_support_bottom_sheet_separator_color, context.getTheme());
            C9063g c9063g = c9057a.f17327e;
            c9063g.f17355f = 0;
            c9063g.f17356g = 0;
            c9063g.f17354e = 1;
            c9063g.f17357h = m2639b;
            c9063g.f17364o = 0;
            c9063g.f17369t = 0;
            c9063g.f17359j = 0;
            c9057a.invalidate();
            C9135i m2657a = C9135i.m2657a();
            m2657a.m2652f(R.attr.qmui_skin_support_bottom_sheet_cancel_text_color);
            m2657a.m2651g(R.attr.qmui_skin_support_bottom_sheet_separator_color);
            m2657a.m2656b(R.attr.qmui_skin_support_bottom_sheet_cancel_bg);
            int i2 = C9106f.f17535a;
            C9106f.m2677c(c9057a, m2657a.m2655c());
            C9135i.m2653e(m2657a);
            qMUIBottomSheet3.f17668j.addView(c9057a, new C9065i.C9066a(C9145f.m2636e(context, R.attr.qmui_bottom_sheet_cancel_btn_height)));
        }
        QMUIBottomSheet qMUIBottomSheet4 = bottomGridSheetBuilder.f17708a;
        C9108h c9108h = bottomGridSheetBuilder.f17711d;
        C9108h c9108h2 = qMUIBottomSheet4.f17703i;
        if (c9108h2 != null) {
            c9108h2.m2664l(qMUIBottomSheet4);
        }
        qMUIBottomSheet4.f17703i = c9108h;
        if (qMUIBottomSheet4.isShowing() && c9108h != null) {
            qMUIBottomSheet4.f17703i.m2665k(qMUIBottomSheet4);
        }
        QMUIBottomSheet qMUIBottomSheet5 = bottomGridSheetBuilder.f17708a;
        qMUIBottomSheet5.f17669k.f17676e0 = false;
        qMUIBottomSheet5.show();
    }
}

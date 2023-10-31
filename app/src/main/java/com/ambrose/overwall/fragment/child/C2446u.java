package com.ambrose.overwall.fragment.child;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2400h;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.adapter.question.C2539a;
import com.android.tool.adapter.question.C2542c;
import com.android.tool.adapter.question.C2544d;
import com.android.tool.adapter.question.C2545e;
import com.android.tool.adapter.question.C2546f;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import java.util.ArrayList;
import java.util.Collections;
import mva2.adapter.C11174a;
import mva2.adapter.C11179e;
import mva2.adapter.C11180f;
import mva2.adapter.C11182g;
import mva2.adapter.internal.C11185b;
import mva2.adapter.util.EnumC11188a;

/* renamed from: com.ambrose.overwall.fragment.child.u */
/* loaded from: classes.dex */
public class C2446u extends AbstractC2518d {

    /* renamed from: A */
    public static final /* synthetic */ int f5856A = 0;

    /* renamed from: v */
    public C11180f f5857v;

    /* renamed from: w */
    public C11174a<C2545e> f5858w;

    /* renamed from: x */
    public C11174a<C2545e> f5859x;

    /* renamed from: y */
    public final C11179e<C2544d> f5860y = new C11179e<>();

    /* renamed from: z */
    public C2400h f5861z;

    /* renamed from: com.ambrose.overwall.fragment.child.u$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2447a implements View.OnClickListener {
        public View$OnClickListenerC2447a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2446u.f5856A;
            C2446u.this.m2804u();
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_question, (ViewGroup) null, false);
        int i = R.id.mtopbar;
        QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
        if (qMUITopBarLayout != null) {
            QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
            RecyclerView recyclerView = (RecyclerView) C1806b.m9912a(R.id.recyclerview, inflate);
            if (recyclerView != null) {
                this.f5861z = new C2400h(qMUIWindowInsetLayout, qMUITopBarLayout, qMUIWindowInsetLayout, recyclerView);
                C9135i m2657a = C9135i.m2657a();
                m2657a.m2656b(R.attr.app_skin_common_background);
                QMUIWindowInsetLayout qMUIWindowInsetLayout2 = this.f5861z.f5783c;
                int i2 = C9106f.f17535a;
                C9106f.m2677c(qMUIWindowInsetLayout2, m2657a.m2655c());
                this.f5861z.f5782b.m2608f(getString(R.string.question));
                this.f5861z.f5782b.m2609d().setOnClickListener(new View$OnClickListenerC2447a());
                getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                this.f5858w = new C11174a<>(new C2545e());
                this.f5859x = new C11174a<>(new C2545e());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2544d(getString(R.string.q_seventeen), getString(R.string.a_seventeen)));
                arrayList.add(new C2544d(getString(R.string.q_fourteen), getString(R.string.a_fourteen)));
                arrayList.add(new C2544d(getString(R.string.q_eightp), getString(R.string.a_eightp)));
                arrayList.add(new C2544d(getString(R.string.q_nineex), getString(R.string.a_nineex)));
                arrayList.add(new C2544d(getString(R.string.q_two), getString(R.string.a_two)));
                arrayList.add(new C2544d(getString(R.string.q_three), getString(R.string.a_three)));
                arrayList.add(new C2544d(getString(R.string.q_eight), getString(R.string.a_eight)));
                arrayList.add(new C2544d(getString(R.string.q_nine), getString(R.string.a_nine)));
                arrayList.add(new C2544d(getString(R.string.q_ten), getString(R.string.a_ten)));
                arrayList.add(new C2544d(getString(R.string.q_eleven), getString(R.string.a_eleven)));
                arrayList.add(new C2544d(getString(R.string.q_twele), getString(R.string.a_twele)));
                arrayList.add(new C2544d(getString(R.string.q_fireteen), getString(R.string.a_fireteen)));
                arrayList.add(new C2544d(getString(R.string.q_fiveteen), getString(R.string.a_fiveteen)));
                arrayList.add(new C2544d(getString(R.string.q_sixteen), getString(R.string.a_sixteen)));
                arrayList.add(new C2544d(getString(R.string.q_eightteen), getString(R.string.a_eightteen)));
                C11179e<C2544d> c11179e = this.f5860y;
                ArrayList arrayList2 = c11179e.f21836e;
                int size = arrayList2.size();
                if (arrayList2.addAll(size, arrayList)) {
                    for (int i3 = size; i3 < arrayList.size() + size; i3++) {
                        c11179e.f21837f.add(new C11185b());
                    }
                    c11179e.m71m(size, arrayList.size());
                }
                this.f5858w.f21829h.mo86o(c11179e);
                C11180f c11180f = new C11180f();
                this.f5857v = c11180f;
                C11174a<C2545e> c11174a = this.f5858w;
                C2546f c2546f = new C2546f(c11180f);
                if (c11174a.f21851c == null) {
                    c11174a.f21851c = new ArrayList();
                }
                c11174a.f21851c.add(c2546f);
                Collections.addAll(this.f5857v.f21839i, new C2539a(), new C2542c());
                C11180f c11180f2 = this.f5857v;
                EnumC11188a enumC11188a = EnumC11188a.SINGLE;
                C11182g c11182g = c11180f2.f21838h;
                c11182g.f21849a = enumC11188a;
                C11174a<C2545e> c11174a2 = this.f5858w;
                if (c11174a2 != null) {
                    if (c11174a2.f21852d == null) {
                        c11182g.mo86o(c11174a2);
                    } else {
                        throw new IllegalStateException("Section is already has a parent!");
                    }
                }
                C11180f c11180f3 = this.f5857v;
                C11174a<C2545e> c11174a3 = this.f5859x;
                c11180f3.getClass();
                if (c11174a3 != null) {
                    if (c11174a3.f21852d == null) {
                        c11180f3.f21838h.mo86o(c11174a3);
                    } else {
                        throw new IllegalStateException("Section is already has a parent!");
                    }
                }
                this.f5861z.f5784d.setAdapter(this.f5857v);
                this.f5861z.f5784d.setLayoutManager(linearLayoutManager);
                this.f5861z.f5784d.m10370g(this.f5857v.f21840j);
                return this.f5861z.f5781a;
            }
            i = R.id.recyclerview;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}

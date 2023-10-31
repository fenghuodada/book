package com.ambrose.overwall.fragment.child;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.C1453c0;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1489r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C1806b;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2394b;
import com.ambrose.overwall.p005mv.apppack.C2492a;
import com.ambrose.overwall.p005mv.apppack.C2493b;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.android.tool.ApplicationC2534a;
import com.android.tool.adapter.C2536b;
import com.android.tool.pref.C2553a;
import com.android.tool.pref.C2556b;
import com.android.tool.pref.C2557c;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.dialog.C9191o;
import com.qmuiteam.qmui.widget.dialog.C9193p;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.internal.observers.C10187b;
import io.reactivex.rxjava3.internal.operators.observable.C10202h;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import io.reactivex.rxjava3.schedulers.C10235a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.ambrose.overwall.fragment.child.b */
/* loaded from: classes.dex */
public class C2414b extends AbstractC2518d {

    /* renamed from: C */
    public static final /* synthetic */ int f5797C = 0;

    /* renamed from: A */
    public C2493b f5798A;

    /* renamed from: v */
    public C2536b f5800v;

    /* renamed from: w */
    public C2556b f5801w;

    /* renamed from: y */
    public C2394b f5803y;

    /* renamed from: x */
    public HashSet f5802x = new HashSet();

    /* renamed from: z */
    public Boolean f5804z = Boolean.TRUE;

    /* renamed from: B */
    public final int f5799B = 2132017573;

    /* renamed from: com.ambrose.overwall.fragment.child.b$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2415a implements View.OnClickListener {
        public View$OnClickListenerC2415a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2414b.f5797C;
            C2414b.this.m2804u();
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.b$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2416b implements View.OnClickListener {
        public View$OnClickListenerC2416b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = C2414b.f5797C;
            C2414b c2414b = C2414b.this;
            String[] strArr = {c2414b.getString(R.string.clese_all), c2414b.getString(R.string.open_all)};
            DialogC9181l.C9186d c9186d = new DialogC9181l.C9186d(c2414b.getActivity());
            c9186d.f17697j = C9108h.m2670f(c2414b.getContext());
            DialogInterface$OnClickListenerC2421d dialogInterface$OnClickListenerC2421d = new DialogInterface$OnClickListenerC2421d(c2414b);
            for (int i2 = 0; i2 < 2; i2++) {
                c9186d.f17735l.add(new C9191o(c9186d, new C9193p(strArr[i2]), dialogInterface$OnClickListenerC2421d));
            }
            c9186d.m2594b(c2414b.f5799B).show();
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.b$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2417c implements View.OnClickListener {
        public View$OnClickListenerC2417c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText;
            int i;
            C2414b c2414b = C2414b.this;
            if (c2414b.f5804z.booleanValue()) {
                editText = c2414b.f5803y.f5750b;
                i = 0;
            } else {
                editText = c2414b.f5803y.f5750b;
                i = 8;
            }
            editText.setVisibility(i);
            c2414b.f5804z = Boolean.valueOf(!c2414b.f5804z.booleanValue());
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.b$d */
    /* loaded from: classes.dex */
    public class C2418d implements InterfaceC10174b<Long> {
        public C2418d() {
        }

        @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
        public final void accept(Long l) throws Throwable {
            String str;
            C2414b c2414b = C2414b.this;
            C2493b c2493b = c2414b.f5798A;
            C2556b c2556b = c2414b.f5801w;
            if (c2493b.f5956c != null) {
                c2493b.f5956c = null;
            }
            C2492a c2492a = c2493b.f5955b;
            c2492a.getClass();
            ArrayList arrayList = new ArrayList();
            for (ApplicationInfo applicationInfo : ApplicationC2534a.f6025a.getPackageManager().getInstalledApplications(128)) {
                try {
                    if ((applicationInfo.flags & 1) != 1) {
                        c2492a.f5951b = applicationInfo.loadLabel(ApplicationC2534a.f6025a.getPackageManager()).toString();
                        c2492a.f5953d = applicationInfo.loadIcon(ApplicationC2534a.f6025a.getPackageManager());
                        c2492a.f5952c = applicationInfo.packageName;
                        if (!c2556b.m9373c().contains(c2492a.f5952c)) {
                            c2492a.f5954e = true;
                            str = "A";
                        } else {
                            c2492a.f5954e = false;
                            str = "B";
                        }
                        arrayList.add(new C2553a(c2492a.f5951b, c2492a.f5952c, c2492a.f5953d, c2492a.f5954e, str));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Collections.sort(arrayList, C2553a.f6045f);
            Collections.sort(arrayList, C2553a.f6046g);
            C1489r<List<C2553a>> c1489r = c2492a.f5950a;
            c1489r.mo10510i(arrayList);
            c2493b.f5956c = c1489r;
            c1489r.m10573d(c2414b.getViewLifecycleOwner(), new C2420c(this));
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.child.b$e */
    /* loaded from: classes.dex */
    public class C2419e implements TextWatcher {
        public C2419e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2536b c2536b = C2414b.this.f5800v;
            c2536b.getClass();
            new C2536b.C2537a().filter(charSequence.toString());
        }
    }

    @Override // com.ambrose.overwall.p006ui.AbstractC2518d, com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    @SuppressLint({"CheckResult"})
    /* renamed from: q */
    public final View mo2788q() {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_app_package, (ViewGroup) null, false);
        int i = R.id.filterapp;
        EditText editText = (EditText) C1806b.m9912a(R.id.filterapp, inflate);
        if (editText != null) {
            i = R.id.layoutwi;
            LinearLayout linearLayout = (LinearLayout) C1806b.m9912a(R.id.layoutwi, inflate);
            if (linearLayout != null) {
                i = R.id.mtopbar;
                QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.mtopbar, inflate);
                if (qMUITopBarLayout != null) {
                    i = R.id.progressbar;
                    ProgressBar progressBar = (ProgressBar) C1806b.m9912a(R.id.progressbar, inflate);
                    if (progressBar != null) {
                        QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
                        i = R.id.recyclerview;
                        RecyclerView recyclerView = (RecyclerView) C1806b.m9912a(R.id.recyclerview, inflate);
                        if (recyclerView != null) {
                            this.f5803y = new C2394b(qMUIWindowInsetLayout, editText, linearLayout, qMUITopBarLayout, progressBar, recyclerView);
                            qMUITopBarLayout.m2608f(getString(R.string.appvp));
                            this.f5803y.f5752d.m2609d().setOnClickListener(new View$OnClickListenerC2415a());
                            this.f5803y.f5752d.f17642c.m2616j(R.mipmap.ic_select, R.id.topbar_view_right).setOnClickListener(new View$OnClickListenerC2416b());
                            this.f5803y.f5752d.f17642c.m2616j(R.mipmap.ic_seaech, R.id.topbar_view_right_secound).setOnClickListener(new View$OnClickListenerC2417c());
                            this.f5801w = new C2556b(new C2557c());
                            this.f5800v = new C2536b(new LinkedList(), this.f5801w);
                            getContext();
                            this.f5803y.f5754f.setLayoutManager(new LinearLayoutManager(1));
                            this.f5803y.f5754f.setAdapter(this.f5800v);
                            C2536b c2536b = this.f5800v;
                            RecyclerView recyclerView2 = c2536b.f9971l;
                            if (recyclerView2 != null) {
                                View view = LayoutInflater.from(recyclerView2.getContext()).inflate(R.layout.empty_view, (ViewGroup) recyclerView2, false);
                                C10843j.m431e(view, "view");
                                int itemCount = c2536b.getItemCount();
                                if (c2536b.f9969j == null) {
                                    FrameLayout frameLayout = new FrameLayout(view.getContext());
                                    c2536b.f9969j = frameLayout;
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        layoutParams = new ViewGroup.LayoutParams(layoutParams2.width, layoutParams2.height);
                                    } else {
                                        layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                    }
                                    frameLayout.setLayoutParams(layoutParams);
                                    z = true;
                                } else {
                                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                                    if (layoutParams3 != null) {
                                        FrameLayout frameLayout2 = c2536b.f9969j;
                                        if (frameLayout2 != null) {
                                            ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                                            layoutParams4.width = layoutParams3.width;
                                            layoutParams4.height = layoutParams3.height;
                                            FrameLayout frameLayout3 = c2536b.f9969j;
                                            if (frameLayout3 != null) {
                                                frameLayout3.setLayoutParams(layoutParams4);
                                            } else {
                                                C10843j.m424l("mEmptyLayout");
                                                throw null;
                                            }
                                        } else {
                                            C10843j.m424l("mEmptyLayout");
                                            throw null;
                                        }
                                    }
                                    z = false;
                                }
                                FrameLayout frameLayout4 = c2536b.f9969j;
                                if (frameLayout4 != null) {
                                    frameLayout4.removeAllViews();
                                    FrameLayout frameLayout5 = c2536b.f9969j;
                                    if (frameLayout5 != null) {
                                        frameLayout5.addView(view);
                                        c2536b.f9968i = true;
                                        if (z && c2536b.m6387c()) {
                                            if (c2536b.getItemCount() > itemCount) {
                                                c2536b.notifyItemInserted(0);
                                            } else {
                                                c2536b.notifyDataSetChanged();
                                            }
                                        }
                                    } else {
                                        C10843j.m424l("mEmptyLayout");
                                        throw null;
                                    }
                                } else {
                                    C10843j.m424l("mEmptyLayout");
                                    throw null;
                                }
                            }
                            this.f5798A = (C2493b) new C1469h0(this, new C1453c0(m2811m().getApplication(), this, null)).m10545a(C2493b.class);
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            C10206b c10206b = C10235a.f20569a;
                            Objects.requireNonNull(timeUnit, "unit is null");
                            Objects.requireNonNull(c10206b, "scheduler is null");
                            new C10202h(Math.max(1L, 0L), timeUnit, c10206b).m1223b(C10142b.m1225a()).m1220f(C10235a.f20570b).m1221d(new C10187b(new C2418d(), C10179a.f20440d));
                            this.f5803y.f5750b.addTextChangedListener(new C2419e());
                            return this.f5803y.f5749a;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: x */
    public final void m9418x(boolean z) {
        for (int i = 0; i < this.f5800v.f9967h.size(); i++) {
            ((C2553a) this.f5800v.f9967h.get(i)).f6050d = z;
        }
        this.f5800v.notifyDataSetChanged();
    }
}

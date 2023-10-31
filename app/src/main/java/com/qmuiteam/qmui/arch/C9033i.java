package com.qmuiteam.qmui.arch;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C1413s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1480k0;
import com.ambrose.overwall.R;

/* renamed from: com.qmuiteam.qmui.arch.i */
/* loaded from: classes3.dex */
public class C9033i extends AbstractC9008b implements InterfaceC9030g {

    /* renamed from: t */
    public FragmentContainerView f17254t;

    /* renamed from: u */
    public boolean f17255u = false;

    /* renamed from: com.qmuiteam.qmui.arch.i$a */
    /* loaded from: classes3.dex */
    public class C9034a implements FragmentManager.OnBackStackChangedListener {
        public C9034a() {
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            C1413s.m10584a(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
            C1413s.m10583b(this, fragment, z);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public final void onBackStackChanged() {
            C9033i c9033i = C9033i.this;
            c9033i.mo2789k();
            if (c9033i.getLifecycle().mo10538b().m10546a(AbstractC1464h.EnumC1468b.RESUMED)) {
                c9033i.m2787w();
            }
        }
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: a */
    public final boolean mo2795a() {
        return this.f17255u;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: b */
    public final InterfaceC1480k0 mo2794b() {
        return this;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    @Nullable
    /* renamed from: c */
    public final FragmentContainerView mo2793c() {
        return this.f17254t;
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: d */
    public final void mo2792d(boolean z) {
        this.f17255u = z;
        boolean z2 = false;
        InterfaceC9030g m2812l = m2812l(false);
        if (m2812l != null) {
            if (z || getChildFragmentManager().getBackStackEntryCount() > 1) {
                z2 = true;
            }
            m2812l.mo2792d(z2);
        }
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: e */
    public final FragmentManager mo2791e() {
        return getChildFragmentManager();
    }

    @Override // com.qmuiteam.qmui.arch.InterfaceC9030g
    /* renamed from: f */
    public final void mo2790f() {
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: k */
    public final void mo2789k() {
        boolean z = false;
        boolean z2 = getChildFragmentManager().getBackStackEntryCount() > 1;
        InterfaceC9030g m2812l = m2812l(false);
        if (m2812l != null) {
            if (this.f17255u || z2) {
                z = true;
            }
            m2812l.mo2792d(z);
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getChildFragmentManager().addOnBackStackChangedListener(new C9034a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments;
        AbstractC9008b abstractC9008b;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            try {
                abstractC9008b = (AbstractC9008b) Class.forName(arguments.getString("qmui_argument_dst_fragment")).newInstance();
                Bundle bundle2 = arguments.getBundle("qmui_argument_fragment_arg");
                if (bundle2 != null) {
                    abstractC9008b.setArguments(bundle2);
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                abstractC9008b = null;
            }
            if (abstractC9008b != null) {
                getChildFragmentManager().beginTransaction().add(R.id.qmui_activity_fragment_container_id, abstractC9008b, abstractC9008b.getClass().getSimpleName()).addToBackStack(abstractC9008b.getClass().getSimpleName()).commit();
            }
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17254t = null;
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m2787w();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.qmui_activity_fragment_container_id);
        this.f17254t = fragmentContainerView;
        if (fragmentContainerView == null) {
            throw new RuntimeException("must call #configFragmentContainerView() in onCreateView()");
        }
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: q */
    public final View mo2788q() {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(getContext());
        fragmentContainerView.setId(R.id.qmui_activity_fragment_container_id);
        return fragmentContainerView;
    }

    /* renamed from: w */
    public final void m2787w() {
        getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(getChildFragmentManager().getBackStackEntryCount() > 1 ? this : null).commit();
    }
}

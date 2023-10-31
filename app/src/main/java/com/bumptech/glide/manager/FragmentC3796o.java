package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import java.util.HashSet;

@Deprecated
/* renamed from: com.bumptech.glide.manager.o */
/* loaded from: classes.dex */
public final class FragmentC3796o extends Fragment {

    /* renamed from: a */
    public final C3780a f9806a;

    /* renamed from: b */
    public final C3797a f9807b;

    /* renamed from: c */
    public final HashSet f9808c;
    @Nullable

    /* renamed from: d */
    public ComponentCallbacks2C3441l f9809d;
    @Nullable

    /* renamed from: e */
    public FragmentC3796o f9810e;
    @Nullable

    /* renamed from: f */
    public Fragment f9811f;

    /* renamed from: com.bumptech.glide.manager.o$a */
    /* loaded from: classes.dex */
    public class C3797a implements InterfaceC3801q {
        public C3797a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + FragmentC3796o.this + "}";
        }
    }

    public FragmentC3796o() {
        C3780a c3780a = new C3780a();
        this.f9807b = new C3797a();
        this.f9808c = new HashSet();
        this.f9806a = c3780a;
    }

    /* renamed from: a */
    public final void m6489a(@NonNull Activity activity) {
        FragmentC3796o fragmentC3796o = this.f9810e;
        if (fragmentC3796o != null) {
            fragmentC3796o.f9808c.remove(this);
            this.f9810e = null;
        }
        C3798p c3798p = ComponentCallbacks2C3409b.m6786b(activity).f9038f;
        c3798p.getClass();
        FragmentC3796o m6485d = c3798p.m6485d(activity.getFragmentManager());
        this.f9810e = m6485d;
        if (!equals(m6485d)) {
            this.f9810e.f9808c.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6489a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9806a.m6496c();
        FragmentC3796o fragmentC3796o = this.f9810e;
        if (fragmentC3796o != null) {
            fragmentC3796o.f9808c.remove(this);
            this.f9810e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC3796o fragmentC3796o = this.f9810e;
        if (fragmentC3796o != null) {
            fragmentC3796o.f9808c.remove(this);
            this.f9810e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9806a.m6495d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9806a.m6494e();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f9811f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}

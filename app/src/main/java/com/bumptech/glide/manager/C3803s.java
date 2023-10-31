package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import java.util.HashSet;

/* renamed from: com.bumptech.glide.manager.s */
/* loaded from: classes.dex */
public class C3803s extends Fragment {

    /* renamed from: a */
    public final C3780a f9823a;

    /* renamed from: b */
    public final C3804a f9824b;

    /* renamed from: c */
    public final HashSet f9825c;
    @Nullable

    /* renamed from: d */
    public C3803s f9826d;
    @Nullable

    /* renamed from: e */
    public ComponentCallbacks2C3441l f9827e;
    @Nullable

    /* renamed from: f */
    public Fragment f9828f;

    /* renamed from: com.bumptech.glide.manager.s$a */
    /* loaded from: classes.dex */
    public class C3804a implements InterfaceC3801q {
        public C3804a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + C3803s.this + "}";
        }
    }

    public C3803s() {
        C3780a c3780a = new C3780a();
        this.f9824b = new C3804a();
        this.f9825c = new HashSet();
        this.f9823a = c3780a;
    }

    /* renamed from: h */
    public final void m6481h(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        C3803s c3803s = this.f9826d;
        if (c3803s != null) {
            c3803s.f9825c.remove(this);
            this.f9826d = null;
        }
        C3803s m6484e = ComponentCallbacks2C3409b.m6786b(context).f9038f.m6484e(fragmentManager);
        this.f9826d = m6484e;
        if (!equals(m6484e)) {
            this.f9826d.f9825c.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            m6481h(getContext(), fragmentManager);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9823a.m6496c();
        C3803s c3803s = this.f9826d;
        if (c3803s != null) {
            c3803s.f9825c.remove(this);
            this.f9826d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f9828f = null;
        C3803s c3803s = this.f9826d;
        if (c3803s != null) {
            c3803s.f9825c.remove(this);
            this.f9826d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9823a.m6495d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9823a.m6494e();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f9828f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}

package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0851a;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.C0877p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public final class C1650x extends C0851a {

    /* renamed from: d */
    public final RecyclerView f4009d;

    /* renamed from: e */
    public final C1651a f4010e;

    /* renamed from: androidx.recyclerview.widget.x$a */
    /* loaded from: classes.dex */
    public static class C1651a extends C0851a {

        /* renamed from: d */
        public final C1650x f4011d;

        /* renamed from: e */
        public final WeakHashMap f4012e = new WeakHashMap();

        public C1651a(@NonNull C1650x c1650x) {
            this.f4011d = c1650x;
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: a */
        public final boolean mo10097a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            return c0851a != null ? c0851a.mo10097a(view, accessibilityEvent) : super.mo10097a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0851a
        @Nullable
        /* renamed from: b */
        public final C0877p mo10096b(@NonNull View view) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            return c0851a != null ? c0851a.mo10096b(view) : super.mo10096b(view);
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: c */
        public final void mo4531c(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            if (c0851a != null) {
                c0851a.mo4531c(view, accessibilityEvent);
            } else {
                super.mo4531c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, C0874o c0874o) {
            boolean z;
            C1650x c1650x = this.f4011d;
            RecyclerView recyclerView = c1650x.f4009d;
            if (recyclerView.f3695u && !recyclerView.f3638D && !recyclerView.f3661d.m10176g()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                RecyclerView recyclerView2 = c1650x.f4009d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().m10330X(view, c0874o);
                    C0851a c0851a = (C0851a) this.f4012e.get(view);
                    if (c0851a != null) {
                        c0851a.mo4308d(view, c0874o);
                        return;
                    }
                }
            }
            this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: e */
        public final void mo4385e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            if (c0851a != null) {
                c0851a.mo4385e(view, accessibilityEvent);
            } else {
                super.mo4385e(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: f */
        public final boolean mo10095f(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0851a c0851a = (C0851a) this.f4012e.get(viewGroup);
            return c0851a != null ? c0851a.mo10095f(viewGroup, view, accessibilityEvent) : super.mo10095f(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: g */
        public final boolean mo4307g(View view, int i, Bundle bundle) {
            boolean z;
            C1650x c1650x = this.f4011d;
            RecyclerView recyclerView = c1650x.f4009d;
            if (recyclerView.f3695u && !recyclerView.f3638D && !recyclerView.f3661d.m10176g()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                RecyclerView recyclerView2 = c1650x.f4009d;
                if (recyclerView2.getLayoutManager() != null) {
                    C0851a c0851a = (C0851a) this.f4012e.get(view);
                    if (c0851a != null) {
                        if (c0851a.mo4307g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.mo4307g(view, i, bundle)) {
                        return true;
                    }
                    RecyclerView.C1586q c1586q = recyclerView2.getLayoutManager().f3716b.f3659b;
                    return false;
                }
            }
            return super.mo4307g(view, i, bundle);
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: h */
        public final void mo10094h(@NonNull View view, int i) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            if (c0851a != null) {
                c0851a.mo10094h(view, i);
            } else {
                super.mo10094h(view, i);
            }
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: i */
        public final void mo10093i(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C0851a c0851a = (C0851a) this.f4012e.get(view);
            if (c0851a != null) {
                c0851a.mo10093i(view, accessibilityEvent);
            } else {
                super.mo10093i(view, accessibilityEvent);
            }
        }
    }

    public C1650x(@NonNull RecyclerView recyclerView) {
        this.f4009d = recyclerView;
        C1651a c1651a = this.f4010e;
        this.f4010e = c1651a == null ? new C1651a(this) : c1651a;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: c */
    public final void mo4531c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo4531c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f4009d;
            if (recyclerView.f3695u && !recyclerView.f3638D && !recyclerView.f3661d.m10176g()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().mo4696W(accessibilityEvent);
                }
            }
        }
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, C0874o c0874o) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f4009d;
        if (recyclerView.f3695u && !recyclerView.f3638D && !recyclerView.f3661d.m10176g()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && recyclerView.getLayoutManager() != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f3716b;
            RecyclerView.C1586q c1586q = recyclerView2.f3659b;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f3716b.canScrollHorizontally(-1)) {
                c0874o.m11557a(8192);
                c0874o.m11548j(true);
            }
            if (layoutManager.f3716b.canScrollVertically(1) || layoutManager.f3716b.canScrollHorizontally(1)) {
                c0874o.m11557a(4096);
                c0874o.m11548j(true);
            }
            RecyclerView.C1594v c1594v = recyclerView2.f3676k0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo10334M(c1586q, c1594v), layoutManager.mo10309y(c1586q, c1594v), false, 0));
        }
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: g */
    public final boolean mo4307g(View view, int i, Bundle bundle) {
        boolean z;
        int i2;
        int m10339H;
        if (super.mo4307g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4009d;
        if (recyclerView.f3695u && !recyclerView.f3638D && !recyclerView.f3661d.m10176g()) {
            z = false;
        } else {
            z = true;
        }
        if (z || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3716b;
        RecyclerView.C1586q c1586q = recyclerView2.f3659b;
        if (i != 4096) {
            if (i != 8192) {
                m10339H = 0;
                i2 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i2 = -((layoutManager.f3729o - layoutManager.m10337J()) - layoutManager.m10340G());
                } else {
                    i2 = 0;
                }
                if (layoutManager.f3716b.canScrollHorizontally(-1)) {
                    m10339H = -((layoutManager.f3728n - layoutManager.m10339H()) - layoutManager.m10338I());
                }
                m10339H = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                i2 = (layoutManager.f3729o - layoutManager.m10337J()) - layoutManager.m10340G();
            } else {
                i2 = 0;
            }
            if (layoutManager.f3716b.canScrollHorizontally(1)) {
                m10339H = (layoutManager.f3728n - layoutManager.m10339H()) - layoutManager.m10338I();
            }
            m10339H = 0;
        }
        if (i2 == 0 && m10339H == 0) {
            return false;
        }
        layoutManager.f3716b.m10379b0(m10339H, i2, true);
        return true;
    }
}

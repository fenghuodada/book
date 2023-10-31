package mva2.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import mva2.adapter.internal.C11185b;
import mva2.adapter.util.EnumC11188a;

/* renamed from: mva2.adapter.c */
/* loaded from: classes3.dex */
public final class C11176c<M> extends AbstractC11183h {
    @Nullable

    /* renamed from: e */
    public M f21831e;
    @Nullable

    /* renamed from: f */
    public C11185b f21832f;

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: e */
    public final int mo79e() {
        return this.f21831e != null ? 1 : 0;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: g */
    public final Object mo77g(int i) {
        return this.f21831e;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: i */
    public final int mo75i(int i, int i2, RecyclerView.LayoutManager layoutManager) {
        return 15;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: j */
    public final boolean mo74j(int i) {
        return this.f21832f.f21854a;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: n */
    public final void mo70n(int i, @NonNull EnumC11188a enumC11188a) {
        C11185b c11185b;
        C11185b c11185b2;
        boolean z;
        if (i < mo79e()) {
            EnumC11188a enumC11188a2 = this.f21849a;
            if (enumC11188a2 != EnumC11188a.INHERIT) {
                enumC11188a = enumC11188a2;
            }
            if (enumC11188a == EnumC11188a.SINGLE && (c11185b2 = this.f21832f) != null && (z = c11185b2.f21854a)) {
                c11185b2.f21854a = !z;
            } else if (i < mo79e() && i >= 0 && (c11185b = this.f21832f) != null) {
                c11185b.f21854a = !c11185b.f21854a;
            } else {
                return;
            }
            m73k(0, "item_expansion_payload");
        }
    }
}

package mva2.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.tool.adapter.question.C2545e;
import mva2.adapter.internal.C11185b;

/* renamed from: mva2.adapter.a */
/* loaded from: classes3.dex */
public final class C11174a<H> extends C11182g {

    /* renamed from: g */
    public final C11176c<H> f21828g;

    /* renamed from: h */
    public final C11182g f21829h;

    public C11174a() {
        C11176c<H> c11176c = new C11176c<>();
        this.f21828g = c11176c;
        C11182g c11182g = new C11182g();
        this.f21829h = c11182g;
        super.mo86o(c11176c);
        super.mo86o(c11182g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11174a(@NonNull C2545e c2545e) {
        this();
        C11176c<H> c11176c = this.f21828g;
        if (c11176c.f21832f == null) {
            c11176c.f21832f = new C11185b();
            c11176c.f21831e = c2545e;
            c11176c.m71m(0, 1);
            return;
        }
        c11176c.f21831e = c2545e;
        c11176c.m73k(0, null);
    }

    @Override // mva2.adapter.C11182g, mva2.adapter.AbstractC11183h
    /* renamed from: i */
    public final int mo75i(int i, int i2, RecyclerView.LayoutManager layoutManager) {
        int mo75i = super.mo75i(i, i2, layoutManager);
        return (i != 0 || mo79e() <= 1) ? (i == 0 || (mo75i & 2) != 2) ? mo75i : mo75i ^ 2 : mo75i ^ 8;
    }

    @Override // mva2.adapter.C11182g
    /* renamed from: o */
    public final void mo86o(AbstractC11183h abstractC11183h) {
        this.f21829h.mo86o(abstractC11183h);
    }
}

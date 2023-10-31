package mva2.adapter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import mva2.adapter.internal.InterfaceC11186c;
import mva2.adapter.util.EnumC11188a;

/* renamed from: mva2.adapter.g */
/* loaded from: classes3.dex */
public class C11182g extends AbstractC11183h implements InterfaceC11186c {

    /* renamed from: e */
    public final ArrayList f21847e = new ArrayList();

    /* renamed from: f */
    public int f21848f = -1;

    @Override // mva2.adapter.internal.InterfaceC11186c
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: a */
    public final void mo66a(AbstractC11183h abstractC11183h, int i, String str) {
        m73k(m83r(abstractC11183h, i), str);
    }

    @Override // mva2.adapter.internal.InterfaceC11186c
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: b */
    public final void mo65b(AbstractC11183h abstractC11183h, int i, int i2) {
        m71m(m83r(abstractC11183h, i), i2);
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: c */
    public final void mo81c(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        super.mo81c(i, canvas, recyclerView, c1594v, view, i2);
        m85p(i, canvas, recyclerView, c1594v, view, i2);
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: d */
    public final void mo80d(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        super.mo80d(i, canvas, recyclerView, c1594v, view, i2);
        m84q(i, canvas, recyclerView, c1594v, view, i2);
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: e */
    public final int mo79e() {
        if (this.f21848f == -1) {
            Iterator it = this.f21847e.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((AbstractC11183h) it.next()).mo79e();
            }
            this.f21848f = i;
        }
        return this.f21848f;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: f */
    public final void mo78f(int i, @NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, int i2) {
        super.mo78f(i, rect, view, recyclerView, c1594v, i2);
        m82s(i, rect, view, recyclerView, c1594v, i2);
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: g */
    public final Object mo77g(int i) {
        Iterator it = this.f21847e.iterator();
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i < abstractC11183h.mo79e()) {
                return abstractC11183h.mo77g(i);
            }
            i -= abstractC11183h.mo79e();
        }
        throw new IllegalStateException();
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: h */
    public final int mo76h(int i, int i2) {
        Iterator it = this.f21847e.iterator();
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i < abstractC11183h.mo79e()) {
                return abstractC11183h.mo76h(i, super.mo76h(i, i2));
            }
            i -= abstractC11183h.mo79e();
        }
        return i2;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: i */
    public int mo75i(int i, int i2, RecyclerView.LayoutManager layoutManager) {
        Iterator it = this.f21847e.iterator();
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i < abstractC11183h.mo79e()) {
                return abstractC11183h.mo75i(i, i2, layoutManager);
            }
            i -= abstractC11183h.mo79e();
        }
        return 0;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: j */
    public final boolean mo74j(int i) {
        Iterator it = this.f21847e.iterator();
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i < abstractC11183h.mo79e()) {
                return abstractC11183h.mo74j(i);
            }
            i -= abstractC11183h.mo79e();
        }
        return false;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: l */
    public final void mo72l() {
        this.f21848f = -1;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: n */
    public final void mo70n(int i, @NonNull EnumC11188a enumC11188a) {
        EnumC11188a enumC11188a2;
        if (i < mo79e() && i >= 0 && (enumC11188a2 = this.f21849a) != EnumC11188a.INHERIT) {
            enumC11188a = enumC11188a2;
        }
        Iterator it = this.f21847e.iterator();
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            abstractC11183h.mo70n(i, enumC11188a);
            i -= abstractC11183h.mo79e();
            if (i < 0 && enumC11188a == EnumC11188a.MULTIPLE) {
                return;
            }
        }
    }

    /* renamed from: o */
    public void mo86o(AbstractC11183h abstractC11183h) {
        abstractC11183h.f21852d = this;
        this.f21847e.add(abstractC11183h);
        abstractC11183h.m71m(0, abstractC11183h.mo79e());
    }

    /* renamed from: p */
    public final void m85p(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        Iterator it = this.f21847e.iterator();
        int i3 = i;
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i3 < abstractC11183h.mo79e()) {
                abstractC11183h.mo81c(i3, canvas, recyclerView, c1594v, view, i2);
                return;
            }
            i3 -= abstractC11183h.mo79e();
        }
    }

    /* renamed from: q */
    public final void m84q(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        Iterator it = this.f21847e.iterator();
        int i3 = i;
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i3 < abstractC11183h.mo79e()) {
                abstractC11183h.mo80d(i3, canvas, recyclerView, c1594v, view, i2);
                return;
            }
            i3 -= abstractC11183h.mo79e();
        }
    }

    /* renamed from: r */
    public final int m83r(AbstractC11183h abstractC11183h, int i) {
        ArrayList arrayList = this.f21847e;
        int indexOf = arrayList.indexOf(abstractC11183h);
        if (indexOf >= 0) {
            for (int i2 = 0; i2 < indexOf; i2++) {
                i += ((AbstractC11183h) arrayList.get(i2)).mo79e();
            }
            return i;
        }
        throw new IllegalStateException("Section does not exist in parent!");
    }

    /* renamed from: s */
    public final void m82s(int i, @NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, int i2) {
        Iterator it = this.f21847e.iterator();
        int i3 = i;
        while (it.hasNext()) {
            AbstractC11183h abstractC11183h = (AbstractC11183h) it.next();
            if (i3 < abstractC11183h.mo79e()) {
                abstractC11183h.mo78f(i3, rect, view, recyclerView, c1594v, i2);
                return;
            }
            i3 -= abstractC11183h.mo79e();
        }
    }
}

package mva2.adapter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import mva2.adapter.decorator.AbstractC11178a;
import mva2.adapter.internal.InterfaceC11186c;
import mva2.adapter.util.EnumC11188a;

/* renamed from: mva2.adapter.h */
/* loaded from: classes3.dex */
public abstract class AbstractC11183h {
    @NonNull

    /* renamed from: a */
    public EnumC11188a f21849a = EnumC11188a.INHERIT;

    /* renamed from: b */
    public final int f21850b = Integer.MAX_VALUE;

    /* renamed from: c */
    public ArrayList f21851c = new ArrayList();

    /* renamed from: d */
    public InterfaceC11186c f21852d;

    /* renamed from: c */
    public void mo81c(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        if (this.f21851c.size() > 0) {
            Iterator it = this.f21851c.iterator();
            while (it.hasNext()) {
                ((AbstractC11178a) it.next()).getClass();
            }
        }
    }

    /* renamed from: d */
    public void mo80d(int i, @NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, View view, int i2) {
        if (this.f21851c.size() > 0) {
            Iterator it = this.f21851c.iterator();
            while (it.hasNext()) {
                ((AbstractC11178a) it.next()).getClass();
            }
        }
    }

    /* renamed from: e */
    public abstract int mo79e();

    /* renamed from: f */
    public void mo78f(int i, @NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v, int i2) {
        if (this.f21851c.size() > 0) {
            Iterator it = this.f21851c.iterator();
            while (it.hasNext()) {
                ((AbstractC11178a) it.next()).mo89a(rect, recyclerView, i2);
            }
        }
    }

    /* renamed from: g */
    public abstract Object mo77g(int i);

    /* renamed from: h */
    public int mo76h(int i, int i2) {
        int i3 = this.f21850b;
        return i3 == Integer.MAX_VALUE ? i2 : i3;
    }

    /* renamed from: i */
    public abstract int mo75i(int i, int i2, RecyclerView.LayoutManager layoutManager);

    /* renamed from: j */
    public abstract boolean mo74j(int i);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: k */
    public final void m73k(int i, String str) {
        mo72l();
        InterfaceC11186c interfaceC11186c = this.f21852d;
        if (interfaceC11186c != null) {
            interfaceC11186c.mo66a(this, i, str);
        }
    }

    /* renamed from: l */
    public void mo72l() {
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: m */
    public final void m71m(int i, int i2) {
        mo72l();
        InterfaceC11186c interfaceC11186c = this.f21852d;
        if (interfaceC11186c != null) {
            interfaceC11186c.mo65b(this, i, i2);
        }
    }

    /* renamed from: n */
    public abstract void mo70n(int i, @NonNull EnumC11188a enumC11188a);
}

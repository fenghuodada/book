package mva2.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0403p1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mva2.adapter.internal.C11184a;
import mva2.adapter.internal.C11187d;
import mva2.adapter.internal.InterfaceC11186c;

/* renamed from: mva2.adapter.f */
/* loaded from: classes3.dex */
public final class C11180f extends RecyclerView.AbstractC1572e<C11177d> {

    /* renamed from: h */
    public final C11182g f21838h;

    /* renamed from: i */
    public final ArrayList f21839i;

    /* renamed from: j */
    public final C11184a f21840j;

    /* renamed from: k */
    public final C11187d f21841k;

    /* renamed from: l */
    public final C11187d f21842l;

    /* renamed from: m */
    public final C11187d f21843m;

    /* renamed from: n */
    public final int f21844n;

    /* renamed from: o */
    public final C0403p1 f21845o;

    /* renamed from: mva2.adapter.f$a */
    /* loaded from: classes3.dex */
    public class C11181a implements InterfaceC11186c {
        public C11181a() {
        }

        @Override // mva2.adapter.internal.InterfaceC11186c
        /* renamed from: a */
        public final void mo66a(AbstractC11183h abstractC11183h, int i, String str) {
            C11180f c11180f = C11180f.this;
            C0403p1 c0403p1 = c11180f.f21845o;
            c0403p1.f1348e.f21855a.clear();
            c0403p1.m10444e();
            c11180f.f21842l.f21855a.clear();
            c11180f.f21841k.f21855a.clear();
            c11180f.f21843m.f21855a.clear();
            c11180f.notifyItemRangeChanged(i, 1, str);
        }

        @Override // mva2.adapter.internal.InterfaceC11186c
        /* renamed from: b */
        public final void mo65b(AbstractC11183h abstractC11183h, int i, int i2) {
            C11180f c11180f = C11180f.this;
            C0403p1 c0403p1 = c11180f.f21845o;
            c0403p1.f1348e.f21855a.clear();
            c0403p1.m10444e();
            c11180f.f21842l.f21855a.clear();
            c11180f.f21841k.f21855a.clear();
            c11180f.f21843m.f21855a.clear();
            c11180f.notifyItemRangeInserted(i, i2);
        }
    }

    public C11180f() {
        C0403p1 c0403p1 = new C0403p1(new C11187d());
        C11187d c11187d = new C11187d();
        C11187d c11187d2 = new C11187d();
        C11187d c11187d3 = new C11187d();
        C11182g c11182g = new C11182g();
        this.f21838h = c11182g;
        this.f21839i = new ArrayList();
        this.f21840j = new C11184a(this);
        this.f21844n = 1;
        C11181a c11181a = new C11181a();
        this.f21845o = c0403p1;
        c0403p1.f1347d = this;
        c11182g.f21852d = c11181a;
        this.f21841k = c11187d;
        this.f21842l = c11187d2;
        this.f21843m = c11187d3;
    }

    /* renamed from: b */
    public final AbstractC11175b m88b(int i) {
        return (AbstractC11175b) this.f21839i.get(getItemViewType(i));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, M] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: c */
    public final void onBindViewHolder(C11177d c11177d, int i, @NonNull List<Object> list) {
        AbstractC11175b abstractC11175b = (AbstractC11175b) this.f21839i.get(c11177d.getItemViewType());
        c11177d.f21833b = this.f21838h.mo77g(i);
        if (list.size() == 0) {
            abstractC11175b.mo93a(c11177d, c11177d.f21833b);
        } else {
            abstractC11175b.mo92b(c11177d, c11177d.f21833b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public final int getItemCount() {
        return this.f21838h.mo79e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public final int getItemViewType(int i) {
        C11187d c11187d = this.f21843m;
        int i2 = c11187d.f21855a.get(i, -1);
        if (i2 == -1) {
            Object mo77g = this.f21838h.mo77g(i);
            Iterator it = this.f21839i.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (((AbstractC11175b) it.next()).mo91c(mo77g)) {
                    c11187d.f21855a.append(i, i3);
                    return i3;
                }
                i3++;
            }
            throw new IllegalStateException("ItemBinder not found for position. Item = " + mo77g);
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public final void onBindViewHolder(@NonNull C11177d c11177d, int i) {
        onBindViewHolder(c11177d, i, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public final C11177d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        C11177d mo90d = ((AbstractC11175b) this.f21839i.get(i)).mo90d(viewGroup);
        mo90d.f21834c = this;
        return mo90d;
    }
}

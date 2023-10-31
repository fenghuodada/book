package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.C0474f;
import androidx.collection.C0482i;
import androidx.core.util.C0802f;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
/* loaded from: classes.dex */
public final class C1617b0 {
    @VisibleForTesting

    /* renamed from: a */
    public final C0482i<RecyclerView.AbstractC1597y, C1618a> f3876a = new C0482i<>();
    @VisibleForTesting

    /* renamed from: b */
    public final C0474f<RecyclerView.AbstractC1597y> f3877b = new C0474f<>();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    /* loaded from: classes.dex */
    public static class C1618a {

        /* renamed from: d */
        public static final C0802f f3878d = new C0802f(20);

        /* renamed from: a */
        public int f3879a;
        @Nullable

        /* renamed from: b */
        public RecyclerView.ItemAnimator.C1564c f3880b;
        @Nullable

        /* renamed from: c */
        public RecyclerView.ItemAnimator.C1564c f3881c;

        /* renamed from: a */
        public static C1618a m10146a() {
            C1618a c1618a = (C1618a) f3878d.mo6394b();
            return c1618a == null ? new C1618a() : c1618a;
        }
    }

    /* renamed from: a */
    public final RecyclerView.ItemAnimator.C1564c m10149a(RecyclerView.AbstractC1597y abstractC1597y, int i) {
        C1618a m12397l;
        RecyclerView.ItemAnimator.C1564c c1564c;
        C0482i<RecyclerView.AbstractC1597y, C1618a> c0482i = this.f3876a;
        int m12401e = c0482i.m12401e(abstractC1597y);
        if (m12401e >= 0 && (m12397l = c0482i.m12397l(m12401e)) != null) {
            int i2 = m12397l.f3879a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                m12397l.f3879a = i3;
                if (i == 4) {
                    c1564c = m12397l.f3880b;
                } else if (i == 8) {
                    c1564c = m12397l.f3881c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c0482i.mo6416j(m12401e);
                    m12397l.f3879a = 0;
                    m12397l.f3880b = null;
                    m12397l.f3881c = null;
                    C1618a.f3878d.mo6395a(m12397l);
                }
                return c1564c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m10148b(RecyclerView.AbstractC1597y abstractC1597y) {
        C1618a orDefault = this.f3876a.getOrDefault(abstractC1597y, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f3879a &= -2;
    }

    /* renamed from: c */
    public final void m10147c(RecyclerView.AbstractC1597y abstractC1597y) {
        C0474f<RecyclerView.AbstractC1597y> c0474f = this.f3877b;
        if (c0474f.f1506a) {
            c0474f.m12421d();
        }
        int i = c0474f.f1509d - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (abstractC1597y == c0474f.m12418h(i)) {
                Object[] objArr = c0474f.f1508c;
                Object obj = objArr[i];
                Object obj2 = C0474f.f1505e;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    c0474f.f1506a = true;
                }
            } else {
                i--;
            }
        }
        C1618a remove = this.f3876a.remove(abstractC1597y);
        if (remove != null) {
            remove.f3879a = 0;
            remove.f3880b = null;
            remove.f3881c = null;
            C1618a.f3878d.mo6395a(remove);
        }
    }
}

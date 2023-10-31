package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public final class C1614b {

    /* renamed from: a */
    public final InterfaceC1616b f3871a;

    /* renamed from: b */
    public final C1615a f3872b = new C1615a();

    /* renamed from: c */
    public final ArrayList f3873c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class C1615a {

        /* renamed from: a */
        public long f3874a = 0;

        /* renamed from: b */
        public C1615a f3875b;

        /* renamed from: a */
        public final void m10157a(int i) {
            if (i < 64) {
                this.f3874a &= ~(1 << i);
                return;
            }
            C1615a c1615a = this.f3875b;
            if (c1615a != null) {
                c1615a.m10157a(i - 64);
            }
        }

        /* renamed from: b */
        public final int m10156b(int i) {
            long j;
            C1615a c1615a = this.f3875b;
            if (c1615a == null) {
                if (i >= 64) {
                    j = this.f3874a;
                    return Long.bitCount(j);
                }
            } else if (i >= 64) {
                return Long.bitCount(this.f3874a) + c1615a.m10156b(i - 64);
            }
            j = this.f3874a & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        /* renamed from: c */
        public final void m10155c() {
            if (this.f3875b == null) {
                this.f3875b = new C1615a();
            }
        }

        /* renamed from: d */
        public final boolean m10154d(int i) {
            if (i < 64) {
                return (this.f3874a & (1 << i)) != 0;
            }
            m10155c();
            return this.f3875b.m10154d(i - 64);
        }

        /* renamed from: e */
        public final void m10153e(int i, boolean z) {
            if (i >= 64) {
                m10155c();
                this.f3875b.m10153e(i - 64, z);
                return;
            }
            long j = this.f3874a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3874a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m10150h(i);
            } else {
                m10157a(i);
            }
            if (z2 || this.f3875b != null) {
                m10155c();
                this.f3875b.m10153e(0, z2);
            }
        }

        /* renamed from: f */
        public final boolean m10152f(int i) {
            if (i >= 64) {
                m10155c();
                return this.f3875b.m10152f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3874a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f3874a = j3;
            long j4 = j - 1;
            this.f3874a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1615a c1615a = this.f3875b;
            if (c1615a != null) {
                if (c1615a.m10154d(0)) {
                    m10150h(63);
                }
                this.f3875b.m10152f(0);
            }
            return z;
        }

        /* renamed from: g */
        public final void m10151g() {
            this.f3874a = 0L;
            C1615a c1615a = this.f3875b;
            if (c1615a != null) {
                c1615a.m10151g();
            }
        }

        /* renamed from: h */
        public final void m10150h(int i) {
            if (i < 64) {
                this.f3874a |= 1 << i;
                return;
            }
            m10155c();
            this.f3875b.m10150h(i - 64);
        }

        public final String toString() {
            if (this.f3875b == null) {
                return Long.toBinaryString(this.f3874a);
            }
            return this.f3875b.toString() + "xx" + Long.toBinaryString(this.f3874a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1616b {
    }

    public C1614b(C1648v c1648v) {
        this.f3871a = c1648v;
    }

    /* renamed from: a */
    public final void m10168a(View view, boolean z, int i) {
        int m10163f;
        InterfaceC1616b interfaceC1616b = this.f3871a;
        if (i < 0) {
            m10163f = ((C1648v) interfaceC1616b).m10104a();
        } else {
            m10163f = m10163f(i);
        }
        this.f3872b.m10153e(m10163f, z);
        if (z) {
            m10160i(view);
        }
        RecyclerView recyclerView = ((C1648v) interfaceC1616b).f4007a;
        recyclerView.addView(view, m10163f);
        RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(view);
        RecyclerView.AbstractC1572e abstractC1572e = recyclerView.f3677l;
        if (abstractC1572e != null && m10398J != null) {
            abstractC1572e.onViewAttachedToWindow(m10398J);
        }
        ArrayList arrayList = recyclerView.f3636C;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.InterfaceC1580l) recyclerView.f3636C.get(size)).mo9360b(view);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m10167b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m10163f;
        InterfaceC1616b interfaceC1616b = this.f3871a;
        if (i < 0) {
            m10163f = ((C1648v) interfaceC1616b).m10104a();
        } else {
            m10163f = m10163f(i);
        }
        this.f3872b.m10153e(m10163f, z);
        if (z) {
            m10160i(view);
        }
        C1648v c1648v = (C1648v) interfaceC1616b;
        c1648v.getClass();
        RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(view);
        RecyclerView recyclerView = c1648v.f4007a;
        if (m10398J != null) {
            if (!m10398J.isTmpDetached() && !m10398J.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m10398J + recyclerView.m10351z());
            }
            m10398J.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, m10163f, layoutParams);
    }

    /* renamed from: c */
    public final void m10166c(int i) {
        RecyclerView.AbstractC1597y m10398J;
        int m10163f = m10163f(i);
        this.f3872b.m10152f(m10163f);
        C1648v c1648v = (C1648v) this.f3871a;
        View childAt = c1648v.f4007a.getChildAt(m10163f);
        RecyclerView recyclerView = c1648v.f4007a;
        if (childAt != null && (m10398J = RecyclerView.m10398J(childAt)) != null) {
            if (m10398J.isTmpDetached() && !m10398J.shouldIgnore()) {
                throw new IllegalArgumentException("called detach on an already detached child " + m10398J + recyclerView.m10351z());
            }
            m10398J.addFlags(256);
        }
        recyclerView.detachViewFromParent(m10163f);
    }

    /* renamed from: d */
    public final View m10165d(int i) {
        return ((C1648v) this.f3871a).f4007a.getChildAt(m10163f(i));
    }

    /* renamed from: e */
    public final int m10164e() {
        return ((C1648v) this.f3871a).m10104a() - this.f3873c.size();
    }

    /* renamed from: f */
    public final int m10163f(int i) {
        if (i < 0) {
            return -1;
        }
        int m10104a = ((C1648v) this.f3871a).m10104a();
        int i2 = i;
        while (i2 < m10104a) {
            C1615a c1615a = this.f3872b;
            int m10156b = i - (i2 - c1615a.m10156b(i2));
            if (m10156b == 0) {
                while (c1615a.m10154d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m10156b;
        }
        return -1;
    }

    /* renamed from: g */
    public final View m10162g(int i) {
        return ((C1648v) this.f3871a).f4007a.getChildAt(i);
    }

    /* renamed from: h */
    public final int m10161h() {
        return ((C1648v) this.f3871a).m10104a();
    }

    /* renamed from: i */
    public final void m10160i(View view) {
        this.f3873c.add(view);
        C1648v c1648v = (C1648v) this.f3871a;
        c1648v.getClass();
        RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(view);
        if (m10398J != null) {
            m10398J.onEnteredHiddenState(c1648v.f4007a);
        }
    }

    /* renamed from: j */
    public final boolean m10159j(View view) {
        return this.f3873c.contains(view);
    }

    /* renamed from: k */
    public final void m10158k(View view) {
        if (this.f3873c.remove(view)) {
            C1648v c1648v = (C1648v) this.f3871a;
            c1648v.getClass();
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(view);
            if (m10398J != null) {
                m10398J.onLeftHiddenState(c1648v.f4007a);
            }
        }
    }

    public final String toString() {
        return this.f3872b.toString() + ", hidden list:" + this.f3873c.size();
    }
}

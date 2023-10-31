package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0235r;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC1635m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.AbstractC1591u.InterfaceC1593b {

    /* renamed from: A */
    public final C1557a f3590A;

    /* renamed from: B */
    public final C1558b f3591B;

    /* renamed from: C */
    public final int f3592C;

    /* renamed from: D */
    public final int[] f3593D;

    /* renamed from: p */
    public int f3594p;

    /* renamed from: q */
    public C1559c f3595q;

    /* renamed from: r */
    public AbstractC1645s f3596r;

    /* renamed from: s */
    public boolean f3597s;

    /* renamed from: t */
    public boolean f3598t;

    /* renamed from: u */
    public boolean f3599u;

    /* renamed from: v */
    public boolean f3600v;

    /* renamed from: w */
    public final boolean f3601w;

    /* renamed from: x */
    public int f3602x;

    /* renamed from: y */
    public int f3603y;

    /* renamed from: z */
    public C1560d f3604z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C1557a {

        /* renamed from: a */
        public AbstractC1645s f3605a;

        /* renamed from: b */
        public int f3606b;

        /* renamed from: c */
        public int f3607c;

        /* renamed from: d */
        public boolean f3608d;

        /* renamed from: e */
        public boolean f3609e;

        public C1557a() {
            m10410c();
        }

        /* renamed from: a */
        public final void m10412a(int i, View view) {
            int mo10114l;
            if (this.f3608d) {
                int mo10124b = this.f3605a.mo10124b(view);
                AbstractC1645s abstractC1645s = this.f3605a;
                if (Integer.MIN_VALUE == abstractC1645s.f4002b) {
                    mo10114l = 0;
                } else {
                    mo10114l = abstractC1645s.mo10114l() - abstractC1645s.f4002b;
                }
                this.f3607c = mo10114l + mo10124b;
            } else {
                this.f3607c = this.f3605a.mo10121e(view);
            }
            this.f3606b = i;
        }

        /* renamed from: b */
        public final void m10411b(int i, View view) {
            int mo10114l;
            int min;
            AbstractC1645s abstractC1645s = this.f3605a;
            if (Integer.MIN_VALUE == abstractC1645s.f4002b) {
                mo10114l = 0;
            } else {
                mo10114l = abstractC1645s.mo10114l() - abstractC1645s.f4002b;
            }
            if (mo10114l >= 0) {
                m10412a(i, view);
                return;
            }
            this.f3606b = i;
            if (this.f3608d) {
                int mo10119g = (this.f3605a.mo10119g() - mo10114l) - this.f3605a.mo10124b(view);
                this.f3607c = this.f3605a.mo10119g() - mo10119g;
                if (mo10119g > 0) {
                    int mo10123c = this.f3607c - this.f3605a.mo10123c(view);
                    int mo10115k = this.f3605a.mo10115k();
                    int min2 = mo10123c - (Math.min(this.f3605a.mo10121e(view) - mo10115k, 0) + mo10115k);
                    if (min2 < 0) {
                        min = Math.min(mo10119g, -min2) + this.f3607c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int mo10121e = this.f3605a.mo10121e(view);
                int mo10115k2 = mo10121e - this.f3605a.mo10115k();
                this.f3607c = mo10121e;
                if (mo10115k2 > 0) {
                    int mo10119g2 = (this.f3605a.mo10119g() - Math.min(0, (this.f3605a.mo10119g() - mo10114l) - this.f3605a.mo10124b(view))) - (this.f3605a.mo10123c(view) + mo10121e);
                    if (mo10119g2 < 0) {
                        min = this.f3607c - Math.min(mo10115k2, -mo10119g2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f3607c = min;
        }

        /* renamed from: c */
        public final void m10410c() {
            this.f3606b = -1;
            this.f3607c = Integer.MIN_VALUE;
            this.f3608d = false;
            this.f3609e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f3606b + ", mCoordinate=" + this.f3607c + ", mLayoutFromEnd=" + this.f3608d + ", mValid=" + this.f3609e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C1558b {

        /* renamed from: a */
        public int f3610a;

        /* renamed from: b */
        public boolean f3611b;

        /* renamed from: c */
        public boolean f3612c;

        /* renamed from: d */
        public boolean f3613d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C1559c {

        /* renamed from: b */
        public int f3615b;

        /* renamed from: c */
        public int f3616c;

        /* renamed from: d */
        public int f3617d;

        /* renamed from: e */
        public int f3618e;

        /* renamed from: f */
        public int f3619f;

        /* renamed from: g */
        public int f3620g;

        /* renamed from: j */
        public int f3623j;

        /* renamed from: l */
        public boolean f3625l;

        /* renamed from: a */
        public boolean f3614a = true;

        /* renamed from: h */
        public int f3621h = 0;

        /* renamed from: i */
        public int f3622i = 0;

        /* renamed from: k */
        public List<RecyclerView.AbstractC1597y> f3624k = null;

        /* renamed from: a */
        public final void m10409a(View view) {
            int m10298a;
            int m10298a2;
            int size = this.f3624k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3624k.get(i2).itemView;
                RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view3.getLayoutParams();
                if (view3 != view && !c1579k.m10296c() && (m10298a2 = (c1579k.m10298a() - this.f3617d) * this.f3618e) >= 0 && m10298a2 < i) {
                    view2 = view3;
                    if (m10298a2 == 0) {
                        break;
                    }
                    i = m10298a2;
                }
            }
            if (view2 == null) {
                m10298a = -1;
            } else {
                m10298a = ((RecyclerView.C1579k) view2.getLayoutParams()).m10298a();
            }
            this.f3617d = m10298a;
        }

        /* renamed from: b */
        public final View m10408b(RecyclerView.C1586q c1586q) {
            List<RecyclerView.AbstractC1597y> list = this.f3624k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f3624k.get(i).itemView;
                    RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
                    if (!c1579k.m10296c() && this.f3617d == c1579k.m10298a()) {
                        m10409a(view);
                        return view;
                    }
                }
                return null;
            }
            View m10291d = c1586q.m10291d(this.f3617d);
            this.f3617d += this.f3618e;
            return m10291d;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C1560d implements Parcelable {
        public static final Parcelable.Creator<C1560d> CREATOR = new C1561a();

        /* renamed from: a */
        public int f3626a;

        /* renamed from: b */
        public int f3627b;

        /* renamed from: c */
        public boolean f3628c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        public class C1561a implements Parcelable.Creator<C1560d> {
            @Override // android.os.Parcelable.Creator
            public final C1560d createFromParcel(Parcel parcel) {
                return new C1560d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C1560d[] newArray(int i) {
                return new C1560d[i];
            }
        }

        public C1560d() {
        }

        public C1560d(Parcel parcel) {
            this.f3626a = parcel.readInt();
            this.f3627b = parcel.readInt();
            this.f3628c = parcel.readInt() == 1;
        }

        public C1560d(C1560d c1560d) {
            this.f3626a = c1560d.f3626a;
            this.f3627b = c1560d.f3627b;
            this.f3628c = c1560d.f3628c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3626a);
            parcel.writeInt(this.f3627b);
            parcel.writeInt(this.f3628c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.f3594p = 1;
        this.f3598t = false;
        this.f3599u = false;
        this.f3600v = false;
        this.f3601w = true;
        this.f3602x = -1;
        this.f3603y = Integer.MIN_VALUE;
        this.f3604z = null;
        this.f3590A = new C1557a();
        this.f3591B = new C1558b();
        this.f3592C = 2;
        this.f3593D = new int[2];
        m10417e1(i);
        mo10237c(null);
        if (this.f3598t) {
            this.f3598t = false;
            m10320o0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public void mo4606A0(RecyclerView recyclerView, int i) {
        C1640o c1640o = new C1640o(recyclerView.getContext());
        c1640o.f3758a = i;
        m10345B0(c1640o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C0 */
    public boolean mo10273C0() {
        return this.f3604z == null && this.f3597s == this.f3600v;
    }

    /* renamed from: D0 */
    public void mo4584D0(@NonNull RecyclerView.C1594v c1594v, @NonNull int[] iArr) {
        boolean z;
        int i;
        int i2;
        if (c1594v.f3773a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f3596r.mo10114l();
        } else {
            i = 0;
        }
        if (this.f3595q.f3619f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: E0 */
    public void mo10443E0(RecyclerView.C1594v c1594v, C1559c c1559c, RecyclerView.LayoutManager.InterfaceC1567c interfaceC1567c) {
        int i = c1559c.f3617d;
        if (i < 0 || i >= c1594v.m10276b()) {
            return;
        }
        ((RunnableC1635m.C1637b) interfaceC1567c).m10127a(i, Math.max(0, c1559c.f3620g));
    }

    /* renamed from: F0 */
    public final int m10442F0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        m10438J0();
        AbstractC1645s abstractC1645s = this.f3596r;
        boolean z = !this.f3601w;
        return C1652y.m10092a(c1594v, abstractC1645s, m10435M0(z), m10436L0(z), this, this.f3601w);
    }

    /* renamed from: G0 */
    public final int m10441G0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        m10438J0();
        AbstractC1645s abstractC1645s = this.f3596r;
        boolean z = !this.f3601w;
        return C1652y.m10091b(c1594v, abstractC1645s, m10435M0(z), m10436L0(z), this, this.f3601w, this.f3599u);
    }

    /* renamed from: H0 */
    public final int m10440H0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        m10438J0();
        AbstractC1645s abstractC1645s = this.f3596r;
        boolean z = !this.f3601w;
        return C1652y.m10090c(c1594v, abstractC1645s, m10435M0(z), m10436L0(z), this, this.f3601w);
    }

    /* renamed from: I0 */
    public final int m10439I0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3594p == 1) ? 1 : Integer.MIN_VALUE : this.f3594p == 0 ? 1 : Integer.MIN_VALUE : this.f3594p == 1 ? -1 : Integer.MIN_VALUE : this.f3594p == 0 ? -1 : Integer.MIN_VALUE : (this.f3594p != 1 && m10425W0()) ? -1 : 1 : (this.f3594p != 1 && m10425W0()) ? 1 : -1;
    }

    /* renamed from: J0 */
    public final void m10438J0() {
        if (this.f3595q == null) {
            this.f3595q = new C1559c();
        }
    }

    /* renamed from: K0 */
    public final int m10437K0(RecyclerView.C1586q c1586q, C1559c c1559c, RecyclerView.C1594v c1594v, boolean z) {
        boolean z2;
        int i = c1559c.f3616c;
        int i2 = c1559c.f3620g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c1559c.f3620g = i2 + i;
            }
            m10422Z0(c1586q, c1559c);
        }
        int i3 = c1559c.f3616c + c1559c.f3621h;
        while (true) {
            if (!c1559c.f3625l && i3 <= 0) {
                break;
            }
            int i4 = c1559c.f3617d;
            if (i4 >= 0 && i4 < c1594v.m10276b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            C1558b c1558b = this.f3591B;
            c1558b.f3610a = 0;
            c1558b.f3611b = false;
            c1558b.f3612c = false;
            c1558b.f3613d = false;
            mo10424X0(c1586q, c1594v, c1559c, c1558b);
            if (!c1558b.f3611b) {
                int i5 = c1559c.f3615b;
                int i6 = c1558b.f3610a;
                c1559c.f3615b = (c1559c.f3619f * i6) + i5;
                if (!c1558b.f3612c || c1559c.f3624k != null || !c1594v.f3779g) {
                    c1559c.f3616c -= i6;
                    i3 -= i6;
                }
                int i7 = c1559c.f3620g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c1559c.f3620g = i8;
                    int i9 = c1559c.f3616c;
                    if (i9 < 0) {
                        c1559c.f3620g = i8 + i9;
                    }
                    m10422Z0(c1586q, c1559c);
                }
                if (z && c1558b.f3613d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c1559c.f3616c;
    }

    /* renamed from: L0 */
    public final View m10436L0(boolean z) {
        int m10313w;
        int i;
        if (this.f3599u) {
            i = m10313w();
            m10313w = 0;
        } else {
            m10313w = m10313w() - 1;
            i = -1;
        }
        return m10431Q0(m10313w, i, z, true);
    }

    /* renamed from: M0 */
    public final View m10435M0(boolean z) {
        int m10313w;
        int i;
        if (this.f3599u) {
            m10313w = -1;
            i = m10313w() - 1;
        } else {
            m10313w = m10313w();
            i = 0;
        }
        return m10431Q0(i, m10313w, z, true);
    }

    /* renamed from: N0 */
    public final int m10434N0() {
        View m10431Q0 = m10431Q0(0, m10313w(), false, true);
        if (m10431Q0 == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.m10336K(m10431Q0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public final boolean mo10261O() {
        return true;
    }

    /* renamed from: O0 */
    public final int m10433O0() {
        View m10431Q0 = m10431Q0(m10313w() - 1, -1, false, true);
        if (m10431Q0 == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.m10336K(m10431Q0);
    }

    /* renamed from: P0 */
    public final View m10432P0(int i, int i2) {
        int i3;
        int i4;
        m10438J0();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m10315v(i);
        }
        if (this.f3596r.mo10121e(m10315v(i)) < this.f3596r.mo10115k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        return (this.f3594p == 0 ? this.f3717c : this.f3718d).m10190a(i, i2, i3, i4);
    }

    /* renamed from: Q0 */
    public final View m10431Q0(int i, int i2, boolean z, boolean z2) {
        m10438J0();
        return (this.f3594p == 0 ? this.f3717c : this.f3718d).m10190a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    /* renamed from: R0 */
    public View mo10430R0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        m10438J0();
        int m10313w = m10313w();
        if (z2) {
            i2 = m10313w() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m10313w;
            i2 = 0;
            i3 = 1;
        }
        int m10276b = c1594v.m10276b();
        int mo10115k = this.f3596r.mo10115k();
        int mo10119g = this.f3596r.mo10119g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View m10315v = m10315v(i2);
            int m10336K = RecyclerView.LayoutManager.m10336K(m10315v);
            int mo10121e = this.f3596r.mo10121e(m10315v);
            int mo10124b = this.f3596r.mo10124b(m10315v);
            if (m10336K >= 0 && m10336K < m10276b) {
                if (!((RecyclerView.C1579k) m10315v.getLayoutParams()).m10296c()) {
                    boolean z3 = mo10124b <= mo10115k && mo10121e < mo10115k;
                    boolean z4 = mo10121e >= mo10119g && mo10124b > mo10119g;
                    if (!z3 && !z4) {
                        return m10315v;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m10315v;
                        }
                        view2 = m10315v;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m10315v;
                        }
                        view2 = m10315v;
                    }
                } else if (view3 == null) {
                    view3 = m10315v;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: S0 */
    public final int m10429S0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z) {
        int mo10119g;
        int mo10119g2 = this.f3596r.mo10119g() - i;
        if (mo10119g2 > 0) {
            int i2 = -m10419c1(-mo10119g2, c1586q, c1594v);
            int i3 = i + i2;
            if (!z || (mo10119g = this.f3596r.mo10119g() - i3) <= 0) {
                return i2;
            }
            this.f3596r.mo10111o(mo10119g);
            return mo10119g + i2;
        }
        return 0;
    }

    /* renamed from: T0 */
    public final int m10428T0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z) {
        int mo10115k;
        int mo10115k2 = i - this.f3596r.mo10115k();
        if (mo10115k2 > 0) {
            int i2 = -m10419c1(mo10115k2, c1586q, c1594v);
            int i3 = i + i2;
            if (!z || (mo10115k = i3 - this.f3596r.mo10115k()) <= 0) {
                return i2;
            }
            this.f3596r.mo10111o(-mo10115k);
            return i2 - mo10115k;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U */
    public final void mo10251U(RecyclerView recyclerView) {
    }

    /* renamed from: U0 */
    public final View m10427U0() {
        return m10315v(this.f3599u ? 0 : m10313w() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: V */
    public View mo10249V(View view, int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        int m10439I0;
        View m10432P0;
        View m10427U0;
        m10420b1();
        if (m10313w() == 0 || (m10439I0 = m10439I0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m10438J0();
        m10415g1(m10439I0, (int) (this.f3596r.mo10114l() * 0.33333334f), false, c1594v);
        C1559c c1559c = this.f3595q;
        c1559c.f3620g = Integer.MIN_VALUE;
        c1559c.f3614a = false;
        m10437K0(c1586q, c1559c, c1594v, true);
        if (m10439I0 == -1) {
            if (this.f3599u) {
                m10432P0 = m10432P0(m10313w() - 1, -1);
            } else {
                m10432P0 = m10432P0(0, m10313w());
            }
        } else if (this.f3599u) {
            m10432P0 = m10432P0(0, m10313w());
        } else {
            m10432P0 = m10432P0(m10313w() - 1, -1);
        }
        if (m10439I0 == -1) {
            m10427U0 = m10426V0();
        } else {
            m10427U0 = m10427U0();
        }
        if (m10427U0.hasFocusable()) {
            if (m10432P0 == null) {
                return null;
            }
            return m10427U0;
        }
        return m10432P0;
    }

    /* renamed from: V0 */
    public final View m10426V0() {
        return m10315v(this.f3599u ? m10313w() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: W */
    public final void mo4696W(AccessibilityEvent accessibilityEvent) {
        super.mo4696W(accessibilityEvent);
        if (m10313w() > 0) {
            accessibilityEvent.setFromIndex(m10434N0());
            accessibilityEvent.setToIndex(m10433O0());
        }
    }

    /* renamed from: W0 */
    public final boolean m10425W0() {
        return m10341F() == 1;
    }

    /* renamed from: X0 */
    public void mo10424X0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, C1559c c1559c, C1558b c1558b) {
        boolean z;
        int mo10122d;
        int i;
        int i2;
        int i3;
        int m10339H;
        boolean z2;
        View m10408b = c1559c.m10408b(c1586q);
        if (m10408b == null) {
            c1558b.f3611b = true;
            return;
        }
        RecyclerView.C1579k c1579k = (RecyclerView.C1579k) m10408b.getLayoutParams();
        if (c1559c.f3624k == null) {
            boolean z3 = this.f3599u;
            if (c1559c.f3619f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                m10328b(m10408b, false, -1);
            } else {
                m10328b(m10408b, false, 0);
            }
        } else {
            boolean z4 = this.f3599u;
            if (c1559c.f3619f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                m10328b(m10408b, true, -1);
            } else {
                m10328b(m10408b, true, 0);
            }
        }
        RecyclerView.C1579k c1579k2 = (RecyclerView.C1579k) m10408b.getLayoutParams();
        Rect m10397K = this.f3716b.m10397K(m10408b);
        int m10311x = RecyclerView.LayoutManager.m10311x(this.f3728n, this.f3726l, m10338I() + m10339H() + ((ViewGroup.MarginLayoutParams) c1579k2).leftMargin + ((ViewGroup.MarginLayoutParams) c1579k2).rightMargin + m10397K.left + m10397K.right + 0, ((ViewGroup.MarginLayoutParams) c1579k2).width, mo10232e());
        int m10311x2 = RecyclerView.LayoutManager.m10311x(this.f3729o, this.f3727m, m10340G() + m10337J() + ((ViewGroup.MarginLayoutParams) c1579k2).topMargin + ((ViewGroup.MarginLayoutParams) c1579k2).bottomMargin + m10397K.top + m10397K.bottom + 0, ((ViewGroup.MarginLayoutParams) c1579k2).height, mo10230f());
        if (m10310x0(m10408b, m10311x, m10311x2, c1579k2)) {
            m10408b.measure(m10311x, m10311x2);
        }
        c1558b.f3610a = this.f3596r.mo10123c(m10408b);
        if (this.f3594p == 1) {
            if (m10425W0()) {
                i3 = this.f3728n - m10338I();
                m10339H = i3 - this.f3596r.mo10122d(m10408b);
            } else {
                m10339H = m10339H();
                i3 = this.f3596r.mo10122d(m10408b) + m10339H;
            }
            int i4 = c1559c.f3619f;
            i2 = c1559c.f3615b;
            if (i4 == -1) {
                int i5 = m10339H;
                mo10122d = i2;
                i2 -= c1558b.f3610a;
                i = i5;
            } else {
                i = m10339H;
                mo10122d = c1558b.f3610a + i2;
            }
        } else {
            int m10337J = m10337J();
            mo10122d = this.f3596r.mo10122d(m10408b) + m10337J;
            int i6 = c1559c.f3619f;
            int i7 = c1559c.f3615b;
            if (i6 == -1) {
                i = i7 - c1558b.f3610a;
                i3 = i7;
                i2 = m10337J;
            } else {
                int i8 = c1558b.f3610a + i7;
                i = i7;
                i2 = m10337J;
                i3 = i8;
            }
        }
        RecyclerView.LayoutManager.m10331Q(m10408b, i, i2, i3, mo10122d);
        if (c1579k.m10296c() || c1579k.m10297b()) {
            c1558b.f3612c = true;
        }
        c1558b.f3613d = m10408b.hasFocusable();
    }

    /* renamed from: Y0 */
    public void mo10423Y0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, C1557a c1557a, int i) {
    }

    /* renamed from: Z0 */
    public final void m10422Z0(RecyclerView.C1586q c1586q, C1559c c1559c) {
        if (c1559c.f3614a && !c1559c.f3625l) {
            int i = c1559c.f3620g;
            int i2 = c1559c.f3622i;
            if (c1559c.f3619f == -1) {
                int m10313w = m10313w();
                if (i >= 0) {
                    int mo10120f = (this.f3596r.mo10120f() - i) + i2;
                    if (this.f3599u) {
                        for (int i3 = 0; i3 < m10313w; i3++) {
                            View m10315v = m10315v(i3);
                            if (this.f3596r.mo10121e(m10315v) < mo10120f || this.f3596r.mo10112n(m10315v) < mo10120f) {
                                m10421a1(c1586q, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = m10313w - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View m10315v2 = m10315v(i5);
                        if (this.f3596r.mo10121e(m10315v2) < mo10120f || this.f3596r.mo10112n(m10315v2) < mo10120f) {
                            m10421a1(c1586q, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int m10313w2 = m10313w();
                if (this.f3599u) {
                    int i7 = m10313w2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View m10315v3 = m10315v(i8);
                        if (this.f3596r.mo10124b(m10315v3) > i6 || this.f3596r.mo10113m(m10315v3) > i6) {
                            m10421a1(c1586q, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < m10313w2; i9++) {
                    View m10315v4 = m10315v(i9);
                    if (this.f3596r.mo10124b(m10315v4) > i6 || this.f3596r.mo10113m(m10315v4) > i6) {
                        m10421a1(c1586q, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1591u.InterfaceC1593b
    /* renamed from: a */
    public final PointF mo10242a(int i) {
        if (m10313w() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.LayoutManager.m10336K(m10315v(0))) != this.f3599u ? -1 : 1;
        return this.f3594p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public final void m10421a1(RecyclerView.C1586q c1586q, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View m10315v = m10315v(i);
                m10321m0(i);
                c1586q.m10288g(m10315v);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            View m10315v2 = m10315v(i2);
            m10321m0(i2);
            c1586q.m10288g(m10315v2);
        }
    }

    /* renamed from: b1 */
    public final void m10420b1() {
        this.f3599u = (this.f3594p == 1 || !m10425W0()) ? this.f3598t : !this.f3598t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c */
    public final void mo10237c(String str) {
        if (this.f3604z == null) {
            super.mo10237c(str);
        }
    }

    /* renamed from: c1 */
    public final int m10419c1(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (m10313w() == 0 || i == 0) {
            return 0;
        }
        m10438J0();
        this.f3595q.f3614a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m10415g1(i2, abs, true, c1594v);
        C1559c c1559c = this.f3595q;
        int m10437K0 = m10437K0(c1586q, c1559c, c1594v, false) + c1559c.f3620g;
        if (m10437K0 < 0) {
            return 0;
        }
        if (abs > m10437K0) {
            i = i2 * m10437K0;
        }
        this.f3596r.mo10111o(-i);
        this.f3595q.f3623j = i;
        return i;
    }

    /* renamed from: d1 */
    public final void m10418d1(int i, int i2) {
        this.f3602x = i;
        this.f3603y = i2;
        C1560d c1560d = this.f3604z;
        if (c1560d != null) {
            c1560d.f3626a = -1;
        }
        m10320o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e */
    public final boolean mo10232e() {
        return this.f3594p == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0239  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4695e0(androidx.recyclerview.widget.RecyclerView.C1586q r18, androidx.recyclerview.widget.RecyclerView.C1594v r19) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4695e0(androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.RecyclerView$v):void");
    }

    /* renamed from: e1 */
    public final void m10417e1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C0235r.m12816a("invalid orientation:", i));
        }
        mo10237c(null);
        if (i != this.f3594p || this.f3596r == null) {
            AbstractC1645s m10125a = AbstractC1645s.m10125a(i, this);
            this.f3596r = m10125a;
            this.f3590A.f3605a = m10125a;
            this.f3594p = i;
            m10320o0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f */
    public final boolean mo10230f() {
        return this.f3594p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f0 */
    public void mo4694f0(RecyclerView.C1594v c1594v) {
        this.f3604z = null;
        this.f3602x = -1;
        this.f3603y = Integer.MIN_VALUE;
        this.f3590A.m10410c();
    }

    /* renamed from: f1 */
    public void mo10416f1(boolean z) {
        mo10237c(null);
        if (this.f3600v == z) {
            return;
        }
        this.f3600v = z;
        m10320o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g0 */
    public final void mo10227g0(Parcelable parcelable) {
        if (parcelable instanceof C1560d) {
            C1560d c1560d = (C1560d) parcelable;
            this.f3604z = c1560d;
            if (this.f3602x != -1) {
                c1560d.f3626a = -1;
            }
            m10320o0();
        }
    }

    /* renamed from: g1 */
    public final void m10415g1(int i, int i2, boolean z, RecyclerView.C1594v c1594v) {
        boolean z2;
        int i3;
        int mo10115k;
        C1559c c1559c = this.f3595q;
        int i4 = 1;
        boolean z3 = false;
        if (this.f3596r.mo10117i() == 0 && this.f3596r.mo10120f() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1559c.f3625l = z2;
        this.f3595q.f3619f = i;
        int[] iArr = this.f3593D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4584D0(c1594v, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        C1559c c1559c2 = this.f3595q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c1559c2.f3621h = i3;
        if (!z3) {
            max = max2;
        }
        c1559c2.f3622i = max;
        if (z3) {
            c1559c2.f3621h = this.f3596r.mo10118h() + i3;
            View m10427U0 = m10427U0();
            C1559c c1559c3 = this.f3595q;
            if (this.f3599u) {
                i4 = -1;
            }
            c1559c3.f3618e = i4;
            int m10336K = RecyclerView.LayoutManager.m10336K(m10427U0);
            C1559c c1559c4 = this.f3595q;
            c1559c3.f3617d = m10336K + c1559c4.f3618e;
            c1559c4.f3615b = this.f3596r.mo10124b(m10427U0);
            mo10115k = this.f3596r.mo10124b(m10427U0) - this.f3596r.mo10119g();
        } else {
            View m10426V0 = m10426V0();
            C1559c c1559c5 = this.f3595q;
            c1559c5.f3621h = this.f3596r.mo10115k() + c1559c5.f3621h;
            C1559c c1559c6 = this.f3595q;
            if (!this.f3599u) {
                i4 = -1;
            }
            c1559c6.f3618e = i4;
            int m10336K2 = RecyclerView.LayoutManager.m10336K(m10426V0);
            C1559c c1559c7 = this.f3595q;
            c1559c6.f3617d = m10336K2 + c1559c7.f3618e;
            c1559c7.f3615b = this.f3596r.mo10121e(m10426V0);
            mo10115k = (-this.f3596r.mo10121e(m10426V0)) + this.f3596r.mo10115k();
        }
        C1559c c1559c8 = this.f3595q;
        c1559c8.f3616c = i2;
        if (z) {
            c1559c8.f3616c = i2 - mo10115k;
        }
        c1559c8.f3620g = mo10115k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: h0 */
    public final Parcelable mo10225h0() {
        C1560d c1560d = this.f3604z;
        if (c1560d != null) {
            return new C1560d(c1560d);
        }
        C1560d c1560d2 = new C1560d();
        if (m10313w() > 0) {
            m10438J0();
            boolean z = this.f3597s ^ this.f3599u;
            c1560d2.f3628c = z;
            if (z) {
                View m10427U0 = m10427U0();
                c1560d2.f3627b = this.f3596r.mo10119g() - this.f3596r.mo10124b(m10427U0);
                c1560d2.f3626a = RecyclerView.LayoutManager.m10336K(m10427U0);
            } else {
                View m10426V0 = m10426V0();
                c1560d2.f3626a = RecyclerView.LayoutManager.m10336K(m10426V0);
                c1560d2.f3627b = this.f3596r.mo10121e(m10426V0) - this.f3596r.mo10115k();
            }
        } else {
            c1560d2.f3626a = -1;
        }
        return c1560d2;
    }

    /* renamed from: h1 */
    public final void m10414h1(int i, int i2) {
        this.f3595q.f3616c = this.f3596r.mo10119g() - i2;
        C1559c c1559c = this.f3595q;
        c1559c.f3618e = this.f3599u ? -1 : 1;
        c1559c.f3617d = i;
        c1559c.f3619f = 1;
        c1559c.f3615b = i2;
        c1559c.f3620g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: i */
    public final void mo10223i(int i, int i2, RecyclerView.C1594v c1594v, RecyclerView.LayoutManager.InterfaceC1567c interfaceC1567c) {
        if (this.f3594p != 0) {
            i = i2;
        }
        if (m10313w() == 0 || i == 0) {
            return;
        }
        m10438J0();
        m10415g1(i > 0 ? 1 : -1, Math.abs(i), true, c1594v);
        mo10443E0(c1594v, this.f3595q, interfaceC1567c);
    }

    /* renamed from: i1 */
    public final void m10413i1(int i, int i2) {
        this.f3595q.f3616c = i2 - this.f3596r.mo10115k();
        C1559c c1559c = this.f3595q;
        c1559c.f3617d = i;
        c1559c.f3618e = this.f3599u ? 1 : -1;
        c1559c.f3619f = -1;
        c1559c.f3615b = i2;
        c1559c.f3620g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10325j(int r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.InterfaceC1567c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f3604z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f3626a
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f3628c
            goto L22
        L13:
            r6.m10420b1()
            boolean r0 = r6.f3599u
            int r4 = r6.f3602x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.f3592C
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.RunnableC1635m.C1637b) r2
            r2.m10127a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo10325j(int, androidx.recyclerview.widget.RecyclerView$LayoutManager$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k */
    public final int mo4693k(RecyclerView.C1594v c1594v) {
        return m10442F0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l */
    public int mo4692l(RecyclerView.C1594v c1594v) {
        return m10441G0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m */
    public int mo4691m(RecyclerView.C1594v c1594v) {
        return m10440H0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: n */
    public final int mo10221n(RecyclerView.C1594v c1594v) {
        return m10442F0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: o */
    public int mo10220o(RecyclerView.C1594v c1594v) {
        return m10441G0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p */
    public int mo10219p(RecyclerView.C1594v c1594v) {
        return m10440H0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p0 */
    public int mo4689p0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (this.f3594p == 1) {
            return 0;
        }
        return m10419c1(i, c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: q0 */
    public final void mo4688q0(int i) {
        this.f3602x = i;
        this.f3603y = Integer.MIN_VALUE;
        C1560d c1560d = this.f3604z;
        if (c1560d != null) {
            c1560d.f3626a = -1;
        }
        m10320o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r */
    public final View mo10318r(int i) {
        int m10313w = m10313w();
        if (m10313w == 0) {
            return null;
        }
        int m10336K = i - RecyclerView.LayoutManager.m10336K(m10315v(0));
        if (m10336K >= 0 && m10336K < m10313w) {
            View m10315v = m10315v(m10336K);
            if (RecyclerView.LayoutManager.m10336K(m10315v) == i) {
                return m10315v;
            }
        }
        return super.mo10318r(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public int mo10218r0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (this.f3594p == 0) {
            return 0;
        }
        return m10419c1(i, c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public RecyclerView.C1579k mo4687s() {
        return new RecyclerView.C1579k(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: y0 */
    public final boolean mo10308y0() {
        boolean z;
        if (this.f3727m == 1073741824 || this.f3726l == 1073741824) {
            return false;
        }
        int m10313w = m10313w();
        int i = 0;
        while (true) {
            if (i < m10313w) {
                ViewGroup.LayoutParams layoutParams = m10315v(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3594p = 1;
        this.f3598t = false;
        this.f3599u = false;
        this.f3600v = false;
        this.f3601w = true;
        this.f3602x = -1;
        this.f3603y = Integer.MIN_VALUE;
        this.f3604z = null;
        this.f3590A = new C1557a();
        this.f3591B = new C1558b();
        this.f3592C = 2;
        this.f3593D = new int[2];
        RecyclerView.LayoutManager.Properties m10335L = RecyclerView.LayoutManager.m10335L(context, attributeSet, i, i2);
        m10417e1(m10335L.orientation);
        boolean z = m10335L.reverseLayout;
        mo10237c(null);
        if (z != this.f3598t) {
            this.f3598t = z;
            m10320o0();
        }
        mo10416f1(m10335L.stackFromEnd);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0235r;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC1635m;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f3577E;

    /* renamed from: F */
    public int f3578F;

    /* renamed from: G */
    public int[] f3579G;

    /* renamed from: H */
    public View[] f3580H;

    /* renamed from: I */
    public final SparseIntArray f3581I;

    /* renamed from: J */
    public final SparseIntArray f3582J;

    /* renamed from: K */
    public AbstractC1556c f3583K;

    /* renamed from: L */
    public final Rect f3584L;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C1554a extends AbstractC1556c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
        /* renamed from: c */
        public final int mo10445c(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
        /* renamed from: d */
        public final int mo6385d(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C1555b extends RecyclerView.C1579k {

        /* renamed from: e */
        public int f3585e;

        /* renamed from: f */
        public int f3586f;

        public C1555b(int i, int i2) {
            super(i, i2);
            this.f3585e = -1;
            this.f3586f = 0;
        }

        public C1555b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3585e = -1;
            this.f3586f = 0;
        }

        public C1555b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3585e = -1;
            this.f3586f = 0;
        }

        public C1555b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3585e = -1;
            this.f3586f = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1556c {

        /* renamed from: a */
        public final SparseIntArray f3587a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f3588b = new SparseIntArray();

        /* renamed from: c */
        public boolean f3589c = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m10447a(int i, int i2) {
            if (this.f3589c) {
                SparseIntArray sparseIntArray = this.f3587a;
                int i3 = sparseIntArray.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int mo10445c = mo10445c(i, i2);
                sparseIntArray.put(i, mo10445c);
                return mo10445c;
            }
            return mo10445c(i, i2);
        }

        /* renamed from: b */
        public int mo10446b(int i, int i2) {
            int mo6385d = mo6385d(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int mo6385d2 = mo6385d(i5);
                i3 += mo6385d2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = mo6385d2;
                }
            }
            return i3 + mo6385d > i2 ? i4 + 1 : i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004e -> B:27:0x0053). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0050 -> B:27:0x0053). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0052 -> B:27:0x0053). Please submit an issue!!! */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo10445c(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.mo6385d(r9)
                r1 = 0
                if (r0 != r10) goto L8
                return r1
            L8:
                boolean r2 = r8.f3589c
                if (r2 == 0) goto L42
                android.util.SparseIntArray r2 = r8.f3587a
                int r3 = r2.size()
                r4 = -1
                int r3 = r3 + r4
                r5 = r1
            L15:
                if (r5 > r3) goto L27
                int r6 = r5 + r3
                int r6 = r6 >>> 1
                int r7 = r2.keyAt(r6)
                if (r7 >= r9) goto L24
                int r5 = r6 + 1
                goto L15
            L24:
                int r3 = r6 + (-1)
                goto L15
            L27:
                int r5 = r5 + r4
                if (r5 < 0) goto L34
                int r3 = r2.size()
                if (r5 >= r3) goto L34
                int r4 = r2.keyAt(r5)
            L34:
                if (r4 < 0) goto L42
                int r2 = r2.get(r4)
                int r3 = r8.mo6385d(r4)
                int r3 = r3 + r2
                r2 = r3
                r3 = r8
                goto L53
            L42:
                r3 = r8
                r2 = r1
                r4 = r2
            L45:
                if (r4 >= r9) goto L56
                int r5 = r3.mo6385d(r4)
                int r2 = r2 + r5
                if (r2 != r10) goto L50
                r2 = r1
                goto L53
            L50:
                if (r2 <= r10) goto L53
                r2 = r5
            L53:
                int r4 = r4 + 1
                goto L45
            L56:
                int r0 = r0 + r2
                if (r0 > r10) goto L5a
                return r2
            L5a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c.mo10445c(int, int):int");
        }

        /* renamed from: d */
        public abstract int mo6385d(int i);

        /* renamed from: e */
        public final void m10444e() {
            this.f3587a.clear();
        }
    }

    public GridLayoutManager() {
        super(1);
        this.f3577E = false;
        this.f3578F = -1;
        this.f3581I = new SparseIntArray();
        this.f3582J = new SparseIntArray();
        this.f3583K = new C1554a();
        this.f3584L = new Rect();
        m10449p1(3);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f3577E = false;
        this.f3578F = -1;
        this.f3581I = new SparseIntArray();
        this.f3582J = new SparseIntArray();
        this.f3583K = new C1554a();
        this.f3584L = new Rect();
        m10449p1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3577E = false;
        this.f3578F = -1;
        this.f3581I = new SparseIntArray();
        this.f3582J = new SparseIntArray();
        this.f3583K = new C1554a();
        this.f3584L = new Rect();
        m10449p1(RecyclerView.LayoutManager.m10335L(context, attributeSet, i, i2).spanCount);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C0 */
    public final boolean mo10273C0() {
        return this.f3604z == null && !this.f3577E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E0 */
    public final void mo10443E0(RecyclerView.C1594v c1594v, LinearLayoutManager.C1559c c1559c, RecyclerView.LayoutManager.InterfaceC1567c interfaceC1567c) {
        boolean z;
        int i = this.f3578F;
        for (int i2 = 0; i2 < this.f3578F; i2++) {
            int i3 = c1559c.f3617d;
            if (i3 >= 0 && i3 < c1594v.m10276b()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                int i4 = c1559c.f3617d;
                ((RunnableC1635m.C1637b) interfaceC1567c).m10127a(i4, Math.max(0, c1559c.f3620g));
                i -= this.f3583K.mo6385d(i4);
                c1559c.f3617d += c1559c.f3618e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M */
    public final int mo10334M(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (this.f3594p == 0) {
            return this.f3578F;
        }
        if (c1594v.m10276b() < 1) {
            return 0;
        }
        return m10453l1(c1594v.m10276b() - 1, c1586q, c1594v) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: R0 */
    public final View mo10430R0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z, boolean z2) {
        int i;
        int i2;
        int m10313w = m10313w();
        int i3 = 1;
        if (z2) {
            i2 = m10313w() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m10313w;
            i2 = 0;
        }
        int m10276b = c1594v.m10276b();
        m10438J0();
        int mo10115k = this.f3596r.mo10115k();
        int mo10119g = this.f3596r.mo10119g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View m10315v = m10315v(i2);
            int m10336K = RecyclerView.LayoutManager.m10336K(m10315v);
            if (m10336K >= 0 && m10336K < m10276b && m10452m1(m10336K, c1586q, c1594v) == 0) {
                if (((RecyclerView.C1579k) m10315v.getLayoutParams()).m10296c()) {
                    if (view2 == null) {
                        view2 = m10315v;
                    }
                } else if (this.f3596r.mo10121e(m10315v) < mo10119g && this.f3596r.mo10124b(m10315v) >= mo10115k) {
                    return m10315v;
                } else {
                    if (view == null) {
                        view = m10315v;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo10249V(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C1586q r25, androidx.recyclerview.widget.RecyclerView.C1594v r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo10249V(android.view.View, int, androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.RecyclerView$v):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: X0 */
    public final void mo10424X0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, LinearLayoutManager.C1559c c1559c, LinearLayoutManager.C1558b c1558b) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int m10311x;
        int i11;
        boolean z3;
        boolean z4;
        View m10408b;
        int mo10116j = this.f3596r.mo10116j();
        int i12 = 1;
        if (mo10116j != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (m10313w() > 0) {
            i = this.f3579G[this.f3578F];
        } else {
            i = 0;
        }
        if (z) {
            m10448q1();
        }
        if (c1559c.f3618e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i13 = this.f3578F;
        if (!z2) {
            i13 = m10452m1(c1559c.f3617d, c1586q, c1594v) + m10451n1(c1559c.f3617d, c1586q, c1594v);
        }
        int i14 = 0;
        while (i14 < this.f3578F) {
            int i15 = c1559c.f3617d;
            if (i15 >= 0 && i15 < c1594v.m10276b()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 || i13 <= 0) {
                break;
            }
            int i16 = c1559c.f3617d;
            int m10451n1 = m10451n1(i16, c1586q, c1594v);
            if (m10451n1 <= this.f3578F) {
                i13 -= m10451n1;
                if (i13 < 0 || (m10408b = c1559c.m10408b(c1586q)) == null) {
                    break;
                }
                this.f3580H[i14] = m10408b;
                i14++;
            } else {
                throw new IllegalArgumentException(C0539e.m12264b(C1169e.m11130b("Item at position ", i16, " requires ", m10451n1, " spans but GridLayoutManager has only "), this.f3578F, " spans."));
            }
        }
        if (i14 == 0) {
            c1558b.f3611b = true;
            return;
        }
        if (z2) {
            i2 = 0;
            i3 = i14;
        } else {
            i2 = i14 - 1;
            i12 = -1;
            i3 = -1;
        }
        int i17 = 0;
        while (i2 != i3) {
            View view = this.f3580H[i2];
            C1555b c1555b = (C1555b) view.getLayoutParams();
            int m10451n12 = m10451n1(RecyclerView.LayoutManager.m10336K(view), c1586q, c1594v);
            c1555b.f3586f = m10451n12;
            c1555b.f3585e = i17;
            i17 += m10451n12;
            i2 += i12;
        }
        float f = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            View view2 = this.f3580H[i19];
            if (c1559c.f3624k == null) {
                if (z2) {
                    z3 = false;
                    m10328b(view2, false, -1);
                } else {
                    z3 = false;
                    m10328b(view2, false, 0);
                }
            } else {
                z3 = false;
                if (z2) {
                    m10328b(view2, true, -1);
                } else {
                    m10328b(view2, true, 0);
                }
            }
            m10327d(view2, this.f3584L);
            m10450o1(view2, z3, mo10116j);
            int mo10123c = this.f3596r.mo10123c(view2);
            if (mo10123c > i18) {
                i18 = mo10123c;
            }
            float mo10122d = (this.f3596r.mo10122d(view2) * 1.0f) / ((C1555b) view2.getLayoutParams()).f3586f;
            if (mo10122d > f) {
                f = mo10122d;
            }
        }
        if (z) {
            m10455j1(Math.max(Math.round(f * this.f3578F), i));
            i18 = 0;
            for (int i20 = 0; i20 < i14; i20++) {
                View view3 = this.f3580H[i20];
                m10450o1(view3, true, 1073741824);
                int mo10123c2 = this.f3596r.mo10123c(view3);
                if (mo10123c2 > i18) {
                    i18 = mo10123c2;
                }
            }
        }
        for (int i21 = 0; i21 < i14; i21++) {
            View view4 = this.f3580H[i21];
            if (this.f3596r.mo10123c(view4) != i18) {
                C1555b c1555b2 = (C1555b) view4.getLayoutParams();
                Rect rect = c1555b2.f3739b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1555b2).topMargin + ((ViewGroup.MarginLayoutParams) c1555b2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1555b2).leftMargin + ((ViewGroup.MarginLayoutParams) c1555b2).rightMargin;
                int m10454k1 = m10454k1(c1555b2.f3585e, c1555b2.f3586f);
                if (this.f3594p == 1) {
                    i11 = RecyclerView.LayoutManager.m10311x(m10454k1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) c1555b2).width, false);
                    m10311x = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    m10311x = RecyclerView.LayoutManager.m10311x(m10454k1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c1555b2).height, false);
                    i11 = makeMeasureSpec;
                }
                if (m10306z0(view4, i11, m10311x, (RecyclerView.C1579k) view4.getLayoutParams())) {
                    view4.measure(i11, m10311x);
                }
            }
        }
        c1558b.f3610a = i18;
        if (this.f3594p == 1) {
            if (c1559c.f3619f == -1) {
                i10 = c1559c.f3615b;
                i9 = i10 - i18;
            } else {
                i9 = c1559c.f3615b;
                i10 = i18 + i9;
            }
            i7 = 0;
            i6 = i9;
            i8 = i10;
            i5 = 0;
        } else {
            if (c1559c.f3619f == -1) {
                i5 = c1559c.f3615b;
                i4 = i5 - i18;
            } else {
                i4 = c1559c.f3615b;
                i5 = i18 + i4;
            }
            i6 = 0;
            i7 = i4;
            i8 = 0;
        }
        for (int i24 = 0; i24 < i14; i24++) {
            View view5 = this.f3580H[i24];
            C1555b c1555b3 = (C1555b) view5.getLayoutParams();
            if (this.f3594p == 1) {
                if (m10425W0()) {
                    i5 = m10339H() + this.f3579G[this.f3578F - c1555b3.f3585e];
                    i7 = i5 - this.f3596r.mo10122d(view5);
                } else {
                    i7 = this.f3579G[c1555b3.f3585e] + m10339H();
                    i5 = this.f3596r.mo10122d(view5) + i7;
                }
            } else {
                int m10337J = m10337J() + this.f3579G[c1555b3.f3585e];
                i6 = m10337J;
                i8 = this.f3596r.mo10122d(view5) + m10337J;
            }
            RecyclerView.LayoutManager.m10331Q(view5, i7, i6, i5, i8);
            if (c1555b3.m10296c() || c1555b3.m10297b()) {
                c1558b.f3612c = true;
            }
            c1558b.f3613d = view5.hasFocusable() | c1558b.f3613d;
        }
        Arrays.fill(this.f3580H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Y */
    public final void mo10329Y(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, View view, C0874o c0874o) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1555b)) {
            m10330X(view, c0874o);
            return;
        }
        C1555b c1555b = (C1555b) layoutParams;
        int m10453l1 = m10453l1(c1555b.m10298a(), c1586q, c1594v);
        int i3 = 1;
        if (this.f3594p == 0) {
            int i4 = c1555b.f3585e;
            int i5 = c1555b.f3586f;
            i = m10453l1;
            m10453l1 = i4;
            i2 = 1;
            i3 = i5;
        } else {
            i = c1555b.f3585e;
            i2 = c1555b.f3586f;
        }
        c0874o.m11550h(C0874o.C0876b.m11544a(m10453l1, i3, i, i2, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Y0 */
    public final void mo10423Y0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, LinearLayoutManager.C1557a c1557a, int i) {
        boolean z;
        m10448q1();
        if (c1594v.m10276b() > 0 && !c1594v.f3779g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int m10452m1 = m10452m1(c1557a.f3606b, c1586q, c1594v);
            if (z) {
                while (m10452m1 > 0) {
                    int i2 = c1557a.f3606b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1557a.f3606b = i3;
                    m10452m1 = m10452m1(i3, c1586q, c1594v);
                }
            } else {
                int m10276b = c1594v.m10276b() - 1;
                int i4 = c1557a.f3606b;
                while (i4 < m10276b) {
                    int i5 = i4 + 1;
                    int m10452m12 = m10452m1(i5, c1586q, c1594v);
                    if (m10452m12 <= m10452m1) {
                        break;
                    }
                    i4 = i5;
                    m10452m1 = m10452m12;
                }
                c1557a.f3606b = i4;
            }
        }
        View[] viewArr = this.f3580H;
        if (viewArr == null || viewArr.length != this.f3578F) {
            this.f3580H = new View[this.f3578F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z */
    public final void mo10244Z(int i, int i2) {
        this.f3583K.m10444e();
        this.f3583K.f3588b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a0 */
    public final void mo10241a0() {
        this.f3583K.m10444e();
        this.f3583K.f3588b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b0 */
    public final void mo10239b0(int i, int i2) {
        this.f3583K.m10444e();
        this.f3583K.f3588b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c0 */
    public final void mo10236c0(int i, int i2) {
        this.f3583K.m10444e();
        this.f3583K.f3588b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: d0 */
    public final void mo10234d0(int i, int i2) {
        this.f3583K.m10444e();
        this.f3583K.f3588b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e0 */
    public final void mo4695e0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        boolean z = c1594v.f3779g;
        SparseIntArray sparseIntArray = this.f3582J;
        SparseIntArray sparseIntArray2 = this.f3581I;
        if (z) {
            int m10313w = m10313w();
            for (int i = 0; i < m10313w; i++) {
                C1555b c1555b = (C1555b) m10315v(i).getLayoutParams();
                int m10298a = c1555b.m10298a();
                sparseIntArray2.put(m10298a, c1555b.f3586f);
                sparseIntArray.put(m10298a, c1555b.f3585e);
            }
        }
        super.mo4695e0(c1586q, c1594v);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f0 */
    public final void mo4694f0(RecyclerView.C1594v c1594v) {
        super.mo4694f0(c1594v);
        this.f3577E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: f1 */
    public final void mo10416f1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo10416f1(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g */
    public final boolean mo10228g(RecyclerView.C1579k c1579k) {
        return c1579k instanceof C1555b;
    }

    /* renamed from: j1 */
    public final void m10455j1(int i) {
        int i2;
        int[] iArr = this.f3579G;
        int i3 = this.f3578F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f3579G = iArr;
    }

    /* renamed from: k1 */
    public final int m10454k1(int i, int i2) {
        if (this.f3594p != 1 || !m10425W0()) {
            int[] iArr = this.f3579G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3579G;
        int i3 = this.f3578F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l */
    public final int mo4692l(RecyclerView.C1594v c1594v) {
        return m10441G0(c1594v);
    }

    /* renamed from: l1 */
    public final int m10453l1(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (!c1594v.f3779g) {
            return this.f3583K.mo10446b(i, this.f3578F);
        }
        int m10293b = c1586q.m10293b(i);
        if (m10293b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f3583K.mo10446b(m10293b, this.f3578F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m */
    public final int mo4691m(RecyclerView.C1594v c1594v) {
        return m10440H0(c1594v);
    }

    /* renamed from: m1 */
    public final int m10452m1(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (!c1594v.f3779g) {
            return this.f3583K.m10447a(i, this.f3578F);
        }
        int i2 = this.f3582J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m10293b = c1586q.m10293b(i);
        if (m10293b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f3583K.m10447a(m10293b, this.f3578F);
    }

    /* renamed from: n1 */
    public final int m10451n1(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (!c1594v.f3779g) {
            return this.f3583K.mo6385d(i);
        }
        int i2 = this.f3581I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m10293b = c1586q.m10293b(i);
        if (m10293b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f3583K.mo6385d(m10293b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: o */
    public final int mo10220o(RecyclerView.C1594v c1594v) {
        return m10441G0(c1594v);
    }

    /* renamed from: o1 */
    public final void m10450o1(View view, boolean z, int i) {
        int i2;
        int i3;
        boolean m10310x0;
        C1555b c1555b = (C1555b) view.getLayoutParams();
        Rect rect = c1555b.f3739b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1555b).topMargin + ((ViewGroup.MarginLayoutParams) c1555b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1555b).leftMargin + ((ViewGroup.MarginLayoutParams) c1555b).rightMargin;
        int m10454k1 = m10454k1(c1555b.f3585e, c1555b.f3586f);
        if (this.f3594p == 1) {
            i3 = RecyclerView.LayoutManager.m10311x(m10454k1, i, i5, ((ViewGroup.MarginLayoutParams) c1555b).width, false);
            i2 = RecyclerView.LayoutManager.m10311x(this.f3596r.mo10114l(), this.f3727m, i4, ((ViewGroup.MarginLayoutParams) c1555b).height, true);
        } else {
            int m10311x = RecyclerView.LayoutManager.m10311x(m10454k1, i, i4, ((ViewGroup.MarginLayoutParams) c1555b).height, false);
            int m10311x2 = RecyclerView.LayoutManager.m10311x(this.f3596r.mo10114l(), this.f3726l, i5, ((ViewGroup.MarginLayoutParams) c1555b).width, true);
            i2 = m10311x;
            i3 = m10311x2;
        }
        RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
        if (z) {
            m10310x0 = m10306z0(view, i3, i2, c1579k);
        } else {
            m10310x0 = m10310x0(view, i3, i2, c1579k);
        }
        if (m10310x0) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p */
    public final int mo10219p(RecyclerView.C1594v c1594v) {
        return m10440H0(c1594v);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p0 */
    public final int mo4689p0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        m10448q1();
        View[] viewArr = this.f3580H;
        if (viewArr == null || viewArr.length != this.f3578F) {
            this.f3580H = new View[this.f3578F];
        }
        return super.mo4689p0(i, c1586q, c1594v);
    }

    /* renamed from: p1 */
    public final void m10449p1(int i) {
        if (i == this.f3578F) {
            return;
        }
        this.f3577E = true;
        if (i >= 1) {
            this.f3578F = i;
            this.f3583K.m10444e();
            m10320o0();
            return;
        }
        throw new IllegalArgumentException(C0235r.m12816a("Span count should be at least 1. Provided ", i));
    }

    /* renamed from: q1 */
    public final void m10448q1() {
        int m10340G;
        int m10337J;
        if (this.f3594p == 1) {
            m10340G = this.f3728n - m10338I();
            m10337J = m10339H();
        } else {
            m10340G = this.f3729o - m10340G();
            m10337J = m10337J();
        }
        m10455j1(m10340G - m10337J);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public final int mo10218r0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        m10448q1();
        View[] viewArr = this.f3580H;
        if (viewArr == null || viewArr.length != this.f3578F) {
            this.f3580H = new View[this.f3578F];
        }
        return super.mo10218r0(i, c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public final RecyclerView.C1579k mo4687s() {
        return this.f3594p == 0 ? new C1555b(-2, -1) : new C1555b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: t */
    public final RecyclerView.C1579k mo10217t(Context context, AttributeSet attributeSet) {
        return new C1555b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u */
    public final RecyclerView.C1579k mo10216u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1555b((ViewGroup.MarginLayoutParams) layoutParams) : new C1555b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public final void mo10215u0(Rect rect, int i, int i2) {
        int m10326h;
        int m10326h2;
        if (this.f3579G == null) {
            super.mo10215u0(rect, i, i2);
        }
        int m10338I = m10338I() + m10339H();
        int m10340G = m10340G() + m10337J();
        if (this.f3594p == 1) {
            int height = rect.height() + m10340G;
            RecyclerView recyclerView = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            m10326h2 = RecyclerView.LayoutManager.m10326h(i2, height, ViewCompat.C0814d.m11761d(recyclerView));
            int[] iArr = this.f3579G;
            m10326h = RecyclerView.LayoutManager.m10326h(i, iArr[iArr.length - 1] + m10338I, ViewCompat.C0814d.m11760e(this.f3716b));
        } else {
            int width = rect.width() + m10338I;
            RecyclerView recyclerView2 = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            m10326h = RecyclerView.LayoutManager.m10326h(i, width, ViewCompat.C0814d.m11760e(recyclerView2));
            int[] iArr2 = this.f3579G;
            m10326h2 = RecyclerView.LayoutManager.m10326h(i2, iArr2[iArr2.length - 1] + m10340G, ViewCompat.C0814d.m11761d(this.f3716b));
        }
        this.f3716b.setMeasuredDimension(m10326h, m10326h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: y */
    public final int mo10309y(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (this.f3594p == 1) {
            return this.f3578F;
        }
        if (c1594v.m10276b() < 1) {
            return 0;
        }
        return m10453l1(c1594v.m10276b() - 1, c1586q, c1594v) + 1;
    }
}

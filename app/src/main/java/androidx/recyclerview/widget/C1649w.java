package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C1609a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public final class C1649w implements C1609a.InterfaceC1610a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4008a;

    public C1649w(RecyclerView recyclerView) {
        this.f4008a = recyclerView;
    }

    /* renamed from: a */
    public final void m10102a(C1609a.C1611b c1611b) {
        int i = c1611b.f3863a;
        RecyclerView recyclerView = this.f4008a;
        if (i == 1) {
            recyclerView.f3679m.mo10244Z(c1611b.f3864b, c1611b.f3866d);
        } else if (i == 2) {
            recyclerView.f3679m.mo10236c0(c1611b.f3864b, c1611b.f3866d);
        } else if (i == 4) {
            recyclerView.f3679m.mo10234d0(c1611b.f3864b, c1611b.f3866d);
        } else if (i != 8) {
        } else {
            recyclerView.f3679m.mo10239b0(c1611b.f3864b, c1611b.f3866d);
        }
    }

    /* renamed from: b */
    public final RecyclerView.AbstractC1597y m10101b(int i) {
        RecyclerView recyclerView = this.f4008a;
        int m10161h = recyclerView.f3663e.m10161h();
        int i2 = 0;
        RecyclerView.AbstractC1597y abstractC1597y = null;
        while (true) {
            if (i2 >= m10161h) {
                break;
            }
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(recyclerView.f3663e.m10162g(i2));
            if (m10398J != null && !m10398J.isRemoved() && m10398J.mPosition == i) {
                if (recyclerView.f3663e.m10159j(m10398J.itemView)) {
                    abstractC1597y = m10398J;
                } else {
                    abstractC1597y = m10398J;
                    break;
                }
            }
            i2++;
        }
        if (abstractC1597y == null || recyclerView.f3663e.m10159j(abstractC1597y.itemView)) {
            return null;
        }
        return abstractC1597y;
    }

    /* renamed from: c */
    public final void m10100c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f4008a;
        int m10161h = recyclerView.f3663e.m10161h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m10161h; i6++) {
            View m10162g = recyclerView.f3663e.m10162g(i6);
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(m10162g);
            if (m10398J != null && !m10398J.shouldIgnore() && (i4 = m10398J.mPosition) >= i && i4 < i5) {
                m10398J.addFlags(2);
                m10398J.addChangePayload(obj);
                ((RecyclerView.C1579k) m10162g.getLayoutParams()).f3740c = true;
            }
        }
        RecyclerView.C1586q c1586q = recyclerView.f3659b;
        ArrayList<RecyclerView.AbstractC1597y> arrayList = c1586q.f3750c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.AbstractC1597y abstractC1597y = arrayList.get(size);
                if (abstractC1597y != null && (i3 = abstractC1597y.mPosition) >= i && i3 < i5) {
                    abstractC1597y.addFlags(2);
                    c1586q.m10289f(size);
                }
            } else {
                recyclerView.f3684o0 = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public final void m10099d(int i, int i2) {
        RecyclerView recyclerView = this.f4008a;
        int m10161h = recyclerView.f3663e.m10161h();
        for (int i3 = 0; i3 < m10161h; i3++) {
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(recyclerView.f3663e.m10162g(i3));
            if (m10398J != null && !m10398J.shouldIgnore() && m10398J.mPosition >= i) {
                m10398J.offsetPosition(i2, false);
                recyclerView.f3676k0.f3778f = true;
            }
        }
        ArrayList<RecyclerView.AbstractC1597y> arrayList = recyclerView.f3659b.f3750c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC1597y abstractC1597y = arrayList.get(i4);
            if (abstractC1597y != null && abstractC1597y.mPosition >= i) {
                abstractC1597y.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3682n0 = true;
    }

    /* renamed from: e */
    public final void m10098e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f4008a;
        int m10161h = recyclerView.f3663e.m10161h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m10161h; i11++) {
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(recyclerView.f3663e.m10162g(i11));
            if (m10398J != null && (i9 = m10398J.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    m10398J.offsetPosition(i2 - i, false);
                } else {
                    m10398J.offsetPosition(i5, false);
                }
                recyclerView.f3676k0.f3778f = true;
            }
        }
        RecyclerView.C1586q c1586q = recyclerView.f3659b;
        c1586q.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList<RecyclerView.AbstractC1597y> arrayList = c1586q.f3750c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.AbstractC1597y abstractC1597y = arrayList.get(i12);
            if (abstractC1597y != null && (i8 = abstractC1597y.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC1597y.offsetPosition(i2 - i, false);
                } else {
                    abstractC1597y.offsetPosition(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3682n0 = true;
    }
}

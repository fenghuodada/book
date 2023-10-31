package androidx.appcompat.widget;

import androidx.recyclerview.widget.GridLayoutManager;
import mva2.adapter.C11180f;
import mva2.adapter.C11182g;
import mva2.adapter.internal.C11187d;

/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public final class C0403p1 extends GridLayoutManager.AbstractC1556c {

    /* renamed from: d */
    public C11180f f1347d;

    /* renamed from: e */
    public final C11187d f1348e;

    public C0403p1(C11187d c11187d) {
        this.f3589c = true;
        this.f1348e = c11187d;
    }

    /* renamed from: a */
    public final int m12538a(int i, int i2) {
        return super.m10447a(i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
    /* renamed from: b */
    public final int mo10446b(int i, int i2) {
        int m10447a;
        int mo10446b;
        C11187d c11187d = this.f1348e;
        int i3 = c11187d.f21855a.get(i, -1);
        if (i3 == -1) {
            int mo6385d = mo6385d(i);
            int i4 = i - 1;
            int i5 = 0;
            if (i4 < 0) {
                m10447a = 0;
            } else {
                m10447a = super.m10447a(i4, i2);
            }
            if (i4 < 0) {
                mo10446b = 0;
            } else {
                mo10446b = mo10446b(i4, i2);
            }
            if (i4 >= 0) {
                i5 = mo6385d(i4);
            }
            if (m10447a + i5 + mo6385d > i2) {
                mo10446b++;
            }
            int i6 = mo10446b;
            c11187d.f21855a.append(i, i6);
            return i6;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
    /* renamed from: d */
    public final int mo6385d(int i) {
        C11180f c11180f = this.f1347d;
        C11187d c11187d = c11180f.f21841k;
        int i2 = c11187d.f21855a.get(i, -1);
        if (i2 == -1) {
            C11182g c11182g = c11180f.f21838h;
            int i3 = c11180f.f21844n;
            int mo76h = c11182g.mo76h(i, i3);
            c11180f.m88b(i).getClass();
            int i4 = (i3 * 1) / mo76h;
            c11187d.f21855a.append(i, i4);
            return i4;
        }
        return i2;
    }
}

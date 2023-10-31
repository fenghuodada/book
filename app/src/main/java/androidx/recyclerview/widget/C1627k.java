package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public final class C1627k extends AbstractC1653z {

    /* renamed from: s */
    public static TimeInterpolator f3910s;

    /* renamed from: h */
    public final ArrayList<RecyclerView.AbstractC1597y> f3911h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<RecyclerView.AbstractC1597y> f3912i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<C1629b> f3913j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<C1628a> f3914k = new ArrayList<>();

    /* renamed from: l */
    public final ArrayList<ArrayList<RecyclerView.AbstractC1597y>> f3915l = new ArrayList<>();

    /* renamed from: m */
    public final ArrayList<ArrayList<C1629b>> f3916m = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<ArrayList<C1628a>> f3917n = new ArrayList<>();

    /* renamed from: o */
    public final ArrayList<RecyclerView.AbstractC1597y> f3918o = new ArrayList<>();

    /* renamed from: p */
    public final ArrayList<RecyclerView.AbstractC1597y> f3919p = new ArrayList<>();

    /* renamed from: q */
    public final ArrayList<RecyclerView.AbstractC1597y> f3920q = new ArrayList<>();

    /* renamed from: r */
    public final ArrayList<RecyclerView.AbstractC1597y> f3921r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class C1628a {

        /* renamed from: a */
        public RecyclerView.AbstractC1597y f3922a;

        /* renamed from: b */
        public RecyclerView.AbstractC1597y f3923b;

        /* renamed from: c */
        public final int f3924c;

        /* renamed from: d */
        public final int f3925d;

        /* renamed from: e */
        public final int f3926e;

        /* renamed from: f */
        public final int f3927f;

        public C1628a(RecyclerView.AbstractC1597y abstractC1597y, RecyclerView.AbstractC1597y abstractC1597y2, int i, int i2, int i3, int i4) {
            this.f3922a = abstractC1597y;
            this.f3923b = abstractC1597y2;
            this.f3924c = i;
            this.f3925d = i2;
            this.f3926e = i3;
            this.f3927f = i4;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f3922a + ", newHolder=" + this.f3923b + ", fromX=" + this.f3924c + ", fromY=" + this.f3925d + ", toX=" + this.f3926e + ", toY=" + this.f3927f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes.dex */
    public static class C1629b {

        /* renamed from: a */
        public final RecyclerView.AbstractC1597y f3928a;

        /* renamed from: b */
        public final int f3929b;

        /* renamed from: c */
        public final int f3930c;

        /* renamed from: d */
        public final int f3931d;

        /* renamed from: e */
        public final int f3932e;

        public C1629b(RecyclerView.AbstractC1597y abstractC1597y, int i, int i2, int i3, int i4) {
            this.f3928a = abstractC1597y;
            this.f3929b = i;
            this.f3930c = i2;
            this.f3931d = i3;
            this.f3932e = i4;
        }
    }

    /* renamed from: h */
    public static void m10142h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((RecyclerView.AbstractC1597y) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: d */
    public final void mo10145d(RecyclerView.AbstractC1597y abstractC1597y) {
        View view = abstractC1597y.itemView;
        view.animate().cancel();
        ArrayList<C1629b> arrayList = this.f3913j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f3928a == abstractC1597y) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m10349c(abstractC1597y);
                arrayList.remove(size);
            }
        }
        m10140j(abstractC1597y, this.f3914k);
        if (this.f3911h.remove(abstractC1597y)) {
            view.setAlpha(1.0f);
            m10349c(abstractC1597y);
        }
        if (this.f3912i.remove(abstractC1597y)) {
            view.setAlpha(1.0f);
            m10349c(abstractC1597y);
        }
        ArrayList<ArrayList<C1628a>> arrayList2 = this.f3917n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<C1628a> arrayList3 = arrayList2.get(size2);
            m10140j(abstractC1597y, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<C1629b>> arrayList4 = this.f3916m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<C1629b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).f3928a == abstractC1597y) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m10349c(abstractC1597y);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC1597y>> arrayList6 = this.f3915l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.AbstractC1597y> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(abstractC1597y)) {
                    view.setAlpha(1.0f);
                    m10349c(abstractC1597y);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f3920q.remove(abstractC1597y);
                this.f3918o.remove(abstractC1597y);
                this.f3921r.remove(abstractC1597y);
                this.f3919p.remove(abstractC1597y);
                m10141i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: e */
    public final void mo10144e() {
        ArrayList<C1629b> arrayList = this.f3913j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1629b c1629b = arrayList.get(size);
            View view = c1629b.f3928a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m10349c(c1629b.f3928a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.AbstractC1597y> arrayList2 = this.f3911h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m10349c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.AbstractC1597y> arrayList3 = this.f3912i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1597y abstractC1597y = arrayList3.get(size3);
            abstractC1597y.itemView.setAlpha(1.0f);
            m10349c(abstractC1597y);
            arrayList3.remove(size3);
        }
        ArrayList<C1628a> arrayList4 = this.f3914k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1628a c1628a = arrayList4.get(size4);
            RecyclerView.AbstractC1597y abstractC1597y2 = c1628a.f3922a;
            if (abstractC1597y2 != null) {
                m10139k(c1628a, abstractC1597y2);
            }
            RecyclerView.AbstractC1597y abstractC1597y3 = c1628a.f3923b;
            if (abstractC1597y3 != null) {
                m10139k(c1628a, abstractC1597y3);
            }
        }
        arrayList4.clear();
        if (!mo10143f()) {
            return;
        }
        ArrayList<ArrayList<C1629b>> arrayList5 = this.f3916m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<C1629b> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C1629b c1629b2 = arrayList6.get(size6);
                    View view2 = c1629b2.f3928a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m10349c(c1629b2.f3928a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC1597y>> arrayList7 = this.f3915l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.AbstractC1597y> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.AbstractC1597y abstractC1597y4 = arrayList8.get(size8);
                    abstractC1597y4.itemView.setAlpha(1.0f);
                    m10349c(abstractC1597y4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<C1628a>> arrayList9 = this.f3917n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<C1628a> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    C1628a c1628a2 = arrayList10.get(size10);
                    RecyclerView.AbstractC1597y abstractC1597y5 = c1628a2.f3922a;
                    if (abstractC1597y5 != null) {
                        m10139k(c1628a2, abstractC1597y5);
                    }
                    RecyclerView.AbstractC1597y abstractC1597y6 = c1628a2.f3923b;
                    if (abstractC1597y6 != null) {
                        m10139k(c1628a2, abstractC1597y6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        m10142h(this.f3920q);
        m10142h(this.f3919p);
        m10142h(this.f3918o);
        m10142h(this.f3921r);
        ArrayList<RecyclerView.ItemAnimator.InterfaceC1562a> arrayList11 = this.f3708b;
        int size11 = arrayList11.size();
        for (int i = 0; i < size11; i++) {
            arrayList11.get(i).m10348a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: f */
    public final boolean mo10143f() {
        return (this.f3912i.isEmpty() && this.f3914k.isEmpty() && this.f3913j.isEmpty() && this.f3911h.isEmpty() && this.f3919p.isEmpty() && this.f3920q.isEmpty() && this.f3918o.isEmpty() && this.f3921r.isEmpty() && this.f3916m.isEmpty() && this.f3915l.isEmpty() && this.f3917n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1653z
    /* renamed from: g */
    public final boolean mo10088g(RecyclerView.AbstractC1597y abstractC1597y, int i, int i2, int i3, int i4) {
        View view = abstractC1597y.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1597y.itemView.getTranslationY());
        m10138l(abstractC1597y);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m10349c(abstractC1597y);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3913j.add(new C1629b(abstractC1597y, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: i */
    public final void m10141i() {
        if (!mo10143f()) {
            ArrayList<RecyclerView.ItemAnimator.InterfaceC1562a> arrayList = this.f3708b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).m10348a();
            }
            arrayList.clear();
        }
    }

    /* renamed from: j */
    public final void m10140j(RecyclerView.AbstractC1597y abstractC1597y, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C1628a c1628a = (C1628a) arrayList.get(size);
            if (m10139k(c1628a, abstractC1597y) && c1628a.f3922a == null && c1628a.f3923b == null) {
                arrayList.remove(c1628a);
            }
        }
    }

    /* renamed from: k */
    public final boolean m10139k(C1628a c1628a, RecyclerView.AbstractC1597y abstractC1597y) {
        if (c1628a.f3923b == abstractC1597y) {
            c1628a.f3923b = null;
        } else if (c1628a.f3922a == abstractC1597y) {
            c1628a.f3922a = null;
        } else {
            return false;
        }
        abstractC1597y.itemView.setAlpha(1.0f);
        abstractC1597y.itemView.setTranslationX(0.0f);
        abstractC1597y.itemView.setTranslationY(0.0f);
        m10349c(abstractC1597y);
        return true;
    }

    /* renamed from: l */
    public final void m10138l(RecyclerView.AbstractC1597y abstractC1597y) {
        if (f3910s == null) {
            f3910s = new ValueAnimator().getInterpolator();
        }
        abstractC1597y.itemView.animate().setInterpolator(f3910s);
        mo10145d(abstractC1597y);
    }
}

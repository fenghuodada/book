package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.p000v4.media.session.C0017a;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C0470b;
import androidx.collection.C0473e;
import androidx.collection.C0474f;
import androidx.constraintlayout.core.C0499a;
import androidx.constraintlayout.core.C0510h;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: u */
    public static final int[] f4179u = {2, 1, 3, 4};

    /* renamed from: v */
    public static final C1720a f4180v = new C1720a();

    /* renamed from: w */
    public static final ThreadLocal<C0470b<Animator, C1721b>> f4181w = new ThreadLocal<>();

    /* renamed from: k */
    public ArrayList<C1766o> f4192k;

    /* renamed from: l */
    public ArrayList<C1766o> f4193l;

    /* renamed from: s */
    public AbstractC1722c f4200s;

    /* renamed from: a */
    public final String f4182a = getClass().getName();

    /* renamed from: b */
    public long f4183b = -1;

    /* renamed from: c */
    public long f4184c = -1;

    /* renamed from: d */
    public TimeInterpolator f4185d = null;

    /* renamed from: e */
    public final ArrayList<Integer> f4186e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<View> f4187f = new ArrayList<>();

    /* renamed from: g */
    public C1767p f4188g = new C1767p();

    /* renamed from: h */
    public C1767p f4189h = new C1767p();

    /* renamed from: i */
    public C1761l f4190i = null;

    /* renamed from: j */
    public final int[] f4191j = f4179u;

    /* renamed from: m */
    public final ArrayList<Animator> f4194m = new ArrayList<>();

    /* renamed from: n */
    public int f4195n = 0;

    /* renamed from: o */
    public boolean f4196o = false;

    /* renamed from: p */
    public boolean f4197p = false;

    /* renamed from: q */
    public ArrayList<InterfaceC1723d> f4198q = null;

    /* renamed from: r */
    public ArrayList<Animator> f4199r = new ArrayList<>();

    /* renamed from: t */
    public AbstractC1750f f4201t = f4180v;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface MatchOrder {
    }

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes.dex */
    public static class C1720a extends AbstractC1750f {
        @Override // androidx.transition.AbstractC1750f
        /* renamed from: a */
        public final Path mo9988a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: classes.dex */
    public static class C1721b {

        /* renamed from: a */
        public final View f4202a;

        /* renamed from: b */
        public final String f4203b;

        /* renamed from: c */
        public final C1766o f4204c;

        /* renamed from: d */
        public final InterfaceC1755h0 f4205d;

        /* renamed from: e */
        public final Transition f4206e;

        public C1721b(View view, String str, Transition transition, C1753g0 c1753g0, C1766o c1766o) {
            this.f4202a = view;
            this.f4203b = str;
            this.f4204c = c1766o;
            this.f4205d = c1753g0;
            this.f4206e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1722c {
    }

    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1723d {
        /* renamed from: a */
        void mo9987a();

        /* renamed from: b */
        void mo9986b();

        /* renamed from: c */
        void mo9962c(@NonNull Transition transition);

        /* renamed from: d */
        void mo9961d();

        /* renamed from: e */
        void mo9985e();
    }

    /* renamed from: c */
    public static void m10009c(C1767p c1767p, View view, C1766o c1766o) {
        c1767p.f4281a.put(view, c1766o);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = c1767p.f4282b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        String m11711k = ViewCompat.C0819i.m11711k(view);
        if (m11711k != null) {
            C0470b<String, View> c0470b = c1767p.f4284d;
            if (c0470b.containsKey(m11711k)) {
                c0470b.put(m11711k, null);
            } else {
                c0470b.put(m11711k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0474f<View> c0474f = c1767p.f4283c;
                if (c0474f.f1506a) {
                    c0474f.m12421d();
                }
                if (C0473e.m12425b(c0474f.f1507b, c0474f.f1509d, itemIdAtPosition) >= 0) {
                    View view2 = (View) c0474f.m12420f(itemIdAtPosition, null);
                    if (view2 != null) {
                        ViewCompat.C0814d.m11747r(view2, false);
                        c0474f.m12419g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.C0814d.m11747r(view, true);
                c0474f.m12419g(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: p */
    public static C0470b<Animator, C1721b> m10003p() {
        ThreadLocal<C0470b<Animator, C1721b>> threadLocal = f4181w;
        C0470b<Animator, C1721b> c0470b = threadLocal.get();
        if (c0470b == null) {
            C0470b<Animator, C1721b> c0470b2 = new C0470b<>();
            threadLocal.set(c0470b2);
            return c0470b2;
        }
        return c0470b;
    }

    /* renamed from: u */
    public static boolean m10000u(C1766o c1766o, C1766o c1766o2, String str) {
        Object obj = c1766o.f4278a.get(str);
        Object obj2 = c1766o2.f4278a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    @NonNull
    /* renamed from: A */
    public void mo9982A(long j) {
        this.f4184c = j;
    }

    /* renamed from: B */
    public void mo9981B(@Nullable AbstractC1722c abstractC1722c) {
        this.f4200s = abstractC1722c;
    }

    @NonNull
    /* renamed from: C */
    public void mo9980C(@Nullable TimeInterpolator timeInterpolator) {
        this.f4185d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo9979D(@Nullable AbstractC1750f abstractC1750f) {
        if (abstractC1750f == null) {
            abstractC1750f = f4180v;
        }
        this.f4201t = abstractC1750f;
    }

    /* renamed from: E */
    public void mo9978E() {
    }

    @NonNull
    /* renamed from: F */
    public void mo9977F(long j) {
        this.f4183b = j;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: G */
    public final void m10010G() {
        if (this.f4195n == 0) {
            ArrayList<InterfaceC1723d> arrayList = this.f4198q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4198q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1723d) arrayList2.get(i)).mo9961d();
                }
            }
            this.f4197p = false;
        }
        this.f4195n++;
    }

    /* renamed from: H */
    public String mo9976H(String str) {
        StringBuilder m12383b = C0499a.m12383b(str);
        m12383b.append(getClass().getSimpleName());
        m12383b.append("@");
        m12383b.append(Integer.toHexString(hashCode()));
        m12383b.append(": ");
        String sb = m12383b.toString();
        if (this.f4184c != -1) {
            sb = C0017a.m13071a(C0510h.m12339b(sb, "dur("), this.f4184c, ") ");
        }
        if (this.f4183b != -1) {
            sb = C0017a.m13071a(C0510h.m12339b(sb, "dly("), this.f4183b, ") ");
        }
        if (this.f4185d != null) {
            StringBuilder m12339b = C0510h.m12339b(sb, "interp(");
            m12339b.append(this.f4185d);
            m12339b.append(") ");
            sb = m12339b.toString();
        }
        ArrayList<Integer> arrayList = this.f4186e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4187f;
        if (size > 0 || arrayList2.size() > 0) {
            String m13053a = C0063d.m13053a(sb, "tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        m13053a = C0063d.m13053a(m13053a, ", ");
                    }
                    StringBuilder m12383b2 = C0499a.m12383b(m13053a);
                    m12383b2.append(arrayList.get(i));
                    m13053a = m12383b2.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        m13053a = C0063d.m13053a(m13053a, ", ");
                    }
                    StringBuilder m12383b3 = C0499a.m12383b(m13053a);
                    m12383b3.append(arrayList2.get(i2));
                    m13053a = m12383b3.toString();
                }
            }
            return C0063d.m13053a(m13053a, ")");
        }
        return sb;
    }

    @NonNull
    /* renamed from: a */
    public void mo9974a(@NonNull InterfaceC1723d interfaceC1723d) {
        if (this.f4198q == null) {
            this.f4198q = new ArrayList<>();
        }
        this.f4198q.add(interfaceC1723d);
    }

    @NonNull
    /* renamed from: b */
    public void mo9973b(@NonNull View view) {
        this.f4187f.add(view);
    }

    /* renamed from: d */
    public abstract void mo9972d(@NonNull C1766o c1766o);

    /* renamed from: f */
    public final void m10008f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1766o c1766o = new C1766o(view);
            if (z) {
                mo9970h(c1766o);
            } else {
                mo9972d(c1766o);
            }
            c1766o.f4280c.add(this);
            mo9971g(c1766o);
            m10009c(z ? this.f4188g : this.f4189h, view, c1766o);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m10008f(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: g */
    public void mo9971g(C1766o c1766o) {
    }

    /* renamed from: h */
    public abstract void mo9970h(@NonNull C1766o c1766o);

    /* renamed from: i */
    public final void m10007i(ViewGroup viewGroup, boolean z) {
        m10006j(z);
        ArrayList<Integer> arrayList = this.f4186e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4187f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m10008f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (findViewById != null) {
                C1766o c1766o = new C1766o(findViewById);
                if (z) {
                    mo9970h(c1766o);
                } else {
                    mo9972d(c1766o);
                }
                c1766o.f4280c.add(this);
                mo9971g(c1766o);
                m10009c(z ? this.f4188g : this.f4189h, findViewById, c1766o);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            C1766o c1766o2 = new C1766o(view);
            if (z) {
                mo9970h(c1766o2);
            } else {
                mo9972d(c1766o2);
            }
            c1766o2.f4280c.add(this);
            mo9971g(c1766o2);
            m10009c(z ? this.f4188g : this.f4189h, view, c1766o2);
        }
    }

    /* renamed from: j */
    public final void m10006j(boolean z) {
        C1767p c1767p;
        if (z) {
            this.f4188g.f4281a.clear();
            this.f4188g.f4282b.clear();
            c1767p = this.f4188g;
        } else {
            this.f4189h.f4281a.clear();
            this.f4189h.f4282b.clear();
            c1767p = this.f4189h;
        }
        c1767p.f4283c.m12423b();
    }

    @Override // 
    /* renamed from: k */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f4199r = new ArrayList<>();
            transition.f4188g = new C1767p();
            transition.f4189h = new C1767p();
            transition.f4192k = null;
            transition.f4193l = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: l */
    public Animator mo9994l(@NonNull ViewGroup viewGroup, @Nullable C1766o c1766o, @Nullable C1766o c1766o2) {
        return null;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public void mo9968m(ViewGroup viewGroup, C1767p c1767p, C1767p c1767p2, ArrayList<C1766o> arrayList, ArrayList<C1766o> arrayList2) {
        boolean z;
        Animator mo9994l;
        View view;
        Animator animator;
        C1766o c1766o;
        Animator animator2;
        C1766o c1766o2;
        ViewGroup viewGroup2 = viewGroup;
        C0470b<Animator, C1721b> m10003p = m10003p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1766o c1766o3 = arrayList.get(i);
            C1766o c1766o4 = arrayList2.get(i);
            if (c1766o3 != null && !c1766o3.f4280c.contains(this)) {
                c1766o3 = null;
            }
            if (c1766o4 != null && !c1766o4.f4280c.contains(this)) {
                c1766o4 = null;
            }
            if (c1766o3 != null || c1766o4 != null) {
                if (c1766o3 != null && c1766o4 != null && !mo9997s(c1766o3, c1766o4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (mo9994l = mo9994l(viewGroup2, c1766o3, c1766o4)) != null) {
                    if (c1766o4 != null) {
                        String[] mo9993q = mo9993q();
                        view = c1766o4.f4279b;
                        if (mo9993q != null && mo9993q.length > 0) {
                            c1766o2 = new C1766o(view);
                            C1766o orDefault = c1767p2.f4281a.getOrDefault(view, null);
                            if (orDefault != null) {
                                int i2 = 0;
                                while (i2 < mo9993q.length) {
                                    HashMap hashMap = c1766o2.f4278a;
                                    Animator animator3 = mo9994l;
                                    String str = mo9993q[i2];
                                    hashMap.put(str, orDefault.f4278a.get(str));
                                    i2++;
                                    mo9994l = animator3;
                                    mo9993q = mo9993q;
                                }
                            }
                            Animator animator4 = mo9994l;
                            int i3 = m10003p.f1531c;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    C1721b orDefault2 = m10003p.getOrDefault(m10003p.m12398h(i4), null);
                                    if (orDefault2.f4204c != null && orDefault2.f4202a == view && orDefault2.f4203b.equals(this.f4182a) && orDefault2.f4204c.equals(c1766o2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = mo9994l;
                            c1766o2 = null;
                        }
                        animator = animator2;
                        c1766o = c1766o2;
                    } else {
                        view = c1766o3.f4279b;
                        animator = mo9994l;
                        c1766o = null;
                    }
                    if (animator != null) {
                        String str2 = this.f4182a;
                        C1740c0 c1740c0 = C1770s.f4286a;
                        m10003p.put(animator, new C1721b(view, str2, this, new C1753g0(viewGroup2), c1766o));
                        this.f4199r.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.f4199r.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public final void m10005n() {
        int i = this.f4195n - 1;
        this.f4195n = i;
        if (i == 0) {
            ArrayList<InterfaceC1723d> arrayList = this.f4198q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4198q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1723d) arrayList2.get(i2)).mo9962c(this);
                }
            }
            int i3 = 0;
            while (true) {
                C0474f<View> c0474f = this.f4188g.f4283c;
                if (c0474f.f1506a) {
                    c0474f.m12421d();
                }
                if (i3 >= c0474f.f1509d) {
                    break;
                }
                View m12418h = this.f4188g.f4283c.m12418h(i3);
                if (m12418h != null) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11747r(m12418h, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C0474f<View> c0474f2 = this.f4189h.f4283c;
                if (c0474f2.f1506a) {
                    c0474f2.m12421d();
                }
                if (i4 < c0474f2.f1509d) {
                    View m12418h2 = this.f4189h.f4283c.m12418h(i4);
                    if (m12418h2 != null) {
                        WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                        ViewCompat.C0814d.m11747r(m12418h2, false);
                    }
                    i4++;
                } else {
                    this.f4197p = true;
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final C1766o m10004o(View view, boolean z) {
        C1761l c1761l = this.f4190i;
        if (c1761l != null) {
            return c1761l.m10004o(view, z);
        }
        ArrayList<C1766o> arrayList = z ? this.f4192k : this.f4193l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C1766o c1766o = arrayList.get(i);
            if (c1766o == null) {
                return null;
            }
            if (c1766o.f4279b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.f4193l : this.f4192k).get(i);
        }
        return null;
    }

    @Nullable
    /* renamed from: q */
    public String[] mo9993q() {
        return null;
    }

    @Nullable
    /* renamed from: r */
    public final C1766o m10002r(@NonNull View view, boolean z) {
        C1767p c1767p;
        C1761l c1761l = this.f4190i;
        if (c1761l != null) {
            return c1761l.m10002r(view, z);
        }
        if (z) {
            c1767p = this.f4188g;
        } else {
            c1767p = this.f4189h;
        }
        return c1767p.f4281a.getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo9997s(@Nullable C1766o c1766o, @Nullable C1766o c1766o2) {
        if (c1766o == null || c1766o2 == null) {
            return false;
        }
        String[] mo9993q = mo9993q();
        if (mo9993q == null) {
            for (String str : c1766o.f4278a.keySet()) {
                if (m10000u(c1766o, c1766o2, str)) {
                }
            }
            return false;
        }
        for (String str2 : mo9993q) {
            if (!m10000u(c1766o, c1766o2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    public final boolean m10001t(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f4186e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4187f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo9976H("");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: v */
    public void mo9967v(View view) {
        int i;
        if (!this.f4197p) {
            C0470b<Animator, C1721b> m10003p = m10003p();
            int i2 = m10003p.f1531c;
            C1740c0 c1740c0 = C1770s.f4286a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C1721b m12397l = m10003p.m12397l(i3);
                if (m12397l.f4202a != null) {
                    InterfaceC1755h0 interfaceC1755h0 = m12397l.f4205d;
                    if ((interfaceC1755h0 instanceof C1753g0) && ((C1753g0) interfaceC1755h0).f4257a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        m10003p.m12398h(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<InterfaceC1723d> arrayList = this.f4198q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4198q.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((InterfaceC1723d) arrayList2.get(i)).mo9987a();
                    i++;
                }
            }
            this.f4196o = true;
        }
    }

    @NonNull
    /* renamed from: w */
    public void mo9966w(@NonNull InterfaceC1723d interfaceC1723d) {
        ArrayList<InterfaceC1723d> arrayList = this.f4198q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC1723d);
        if (this.f4198q.size() == 0) {
            this.f4198q = null;
        }
    }

    @NonNull
    /* renamed from: x */
    public void mo9965x(@NonNull View view) {
        this.f4187f.remove(view);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: y */
    public void mo9964y(ViewGroup viewGroup) {
        boolean z;
        if (this.f4196o) {
            if (!this.f4197p) {
                C0470b<Animator, C1721b> m10003p = m10003p();
                int i = m10003p.f1531c;
                C1740c0 c1740c0 = C1770s.f4286a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C1721b m12397l = m10003p.m12397l(i2);
                    if (m12397l.f4202a != null) {
                        InterfaceC1755h0 interfaceC1755h0 = m12397l.f4205d;
                        if ((interfaceC1755h0 instanceof C1753g0) && ((C1753g0) interfaceC1755h0).f4257a.equals(windowId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            m10003p.m12398h(i2).resume();
                        }
                    }
                }
                ArrayList<InterfaceC1723d> arrayList = this.f4198q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4198q.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((InterfaceC1723d) arrayList2.get(i3)).mo9985e();
                    }
                }
            }
            this.f4196o = false;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: z */
    public void mo9963z() {
        m10010G();
        C0470b<Animator, C1721b> m10003p = m10003p();
        Iterator<Animator> it = this.f4199r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m10003p.containsKey(next)) {
                m10010G();
                if (next != null) {
                    next.addListener(new C1754h(this, m10003p));
                    long j = this.f4184c;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f4183b;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f4185d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C1756i(this));
                    next.start();
                }
            }
        }
        this.f4199r.clear();
        m10005n();
    }
}

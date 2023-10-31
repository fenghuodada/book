package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.C0510h;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.l */
/* loaded from: classes.dex */
public class C1761l extends Transition {

    /* renamed from: z */
    public int f4272z;

    /* renamed from: x */
    public ArrayList<Transition> f4270x = new ArrayList<>();

    /* renamed from: y */
    public boolean f4271y = true;

    /* renamed from: A */
    public boolean f4268A = false;

    /* renamed from: B */
    public int f4269B = 0;

    /* renamed from: androidx.transition.l$a */
    /* loaded from: classes.dex */
    public class C1762a extends C1757j {

        /* renamed from: a */
        public final /* synthetic */ Transition f4273a;

        public C1762a(Transition transition) {
            this.f4273a = transition;
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            this.f4273a.mo9963z();
            transition.mo9966w(this);
        }
    }

    /* renamed from: androidx.transition.l$b */
    /* loaded from: classes.dex */
    public static class C1763b extends C1757j {

        /* renamed from: a */
        public final C1761l f4274a;

        public C1763b(C1761l c1761l) {
            this.f4274a = c1761l;
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            C1761l c1761l = this.f4274a;
            int i = c1761l.f4272z - 1;
            c1761l.f4272z = i;
            if (i == 0) {
                c1761l.f4268A = false;
                c1761l.m10005n();
            }
            transition.mo9966w(this);
        }

        @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
        /* renamed from: d */
        public final void mo9961d() {
            C1761l c1761l = this.f4274a;
            if (c1761l.f4268A) {
                return;
            }
            c1761l.m10010G();
            c1761l.f4268A = true;
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: A */
    public final void mo9982A(long j) {
        ArrayList<Transition> arrayList;
        this.f4184c = j;
        if (j >= 0 && (arrayList = this.f4270x) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4270x.get(i).mo9982A(j);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: B */
    public final void mo9981B(Transition.AbstractC1722c abstractC1722c) {
        this.f4200s = abstractC1722c;
        this.f4269B |= 8;
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            this.f4270x.get(i).mo9981B(abstractC1722c);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: C */
    public final void mo9980C(@Nullable TimeInterpolator timeInterpolator) {
        this.f4269B |= 1;
        ArrayList<Transition> arrayList = this.f4270x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4270x.get(i).mo9980C(timeInterpolator);
            }
        }
        this.f4185d = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    /* renamed from: D */
    public final void mo9979D(AbstractC1750f abstractC1750f) {
        super.mo9979D(abstractC1750f);
        this.f4269B |= 4;
        if (this.f4270x != null) {
            for (int i = 0; i < this.f4270x.size(); i++) {
                this.f4270x.get(i).mo9979D(abstractC1750f);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: E */
    public final void mo9978E() {
        this.f4269B |= 2;
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            this.f4270x.get(i).mo9978E();
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: F */
    public final void mo9977F(long j) {
        this.f4183b = j;
    }

    @Override // androidx.transition.Transition
    /* renamed from: H */
    public final String mo9976H(String str) {
        String mo9976H = super.mo9976H(str);
        for (int i = 0; i < this.f4270x.size(); i++) {
            StringBuilder m12339b = C0510h.m12339b(mo9976H, "\n");
            m12339b.append(this.f4270x.get(i).mo9976H(str + "  "));
            mo9976H = m12339b.toString();
        }
        return mo9976H;
    }

    @NonNull
    /* renamed from: I */
    public final void m9975I(@NonNull Transition transition) {
        this.f4270x.add(transition);
        transition.f4190i = this;
        long j = this.f4184c;
        if (j >= 0) {
            transition.mo9982A(j);
        }
        if ((this.f4269B & 1) != 0) {
            transition.mo9980C(this.f4185d);
        }
        if ((this.f4269B & 2) != 0) {
            transition.mo9978E();
        }
        if ((this.f4269B & 4) != 0) {
            transition.mo9979D(this.f4201t);
        }
        if ((this.f4269B & 8) != 0) {
            transition.mo9981B(this.f4200s);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: a */
    public final void mo9974a(@NonNull Transition.InterfaceC1723d interfaceC1723d) {
        super.mo9974a(interfaceC1723d);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: b */
    public final void mo9973b(@NonNull View view) {
        for (int i = 0; i < this.f4270x.size(); i++) {
            this.f4270x.get(i).mo9973b(view);
        }
        this.f4187f.add(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: d */
    public final void mo9972d(@NonNull C1766o c1766o) {
        View view = c1766o.f4279b;
        if (m10001t(view)) {
            Iterator<Transition> it = this.f4270x.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m10001t(view)) {
                    next.mo9972d(c1766o);
                    c1766o.f4280c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: g */
    public final void mo9971g(C1766o c1766o) {
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            this.f4270x.get(i).mo9971g(c1766o);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public final void mo9970h(@NonNull C1766o c1766o) {
        View view = c1766o.f4279b;
        if (m10001t(view)) {
            Iterator<Transition> it = this.f4270x.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m10001t(view)) {
                    next.mo9970h(c1766o);
                    c1766o.f4280c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public final Transition clone() {
        C1761l c1761l = (C1761l) super.clone();
        c1761l.f4270x = new ArrayList<>();
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            Transition clone = this.f4270x.get(i).clone();
            c1761l.f4270x.add(clone);
            clone.f4190i = c1761l;
        }
        return c1761l;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public final void mo9968m(ViewGroup viewGroup, C1767p c1767p, C1767p c1767p2, ArrayList<C1766o> arrayList, ArrayList<C1766o> arrayList2) {
        long j = this.f4183b;
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f4270x.get(i);
            if (j > 0 && (this.f4271y || i == 0)) {
                long j2 = transition.f4183b;
                if (j2 > 0) {
                    transition.mo9977F(j2 + j);
                } else {
                    transition.mo9977F(j);
                }
            }
            transition.mo9968m(viewGroup, c1767p, c1767p2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: v */
    public final void mo9967v(View view) {
        super.mo9967v(view);
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            this.f4270x.get(i).mo9967v(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: w */
    public final void mo9966w(@NonNull Transition.InterfaceC1723d interfaceC1723d) {
        super.mo9966w(interfaceC1723d);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: x */
    public final void mo9965x(@NonNull View view) {
        for (int i = 0; i < this.f4270x.size(); i++) {
            this.f4270x.get(i).mo9965x(view);
        }
        this.f4187f.remove(view);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: y */
    public final void mo9964y(ViewGroup viewGroup) {
        super.mo9964y(viewGroup);
        int size = this.f4270x.size();
        for (int i = 0; i < size; i++) {
            this.f4270x.get(i).mo9964y(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: z */
    public final void mo9963z() {
        if (this.f4270x.isEmpty()) {
            m10010G();
            m10005n();
            return;
        }
        C1763b c1763b = new C1763b(this);
        Iterator<Transition> it = this.f4270x.iterator();
        while (it.hasNext()) {
            it.next().mo9974a(c1763b);
        }
        this.f4272z = this.f4270x.size();
        if (!this.f4271y) {
            for (int i = 1; i < this.f4270x.size(); i++) {
                this.f4270x.get(i - 1).mo9974a(new C1762a(this.f4270x.get(i)));
            }
            Transition transition = this.f4270x.get(0);
            if (transition != null) {
                transition.mo9963z();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.f4270x.iterator();
        while (it2.hasNext()) {
            it2.next().mo9963z();
        }
    }
}

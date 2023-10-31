package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.transition.e */
/* loaded from: classes.dex */
public class C1744e extends FragmentTransitionImpl {

    /* renamed from: androidx.transition.e$a */
    /* loaded from: classes.dex */
    public class C1745a extends Transition.AbstractC1722c {
    }

    /* renamed from: androidx.transition.e$b */
    /* loaded from: classes.dex */
    public class C1746b implements Transition.InterfaceC1723d {

        /* renamed from: a */
        public final /* synthetic */ View f4242a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4243b;

        public C1746b(View view, ArrayList arrayList) {
            this.f4242a = view;
            this.f4243b = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: a */
        public final void mo9987a() {
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: b */
        public final void mo9986b() {
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            transition.mo9966w(this);
            this.f4242a.setVisibility(8);
            ArrayList arrayList = this.f4243b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: d */
        public final void mo9961d() {
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: e */
        public final void mo9985e() {
        }
    }

    /* renamed from: androidx.transition.e$c */
    /* loaded from: classes.dex */
    public class C1747c extends C1757j {

        /* renamed from: a */
        public final /* synthetic */ Object f4244a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f4245b;

        /* renamed from: c */
        public final /* synthetic */ Object f4246c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f4247d;

        /* renamed from: e */
        public final /* synthetic */ Object f4248e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f4249f;

        public C1747c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4244a = obj;
            this.f4245b = arrayList;
            this.f4246c = obj2;
            this.f4247d = arrayList2;
            this.f4248e = obj3;
            this.f4249f = arrayList3;
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            transition.mo9966w(this);
        }

        @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
        /* renamed from: d */
        public final void mo9961d() {
            C1744e c1744e = C1744e.this;
            Object obj = this.f4244a;
            if (obj != null) {
                c1744e.replaceTargets(obj, this.f4245b, null);
            }
            Object obj2 = this.f4246c;
            if (obj2 != null) {
                c1744e.replaceTargets(obj2, this.f4247d, null);
            }
            Object obj3 = this.f4248e;
            if (obj3 != null) {
                c1744e.replaceTargets(obj3, this.f4249f, null);
            }
        }
    }

    /* renamed from: androidx.transition.e$d */
    /* loaded from: classes.dex */
    public class C1748d extends Transition.AbstractC1722c {
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo9973b(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTargets(Object obj, ArrayList<View> arrayList) {
        boolean z;
        Transition transition;
        Transition transition2 = (Transition) obj;
        if (transition2 == null) {
            return;
        }
        int i = 0;
        if (transition2 instanceof C1761l) {
            C1761l c1761l = (C1761l) transition2;
            int size = c1761l.f4270x.size();
            while (i < size) {
                if (i >= 0 && i < c1761l.f4270x.size()) {
                    transition = c1761l.f4270x.get(i);
                } else {
                    transition = null;
                }
                addTargets(transition, arrayList);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.isNullOrEmpty(transition2.f4186e) && FragmentTransitionImpl.isNullOrEmpty(null) && FragmentTransitionImpl.isNullOrEmpty(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && FragmentTransitionImpl.isNullOrEmpty(transition2.f4187f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition2.mo9973b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C1758k.m9984a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean canHandle(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            C1761l c1761l = new C1761l();
            c1761l.m9975I(transition);
            c1761l.m9975I(transition2);
            c1761l.f4271y = false;
            transition = c1761l;
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            C1761l c1761l2 = new C1761l();
            if (transition != null) {
                c1761l2.m9975I(transition);
            }
            c1761l2.m9975I(transition3);
            return c1761l2;
        }
        return transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C1761l c1761l = new C1761l();
        if (obj != null) {
            c1761l.m9975I((Transition) obj);
        }
        if (obj2 != null) {
            c1761l.m9975I((Transition) obj2);
        }
        if (obj3 != null) {
            c1761l.m9975I((Transition) obj3);
        }
        return c1761l;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo9965x(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z;
        int size;
        Transition transition;
        Transition transition2 = (Transition) obj;
        int i = 0;
        if (transition2 instanceof C1761l) {
            C1761l c1761l = (C1761l) transition2;
            int size2 = c1761l.f4270x.size();
            while (i < size2) {
                if (i >= 0 && i < c1761l.f4270x.size()) {
                    transition = c1761l.f4270x.get(i);
                } else {
                    transition = null;
                }
                replaceTargets(transition, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.isNullOrEmpty(transition2.f4186e) && FragmentTransitionImpl.isNullOrEmpty(null) && FragmentTransitionImpl.isNullOrEmpty(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ArrayList<View> arrayList3 = transition2.f4187f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    transition2.mo9973b(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        transition2.mo9965x(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo9974a(new C1746b(view, arrayList));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo9974a(new C1747c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo9981B(new C1748d());
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(Object obj, View view) {
        if (view != null) {
            getBoundsOnScreen(view, new Rect());
            ((Transition) obj).mo9981B(new C1745a());
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        C1761l c1761l = (C1761l) obj;
        ArrayList<View> arrayList2 = c1761l.f4187f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.bfsAddViewChildren(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        addTargets(c1761l, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1761l c1761l = (C1761l) obj;
        if (c1761l != null) {
            ArrayList<View> arrayList3 = c1761l.f4187f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            replaceTargets(c1761l, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        C1761l c1761l = new C1761l();
        c1761l.m9975I((Transition) obj);
        return c1761l;
    }
}

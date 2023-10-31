package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: androidx.transition.k */
/* loaded from: classes.dex */
public final class C1758k {

    /* renamed from: a */
    public static final C1726a f4261a = new C1726a();

    /* renamed from: b */
    public static final ThreadLocal<WeakReference<C0470b<ViewGroup, ArrayList<Transition>>>> f4262b = new ThreadLocal<>();

    /* renamed from: c */
    public static final ArrayList<ViewGroup> f4263c = new ArrayList<>();

    /* renamed from: androidx.transition.k$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC1759a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final Transition f4264a;

        /* renamed from: b */
        public final ViewGroup f4265b;

        /* renamed from: androidx.transition.k$a$a */
        /* loaded from: classes.dex */
        public class C1760a extends C1757j {

            /* renamed from: a */
            public final /* synthetic */ C0470b f4266a;

            public C1760a(C0470b c0470b) {
                this.f4266a = c0470b;
            }

            @Override // androidx.transition.Transition.InterfaceC1723d
            /* renamed from: c */
            public final void mo9962c(@NonNull Transition transition) {
                ((ArrayList) this.f4266a.getOrDefault(ViewTreeObserver$OnPreDrawListenerC1759a.this.f4265b, null)).remove(transition);
                transition.mo9966w(this);
            }
        }

        public ViewTreeObserver$OnPreDrawListenerC1759a(ViewGroup viewGroup, Transition transition) {
            this.f4264a = transition;
            this.f4265b = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01dc A[EDGE_INSN: B:148:0x01dc->B:95:0x01dc ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01e3  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 692
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1758k.ViewTreeObserver$OnPreDrawListenerC1759a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f4265b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            C1758k.f4263c.remove(viewGroup);
            ArrayList<Transition> orDefault = C1758k.m9983b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo9964y(viewGroup);
                }
            }
            this.f4264a.m10006j(true);
        }
    }

    /* renamed from: a */
    public static void m9984a(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        ArrayList<ViewGroup> arrayList = f4263c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11729c(viewGroup)) {
                arrayList.add(viewGroup);
                if (transition == null) {
                    transition = f4261a;
                }
                Transition clone = transition.clone();
                ArrayList<Transition> orDefault = m9983b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<Transition> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().mo9967v(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.m10007i(viewGroup, true);
                }
                if (((C1752g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        ViewTreeObserver$OnPreDrawListenerC1759a viewTreeObserver$OnPreDrawListenerC1759a = new ViewTreeObserver$OnPreDrawListenerC1759a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1759a);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1759a);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: b */
    public static C0470b<ViewGroup, ArrayList<Transition>> m9983b() {
        C0470b<ViewGroup, ArrayList<Transition>> c0470b;
        ThreadLocal<WeakReference<C0470b<ViewGroup, ArrayList<Transition>>>> threadLocal = f4262b;
        WeakReference<C0470b<ViewGroup, ArrayList<Transition>>> weakReference = threadLocal.get();
        if (weakReference == null || (c0470b = weakReference.get()) == null) {
            C0470b<ViewGroup, ArrayList<Transition>> c0470b2 = new C0470b<>();
            threadLocal.set(new WeakReference<>(c0470b2));
            return c0470b2;
        }
        return c0470b;
    }
}

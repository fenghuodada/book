package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.widget.C1078c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C7840k;
import com.google.android.material.snackbar.C7844o;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {

    /* renamed from: a */
    public C1078c f14389a;

    /* renamed from: b */
    public InterfaceC7586b f14390b;

    /* renamed from: c */
    public boolean f14391c;

    /* renamed from: d */
    public boolean f14392d;

    /* renamed from: e */
    public int f14393e = 2;

    /* renamed from: f */
    public final float f14394f = 0.5f;

    /* renamed from: g */
    public float f14395g = 0.0f;

    /* renamed from: h */
    public float f14396h = 0.5f;

    /* renamed from: i */
    public final C7585a f14397i = new C7585a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes3.dex */
    public class C7585a extends C1078c.AbstractC1081c {

        /* renamed from: a */
        public int f14398a;

        /* renamed from: b */
        public int f14399b = -1;

        public C7585a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            if (r0 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
            r0 = r3.f14398a;
            r4 = r4.getWidth() + r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
            r0 = r3.f14398a - r4.getWidth();
            r4 = r3.f14398a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L11;
         */
        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo4436a(@androidx.annotation.NonNull android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r0 = androidx.core.view.ViewCompat.f2518a
                int r0 = androidx.core.view.ViewCompat.C0815e.m11742d(r4)
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = r1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f14393e
                if (r2 != 0) goto L15
                if (r0 == 0) goto L19
                goto L21
            L15:
                if (r2 != r1) goto L2b
                if (r0 == 0) goto L21
            L19:
                int r0 = r3.f14398a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L39
            L21:
                int r0 = r3.f14398a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f14398a
                goto L39
            L2b:
                int r0 = r3.f14398a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f14398a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L39:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C7585a.mo4436a(android.view.View, int):int");
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: b */
        public final int mo4435b(@NonNull View view, int i) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: c */
        public final int mo4434c(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: e */
        public final void mo4768e(int i, @NonNull View view) {
            this.f14399b = i;
            this.f14398a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f14392d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f14392d = false;
            }
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: f */
        public final void mo4433f(int i) {
            InterfaceC7586b interfaceC7586b = SwipeDismissBehavior.this.f14390b;
            if (interfaceC7586b != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((C7840k) interfaceC7586b).f15385a;
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        C7844o.m4413b().m4411d(baseTransientBottomBar.f15352t);
                        return;
                    }
                    return;
                }
                C7844o m4413b = C7844o.m4413b();
                BaseTransientBottomBar.C7826c c7826c = baseTransientBottomBar.f15352t;
                synchronized (m4413b.f15389a) {
                    if (m4413b.m4412c(c7826c)) {
                        C7844o.C7847c c7847c = m4413b.f15391c;
                        if (c7847c.f15396c) {
                            c7847c.f15396c = false;
                            m4413b.m4409f(c7847c);
                        }
                    }
                }
            }
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: g */
        public final void mo4432g(@NonNull View view, int i, int i2) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = view.getWidth() * swipeDismissBehavior.f14395g;
            float width2 = view.getWidth() * swipeDismissBehavior.f14396h;
            float abs = Math.abs(i - this.f14398a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f14398a) >= java.lang.Math.round(r9.getWidth() * r3.f14394f)) goto L39;
         */
        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo4431h(@androidx.annotation.NonNull android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f14399b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r5 = androidx.core.view.ViewCompat.f2518a
                int r5 = androidx.core.view.ViewCompat.C0815e.m11742d(r9)
                if (r5 != r2) goto L1a
                r5 = r2
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r3.f14393e
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L2a:
                if (r1 <= 0) goto L54
                goto L52
            L2d:
                if (r6 != r2) goto L54
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L54
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f14398a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f14394f
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L54
            L52:
                r1 = r2
                goto L55
            L54:
                r1 = r4
            L55:
                if (r1 == 0) goto L6b
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L66
                int r10 = r9.getLeft()
                int r0 = r8.f14398a
                if (r10 >= r0) goto L64
                goto L66
            L64:
                int r0 = r0 + r11
                goto L6e
            L66:
                int r10 = r8.f14398a
                int r0 = r10 - r11
                goto L6e
            L6b:
                int r0 = r8.f14398a
                r2 = r4
            L6e:
                androidx.customview.widget.c r10 = r3.f14389a
                int r11 = r9.getTop()
                boolean r10 = r10.m11207q(r0, r11)
                if (r10 == 0) goto L85
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r11 = androidx.core.view.ViewCompat.f2518a
                androidx.core.view.ViewCompat.C0814d.m11752m(r9, r10)
                goto L90
            L85:
                if (r2 == 0) goto L90
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r3.f14390b
                if (r10 == 0) goto L90
                com.google.android.material.snackbar.k r10 = (com.google.android.material.snackbar.C7840k) r10
                r10.m4415a(r9)
            L90:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C7585a.mo4431h(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: i */
        public final boolean mo4430i(int i, View view) {
            int i2 = this.f14399b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo4420t(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7586b {
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes3.dex */
    public class RunnableC7587c implements Runnable {

        /* renamed from: a */
        public final View f14401a;

        /* renamed from: b */
        public final boolean f14402b;

        public RunnableC7587c(View view, boolean z) {
            this.f14401a = view;
            this.f14402b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC7586b interfaceC7586b;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            C1078c c1078c = swipeDismissBehavior.f14389a;
            View view = this.f14401a;
            if (c1078c != null && c1078c.m11217g()) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11752m(view, this);
            } else if (this.f14402b && (interfaceC7586b = swipeDismissBehavior.f14390b) != null) {
                ((C7840k) interfaceC7586b).m4415a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.f14391c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f14391c = false;
            }
        } else {
            z = coordinatorLayout.m12120i(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f14391c = z;
        }
        if (!z) {
            return false;
        }
        if (this.f14389a == null) {
            this.f14389a = new C1078c(coordinatorLayout.getContext(), coordinatorLayout, this.f14397i);
        }
        if (!this.f14392d && this.f14389a.m11206r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11762c(v) == 0) {
            ViewCompat.C0814d.m11746s(v, 1);
            ViewCompat.m11774k(1048576, v);
            ViewCompat.m11777h(0, v);
            if (mo4420t(v)) {
                ViewCompat.m11773l(v, C0874o.C0875a.f2614j, new C7588a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    public final boolean mo2597s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f14389a != null) {
            if (this.f14392d && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.f14389a.m11213k(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo4420t(@NonNull View view) {
        return true;
    }
}

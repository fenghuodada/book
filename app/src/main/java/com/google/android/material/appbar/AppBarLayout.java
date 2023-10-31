package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.C0158a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.math.C0728a;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0905d0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7556a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0587b {

    /* renamed from: a */
    public int f14301a;

    /* renamed from: b */
    public int f14302b;

    /* renamed from: c */
    public int f14303c;

    /* renamed from: d */
    public int f14304d;

    /* renamed from: e */
    public boolean f14305e;

    /* renamed from: f */
    public int f14306f;

    /* renamed from: g */
    public ArrayList f14307g;

    /* renamed from: h */
    public boolean f14308h;

    /* renamed from: i */
    public boolean f14309i;

    /* renamed from: j */
    public boolean f14310j;

    /* renamed from: k */
    public boolean f14311k;
    @IdRes

    /* renamed from: l */
    public int f14312l;
    @Nullable

    /* renamed from: m */
    public WeakReference<View> f14313m;
    @Nullable

    /* renamed from: n */
    public ValueAnimator f14314n;

    /* renamed from: o */
    public int[] f14315o;
    @Nullable

    /* renamed from: p */
    public Drawable f14316p;

    /* renamed from: q */
    public Behavior f14317q;

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC7577g<T> {

        /* renamed from: j */
        public int f14318j;

        /* renamed from: k */
        public int f14319k;

        /* renamed from: l */
        public ValueAnimator f14320l;

        /* renamed from: m */
        public C7566b f14321m;
        @Nullable

        /* renamed from: n */
        public WeakReference<View> f14322n;

        /* renamed from: o */
        public boolean f14323o;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes3.dex */
        public class C7565a extends C0851a {
            public C7565a() {
            }

            @Override // androidx.core.view.C0851a
            /* renamed from: d */
            public final void mo4308d(View view, @NonNull C0874o c0874o) {
                this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
                c0874o.m11548j(BaseBehavior.this.f14323o);
                c0874o.m11551g(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes3.dex */
        public static class C7566b extends AbstractC1068a {
            public static final Parcelable.Creator<C7566b> CREATOR = new C7567a();

            /* renamed from: c */
            public boolean f14325c;

            /* renamed from: d */
            public boolean f14326d;

            /* renamed from: e */
            public int f14327e;

            /* renamed from: f */
            public float f14328f;

            /* renamed from: g */
            public boolean f14329g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b$a */
            /* loaded from: classes3.dex */
            public class C7567a implements Parcelable.ClassLoaderCreator<C7566b> {
                @Override // android.os.Parcelable.Creator
                @Nullable
                public final Object createFromParcel(@NonNull Parcel parcel) {
                    return new C7566b(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public final Object[] newArray(int i) {
                    return new C7566b[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public final C7566b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new C7566b(parcel, classLoader);
                }
            }

            public C7566b(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f14325c = parcel.readByte() != 0;
                this.f14326d = parcel.readByte() != 0;
                this.f14327e = parcel.readInt();
                this.f14328f = parcel.readFloat();
                this.f14329g = parcel.readByte() != 0;
            }

            public C7566b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                parcel.writeParcelable(this.f2747a, i);
                parcel.writeByte(this.f14325c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f14326d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f14327e);
                parcel.writeFloat(this.f14328f);
                parcel.writeByte(this.f14329g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: D */
        public static void m4795D(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        @Nullable
        /* renamed from: E */
        public static View m4794E(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0905d0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m4789J(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.f14330a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r3 = androidx.core.view.ViewCompat.f2518a
                int r3 = androidx.core.view.ViewCompat.C0814d.m11761d(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.f14311k
                if (r10 == 0) goto L6b
                android.view.View r9 = m4794E(r7)
                boolean r9 = r8.m4798e(r9)
            L6b:
                boolean r9 = r8.m4799d(r9)
                if (r11 != 0) goto Lad
                if (r9 == 0) goto Lb0
                androidx.coordinatorlayout.widget.a<android.view.View> r9 = r7.f2193b
                androidx.collection.i<T, java.util.ArrayList<T>> r9 = r9.f2233b
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f2195d
                r7.clear()
                if (r9 == 0) goto L87
                r7.addAll(r9)
            L87:
                int r9 = r7.size()
                r10 = r2
            L8c:
                if (r10 >= r9) goto Lab
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0590e) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f2213a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto La8
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f14370f
                if (r7 == 0) goto Lab
                r2 = r0
                goto Lab
            La8:
                int r10 = r10 + 1
                goto L8c
            Lab:
                if (r2 == 0) goto Lb0
            Lad:
                r8.jumpDrawablesToCurrentState()
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m4789J(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo4784A(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r19, @androidx.annotation.NonNull android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 393
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo4784A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: C */
        public final void m4796C(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(mo4779y() - i);
            float abs2 = Math.abs(0.0f);
            float f = abs;
            if (abs2 > 0.0f) {
                height = Math.round((f / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((f / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int mo4779y = mo4779y();
            if (mo4779y == i) {
                ValueAnimator valueAnimator = this.f14320l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f14320l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f14320l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f14320l = valueAnimator3;
                valueAnimator3.setInterpolator(C7556a.f14286e);
                this.f14320l.addUpdateListener(new C7574d(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f14320l.setDuration(Math.min(height, 600));
            this.f14320l.setIntValues(mo4779y, i);
            this.f14320l.start();
        }

        /* renamed from: F */
        public final void m4793F(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    iArr[1] = mo4784A(coordinatorLayout, appBarLayout, mo4779y() - i, i4, i5);
                }
            }
            if (appBarLayout.f14311k) {
                appBarLayout.m4799d(appBarLayout.m4798e(view));
            }
        }

        @Nullable
        /* renamed from: G */
        public final C7566b m4792G(@Nullable Parcelable parcelable, @NonNull T t) {
            boolean z;
            boolean z2;
            int m4774t = m4774t();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + m4774t;
                if (childAt.getTop() + m4774t <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC1068a.f2746b;
                    }
                    C7566b c7566b = new C7566b(parcelable);
                    if (m4774t == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c7566b.f14326d = z;
                    if (!z && (-m4774t) >= t.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c7566b.f14325c = z2;
                    c7566b.f14327e = i;
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    if (bottom == t.getTopInset() + ViewCompat.C0814d.m11761d(childAt)) {
                        z3 = true;
                    }
                    c7566b.f14329g = z3;
                    c7566b.f14328f = bottom / childAt.getHeight();
                    return c7566b;
                }
            }
            return null;
        }

        /* renamed from: H */
        public final void m4791H(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int mo4779y = mo4779y() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i < childCount) {
                    View childAt = t.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if ((layoutParams.f14330a & 32) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    int i2 = -mo4779y;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f14330a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                        if (ViewCompat.C0814d.m11763b(t) && ViewCompat.C0814d.m11763b(childAt2)) {
                            i4 -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                        i5 += ViewCompat.C0814d.m11761d(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                            int m11761d = ViewCompat.C0814d.m11761d(childAt2) + i5;
                            if (mo4779y < m11761d) {
                                i4 = m11761d;
                            } else {
                                i5 = m11761d;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (mo4779y < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    m4796C(coordinatorLayout, t, C0728a.m11870a(i4 + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* renamed from: I */
        public final void m4790I(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            View view;
            boolean z;
            boolean z2;
            boolean z3;
            ViewCompat.m11774k(C0874o.C0875a.f2610f.m11546a(), coordinatorLayout);
            boolean z4 = false;
            ViewCompat.m11777h(0, coordinatorLayout);
            ViewCompat.m11774k(C0874o.C0875a.f2611g.m11546a(), coordinatorLayout);
            ViewCompat.m11777h(0, coordinatorLayout);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    view = coordinatorLayout.getChildAt(i);
                    if (((CoordinatorLayout.C0590e) view.getLayoutParams()).f2213a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 < childCount2) {
                    if (((LayoutParams) t.getChildAt(i2).getLayoutParams()).f14330a != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return;
            }
            if (ViewCompat.m11781d(coordinatorLayout) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                ViewCompat.m11771n(coordinatorLayout, new C7565a());
            }
            if (mo4779y() != (-t.getTotalScrollRange())) {
                ViewCompat.m11773l(coordinatorLayout, C0874o.C0875a.f2610f, new C7576f(t, false));
                z4 = true;
            }
            if (mo4779y() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i3 = -t.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        ViewCompat.m11773l(coordinatorLayout, C0874o.C0875a.f2611g, new C7575e(this, coordinatorLayout, t, view2, i3));
                    }
                } else {
                    ViewCompat.m11773l(coordinatorLayout, C0874o.C0875a.f2611g, new C7576f(t, true));
                }
                this.f14323o = z;
            }
            z = z4;
            this.f14323o = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.material.appbar.b] */
        @Override // com.google.android.material.appbar.C7580i, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: h */
        public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            boolean z;
            int i2;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo2724h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            C7566b c7566b = this.f14321m;
            if (c7566b != null && (pendingAction & 8) == 0) {
                if (c7566b.f14325c) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    m4783B(coordinatorLayout, appBarLayout, i2);
                } else {
                    if (!c7566b.f14326d) {
                        View childAt = appBarLayout.getChildAt(c7566b.f14327e);
                        int i3 = -childAt.getBottom();
                        if (this.f14321m.f14329g) {
                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                            round = appBarLayout.getTopInset() + ViewCompat.C0814d.m11761d(childAt) + i3;
                        } else {
                            round = Math.round(childAt.getHeight() * this.f14321m.f14328f) + i3;
                        }
                        m4783B(coordinatorLayout, appBarLayout, round);
                    }
                    m4783B(coordinatorLayout, appBarLayout, 0);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m4796C(coordinatorLayout, appBarLayout, i2);
                    }
                    m4783B(coordinatorLayout, appBarLayout, i2);
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m4796C(coordinatorLayout, appBarLayout, 0);
                    }
                    m4783B(coordinatorLayout, appBarLayout, 0);
                }
            }
            appBarLayout.f14306f = 0;
            this.f14321m = null;
            int m11870a = C0728a.m11870a(m4774t(), -appBarLayout.getTotalScrollRange(), 0);
            C7581j c7581j = this.f14371a;
            if (c7581j != null) {
                if (c7581j.f14376d != m11870a) {
                    c7581j.f14376d = m11870a;
                    c7581j.m4772a();
                }
            } else {
                this.f14372b = m11870a;
            }
            m4789J(coordinatorLayout, appBarLayout, m4774t(), 0, true);
            appBarLayout.m4800c(m4774t());
            m4790I(coordinatorLayout, appBarLayout);
            final View m4794E = m4794E(coordinatorLayout);
            if (m4794E != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    m4794E.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.b
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = m4794E;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.m4795D(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    m4794E.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.c
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i4, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.m4795D(keyEvent, m4794E, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: i */
        public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0590e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m12117r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: k */
        public final /* bridge */ /* synthetic */ void mo2728k(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            m4793F(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: m */
        public final void mo4745m(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = mo4784A(coordinatorLayout, appBarLayout, mo4779y() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m4790I(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: o */
        public final void mo4441o(@NonNull View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof C7566b) {
                C7566b c7566b = this.f14321m;
                this.f14321m = (C7566b) parcelable;
                return;
            }
            this.f14321m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: p */
        public final Parcelable mo4440p(@NonNull View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            C7566b m4792G = m4792G(absSavedState, (AppBarLayout) view);
            if (m4792G != null) {
                return m4792G;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean mo2598q(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f14311k
                r0 = 1
                if (r5 != 0) goto L2b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r0
                goto L15
            L14:
                r5 = r6
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r0
                goto L29
            L28:
                r2 = r6
            L29:
                if (r2 == 0) goto L2c
            L2b:
                r6 = r0
            L2c:
                if (r6 == 0) goto L35
                android.animation.ValueAnimator r2 = r1.f14320l
                if (r2 == 0) goto L35
                r2.cancel()
            L35:
                r2 = 0
                r1.f14322n = r2
                r1.f14319k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo2598q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: r */
        public final void mo4744r(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f14319k == 0 || i == 1) {
                m4791H(coordinatorLayout, appBarLayout);
                if (appBarLayout.f14311k) {
                    appBarLayout.m4799d(appBarLayout.m4798e(view2));
                }
            }
            this.f14322n = new WeakReference<>(view2);
        }

        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: v */
        public final boolean mo4782v(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f14322n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: w */
        public final int mo4781w(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: x */
        public final int mo4780x(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: y */
        public final int mo4779y() {
            return m4774t() + this.f14318j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC7577g
        /* renamed from: z */
        public final void mo4778z(@NonNull View view, @NonNull CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m4791H(coordinatorLayout, appBarLayout);
            if (appBarLayout.f14311k) {
                appBarLayout.m4799d(appBarLayout.m4798e(m4794E(coordinatorLayout)));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f14330a;

        /* renamed from: b */
        public C7570c f14331b;

        /* renamed from: c */
        public final Interpolator f14332c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams() {
            super(-1, -2);
            this.f14330a = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14330a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14581a);
            this.f14330a = obtainStyledAttributes.getInt(1, 0);
            this.f14331b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new C7570c();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f14332c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14330a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14330a = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14330a = 1;
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AbstractC7579h {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14601u);
            this.f14370f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: b */
        public final boolean mo2731b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: d */
        public boolean mo2730d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            int m11870a;
            CoordinatorLayout.AbstractC0588c abstractC0588c = ((CoordinatorLayout.C0590e) view2.getLayoutParams()).f2213a;
            if (abstractC0588c instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0588c).f14318j + this.f14369e;
                if (this.f14370f == 0) {
                    m11870a = 0;
                } else {
                    float mo4776w = mo4776w(view2);
                    int i = this.f14370f;
                    m11870a = C0728a.m11870a((int) (mo4776w * i), 0, i);
                }
                int i2 = bottom - m11870a;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f14311k) {
                    appBarLayout.m4799d(appBarLayout.m4798e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: e */
        public final void mo4788e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.m11774k(C0874o.C0875a.f2610f.m11546a(), coordinatorLayout);
                ViewCompat.m11777h(0, coordinatorLayout);
                ViewCompat.m11774k(C0874o.C0875a.f2611g.m11546a(), coordinatorLayout);
                ViewCompat.m11777h(0, coordinatorLayout);
                ViewCompat.m11771n(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: n */
        public final boolean mo4787n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList m12125d = coordinatorLayout.m12125d(view);
            int size = m12125d.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    View view2 = (View) m12125d.get(i2);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i2++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f14367c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    if (!z) {
                        i = 4;
                    }
                    appBarLayout.f14306f = 2 | i | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC7579h
        @Nullable
        /* renamed from: v */
        public final AppBarLayout mo4777v(@NonNull ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.AbstractC7579h
        /* renamed from: w */
        public final float mo4776w(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC0588c abstractC0588c = ((CoordinatorLayout.C0590e) appBarLayout.getLayoutParams()).f2213a;
                if (abstractC0588c instanceof BaseBehavior) {
                    i = ((BaseBehavior) abstractC0588c).mo4779y();
                } else {
                    i = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC7579h
        /* renamed from: x */
        public final int mo4775x(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7568a<T extends AppBarLayout> {
        /* renamed from: a */
        void mo2602a(int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7569b {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes3.dex */
    public static class C7570c extends AbstractC7569b {

        /* renamed from: a */
        public final Rect f14333a = new Rect();

        /* renamed from: b */
        public final Rect f14334b = new Rect();
    }

    /* renamed from: a */
    public static LayoutParams m4802a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void m4801b() {
        BaseBehavior.C7566b c7566b;
        Behavior behavior = this.f14317q;
        if (behavior != null && this.f14302b != -1 && this.f14306f == 0) {
            c7566b = behavior.m4792G(AbstractC1068a.f2746b, this);
        } else {
            c7566b = null;
        }
        this.f14302b = -1;
        this.f14303c = -1;
        this.f14304d = -1;
        if (c7566b != null) {
            Behavior behavior2 = this.f14317q;
            if (behavior2.f14321m == null) {
                behavior2.f14321m = c7566b;
            }
        }
    }

    /* renamed from: c */
    public final void m4800c(int i) {
        this.f14301a = i;
        if (!willNotDraw()) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
        ArrayList arrayList = this.f14307g;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC7568a interfaceC7568a = (InterfaceC7568a) this.f14307g.get(i2);
                if (interfaceC7568a != null) {
                    interfaceC7568a.mo2602a(i);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final boolean m4799d(boolean z) {
        if ((!this.f14308h) && this.f14310j != z) {
            this.f14310j = z;
            refreshDrawableState();
            if (!this.f14311k || !(getBackground() instanceof MaterialShapeDrawable)) {
                return true;
            }
            ValueAnimator valueAnimator = this.f14314n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            this.f14314n = ofFloat;
            ofFloat.setDuration(0L);
            this.f14314n.setInterpolator(null);
            this.f14314n.start();
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        boolean z;
        super.draw(canvas);
        if (this.f14316p != null && getTopInset() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f14301a);
            this.f14316p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14316p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final boolean m4798e(@Nullable View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.f14313m == null && (i = this.f14312l) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f14312l);
            }
            if (view2 != null) {
                this.f14313m = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f14313m;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4797f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11763b(childAt)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4802a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4802a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0587b
    @NonNull
    public CoordinatorLayout.AbstractC0588c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f14317q = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f14303c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f14330a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r4 = androidx.core.view.ViewCompat.f2518a
            int r4 = androidx.core.view.ViewCompat.C0814d.m11761d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r4 = androidx.core.view.ViewCompat.f2518a
            int r4 = androidx.core.view.ViewCompat.C0814d.m11761d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r6 = androidx.core.view.ViewCompat.f2518a
            boolean r3 = androidx.core.view.ViewCompat.C0814d.m11763b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f14303c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f14304d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i4 = layoutParams.f14330a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    i3 -= ViewCompat.C0814d.m11761d(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f14304d = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f14312l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int m11761d = ViewCompat.C0814d.m11761d(this);
        if (m11761d == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                m11761d = ViewCompat.C0814d.m11761d(getChildAt(childCount - 1));
            } else {
                m11761d = 0;
            }
            if (m11761d == 0) {
                return getHeight() / 3;
            }
        }
        return (m11761d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f14306f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f14316p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f14302b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f14330a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    if (ViewCompat.C0814d.m11763b(childAt)) {
                        i5 -= getTopInset();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                    i3 -= ViewCompat.C0814d.m11761d(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f14302b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C7798g.m4461b(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f14315o == null) {
            this.f14315o = new int[4];
        }
        int[] iArr = this.f14315o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f14309i;
        iArr[0] = z ? R.attr.state_liftable : -2130970105;
        iArr[1] = (z && this.f14310j) ? R.attr.state_lifted : -2130970106;
        iArr[2] = z ? R.attr.state_collapsible : -2130970101;
        iArr[3] = (z && this.f14310j) ? R.attr.state_collapsed : -2130970100;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f14313m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14313m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        boolean z4 = true;
        if (ViewCompat.C0814d.m11763b(this) && m4797f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        m4801b();
        this.f14305e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).f14332c != null) {
                this.f14305e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f14316p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f14308h) {
            if (!this.f14311k) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount3) {
                        int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f14330a;
                        if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z2 = true;
                            break;
                        }
                        i6++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    z4 = false;
                }
            }
            if (this.f14309i != z4) {
                this.f14309i = z4;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0814d.m11763b(this) && m4797f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = C0728a.m11870a(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m4801b();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).m4468j(f);
        }
    }

    public void setExpanded(boolean z) {
        int i;
        int i2;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        boolean m11729c = ViewCompat.C0817g.m11729c(this);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (m11729c) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        this.f14306f = i | i2 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.f14311k = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f14312l = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f14313m;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f14313m = null;
            return;
        }
        this.f14313m = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f14312l = i;
        WeakReference<View> weakReference = this.f14313m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14313m = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f14308h = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f14316p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f14316p = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f14316p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f14316p;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                C0700a.C0703c.m11921b(drawable4, ViewCompat.C0815e.m11742d(this));
                Drawable drawable5 = this.f14316p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f14316p.setCallback(this);
            }
            if (this.f14316p != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(C0158a.m12920a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130970106}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f14316p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14316p;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}

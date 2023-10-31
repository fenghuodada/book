package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C0728a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.view.AbstractC1068a;
import androidx.customview.widget.C1078c;
import com.ambrose.overwall.R;
import com.google.android.exoplayer2.C7122o;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7774c;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {

    /* renamed from: a */
    public C7818a f15296a;
    @Nullable

    /* renamed from: b */
    public MaterialShapeDrawable f15297b;
    @Nullable

    /* renamed from: c */
    public final ColorStateList f15298c;

    /* renamed from: d */
    public final C7801j f15299d;

    /* renamed from: e */
    public final SideSheetBehavior<V>.C7817c f15300e;

    /* renamed from: f */
    public final float f15301f;

    /* renamed from: g */
    public boolean f15302g;

    /* renamed from: h */
    public int f15303h;
    @Nullable

    /* renamed from: i */
    public C1078c f15304i;

    /* renamed from: j */
    public boolean f15305j;

    /* renamed from: k */
    public final float f15306k;

    /* renamed from: l */
    public int f15307l;

    /* renamed from: m */
    public int f15308m;

    /* renamed from: n */
    public int f15309n;
    @Nullable

    /* renamed from: o */
    public WeakReference<V> f15310o;
    @Nullable

    /* renamed from: p */
    public WeakReference<View> f15311p;
    @IdRes

    /* renamed from: q */
    public int f15312q;
    @Nullable

    /* renamed from: r */
    public VelocityTracker f15313r;

    /* renamed from: s */
    public int f15314s;
    @NonNull

    /* renamed from: t */
    public final LinkedHashSet f15315t;

    /* renamed from: u */
    public final C7814a f15316u;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    /* loaded from: classes3.dex */
    public class C7814a extends C1078c.AbstractC1081c {
        public C7814a() {
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: a */
        public final int mo4436a(@NonNull View view, int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C0728a.m11870a(i, sideSheetBehavior.f15296a.m4428a(), sideSheetBehavior.f15308m);
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: b */
        public final int mo4435b(@NonNull View view, int i) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: c */
        public final int mo4434c(@NonNull View view) {
            return SideSheetBehavior.this.f15308m;
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: f */
        public final void mo4433f(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f15302g) {
                    sideSheetBehavior.m4439t(1);
                }
            }
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: g */
        public final void mo4432g(@NonNull View view, int i, int i2) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f15311p;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                C7818a c7818a = sideSheetBehavior.f15296a;
                int left = view.getLeft();
                view.getRight();
                int i3 = c7818a.f15323a.f15308m;
                if (left <= i3) {
                    marginLayoutParams.rightMargin = i3 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<InterfaceC7819b> linkedHashSet = sideSheetBehavior.f15315t;
            if (!linkedHashSet.isEmpty()) {
                C7818a c7818a2 = sideSheetBehavior.f15296a;
                int i4 = c7818a2.f15323a.f15308m;
                c7818a2.m4428a();
                for (InterfaceC7819b interfaceC7819b : linkedHashSet) {
                    interfaceC7819b.m4426b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
            if (r6 != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r6 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
            if (java.lang.Math.abs(r9 - r1.m4428a()) < java.lang.Math.abs(r9 - r5.f15308m)) goto L34;
         */
        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo4431h(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                com.google.android.material.sidesheet.a r1 = r0.f15296a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 1
                if (r3 >= 0) goto Lf
                goto L84
            Lf:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f15323a
                float r6 = r5.f15306k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 0
                if (r3 <= 0) goto L27
                r3 = r4
                goto L28
            L27:
                r3 = r6
            L28:
                if (r3 == 0) goto L5a
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L38
                r9 = r4
                goto L39
            L38:
                r9 = r6
            L39:
                if (r9 == 0) goto L44
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L44
                r9 = r4
                goto L45
            L44:
                r9 = r6
            L45:
                if (r9 != 0) goto L86
                int r9 = r8.getLeft()
                int r10 = r5.f15308m
                int r1 = r1.m4428a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L57
                r6 = r4
            L57:
                if (r6 == 0) goto L84
                goto L86
            L5a:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L6d
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L6b
                r6 = r4
            L6b:
                if (r6 != 0) goto L86
            L6d:
                int r9 = r8.getLeft()
                int r10 = r1.m4428a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.f15308m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L86
            L84:
                r9 = 3
                goto L87
            L86:
                r9 = 5
            L87:
                r0.m4438u(r8, r4, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.C7814a.mo4431h(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: i */
        public final boolean mo4430i(int i, @NonNull View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f15303h == 1 || (weakReference = sideSheetBehavior.f15310o) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    /* loaded from: classes3.dex */
    public static class C7815b extends AbstractC1068a {
        public static final Parcelable.Creator<C7815b> CREATOR = new C7816a();

        /* renamed from: c */
        public final int f15318c;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b$a */
        /* loaded from: classes3.dex */
        public class C7816a implements Parcelable.ClassLoaderCreator<C7815b> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7815b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7815b[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7815b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7815b(parcel, classLoader);
            }
        }

        public C7815b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15318c = parcel.readInt();
        }

        public C7815b(AbsSavedState absSavedState, @NonNull SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f15318c = sideSheetBehavior.f15303h;
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f15318c);
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    /* loaded from: classes3.dex */
    public class C7817c {

        /* renamed from: a */
        public int f15319a;

        /* renamed from: b */
        public boolean f15320b;

        /* renamed from: c */
        public final RunnableC7822e f15321c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C7817c c7817c = SideSheetBehavior.C7817c.this;
                c7817c.f15320b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                C1078c c1078c = sideSheetBehavior.f15304i;
                if (c1078c != null && c1078c.m11217g()) {
                    c7817c.m4429a(c7817c.f15319a);
                } else if (sideSheetBehavior.f15303h == 2) {
                    sideSheetBehavior.m4439t(c7817c.f15319a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.e] */
        public C7817c() {
        }

        /* renamed from: a */
        public final void m4429a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f15310o;
            if (weakReference != null && weakReference.get() != null) {
                this.f15319a = i;
                if (!this.f15320b) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11752m(sideSheetBehavior.f15310o.get(), this.f15321c);
                    this.f15320b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f15300e = new C7817c();
        this.f15302g = true;
        this.f15303h = 5;
        this.f15306k = 0.1f;
        this.f15312q = -1;
        this.f15315t = new LinkedHashSet();
        this.f15316u = new C7814a();
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15300e = new C7817c();
        this.f15302g = true;
        this.f15303h = 5;
        this.f15306k = 0.1f;
        this.f15312q = -1;
        this.f15315t = new LinkedHashSet();
        this.f15316u = new C7814a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14603w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f15298c = C7774c.m4495a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f15299d = new C7801j(C7801j.m4457b(context, attributeSet, 0, 2132018249));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f15312q = resourceId;
            WeakReference<View> weakReference = this.f15311p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15311p = null;
            WeakReference<V> weakReference2 = this.f15310o;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    if (ViewCompat.C0817g.m11729c(v)) {
                        v.requestLayout();
                    }
                }
            }
        }
        C7801j c7801j = this.f15299d;
        if (c7801j != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(c7801j);
            this.f15297b = materialShapeDrawable;
            materialShapeDrawable.m4469i(context);
            ColorStateList colorStateList = this.f15298c;
            if (colorStateList != null) {
                this.f15297b.m4467k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f15297b.setTint(typedValue.data);
            }
        }
        this.f15301f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f15302g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f15296a == null) {
            this.f15296a = new C7818a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: c */
    public final void mo4304c(@NonNull CoordinatorLayout.C0590e c0590e) {
        this.f15310o = null;
        this.f15304i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: f */
    public final void mo4442f() {
        this.f15310o = null;
        this.f15304i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public final boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        C1078c c1078c;
        VelocityTracker velocityTracker;
        if ((v.isShown() || ViewCompat.m11780e(v) != null) && this.f15302g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f15305j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f15313r) != null) {
            velocityTracker.recycle();
            this.f15313r = null;
        }
        if (this.f15313r == null) {
            this.f15313r = VelocityTracker.obtain();
        }
        this.f15313r.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f15305j) {
                this.f15305j = false;
                return false;
            }
        } else {
            this.f15314s = (int) motionEvent.getX();
        }
        if (!this.f15305j && (c1078c = this.f15304i) != null && c1078c.m11206r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int i2;
        int i3;
        View findViewById;
        int i4;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11763b(coordinatorLayout) && !ViewCompat.C0814d.m11763b(v)) {
            v.setFitsSystemWindows(true);
        }
        int i5 = 0;
        if (this.f15310o == null) {
            this.f15310o = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.f15297b;
            if (materialShapeDrawable != null) {
                ViewCompat.C0814d.m11748q(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f15297b;
                float f = this.f15301f;
                if (f == -1.0f) {
                    f = ViewCompat.C0819i.m11713i(v);
                }
                materialShapeDrawable2.m4468j(f);
            } else {
                ColorStateList colorStateList = this.f15298c;
                if (colorStateList != null) {
                    ViewCompat.C0819i.m11705q(v, colorStateList);
                }
            }
            if (this.f15303h == 5) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            if (v.getVisibility() != i4) {
                v.setVisibility(i4);
            }
            m4437v();
            if (ViewCompat.C0814d.m11762c(v) == 0) {
                ViewCompat.C0814d.m11746s(v, 1);
            }
            if (ViewCompat.m11780e(v) == null) {
                ViewCompat.m11770o(v, v.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f15304i == null) {
            this.f15304i = new C1078c(coordinatorLayout.getContext(), coordinatorLayout, this.f15316u);
        }
        C7818a c7818a = this.f15296a;
        c7818a.getClass();
        int left = v.getLeft() - c7818a.f15323a.f15309n;
        coordinatorLayout.m12118q(i, v);
        this.f15308m = coordinatorLayout.getWidth();
        this.f15307l = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f15296a.getClass();
            i2 = marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        this.f15309n = i2;
        int i6 = this.f15303h;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                if (i6 == 5) {
                    i5 = this.f15296a.f15323a.f15308m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f15303h);
                }
            }
        } else {
            C7818a c7818a2 = this.f15296a;
            c7818a2.getClass();
            i5 = left - (v.getLeft() - c7818a2.f15323a.f15309n);
        }
        v.offsetLeftAndRight(i5);
        if (this.f15311p == null && (i3 = this.f15312q) != -1 && (findViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f15311p = new WeakReference<>(findViewById);
        }
        for (InterfaceC7819b interfaceC7819b : this.f15315t) {
            if (interfaceC7819b instanceof AbstractC7823f) {
                ((AbstractC7823f) interfaceC7819b).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: i */
    public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: o */
    public final void mo4441o(@NonNull View view, @NonNull Parcelable parcelable) {
        int i = ((C7815b) parcelable).f15318c;
        this.f15303h = (i == 1 || i == 2) ? 5 : 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @NonNull
    /* renamed from: p */
    public final Parcelable mo4440p(@NonNull View view) {
        return new C7815b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    public final boolean mo2597s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        boolean z4 = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f15303h;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C1078c c1078c = this.f15304i;
        if (c1078c != null && (this.f15302g || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1078c.m11213k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f15313r) != null) {
            velocityTracker.recycle();
            this.f15313r = null;
        }
        if (this.f15313r == null) {
            this.f15313r = VelocityTracker.obtain();
        }
        this.f15313r.addMovement(motionEvent);
        C1078c c1078c2 = this.f15304i;
        if (c1078c2 != null && (this.f15302g || this.f15303h == 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && actionMasked == 2 && !this.f15305j) {
            if (c1078c2 != null && (this.f15302g || this.f15303h == 1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && Math.abs(this.f15314s - motionEvent.getX()) > this.f15304i.f2768b) {
                z4 = true;
            }
            if (z4) {
                this.f15304i.m11222b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.f15305j;
    }

    /* renamed from: t */
    public final void m4439t(int i) {
        V v;
        int i2;
        if (this.f15303h == i) {
            return;
        }
        this.f15303h = i;
        WeakReference<V> weakReference = this.f15310o;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (this.f15303h == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        for (InterfaceC7819b interfaceC7819b : this.f15315t) {
            interfaceC7819b.m4427a();
        }
        m4437v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0.m11207q(r1, r4.getTop()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        r2 = true;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4438u(android.view.View r4, boolean r5, int r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.a r0 = r3.f15296a
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r0.f15323a
            r1 = 3
            if (r6 == r1) goto L20
            r1 = 5
            if (r6 != r1) goto L11
            com.google.android.material.sidesheet.a r1 = r0.f15296a
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1 = r1.f15323a
            int r1 = r1.f15308m
            goto L26
        L11:
            r0.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = androidx.appcompat.view.menu.C0235r.m12816a(r5, r6)
            r4.<init>(r5)
            throw r4
        L20:
            com.google.android.material.sidesheet.a r1 = r0.f15296a
            int r1 = r1.m4428a()
        L26:
            androidx.customview.widget.c r0 = r0.f15304i
            r2 = 0
            if (r0 == 0) goto L55
            if (r5 == 0) goto L38
            int r4 = r4.getTop()
            boolean r4 = r0.m11207q(r1, r4)
            if (r4 == 0) goto L55
            goto L54
        L38:
            int r5 = r4.getTop()
            r0.f2784r = r4
            r4 = -1
            r0.f2769c = r4
            boolean r4 = r0.m11215i(r1, r5, r2, r2)
            if (r4 != 0) goto L52
            int r5 = r0.f2767a
            if (r5 != 0) goto L52
            android.view.View r5 = r0.f2784r
            if (r5 == 0) goto L52
            r5 = 0
            r0.f2784r = r5
        L52:
            if (r4 == 0) goto L55
        L54:
            r2 = 1
        L55:
            if (r2 == 0) goto L61
            r4 = 2
            r3.m4439t(r4)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$c r4 = r3.f15300e
            r4.m4429a(r6)
            goto L64
        L61:
            r3.m4439t(r6)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m4438u(android.view.View, boolean, int):void");
    }

    /* renamed from: v */
    public final void m4437v() {
        V v;
        WeakReference<V> weakReference = this.f15310o;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.m11774k(262144, v);
        ViewCompat.m11777h(0, v);
        ViewCompat.m11774k(1048576, v);
        ViewCompat.m11777h(0, v);
        if (this.f15303h != 5) {
            ViewCompat.m11773l(v, C0874o.C0875a.f2614j, new C7122o(this, 5));
        }
        if (this.f15303h != 3) {
            ViewCompat.m11773l(v, C0874o.C0875a.f2612h, new C7122o(this, 3));
        }
    }
}

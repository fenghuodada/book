package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.C0235r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C0728a;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.view.AbstractC1068a;
import androidx.customview.widget.C1078c;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7774c;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {

    /* renamed from: A */
    public final BottomSheetBehavior<V>.C7605e f14444A;
    @Nullable

    /* renamed from: B */
    public ValueAnimator f14445B;

    /* renamed from: C */
    public int f14446C;

    /* renamed from: D */
    public int f14447D;

    /* renamed from: E */
    public int f14448E;

    /* renamed from: F */
    public float f14449F;

    /* renamed from: G */
    public int f14450G;

    /* renamed from: H */
    public final float f14451H;

    /* renamed from: I */
    public boolean f14452I;

    /* renamed from: J */
    public boolean f14453J;

    /* renamed from: K */
    public boolean f14454K;

    /* renamed from: L */
    public int f14455L;
    @Nullable

    /* renamed from: M */
    public C1078c f14456M;

    /* renamed from: N */
    public boolean f14457N;

    /* renamed from: O */
    public int f14458O;

    /* renamed from: P */
    public boolean f14459P;

    /* renamed from: Q */
    public final float f14460Q;

    /* renamed from: R */
    public int f14461R;

    /* renamed from: S */
    public int f14462S;

    /* renamed from: T */
    public int f14463T;
    @Nullable

    /* renamed from: U */
    public WeakReference<V> f14464U;
    @Nullable

    /* renamed from: V */
    public WeakReference<View> f14465V;
    @NonNull

    /* renamed from: W */
    public final ArrayList<AbstractC7602c> f14466W;
    @Nullable

    /* renamed from: X */
    public VelocityTracker f14467X;

    /* renamed from: Y */
    public int f14468Y;

    /* renamed from: Z */
    public int f14469Z;

    /* renamed from: a */
    public int f14470a;

    /* renamed from: a0 */
    public boolean f14471a0;

    /* renamed from: b */
    public boolean f14472b;
    @Nullable

    /* renamed from: b0 */
    public HashMap f14473b0;

    /* renamed from: c */
    public final float f14474c;
    @VisibleForTesting

    /* renamed from: c0 */
    public final SparseIntArray f14475c0;

    /* renamed from: d */
    public int f14476d;

    /* renamed from: d0 */
    public final C7601b f14477d0;

    /* renamed from: e */
    public int f14478e;

    /* renamed from: f */
    public boolean f14479f;

    /* renamed from: g */
    public int f14480g;

    /* renamed from: h */
    public final int f14481h;

    /* renamed from: i */
    public MaterialShapeDrawable f14482i;
    @Nullable

    /* renamed from: j */
    public final ColorStateList f14483j;

    /* renamed from: k */
    public int f14484k;

    /* renamed from: l */
    public int f14485l;

    /* renamed from: m */
    public int f14486m;

    /* renamed from: n */
    public boolean f14487n;

    /* renamed from: o */
    public final boolean f14488o;

    /* renamed from: p */
    public final boolean f14489p;

    /* renamed from: q */
    public final boolean f14490q;

    /* renamed from: r */
    public final boolean f14491r;

    /* renamed from: s */
    public final boolean f14492s;

    /* renamed from: t */
    public final boolean f14493t;

    /* renamed from: u */
    public final boolean f14494u;

    /* renamed from: v */
    public int f14495v;

    /* renamed from: w */
    public int f14496w;

    /* renamed from: x */
    public final boolean f14497x;

    /* renamed from: y */
    public final C7801j f14498y;

    /* renamed from: z */
    public boolean f14499z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface State {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes3.dex */
    public class RunnableC7600a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f14500a;

        /* renamed from: b */
        public final /* synthetic */ int f14501b;

        public RunnableC7600a(View view, int i) {
            this.f14500a = view;
            this.f14501b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.m4751H(this.f14500a, false, this.f14501b);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes3.dex */
    public class C7601b extends C1078c.AbstractC1081c {
        public C7601b() {
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: a */
        public final int mo4436a(@NonNull View view, int i) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: b */
        public final int mo4435b(@NonNull View view, int i) {
            return C0728a.m11870a(i, BottomSheetBehavior.this.m4738y(), mo4736d());
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: d */
        public final int mo4736d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f14452I) {
                return bottomSheetBehavior.f14463T;
            }
            return bottomSheetBehavior.f14450G;
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: f */
        public final void mo4433f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f14454K) {
                    bottomSheetBehavior.m4753F(1);
                }
            }
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: g */
        public final void mo4432g(@NonNull View view, int i, int i2) {
            BottomSheetBehavior.this.m4741v(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r3.m4738y()) < java.lang.Math.abs(r5.getTop() - r3.f14448E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
            if (java.lang.Math.abs(r6 - r3.f14448E) < java.lang.Math.abs(r6 - r3.f14450G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
            if (java.lang.Math.abs(r6 - r3.f14447D) < java.lang.Math.abs(r6 - r3.f14450G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            if (r6 < java.lang.Math.abs(r6 - r3.f14450G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.f14450G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r6 > r3.f14448E) goto L7;
         */
        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo4431h(@androidx.annotation.NonNull android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L1b
                boolean r6 = r3.f14472b
                if (r6 == 0) goto Le
                goto Lc4
            Le:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r3.f14448E
                if (r6 <= r7) goto Lc4
                goto Ld5
            L1b:
                boolean r1 = r3.f14452I
                if (r1 == 0) goto L70
                boolean r1 = r3.m4752G(r7, r5)
                if (r1 == 0) goto L70
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L38
                int r6 = r3.f14476d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L4c
            L38:
                int r6 = r5.getTop()
                int r7 = r3.f14463T
                int r0 = r3.m4738y()
                int r0 = r0 + r7
                int r0 = r0 / 2
                if (r6 <= r0) goto L49
                r6 = r2
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L4f
            L4c:
                r6 = 5
                goto Ld8
            L4f:
                boolean r6 = r3.f14472b
                if (r6 == 0) goto L55
                goto Lc4
            L55:
                int r6 = r5.getTop()
                int r7 = r3.m4738y()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r3.f14448E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
                goto Lc4
            L70:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L9c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L81
                goto L9c
            L81:
                boolean r6 = r3.f14472b
                if (r6 == 0) goto L86
                goto Ld7
            L86:
                int r6 = r5.getTop()
                int r7 = r3.f14448E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.f14450G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Ld5
            L9c:
                int r6 = r5.getTop()
                boolean r7 = r3.f14472b
                if (r7 == 0) goto Lb6
                int r7 = r3.f14447D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.f14450G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Lc4
            Lb6:
                int r7 = r3.f14448E
                if (r6 >= r7) goto Lc6
                int r7 = r3.f14450G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
            Lc4:
                r6 = 3
                goto Ld8
            Lc6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.f14450G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
            Ld5:
                r6 = 6
                goto Ld8
            Ld7:
                r6 = 4
            Ld8:
                r3.getClass()
                r3.m4751H(r5, r2, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C7601b.mo4431h(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.C1078c.AbstractC1081c
        /* renamed from: i */
        public final boolean mo4430i(int i, @NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f14455L;
            if (i2 == 1 || bottomSheetBehavior.f14471a0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f14468Y == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f14465V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f14464U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7602c {
        /* renamed from: a */
        public abstract void mo2590a();

        /* renamed from: b */
        public abstract void mo2589b(int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes3.dex */
    public static class C7603d extends AbstractC1068a {
        public static final Parcelable.Creator<C7603d> CREATOR = new C7604a();

        /* renamed from: c */
        public final int f14504c;

        /* renamed from: d */
        public final int f14505d;

        /* renamed from: e */
        public final boolean f14506e;

        /* renamed from: f */
        public final boolean f14507f;

        /* renamed from: g */
        public final boolean f14508g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d$a */
        /* loaded from: classes3.dex */
        public class C7604a implements Parcelable.ClassLoaderCreator<C7603d> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7603d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7603d[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7603d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7603d(parcel, classLoader);
            }
        }

        public C7603d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14504c = parcel.readInt();
            this.f14505d = parcel.readInt();
            this.f14506e = parcel.readInt() == 1;
            this.f14507f = parcel.readInt() == 1;
            this.f14508g = parcel.readInt() == 1;
        }

        public C7603d(AbsSavedState absSavedState, @NonNull BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f14504c = bottomSheetBehavior.f14455L;
            this.f14505d = bottomSheetBehavior.f14478e;
            this.f14506e = bottomSheetBehavior.f14472b;
            this.f14507f = bottomSheetBehavior.f14452I;
            this.f14508g = bottomSheetBehavior.f14453J;
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f14504c);
            parcel.writeInt(this.f14505d);
            parcel.writeInt(this.f14506e ? 1 : 0);
            parcel.writeInt(this.f14507f ? 1 : 0);
            parcel.writeInt(this.f14508g ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes3.dex */
    public class C7605e {

        /* renamed from: a */
        public int f14509a;

        /* renamed from: b */
        public boolean f14510b;

        /* renamed from: c */
        public final RunnableC7606a f14511c = new RunnableC7606a();

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        /* loaded from: classes3.dex */
        public class RunnableC7606a implements Runnable {
            public RunnableC7606a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7605e c7605e = C7605e.this;
                c7605e.f14510b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                C1078c c1078c = bottomSheetBehavior.f14456M;
                if (c1078c != null && c1078c.m11217g()) {
                    c7605e.m4735a(c7605e.f14509a);
                } else if (bottomSheetBehavior.f14455L == 2) {
                    bottomSheetBehavior.m4753F(c7605e.f14509a);
                }
            }
        }

        public C7605e() {
        }

        /* renamed from: a */
        public final void m4735a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f14464U;
            if (weakReference != null && weakReference.get() != null) {
                this.f14509a = i;
                if (!this.f14510b) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11752m(bottomSheetBehavior.f14464U.get(), this.f14511c);
                    this.f14510b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f14470a = 0;
        this.f14472b = true;
        this.f14484k = -1;
        this.f14485l = -1;
        this.f14444A = new C7605e();
        this.f14449F = 0.5f;
        this.f14451H = -1.0f;
        this.f14454K = true;
        this.f14455L = 4;
        this.f14460Q = 0.1f;
        this.f14466W = new ArrayList<>();
        this.f14475c0 = new SparseIntArray();
        this.f14477d0 = new C7601b();
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i;
        this.f14470a = 0;
        this.f14472b = true;
        this.f14484k = -1;
        this.f14485l = -1;
        this.f14444A = new C7605e();
        this.f14449F = 0.5f;
        this.f14451H = -1.0f;
        this.f14454K = true;
        this.f14455L = 4;
        this.f14460Q = 0.1f;
        this.f14466W = new ArrayList<>();
        this.f14475c0 = new SparseIntArray();
        this.f14477d0 = new C7601b();
        this.f14481h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14582b);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f14483j = C7774c.m4495a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f14498y = new C7801j(C7801j.m4457b(context, attributeSet, R.attr.bottomSheetStyle, 2132018107));
        }
        C7801j c7801j = this.f14498y;
        if (c7801j != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(c7801j);
            this.f14482i = materialShapeDrawable;
            materialShapeDrawable.m4469i(context);
            ColorStateList colorStateList = this.f14483j;
            if (colorStateList != null) {
                this.f14482i.m4467k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f14482i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14445B = ofFloat;
        ofFloat.setDuration(500L);
        this.f14445B.addUpdateListener(new C7607a(this));
        this.f14451H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f14484k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f14485l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m4755D(i);
        } else {
            m4755D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        m4756C(obtainStyledAttributes.getBoolean(8, false));
        this.f14487n = obtainStyledAttributes.getBoolean(13, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f14472b != z) {
            this.f14472b = z;
            if (this.f14464U != null) {
                m4743t();
            }
            m4753F((this.f14472b && this.f14455L == 6) ? i2 : this.f14455L);
            m4749J(this.f14455L, true);
            m4750I();
        }
        this.f14453J = obtainStyledAttributes.getBoolean(12, false);
        this.f14454K = obtainStyledAttributes.getBoolean(4, true);
        this.f14470a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f14449F = f;
            if (this.f14464U != null) {
                this.f14448E = (int) ((1.0f - f) * this.f14463T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                dimensionPixelOffset = peekValue2.data;
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            }
            m4757B(dimensionPixelOffset);
            this.f14476d = obtainStyledAttributes.getInt(11, 500);
            this.f14488o = obtainStyledAttributes.getBoolean(17, false);
            this.f14489p = obtainStyledAttributes.getBoolean(18, false);
            this.f14490q = obtainStyledAttributes.getBoolean(19, false);
            this.f14491r = obtainStyledAttributes.getBoolean(20, true);
            this.f14492s = obtainStyledAttributes.getBoolean(14, false);
            this.f14493t = obtainStyledAttributes.getBoolean(15, false);
            this.f14494u = obtainStyledAttributes.getBoolean(16, false);
            this.f14497x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f14474c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: w */
    public static View m4740w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0819i.m11706p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m4740w = m4740w(viewGroup.getChildAt(i));
                if (m4740w != null) {
                    return m4740w;
                }
            }
        }
        return null;
    }

    /* renamed from: A */
    public final void m4758A(View view, C0874o.C0875a c0875a, int i) {
        ViewCompat.m11773l(view, c0875a, new C7609c(this, i));
    }

    /* renamed from: B */
    public final void m4757B(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f14446C = i;
        m4749J(this.f14455L, true);
    }

    /* renamed from: C */
    public final void m4756C(boolean z) {
        if (this.f14452I != z) {
            this.f14452I = z;
            if (!z && this.f14455L == 5) {
                m4754E(4);
            }
            m4750I();
        }
    }

    /* renamed from: D */
    public final void m4755D(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f14479f) {
                this.f14479f = true;
                z = true;
            }
        } else if (this.f14479f || this.f14478e != i) {
            this.f14479f = false;
            this.f14478e = Math.max(0, i);
            z = true;
        }
        if (z) {
            m4747L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (androidx.core.view.ViewCompat.C0817g.m11730b(r5) != false) goto L29;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4754E(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r1 = r4.f14452I
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r1 = r4.f14472b
            if (r1 == 0) goto L34
            int r1 = r4.m4737z(r5)
            int r2 = r4.f14447D
            if (r1 > r2) goto L34
            r1 = 3
            goto L35
        L34:
            r1 = r5
        L35:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r4.f14464U
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.f14464U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L62
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L62
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r1 = androidx.core.view.ViewCompat.f2518a
            boolean r1 = androidx.core.view.ViewCompat.C0817g.m11730b(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r2)
            goto L70
        L69:
            r2.run()
            goto L70
        L6d:
            r4.m4753F(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = androidx.concurrent.futures.C0484a.m12392a(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m4754E(int):void");
    }

    /* renamed from: F */
    public final void m4753F(int i) {
        if (this.f14455L == i) {
            return;
        }
        this.f14455L = i;
        WeakReference<V> weakReference = this.f14464U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            m4748K(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m4748K(false);
        }
        m4749J(i, true);
        while (true) {
            ArrayList<AbstractC7602c> arrayList = this.f14466W;
            if (i2 >= arrayList.size()) {
                m4750I();
                return;
            } else {
                arrayList.get(i2).mo2589b(i);
                i2++;
            }
        }
    }

    /* renamed from: G */
    public final boolean m4752G(float f, @NonNull View view) {
        if (this.f14453J) {
            return true;
        }
        if (view.getTop() < this.f14450G) {
            return false;
        }
        return Math.abs(((f * this.f14460Q) + ((float) view.getTop())) - ((float) this.f14450G)) / ((float) m4742u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1.m11207q(r5.getLeft(), r0) != false) goto L6;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4751H(android.view.View r5, boolean r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.m4737z(r7)
            androidx.customview.widget.c r1 = r4.f14456M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r6 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.m11207q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r6 = r5.getLeft()
            r1.f2784r = r5
            r5 = -1
            r1.f2769c = r5
            boolean r5 = r1.m11215i(r6, r0, r2, r2)
            if (r5 != 0) goto L31
            int r6 = r1.f2767a
            if (r6 != 0) goto L31
            android.view.View r6 = r1.f2784r
            if (r6 == 0) goto L31
            r6 = 0
            r1.f2784r = r6
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.m4753F(r5)
            r4.m4749J(r7, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r5 = r4.f14444A
            r5.m4735a(r7)
            goto L46
        L43:
            r4.m4753F(r7)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m4751H(android.view.View, boolean, int):void");
    }

    /* renamed from: I */
    public final void m4750I() {
        V v;
        C0874o.C0875a c0875a;
        int i;
        boolean z;
        C0851a c0851a;
        WeakReference<V> weakReference = this.f14464U;
        if (weakReference != null && (v = weakReference.get()) != null) {
            ViewCompat.m11774k(524288, v);
            ViewCompat.m11777h(0, v);
            ViewCompat.m11774k(262144, v);
            ViewCompat.m11777h(0, v);
            ViewCompat.m11774k(1048576, v);
            ViewCompat.m11777h(0, v);
            SparseIntArray sparseIntArray = this.f14475c0;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                ViewCompat.m11774k(i2, v);
                ViewCompat.m11777h(0, v);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.f14472b && this.f14455L != 6) {
                String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C7609c c7609c = new C7609c(this, 6);
                ArrayList m11779f = ViewCompat.m11779f(v);
                int i4 = 0;
                while (true) {
                    if (i4 < m11779f.size()) {
                        if (TextUtils.equals(string, ((C0874o.C0875a) m11779f.get(i4)).m11545b())) {
                            i = ((C0874o.C0875a) m11779f.get(i4)).m11546a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = ViewCompat.f2521d;
                            if (i5 >= iArr.length || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < m11779f.size(); i8++) {
                                if (((C0874o.C0875a) m11779f.get(i8)).m11546a() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    }
                }
                if (i != -1) {
                    C0874o.C0875a c0875a2 = new C0874o.C0875a(null, i, string, c7609c, null);
                    View.AccessibilityDelegate m11781d = ViewCompat.m11781d(v);
                    if (m11781d == null) {
                        c0851a = null;
                    } else if (m11781d instanceof C0851a.C0852a) {
                        c0851a = ((C0851a.C0852a) m11781d).f2599a;
                    } else {
                        c0851a = new C0851a(m11781d);
                    }
                    if (c0851a == null) {
                        c0851a = new C0851a();
                    }
                    ViewCompat.m11771n(v, c0851a);
                    ViewCompat.m11774k(c0875a2.m11546a(), v);
                    ViewCompat.m11779f(v).add(c0875a2);
                    ViewCompat.m11777h(0, v);
                }
                sparseIntArray.put(0, i);
            }
            if (this.f14452I && this.f14455L != 5) {
                m4758A(v, C0874o.C0875a.f2614j, 5);
            }
            int i9 = this.f14455L;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        m4758A(v, C0874o.C0875a.f2613i, 4);
                        m4758A(v, C0874o.C0875a.f2612h, 3);
                        return;
                    }
                    return;
                }
                if (this.f14472b) {
                    i3 = 3;
                }
                c0875a = C0874o.C0875a.f2612h;
            } else {
                if (this.f14472b) {
                    i3 = 4;
                }
                c0875a = C0874o.C0875a.f2613i;
            }
            m4758A(v, c0875a, i3);
        }
    }

    /* renamed from: J */
    public final void m4749J(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        if (this.f14455L == 3 && (this.f14497x || m4738y() == 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f14499z != z2 && this.f14482i != null) {
            this.f14499z = z2;
            float f = 0.0f;
            if (z && (valueAnimator = this.f14445B) != null) {
                if (valueAnimator.isRunning()) {
                    this.f14445B.reverse();
                    return;
                }
                if (!z2) {
                    f = 1.0f;
                }
                this.f14445B.setFloatValues(1.0f - f, f);
                this.f14445B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f14445B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f14445B.cancel();
            }
            MaterialShapeDrawable materialShapeDrawable = this.f14482i;
            if (!this.f14499z) {
                f = 1.0f;
            }
            MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
            if (c7791b.f15215j != f) {
                c7791b.f15215j = f;
                materialShapeDrawable.f15187e = true;
                materialShapeDrawable.invalidateSelf();
            }
        }
    }

    /* renamed from: K */
    public final void m4748K(boolean z) {
        WeakReference<V> weakReference = this.f14464U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.f14473b0 == null) {
                this.f14473b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.f14464U.get() && z) {
                this.f14473b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.f14473b0 = null;
        }
    }

    /* renamed from: L */
    public final void m4747L() {
        V v;
        if (this.f14464U != null) {
            m4743t();
            if (this.f14455L != 4 || (v = this.f14464U.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: c */
    public final void mo4304c(@NonNull CoordinatorLayout.C0590e c0590e) {
        this.f14464U = null;
        this.f14456M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: f */
    public final void mo4442f() {
        this.f14464U = null;
        this.f14456M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        View view;
        C1078c c1078c;
        if (v.isShown() && this.f14454K) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.f14468Y = -1;
                VelocityTracker velocityTracker = this.f14467X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f14467X = null;
                }
            }
            if (this.f14467X == null) {
                this.f14467X = VelocityTracker.obtain();
            }
            this.f14467X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f14471a0 = false;
                    this.f14468Y = -1;
                    if (this.f14457N) {
                        this.f14457N = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.f14469Z = (int) motionEvent.getY();
                if (this.f14455L != 2) {
                    WeakReference<View> weakReference = this.f14465V;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.m12120i(view, x, this.f14469Z)) {
                        this.f14468Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f14471a0 = true;
                    }
                }
                if (this.f14468Y == -1 && !coordinatorLayout.m12120i(v, x, this.f14469Z)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f14457N = z;
            }
            if (!this.f14457N && (c1078c = this.f14456M) != null && c1078c.m11206r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f14465V;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f14457N || this.f14455L == 1 || coordinatorLayout.m12120i(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f14456M == null || Math.abs(this.f14469Z - motionEvent.getY()) <= this.f14456M.f2768b) {
                return false;
            }
            return true;
        }
        this.f14457N = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015c A[LOOP:0: B:76:0x0154->B:78:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168 A[SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2724h(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r9, @androidx.annotation.NonNull V r10, int r11) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2724h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: i */
    public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m4739x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f14484k, marginLayoutParams.width), m4739x(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f14485l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: j */
    public final boolean mo4746j(@NonNull View view) {
        WeakReference<View> weakReference = this.f14465V;
        return (weakReference == null || view != weakReference.get() || this.f14455L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: k */
    public final void mo2728k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f14465V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m4738y()) {
                int m4738y = top - m4738y();
                iArr[1] = m4738y;
                int i6 = -m4738y;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                v.offsetTopAndBottom(i6);
                i4 = 3;
                m4753F(i4);
            } else if (!this.f14454K) {
                return;
            } else {
                iArr[1] = i2;
                int i7 = -i2;
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                v.offsetTopAndBottom(i7);
                m4753F(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i8 = this.f14450G;
            if (i5 > i8 && !this.f14452I) {
                int i9 = top - i8;
                iArr[1] = i9;
                int i10 = -i9;
                WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                v.offsetTopAndBottom(i10);
                i4 = 4;
                m4753F(i4);
            } else if (!this.f14454K) {
                return;
            } else {
                iArr[1] = i2;
                int i72 = -i2;
                WeakHashMap<View, C0922g2> weakHashMap22 = ViewCompat.f2518a;
                v.offsetTopAndBottom(i72);
                m4753F(1);
            }
        }
        m4741v(v.getTop());
        this.f14458O = i2;
        this.f14459P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: m */
    public final void mo4745m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: o */
    public final void mo4441o(@NonNull View view, @NonNull Parcelable parcelable) {
        C7603d c7603d = (C7603d) parcelable;
        int i = this.f14470a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f14478e = c7603d.f14505d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f14472b = c7603d.f14506e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f14452I = c7603d.f14507f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f14453J = c7603d.f14508g;
            }
        }
        int i2 = c7603d.f14504c;
        if (i2 != 1 && i2 != 2) {
            this.f14455L = i2;
        } else {
            this.f14455L = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @NonNull
    /* renamed from: p */
    public final Parcelable mo4440p(@NonNull View view) {
        return new C7603d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: q */
    public boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.f14458O = 0;
        this.f14459P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.getTop() <= r1.f14448E) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.f14447D) < java.lang.Math.abs(r2 - r1.f14450G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.f14450G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f14450G)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.f14448E) < java.lang.Math.abs(r2 - r1.f14450G)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4744r(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m4738y()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m4753F(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f14465V
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.f14459P
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.f14458O
            if (r2 <= 0) goto L33
            boolean r2 = r1.f14472b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.f14448E
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.f14452I
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.f14467X
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f14474c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f14467X
            int r4 = r1.f14468Y
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.m4752G(r2, r3)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.f14458O
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f14472b
            if (r4 == 0) goto L72
            int r4 = r1.f14447D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f14450G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.f14448E
            if (r2 >= r4) goto L81
            int r4 = r1.f14450G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f14450G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f14472b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.f14448E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f14450G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.m4751H(r3, r2, r0)
            r1.f14459P = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4744r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    public boolean mo2597s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f14455L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C1078c c1078c = this.f14456M;
        if (c1078c != null && (this.f14454K || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1078c.m11213k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f14468Y = -1;
            VelocityTracker velocityTracker = this.f14467X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14467X = null;
            }
        }
        if (this.f14467X == null) {
            this.f14467X = VelocityTracker.obtain();
        }
        this.f14467X.addMovement(motionEvent);
        if (this.f14456M != null && (this.f14454K || this.f14455L == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.f14457N) {
            float abs = Math.abs(this.f14469Z - motionEvent.getY());
            C1078c c1078c2 = this.f14456M;
            if (abs > c1078c2.f2768b) {
                c1078c2.m11222b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.f14457N;
    }

    /* renamed from: t */
    public final void m4743t() {
        int m4742u = m4742u();
        if (this.f14472b) {
            this.f14450G = Math.max(this.f14463T - m4742u, this.f14447D);
        } else {
            this.f14450G = this.f14463T - m4742u;
        }
    }

    /* renamed from: u */
    public final int m4742u() {
        int i;
        return this.f14479f ? Math.min(Math.max(this.f14480g, this.f14463T - ((this.f14462S * 9) / 16)), this.f14461R) + this.f14495v : (this.f14487n || this.f14488o || (i = this.f14486m) <= 0) ? this.f14478e + this.f14495v : Math.max(this.f14478e, i + this.f14481h);
    }

    /* renamed from: v */
    public final void m4741v(int i) {
        if (this.f14464U.get() != null) {
            ArrayList<AbstractC7602c> arrayList = this.f14466W;
            if (!arrayList.isEmpty()) {
                int i2 = this.f14450G;
                if (i <= i2 && i2 != m4738y()) {
                    m4738y();
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList.get(i3).mo2590a();
                }
            }
        }
    }

    /* renamed from: x */
    public final int m4739x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* renamed from: y */
    public final int m4738y() {
        if (this.f14472b) {
            return this.f14447D;
        }
        return Math.max(this.f14446C, this.f14491r ? 0 : this.f14496w);
    }

    /* renamed from: z */
    public final int m4737z(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f14448E;
                    }
                    throw new IllegalArgumentException(C0235r.m12816a("Invalid state to get top offset: ", i));
                }
                return this.f14463T;
            }
            return this.f14450G;
        }
        return m4738y();
    }
}

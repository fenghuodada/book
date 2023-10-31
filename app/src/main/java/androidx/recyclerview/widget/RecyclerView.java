package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.C0406q1;
import androidx.collection.C0482i;
import androidx.constraintlayout.core.C0510h;
import androidx.core.p003os.C0749q;
import androidx.core.view.C0851a;
import androidx.core.view.C0910e0;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0905d0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0861b;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.view.AbstractC1068a;
import androidx.recyclerview.C1553a;
import androidx.recyclerview.widget.C1609a;
import androidx.recyclerview.widget.C1614b;
import androidx.recyclerview.widget.C1617b0;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.C1650x;
import androidx.recyclerview.widget.RunnableC1635m;
import androidx.recyclerview.widget.ViewBoundsCheck;
import com.ambrose.overwall.R;
import com.facebook.ads.AdError;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0905d0 {

    /* renamed from: D0 */
    public static final int[] f3629D0 = {16843830};

    /* renamed from: E0 */
    public static final Class<?>[] f3630E0;

    /* renamed from: F0 */
    public static final animationInterpolatorC1570c f3631F0;

    /* renamed from: A */
    public boolean f3632A;

    /* renamed from: A0 */
    public int f3633A0;

    /* renamed from: B */
    public final AccessibilityManager f3634B;

    /* renamed from: B0 */
    public int f3635B0;

    /* renamed from: C */
    public ArrayList f3636C;

    /* renamed from: C0 */
    public final C1571d f3637C0;

    /* renamed from: D */
    public boolean f3638D;

    /* renamed from: E */
    public boolean f3639E;

    /* renamed from: F */
    public int f3640F;

    /* renamed from: G */
    public int f3641G;
    @NonNull

    /* renamed from: H */
    public EdgeEffectFactory f3642H;

    /* renamed from: I */
    public EdgeEffect f3643I;

    /* renamed from: J */
    public EdgeEffect f3644J;

    /* renamed from: K */
    public EdgeEffect f3645K;

    /* renamed from: L */
    public EdgeEffect f3646L;

    /* renamed from: M */
    public ItemAnimator f3647M;

    /* renamed from: N */
    public int f3648N;

    /* renamed from: O */
    public int f3649O;

    /* renamed from: P */
    public VelocityTracker f3650P;

    /* renamed from: Q */
    public int f3651Q;

    /* renamed from: R */
    public int f3652R;

    /* renamed from: S */
    public int f3653S;

    /* renamed from: T */
    public int f3654T;

    /* renamed from: U */
    public int f3655U;

    /* renamed from: V */
    public AbstractC1581m f3656V;

    /* renamed from: W */
    public final int f3657W;

    /* renamed from: a */
    public final C1588s f3658a;

    /* renamed from: b */
    public final C1586q f3659b;

    /* renamed from: c */
    public C1589t f3660c;

    /* renamed from: d */
    public C1609a f3661d;

    /* renamed from: d0 */
    public final int f3662d0;

    /* renamed from: e */
    public C1614b f3663e;

    /* renamed from: e0 */
    public final float f3664e0;

    /* renamed from: f */
    public final C1617b0 f3665f;

    /* renamed from: f0 */
    public final float f3666f0;

    /* renamed from: g */
    public boolean f3667g;

    /* renamed from: g0 */
    public boolean f3668g0;

    /* renamed from: h */
    public final RunnableC1568a f3669h;

    /* renamed from: h0 */
    public final RunnableC1596x f3670h0;

    /* renamed from: i */
    public final Rect f3671i;

    /* renamed from: i0 */
    public RunnableC1635m f3672i0;

    /* renamed from: j */
    public final Rect f3673j;

    /* renamed from: j0 */
    public final RunnableC1635m.C1637b f3674j0;

    /* renamed from: k */
    public final RectF f3675k;

    /* renamed from: k0 */
    public final C1594v f3676k0;

    /* renamed from: l */
    public AbstractC1572e f3677l;

    /* renamed from: l0 */
    public AbstractC1583o f3678l0;
    @VisibleForTesting

    /* renamed from: m */
    public LayoutManager f3679m;

    /* renamed from: m0 */
    public ArrayList f3680m0;

    /* renamed from: n */
    public InterfaceC1587r f3681n;

    /* renamed from: n0 */
    public boolean f3682n0;

    /* renamed from: o */
    public final ArrayList f3683o;

    /* renamed from: o0 */
    public boolean f3684o0;

    /* renamed from: p */
    public final ArrayList<AbstractC1578j> f3685p;

    /* renamed from: p0 */
    public final C1577i f3686p0;

    /* renamed from: q */
    public final ArrayList<InterfaceC1582n> f3687q;

    /* renamed from: q0 */
    public boolean f3688q0;

    /* renamed from: r */
    public InterfaceC1582n f3689r;

    /* renamed from: r0 */
    public C1650x f3690r0;

    /* renamed from: s */
    public boolean f3691s;

    /* renamed from: s0 */
    public final int[] f3692s0;

    /* renamed from: t */
    public boolean f3693t;

    /* renamed from: t0 */
    public C0910e0 f3694t0;
    @VisibleForTesting

    /* renamed from: u */
    public boolean f3695u;

    /* renamed from: u0 */
    public final int[] f3696u0;

    /* renamed from: v */
    public int f3697v;

    /* renamed from: v0 */
    public final int[] f3698v0;

    /* renamed from: w */
    public boolean f3699w;

    /* renamed from: w0 */
    public final int[] f3700w0;

    /* renamed from: x */
    public boolean f3701x;
    @VisibleForTesting

    /* renamed from: x0 */
    public final ArrayList f3702x0;

    /* renamed from: y */
    public boolean f3703y;

    /* renamed from: y0 */
    public final RunnableC1569b f3704y0;

    /* renamed from: z */
    public int f3705z;

    /* renamed from: z0 */
    public boolean f3706z0;

    /* loaded from: classes.dex */
    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface EdgeDirection {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ItemAnimator {

        /* renamed from: a */
        public InterfaceC1563b f3707a = null;

        /* renamed from: b */
        public final ArrayList<InterfaceC1562a> f3708b = new ArrayList<>();

        /* renamed from: c */
        public final long f3709c = 120;

        /* renamed from: d */
        public final long f3710d = 120;

        /* renamed from: e */
        public final long f3711e = 250;

        /* renamed from: f */
        public final long f3712f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface AdapterChanges {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1562a {
            /* renamed from: a */
            void m10348a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1563b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$c */
        /* loaded from: classes.dex */
        public static class C1564c {

            /* renamed from: a */
            public int f3713a;

            /* renamed from: b */
            public int f3714b;

            @NonNull
            /* renamed from: a */
            public final void m10347a(@NonNull AbstractC1597y abstractC1597y) {
                View view = abstractC1597y.itemView;
                this.f3713a = view.getLeft();
                this.f3714b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* renamed from: b */
        public static void m10350b(AbstractC1597y abstractC1597y) {
            int i = abstractC1597y.mFlags & 14;
            if (!abstractC1597y.isInvalid() && (i & 4) == 0) {
                abstractC1597y.getOldPosition();
                abstractC1597y.getAbsoluteAdapterPosition();
            }
        }

        /* renamed from: a */
        public abstract boolean mo10089a(@NonNull AbstractC1597y abstractC1597y, @NonNull AbstractC1597y abstractC1597y2, @NonNull C1564c c1564c, @NonNull C1564c c1564c2);

        /* renamed from: c */
        public final void m10349c(@NonNull AbstractC1597y abstractC1597y) {
            InterfaceC1563b interfaceC1563b = this.f3707a;
            if (interfaceC1563b != null) {
                C1577i c1577i = (C1577i) interfaceC1563b;
                boolean z = true;
                abstractC1597y.setIsRecyclable(true);
                if (abstractC1597y.mShadowedHolder != null && abstractC1597y.mShadowingHolder == null) {
                    abstractC1597y.mShadowedHolder = null;
                }
                abstractC1597y.mShadowingHolder = null;
                if (!abstractC1597y.shouldBeKeptAsChild()) {
                    View view = abstractC1597y.itemView;
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.m10375d0();
                    C1614b c1614b = recyclerView.f3663e;
                    C1648v c1648v = (C1648v) c1614b.f3871a;
                    int indexOfChild = c1648v.f4007a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c1614b.m10158k(view);
                    } else {
                        C1614b.C1615a c1615a = c1614b.f3872b;
                        if (c1615a.m10154d(indexOfChild)) {
                            c1615a.m10152f(indexOfChild);
                            c1614b.m10158k(view);
                            c1648v.m10103b(indexOfChild);
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        AbstractC1597y m10398J = RecyclerView.m10398J(view);
                        C1586q c1586q = recyclerView.f3659b;
                        c1586q.m10284k(m10398J);
                        c1586q.m10287h(m10398J);
                    }
                    recyclerView.m10373e0(!z);
                    if (!z && abstractC1597y.isTmpDetached()) {
                        recyclerView.removeDetachedView(abstractC1597y.itemView, false);
                    }
                }
            }
        }

        /* renamed from: d */
        public abstract void mo10145d(@NonNull AbstractC1597y abstractC1597y);

        /* renamed from: e */
        public abstract void mo10144e();

        /* renamed from: f */
        public abstract boolean mo10143f();
    }

    /* loaded from: classes.dex */
    public static abstract class LayoutManager {

        /* renamed from: a */
        public C1614b f3715a;

        /* renamed from: b */
        public RecyclerView f3716b;

        /* renamed from: c */
        public final ViewBoundsCheck f3717c;

        /* renamed from: d */
        public final ViewBoundsCheck f3718d;
        @Nullable

        /* renamed from: e */
        public AbstractC1591u f3719e;

        /* renamed from: f */
        public boolean f3720f;

        /* renamed from: g */
        public boolean f3721g;

        /* renamed from: h */
        public final boolean f3722h;

        /* renamed from: i */
        public final boolean f3723i;

        /* renamed from: j */
        public int f3724j;

        /* renamed from: k */
        public boolean f3725k;

        /* renamed from: l */
        public int f3726l;

        /* renamed from: m */
        public int f3727m;

        /* renamed from: n */
        public int f3728n;

        /* renamed from: o */
        public int f3729o;

        /* loaded from: classes.dex */
        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        /* loaded from: classes.dex */
        public class C1565a implements ViewBoundsCheck.InterfaceC1608b {
            public C1565a() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: a */
            public final int mo10187a(View view) {
                LayoutManager.this.getClass();
                return LayoutManager.m10346B(view) - ((ViewGroup.MarginLayoutParams) ((C1579k) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: b */
            public final int mo10186b() {
                return LayoutManager.this.m10339H();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: c */
            public final int mo10185c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.f3728n - layoutManager.m10338I();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: d */
            public final View mo10184d(int i) {
                return LayoutManager.this.m10315v(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: e */
            public final int mo10183e(View view) {
                LayoutManager.this.getClass();
                return LayoutManager.m10344C(view) + ((ViewGroup.MarginLayoutParams) ((C1579k) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        /* loaded from: classes.dex */
        public class C1566b implements ViewBoundsCheck.InterfaceC1608b {
            public C1566b() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: a */
            public final int mo10187a(View view) {
                LayoutManager.this.getClass();
                return LayoutManager.m10343D(view) - ((ViewGroup.MarginLayoutParams) ((C1579k) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: b */
            public final int mo10186b() {
                return LayoutManager.this.m10337J();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: c */
            public final int mo10185c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.f3729o - layoutManager.m10340G();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: d */
            public final View mo10184d(int i) {
                return LayoutManager.this.m10315v(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC1608b
            /* renamed from: e */
            public final int mo10183e(View view) {
                LayoutManager.this.getClass();
                return LayoutManager.m10307z(view) + ((ViewGroup.MarginLayoutParams) ((C1579k) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        /* loaded from: classes.dex */
        public interface InterfaceC1567c {
        }

        public LayoutManager() {
            C1565a c1565a = new C1565a();
            C1566b c1566b = new C1566b();
            this.f3717c = new ViewBoundsCheck(c1565a);
            this.f3718d = new ViewBoundsCheck(c1566b);
            this.f3720f = false;
            this.f3721g = false;
            this.f3722h = true;
            this.f3723i = true;
        }

        /* renamed from: B */
        public static int m10346B(@NonNull View view) {
            return view.getLeft() - ((C1579k) view.getLayoutParams()).f3739b.left;
        }

        /* renamed from: C */
        public static int m10344C(@NonNull View view) {
            return view.getRight() + ((C1579k) view.getLayoutParams()).f3739b.right;
        }

        /* renamed from: D */
        public static int m10343D(@NonNull View view) {
            return view.getTop() - ((C1579k) view.getLayoutParams()).f3739b.top;
        }

        /* renamed from: K */
        public static int m10336K(@NonNull View view) {
            return ((C1579k) view.getLayoutParams()).m10298a();
        }

        /* renamed from: L */
        public static Properties m10335L(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553a.f3576a, i, i2);
            properties.orientation = obtainStyledAttributes.getInt(0, 1);
            properties.spanCount = obtainStyledAttributes.getInt(10, 1);
            properties.reverseLayout = obtainStyledAttributes.getBoolean(9, false);
            properties.stackFromEnd = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        /* renamed from: P */
        public static boolean m10332P(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: Q */
        public static void m10331Q(@NonNull View view, int i, int i2, int i3, int i4) {
            C1579k c1579k = (C1579k) view.getLayoutParams();
            Rect rect = c1579k.f3739b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1579k).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1579k).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1579k).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1579k).bottomMargin);
        }

        /* renamed from: h */
        public static int m10326h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m10311x(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m10311x(int, int, int, int, boolean):int");
        }

        /* renamed from: z */
        public static int m10307z(@NonNull View view) {
            return view.getBottom() + ((C1579k) view.getLayoutParams()).f3739b.bottom;
        }

        /* renamed from: A */
        public void mo4713A(@NonNull View view, @NonNull Rect rect) {
            int[] iArr = RecyclerView.f3629D0;
            C1579k c1579k = (C1579k) view.getLayoutParams();
            Rect rect2 = c1579k.f3739b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1579k).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1579k).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1579k).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1579k).bottomMargin);
        }

        /* renamed from: A0 */
        public void mo4606A0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: B0 */
        public final void m10345B0(C1640o c1640o) {
            AbstractC1591u abstractC1591u = this.f3719e;
            if (abstractC1591u != null && c1640o != abstractC1591u && abstractC1591u.f3762e) {
                abstractC1591u.m10279d();
            }
            this.f3719e = c1640o;
            RecyclerView recyclerView = this.f3716b;
            RunnableC1596x runnableC1596x = recyclerView.f3670h0;
            RecyclerView.this.removeCallbacks(runnableC1596x);
            runnableC1596x.f3789c.abortAnimation();
            if (c1640o.f3765h) {
                Log.w("RecyclerView", "An instance of " + c1640o.getClass().getSimpleName() + " was started more than once. Each instance of" + c1640o.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            c1640o.f3759b = recyclerView;
            c1640o.f3760c = this;
            int i = c1640o.f3758a;
            if (i != -1) {
                recyclerView.f3676k0.f3773a = i;
                c1640o.f3762e = true;
                c1640o.f3761d = true;
                c1640o.f3763f = recyclerView.f3679m.mo10318r(i);
                c1640o.f3759b.f3670h0.m10275b();
                c1640o.f3765h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: C0 */
        public boolean mo10273C0() {
            return false;
        }

        /* renamed from: E */
        public final int m10342E() {
            RecyclerView recyclerView = this.f3716b;
            AbstractC1572e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: F */
        public final int m10341F() {
            RecyclerView recyclerView = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return ViewCompat.C0815e.m11742d(recyclerView);
        }

        @InterfaceC0074Px
        /* renamed from: G */
        public final int m10340G() {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @InterfaceC0074Px
        /* renamed from: H */
        public final int m10339H() {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @InterfaceC0074Px
        /* renamed from: I */
        public final int m10338I() {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @InterfaceC0074Px
        /* renamed from: J */
        public final int m10337J() {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: M */
        public int mo10334M(@NonNull C1586q c1586q, @NonNull C1594v c1594v) {
            return -1;
        }

        /* renamed from: N */
        public final void m10333N(@NonNull View view, @NonNull Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C1579k) view.getLayoutParams()).f3739b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f3716b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3716b.f3675k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: O */
        public boolean mo10261O() {
            return false;
        }

        /* renamed from: R */
        public void mo10257R(@InterfaceC0074Px int i) {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                int m10164e = recyclerView.f3663e.m10164e();
                for (int i2 = 0; i2 < m10164e; i2++) {
                    recyclerView.f3663e.m10165d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: S */
        public void mo10255S(@InterfaceC0074Px int i) {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                int m10164e = recyclerView.f3663e.m10164e();
                for (int i2 = 0; i2 < m10164e; i2++) {
                    recyclerView.f3663e.m10165d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: T */
        public void mo10253T() {
        }

        @CallSuper
        /* renamed from: U */
        public void mo10251U(RecyclerView recyclerView) {
        }

        @Nullable
        /* renamed from: V */
        public View mo10249V(@NonNull View view, int i, @NonNull C1586q c1586q, @NonNull C1594v c1594v) {
            return null;
        }

        /* renamed from: W */
        public void mo4696W(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3716b;
            C1586q c1586q = recyclerView.f3659b;
            C1594v c1594v = recyclerView.f3676k0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3716b.canScrollVertically(-1) && !this.f3716b.canScrollHorizontally(-1) && !this.f3716b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC1572e abstractC1572e = this.f3716b.f3677l;
                if (abstractC1572e != null) {
                    accessibilityEvent.setItemCount(abstractC1572e.getItemCount());
                }
            }
        }

        /* renamed from: X */
        public final void m10330X(View view, C0874o c0874o) {
            AbstractC1597y m10398J = RecyclerView.m10398J(view);
            if (m10398J == null || m10398J.isRemoved() || this.f3715a.m10159j(m10398J.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f3716b;
            mo10329Y(recyclerView.f3659b, recyclerView.f3676k0, view, c0874o);
        }

        /* renamed from: Y */
        public void mo10329Y(@NonNull C1586q c1586q, @NonNull C1594v c1594v, @NonNull View view, @NonNull C0874o c0874o) {
        }

        /* renamed from: Z */
        public void mo10244Z(int i, int i2) {
        }

        /* renamed from: a0 */
        public void mo10241a0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m10328b(android.view.View r9, boolean r10, int r11) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m10328b(android.view.View, boolean, int):void");
        }

        /* renamed from: b0 */
        public void mo10239b0(int i, int i2) {
        }

        /* renamed from: c */
        public void mo10237c(String str) {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                recyclerView.m10368i(str);
            }
        }

        /* renamed from: c0 */
        public void mo10236c0(int i, int i2) {
        }

        /* renamed from: d */
        public final void m10327d(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m10397K(view));
            }
        }

        /* renamed from: d0 */
        public void mo10234d0(int i, int i2) {
        }

        /* renamed from: e */
        public boolean mo10232e() {
            return this instanceof CarouselLayoutManager;
        }

        /* renamed from: e0 */
        public void mo4695e0(C1586q c1586q, C1594v c1594v) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: f */
        public boolean mo10230f() {
            return false;
        }

        /* renamed from: f0 */
        public void mo4694f0(C1594v c1594v) {
        }

        /* renamed from: g */
        public boolean mo10228g(C1579k c1579k) {
            return c1579k != null;
        }

        /* renamed from: g0 */
        public void mo10227g0(Parcelable parcelable) {
        }

        @Nullable
        /* renamed from: h0 */
        public Parcelable mo10225h0() {
            return null;
        }

        /* renamed from: i */
        public void mo10223i(int i, int i2, C1594v c1594v, InterfaceC1567c interfaceC1567c) {
        }

        /* renamed from: i0 */
        public void mo10222i0(int i) {
        }

        /* renamed from: j */
        public void mo10325j(int i, InterfaceC1567c interfaceC1567c) {
        }

        /* renamed from: j0 */
        public final void m10324j0(@NonNull C1586q c1586q) {
            int m10313w = m10313w();
            while (true) {
                m10313w--;
                if (m10313w >= 0) {
                    if (!RecyclerView.m10398J(m10315v(m10313w)).shouldIgnore()) {
                        View m10315v = m10315v(m10313w);
                        m10321m0(m10313w);
                        c1586q.m10288g(m10315v);
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: k */
        public int mo4693k(@NonNull C1594v c1594v) {
            return 0;
        }

        /* renamed from: k0 */
        public final void m10323k0(C1586q c1586q) {
            ArrayList<AbstractC1597y> arrayList;
            int size = c1586q.f3748a.size();
            int i = size - 1;
            while (true) {
                arrayList = c1586q.f3748a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                AbstractC1597y m10398J = RecyclerView.m10398J(view);
                if (!m10398J.shouldIgnore()) {
                    m10398J.setIsRecyclable(false);
                    if (m10398J.isTmpDetached()) {
                        this.f3716b.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.f3716b.f3647M;
                    if (itemAnimator != null) {
                        itemAnimator.mo10145d(m10398J);
                    }
                    m10398J.setIsRecyclable(true);
                    AbstractC1597y m10398J2 = RecyclerView.m10398J(view);
                    m10398J2.mScrapContainer = null;
                    m10398J2.mInChangeScrap = false;
                    m10398J2.clearReturnedFromScrapFlag();
                    c1586q.m10287h(m10398J2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<AbstractC1597y> arrayList2 = c1586q.f3749b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f3716b.invalidate();
            }
        }

        /* renamed from: l */
        public int mo4692l(@NonNull C1594v c1594v) {
            return 0;
        }

        /* renamed from: l0 */
        public final void m10322l0(@NonNull View view, @NonNull C1586q c1586q) {
            C1614b c1614b = this.f3715a;
            C1648v c1648v = (C1648v) c1614b.f3871a;
            int indexOfChild = c1648v.f4007a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c1614b.f3872b.m10152f(indexOfChild)) {
                    c1614b.m10158k(view);
                }
                c1648v.m10103b(indexOfChild);
            }
            c1586q.m10288g(view);
        }

        /* renamed from: m */
        public int mo4691m(@NonNull C1594v c1594v) {
            return 0;
        }

        /* renamed from: m0 */
        public final void m10321m0(int i) {
            if (m10315v(i) != null) {
                C1614b c1614b = this.f3715a;
                int m10163f = c1614b.m10163f(i);
                C1648v c1648v = (C1648v) c1614b.f3871a;
                View childAt = c1648v.f4007a.getChildAt(m10163f);
                if (childAt != null) {
                    if (c1614b.f3872b.m10152f(m10163f)) {
                        c1614b.m10158k(childAt);
                    }
                    c1648v.m10103b(m10163f);
                }
            }
        }

        /* renamed from: n */
        public int mo10221n(@NonNull C1594v c1594v) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
            if (r10 == false) goto L20;
         */
        /* renamed from: n0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo4690n0(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9, @androidx.annotation.NonNull android.view.View r10, @androidx.annotation.NonNull android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.m10339H()
                int r1 = r8.m10337J()
                int r2 = r8.f3728n
                int r3 = r8.m10338I()
                int r2 = r2 - r3
                int r3 = r8.f3729o
                int r4 = r8.m10340G()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.m10341F()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Lab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L74
                goto La8
            L74:
                int r11 = r8.m10339H()
                int r13 = r8.m10337J()
                int r3 = r8.f3728n
                int r4 = r8.m10338I()
                int r3 = r3 - r4
                int r4 = r8.f3729o
                int r5 = r8.m10340G()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f3716b
                android.graphics.Rect r5 = r5.f3671i
                r8.mo4713A(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto La8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto La8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto La8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La6
                goto La8
            La6:
                r10 = r7
                goto La9
            La8:
                r10 = r0
            La9:
                if (r10 == 0) goto Lb0
            Lab:
                if (r2 != 0) goto Lb1
                if (r1 == 0) goto Lb0
                goto Lb1
            Lb0:
                return r0
            Lb1:
                if (r12 == 0) goto Lb7
                r9.scrollBy(r2, r1)
                goto Lba
            Lb7:
                r9.m10379b0(r2, r1, r0)
            Lba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.mo4690n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: o */
        public int mo10220o(@NonNull C1594v c1594v) {
            return 0;
        }

        /* renamed from: o0 */
        public final void m10320o0() {
            RecyclerView recyclerView = this.f3716b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: p */
        public int mo10219p(@NonNull C1594v c1594v) {
            return 0;
        }

        /* renamed from: p0 */
        public int mo4689p0(int i, C1586q c1586q, C1594v c1594v) {
            return 0;
        }

        /* renamed from: q */
        public final void m10319q(@NonNull C1586q c1586q) {
            int m10313w = m10313w();
            while (true) {
                m10313w--;
                if (m10313w >= 0) {
                    View m10315v = m10315v(m10313w);
                    AbstractC1597y m10398J = RecyclerView.m10398J(m10315v);
                    if (!m10398J.shouldIgnore()) {
                        if (m10398J.isInvalid() && !m10398J.isRemoved() && !this.f3716b.f3677l.hasStableIds()) {
                            m10321m0(m10313w);
                            c1586q.m10287h(m10398J);
                        } else {
                            m10315v(m10313w);
                            this.f3715a.m10166c(m10313w);
                            c1586q.m10286i(m10315v);
                            this.f3716b.f3665f.m10148b(m10398J);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: q0 */
        public void mo4688q0(int i) {
        }

        @Nullable
        /* renamed from: r */
        public View mo10318r(int i) {
            int m10313w = m10313w();
            for (int i2 = 0; i2 < m10313w; i2++) {
                View m10315v = m10315v(i2);
                AbstractC1597y m10398J = RecyclerView.m10398J(m10315v);
                if (m10398J != null && m10398J.getLayoutPosition() == i && !m10398J.shouldIgnore() && (this.f3716b.f3676k0.f3779g || !m10398J.isRemoved())) {
                    return m10315v;
                }
            }
            return null;
        }

        /* renamed from: r0 */
        public int mo10218r0(int i, C1586q c1586q, C1594v c1594v) {
            return 0;
        }

        /* renamed from: s */
        public abstract C1579k mo4687s();

        /* renamed from: s0 */
        public final void m10317s0(RecyclerView recyclerView) {
            m10316t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: t */
        public C1579k mo10217t(Context context, AttributeSet attributeSet) {
            return new C1579k(context, attributeSet);
        }

        /* renamed from: t0 */
        public final void m10316t0(int i, int i2) {
            this.f3728n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3726l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f3629D0;
            }
            this.f3729o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3727m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f3629D0;
            }
        }

        /* renamed from: u */
        public C1579k mo10216u(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1579k ? new C1579k((C1579k) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1579k((ViewGroup.MarginLayoutParams) layoutParams) : new C1579k(layoutParams);
        }

        /* renamed from: u0 */
        public void mo10215u0(Rect rect, int i, int i2) {
            int m10338I = m10338I() + m10339H() + rect.width();
            int m10340G = m10340G() + m10337J() + rect.height();
            RecyclerView recyclerView = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            this.f3716b.setMeasuredDimension(m10326h(i, m10338I, ViewCompat.C0814d.m11760e(recyclerView)), m10326h(i2, m10340G, ViewCompat.C0814d.m11761d(this.f3716b)));
        }

        @Nullable
        /* renamed from: v */
        public final View m10315v(int i) {
            C1614b c1614b = this.f3715a;
            if (c1614b != null) {
                return c1614b.m10165d(i);
            }
            return null;
        }

        /* renamed from: v0 */
        public final void m10314v0(int i, int i2) {
            int m10313w = m10313w();
            if (m10313w == 0) {
                this.f3716b.m10363n(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m10313w; i7++) {
                View m10315v = m10315v(i7);
                Rect rect = this.f3716b.f3671i;
                mo4713A(m10315v, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f3716b.f3671i.set(i6, i4, i3, i5);
            mo10215u0(this.f3716b.f3671i, i, i2);
        }

        /* renamed from: w */
        public final int m10313w() {
            C1614b c1614b = this.f3715a;
            if (c1614b != null) {
                return c1614b.m10164e();
            }
            return 0;
        }

        /* renamed from: w0 */
        public final void m10312w0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3716b = null;
                this.f3715a = null;
                height = 0;
                this.f3728n = 0;
            } else {
                this.f3716b = recyclerView;
                this.f3715a = recyclerView.f3663e;
                this.f3728n = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3729o = height;
            this.f3726l = 1073741824;
            this.f3727m = 1073741824;
        }

        /* renamed from: x0 */
        public final boolean m10310x0(View view, int i, int i2, C1579k c1579k) {
            return (!view.isLayoutRequested() && this.f3722h && m10332P(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1579k).width) && m10332P(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1579k).height)) ? false : true;
        }

        /* renamed from: y */
        public int mo10309y(@NonNull C1586q c1586q, @NonNull C1594v c1594v) {
            return -1;
        }

        /* renamed from: y0 */
        public boolean mo10308y0() {
            return false;
        }

        /* renamed from: z0 */
        public final boolean m10306z0(View view, int i, int i2, C1579k c1579k) {
            return (this.f3722h && m10332P(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1579k).width) && m10332P(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1579k).height)) ? false : true;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface Orientation {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    public class RunnableC1568a implements Runnable {
        public RunnableC1568a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f3695u || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.f3691s) {
                recyclerView.requestLayout();
            } else if (recyclerView.f3701x) {
                recyclerView.f3699w = true;
            } else {
                recyclerView.m10364m();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    public class RunnableC1569b implements Runnable {
        public RunnableC1569b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            long j2;
            RecyclerView recyclerView = RecyclerView.this;
            ItemAnimator itemAnimator = recyclerView.f3647M;
            if (itemAnimator != null) {
                C1627k c1627k = (C1627k) itemAnimator;
                ArrayList<AbstractC1597y> arrayList = c1627k.f3911h;
                boolean z = !arrayList.isEmpty();
                ArrayList<C1627k.C1629b> arrayList2 = c1627k.f3913j;
                boolean z2 = !arrayList2.isEmpty();
                ArrayList<C1627k.C1628a> arrayList3 = c1627k.f3914k;
                boolean z3 = !arrayList3.isEmpty();
                ArrayList<AbstractC1597y> arrayList4 = c1627k.f3912i;
                boolean z4 = !arrayList4.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<AbstractC1597y> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j = c1627k.f3710d;
                        if (!hasNext) {
                            break;
                        }
                        AbstractC1597y next = it.next();
                        View view = next.itemView;
                        ViewPropertyAnimator animate = view.animate();
                        c1627k.f3920q.add(next);
                        animate.setDuration(j).alpha(0.0f).setListener(new C1622f(view, animate, c1627k, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z2) {
                        ArrayList<C1627k.C1629b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        c1627k.f3916m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC1619c runnableC1619c = new RunnableC1619c(c1627k, arrayList5);
                        if (z) {
                            View view2 = arrayList5.get(0).f3928a.itemView;
                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                            ViewCompat.C0814d.m11751n(view2, runnableC1619c, j);
                        } else {
                            runnableC1619c.run();
                        }
                    }
                    if (z3) {
                        ArrayList<C1627k.C1628a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        c1627k.f3917n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC1620d runnableC1620d = new RunnableC1620d(c1627k, arrayList6);
                        if (z) {
                            View view3 = arrayList6.get(0).f3922a.itemView;
                            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                            ViewCompat.C0814d.m11751n(view3, runnableC1620d, j);
                        } else {
                            runnableC1620d.run();
                        }
                    }
                    if (z4) {
                        ArrayList<AbstractC1597y> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        c1627k.f3915l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC1621e runnableC1621e = new RunnableC1621e(c1627k, arrayList7);
                        if (!z && !z2 && !z3) {
                            runnableC1621e.run();
                        } else {
                            long j3 = 0;
                            if (!z) {
                                j = 0;
                            }
                            if (z2) {
                                j2 = c1627k.f3711e;
                            } else {
                                j2 = 0;
                            }
                            if (z3) {
                                j3 = c1627k.f3712f;
                            }
                            View view4 = arrayList7.get(0).itemView;
                            WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                            ViewCompat.C0814d.m11751n(view4, runnableC1621e, Math.max(j2, j3) + j);
                        }
                    }
                }
            }
            recyclerView.f3688q0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC1570c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    public class C1571d {
        public C1571d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1572e<VH extends AbstractC1597y> {
        private final C1574f mObservable = new C1574f();
        private boolean mHasStableIds = false;
        private EnumC1573a mStateRestorationPolicy = EnumC1573a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$e$a */
        /* loaded from: classes.dex */
        public enum EnumC1573a {
            ALLOW,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT_WHEN_EMPTY,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT
        }

        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = C0749q.f2431a;
                C0749q.C0750a.m11833a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C1579k) {
                    ((C1579k) layoutParams).f3740c = true;
                }
                int i3 = C0749q.f2431a;
                C0749q.C0750a.m11832b();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                int i2 = C0749q.f2431a;
                C0749q.C0750a.m11833a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    C0749q.C0750a.m11832b();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = C0749q.f2431a;
                C0749q.C0750a.m11832b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull AbstractC1572e<? extends AbstractC1597y> abstractC1572e, @NonNull AbstractC1597y abstractC1597y, int i) {
            if (abstractC1572e == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final EnumC1573a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m10305a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m10304b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m10302d(i, 1, null);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.m10302d(i, 1, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m10301e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m10303c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m10302d(i, i2, null);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.m10302d(i, i2, obj);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m10301e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m10300f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m10300f(i, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull AbstractC1575g abstractC1575g) {
            this.mObservable.registerObserver(abstractC1575g);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull EnumC1573a enumC1573a) {
            this.mStateRestorationPolicy = enumC1573a;
            this.mObservable.m10299g();
        }

        public void unregisterAdapterDataObserver(@NonNull AbstractC1575g abstractC1575g) {
            this.mObservable.unregisterObserver(abstractC1575g);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public static class C1574f extends Observable<AbstractC1575g> {
        /* renamed from: a */
        public final boolean m10305a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public final void m10304b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public final void m10303c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* renamed from: d */
        public final void m10302d(int i, int i2, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* renamed from: e */
        public final void m10301e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* renamed from: f */
        public final void m10300f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* renamed from: g */
        public final void m10299g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1575g) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1575g {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public interface InterfaceC1576h {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public class C1577i implements ItemAnimator.InterfaceC1563b {
        public C1577i() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1578j {
        /* renamed from: c */
        public void mo69c(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull C1594v c1594v) {
            ((C1579k) view.getLayoutParams()).m10298a();
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: d */
        public void mo68d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C1594v c1594v) {
        }

        /* renamed from: e */
        public void mo67e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C1594v c1594v) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C1579k extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC1597y f3738a;

        /* renamed from: b */
        public final Rect f3739b;

        /* renamed from: c */
        public boolean f3740c;

        /* renamed from: d */
        public boolean f3741d;

        public C1579k(int i, int i2) {
            super(i, i2);
            this.f3739b = new Rect();
            this.f3740c = true;
            this.f3741d = false;
        }

        public C1579k(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3739b = new Rect();
            this.f3740c = true;
            this.f3741d = false;
        }

        public C1579k(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3739b = new Rect();
            this.f3740c = true;
            this.f3741d = false;
        }

        public C1579k(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3739b = new Rect();
            this.f3740c = true;
            this.f3741d = false;
        }

        public C1579k(C1579k c1579k) {
            super((ViewGroup.LayoutParams) c1579k);
            this.f3739b = new Rect();
            this.f3740c = true;
            this.f3741d = false;
        }

        /* renamed from: a */
        public final int m10298a() {
            return this.f3738a.getLayoutPosition();
        }

        /* renamed from: b */
        public final boolean m10297b() {
            return this.f3738a.isUpdated();
        }

        /* renamed from: c */
        public final boolean m10296c() {
            return this.f3738a.isRemoved();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC1580l {
        /* renamed from: a */
        void mo9361a(@NonNull View view);

        /* renamed from: b */
        void mo9360b(@NonNull View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1581m {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC1582n {
        /* renamed from: a */
        boolean mo10137a(@NonNull MotionEvent motionEvent);

        /* renamed from: b */
        void mo10136b(boolean z);

        void onTouchEvent(@NonNull MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1583o {
        /* renamed from: a */
        public void mo4583a(int i, @NonNull RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo4582b(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static class C1584p {

        /* renamed from: a */
        public final SparseArray<C1585a> f3742a = new SparseArray<>();

        /* renamed from: b */
        public int f3743b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: classes.dex */
        public static class C1585a {

            /* renamed from: a */
            public final ArrayList<AbstractC1597y> f3744a = new ArrayList<>();

            /* renamed from: b */
            public final int f3745b = 5;

            /* renamed from: c */
            public long f3746c = 0;

            /* renamed from: d */
            public long f3747d = 0;
        }

        /* renamed from: a */
        public final C1585a m10295a(int i) {
            SparseArray<C1585a> sparseArray = this.f3742a;
            C1585a c1585a = sparseArray.get(i);
            if (c1585a == null) {
                C1585a c1585a2 = new C1585a();
                sparseArray.put(i, c1585a2);
                return c1585a2;
            }
            return c1585a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public final class C1586q {

        /* renamed from: a */
        public final ArrayList<AbstractC1597y> f3748a;

        /* renamed from: b */
        public ArrayList<AbstractC1597y> f3749b;

        /* renamed from: c */
        public final ArrayList<AbstractC1597y> f3750c;

        /* renamed from: d */
        public final List<AbstractC1597y> f3751d;

        /* renamed from: e */
        public int f3752e;

        /* renamed from: f */
        public int f3753f;

        /* renamed from: g */
        public C1584p f3754g;

        public C1586q() {
            ArrayList<AbstractC1597y> arrayList = new ArrayList<>();
            this.f3748a = arrayList;
            this.f3749b = null;
            this.f3750c = new ArrayList<>();
            this.f3751d = Collections.unmodifiableList(arrayList);
            this.f3752e = 2;
            this.f3753f = 2;
        }

        /* renamed from: a */
        public final void m10294a(@NonNull AbstractC1597y abstractC1597y, boolean z) {
            C0851a c0851a;
            RecyclerView.m10367j(abstractC1597y);
            View view = abstractC1597y.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            C1650x c1650x = recyclerView.f3690r0;
            if (c1650x != null) {
                C1650x.C1651a c1651a = c1650x.f4010e;
                if (c1651a instanceof C1650x.C1651a) {
                    c0851a = (C0851a) c1651a.f4012e.remove(view);
                } else {
                    c0851a = null;
                }
                ViewCompat.m11771n(view, c0851a);
            }
            if (z) {
                InterfaceC1587r interfaceC1587r = recyclerView.f3681n;
                if (interfaceC1587r != null) {
                    interfaceC1587r.m10282a();
                }
                ArrayList arrayList = recyclerView.f3683o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1587r) arrayList.get(i)).m10282a();
                }
                AbstractC1572e abstractC1572e = recyclerView.f3677l;
                if (abstractC1572e != null) {
                    abstractC1572e.onViewRecycled(abstractC1597y);
                }
                if (recyclerView.f3676k0 != null) {
                    recyclerView.f3665f.m10147c(abstractC1597y);
                }
            }
            abstractC1597y.mBindingAdapter = null;
            abstractC1597y.mOwnerRecyclerView = null;
            C1584p m10292c = m10292c();
            m10292c.getClass();
            int itemViewType = abstractC1597y.getItemViewType();
            ArrayList<AbstractC1597y> arrayList2 = m10292c.m10295a(itemViewType).f3744a;
            if (m10292c.f3742a.get(itemViewType).f3745b > arrayList2.size()) {
                abstractC1597y.resetInternal();
                arrayList2.add(abstractC1597y);
            }
        }

        /* renamed from: b */
        public final int m10293b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.f3676k0.m10276b()) {
                if (!recyclerView.f3676k0.f3779g) {
                    return i;
                }
                return recyclerView.f3661d.m10177f(i, 0);
            }
            StringBuilder m12536b = C0406q1.m12536b("invalid position ", i, ". State item count is ");
            m12536b.append(recyclerView.f3676k0.m10276b());
            m12536b.append(recyclerView.m10351z());
            throw new IndexOutOfBoundsException(m12536b.toString());
        }

        /* renamed from: c */
        public final C1584p m10292c() {
            if (this.f3754g == null) {
                this.f3754g = new C1584p();
            }
            return this.f3754g;
        }

        @NonNull
        /* renamed from: d */
        public final View m10291d(int i) {
            return m10285j(Long.MAX_VALUE, i).itemView;
        }

        /* renamed from: e */
        public final void m10290e() {
            ArrayList<AbstractC1597y> arrayList = this.f3750c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m10289f(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.f3629D0;
            RunnableC1635m.C1637b c1637b = RecyclerView.this.f3674j0;
            int[] iArr2 = c1637b.f3976c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            c1637b.f3977d = 0;
        }

        /* renamed from: f */
        public final void m10289f(int i) {
            ArrayList<AbstractC1597y> arrayList = this.f3750c;
            m10294a(arrayList.get(i), true);
            arrayList.remove(i);
        }

        /* renamed from: g */
        public final void m10288g(@NonNull View view) {
            AbstractC1597y m10398J = RecyclerView.m10398J(view);
            boolean isTmpDetached = m10398J.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (m10398J.isScrap()) {
                m10398J.unScrap();
            } else if (m10398J.wasReturnedFromScrap()) {
                m10398J.clearReturnedFromScrapFlag();
            }
            m10287h(m10398J);
            if (recyclerView.f3647M == null || m10398J.isRecyclable()) {
                return;
            }
            recyclerView.f3647M.mo10145d(m10398J);
        }

        /* renamed from: h */
        public final void m10287h(AbstractC1597y abstractC1597y) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean isScrap = abstractC1597y.isScrap();
            boolean z6 = false;
            RecyclerView recyclerView = RecyclerView.this;
            if (!isScrap && abstractC1597y.itemView.getParent() == null) {
                if (!abstractC1597y.isTmpDetached()) {
                    if (!abstractC1597y.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = abstractC1597y.doesTransientStatePreventRecycling();
                        AbstractC1572e abstractC1572e = recyclerView.f3677l;
                        if (abstractC1572e != null && doesTransientStatePreventRecycling && abstractC1572e.onFailedToRecycleView(abstractC1597y)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !abstractC1597y.isRecyclable()) {
                            z3 = false;
                        } else {
                            if (this.f3753f > 0 && !abstractC1597y.hasAnyOfTheFlags(526)) {
                                ArrayList<AbstractC1597y> arrayList = this.f3750c;
                                int size = arrayList.size();
                                if (size >= this.f3753f && size > 0) {
                                    m10289f(0);
                                    size--;
                                }
                                int[] iArr = RecyclerView.f3629D0;
                                if (size > 0) {
                                    int i = abstractC1597y.mPosition;
                                    RunnableC1635m.C1637b c1637b = recyclerView.f3674j0;
                                    if (c1637b.f3976c != null) {
                                        int i2 = c1637b.f3977d * 2;
                                        for (int i3 = 0; i3 < i2; i3 += 2) {
                                            if (c1637b.f3976c[i3] == i) {
                                                z4 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                        do {
                                            size--;
                                            if (size < 0) {
                                                break;
                                            }
                                            int i4 = arrayList.get(size).mPosition;
                                            if (c1637b.f3976c != null) {
                                                int i5 = c1637b.f3977d * 2;
                                                for (int i6 = 0; i6 < i5; i6 += 2) {
                                                    if (c1637b.f3976c[i6] == i4) {
                                                        z5 = true;
                                                        continue;
                                                        break;
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            continue;
                                        } while (z5);
                                        size++;
                                    }
                                }
                                arrayList.add(size, abstractC1597y);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                m10294a(abstractC1597y, true);
                                z6 = true;
                            }
                            z3 = z6;
                            z6 = z2;
                        }
                        recyclerView.f3665f.m10147c(abstractC1597y);
                        if (!z6 && !z3 && doesTransientStatePreventRecycling) {
                            abstractC1597y.mBindingAdapter = null;
                            abstractC1597y.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.m10351z());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1597y + recyclerView.m10351z());
            }
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC1597y.isScrap());
            sb.append(" isAttached:");
            if (abstractC1597y.itemView.getParent() != null) {
                z6 = true;
            }
            sb.append(z6);
            sb.append(recyclerView.m10351z());
            throw new IllegalArgumentException(sb.toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m10286i(android.view.View r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$y r6 = androidx.recyclerview.widget.RecyclerView.m10398J(r6)
                r0 = 12
                boolean r0 = r6.hasAnyOfTheFlags(r0)
                r1 = 0
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                if (r0 != 0) goto L54
                boolean r0 = r6.isUpdated()
                if (r0 == 0) goto L54
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.f3647M
                r3 = 1
                if (r0 == 0) goto L3f
                java.util.List r4 = r6.getUnmodifiedPayloads()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.C1627k) r0
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L39
                boolean r0 = r0.f4013g
                if (r0 == 0) goto L33
                boolean r0 = r6.isInvalid()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = r1
                goto L34
            L33:
                r0 = r3
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r1
                goto L3a
            L39:
                r0 = r3
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r1
                goto L40
            L3f:
                r0 = r3
            L40:
                if (r0 == 0) goto L43
                goto L54
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$y> r0 = r5.f3749b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f3749b = r0
            L4e:
                r6.setScrapContainer(r5, r3)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$y> r0 = r5.f3749b
                goto L86
            L54:
                boolean r0 = r6.isInvalid()
                if (r0 == 0) goto L81
                boolean r0 = r6.isRemoved()
                if (r0 != 0) goto L81
                androidx.recyclerview.widget.RecyclerView$e r0 = r2.f3677l
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L69
                goto L81
            L69:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.<init>(r1)
                java.lang.String r1 = r2.m10351z()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L81:
                r6.setScrapContainer(r5, r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$y> r0 = r5.f3748a
            L86:
                r0.add(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1586q.m10286i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:234:0x0423, code lost:
            if (r9 == false) goto L223;
         */
        /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x040c  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0460  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x04a1  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x04a6  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04b1  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x04cf A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
        @androidx.annotation.Nullable
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.AbstractC1597y m10285j(long r20, int r22) {
            /*
                Method dump skipped, instructions count: 1273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1586q.m10285j(long, int):androidx.recyclerview.widget.RecyclerView$y");
        }

        /* renamed from: k */
        public final void m10284k(AbstractC1597y abstractC1597y) {
            (abstractC1597y.mInChangeScrap ? this.f3749b : this.f3748a).remove(abstractC1597y);
            abstractC1597y.mScrapContainer = null;
            abstractC1597y.mInChangeScrap = false;
            abstractC1597y.clearReturnedFromScrapFlag();
        }

        /* renamed from: l */
        public final void m10283l() {
            LayoutManager layoutManager = RecyclerView.this.f3679m;
            this.f3753f = this.f3752e + (layoutManager != null ? layoutManager.f3724j : 0);
            ArrayList<AbstractC1597y> arrayList = this.f3750c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3753f; size--) {
                m10289f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public interface InterfaceC1587r {
        /* renamed from: a */
        void m10282a();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public class C1588s extends AbstractC1575g {
        public C1588s() {
        }

        /* renamed from: a */
        public final void m10281a() {
            int[] iArr = RecyclerView.f3629D0;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3693t && recyclerView.f3691s) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11752m(recyclerView, recyclerView.f3669h);
                return;
            }
            recyclerView.f3632A = true;
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m10368i(null);
            recyclerView.f3676k0.f3778f = true;
            recyclerView.m10387U(true);
            if (recyclerView.f3661d.m10176g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m10368i(null);
            C1609a c1609a = recyclerView.f3661d;
            boolean z = false;
            if (i2 < 1) {
                c1609a.getClass();
            } else {
                ArrayList<C1609a.C1611b> arrayList = c1609a.f3858b;
                arrayList.add(c1609a.m10175h(obj, 4, i, i2));
                c1609a.f3862f |= 4;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m10281a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m10368i(null);
            C1609a c1609a = recyclerView.f3661d;
            boolean z = false;
            if (i2 < 1) {
                c1609a.getClass();
            } else {
                ArrayList<C1609a.C1611b> arrayList = c1609a.f3858b;
                arrayList.add(c1609a.m10175h(null, 1, i, i2));
                c1609a.f3862f |= 1;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m10281a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m10368i(null);
            C1609a c1609a = recyclerView.f3661d;
            c1609a.getClass();
            boolean z = false;
            if (i != i2) {
                if (i3 == 1) {
                    ArrayList<C1609a.C1611b> arrayList = c1609a.f3858b;
                    arrayList.add(c1609a.m10175h(null, 8, i, i2));
                    c1609a.f3862f |= 8;
                    if (arrayList.size() == 1) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z) {
                m10281a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m10368i(null);
            C1609a c1609a = recyclerView.f3661d;
            boolean z = false;
            if (i2 < 1) {
                c1609a.getClass();
            } else {
                ArrayList<C1609a.C1611b> arrayList = c1609a.f3858b;
                arrayList.add(c1609a.m10175h(null, 2, i, i2));
                c1609a.f3862f |= 2;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m10281a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public final void onStateRestorationPolicyChanged() {
            AbstractC1572e abstractC1572e;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3660c == null || (abstractC1572e = recyclerView.f3677l) == null || !abstractC1572e.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static class C1589t extends AbstractC1068a {
        public static final Parcelable.Creator<C1589t> CREATOR = new C1590a();

        /* renamed from: c */
        public Parcelable f3757c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$t$a */
        /* loaded from: classes.dex */
        public class C1590a implements Parcelable.ClassLoaderCreator<C1589t> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1589t(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1589t[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1589t createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1589t(parcel, classLoader);
            }
        }

        public C1589t(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3757c = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        public C1589t(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeParcelable(this.f3757c, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1591u {

        /* renamed from: b */
        public RecyclerView f3759b;

        /* renamed from: c */
        public LayoutManager f3760c;

        /* renamed from: d */
        public boolean f3761d;

        /* renamed from: e */
        public boolean f3762e;

        /* renamed from: f */
        public View f3763f;

        /* renamed from: h */
        public boolean f3765h;

        /* renamed from: a */
        public int f3758a = -1;

        /* renamed from: g */
        public final C1592a f3764g = new C1592a();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class C1592a {

            /* renamed from: d */
            public int f3769d = -1;

            /* renamed from: f */
            public boolean f3771f = false;

            /* renamed from: g */
            public int f3772g = 0;

            /* renamed from: a */
            public int f3766a = 0;

            /* renamed from: b */
            public int f3767b = 0;

            /* renamed from: c */
            public int f3768c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f3770e = null;

            /* renamed from: a */
            public final void m10278a(RecyclerView recyclerView) {
                int i = this.f3769d;
                if (i >= 0) {
                    this.f3769d = -1;
                    recyclerView.m10395M(i);
                    this.f3771f = false;
                } else if (this.f3771f) {
                    Interpolator interpolator = this.f3770e;
                    if (interpolator != null && this.f3768c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i2 = this.f3768c;
                    if (i2 >= 1) {
                        recyclerView.f3670h0.m10274c(this.f3766a, this.f3767b, i2, interpolator);
                        int i3 = this.f3772g + 1;
                        this.f3772g = i3;
                        if (i3 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f3771f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f3772g = 0;
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1593b {
            @Nullable
            /* renamed from: a */
            PointF mo10242a(int i);
        }

        @Nullable
        /* renamed from: a */
        public PointF mo4686a(int i) {
            LayoutManager layoutManager = this.f3760c;
            if (layoutManager instanceof InterfaceC1593b) {
                return ((InterfaceC1593b) layoutManager).mo10242a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1593b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public final void m10280b(int i, int i2) {
            float f;
            PointF mo4686a;
            RecyclerView recyclerView = this.f3759b;
            int i3 = -1;
            if (this.f3758a == -1 || recyclerView == null) {
                m10279d();
            }
            if (this.f3761d && this.f3763f == null && this.f3760c != null && (mo4686a = mo4686a(this.f3758a)) != null) {
                float f2 = mo4686a.x;
                if (f2 != 0.0f || mo4686a.y != 0.0f) {
                    recyclerView.m10382Z((int) Math.signum(f2), (int) Math.signum(mo4686a.y), null);
                }
            }
            boolean z = false;
            this.f3761d = false;
            View view = this.f3763f;
            C1592a c1592a = this.f3764g;
            if (view != null) {
                this.f3759b.getClass();
                AbstractC1597y m10398J = RecyclerView.m10398J(view);
                if (m10398J != null) {
                    i3 = m10398J.getLayoutPosition();
                }
                if (i3 == this.f3758a) {
                    View view2 = this.f3763f;
                    C1594v c1594v = recyclerView.f3676k0;
                    mo10110c(view2, c1592a);
                    c1592a.m10278a(recyclerView);
                    m10279d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3763f = null;
                }
            }
            if (this.f3762e) {
                C1594v c1594v2 = recyclerView.f3676k0;
                C1640o c1640o = (C1640o) this;
                if (c1640o.f3759b.f3679m.m10313w() == 0) {
                    c1640o.m10279d();
                } else {
                    int i4 = c1640o.f3998o;
                    int i5 = i4 - i;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    c1640o.f3998o = i5;
                    int i6 = c1640o.f3999p;
                    int i7 = i6 - i2;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    c1640o.f3999p = i7;
                    if (i5 == 0 && i7 == 0) {
                        PointF mo4686a2 = c1640o.mo4686a(c1640o.f3758a);
                        if (mo4686a2 != null) {
                            if (mo4686a2.x != 0.0f || mo4686a2.y != 0.0f) {
                                float f3 = mo4686a2.y;
                                float sqrt = (float) Math.sqrt((f3 * f3) + (f * f));
                                float f4 = mo4686a2.x / sqrt;
                                mo4686a2.x = f4;
                                float f5 = mo4686a2.y / sqrt;
                                mo4686a2.y = f5;
                                c1640o.f3994k = mo4686a2;
                                c1640o.f3998o = (int) (f4 * 10000.0f);
                                c1640o.f3999p = (int) (f5 * 10000.0f);
                                int mo10109h = c1640o.mo10109h(10000);
                                LinearInterpolator linearInterpolator = c1640o.f3992i;
                                c1592a.f3766a = (int) (c1640o.f3998o * 1.2f);
                                c1592a.f3767b = (int) (c1640o.f3999p * 1.2f);
                                c1592a.f3768c = (int) (mo10109h * 1.2f);
                                c1592a.f3770e = linearInterpolator;
                                c1592a.f3771f = true;
                            }
                        }
                        c1592a.f3769d = c1640o.f3758a;
                        c1640o.m10279d();
                    }
                }
                if (c1592a.f3769d >= 0) {
                    z = true;
                }
                c1592a.m10278a(recyclerView);
                if (z && this.f3762e) {
                    this.f3761d = true;
                    recyclerView.f3670h0.m10275b();
                }
            }
        }

        /* renamed from: c */
        public abstract void mo10110c(@NonNull View view, @NonNull C1592a c1592a);

        /* renamed from: d */
        public final void m10279d() {
            if (!this.f3762e) {
                return;
            }
            this.f3762e = false;
            C1640o c1640o = (C1640o) this;
            c1640o.f3999p = 0;
            c1640o.f3998o = 0;
            c1640o.f3994k = null;
            this.f3759b.f3676k0.f3773a = -1;
            this.f3763f = null;
            this.f3758a = -1;
            this.f3761d = false;
            LayoutManager layoutManager = this.f3760c;
            if (layoutManager.f3719e == this) {
                layoutManager.f3719e = null;
            }
            this.f3760c = null;
            this.f3759b = null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public static class C1594v {

        /* renamed from: a */
        public int f3773a = -1;

        /* renamed from: b */
        public int f3774b = 0;

        /* renamed from: c */
        public int f3775c = 0;

        /* renamed from: d */
        public int f3776d = 1;

        /* renamed from: e */
        public int f3777e = 0;

        /* renamed from: f */
        public boolean f3778f = false;

        /* renamed from: g */
        public boolean f3779g = false;

        /* renamed from: h */
        public boolean f3780h = false;

        /* renamed from: i */
        public boolean f3781i = false;

        /* renamed from: j */
        public boolean f3782j = false;

        /* renamed from: k */
        public boolean f3783k = false;

        /* renamed from: l */
        public int f3784l;

        /* renamed from: m */
        public long f3785m;

        /* renamed from: n */
        public int f3786n;

        /* renamed from: a */
        public final void m10277a(int i) {
            if ((this.f3776d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3776d));
        }

        /* renamed from: b */
        public final int m10276b() {
            return this.f3779g ? this.f3774b - this.f3775c : this.f3777e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f3773a + ", mData=null, mItemCount=" + this.f3777e + ", mIsMeasuring=" + this.f3781i + ", mPreviousLayoutItemCount=" + this.f3774b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3775c + ", mStructureChanged=" + this.f3778f + ", mInPreLayout=" + this.f3779g + ", mRunSimpleAnimations=" + this.f3782j + ", mRunPredictiveAnimations=" + this.f3783k + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1595w {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class RunnableC1596x implements Runnable {

        /* renamed from: a */
        public int f3787a;

        /* renamed from: b */
        public int f3788b;

        /* renamed from: c */
        public OverScroller f3789c;

        /* renamed from: d */
        public Interpolator f3790d;

        /* renamed from: e */
        public boolean f3791e;

        /* renamed from: f */
        public boolean f3792f;

        public RunnableC1596x() {
            animationInterpolatorC1570c animationinterpolatorc1570c = RecyclerView.f3631F0;
            this.f3790d = animationinterpolatorc1570c;
            this.f3791e = false;
            this.f3792f = false;
            this.f3789c = new OverScroller(RecyclerView.this.getContext(), animationinterpolatorc1570c);
        }

        /* renamed from: b */
        public final void m10275b() {
            if (this.f3791e) {
                this.f3792f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11752m(recyclerView, this);
        }

        /* renamed from: c */
        public final void m10274c(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            boolean z;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                if (abs > abs2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), (int) AdError.SERVER_ERROR_CODE);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3631F0;
            }
            if (this.f3790d != interpolator) {
                this.f3790d = interpolator;
                this.f3789c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f3788b = 0;
            this.f3787a = 0;
            recyclerView.setScrollState(2);
            this.f3789c.startScroll(0, 0, i, i2, i4);
            m10275b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3679m == null) {
                recyclerView.removeCallbacks(this);
                this.f3789c.abortAnimation();
                return;
            }
            this.f3792f = false;
            this.f3791e = true;
            recyclerView.m10364m();
            OverScroller overScroller = this.f3789c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f3787a;
                int i7 = currY - this.f3788b;
                this.f3787a = currX;
                this.f3788b = currY;
                int[] iArr = recyclerView.f3700w0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean m10358s = recyclerView.m10358s(i6, i7, 1, iArr, null);
                int[] iArr2 = recyclerView.f3700w0;
                if (m10358s) {
                    i6 -= iArr2[0];
                    i7 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m10365l(i6, i7);
                }
                if (recyclerView.f3677l != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.m10382Z(i6, i7, iArr2);
                    int i8 = iArr2[0];
                    int i9 = iArr2[1];
                    int i10 = i6 - i8;
                    int i11 = i7 - i9;
                    AbstractC1591u abstractC1591u = recyclerView.f3679m.f3719e;
                    if (abstractC1591u != null && !abstractC1591u.f3761d && abstractC1591u.f3762e) {
                        int m10276b = recyclerView.f3676k0.m10276b();
                        if (m10276b == 0) {
                            abstractC1591u.m10279d();
                        } else {
                            if (abstractC1591u.f3758a >= m10276b) {
                                abstractC1591u.f3758a = m10276b - 1;
                            }
                            abstractC1591u.m10280b(i8, i9);
                        }
                    }
                    i4 = i8;
                    i = i10;
                    i2 = i11;
                    i3 = i9;
                } else {
                    i = i6;
                    i2 = i7;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.f3685p.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f3700w0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i12 = i3;
                recyclerView.m10357t(i4, i3, i, i2, null, 1, iArr3);
                int i13 = i - iArr2[0];
                int i14 = i2 - iArr2[1];
                if (i4 != 0 || i12 != 0) {
                    recyclerView.m10356u(i4, i12);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i13 == 0) || (!z2 && i14 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                AbstractC1591u abstractC1591u2 = recyclerView.f3679m.f3719e;
                if (abstractC1591u2 != null && abstractC1591u2.f3761d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && z3) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i13 < 0) {
                            i5 = -currVelocity;
                        } else if (i13 > 0) {
                            i5 = currVelocity;
                        } else {
                            i5 = 0;
                        }
                        if (i14 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i14 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.m10354w();
                            if (recyclerView.f3643I.isFinished()) {
                                recyclerView.f3643I.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.m10353x();
                            if (recyclerView.f3645K.isFinished()) {
                                recyclerView.f3645K.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.m10352y();
                            if (recyclerView.f3644J.isFinished()) {
                                recyclerView.f3644J.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.m10355v();
                            if (recyclerView.f3646L.isFinished()) {
                                recyclerView.f3646L.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                            ViewCompat.C0814d.m11754k(recyclerView);
                        }
                    }
                    RunnableC1635m.C1637b c1637b = recyclerView.f3674j0;
                    int[] iArr4 = c1637b.f3976c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1637b.f3977d = 0;
                } else {
                    m10275b();
                    RunnableC1635m runnableC1635m = recyclerView.f3672i0;
                    if (runnableC1635m != null) {
                        runnableC1635m.m10130a(recyclerView, i4, i12);
                    }
                }
            }
            AbstractC1591u abstractC1591u3 = recyclerView.f3679m.f3719e;
            if (abstractC1591u3 != null && abstractC1591u3.f3761d) {
                abstractC1591u3.m10280b(0, 0);
            }
            this.f3791e = false;
            if (this.f3792f) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                ViewCompat.C0814d.m11752m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.m10371f0(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1597y {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        AbstractC1572e<? extends AbstractC1597y> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC1597y mShadowedHolder = null;
        AbstractC1597y mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C1586q mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public AbstractC1597y(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0814d.m11756i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m10401G(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final AbstractC1572e<? extends AbstractC1597y> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC1572e adapter;
            int m10401G;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (m10401G = this.mOwnerRecyclerView.m10401G(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, m10401G);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (!ViewCompat.C0814d.m11756i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1579k) this.itemView.getLayoutParams()).f3740c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i == -1) {
                View view = this.itemView;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                i = ViewCompat.C0814d.m11762c(view);
            }
            this.mWasImportantForAccessibilityBeforeHidden = i;
            if (recyclerView.m10396L()) {
                this.mPendingAccessibilityState = 4;
                recyclerView.f3702x0.add(this);
                return;
            }
            View view2 = this.itemView;
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0814d.m11746s(view2, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.m10396L()) {
                this.mPendingAccessibilityState = i;
                recyclerView.f3702x0.add(this);
            } else {
                View view = this.itemView;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11746s(view, i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m10367j(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.mFlags | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.mFlags & (-17);
            }
            this.mFlags = i;
        }

        public void setScrapContainer(C1586q c1586q, boolean z) {
            this.mScrapContainer = c1586q;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder m12339b = C0510h.m12339b(simpleName, "{");
            m12339b.append(Integer.toHexString(hashCode()));
            m12339b.append(" position=");
            m12339b.append(this.mPosition);
            m12339b.append(" id=");
            m12339b.append(this.mItemId);
            m12339b.append(", oldPos=");
            m12339b.append(this.mOldPosition);
            m12339b.append(", pLpos:");
            m12339b.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(m12339b.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m10284k(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f3630E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3631F0 = new animationInterpolatorC1570c();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:38|(1:40)(11:78|(1:80)|42|43|44|(1:46)(1:62)|47|48|49|50|51)|41|42|43|44|(0)(0)|47|48|49|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0271, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0273, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0279, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0289, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028a, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02aa, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023f A[Catch: ClassCastException -> 0x02ab, IllegalAccessException -> 0x02ca, InstantiationException -> 0x02e9, InvocationTargetException -> 0x0306, ClassNotFoundException -> 0x0323, TryCatch #4 {ClassCastException -> 0x02ab, ClassNotFoundException -> 0x0323, IllegalAccessException -> 0x02ca, InstantiationException -> 0x02e9, InvocationTargetException -> 0x0306, blocks: (B:50:0x0239, B:52:0x023f, B:54:0x024c, B:55:0x0256, B:62:0x027b, B:59:0x0273, B:64:0x028a, B:65:0x02aa, B:53:0x0248), top: B:87:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0248 A[Catch: ClassCastException -> 0x02ab, IllegalAccessException -> 0x02ca, InstantiationException -> 0x02e9, InvocationTargetException -> 0x0306, ClassNotFoundException -> 0x0323, TryCatch #4 {ClassCastException -> 0x02ab, ClassNotFoundException -> 0x0323, IllegalAccessException -> 0x02ca, InstantiationException -> 0x02e9, InvocationTargetException -> 0x0306, blocks: (B:50:0x0239, B:52:0x023f, B:54:0x024c, B:55:0x0256, B:62:0x027b, B:59:0x0273, B:64:0x028a, B:65:0x02aa, B:53:0x0248), top: B:87:0x0239 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(@androidx.annotation.NonNull android.content.Context r19, @androidx.annotation.Nullable android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Nullable
    /* renamed from: E */
    public static RecyclerView m10403E(@NonNull View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView m10403E = m10403E(viewGroup.getChildAt(i));
                if (m10403E != null) {
                    return m10403E;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: J */
    public static AbstractC1597y m10398J(View view) {
        if (view == null) {
            return null;
        }
        return ((C1579k) view.getLayoutParams()).f3738a;
    }

    private C0910e0 getScrollingChildHelper() {
        if (this.f3694t0 == null) {
            this.f3694t0 = new C0910e0(this);
        }
        return this.f3694t0;
    }

    /* renamed from: j */
    public static void m10367j(@NonNull AbstractC1597y abstractC1597y) {
        WeakReference<RecyclerView> weakReference = abstractC1597y.mNestedRecyclerView;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == abstractC1597y.itemView) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                abstractC1597y.mNestedRecyclerView = null;
                return;
            }
        }
    }

    /* renamed from: A */
    public final void m10407A(C1594v c1594v) {
        if (getScrollState() != 2) {
            c1594v.getClass();
            return;
        }
        OverScroller overScroller = this.f3670h0.f3789c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1594v.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    @androidx.annotation.Nullable
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m10406B(@androidx.annotation.NonNull android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10406B(android.view.View):android.view.View");
    }

    /* renamed from: C */
    public final boolean m10405C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<InterfaceC1582n> arrayList = this.f3687q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1582n interfaceC1582n = arrayList.get(i);
            if (interfaceC1582n.mo10137a(motionEvent) && action != 3) {
                this.f3689r = interfaceC1582n;
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void m10404D(int[] iArr) {
        int m10164e = this.f3663e.m10164e();
        if (m10164e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m10164e; i3++) {
            AbstractC1597y m10398J = m10398J(this.f3663e.m10165d(i3));
            if (!m10398J.shouldIgnore()) {
                int layoutPosition = m10398J.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Nullable
    /* renamed from: F */
    public final AbstractC1597y m10402F(int i) {
        AbstractC1597y abstractC1597y = null;
        if (this.f3638D) {
            return null;
        }
        int m10161h = this.f3663e.m10161h();
        for (int i2 = 0; i2 < m10161h; i2++) {
            AbstractC1597y m10398J = m10398J(this.f3663e.m10162g(i2));
            if (m10398J != null && !m10398J.isRemoved() && m10401G(m10398J) == i) {
                if (!this.f3663e.m10159j(m10398J.itemView)) {
                    return m10398J;
                }
                abstractC1597y = m10398J;
            }
        }
        return abstractC1597y;
    }

    /* renamed from: G */
    public final int m10401G(AbstractC1597y abstractC1597y) {
        if (abstractC1597y.hasAnyOfTheFlags(524) || !abstractC1597y.isBound()) {
            return -1;
        }
        C1609a c1609a = this.f3661d;
        int i = abstractC1597y.mPosition;
        ArrayList<C1609a.C1611b> arrayList = c1609a.f3858b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1609a.C1611b c1611b = arrayList.get(i2);
            int i3 = c1611b.f3863a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c1611b.f3864b;
                        if (i4 == i) {
                            i = c1611b.f3866d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c1611b.f3866d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c1611b.f3864b;
                    if (i5 <= i) {
                        int i6 = c1611b.f3866d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c1611b.f3864b <= i) {
                i += c1611b.f3866d;
            }
        }
        return i;
    }

    /* renamed from: H */
    public final long m10400H(AbstractC1597y abstractC1597y) {
        return this.f3677l.hasStableIds() ? abstractC1597y.getItemId() : abstractC1597y.mPosition;
    }

    /* renamed from: I */
    public final AbstractC1597y m10399I(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m10398J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: K */
    public final Rect m10397K(View view) {
        C1579k c1579k = (C1579k) view.getLayoutParams();
        boolean z = c1579k.f3740c;
        Rect rect = c1579k.f3739b;
        if (!z) {
            return rect;
        }
        C1594v c1594v = this.f3676k0;
        if (c1594v.f3779g && (c1579k.m10297b() || c1579k.f3738a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<AbstractC1578j> arrayList = this.f3685p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f3671i;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i).mo69c(rect2, view, this, c1594v);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1579k.f3740c = false;
        return rect;
    }

    /* renamed from: L */
    public final boolean m10396L() {
        return this.f3640F > 0;
    }

    /* renamed from: M */
    public final void m10395M(int i) {
        if (this.f3679m == null) {
            return;
        }
        setScrollState(2);
        this.f3679m.mo4688q0(i);
        awakenScrollBars();
    }

    /* renamed from: N */
    public final void m10394N() {
        int m10161h = this.f3663e.m10161h();
        for (int i = 0; i < m10161h; i++) {
            ((C1579k) this.f3663e.m10162g(i).getLayoutParams()).f3740c = true;
        }
        ArrayList<AbstractC1597y> arrayList = this.f3659b.f3750c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1579k c1579k = (C1579k) arrayList.get(i2).itemView.getLayoutParams();
            if (c1579k != null) {
                c1579k.f3740c = true;
            }
        }
    }

    /* renamed from: O */
    public final void m10393O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m10161h = this.f3663e.m10161h();
        for (int i4 = 0; i4 < m10161h; i4++) {
            AbstractC1597y m10398J = m10398J(this.f3663e.m10162g(i4));
            if (m10398J != null && !m10398J.shouldIgnore()) {
                int i5 = m10398J.mPosition;
                if (i5 >= i3) {
                    m10398J.offsetPosition(-i2, z);
                } else if (i5 >= i) {
                    m10398J.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                }
                this.f3676k0.f3778f = true;
            }
        }
        C1586q c1586q = this.f3659b;
        ArrayList<AbstractC1597y> arrayList = c1586q.f3750c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC1597y abstractC1597y = arrayList.get(size);
                if (abstractC1597y != null) {
                    int i6 = abstractC1597y.mPosition;
                    if (i6 >= i3) {
                        abstractC1597y.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        abstractC1597y.addFlags(8);
                        c1586q.m10289f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: P */
    public final void m10392P() {
        this.f3640F++;
    }

    /* renamed from: Q */
    public final void m10391Q(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f3640F - 1;
        this.f3640F = i2;
        if (i2 < 1) {
            this.f3640F = 0;
            if (z) {
                int i3 = this.f3705z;
                this.f3705z = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f3634B;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        C0861b.m11575b(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f3702x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1597y abstractC1597y = (AbstractC1597y) arrayList.get(size);
                    if (abstractC1597y.itemView.getParent() == this && !abstractC1597y.shouldIgnore() && (i = abstractC1597y.mPendingAccessibilityState) != -1) {
                        View view = abstractC1597y.itemView;
                        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                        ViewCompat.C0814d.m11746s(view, i);
                        abstractC1597y.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: R */
    public final void m10390R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3649O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3649O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3653S = x;
            this.f3651Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3654T = y;
            this.f3652R = y;
        }
    }

    /* renamed from: S */
    public final void m10389S() {
        if (!this.f3688q0 && this.f3691s) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11752m(this, this.f3704y0);
            this.f3688q0 = true;
        }
    }

    /* renamed from: T */
    public final void m10388T() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (this.f3638D) {
            C1609a c1609a = this.f3661d;
            c1609a.m10171l(c1609a.f3858b);
            c1609a.m10171l(c1609a.f3859c);
            c1609a.f3862f = 0;
            if (this.f3639E) {
                this.f3679m.mo10241a0();
            }
        }
        if (this.f3647M != null && this.f3679m.mo10273C0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3661d.m10173j();
        } else {
            this.f3661d.m10180c();
        }
        if (!this.f3682n0 && !this.f3684o0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f3695u && this.f3647M != null && (((z5 = this.f3638D) || z2 || this.f3679m.f3720f) && (!z5 || this.f3677l.hasStableIds()))) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1594v c1594v = this.f3676k0;
        c1594v.f3782j = z3;
        if (z3 && z2 && !this.f3638D) {
            if (this.f3647M != null && this.f3679m.mo10273C0()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                z6 = true;
            }
        }
        c1594v.f3783k = z6;
    }

    /* renamed from: U */
    public final void m10387U(boolean z) {
        this.f3639E = z | this.f3639E;
        this.f3638D = true;
        int m10161h = this.f3663e.m10161h();
        for (int i = 0; i < m10161h; i++) {
            AbstractC1597y m10398J = m10398J(this.f3663e.m10162g(i));
            if (m10398J != null && !m10398J.shouldIgnore()) {
                m10398J.addFlags(6);
            }
        }
        m10394N();
        C1586q c1586q = this.f3659b;
        ArrayList<AbstractC1597y> arrayList = c1586q.f3750c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1597y abstractC1597y = arrayList.get(i2);
            if (abstractC1597y != null) {
                abstractC1597y.addFlags(6);
                abstractC1597y.addChangePayload(null);
            }
        }
        AbstractC1572e abstractC1572e = RecyclerView.this.f3677l;
        if (abstractC1572e == null || !abstractC1572e.hasStableIds()) {
            c1586q.m10290e();
        }
    }

    /* renamed from: V */
    public final void m10386V(AbstractC1597y abstractC1597y, ItemAnimator.C1564c c1564c) {
        abstractC1597y.setFlags(0, 8192);
        boolean z = this.f3676k0.f3780h;
        C1617b0 c1617b0 = this.f3665f;
        if (z && abstractC1597y.isUpdated() && !abstractC1597y.isRemoved() && !abstractC1597y.shouldIgnore()) {
            c1617b0.f3877b.m12419g(m10400H(abstractC1597y), abstractC1597y);
        }
        C0482i<AbstractC1597y, C1617b0.C1618a> c0482i = c1617b0.f3876a;
        C1617b0.C1618a orDefault = c0482i.getOrDefault(abstractC1597y, null);
        if (orDefault == null) {
            orDefault = C1617b0.C1618a.m10146a();
            c0482i.put(abstractC1597y, orDefault);
        }
        orDefault.f3880b = c1564c;
        orDefault.f3879a |= 4;
    }

    /* renamed from: W */
    public final void m10385W(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3671i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1579k) {
            C1579k c1579k = (C1579k) layoutParams;
            if (!c1579k.f3740c) {
                int i = rect.left;
                Rect rect2 = c1579k.f3739b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3679m.mo4690n0(this, view, this.f3671i, !this.f3695u, view2 == null);
    }

    /* renamed from: X */
    public final void m10384X() {
        VelocityTracker velocityTracker = this.f3650P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        m10371f0(0);
        EdgeEffect edgeEffect = this.f3643I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3643I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3644J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3644J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3645K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3645K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3646L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3646L.isFinished();
        }
        if (z) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10383Y(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10383Y(int, int, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: Z */
    public final void m10382Z(int i, int i2, @Nullable int[] iArr) {
        int i3;
        int i4;
        AbstractC1597y abstractC1597y;
        m10375d0();
        m10392P();
        int i5 = C0749q.f2431a;
        C0749q.C0750a.m11833a("RV Scroll");
        C1594v c1594v = this.f3676k0;
        m10407A(c1594v);
        C1586q c1586q = this.f3659b;
        if (i != 0) {
            i3 = this.f3679m.mo4689p0(i, c1586q, c1594v);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f3679m.mo10218r0(i2, c1586q, c1594v);
        } else {
            i4 = 0;
        }
        C0749q.C0750a.m11832b();
        int m10164e = this.f3663e.m10164e();
        for (int i6 = 0; i6 < m10164e; i6++) {
            View m10165d = this.f3663e.m10165d(i6);
            AbstractC1597y m10399I = m10399I(m10165d);
            if (m10399I != null && (abstractC1597y = m10399I.mShadowingHolder) != null) {
                View view = abstractC1597y.itemView;
                int left = m10165d.getLeft();
                int top = m10165d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m10391Q(true);
        m10373e0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* renamed from: a0 */
    public final void m10380a0(int i) {
        AbstractC1591u abstractC1591u;
        if (this.f3701x) {
            return;
        }
        setScrollState(0);
        RunnableC1596x runnableC1596x = this.f3670h0;
        RecyclerView.this.removeCallbacks(runnableC1596x);
        runnableC1596x.f3789c.abortAnimation();
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && (abstractC1591u = layoutManager.f3719e) != null) {
            abstractC1591u.m10279d();
        }
        LayoutManager layoutManager2 = this.f3679m;
        if (layoutManager2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        layoutManager2.mo4688q0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            layoutManager.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b0 */
    public final void m10379b0(@InterfaceC0074Px int i, @InterfaceC0074Px int i2, boolean z) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f3701x) {
        } else {
            int i3 = 0;
            if (!layoutManager.mo10232e()) {
                i = 0;
            }
            if (!this.f3679m.mo10230f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().m11489g(i3, 1);
                }
                this.f3670h0.m10274c(i, i2, Integer.MIN_VALUE, null);
            }
        }
    }

    /* renamed from: c0 */
    public final void m10377c0(int i) {
        if (this.f3701x) {
            return;
        }
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.mo4606A0(this, i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1579k) && this.f3679m.mo10228g((C1579k) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10232e()) {
            return this.f3679m.mo4693k(this.f3676k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10232e()) {
            return this.f3679m.mo4692l(this.f3676k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10232e()) {
            return this.f3679m.mo4691m(this.f3676k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10230f()) {
            return this.f3679m.mo10221n(this.f3676k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10230f()) {
            return this.f3679m.mo10220o(this.f3676k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && layoutManager.mo10230f()) {
            return this.f3679m.mo10219p(this.f3676k0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m10375d0() {
        int i = this.f3697v + 1;
        this.f3697v = i;
        if (i != 1 || this.f3701x) {
            return;
        }
        this.f3699w = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m11495a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m11494b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m11493c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m11491e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList<AbstractC1578j> arrayList = this.f3685p;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).mo67e(canvas, this, this.f3676k0);
        }
        EdgeEffect edgeEffect = this.f3643I;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f3667g) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.f3643I;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.f3644J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3667g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3644J;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3645K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f3667g) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.f3645K;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3646L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3667g) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.f3646L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3647M == null || arrayList.size() <= 0 || !this.f3647M.mo10143f()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public final void m10373e0(boolean z) {
        if (this.f3697v < 1) {
            this.f3697v = 1;
        }
        if (!z && !this.f3701x) {
            this.f3699w = false;
        }
        if (this.f3697v == 1) {
            if (z && this.f3699w && !this.f3701x && this.f3679m != null && this.f3677l != null) {
                m10361p();
            }
            if (!this.f3701x) {
                this.f3699w = false;
            }
        }
        this.f3697v--;
    }

    /* renamed from: f */
    public final void m10372f(AbstractC1597y abstractC1597y) {
        boolean z;
        View view = abstractC1597y.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f3659b.m10284k(m10399I(view));
        if (abstractC1597y.isTmpDetached()) {
            this.f3663e.m10167b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1614b c1614b = this.f3663e;
        if (!z) {
            c1614b.m10168a(view, true, -1);
            return;
        }
        int indexOfChild = ((C1648v) c1614b.f3871a).f4007a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c1614b.f3872b.m10150h(indexOfChild);
            c1614b.m10160i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: f0 */
    public final void m10371f0(int i) {
        getScrollingChildHelper().m11488h(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x015a, code lost:
        if (r4 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0178, code lost:
        if (r3 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x017b, code lost:
        if (r4 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017e, code lost:
        if (r3 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0186, code lost:
        if ((r3 * r2) <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x018e, code lost:
        if ((r3 * r2) >= 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m10370g(@NonNull AbstractC1578j abstractC1578j) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            layoutManager.mo10237c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC1578j> arrayList = this.f3685p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1578j);
        m10394N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            return layoutManager.mo4687s();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m10351z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            return layoutManager.mo10217t(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m10351z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            return layoutManager.mo10216u(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m10351z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public AbstractC1572e getAdapter() {
        return this.f3677l;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null) {
            layoutManager.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3667g;
    }

    @Nullable
    public C1650x getCompatAccessibilityDelegate() {
        return this.f3690r0;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.f3642H;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.f3647M;
    }

    public int getItemDecorationCount() {
        return this.f3685p.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.f3679m;
    }

    public int getMaxFlingVelocity() {
        return this.f3662d0;
    }

    public int getMinFlingVelocity() {
        return this.f3657W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    @Nullable
    public AbstractC1581m getOnFlingListener() {
        return this.f3656V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3668g0;
    }

    @NonNull
    public C1584p getRecycledViewPool() {
        return this.f3659b.m10292c();
    }

    public int getScrollState() {
        return this.f3648N;
    }

    /* renamed from: h */
    public final void m10369h(@NonNull AbstractC1583o abstractC1583o) {
        if (this.f3680m0 == null) {
            this.f3680m0 = new ArrayList();
        }
        this.f3680m0.add(abstractC1583o);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().m11490f(0) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m10368i(String str) {
        if (m10396L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m10351z());
        } else if (this.f3641G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m10351z()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3691s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3701x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2628d;
    }

    /* renamed from: k */
    public final void m10366k() {
        int m10161h = this.f3663e.m10161h();
        for (int i = 0; i < m10161h; i++) {
            AbstractC1597y m10398J = m10398J(this.f3663e.m10162g(i));
            if (!m10398J.shouldIgnore()) {
                m10398J.clearOldPosition();
            }
        }
        C1586q c1586q = this.f3659b;
        ArrayList<AbstractC1597y> arrayList = c1586q.f3750c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).clearOldPosition();
        }
        ArrayList<AbstractC1597y> arrayList2 = c1586q.f3748a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.get(i3).clearOldPosition();
        }
        ArrayList<AbstractC1597y> arrayList3 = c1586q.f3749b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c1586q.f3749b.get(i4).clearOldPosition();
            }
        }
    }

    /* renamed from: l */
    public final void m10365l(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3643I;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f3643I.onRelease();
            z = this.f3643I.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3645K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3645K.onRelease();
            z |= this.f3645K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3644J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3644J.onRelease();
            z |= this.f3644J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3646L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3646L.onRelease();
            z |= this.f3646L.isFinished();
        }
        if (z) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    /* renamed from: m */
    public final void m10364m() {
        boolean z;
        boolean z2;
        if (this.f3695u && !this.f3638D) {
            if (!this.f3661d.m10176g()) {
                return;
            }
            C1609a c1609a = this.f3661d;
            int i = c1609a.f3862f;
            boolean z3 = false;
            if ((4 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((i & 11) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int i2 = C0749q.f2431a;
                    C0749q.C0750a.m11833a("RV PartialInvalidate");
                    m10375d0();
                    m10392P();
                    this.f3661d.m10173j();
                    if (!this.f3699w) {
                        int m10164e = this.f3663e.m10164e();
                        int i3 = 0;
                        while (true) {
                            if (i3 < m10164e) {
                                AbstractC1597y m10398J = m10398J(this.f3663e.m10165d(i3));
                                if (m10398J != null && !m10398J.shouldIgnore() && m10398J.isUpdated()) {
                                    z3 = true;
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                        if (z3) {
                            m10361p();
                        } else {
                            this.f3661d.m10181b();
                        }
                    }
                    m10373e0(true);
                    m10391Q(true);
                    C0749q.C0750a.m11832b();
                    return;
                }
            }
            if (c1609a.m10176g()) {
                int i4 = C0749q.f2431a;
                C0749q.C0750a.m11833a("RV FullInvalidate");
                m10361p();
                C0749q.C0750a.m11832b();
                return;
            }
            return;
        }
        int i5 = C0749q.f2431a;
        C0749q.C0750a.m11833a("RV FullInvalidate");
        m10361p();
        C0749q.C0750a.m11832b();
    }

    /* renamed from: n */
    public final void m10363n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        setMeasuredDimension(LayoutManager.m10326h(i, paddingRight, ViewCompat.C0814d.m11760e(this)), LayoutManager.m10326h(i2, getPaddingBottom() + getPaddingTop(), ViewCompat.C0814d.m11761d(this)));
    }

    /* renamed from: o */
    public final void m10362o(View view) {
        AbstractC1597y m10398J = m10398J(view);
        AbstractC1572e abstractC1572e = this.f3677l;
        if (abstractC1572e != null && m10398J != null) {
            abstractC1572e.onViewDetachedFromWindow(m10398J);
        }
        ArrayList arrayList = this.f3636C;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((InterfaceC1580l) this.f3636C.get(size)).mo9361a(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r1 >= 30.0f) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f3640F = r0
            r1 = 1
            r5.f3691s = r1
            boolean r2 = r5.f3695u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f3695u = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r5.f3679m
            if (r2 == 0) goto L1e
            r2.f3721g = r1
        L1e:
            r5.f3688q0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.RunnableC1635m.f3968e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.RunnableC1635m) r1
            r5.f3672i0 = r1
            if (r1 != 0) goto L5a
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f3672i0 = r1
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r1 = androidx.core.view.ViewCompat.f2518a
            android.view.Display r1 = androidx.core.view.ViewCompat.C0815e.m11744b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4c
            if (r1 == 0) goto L4c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4c
            goto L4e
        L4c:
            r1 = 1114636288(0x42700000, float:60.0)
        L4e:
            androidx.recyclerview.widget.m r2 = r5.f3672i0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3972c = r3
            r0.set(r2)
        L5a:
            androidx.recyclerview.widget.m r0 = r5.f3672i0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f3970a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1591u abstractC1591u;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f3647M;
        if (itemAnimator != null) {
            itemAnimator.mo10144e();
        }
        setScrollState(0);
        RunnableC1596x runnableC1596x = this.f3670h0;
        RecyclerView.this.removeCallbacks(runnableC1596x);
        runnableC1596x.f3789c.abortAnimation();
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager != null && (abstractC1591u = layoutManager.f3719e) != null) {
            abstractC1591u.m10279d();
        }
        this.f3691s = false;
        LayoutManager layoutManager2 = this.f3679m;
        if (layoutManager2 != null) {
            layoutManager2.f3721g = false;
            layoutManager2.mo10251U(this);
        }
        this.f3702x0.clear();
        removeCallbacks(this.f3704y0);
        this.f3665f.getClass();
        do {
        } while (C1617b0.C1618a.f3878d.mo6394b() != null);
        RunnableC1635m runnableC1635m = this.f3672i0;
        if (runnableC1635m != null) {
            runnableC1635m.f3970a.remove(this);
            this.f3672i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<AbstractC1578j> arrayList = this.f3685p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo68d(canvas, this, this.f3676k0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3701x) {
            return false;
        }
        this.f3689r = null;
        if (m10405C(motionEvent)) {
            m10384X();
            setScrollState(0);
            return true;
        }
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager == null) {
            return false;
        }
        boolean mo10232e = layoutManager.mo10232e();
        boolean mo10230f = this.f3679m.mo10230f();
        if (this.f3650P == null) {
            this.f3650P = VelocityTracker.obtain();
        }
        this.f3650P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m10390R(motionEvent);
                            }
                        } else {
                            this.f3649O = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f3653S = x;
                            this.f3651Q = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f3654T = y;
                            this.f3652R = y;
                        }
                    } else {
                        m10384X();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3649O);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3649O + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3648N != 1) {
                        int i = x2 - this.f3651Q;
                        int i2 = y2 - this.f3652R;
                        if (mo10232e && Math.abs(i) > this.f3655U) {
                            this.f3653S = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mo10230f && Math.abs(i2) > this.f3655U) {
                            this.f3654T = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f3650P.clear();
                m10371f0(0);
            }
        } else {
            if (this.f3703y) {
                this.f3703y = false;
            }
            this.f3649O = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f3653S = x3;
            this.f3651Q = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f3654T = y3;
            this.f3652R = y3;
            if (this.f3648N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m10371f0(1);
            }
            int[] iArr = this.f3698v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = mo10232e;
            if (mo10230f) {
                i3 = (mo10232e ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m11489g(i3, 0);
        }
        if (this.f3648N != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C0749q.f2431a;
        C0749q.C0750a.m11833a("RV OnLayout");
        m10361p();
        C0749q.C0750a.m11832b();
        this.f3695u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager == null) {
            m10363n(i, i2);
            return;
        }
        boolean mo10261O = layoutManager.mo10261O();
        boolean z = false;
        C1594v c1594v = this.f3676k0;
        if (mo10261O) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3679m.f3716b.m10363n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f3706z0 = z;
            if (!z && this.f3677l != null) {
                if (c1594v.f3776d == 1) {
                    m10360q();
                }
                this.f3679m.m10316t0(i, i2);
                c1594v.f3781i = true;
                m10359r();
                this.f3679m.m10314v0(i, i2);
                if (this.f3679m.mo10308y0()) {
                    this.f3679m.m10316t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    c1594v.f3781i = true;
                    m10359r();
                    this.f3679m.m10314v0(i, i2);
                }
                this.f3633A0 = getMeasuredWidth();
                this.f3635B0 = getMeasuredHeight();
            }
        } else if (this.f3693t) {
            this.f3679m.f3716b.m10363n(i, i2);
        } else {
            if (this.f3632A) {
                m10375d0();
                m10392P();
                m10388T();
                m10391Q(true);
                if (c1594v.f3783k) {
                    c1594v.f3779g = true;
                } else {
                    this.f3661d.m10180c();
                    c1594v.f3779g = false;
                }
                this.f3632A = false;
                m10373e0(false);
            } else if (c1594v.f3783k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1572e abstractC1572e = this.f3677l;
            if (abstractC1572e != null) {
                c1594v.f3777e = abstractC1572e.getItemCount();
            } else {
                c1594v.f3777e = 0;
            }
            m10375d0();
            this.f3679m.f3716b.m10363n(i, i2);
            m10373e0(false);
            c1594v.f3779g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m10396L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1589t)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1589t c1589t = (C1589t) parcelable;
        this.f3660c = c1589t;
        super.onRestoreInstanceState(c1589t.f2747a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        C1589t c1589t = new C1589t(super.onSaveInstanceState());
        C1589t c1589t2 = this.f3660c;
        if (c1589t2 != null) {
            c1589t.f3757c = c1589t2.f3757c;
        } else {
            LayoutManager layoutManager = this.f3679m;
            if (layoutManager != null) {
                parcelable = layoutManager.mo10225h0();
            } else {
                parcelable = null;
            }
            c1589t.f3757c = parcelable;
        }
        return c1589t;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f3646L = null;
            this.f3644J = null;
            this.f3645K = null;
            this.f3643I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0314, code lost:
        if (r0 < r8) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0251, code lost:
        if (r15.f3647M.mo10089a(r10, r10, r5, r6) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0275, code lost:
        if (r5 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0277, code lost:
        r15.m10389S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03cd, code lost:
        if (r18.f3663e.m10159j(getFocusedChild()) == false) goto L256;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0422 A[EDGE_INSN: B:274:0x0422->B:216:0x0422 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.recyclerview.widget.RecyclerView$y] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10361p() {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m10361p():void");
    }

    /* renamed from: q */
    public final void m10360q() {
        View view;
        AbstractC1597y abstractC1597y;
        int absoluteAdapterPosition;
        int id;
        boolean z;
        boolean z2;
        View m10406B;
        C1594v c1594v = this.f3676k0;
        c1594v.m10277a(1);
        m10407A(c1594v);
        c1594v.f3781i = false;
        m10375d0();
        C1617b0 c1617b0 = this.f3665f;
        c1617b0.f3876a.clear();
        c1617b0.f3877b.m12423b();
        m10392P();
        m10388T();
        if (this.f3668g0 && hasFocus() && this.f3677l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (m10406B = m10406B(view)) == null) {
            abstractC1597y = null;
        } else {
            abstractC1597y = m10399I(m10406B);
        }
        long j = -1;
        if (abstractC1597y == null) {
            c1594v.f3785m = -1L;
            c1594v.f3784l = -1;
            c1594v.f3786n = -1;
        } else {
            if (this.f3677l.hasStableIds()) {
                j = abstractC1597y.getItemId();
            }
            c1594v.f3785m = j;
            if (this.f3638D) {
                absoluteAdapterPosition = -1;
            } else if (abstractC1597y.isRemoved()) {
                absoluteAdapterPosition = abstractC1597y.mOldPosition;
            } else {
                absoluteAdapterPosition = abstractC1597y.getAbsoluteAdapterPosition();
            }
            c1594v.f3784l = absoluteAdapterPosition;
            View view2 = abstractC1597y.itemView;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            c1594v.f3786n = id;
        }
        if (c1594v.f3782j && this.f3684o0) {
            z = true;
        } else {
            z = false;
        }
        c1594v.f3780h = z;
        this.f3684o0 = false;
        this.f3682n0 = false;
        c1594v.f3779g = c1594v.f3783k;
        c1594v.f3777e = this.f3677l.getItemCount();
        m10404D(this.f3692s0);
        boolean z3 = c1594v.f3782j;
        C0482i<AbstractC1597y, C1617b0.C1618a> c0482i = c1617b0.f3876a;
        if (z3) {
            int m10164e = this.f3663e.m10164e();
            for (int i = 0; i < m10164e; i++) {
                AbstractC1597y m10398J = m10398J(this.f3663e.m10165d(i));
                if (!m10398J.shouldIgnore() && (!m10398J.isInvalid() || this.f3677l.hasStableIds())) {
                    ItemAnimator itemAnimator = this.f3647M;
                    ItemAnimator.m10350b(m10398J);
                    m10398J.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.C1564c c1564c = new ItemAnimator.C1564c();
                    c1564c.m10347a(m10398J);
                    C1617b0.C1618a orDefault = c0482i.getOrDefault(m10398J, null);
                    if (orDefault == null) {
                        orDefault = C1617b0.C1618a.m10146a();
                        c0482i.put(m10398J, orDefault);
                    }
                    orDefault.f3880b = c1564c;
                    orDefault.f3879a |= 4;
                    if (c1594v.f3780h && m10398J.isUpdated() && !m10398J.isRemoved() && !m10398J.shouldIgnore() && !m10398J.isInvalid()) {
                        c1617b0.f3877b.m12419g(m10400H(m10398J), m10398J);
                    }
                }
            }
        }
        if (c1594v.f3783k) {
            int m10161h = this.f3663e.m10161h();
            for (int i2 = 0; i2 < m10161h; i2++) {
                AbstractC1597y m10398J2 = m10398J(this.f3663e.m10162g(i2));
                if (!m10398J2.shouldIgnore()) {
                    m10398J2.saveOldPosition();
                }
            }
            boolean z4 = c1594v.f3778f;
            c1594v.f3778f = false;
            this.f3679m.mo4695e0(this.f3659b, c1594v);
            c1594v.f3778f = z4;
            for (int i3 = 0; i3 < this.f3663e.m10164e(); i3++) {
                AbstractC1597y m10398J3 = m10398J(this.f3663e.m10165d(i3));
                if (!m10398J3.shouldIgnore()) {
                    C1617b0.C1618a orDefault2 = c0482i.getOrDefault(m10398J3, null);
                    if (orDefault2 != null && (orDefault2.f3879a & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        ItemAnimator.m10350b(m10398J3);
                        boolean hasAnyOfTheFlags = m10398J3.hasAnyOfTheFlags(8192);
                        ItemAnimator itemAnimator2 = this.f3647M;
                        m10398J3.getUnmodifiedPayloads();
                        itemAnimator2.getClass();
                        ItemAnimator.C1564c c1564c2 = new ItemAnimator.C1564c();
                        c1564c2.m10347a(m10398J3);
                        if (hasAnyOfTheFlags) {
                            m10386V(m10398J3, c1564c2);
                        } else {
                            C1617b0.C1618a orDefault3 = c0482i.getOrDefault(m10398J3, null);
                            if (orDefault3 == null) {
                                orDefault3 = C1617b0.C1618a.m10146a();
                                c0482i.put(m10398J3, orDefault3);
                            }
                            orDefault3.f3879a |= 2;
                            orDefault3.f3880b = c1564c2;
                        }
                    }
                }
            }
        }
        m10366k();
        m10391Q(true);
        m10373e0(false);
        c1594v.f3776d = 2;
    }

    /* renamed from: r */
    public final void m10359r() {
        boolean z;
        m10375d0();
        m10392P();
        C1594v c1594v = this.f3676k0;
        c1594v.m10277a(6);
        this.f3661d.m10180c();
        c1594v.f3777e = this.f3677l.getItemCount();
        c1594v.f3775c = 0;
        if (this.f3660c != null && this.f3677l.canRestoreState()) {
            Parcelable parcelable = this.f3660c.f3757c;
            if (parcelable != null) {
                this.f3679m.mo10227g0(parcelable);
            }
            this.f3660c = null;
        }
        c1594v.f3779g = false;
        this.f3679m.mo4695e0(this.f3659b, c1594v);
        c1594v.f3778f = false;
        if (c1594v.f3782j && this.f3647M != null) {
            z = true;
        } else {
            z = false;
        }
        c1594v.f3782j = z;
        c1594v.f3776d = 4;
        m10391Q(true);
        m10373e0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC1597y m10398J = m10398J(view);
        if (m10398J != null) {
            if (m10398J.isTmpDetached()) {
                m10398J.clearTmpDetachFlag();
            } else if (!m10398J.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m10398J + m10351z());
            }
        }
        view.clearAnimation();
        m10362o(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z;
        AbstractC1591u abstractC1591u = this.f3679m.f3719e;
        boolean z2 = true;
        if (abstractC1591u != null && abstractC1591u.f3762e) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !m10396L()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            m10385W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3679m.mo4690n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList<InterfaceC1582n> arrayList = this.f3687q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo10136b(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3697v != 0 || this.f3701x) {
            this.f3699w = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final boolean m10358s(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m11493c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.f3679m;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f3701x) {
        } else {
            boolean mo10232e = layoutManager.mo10232e();
            boolean mo10230f = this.f3679m.mo10230f();
            if (mo10232e || mo10230f) {
                if (!mo10232e) {
                    i = 0;
                }
                if (!mo10230f) {
                    i2 = 0;
                }
                m10383Y(i, i2, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (m10396L()) {
            if (accessibilityEvent != null) {
                i = C0861b.m11576a(accessibilityEvent);
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.f3705z |= i2;
            i2 = 1;
        }
        if (i2 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable C1650x c1650x) {
        this.f3690r0 = c1650x;
        ViewCompat.m11771n(this, c1650x);
    }

    public void setAdapter(@Nullable AbstractC1572e abstractC1572e) {
        setLayoutFrozen(false);
        AbstractC1572e abstractC1572e2 = this.f3677l;
        C1588s c1588s = this.f3658a;
        if (abstractC1572e2 != null) {
            abstractC1572e2.unregisterAdapterDataObserver(c1588s);
            this.f3677l.onDetachedFromRecyclerView(this);
        }
        ItemAnimator itemAnimator = this.f3647M;
        if (itemAnimator != null) {
            itemAnimator.mo10144e();
        }
        LayoutManager layoutManager = this.f3679m;
        C1586q c1586q = this.f3659b;
        if (layoutManager != null) {
            layoutManager.m10324j0(c1586q);
            this.f3679m.m10323k0(c1586q);
        }
        c1586q.f3748a.clear();
        c1586q.m10290e();
        C1609a c1609a = this.f3661d;
        c1609a.m10171l(c1609a.f3858b);
        c1609a.m10171l(c1609a.f3859c);
        c1609a.f3862f = 0;
        AbstractC1572e abstractC1572e3 = this.f3677l;
        this.f3677l = abstractC1572e;
        if (abstractC1572e != null) {
            abstractC1572e.registerAdapterDataObserver(c1588s);
            abstractC1572e.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager2 = this.f3679m;
        if (layoutManager2 != null) {
            layoutManager2.mo10253T();
        }
        AbstractC1572e abstractC1572e4 = this.f3677l;
        c1586q.f3748a.clear();
        c1586q.m10290e();
        C1584p m10292c = c1586q.m10292c();
        if (abstractC1572e3 != null) {
            m10292c.f3743b--;
        }
        if (m10292c.f3743b == 0) {
            int i = 0;
            while (true) {
                SparseArray<C1584p.C1585a> sparseArray = m10292c.f3742a;
                if (i >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i).f3744a.clear();
                i++;
            }
        }
        if (abstractC1572e4 != null) {
            m10292c.f3743b++;
        }
        this.f3676k0.f3778f = true;
        m10387U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable InterfaceC1576h interfaceC1576h) {
        if (interfaceC1576h == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC1576h != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f3667g) {
            this.f3646L = null;
            this.f3644J = null;
            this.f3645K = null;
            this.f3643I = null;
        }
        this.f3667g = z;
        super.setClipToPadding(z);
        if (this.f3695u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.f3642H = edgeEffectFactory;
        this.f3646L = null;
        this.f3644J = null;
        this.f3645K = null;
        this.f3643I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f3693t = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f3647M;
        if (itemAnimator2 != null) {
            itemAnimator2.mo10144e();
            this.f3647M.f3707a = null;
        }
        this.f3647M = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f3707a = this.f3686p0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1586q c1586q = this.f3659b;
        c1586q.f3752e = i;
        c1586q.m10283l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        C1614b.InterfaceC1616b interfaceC1616b;
        RecyclerView recyclerView;
        AbstractC1591u abstractC1591u;
        if (layoutManager == this.f3679m) {
            return;
        }
        int i = 0;
        setScrollState(0);
        RunnableC1596x runnableC1596x = this.f3670h0;
        RecyclerView.this.removeCallbacks(runnableC1596x);
        runnableC1596x.f3789c.abortAnimation();
        LayoutManager layoutManager2 = this.f3679m;
        if (layoutManager2 != null && (abstractC1591u = layoutManager2.f3719e) != null) {
            abstractC1591u.m10279d();
        }
        LayoutManager layoutManager3 = this.f3679m;
        C1586q c1586q = this.f3659b;
        if (layoutManager3 != null) {
            ItemAnimator itemAnimator = this.f3647M;
            if (itemAnimator != null) {
                itemAnimator.mo10144e();
            }
            this.f3679m.m10324j0(c1586q);
            this.f3679m.m10323k0(c1586q);
            c1586q.f3748a.clear();
            c1586q.m10290e();
            if (this.f3691s) {
                LayoutManager layoutManager4 = this.f3679m;
                layoutManager4.f3721g = false;
                layoutManager4.mo10251U(this);
            }
            this.f3679m.m10312w0(null);
            this.f3679m = null;
        } else {
            c1586q.f3748a.clear();
            c1586q.m10290e();
        }
        C1614b c1614b = this.f3663e;
        c1614b.f3872b.m10151g();
        ArrayList arrayList = c1614b.f3873c;
        int size = arrayList.size();
        while (true) {
            size--;
            interfaceC1616b = c1614b.f3871a;
            if (size < 0) {
                break;
            }
            C1648v c1648v = (C1648v) interfaceC1616b;
            c1648v.getClass();
            AbstractC1597y m10398J = m10398J((View) arrayList.get(size));
            if (m10398J != null) {
                m10398J.onLeftHiddenState(c1648v.f4007a);
            }
            arrayList.remove(size);
        }
        C1648v c1648v2 = (C1648v) interfaceC1616b;
        int m10104a = c1648v2.m10104a();
        while (true) {
            recyclerView = c1648v2.f4007a;
            if (i >= m10104a) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.m10362o(childAt);
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.f3679m = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f3716b == null) {
                layoutManager.m10312w0(this);
                if (this.f3691s) {
                    this.f3679m.f3721g = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f3716b.m10351z());
            }
        }
        c1586q.m10283l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0910e0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2628d) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0819i.m11696z(scrollingChildHelper.f2627c);
        }
        scrollingChildHelper.f2628d = z;
    }

    public void setOnFlingListener(@Nullable AbstractC1581m abstractC1581m) {
        this.f3656V = abstractC1581m;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable AbstractC1583o abstractC1583o) {
        this.f3678l0 = abstractC1583o;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3668g0 = z;
    }

    public void setRecycledViewPool(@Nullable C1584p c1584p) {
        C1584p c1584p2;
        C1586q c1586q = this.f3659b;
        if (c1586q.f3754g != null) {
            c1584p2.f3743b--;
        }
        c1586q.f3754g = c1584p;
        if (c1584p != null && RecyclerView.this.getAdapter() != null) {
            c1586q.f3754g.f3743b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(@Nullable InterfaceC1587r interfaceC1587r) {
        this.f3681n = interfaceC1587r;
    }

    void setScrollState(int i) {
        AbstractC1591u abstractC1591u;
        if (i == this.f3648N) {
            return;
        }
        this.f3648N = i;
        if (i != 2) {
            RunnableC1596x runnableC1596x = this.f3670h0;
            RecyclerView.this.removeCallbacks(runnableC1596x);
            runnableC1596x.f3789c.abortAnimation();
            LayoutManager layoutManager = this.f3679m;
            if (layoutManager != null && (abstractC1591u = layoutManager.f3719e) != null) {
                abstractC1591u.m10279d();
            }
        }
        LayoutManager layoutManager2 = this.f3679m;
        if (layoutManager2 != null) {
            layoutManager2.mo10222i0(i);
        }
        AbstractC1583o abstractC1583o = this.f3678l0;
        if (abstractC1583o != null) {
            abstractC1583o.mo4583a(i, this);
        }
        ArrayList arrayList = this.f3680m0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC1583o) this.f3680m0.get(size)).mo4583a(i, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f3655U = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f3655U = scaledTouchSlop;
    }

    public void setViewCacheExtension(@Nullable AbstractC1595w abstractC1595w) {
        this.f3659b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m11489g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m11488h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        AbstractC1591u abstractC1591u;
        if (z != this.f3701x) {
            m10368i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3701x = false;
                if (this.f3699w && this.f3679m != null && this.f3677l != null) {
                    requestLayout();
                }
                this.f3699w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3701x = true;
            this.f3703y = true;
            setScrollState(0);
            RunnableC1596x runnableC1596x = this.f3670h0;
            RecyclerView.this.removeCallbacks(runnableC1596x);
            runnableC1596x.f3789c.abortAnimation();
            LayoutManager layoutManager = this.f3679m;
            if (layoutManager != null && (abstractC1591u = layoutManager.f3719e) != null) {
                abstractC1591u.m10279d();
            }
        }
    }

    /* renamed from: t */
    public final void m10357t(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().m11491e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: u */
    public final void m10356u(int i, int i2) {
        this.f3641G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC1583o abstractC1583o = this.f3678l0;
        if (abstractC1583o != null) {
            abstractC1583o.mo4582b(this, i, i2);
        }
        ArrayList arrayList = this.f3680m0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((AbstractC1583o) this.f3680m0.get(size)).mo4582b(this, i, i2);
            }
        }
        this.f3641G--;
    }

    /* renamed from: v */
    public final void m10355v() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3646L != null) {
            return;
        }
        this.f3642H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3646L = edgeEffect;
        if (this.f3667g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: w */
    public final void m10354w() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3643I != null) {
            return;
        }
        this.f3642H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3643I = edgeEffect;
        if (this.f3667g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: x */
    public final void m10353x() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3645K != null) {
            return;
        }
        this.f3642H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3645K = edgeEffect;
        if (this.f3667g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: y */
    public final void m10352y() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3644J != null) {
            return;
        }
        this.f3642H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3644J = edgeEffect;
        if (this.f3667g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: z */
    public final String m10351z() {
        return " " + super.toString() + ", adapter:" + this.f3677l + ", layout:" + this.f3679m + ", context:" + getContext();
    }
}

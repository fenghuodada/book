package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.view.AbstractC1068a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC1821a mAdapter;
    private List<InterfaceC1814h> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC1815i mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C1811e> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C1817k mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC1815i mOnPageChangeListener;
    private List<InterfaceC1815i> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC1816j mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C1811e mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<C1811e> COMPARATOR = new C1807a();
    private static final Interpolator sInterpolator = new animationInterpolatorC1808b();
    private static final C1820m sPositionComparator = new C1820m();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface DecorView {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    public static class C1807a implements Comparator<C1811e> {
        @Override // java.util.Comparator
        public final int compare(C1811e c1811e, C1811e c1811e2) {
            return c1811e.f4401b - c1811e2.f4401b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationInterpolatorC1808b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    public class RunnableC1809c implements Runnable {
        public RunnableC1809c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C1810d implements InterfaceC0932i0 {

        /* renamed from: a */
        public final Rect f4398a = new Rect();

        public C1810d() {
        }

        @Override // androidx.core.view.InterfaceC0932i0
        /* renamed from: a */
        public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat m11776i = ViewCompat.m11776i(view, windowInsetsCompat);
            if (m11776i.f2565a.mo11605n()) {
                return m11776i;
            }
            int m11641c = m11776i.m11641c();
            Rect rect = this.f4398a;
            rect.left = m11641c;
            rect.top = m11776i.m11639e();
            rect.right = m11776i.m11640d();
            rect.bottom = m11776i.m11642b();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat m11783b = ViewCompat.m11783b(viewPager.getChildAt(i), m11776i);
                rect.left = Math.min(m11783b.m11641c(), rect.left);
                rect.top = Math.min(m11783b.m11639e(), rect.top);
                rect.right = Math.min(m11783b.m11640d(), rect.right);
                rect.bottom = Math.min(m11783b.m11642b(), rect.bottom);
            }
            return m11776i.m11637g(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public static class C1811e {

        /* renamed from: a */
        public Object f4400a;

        /* renamed from: b */
        public int f4401b;

        /* renamed from: c */
        public boolean f4402c;

        /* renamed from: d */
        public float f4403d;

        /* renamed from: e */
        public float f4404e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C1812f extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4405a;

        /* renamed from: b */
        public final int f4406b;

        /* renamed from: c */
        public float f4407c;

        /* renamed from: d */
        public boolean f4408d;

        /* renamed from: e */
        public int f4409e;

        /* renamed from: f */
        public int f4410f;

        public C1812f() {
            super(-1, -1);
            this.f4407c = 0.0f;
        }

        public C1812f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4407c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f4406b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public class C1813g extends C0851a {
        public C1813g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r0.getCount() > 1) goto L5;
         */
        @Override // androidx.core.view.C0851a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo4531c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.mo4531c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                androidx.viewpager.widget.a r0 = r3.mAdapter
                if (r0 == 0) goto L1a
                int r0 = r0.getCount()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                androidx.viewpager.widget.a r0 = r3.mAdapter
                if (r0 == 0) goto L3b
                int r0 = r0.getCount()
                r4.setItemCount(r0)
                int r0 = r3.mCurItem
                r4.setFromIndex(r0)
                int r3 = r3.mCurItem
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.C1813g.mo4531c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, C0874o c0874o) {
            boolean z;
            this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
            c0874o.m11551g(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            AbstractC1821a abstractC1821a = viewPager.mAdapter;
            if (abstractC1821a != null && abstractC1821a.getCount() > 1) {
                z = true;
            } else {
                z = false;
            }
            c0874o.m11548j(z);
            if (viewPager.canScrollHorizontally(1)) {
                c0874o.m11557a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                c0874o.m11557a(8192);
            }
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: g */
        public final boolean mo4307g(View view, int i, Bundle bundle) {
            int i2;
            if (super.mo4307g(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i != 4096) {
                if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                    return false;
                }
                i2 = viewPager.mCurItem - 1;
            } else if (!viewPager.canScrollHorizontally(1)) {
                return false;
            } else {
                i2 = viewPager.mCurItem + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public interface InterfaceC1814h {
        /* renamed from: a */
        void m9911a();
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC1815i {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @InterfaceC0074Px int i2);

        void onPageSelected(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1816j {
        void transformPage(@NonNull View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public class C1817k extends DataSetObserver {
        public C1817k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    public static class C1818l extends AbstractC1068a {
        public static final Parcelable.Creator<C1818l> CREATOR = new C1819a();

        /* renamed from: c */
        public int f4413c;

        /* renamed from: d */
        public Parcelable f4414d;

        /* renamed from: e */
        public final ClassLoader f4415e;

        /* renamed from: androidx.viewpager.widget.ViewPager$l$a */
        /* loaded from: classes.dex */
        public static class C1819a implements Parcelable.ClassLoaderCreator<C1818l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1818l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1818l[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1818l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1818l(parcel, classLoader);
            }
        }

        public C1818l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C1818l.class.getClassLoader() : classLoader;
            this.f4413c = parcel.readInt();
            this.f4414d = parcel.readParcelable(classLoader);
            this.f4415e = classLoader;
        }

        public C1818l(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return C0539e.m12264b(sb, this.f4413c, "}");
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f4413c);
            parcel.writeParcelable(this.f4414d, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C1820m implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            C1812f c1812f = (C1812f) view.getLayoutParams();
            C1812f c1812f2 = (C1812f) view2.getLayoutParams();
            boolean z = c1812f.f4405a;
            if (z != c1812f2.f4405a) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return c1812f.f4409e - c1812f2.f4409e;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C1811e();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC1809c();
        this.mScrollState = 0;
        initViewPager();
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C1811e();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC1809c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(C1811e c1811e, int i, C1811e c1811e2) {
        int i2;
        int i3;
        C1811e c1811e3;
        C1811e c1811e4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (c1811e2 != null) {
            int i4 = c1811e2.f4401b;
            int i5 = c1811e.f4401b;
            if (i4 < i5) {
                float f2 = c1811e2.f4404e + c1811e2.f4403d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c1811e.f4401b && i7 < this.mItems.size()) {
                    while (true) {
                        c1811e4 = this.mItems.get(i7);
                        if (i6 <= c1811e4.f4401b || i7 >= this.mItems.size() - 1) {
                            break;
                        }
                        i7++;
                    }
                    while (i6 < c1811e4.f4401b) {
                        f2 += this.mAdapter.getPageWidth(i6) + f;
                        i6++;
                    }
                    c1811e4.f4404e = f2;
                    f2 += c1811e4.f4403d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f3 = c1811e2.f4404e;
                while (true) {
                    i4--;
                    if (i4 < c1811e.f4401b || size < 0) {
                        break;
                    }
                    while (true) {
                        c1811e3 = this.mItems.get(size);
                        if (i4 >= c1811e3.f4401b || size <= 0) {
                            break;
                        }
                        size--;
                    }
                    while (i4 > c1811e3.f4401b) {
                        f3 -= this.mAdapter.getPageWidth(i4) + f;
                        i4--;
                    }
                    f3 -= c1811e3.f4403d + f;
                    c1811e3.f4404e = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = c1811e.f4404e;
        int i8 = c1811e.f4401b;
        int i9 = i8 - 1;
        this.mFirstOffset = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = count - 1;
        this.mLastOffset = i8 == i10 ? (c1811e.f4403d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1811e c1811e5 = this.mItems.get(i11);
            while (true) {
                i3 = c1811e5.f4401b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.mAdapter.getPageWidth(i9) + f;
                i9--;
            }
            f4 -= c1811e5.f4403d + f;
            c1811e5.f4404e = f4;
            if (i3 == 0) {
                this.mFirstOffset = f4;
            }
            i11--;
            i9--;
        }
        float f5 = c1811e.f4404e + c1811e.f4403d + f;
        int i12 = c1811e.f4401b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1811e c1811e6 = this.mItems.get(i13);
            while (true) {
                i2 = c1811e6.f4401b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.mAdapter.getPageWidth(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.mLastOffset = (c1811e6.f4403d + f5) - 1.0f;
            }
            c1811e6.f4404e = f5;
            f5 += c1811e6.f4403d + f;
            i13++;
            i12++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C1811e c1811e = this.mItems.get(i);
            if (c1811e.f4402c) {
                c1811e.f4402c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                Runnable runnable = this.mEndScrollRunnable;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11752m(this, runnable);
                return;
            }
            this.mEndScrollRunnable.run();
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() > 0) {
            ArrayList<C1811e> arrayList = this.mItems;
            return Math.max(this.mItems.get(0).f4401b, Math.min(i, arrayList.get(arrayList.size() - 1).f4401b));
        }
        return i;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        InterfaceC1815i interfaceC1815i = this.mOnPageChangeListener;
        if (interfaceC1815i != null) {
            interfaceC1815i.onPageScrolled(i, f, i2);
        }
        List<InterfaceC1815i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1815i interfaceC1815i2 = this.mOnPageChangeListeners.get(i3);
                if (interfaceC1815i2 != null) {
                    interfaceC1815i2.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC1815i interfaceC1815i3 = this.mInternalPageChangeListener;
        if (interfaceC1815i3 != null) {
            interfaceC1815i3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        InterfaceC1815i interfaceC1815i = this.mOnPageChangeListener;
        if (interfaceC1815i != null) {
            interfaceC1815i.onPageSelected(i);
        }
        List<InterfaceC1815i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1815i interfaceC1815i2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC1815i2 != null) {
                    interfaceC1815i2.onPageSelected(i);
                }
            }
        }
        InterfaceC1815i interfaceC1815i3 = this.mInternalPageChangeListener;
        if (interfaceC1815i3 != null) {
            interfaceC1815i3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        InterfaceC1815i interfaceC1815i = this.mOnPageChangeListener;
        if (interfaceC1815i != null) {
            interfaceC1815i.onPageScrollStateChanged(i);
        }
        List<InterfaceC1815i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1815i interfaceC1815i2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC1815i2 != null) {
                    interfaceC1815i2.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC1815i interfaceC1815i3 = this.mInternalPageChangeListener;
        if (interfaceC1815i3 != null) {
            interfaceC1815i3.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C1811e infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C1811e c1811e = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            C1811e c1811e2 = this.mItems.get(i2);
            if (!z && c1811e2.f4401b != (i = i3 + 1)) {
                c1811e2 = this.mTempItem;
                c1811e2.f4404e = f + f3 + f2;
                c1811e2.f4401b = i;
                c1811e2.f4403d = this.mAdapter.getPageWidth(i);
                i2--;
            }
            C1811e c1811e3 = c1811e2;
            f = c1811e3.f4404e;
            float f4 = c1811e3.f4403d + f + f2;
            if (!z && scrollX < f) {
                return c1811e;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return c1811e3;
            }
            int i4 = c1811e3.f4401b;
            float f5 = c1811e3.f4403d;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            c1811e = c1811e3;
        }
        return c1811e;
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1811e infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = infoForCurrentScrollPosition.f4401b;
        float f2 = ((i / f) - infoForCurrentScrollPosition.f4404e) / (infoForCurrentScrollPosition.f4403d + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C1811e c1811e = this.mItems.get(0);
        ArrayList<C1811e> arrayList = this.mItems;
        C1811e c1811e2 = arrayList.get(arrayList.size() - 1);
        if (c1811e.f4401b != 0) {
            f3 = c1811e.f4404e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c1811e2.f4401b != this.mAdapter.getCount() - 1) {
            f4 = c1811e2.f4404e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C1811e infoForPosition = infoForPosition(this.mCurItem);
            min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f4404e, this.mLastOffset) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            completeScroll(false);
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C1812f) getChildAt(i).getLayoutParams()).f4405a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C1811e infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.f4404e, this.mLastOffset)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1811e infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4401b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public C1811e addNewItem(int i, int i2) {
        C1811e c1811e = new C1811e();
        c1811e.f4401b = i;
        c1811e.f4400a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        c1811e.f4403d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(c1811e);
        } else {
            this.mItems.add(i2, c1811e);
        }
        return c1811e;
    }

    public void addOnAdapterChangeListener(@NonNull InterfaceC1814h interfaceC1814h) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC1814h);
    }

    public void addOnPageChangeListener(@NonNull InterfaceC1815i interfaceC1815i) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC1815i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C1811e infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4401b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1812f c1812f = (C1812f) layoutParams;
        boolean isDecorView = c1812f.f4405a | isDecorView(view);
        c1812f.f4405a = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (isDecorView) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            c1812f.f4408d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L66
        Lb:
            if (r0 == 0) goto L66
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L66:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb2
            if (r3 == r0) goto Lb2
            if (r7 != r5) goto L97
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L91
            if (r1 < r2) goto L91
            boolean r0 = r6.pageLeft()
            goto L95
        L91:
            boolean r0 = r3.requestFocus()
        L95:
            r2 = r0
            goto Lc5
        L97:
            if (r7 != r4) goto Lc5
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L91
            if (r1 > r2) goto L91
            boolean r0 = r6.pageRight()
            goto L95
        Lb2:
            if (r7 == r5) goto Lc1
            if (r7 != r1) goto Lb7
            goto Lc1
        Lb7:
            if (r7 == r4) goto Lbc
            r0 = 2
            if (r7 != r0) goto Lc5
        Lbc:
            boolean r2 = r6.pageRight()
            goto Lc5
        Lc1:
            boolean r2 = r6.pageLeft()
        Lc5:
            if (r2 == 0) goto Lce
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1812f) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC1815i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
            return;
        }
        completeScroll(true);
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C1811e c1811e = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(c1811e.f4400a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c1811e.f4401b, c1811e.f4400a);
                    int i3 = this.mCurItem;
                    if (i3 == c1811e.f4401b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = c1811e.f4401b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        c1811e.f4401b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C1812f c1812f = (C1812f) getChildAt(i5).getLayoutParams();
                if (!c1812f.f4405a) {
                    c1812f.f4407c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1811e infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4401b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC1821a abstractC1821a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC1821a = this.mAdapter) == null || abstractC1821a.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1811e infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f4401b, ((scrollX / clientWidth) - infoForCurrentScrollPosition.f4404e) / infoForCurrentScrollPosition.f4403d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                i = 17;
            }
            return arrowScroll(i);
        }
        return false;
    }

    public void fakeDragBy(float f) {
        ArrayList<C1811e> arrayList;
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        C1811e c1811e = this.mItems.get(0);
        C1811e c1811e2 = this.mItems.get(arrayList.size() - 1);
        if (c1811e.f4401b != 0) {
            f2 = c1811e.f4404e * clientWidth;
        }
        if (c1811e2.f4401b != this.mAdapter.getCount() - 1) {
            f3 = c1811e2.f4404e * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1812f();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1812f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public AbstractC1821a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C1812f) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f4410f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C1811e infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public C1811e infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C1811e c1811e = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, c1811e.f4400a)) {
                return c1811e;
            }
        }
        return null;
    }

    public C1811e infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C1811e c1811e = this.mItems.get(i2);
            if (c1811e.f4401b == i) {
                return c1811e;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.m11771n(this, new C1813g());
        if (ViewCompat.C0814d.m11762c(this) == 0) {
            ViewCompat.C0814d.m11746s(this, 1);
        }
        ViewCompat.C0819i.m11701u(this, new C1810d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f3 = this.mPageMargin / width2;
        int i2 = 0;
        C1811e c1811e = this.mItems.get(0);
        float f4 = c1811e.f4404e;
        int size = this.mItems.size();
        int i3 = c1811e.f4401b;
        int i4 = this.mItems.get(size - 1).f4401b;
        while (i3 < i4) {
            while (true) {
                i = c1811e.f4401b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c1811e = this.mItems.get(i2);
            }
            if (i3 == i) {
                float f5 = c1811e.f4404e;
                float f6 = c1811e.f4403d;
                f = (f5 + f6) * width2;
                f4 = f5 + f6 + f3;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i3);
                f = (f4 + pageWidth) * width2;
                f4 = pageWidth + f3 + f4;
            }
            if (this.mPageMargin + f > scrollX) {
                f2 = f3;
                this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i = this.mActivePointerId;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.mLastMotionX;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.mInitialMotionY);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                            this.mLastMotionX = x;
                            this.mLastMotionY = y;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i3 = this.mTouchSlop;
                        if (abs > i3 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f3 = this.mInitialMotionX;
                            float f4 = this.mTouchSlop;
                            if (i2 > 0) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i3) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x)) {
                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                            ViewCompat.C0814d.m11754k(this);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.mInitialMotionX = x2;
                this.mLastMotionX = x2;
                float y2 = motionEvent.getY();
                this.mInitialMotionY = y2;
                this.mLastMotionY = y2;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C1812f c1812f;
        C1812f c1812f2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c1812f2 = (C1812f) childAt.getLayoutParams()) != null && c1812f2.f4405a) {
                int i6 = c1812f2.f4406b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c1812f2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c1812f2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c1812f = (C1812f) childAt2.getLayoutParams()) == null || !c1812f.f4405a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c1812f.f4407c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.C1812f) r9
            boolean r10 = r9.f4405a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4406b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r0 = (androidx.viewpager.widget.ViewPager.C1812f) r0
            boolean r0 = r0.f4405a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C1811e infoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4401b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1818l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1818l c1818l = (C1818l) parcelable;
        super.onRestoreInstanceState(c1818l.f2747a);
        AbstractC1821a abstractC1821a = this.mAdapter;
        ClassLoader classLoader = c1818l.f4415e;
        if (abstractC1821a != null) {
            abstractC1821a.restoreState(c1818l.f4414d, classLoader);
            setCurrentItemInternal(c1818l.f4413c, false, true);
            return;
        }
        this.mRestoredCurItem = c1818l.f4413c;
        this.mRestoredAdapterState = c1818l.f4414d;
        this.mRestoredClassLoader = classLoader;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1818l c1818l = new C1818l(super.onSaveInstanceState());
        c1818l.f4413c = this.mCurItem;
        AbstractC1821a abstractC1821a = this.mAdapter;
        if (abstractC1821a != null) {
            c1818l.f4414d = abstractC1821a.saveState();
        }
        return c1818l;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        AbstractC1821a abstractC1821a = this.mAdapter;
        if (abstractC1821a == null || this.mCurItem >= abstractC1821a.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
        r5 = r17.mItems.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void removeOnAdapterChangeListener(@NonNull InterfaceC1814h interfaceC1814h) {
        List<InterfaceC1814h> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC1814h);
        }
    }

    public void removeOnPageChangeListener(@NonNull InterfaceC1815i interfaceC1815i) {
        List<InterfaceC1815i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC1815i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable AbstractC1821a abstractC1821a) {
        AbstractC1821a abstractC1821a2 = this.mAdapter;
        if (abstractC1821a2 != null) {
            abstractC1821a2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C1811e c1811e = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, c1811e.f4401b, c1811e.f4400a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = abstractC1821a;
        this.mExpectedAdapterCount = 0;
        if (abstractC1821a != null) {
            if (this.mObserver == null) {
                this.mObserver = new C1817k();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<InterfaceC1814h> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mAdapterChangeListeners.get(i2).m9911a();
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        AbstractC1821a abstractC1821a = this.mAdapter;
        if (abstractC1821a == null || abstractC1821a.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f4402c = true;
                }
            }
            boolean z3 = this.mCurItem != i;
            if (!this.mFirstLayout) {
                populate(i);
                scrollToItem(i, z, i2, z3);
                return;
            }
            this.mCurItem = i;
            if (z3) {
                dispatchOnPageSelected(i);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public InterfaceC1815i setInternalPageChangeListener(InterfaceC1815i interfaceC1815i) {
        InterfaceC1815i interfaceC1815i2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC1815i;
        return interfaceC1815i2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1815i interfaceC1815i) {
        this.mOnPageChangeListener = interfaceC1815i;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f2323a;
        setPageMarginDrawable(ContextCompat.C0651c.m12032b(context, i));
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable InterfaceC1816j interfaceC1816j) {
        setPageTransformer(z, interfaceC1816j, 2);
    }

    public void setPageTransformer(boolean z, @Nullable InterfaceC1816j interfaceC1816j, int i) {
        boolean z2 = interfaceC1816j != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC1816j;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            enableLayers(i != 0);
        }
        dispatchOnScrollStateChanged(i);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        boolean z;
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((this.mAdapter.getPageWidth(this.mCurItem) * f) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, (int) MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11754k(this);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.InterfaceC0231p;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1055j;
import androidx.core.widget.C1056k;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.e1 */
/* loaded from: classes.dex */
public class C0334e1 implements InterfaceC0231p {

    /* renamed from: A */
    public static final Method f1193A;

    /* renamed from: B */
    public static final Method f1194B;

    /* renamed from: C */
    public static final Method f1195C;

    /* renamed from: a */
    public final Context f1196a;

    /* renamed from: b */
    public ListAdapter f1197b;

    /* renamed from: c */
    public C0435z0 f1198c;

    /* renamed from: f */
    public int f1201f;

    /* renamed from: g */
    public int f1202g;

    /* renamed from: i */
    public boolean f1204i;

    /* renamed from: j */
    public boolean f1205j;

    /* renamed from: k */
    public boolean f1206k;

    /* renamed from: n */
    public C0338d f1209n;

    /* renamed from: o */
    public View f1210o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f1211p;

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f1212q;

    /* renamed from: v */
    public final Handler f1217v;

    /* renamed from: x */
    public Rect f1219x;

    /* renamed from: y */
    public boolean f1220y;

    /* renamed from: z */
    public final C0407r f1221z;

    /* renamed from: d */
    public final int f1199d = -2;

    /* renamed from: e */
    public int f1200e = -2;

    /* renamed from: h */
    public final int f1203h = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;

    /* renamed from: l */
    public int f1207l = 0;

    /* renamed from: m */
    public final int f1208m = Integer.MAX_VALUE;

    /* renamed from: r */
    public final RunnableC0341g f1213r = new RunnableC0341g();

    /* renamed from: s */
    public final View$OnTouchListenerC0340f f1214s = new View$OnTouchListenerC0340f();

    /* renamed from: t */
    public final C0339e f1215t = new C0339e();

    /* renamed from: u */
    public final RunnableC0337c f1216u = new RunnableC0337c();

    /* renamed from: w */
    public final Rect f1218w = new Rect();

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.widget.e1$a */
    /* loaded from: classes.dex */
    public static class C0335a {
        @DoNotInline
        /* renamed from: a */
        public static int m12643a(PopupWindow popupWindow, View view, int i, boolean z) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i, z);
            return maxAvailableHeight;
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.appcompat.widget.e1$b */
    /* loaded from: classes.dex */
    public static class C0336b {
        @DoNotInline
        /* renamed from: a */
        public static void m12642a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12641b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$c */
    /* loaded from: classes.dex */
    public class RunnableC0337c implements Runnable {
        public RunnableC0337c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0435z0 c0435z0 = C0334e1.this.f1198c;
            if (c0435z0 != null) {
                c0435z0.setListSelectionHidden(true);
                c0435z0.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$d */
    /* loaded from: classes.dex */
    public class C0338d extends DataSetObserver {
        public C0338d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0334e1 c0334e1 = C0334e1.this;
            if (c0334e1.mo12653a()) {
                c0334e1.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C0334e1.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$e */
    /* loaded from: classes.dex */
    public class C0339e implements AbsListView.OnScrollListener {
        public C0339e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                C0334e1 c0334e1 = C0334e1.this;
                if (c0334e1.f1221z.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && c0334e1.f1221z.getContentView() != null) {
                    Handler handler = c0334e1.f1217v;
                    RunnableC0341g runnableC0341g = c0334e1.f1213r;
                    handler.removeCallbacks(runnableC0341g);
                    runnableC0341g.run();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0340f implements View.OnTouchListener {
        public View$OnTouchListenerC0340f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0407r c0407r;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            C0334e1 c0334e1 = C0334e1.this;
            if (action == 0 && (c0407r = c0334e1.f1221z) != null && c0407r.isShowing() && x >= 0) {
                C0407r c0407r2 = c0334e1.f1221z;
                if (x < c0407r2.getWidth() && y >= 0 && y < c0407r2.getHeight()) {
                    c0334e1.f1217v.postDelayed(c0334e1.f1213r, 250L);
                    return false;
                }
            }
            if (action == 1) {
                c0334e1.f1217v.removeCallbacks(c0334e1.f1213r);
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.e1$g */
    /* loaded from: classes.dex */
    public class RunnableC0341g implements Runnable {
        public RunnableC0341g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0334e1 c0334e1 = C0334e1.this;
            C0435z0 c0435z0 = c0334e1.f1198c;
            if (c0435z0 != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0817g.m11730b(c0435z0) && c0334e1.f1198c.getCount() > c0334e1.f1198c.getChildCount() && c0334e1.f1198c.getChildCount() <= c0334e1.f1208m) {
                    c0334e1.f1221z.setInputMethodMode(2);
                    c0334e1.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1193A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1195C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1194B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0334e1(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f1196a = context;
        this.f1217v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f424o, i, i2);
        this.f1201f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1202g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1204i = true;
        }
        obtainStyledAttributes.recycle();
        C0407r c0407r = new C0407r(context, attributeSet, i, i2);
        this.f1221z = c0407r;
        c0407r.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    /* renamed from: a */
    public final boolean mo12653a() {
        return this.f1221z.isShowing();
    }

    /* renamed from: b */
    public final int m12652b() {
        return this.f1201f;
    }

    /* renamed from: d */
    public final void m12651d(int i) {
        this.f1201f = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void dismiss() {
        C0407r c0407r = this.f1221z;
        c0407r.dismiss();
        c0407r.setContentView(null);
        this.f1198c = null;
        this.f1217v.removeCallbacks(this.f1213r);
    }

    @Nullable
    /* renamed from: g */
    public final Drawable m12650g() {
        return this.f1221z.getBackground();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    @Nullable
    /* renamed from: h */
    public final C0435z0 mo12649h() {
        return this.f1198c;
    }

    /* renamed from: j */
    public final void m12648j(@Nullable Drawable drawable) {
        this.f1221z.setBackgroundDrawable(drawable);
    }

    /* renamed from: k */
    public final void m12647k(int i) {
        this.f1202g = i;
        this.f1204i = true;
    }

    /* renamed from: n */
    public final int m12646n() {
        if (this.f1204i) {
            return this.f1202g;
        }
        return 0;
    }

    /* renamed from: o */
    public void mo12645o(@Nullable ListAdapter listAdapter) {
        C0338d c0338d = this.f1209n;
        if (c0338d == null) {
            this.f1209n = new C0338d();
        } else {
            ListAdapter listAdapter2 = this.f1197b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0338d);
            }
        }
        this.f1197b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1209n);
        }
        C0435z0 c0435z0 = this.f1198c;
        if (c0435z0 != null) {
            c0435z0.setAdapter(this.f1197b);
        }
    }

    @NonNull
    /* renamed from: p */
    public C0435z0 mo12621p(Context context, boolean z) {
        return new C0435z0(context, z);
    }

    /* renamed from: q */
    public final void m12644q(int i) {
        Drawable background = this.f1221z.getBackground();
        if (background != null) {
            Rect rect = this.f1218w;
            background.getPadding(rect);
            this.f1200e = rect.left + rect.right + i;
            return;
        }
        this.f1200e = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void show() {
        int i;
        boolean z;
        int m12643a;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        C0435z0 c0435z0;
        int i4;
        int i5;
        C0435z0 c0435z02 = this.f1198c;
        C0407r c0407r = this.f1221z;
        Context context = this.f1196a;
        if (c0435z02 == null) {
            C0435z0 mo12621p = mo12621p(context, !this.f1220y);
            this.f1198c = mo12621p;
            mo12621p.setAdapter(this.f1197b);
            this.f1198c.setOnItemClickListener(this.f1211p);
            this.f1198c.setFocusable(true);
            this.f1198c.setFocusableInTouchMode(true);
            this.f1198c.setOnItemSelectedListener(new C0318c1(this));
            this.f1198c.setOnScrollListener(this.f1215t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1212q;
            if (onItemSelectedListener != null) {
                this.f1198c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0407r.setContentView(this.f1198c);
        } else {
            ViewGroup viewGroup = (ViewGroup) c0407r.getContentView();
        }
        Drawable background = c0407r.getBackground();
        int i6 = 0;
        Rect rect = this.f1218w;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.f1204i) {
                this.f1202g = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (c0407r.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f1210o;
        int i8 = this.f1202g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1194B;
            if (method != null) {
                try {
                    m12643a = ((Integer) method.invoke(c0407r, view, Integer.valueOf(i8), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            m12643a = c0407r.getMaxAvailableHeight(view, i8);
        } else {
            m12643a = C0335a.m12643a(c0407r, view, i8, z);
        }
        int i9 = this.f1199d;
        if (i9 == -1) {
            i3 = m12643a + i;
        } else {
            int i10 = this.f1200e;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int m12455a = this.f1198c.m12455a(makeMeasureSpec, m12643a + 0);
            if (m12455a > 0) {
                i2 = this.f1198c.getPaddingBottom() + this.f1198c.getPaddingTop() + i + 0;
            } else {
                i2 = 0;
            }
            i3 = m12455a + i2;
        }
        if (c0407r.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1056k.m11245d(c0407r, this.f1203h);
        if (c0407r.isShowing()) {
            View view2 = this.f1210o;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (!ViewCompat.C0817g.m11730b(view2)) {
                return;
            }
            int i11 = this.f1200e;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.f1210o.getWidth();
            }
            if (i9 == -1) {
                if (z2) {
                    i9 = i3;
                } else {
                    i9 = -1;
                }
                int i12 = this.f1200e;
                if (z2) {
                    if (i12 == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    c0407r.setWidth(i5);
                    c0407r.setHeight(0);
                } else {
                    if (i12 == -1) {
                        i6 = -1;
                    }
                    c0407r.setWidth(i6);
                    c0407r.setHeight(-1);
                }
            } else if (i9 == -2) {
                i9 = i3;
            }
            c0407r.setOutsideTouchable(true);
            View view3 = this.f1210o;
            int i13 = this.f1201f;
            int i14 = this.f1202g;
            if (i11 < 0) {
                i11 = -1;
            }
            if (i9 < 0) {
                i4 = -1;
            } else {
                i4 = i9;
            }
            c0407r.update(view3, i13, i14, i11, i4);
            return;
        }
        int i15 = this.f1200e;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.f1210o.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i3;
        }
        c0407r.setWidth(i15);
        c0407r.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1193A;
            if (method2 != null) {
                try {
                    method2.invoke(c0407r, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0336b.m12641b(c0407r, true);
        }
        c0407r.setOutsideTouchable(true);
        c0407r.setTouchInterceptor(this.f1214s);
        if (this.f1206k) {
            C1056k.m11246c(c0407r, this.f1205j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1195C;
            if (method3 != null) {
                try {
                    method3.invoke(c0407r, this.f1219x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            C0336b.m12642a(c0407r, this.f1219x);
        }
        C1055j.m11249a(c0407r, this.f1210o, this.f1201f, this.f1202g, this.f1207l);
        this.f1198c.setSelection(-1);
        if ((!this.f1220y || this.f1198c.isInTouchMode()) && (c0435z0 = this.f1198c) != null) {
            c0435z0.setListSelectionHidden(true);
            c0435z0.requestLayout();
        }
        if (!this.f1220y) {
            this.f1217v.post(this.f1216u);
        }
    }
}

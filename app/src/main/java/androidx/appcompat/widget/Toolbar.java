package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.RunnableC0038b;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0157c;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.C0186f;
import androidx.appcompat.view.InterfaceC0180b;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.view.menu.SubMenuC0236s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.C0983p;
import androidx.core.view.InterfaceC0895b0;
import androidx.core.view.InterfaceC0968m;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0968m {

    /* renamed from: A */
    public ColorStateList f1010A;

    /* renamed from: B */
    public boolean f1011B;

    /* renamed from: C */
    public boolean f1012C;

    /* renamed from: D */
    public final ArrayList<View> f1013D;

    /* renamed from: E */
    public final ArrayList<View> f1014E;

    /* renamed from: F */
    public final int[] f1015F;

    /* renamed from: G */
    public final C0983p f1016G;

    /* renamed from: H */
    public ArrayList<MenuItem> f1017H;

    /* renamed from: I */
    public InterfaceC0280h f1018I;

    /* renamed from: J */
    public final C0273a f1019J;

    /* renamed from: K */
    public C0307b2 f1020K;

    /* renamed from: L */
    public C0309c f1021L;

    /* renamed from: M */
    public C0278f f1022M;

    /* renamed from: N */
    public InterfaceC0226m.InterfaceC0227a f1023N;

    /* renamed from: O */
    public C0210g.InterfaceC0211a f1024O;

    /* renamed from: P */
    public boolean f1025P;

    /* renamed from: Q */
    public OnBackInvokedCallback f1026Q;

    /* renamed from: R */
    public OnBackInvokedDispatcher f1027R;

    /* renamed from: S */
    public boolean f1028S;

    /* renamed from: T */
    public final RunnableC0274b f1029T;

    /* renamed from: a */
    public ActionMenuView f1030a;

    /* renamed from: b */
    public C0383m0 f1031b;

    /* renamed from: c */
    public C0383m0 f1032c;

    /* renamed from: d */
    public C0398o f1033d;

    /* renamed from: e */
    public AppCompatImageView f1034e;

    /* renamed from: f */
    public final Drawable f1035f;

    /* renamed from: g */
    public final CharSequence f1036g;

    /* renamed from: h */
    public C0398o f1037h;

    /* renamed from: i */
    public View f1038i;

    /* renamed from: j */
    public Context f1039j;

    /* renamed from: k */
    public int f1040k;

    /* renamed from: l */
    public int f1041l;

    /* renamed from: m */
    public int f1042m;

    /* renamed from: n */
    public final int f1043n;

    /* renamed from: o */
    public final int f1044o;

    /* renamed from: p */
    public int f1045p;

    /* renamed from: q */
    public int f1046q;

    /* renamed from: r */
    public int f1047r;

    /* renamed from: s */
    public int f1048s;

    /* renamed from: t */
    public C0387m1 f1049t;

    /* renamed from: u */
    public int f1050u;

    /* renamed from: v */
    public int f1051v;

    /* renamed from: w */
    public final int f1052w;

    /* renamed from: x */
    public CharSequence f1053x;

    /* renamed from: y */
    public CharSequence f1054y;

    /* renamed from: z */
    public ColorStateList f1055z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C0273a implements ActionMenuView.InterfaceC0248e {
        public C0273a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public class RunnableC0274b implements Runnable {
        public RunnableC0274b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0309c c0309c;
            ActionMenuView actionMenuView = Toolbar.this.f1030a;
            if (actionMenuView != null && (c0309c = actionMenuView.f851t) != null) {
                c0309c.m12703l();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class C0275c implements C0210g.InterfaceC0211a {
        public C0275c() {
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: a */
        public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
            C0210g.InterfaceC0211a interfaceC0211a = Toolbar.this.f1024O;
            return interfaceC0211a != null && interfaceC0211a.mo12747a(c0210g, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: b */
        public final void mo12746b(@NonNull C0210g c0210g) {
            boolean z;
            Toolbar toolbar = Toolbar.this;
            C0309c c0309c = toolbar.f1030a.f851t;
            if (c0309c != null && c0309c.m12704k()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Iterator<InterfaceC0895b0> it = toolbar.f1016G.f2663b.iterator();
                while (it.hasNext()) {
                    it.next().onPrepareMenu(c0210g);
                }
            }
            C0210g.InterfaceC0211a interfaceC0211a = toolbar.f1024O;
            if (interfaceC0211a != null) {
                interfaceC0211a.mo12746b(c0210g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0276d implements View.OnClickListener {
        public View$OnClickListenerC0276d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0214i c0214i;
            C0278f c0278f = Toolbar.this.f1022M;
            if (c0278f == null) {
                c0214i = null;
            } else {
                c0214i = c0278f.f1061b;
            }
            if (c0214i != null) {
                c0214i.collapseActionView();
            }
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0277e {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m12745a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static OnBackInvokedCallback m12744b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.z1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12743c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m12742d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public class C0278f implements InterfaceC0226m {

        /* renamed from: a */
        public C0210g f1060a;

        /* renamed from: b */
        public C0214i f1061b;

        public C0278f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: b */
        public final void mo12710b(C0210g c0210g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: c */
        public final boolean mo12709c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: e */
        public final boolean mo12741e(C0214i c0214i) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.f1038i;
            if (view instanceof InterfaceC0180b) {
                ((InterfaceC0180b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f1038i);
            toolbar.removeView(toolbar.f1037h);
            toolbar.f1038i = null;
            ArrayList<View> arrayList = toolbar.f1014E;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f1061b = null;
                    toolbar.requestLayout();
                    c0214i.f714C = false;
                    c0214i.f728n.m12843p(false);
                    toolbar.m12748s();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: f */
        public final void mo12708f(Context context, C0210g c0210g) {
            C0214i c0214i;
            C0210g c0210g2 = this.f1060a;
            if (c0210g2 != null && (c0214i = this.f1061b) != null) {
                c0210g2.mo12815d(c0214i);
            }
            this.f1060a = c0210g;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: g */
        public final void mo12707g() {
            if (this.f1061b != null) {
                C0210g c0210g = this.f1060a;
                boolean z = false;
                if (c0210g != null) {
                    int size = c0210g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1060a.getItem(i) == this.f1061b) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    return;
                }
                mo12741e(this.f1061b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: i */
        public final boolean mo12705i(SubMenuC0236s subMenuC0236s) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m
        /* renamed from: j */
        public final boolean mo12740j(C0214i c0214i) {
            Toolbar toolbar = Toolbar.this;
            toolbar.m12763c();
            ViewParent parent = toolbar.f1037h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1037h);
                }
                toolbar.addView(toolbar.f1037h);
            }
            View actionView = c0214i.getActionView();
            toolbar.f1038i = actionView;
            this.f1061b = c0214i;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f1038i);
                }
                C0279g c0279g = new C0279g();
                c0279g.f148a = (toolbar.f1043n & 112) | 8388611;
                c0279g.f1063b = 2;
                toolbar.f1038i.setLayoutParams(c0279g);
                toolbar.addView(toolbar.f1038i);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((C0279g) childAt.getLayoutParams()).f1063b != 2 && childAt != toolbar.f1030a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f1014E.add(childAt);
                }
            }
            toolbar.requestLayout();
            c0214i.f714C = true;
            c0214i.f728n.m12843p(false);
            View view = toolbar.f1038i;
            if (view instanceof InterfaceC0180b) {
                ((InterfaceC0180b) view).onActionViewExpanded();
            }
            toolbar.m12748s();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0279g extends ActionBar.C0080a {

        /* renamed from: b */
        public int f1063b;

        public C0279g() {
            this.f1063b = 0;
            this.f148a = 8388627;
        }

        public C0279g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1063b = 0;
        }

        public C0279g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1063b = 0;
        }

        public C0279g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1063b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0279g(ActionBar.C0080a c0080a) {
            super(c0080a);
            this.f1063b = 0;
        }

        public C0279g(C0279g c0279g) {
            super((ActionBar.C0080a) c0279g);
            this.f1063b = 0;
            this.f1063b = c0279g.f1063b;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0280h {
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$i */
    /* loaded from: classes.dex */
    public static class C0281i extends AbstractC1068a {
        public static final Parcelable.Creator<C0281i> CREATOR = new C0282a();

        /* renamed from: c */
        public int f1064c;

        /* renamed from: d */
        public boolean f1065d;

        /* renamed from: androidx.appcompat.widget.Toolbar$i$a */
        /* loaded from: classes.dex */
        public class C0282a implements Parcelable.ClassLoaderCreator<C0281i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0281i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0281i[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0281i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0281i(parcel, classLoader);
            }
        }

        public C0281i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1064c = parcel.readInt();
            this.f1065d = parcel.readInt() != 0;
        }

        public C0281i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f1064c);
            parcel.writeInt(this.f1065d ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1052w = 8388627;
        this.f1013D = new ArrayList<>();
        this.f1014E = new ArrayList<>();
        this.f1015F = new int[2];
        this.f1016G = new C0983p(new Runnable() { // from class: androidx.appcompat.widget.y1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m12755l();
            }
        });
        this.f1017H = new ArrayList<>();
        this.f1019J = new C0273a();
        this.f1029T = new RunnableC0274b();
        Context context2 = getContext();
        int[] iArr = C0157c.f434y;
        C0430x1 m12465m = C0430x1.m12465m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        ViewCompat.m11772m(this, context, iArr, attributeSet, m12465m.f1406b, R.attr.toolbarStyle);
        this.f1041l = m12465m.m12469i(28, 0);
        this.f1042m = m12465m.m12469i(19, 0);
        TypedArray typedArray = m12465m.f1406b;
        this.f1052w = typedArray.getInteger(0, 8388627);
        this.f1043n = typedArray.getInteger(2, 48);
        int m12475c = m12465m.m12475c(22, 0);
        m12475c = m12465m.m12466l(27) ? m12465m.m12475c(27, m12475c) : m12475c;
        this.f1048s = m12475c;
        this.f1047r = m12475c;
        this.f1046q = m12475c;
        this.f1045p = m12475c;
        int m12475c2 = m12465m.m12475c(25, -1);
        if (m12475c2 >= 0) {
            this.f1045p = m12475c2;
        }
        int m12475c3 = m12465m.m12475c(24, -1);
        if (m12475c3 >= 0) {
            this.f1046q = m12475c3;
        }
        int m12475c4 = m12465m.m12475c(26, -1);
        if (m12475c4 >= 0) {
            this.f1047r = m12475c4;
        }
        int m12475c5 = m12465m.m12475c(23, -1);
        if (m12475c5 >= 0) {
            this.f1048s = m12475c5;
        }
        this.f1044o = m12465m.m12474d(13, -1);
        int m12475c6 = m12465m.m12475c(9, Integer.MIN_VALUE);
        int m12475c7 = m12465m.m12475c(5, Integer.MIN_VALUE);
        int m12474d = m12465m.m12474d(7, 0);
        int m12474d2 = m12465m.m12474d(8, 0);
        if (this.f1049t == null) {
            this.f1049t = new C0387m1();
        }
        C0387m1 c0387m1 = this.f1049t;
        c0387m1.f1325h = false;
        if (m12474d != Integer.MIN_VALUE) {
            c0387m1.f1322e = m12474d;
            c0387m1.f1318a = m12474d;
        }
        if (m12474d2 != Integer.MIN_VALUE) {
            c0387m1.f1323f = m12474d2;
            c0387m1.f1319b = m12474d2;
        }
        if (m12475c6 != Integer.MIN_VALUE || m12475c7 != Integer.MIN_VALUE) {
            c0387m1.m12566a(m12475c6, m12475c7);
        }
        this.f1050u = m12465m.m12475c(10, Integer.MIN_VALUE);
        this.f1051v = m12465m.m12475c(6, Integer.MIN_VALUE);
        this.f1035f = m12465m.m12473e(4);
        this.f1036g = m12465m.m12467k(3);
        CharSequence m12467k = m12465m.m12467k(21);
        if (!TextUtils.isEmpty(m12467k)) {
            setTitle(m12467k);
        }
        CharSequence m12467k2 = m12465m.m12467k(18);
        if (!TextUtils.isEmpty(m12467k2)) {
            setSubtitle(m12467k2);
        }
        this.f1039j = getContext();
        setPopupTheme(m12465m.m12469i(17, 0));
        Drawable m12473e = m12465m.m12473e(16);
        if (m12473e != null) {
            setNavigationIcon(m12473e);
        }
        CharSequence m12467k3 = m12465m.m12467k(15);
        if (!TextUtils.isEmpty(m12467k3)) {
            setNavigationContentDescription(m12467k3);
        }
        Drawable m12473e2 = m12465m.m12473e(11);
        if (m12473e2 != null) {
            setLogo(m12473e2);
        }
        CharSequence m12467k4 = m12465m.m12467k(12);
        if (!TextUtils.isEmpty(m12467k4)) {
            setLogoDescription(m12467k4);
        }
        if (m12465m.m12466l(29)) {
            setTitleTextColor(m12465m.m12476b(29));
        }
        if (m12465m.m12466l(20)) {
            setSubtitleTextColor(m12465m.m12476b(20));
        }
        if (m12465m.m12466l(14)) {
            mo4478k(m12465m.m12469i(14, 0));
        }
        m12465m.m12464n();
    }

    /* renamed from: g */
    public static C0279g m12759g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0279g ? new C0279g((C0279g) layoutParams) : layoutParams instanceof ActionBar.C0080a ? new C0279g((ActionBar.C0080a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0279g((ViewGroup.MarginLayoutParams) layoutParams) : new C0279g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0186f(getContext());
    }

    /* renamed from: i */
    public static int m12757i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0963l.m11422b(marginLayoutParams) + C0963l.m11421c(marginLayoutParams);
    }

    /* renamed from: j */
    public static int m12756j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m12765a(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.C0815e.m11742d(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0279g c0279g = (C0279g) childAt.getLayoutParams();
                if (c0279g.f1063b == 0 && m12749r(childAt)) {
                    int i3 = c0279g.f148a;
                    WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                    int m11742d = ViewCompat.C0815e.m11742d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, m11742d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = m11742d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            C0279g c0279g2 = (C0279g) childAt2.getLayoutParams();
            if (c0279g2.f1063b == 0 && m12749r(childAt2)) {
                int i5 = c0279g2.f148a;
                WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                int m11742d2 = ViewCompat.C0815e.m11742d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, m11742d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = m11742d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0968m
    @MainThread
    public final void addMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
        C0983p c0983p = this.f1016G;
        c0983p.f2663b.add(interfaceC0895b0);
        c0983p.f2662a.run();
    }

    /* renamed from: b */
    public final void m12764b(View view, boolean z) {
        C0279g c0279g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0279g = new C0279g();
        } else if (!checkLayoutParams(layoutParams)) {
            c0279g = m12759g(layoutParams);
        } else {
            c0279g = (C0279g) layoutParams;
        }
        c0279g.f1063b = 1;
        if (z && this.f1038i != null) {
            view.setLayoutParams(c0279g);
            this.f1014E.add(view);
            return;
        }
        addView(view, c0279g);
    }

    /* renamed from: c */
    public final void m12763c() {
        if (this.f1037h == null) {
            C0398o c0398o = new C0398o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1037h = c0398o;
            c0398o.setImageDrawable(this.f1035f);
            this.f1037h.setContentDescription(this.f1036g);
            C0279g c0279g = new C0279g();
            c0279g.f148a = (this.f1043n & 112) | 8388611;
            c0279g.f1063b = 2;
            this.f1037h.setLayoutParams(c0279g);
            this.f1037h.setOnClickListener(new View$OnClickListenerC0276d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0279g);
    }

    /* renamed from: d */
    public final void m12762d() {
        m12761e();
        ActionMenuView actionMenuView = this.f1030a;
        if (actionMenuView.f847p == null) {
            C0210g c0210g = (C0210g) actionMenuView.getMenu();
            if (this.f1022M == null) {
                this.f1022M = new C0278f();
            }
            this.f1030a.setExpandedActionViewsExclusive(true);
            c0210g.m12849b(this.f1022M, this.f1039j);
            m12748s();
        }
    }

    /* renamed from: e */
    public final void m12761e() {
        if (this.f1030a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1030a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1040k);
            this.f1030a.setOnMenuItemClickListener(this.f1019J);
            ActionMenuView actionMenuView2 = this.f1030a;
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f1023N;
            C0275c c0275c = new C0275c();
            actionMenuView2.f852u = interfaceC0227a;
            actionMenuView2.f853v = c0275c;
            C0279g c0279g = new C0279g();
            c0279g.f148a = (this.f1043n & 112) | 8388613;
            this.f1030a.setLayoutParams(c0279g);
            m12764b(this.f1030a, false);
        }
    }

    /* renamed from: f */
    public final void m12760f() {
        if (this.f1033d == null) {
            this.f1033d = new C0398o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0279g c0279g = new C0279g();
            c0279g.f148a = (this.f1043n & 112) | 8388611;
            this.f1033d.setLayoutParams(c0279g);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0279g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0279g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m12759g(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        C0398o c0398o = this.f1037h;
        if (c0398o != null) {
            return c0398o.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        C0398o c0398o = this.f1037h;
        if (c0398o != null) {
            return c0398o.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0387m1 c0387m1 = this.f1049t;
        if (c0387m1 != null) {
            if (c0387m1.f1324g) {
                return c0387m1.f1318a;
            }
            return c0387m1.f1319b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1051v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0387m1 c0387m1 = this.f1049t;
        if (c0387m1 != null) {
            return c0387m1.f1318a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0387m1 c0387m1 = this.f1049t;
        if (c0387m1 != null) {
            return c0387m1.f1319b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0387m1 c0387m1 = this.f1049t;
        if (c0387m1 != null) {
            if (c0387m1.f1324g) {
                return c0387m1.f1319b;
            }
            return c0387m1.f1318a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1050u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0210g c0210g;
        ActionMenuView actionMenuView = this.f1030a;
        if (actionMenuView != null && (c0210g = actionMenuView.f847p) != null && c0210g.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1051v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1050u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1034e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1034e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m12762d();
        return this.f1030a.getMenu();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.TESTS})
    public View getNavButtonView() {
        return this.f1033d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        C0398o c0398o = this.f1033d;
        if (c0398o != null) {
            return c0398o.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        C0398o c0398o = this.f1033d;
        if (c0398o != null) {
            return c0398o.getDrawable();
        }
        return null;
    }

    public C0309c getOuterActionMenuPresenter() {
        return this.f1021L;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        m12762d();
        return this.f1030a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1039j;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f1040k;
    }

    public CharSequence getSubtitle() {
        return this.f1054y;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f1032c;
    }

    public CharSequence getTitle() {
        return this.f1053x;
    }

    public int getTitleMarginBottom() {
        return this.f1048s;
    }

    public int getTitleMarginEnd() {
        return this.f1046q;
    }

    public int getTitleMarginStart() {
        return this.f1045p;
    }

    public int getTitleMarginTop() {
        return this.f1047r;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.TESTS})
    final TextView getTitleTextView() {
        return this.f1031b;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public InterfaceC0412s0 getWrapper() {
        if (this.f1020K == null) {
            this.f1020K = new C0307b2(this, true);
        }
        return this.f1020K;
    }

    /* renamed from: h */
    public final int m12758h(int i, View view) {
        int i2;
        C0279g c0279g = (C0279g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = c0279g.f148a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1052w & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) c0279g).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) c0279g).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0279g).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: k */
    public void mo4478k(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @MainThread
    /* renamed from: l */
    public final void m12755l() {
        Iterator<MenuItem> it = this.f1017H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0895b0> it2 = this.f1016G.f2663b.iterator();
        while (it2.hasNext()) {
            it2.next().onCreateMenu(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1017H = currentMenuItems2;
    }

    /* renamed from: m */
    public final boolean m12754m(View view) {
        return view.getParent() == this || this.f1014E.contains(view);
    }

    /* renamed from: n */
    public final int m12753n(View view, int i, int i2, int[] iArr) {
        C0279g c0279g = (C0279g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0279g).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m12758h = m12758h(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m12758h, max + measuredWidth, view.getMeasuredHeight() + m12758h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0279g).rightMargin + max;
    }

    /* renamed from: o */
    public final int m12752o(View view, int i, int i2, int[] iArr) {
        C0279g c0279g = (C0279g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0279g).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m12758h = m12758h(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m12758h, max, view.getMeasuredHeight() + m12758h);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0279g).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12748s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1029T);
        m12748s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1012C = false;
        }
        if (!this.f1012C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1012C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1012C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[LOOP:0: B:107:0x0286->B:108:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4 A[LOOP:1: B:110:0x02a2->B:111:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C0210g c0210g;
        MenuItem findItem;
        if (!(parcelable instanceof C0281i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0281i c0281i = (C0281i) parcelable;
        super.onRestoreInstanceState(c0281i.f2747a);
        ActionMenuView actionMenuView = this.f1030a;
        if (actionMenuView != null) {
            c0210g = actionMenuView.f847p;
        } else {
            c0210g = null;
        }
        int i = c0281i.f1064c;
        if (i != 0 && this.f1022M != null && c0210g != null && (findItem = c0210g.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0281i.f1065d) {
            RunnableC0274b runnableC0274b = this.f1029T;
            removeCallbacks(runnableC0274b);
            post(runnableC0274b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.m1 r0 = r2.f1049t
            if (r0 != 0) goto Le
            androidx.appcompat.widget.m1 r0 = new androidx.appcompat.widget.m1
            r0.<init>()
            r2.f1049t = r0
        Le:
            androidx.appcompat.widget.m1 r0 = r2.f1049t
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f1324g
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f1324g = r1
            boolean r3 = r0.f1325h
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f1321d
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f1322e
        L2b:
            r0.f1318a = r1
            int r1 = r0.f1320c
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f1320c
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f1322e
        L39:
            r0.f1318a = r1
            int r1 = r0.f1321d
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f1322e
            r0.f1318a = r3
        L44:
            int r1 = r0.f1323f
        L46:
            r0.f1319b = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C0214i c0214i;
        C0281i c0281i = new C0281i(super.onSaveInstanceState());
        C0278f c0278f = this.f1022M;
        if (c0278f != null && (c0214i = c0278f.f1061b) != null) {
            c0281i.f1064c = c0214i.f715a;
        }
        ActionMenuView actionMenuView = this.f1030a;
        boolean z2 = false;
        if (actionMenuView != null) {
            C0309c c0309c = actionMenuView.f851t;
            if (c0309c != null && c0309c.m12704k()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        c0281i.f1065d = z2;
        return c0281i;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1011B = false;
        }
        if (!this.f1011B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1011B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1011B = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m12751p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: q */
    public final void m12750q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: r */
    public final boolean m12749r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC0968m
    @MainThread
    public final void removeMenuProvider(@NonNull InterfaceC0895b0 interfaceC0895b0) {
        this.f1016G.m11398a(interfaceC0895b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m12748s() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m12745a = C0277e.m12745a(this);
            C0278f c0278f = this.f1022M;
            boolean z2 = false;
            if (c0278f != null && c0278f.f1061b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && m12745a != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0817g.m11730b(this) && this.f1028S) {
                    z2 = true;
                }
            }
            if (z2 && this.f1027R == null) {
                if (this.f1026Q == null) {
                    this.f1026Q = C0277e.m12744b(new RunnableC0038b(this, 1));
                }
                C0277e.m12743c(m12745a, this.f1026Q);
            } else if (!z2 && (onBackInvokedDispatcher = this.f1027R) != null) {
                C0277e.m12742d(onBackInvokedDispatcher, this.f1026Q);
                m12745a = null;
            } else {
                return;
            }
            this.f1027R = m12745a;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1028S != z) {
            this.f1028S = z;
            m12748s();
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m12763c();
        }
        C0398o c0398o = this.f1037h;
        if (c0398o != null) {
            c0398o.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(C0158a.m12920a(getContext(), i));
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m12763c();
            this.f1037h.setImageDrawable(drawable);
            return;
        }
        C0398o c0398o = this.f1037h;
        if (c0398o != null) {
            c0398o.setImageDrawable(this.f1035f);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f1025P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1051v) {
            this.f1051v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1050u) {
            this.f1050u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(C0158a.m12920a(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1034e == null) {
                this.f1034e = new AppCompatImageView(getContext(), null);
            }
            if (!m12754m(this.f1034e)) {
                m12764b(this.f1034e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1034e;
            if (appCompatImageView != null && m12754m(appCompatImageView)) {
                removeView(this.f1034e);
                this.f1014E.remove(this.f1034e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1034e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1034e == null) {
            this.f1034e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1034e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m12760f();
        }
        C0398o c0398o = this.f1033d;
        if (c0398o != null) {
            c0398o.setContentDescription(charSequence);
            C0324d2.m12689a(this.f1033d, charSequence);
        }
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(C0158a.m12920a(getContext(), i));
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m12760f();
            if (!m12754m(this.f1033d)) {
                m12764b(this.f1033d, true);
            }
        } else {
            C0398o c0398o = this.f1033d;
            if (c0398o != null && m12754m(c0398o)) {
                removeView(this.f1033d);
                this.f1014E.remove(this.f1033d);
            }
        }
        C0398o c0398o2 = this.f1033d;
        if (c0398o2 != null) {
            c0398o2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m12760f();
        this.f1033d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0280h interfaceC0280h) {
        this.f1018I = interfaceC0280h;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        m12762d();
        this.f1030a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f1040k != i) {
            this.f1040k = i;
            if (i == 0) {
                this.f1039j = getContext();
            } else {
                this.f1039j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1032c == null) {
                Context context = getContext();
                C0383m0 c0383m0 = new C0383m0(context, null);
                this.f1032c = c0383m0;
                c0383m0.setSingleLine();
                this.f1032c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1042m;
                if (i != 0) {
                    this.f1032c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1010A;
                if (colorStateList != null) {
                    this.f1032c.setTextColor(colorStateList);
                }
            }
            if (!m12754m(this.f1032c)) {
                m12764b(this.f1032c, true);
            }
        } else {
            C0383m0 c0383m02 = this.f1032c;
            if (c0383m02 != null && m12754m(c0383m02)) {
                removeView(this.f1032c);
                this.f1014E.remove(this.f1032c);
            }
        }
        C0383m0 c0383m03 = this.f1032c;
        if (c0383m03 != null) {
            c0383m03.setText(charSequence);
        }
        this.f1054y = charSequence;
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1010A = colorStateList;
        C0383m0 c0383m0 = this.f1032c;
        if (c0383m0 != null) {
            c0383m0.setTextColor(colorStateList);
        }
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1031b == null) {
                Context context = getContext();
                C0383m0 c0383m0 = new C0383m0(context, null);
                this.f1031b = c0383m0;
                c0383m0.setSingleLine();
                this.f1031b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1041l;
                if (i != 0) {
                    this.f1031b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1055z;
                if (colorStateList != null) {
                    this.f1031b.setTextColor(colorStateList);
                }
            }
            if (!m12754m(this.f1031b)) {
                m12764b(this.f1031b, true);
            }
        } else {
            C0383m0 c0383m02 = this.f1031b;
            if (c0383m02 != null && m12754m(c0383m02)) {
                removeView(this.f1031b);
                this.f1014E.remove(this.f1031b);
            }
        }
        C0383m0 c0383m03 = this.f1031b;
        if (c0383m03 != null) {
            c0383m03.setText(charSequence);
        }
        this.f1053x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1048s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1046q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1045p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1047r = i;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1055z = colorStateList;
        C0383m0 c0383m0 = this.f1031b;
        if (c0383m0 != null) {
            c0383m0.setTextColor(colorStateList);
        }
    }
}

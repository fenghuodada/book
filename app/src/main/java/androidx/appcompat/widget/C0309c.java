package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.AbstractC0204b;
import androidx.appcompat.view.menu.AbstractC0222k;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.C0223l;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.appcompat.view.menu.InterfaceC0231p;
import androidx.appcompat.view.menu.SubMenuC0236s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.AbstractC0893b;
import com.ambrose.overwall.R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public final class C0309c extends AbstractC0204b {

    /* renamed from: i */
    public C0313d f1140i;

    /* renamed from: j */
    public Drawable f1141j;

    /* renamed from: k */
    public boolean f1142k;

    /* renamed from: l */
    public boolean f1143l;

    /* renamed from: m */
    public boolean f1144m;

    /* renamed from: n */
    public int f1145n;

    /* renamed from: o */
    public int f1146o;

    /* renamed from: p */
    public int f1147p;

    /* renamed from: q */
    public boolean f1148q;

    /* renamed from: r */
    public final SparseBooleanArray f1149r;

    /* renamed from: s */
    public C0315e f1150s;

    /* renamed from: t */
    public C0310a f1151t;

    /* renamed from: u */
    public RunnableC0312c f1152u;

    /* renamed from: v */
    public C0311b f1153v;

    /* renamed from: w */
    public final C0316f f1154w;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class C0310a extends C0223l {
        public C0310a(Context context, SubMenuC0236s subMenuC0236s, View view) {
            super(context, subMenuC0236s, view, false);
            if (!((subMenuC0236s.f789A.f738x & 32) == 32)) {
                View view2 = C0309c.this.f1140i;
                this.f758f = view2 == null ? (View) C0309c.this.f662h : view2;
            }
            C0316f c0316f = C0309c.this.f1154w;
            this.f761i = c0316f;
            AbstractC0222k abstractC0222k = this.f762j;
            if (abstractC0222k != null) {
                abstractC0222k.mo12825d(c0316f);
            }
        }

        @Override // androidx.appcompat.view.menu.C0223l
        /* renamed from: c */
        public final void mo12699c() {
            C0309c.this.f1151t = null;
            super.mo12699c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    public class C0311b extends ActionMenuItemView.AbstractC0198b {
        public C0311b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0312c implements Runnable {

        /* renamed from: a */
        public final C0315e f1157a;

        public RunnableC0312c(C0315e c0315e) {
            this.f1157a = c0315e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0210g.InterfaceC0211a interfaceC0211a;
            C0309c c0309c = C0309c.this;
            C0210g c0210g = c0309c.f657c;
            if (c0210g != null && (interfaceC0211a = c0210g.f689e) != null) {
                interfaceC0211a.mo12746b(c0210g);
            }
            View view = (View) c0309c.f662h;
            if (view != null && view.getWindowToken() != null) {
                C0315e c0315e = this.f1157a;
                boolean z = true;
                if (!c0315e.m12828b()) {
                    if (c0315e.f758f == null) {
                        z = false;
                    } else {
                        c0315e.m12827d(0, 0, false, false);
                    }
                }
                if (z) {
                    c0309c.f1150s = c0315e;
                }
            }
            c0309c.f1152u = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class C0313d extends AppCompatImageView implements ActionMenuView.InterfaceC0244a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        public class C0314a extends AbstractView$OnTouchListenerC0304b1 {
            public C0314a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
            /* renamed from: b */
            public final InterfaceC0231p mo12457b() {
                C0315e c0315e = C0309c.this.f1150s;
                if (c0315e == null) {
                    return null;
                }
                return c0315e.m12829a();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
            /* renamed from: c */
            public final boolean mo12456c() {
                C0309c.this.m12703l();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
            /* renamed from: d */
            public final boolean mo12700d() {
                C0309c c0309c = C0309c.this;
                if (c0309c.f1152u != null) {
                    return false;
                }
                c0309c.m12706h();
                return true;
            }
        }

        public C0313d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0324d2.m12689a(this, getContentDescription());
            setOnTouchListener(new C0314a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0244a
        /* renamed from: d */
        public final boolean mo12702d() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0244a
        /* renamed from: f */
        public final boolean mo12701f() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0309c.this.m12703l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0700a.C0702b.m11926f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class C0315e extends C0223l {
        public C0315e(Context context, C0210g c0210g, C0313d c0313d) {
            super(context, c0210g, c0313d, true);
            this.f759g = 8388613;
            C0316f c0316f = C0309c.this.f1154w;
            this.f761i = c0316f;
            AbstractC0222k abstractC0222k = this.f762j;
            if (abstractC0222k != null) {
                abstractC0222k.mo12825d(c0316f);
            }
        }

        @Override // androidx.appcompat.view.menu.C0223l
        /* renamed from: c */
        public final void mo12699c() {
            C0309c c0309c = C0309c.this;
            C0210g c0210g = c0309c.f657c;
            if (c0210g != null) {
                c0210g.m12848c(true);
            }
            c0309c.f1150s = null;
            super.mo12699c();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    public class C0316f implements InterfaceC0226m.InterfaceC0227a {
        public C0316f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: b */
        public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
            if (c0210g instanceof SubMenuC0236s) {
                c0210g.mo12811k().m12848c(false);
            }
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = C0309c.this.f659e;
            if (interfaceC0227a != null) {
                interfaceC0227a.mo12698b(c0210g, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: c */
        public final boolean mo12697c(@NonNull C0210g c0210g) {
            C0309c c0309c = C0309c.this;
            if (c0210g == c0309c.f657c) {
                return false;
            }
            ((SubMenuC0236s) c0210g).f789A.getClass();
            c0309c.getClass();
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = c0309c.f659e;
            if (interfaceC0227a == null) {
                return false;
            }
            return interfaceC0227a.mo12697c(c0210g);
        }
    }

    public C0309c(Context context) {
        super(context);
        this.f1149r = new SparseBooleanArray();
        this.f1154w = new C0316f();
    }

    /* renamed from: a */
    public final View m12711a(C0214i c0214i, View view, ViewGroup viewGroup) {
        InterfaceC0228n.InterfaceC0229a interfaceC0229a;
        View actionView = c0214i.getActionView();
        int i = 0;
        if (actionView == null || c0214i.m12833e()) {
            if (view instanceof InterfaceC0228n.InterfaceC0229a) {
                interfaceC0229a = (InterfaceC0228n.InterfaceC0229a) view;
            } else {
                interfaceC0229a = (InterfaceC0228n.InterfaceC0229a) this.f658d.inflate(this.f661g, viewGroup, false);
            }
            interfaceC0229a.mo4533j(c0214i);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0229a;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f662h);
            if (this.f1153v == null) {
                this.f1153v = new C0311b();
            }
            actionMenuItemView.setPopupCallback(this.f1153v);
            actionView = (View) interfaceC0229a;
        }
        if (c0214i.f714C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m12798i(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: b */
    public final void mo12710b(C0210g c0210g, boolean z) {
        m12706h();
        C0310a c0310a = this.f1151t;
        if (c0310a != null && c0310a.m12828b()) {
            c0310a.f762j.dismiss();
        }
        InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f659e;
        if (interfaceC0227a != null) {
            interfaceC0227a.mo12698b(c0210g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: c */
    public final boolean mo12709c() {
        int i;
        ArrayList<C0214i> arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        C0309c c0309c = this;
        C0210g c0210g = c0309c.f657c;
        if (c0210g != null) {
            arrayList = c0210g.m12844l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = c0309c.f1147p;
        int i4 = c0309c.f1146o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0309c.f662h;
        int i5 = 0;
        boolean z9 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0214i c0214i = arrayList.get(i5);
            int i8 = c0214i.f739y;
            if ((i8 & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i7++;
                } else {
                    z9 = true;
                }
            }
            if (c0309c.f1148q && c0214i.f714C) {
                i3 = 0;
            }
            i5++;
        }
        if (c0309c.f1143l && (z9 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c0309c.f1149r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0214i c0214i2 = arrayList.get(i10);
            int i12 = c0214i2.f739y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = c0214i2.f716b;
            if (z2) {
                View m12711a = c0309c.m12711a(c0214i2, null, viewGroup);
                m12711a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m12711a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c0214i2.m12832f(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    boolean z10 = sparseBooleanArray.get(i13);
                    if ((i9 > 0 || z10) && i4 > 0) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View m12711a2 = c0309c.m12711a(c0214i2, null, viewGroup);
                        m12711a2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = m12711a2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 &= z6;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z10) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            C0214i c0214i3 = arrayList.get(i14);
                            if (c0214i3.f716b == i13) {
                                if ((c0214i3.f738x & 32) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                }
                                c0214i3.m12832f(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    c0214i2.m12832f(z4);
                } else {
                    c0214i2.m12832f(false);
                    i10++;
                    i2 = 2;
                    c0309c = this;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            c0309c = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: f */
    public final void mo12708f(@NonNull Context context, @Nullable C0210g c0210g) {
        this.f656b = context;
        LayoutInflater.from(context);
        this.f657c = c0210g;
        Resources resources = context.getResources();
        if (!this.f1144m) {
            this.f1143l = true;
        }
        int i = 2;
        this.f1145n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.f1147p = i;
        int i4 = this.f1145n;
        if (this.f1143l) {
            if (this.f1140i == null) {
                C0313d c0313d = new C0313d(this.f655a);
                this.f1140i = c0313d;
                if (this.f1142k) {
                    c0313d.setImageDrawable(this.f1141j);
                    this.f1141j = null;
                    this.f1142k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1140i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f1140i.getMeasuredWidth();
        } else {
            this.f1140i = null;
        }
        this.f1146o = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: g */
    public final void mo12707g() {
        int i;
        boolean z;
        boolean z2;
        C0214i c0214i;
        ViewGroup viewGroup = (ViewGroup) this.f662h;
        ArrayList<C0214i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C0210g c0210g = this.f657c;
            if (c0210g != null) {
                c0210g.m12845i();
                ArrayList<C0214i> m12844l = this.f657c.m12844l();
                int size = m12844l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0214i c0214i2 = m12844l.get(i2);
                    if ((c0214i2.f738x & 32) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof InterfaceC0228n.InterfaceC0229a) {
                            c0214i = ((InterfaceC0228n.InterfaceC0229a) childAt).getItemData();
                        } else {
                            c0214i = null;
                        }
                        View m12711a = m12711a(c0214i2, childAt, viewGroup);
                        if (c0214i2 != c0214i) {
                            m12711a.setPressed(false);
                            m12711a.jumpDrawablesToCurrentState();
                        }
                        if (m12711a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m12711a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m12711a);
                            }
                            ((ViewGroup) this.f662h).addView(m12711a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1140i) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.f662h).requestLayout();
        C0210g c0210g2 = this.f657c;
        if (c0210g2 != null) {
            c0210g2.m12845i();
            ArrayList<C0214i> arrayList2 = c0210g2.f693i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0893b abstractC0893b = arrayList2.get(i3).f712A;
            }
        }
        C0210g c0210g3 = this.f657c;
        if (c0210g3 != null) {
            c0210g3.m12845i();
            arrayList = c0210g3.f694j;
        }
        if (this.f1143l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f714C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0313d c0313d = this.f1140i;
        if (z3) {
            if (c0313d == null) {
                this.f1140i = new C0313d(this.f655a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1140i.getParent();
            if (viewGroup3 != this.f662h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1140i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f662h;
                C0313d c0313d2 = this.f1140i;
                actionMenuView.getClass();
                ActionMenuView.C0246c c0246c = new ActionMenuView.C0246c();
                ((LinearLayout.LayoutParams) c0246c).gravity = 16;
                c0246c.f858a = true;
                actionMenuView.addView(c0313d2, c0246c);
            }
        } else if (c0313d != null) {
            ViewParent parent = c0313d.getParent();
            InterfaceC0228n interfaceC0228n = this.f662h;
            if (parent == interfaceC0228n) {
                ((ViewGroup) interfaceC0228n).removeView(this.f1140i);
            }
        }
        ((ActionMenuView) this.f662h).setOverflowReserved(this.f1143l);
    }

    /* renamed from: h */
    public final boolean m12706h() {
        InterfaceC0228n interfaceC0228n;
        RunnableC0312c runnableC0312c = this.f1152u;
        if (runnableC0312c != null && (interfaceC0228n = this.f662h) != null) {
            ((View) interfaceC0228n).removeCallbacks(runnableC0312c);
            this.f1152u = null;
            return true;
        }
        C0315e c0315e = this.f1150s;
        if (c0315e != null) {
            if (c0315e.m12828b()) {
                c0315e.f762j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo12705i(androidx.appcompat.view.menu.SubMenuC0236s r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.g r2 = r0.f790z
            androidx.appcompat.view.menu.g r3 = r8.f657c
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.s r0 = (androidx.appcompat.view.menu.SubMenuC0236s) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.n r2 = r8.f662h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
            if (r6 == 0) goto L35
            r6 = r5
            androidx.appcompat.view.menu.n$a r6 = (androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a) r6
            androidx.appcompat.view.menu.i r6 = r6.getItemData()
            androidx.appcompat.view.menu.i r7 = r0.f789A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            androidx.appcompat.view.menu.i r0 = r9.f789A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = r1
        L5f:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f656b
            r2.<init>(r4, r9, r5)
            r8.f1151t = r2
            r2.f760h = r0
            androidx.appcompat.view.menu.k r2 = r2.f762j
            if (r2 == 0) goto L71
            r2.mo12822n(r0)
        L71:
            androidx.appcompat.widget.c$a r0 = r8.f1151t
            boolean r2 = r0.m12828b()
            if (r2 == 0) goto L7b
        L79:
            r1 = r3
            goto L84
        L7b:
            android.view.View r2 = r0.f758f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.m12827d(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            androidx.appcompat.view.menu.m$a r0 = r8.f659e
            if (r0 == 0) goto L8d
            r0.mo12697c(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0309c.mo12705i(androidx.appcompat.view.menu.s):boolean");
    }

    /* renamed from: k */
    public final boolean m12704k() {
        C0315e c0315e = this.f1150s;
        return c0315e != null && c0315e.m12828b();
    }

    /* renamed from: l */
    public final boolean m12703l() {
        C0210g c0210g;
        if (this.f1143l && !m12704k() && (c0210g = this.f657c) != null && this.f662h != null && this.f1152u == null) {
            c0210g.m12845i();
            if (!c0210g.f694j.isEmpty()) {
                RunnableC0312c runnableC0312c = new RunnableC0312c(new C0315e(this.f656b, this.f657c, this.f1140i));
                this.f1152u = runnableC0312c;
                ((View) this.f662h).post(runnableC0312c);
                return true;
            }
            return false;
        }
        return false;
    }
}

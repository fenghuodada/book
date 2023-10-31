package com.qmuiteam.qmui.arch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.C0547l;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C8997a;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9150j;
import com.qmuiteam.qmui.util.C9152l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.arch.l */
/* loaded from: classes3.dex */
public final class C9037l extends FrameLayout {

    /* renamed from: A */
    public static final C9043f f17261A = new C9043f();

    /* renamed from: a */
    public float f17262a;

    /* renamed from: b */
    public View f17263b;

    /* renamed from: c */
    public ArrayList f17264c;

    /* renamed from: d */
    public InterfaceC9039b f17265d;

    /* renamed from: e */
    public InterfaceC9040c f17266e;

    /* renamed from: f */
    public Drawable f17267f;

    /* renamed from: g */
    public Drawable f17268g;

    /* renamed from: h */
    public Drawable f17269h;

    /* renamed from: i */
    public Drawable f17270i;

    /* renamed from: j */
    public float f17271j;

    /* renamed from: k */
    public int f17272k;

    /* renamed from: l */
    public VelocityTracker f17273l;

    /* renamed from: m */
    public final float f17274m;

    /* renamed from: n */
    public final float f17275n;

    /* renamed from: o */
    public final OverScroller f17276o;

    /* renamed from: p */
    public final int f17277p;

    /* renamed from: q */
    public float f17278q;

    /* renamed from: r */
    public float f17279r;

    /* renamed from: s */
    public float f17280s;

    /* renamed from: t */
    public int f17281t;

    /* renamed from: u */
    public C9150j f17282u;

    /* renamed from: v */
    public InterfaceC9042e f17283v;

    /* renamed from: w */
    public int f17284w;

    /* renamed from: x */
    public boolean f17285x;

    /* renamed from: y */
    public boolean f17286y;

    /* renamed from: z */
    public final RunnableC9038a f17287z;

    /* renamed from: com.qmuiteam.qmui.arch.l$a */
    /* loaded from: classes3.dex */
    public class RunnableC9038a implements Runnable {
        public RunnableC9038a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9037l.this.setDragState(0);
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.l$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9039b {
    }

    /* renamed from: com.qmuiteam.qmui.arch.l$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9040c {
    }

    /* renamed from: com.qmuiteam.qmui.arch.l$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9041d {
        /* renamed from: a */
        void mo2776a(int i, float f, int i2);

        /* renamed from: b */
        void mo2775b();

        /* renamed from: c */
        void mo2774c(float f, int i);

        /* renamed from: d */
        void mo2773d(int i, int i2);
    }

    /* renamed from: com.qmuiteam.qmui.arch.l$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC9042e {
        /* renamed from: a */
        float mo2772a(@NonNull C9037l c9037l, @NonNull View view, int i);

        /* renamed from: b */
        void mo2771b(@NonNull C9037l c9037l, @NonNull C9150j c9150j, int i, float f);

        /* renamed from: c */
        int mo2770c(int i);

        /* renamed from: d */
        int mo2769d(@NonNull C9037l c9037l, @NonNull View view, float f, int i, float f2);

        /* renamed from: e */
        int mo2768e(@NonNull C9037l c9037l, int i);
    }

    /* renamed from: com.qmuiteam.qmui.arch.l$f */
    /* loaded from: classes3.dex */
    public static class C9043f implements InterfaceC9042e {
        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9042e
        /* renamed from: a */
        public final float mo2772a(@NonNull C9037l c9037l, @NonNull View view, int i) {
            float top;
            int height;
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            if (z) {
                top = view.getLeft() * 1.0f;
                height = c9037l.getWidth();
            } else {
                top = view.getTop() * 1.0f;
                height = c9037l.getHeight();
            }
            return C9143d.m2644a(Math.abs(top / height));
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9042e
        /* renamed from: b */
        public final void mo2771b(@NonNull C9037l c9037l, @NonNull C9150j c9150j, int i, float f) {
            int m2643b;
            int m2643b2;
            if (i == 1) {
                m2643b2 = C9143d.m2643b((int) (c9150j.f17590e + f), 0, c9037l.getWidth());
            } else if (i == 2) {
                m2643b2 = C9143d.m2643b((int) (c9150j.f17590e + f), -c9037l.getWidth(), 0);
            } else {
                if (i == 3) {
                    m2643b = C9143d.m2643b((int) (c9150j.f17589d + f), 0, c9037l.getHeight());
                } else {
                    m2643b = C9143d.m2643b((int) (c9150j.f17589d + f), -c9037l.getHeight(), 0);
                }
                c9150j.m2623d(m2643b);
                return;
            }
            c9150j.m2624c(m2643b2);
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9042e
        /* renamed from: c */
        public final int mo2770c(int i) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return i == 3 ? 4 : 8;
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9042e
        /* renamed from: d */
        public final int mo2769d(@NonNull C9037l c9037l, @NonNull View view, float f, int i, float f2) {
            int height;
            if (i == 1) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && mo2772a(c9037l, view, i) > f2)) {
                    return c9037l.getWidth();
                }
                return 0;
            }
            if (i == 2) {
                if (f >= 0.0f && (f != 0.0f || mo2772a(c9037l, view, i) <= f2)) {
                    return 0;
                }
                height = c9037l.getWidth();
            } else if (i == 3) {
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i3 > 0 || (i3 == 0 && mo2772a(c9037l, view, i) > f2)) {
                    return c9037l.getHeight();
                }
                return 0;
            } else if (f >= 0.0f && (f != 0.0f || mo2772a(c9037l, view, i) <= f2)) {
                return 0;
            } else {
                height = c9037l.getHeight();
            }
            return -height;
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9042e
        /* renamed from: e */
        public final int mo2768e(@NonNull C9037l c9037l, int i) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            return z ? c9037l.getWidth() : c9037l.getHeight();
        }
    }

    public C9037l(Context context) {
        super(context, null);
        this.f17262a = 0.3f;
        this.f17272k = -1728053248;
        this.f17281t = 0;
        this.f17283v = f17261A;
        this.f17284w = 0;
        this.f17285x = true;
        this.f17286y = true;
        this.f17287z = new RunnableC9038a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0547l.f1858b, R.attr.SwipeBackLayoutStyle, R.style.SwipeBackLayout);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.drawable.shadow_left);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, R.drawable.shadow_right);
        int resourceId3 = obtainStyledAttributes.getResourceId(0, R.drawable.shadow_bottom);
        int resourceId4 = obtainStyledAttributes.getResourceId(3, R.drawable.shadow_top);
        m2780f(resourceId, 1);
        m2780f(resourceId2, 2);
        m2780f(resourceId3, 8);
        m2780f(resourceId4, 4);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17277p = viewConfiguration.getScaledTouchSlop();
        this.f17274m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17275n = getResources().getDisplayMetrics().density * 400.0f;
        this.f17276o = new OverScroller(context, C8997a.f17184c);
        C9152l.m2621a(this, new C9036k(this), false);
    }

    /* renamed from: h */
    public static void m2778h(View view, int i, int i2) {
        float f;
        float f2;
        if (i != 8) {
            if (i == 2) {
                view.setTranslationY(0.0f);
                f2 = i2;
            } else if (i == 1) {
                view.setTranslationY(0.0f);
                f2 = -i2;
            } else {
                f = -i2;
            }
            view.setTranslationX(f2);
            return;
        }
        f = i2;
        view.setTranslationY(f);
        view.setTranslationX(0.0f);
    }

    /* renamed from: i */
    public static C9037l m2777i(View view, C9017c c9017c) {
        C9043f c9043f = f17261A;
        C9037l c9037l = new C9037l(view.getContext());
        c9037l.addView(view, new FrameLayout.LayoutParams(-1, -1));
        c9037l.setContentView(view);
        c9037l.setViewMoveAction(c9043f);
        c9037l.setCallback(c9017c);
        return c9037l;
    }

    private void setContentView(View view) {
        this.f17263b = view;
        this.f17282u = new C9150j(view);
    }

    /* renamed from: a */
    public final void m2785a() {
        VelocityTracker velocityTracker = this.f17273l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17273l = null;
        }
    }

    /* renamed from: b */
    public final int m2784b(int i, int i2, int i3) {
        int width;
        int i4;
        if (i == 0) {
            return 0;
        }
        float width2 = getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
        } else if (i3 != 0) {
            i4 = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        } else {
            i4 = 256;
        }
        return Math.min(i4, 600);
    }

    /* renamed from: c */
    public final boolean m2783c(float f, float f2) {
        return f >= ((float) this.f17263b.getLeft()) && f < ((float) this.f17263b.getRight()) && f2 >= ((float) this.f17263b.getTop()) && f2 < ((float) this.f17263b.getBottom());
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean z = false;
        if (this.f17281t == 2) {
            OverScroller overScroller = this.f17276o;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            C9150j c9150j = this.f17282u;
            int i = currX - c9150j.f17588c;
            int i2 = currY - c9150j.f17587b;
            if (c9150j.f17590e != i || c9150j.f17589d != i2) {
                c9150j.f17590e = i;
                c9150j.f17589d = i2;
                c9150j.m2626a();
            }
            m2782d();
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                post(this.f17287z);
            }
        }
        if (this.f17281t == 2) {
            z = true;
        }
        if (z) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    /* renamed from: d */
    public final void m2782d() {
        float mo2772a = this.f17283v.mo2772a(this, this.f17263b, this.f17284w);
        this.f17271j = 1.0f - this.f17283v.mo2772a(this, this.f17263b, this.f17284w);
        float f = this.f17262a;
        if (mo2772a < f && !this.f17285x) {
            this.f17285x = true;
        }
        if (this.f17281t == 1 && this.f17285x && mo2772a >= f) {
            this.f17285x = false;
            ArrayList arrayList = this.f17264c;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = this.f17264c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9041d) it.next()).mo2775b();
                }
            }
        }
        ArrayList arrayList2 = this.f17264c;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = this.f17264c.iterator();
            while (it2.hasNext()) {
                int i = this.f17284w;
                ((InterfaceC9041d) it2.next()).mo2776a(i, mo2772a, this.f17283v.mo2770c(i));
            }
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean drawChild(android.graphics.Canvas r8, android.view.View r9, long r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9037l.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r7.m2786a() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2781e(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9037l.m2781e(float, float):void");
    }

    /* renamed from: f */
    public final void m2780f(int i, int i2) {
        Drawable drawable = getResources().getDrawable(i);
        if ((i2 & 1) != 0) {
            this.f17267f = drawable;
        } else if ((i2 & 2) != 0) {
            this.f17268g = drawable;
        } else if ((i2 & 8) != 0) {
            this.f17269h = drawable;
        } else if ((i2 & 4) != 0) {
            this.f17270i = drawable;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2779g(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f17263b
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f17263b
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            android.widget.OverScroller r1 = r9.f17276o
            r10 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r9.setDragState(r10)
            return
        L1e:
            float r11 = r9.f17275n
            int r11 = (int) r11
            float r0 = r9.f17274m
            int r0 = (int) r0
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r11) goto L2c
            r12 = r10
            goto L33
        L2c:
            if (r6 <= r0) goto L33
            if (r12 <= 0) goto L32
            r12 = r0
            goto L33
        L32:
            int r12 = -r0
        L33:
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r11) goto L3a
            goto L41
        L3a:
            if (r6 <= r0) goto L42
            if (r13 <= 0) goto L40
            r13 = r0
            goto L42
        L40:
            int r10 = -r0
        L41:
            r13 = r10
        L42:
            int r10 = java.lang.Math.abs(r4)
            int r11 = java.lang.Math.abs(r5)
            int r0 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r0 + r6
            int r8 = r10 + r11
            if (r12 == 0) goto L5b
            float r10 = (float) r0
            float r0 = (float) r7
            goto L5d
        L5b:
            float r10 = (float) r10
            float r0 = (float) r8
        L5d:
            float r10 = r10 / r0
            if (r13 == 0) goto L63
            float r11 = (float) r6
            float r0 = (float) r7
            goto L65
        L63:
            float r11 = (float) r11
            float r0 = (float) r8
        L65:
            float r11 = r11 / r0
            com.qmuiteam.qmui.arch.l$e r0 = r9.f17283v
            int r6 = r9.f17284w
            int r0 = r0.mo2768e(r9, r6)
            int r12 = r9.m2784b(r4, r12, r0)
            int r13 = r9.m2784b(r5, r13, r0)
            float r12 = (float) r12
            float r12 = r12 * r10
            float r10 = (float) r13
            float r10 = r10 * r11
            float r10 = r10 + r12
            int r6 = (int) r10
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.setDragState(r10)
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9037l.m2779g(int, int, int, int):void");
    }

    public View getContentView() {
        return this.f17263b;
    }

    public float getXFraction() {
        int width = getWidth();
        if (width == 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                width = ((ViewGroup) parent).getWidth();
            }
        }
        if (width == 0) {
            return 0.0f;
        }
        return getX() / width;
    }

    public float getYFraction() {
        int height = getHeight();
        if (height == 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                height = ((ViewGroup) parent).getHeight();
            }
        }
        if (height == 0) {
            return 0.0f;
        }
        return getY() / height;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f17286y
            r1 = 0
            if (r0 != 0) goto L9
            r7.m2785a()
            return r1
        L9:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L12
            r7.m2785a()
        L12:
            android.view.VelocityTracker r2 = r7.f17273l
            if (r2 != 0) goto L1c
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r7.f17273l = r2
        L1c:
            android.view.VelocityTracker r2 = r7.f17273l
            r2.addMovement(r8)
            float r2 = r8.getX()
            float r8 = r8.getY()
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L75
            if (r0 == r4) goto L71
            if (r0 == r3) goto L35
            r8 = 3
            if (r0 == r8) goto L71
            goto L91
        L35:
            int r0 = r7.f17281t
            if (r0 != 0) goto L3d
            r7.m2781e(r2, r8)
            goto L6c
        L3d:
            if (r0 != r4) goto L5a
            com.qmuiteam.qmui.arch.l$e r0 = r7.f17283v
            com.qmuiteam.qmui.util.j r5 = r7.f17282u
            int r6 = r7.f17284w
            if (r6 == r4) goto L4f
            if (r6 != r3) goto L4a
            goto L4f
        L4a:
            float r3 = r7.f17280s
            float r3 = r8 - r3
            goto L53
        L4f:
            float r3 = r7.f17279r
            float r3 = r2 - r3
        L53:
            r0.mo2771b(r7, r5, r6, r3)
            r7.m2782d()
            goto L6c
        L5a:
            boolean r0 = r7.m2783c(r2, r8)
            if (r0 == 0) goto L6c
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L69
            r0.requestDisallowInterceptTouchEvent(r4)
        L69:
            r7.setDragState(r4)
        L6c:
            r7.f17279r = r2
            r7.f17280s = r8
            goto L91
        L71:
            r7.m2785a()
            goto L91
        L75:
            r7.f17279r = r2
            r7.f17278q = r2
            r7.f17280s = r8
            int r0 = r7.f17281t
            if (r0 != r3) goto L91
            boolean r8 = r7.m2783c(r2, r8)
            if (r8 == 0) goto L91
            android.view.ViewParent r8 = r7.getParent()
            if (r8 == 0) goto L8e
            r8.requestDisallowInterceptTouchEvent(r4)
        L8e:
            r7.setDragState(r4)
        L91:
            int r8 = r7.f17281t
            if (r8 != r4) goto L96
            r1 = r4
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9037l.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C9150j c9150j = this.f17282u;
        if (c9150j != null) {
            c9150j.m2625b(true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float xVelocity;
        float f;
        if (!this.f17286y) {
            m2785a();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2785a();
        }
        if (this.f17273l == null) {
            this.f17273l = VelocityTracker.obtain();
        }
        this.f17273l.addMovement(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.f17281t == 1) {
                            m2779g(0, 0, (int) this.f17273l.getXVelocity(), (int) this.f17273l.getYVelocity());
                        }
                    }
                } else {
                    int i = this.f17281t;
                    if (i == 0) {
                        m2781e(x, y);
                    } else if (i == 1) {
                        InterfaceC9042e interfaceC9042e = this.f17283v;
                        C9150j c9150j = this.f17282u;
                        int i2 = this.f17284w;
                        if (i2 != 1 && i2 != 2) {
                            f = y - this.f17280s;
                        } else {
                            f = x - this.f17279r;
                        }
                        interfaceC9042e.mo2771b(this, c9150j, i2, f);
                        m2782d();
                    } else if (m2783c(x, y)) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        setDragState(1);
                    }
                    this.f17279r = x;
                    this.f17280s = y;
                }
            } else if (this.f17281t == 1) {
                VelocityTracker velocityTracker = this.f17273l;
                float f2 = this.f17274m;
                velocityTracker.computeCurrentVelocity(1000, f2);
                int mo2770c = this.f17283v.mo2770c(this.f17284w);
                int i3 = this.f17284w;
                if (i3 != 1 && i3 != 2) {
                    xVelocity = this.f17273l.getYVelocity();
                } else {
                    xVelocity = this.f17273l.getXVelocity();
                }
                float abs = Math.abs(xVelocity);
                if (abs < this.f17275n) {
                    xVelocity = 0.0f;
                } else if (abs > f2) {
                    if (xVelocity <= 0.0f) {
                        f2 = -f2;
                    }
                    xVelocity = f2;
                }
                if (mo2770c != 1 && mo2770c != 2) {
                    m2779g(0, this.f17283v.mo2769d(this, this.f17263b, xVelocity, this.f17284w, this.f17262a), 0, (int) xVelocity);
                } else {
                    m2779g(this.f17283v.mo2769d(this, this.f17263b, xVelocity, this.f17284w, this.f17262a), 0, (int) xVelocity, 0);
                }
            }
            m2785a();
        } else {
            this.f17279r = x;
            this.f17278q = x;
            this.f17280s = y;
            if (this.f17281t == 2 && m2783c(x, y)) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                setDragState(1);
            }
        }
        return true;
    }

    public void setCallback(InterfaceC9039b interfaceC9039b) {
        this.f17265d = interfaceC9039b;
    }

    public void setDragState(int i) {
        removeCallbacks(this.f17287z);
        if (this.f17281t != i) {
            this.f17281t = i;
            ArrayList arrayList = this.f17264c;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = this.f17264c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9041d) it.next()).mo2774c(this.f17283v.mo2772a(this, this.f17263b, this.f17284w), i);
                }
            }
        }
    }

    public void setEnableSwipeBack(boolean z) {
        this.f17286y = z;
    }

    public void setOnInsetsHandler(InterfaceC9040c interfaceC9040c) {
        this.f17266e = interfaceC9040c;
    }

    public void setScrimColor(int i) {
        this.f17272k = i;
        invalidate();
    }

    public void setScrollThresHold(float f) {
        if (f >= 1.0f || f <= 0.0f) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f17262a = f;
    }

    public void setViewMoveAction(@NonNull InterfaceC9042e interfaceC9042e) {
        this.f17283v = interfaceC9042e;
    }

    public void setXFraction(float f) {
        int width = getWidth();
        if (width == 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                width = ((ViewGroup) parent).getWidth();
            }
        }
        setX(width > 0 ? f * width : 0.0f);
    }

    public void setYFraction(float f) {
        int height = getHeight();
        if (height == 0) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                height = ((ViewGroup) parent).getHeight();
            }
        }
        setY(height > 0 ? f * height : 0.0f);
    }
}

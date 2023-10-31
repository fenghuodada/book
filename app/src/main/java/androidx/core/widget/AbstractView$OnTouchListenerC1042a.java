package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC1042a implements View.OnTouchListener {

    /* renamed from: q */
    public static final int f2705q = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C1043a f2706a;

    /* renamed from: b */
    public final AccelerateInterpolator f2707b;

    /* renamed from: c */
    public final View f2708c;

    /* renamed from: d */
    public RunnableC1044b f2709d;

    /* renamed from: e */
    public final float[] f2710e;

    /* renamed from: f */
    public final float[] f2711f;

    /* renamed from: g */
    public int f2712g;

    /* renamed from: h */
    public int f2713h;

    /* renamed from: i */
    public final float[] f2714i;

    /* renamed from: j */
    public final float[] f2715j;

    /* renamed from: k */
    public final float[] f2716k;

    /* renamed from: l */
    public boolean f2717l;

    /* renamed from: m */
    public boolean f2718m;

    /* renamed from: n */
    public boolean f2719n;

    /* renamed from: o */
    public boolean f2720o;

    /* renamed from: p */
    public boolean f2721p;

    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C1043a {

        /* renamed from: a */
        public int f2722a;

        /* renamed from: b */
        public int f2723b;

        /* renamed from: c */
        public float f2724c;

        /* renamed from: d */
        public float f2725d;

        /* renamed from: h */
        public float f2729h;

        /* renamed from: i */
        public int f2730i;

        /* renamed from: e */
        public long f2726e = Long.MIN_VALUE;

        /* renamed from: g */
        public long f2728g = -1;

        /* renamed from: f */
        public long f2727f = 0;

        /* renamed from: a */
        public final float m11269a(long j) {
            long j2 = this.f2726e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2728g;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC1042a.m11273b(((float) (j - j2)) / this.f2722a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2729h;
            return (AbstractView$OnTouchListenerC1042a.m11273b(((float) (j - j3)) / this.f2730i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC1044b implements Runnable {
        public RunnableC1044b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            AbstractView$OnTouchListenerC1042a abstractView$OnTouchListenerC1042a = AbstractView$OnTouchListenerC1042a.this;
            if (!abstractView$OnTouchListenerC1042a.f2720o) {
                return;
            }
            boolean z2 = abstractView$OnTouchListenerC1042a.f2718m;
            C1043a c1043a = abstractView$OnTouchListenerC1042a.f2706a;
            if (z2) {
                abstractView$OnTouchListenerC1042a.f2718m = false;
                c1043a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c1043a.f2726e = currentAnimationTimeMillis;
                c1043a.f2728g = -1L;
                c1043a.f2727f = currentAnimationTimeMillis;
                c1043a.f2729h = 0.5f;
            }
            if (c1043a.f2728g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1043a.f2728g + c1043a.f2730i) {
                z = true;
            } else {
                z = false;
            }
            if (!z && abstractView$OnTouchListenerC1042a.m11270e()) {
                boolean z3 = abstractView$OnTouchListenerC1042a.f2719n;
                View view = abstractView$OnTouchListenerC1042a.f2708c;
                if (z3) {
                    abstractView$OnTouchListenerC1042a.f2719n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c1043a.f2727f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float m11269a = c1043a.m11269a(currentAnimationTimeMillis2);
                    c1043a.f2727f = currentAnimationTimeMillis2;
                    C1054i.m11250b(((C1053h) abstractView$OnTouchListenerC1042a).f2732r, (int) (((float) (currentAnimationTimeMillis2 - c1043a.f2727f)) * ((m11269a * 4.0f) + ((-4.0f) * m11269a * m11269a)) * c1043a.f2725d));
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11752m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            abstractView$OnTouchListenerC1042a.f2720o = false;
        }
    }

    public AbstractView$OnTouchListenerC1042a(@NonNull View view) {
        C1043a c1043a = new C1043a();
        this.f2706a = c1043a;
        this.f2707b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2710e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2711f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2714i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2715j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2716k = fArr5;
        this.f2708c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f2712g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2713h = f2705q;
        c1043a.f2722a = 500;
        c1043a.f2723b = 500;
    }

    /* renamed from: b */
    public static float m11273b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m11274a(float r4, int r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2710e
            r0 = r0[r5]
            float[] r1 = r3.f2711f
            r1 = r1[r5]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m11273b(r0, r2, r1)
            float r1 = r3.m11272c(r4, r0)
            float r6 = r6 - r4
            float r4 = r3.m11272c(r6, r0)
            float r4 = r4 - r1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f2707b
            if (r6 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m11273b(r4, r6, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f2714i
            r0 = r0[r5]
            float[] r1 = r3.f2715j
            r1 = r1[r5]
            float[] r2 = r3.f2716k
            r5 = r2[r5]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = m11273b(r4, r1, r5)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m11273b(r4, r1, r5)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1042a.m11274a(float, int, float, float):float");
    }

    /* renamed from: c */
    public final float m11272c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2712g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2720o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m11271d() {
        int i = 0;
        if (this.f2718m) {
            this.f2720o = false;
            return;
        }
        C1043a c1043a = this.f2706a;
        c1043a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c1043a.f2726e);
        int i3 = c1043a.f2723b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1043a.f2730i = i;
        c1043a.f2729h = c1043a.m11269a(currentAnimationTimeMillis);
        c1043a.f2728g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11270e() {
        /*
            r9 = this;
            androidx.core.widget.a$a r0 = r9.f2706a
            float r1 = r0.f2725d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f2724c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            androidx.core.widget.h r3 = (androidx.core.widget.C1053h) r3
            android.widget.ListView r3 = r3.f2732r
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1042a.m11270e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f2721p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.m11271d()
            goto L7b
        L1a:
            r7.f2719n = r2
            r7.f2717l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f2708c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m11274a(r0, r1, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m11274a(r9, r2, r8, r3)
            androidx.core.widget.a$a r9 = r7.f2706a
            r9.f2724c = r0
            r9.f2725d = r8
            boolean r8 = r7.f2720o
            if (r8 != 0) goto L7b
            boolean r8 = r7.m11270e()
            if (r8 == 0) goto L7b
            androidx.core.widget.a$b r8 = r7.f2709d
            if (r8 != 0) goto L5f
            androidx.core.widget.a$b r8 = new androidx.core.widget.a$b
            r8.<init>()
            r7.f2709d = r8
        L5f:
            r7.f2720o = r2
            r7.f2718m = r2
            boolean r8 = r7.f2717l
            if (r8 != 0) goto L74
            int r8 = r7.f2713h
            if (r8 <= 0) goto L74
            androidx.core.widget.a$b r9 = r7.f2709d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r8 = androidx.core.view.ViewCompat.f2518a
            androidx.core.view.ViewCompat.C0814d.m11751n(r4, r9, r5)
            goto L79
        L74:
            androidx.core.widget.a$b r8 = r7.f2709d
            r8.run()
        L79:
            r7.f2717l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC1042a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

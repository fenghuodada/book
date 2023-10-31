package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: androidx.customview.widget.c */
/* loaded from: classes.dex */
public final class C1078c {

    /* renamed from: v */
    public static final animationInterpolatorC1079a f2766v = new animationInterpolatorC1079a();

    /* renamed from: a */
    public int f2767a;

    /* renamed from: b */
    public int f2768b;

    /* renamed from: d */
    public float[] f2770d;

    /* renamed from: e */
    public float[] f2771e;

    /* renamed from: f */
    public float[] f2772f;

    /* renamed from: g */
    public float[] f2773g;

    /* renamed from: h */
    public int[] f2774h;

    /* renamed from: i */
    public int[] f2775i;

    /* renamed from: j */
    public int[] f2776j;

    /* renamed from: k */
    public int f2777k;

    /* renamed from: l */
    public VelocityTracker f2778l;

    /* renamed from: m */
    public final float f2779m;

    /* renamed from: n */
    public final float f2780n;

    /* renamed from: o */
    public final int f2781o;

    /* renamed from: p */
    public final OverScroller f2782p;

    /* renamed from: q */
    public final AbstractC1081c f2783q;

    /* renamed from: r */
    public View f2784r;

    /* renamed from: s */
    public boolean f2785s;

    /* renamed from: t */
    public final ViewGroup f2786t;

    /* renamed from: c */
    public int f2769c = -1;

    /* renamed from: u */
    public final RunnableC1080b f2787u = new RunnableC1080b();

    /* renamed from: androidx.customview.widget.c$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC1079a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.c$b */
    /* loaded from: classes.dex */
    public class RunnableC1080b implements Runnable {
        public RunnableC1080b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1078c.this.m11208p(0);
        }
    }

    /* renamed from: androidx.customview.widget.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1081c {
        /* renamed from: a */
        public abstract int mo4436a(@NonNull View view, int i);

        /* renamed from: b */
        public abstract int mo4435b(@NonNull View view, int i);

        /* renamed from: c */
        public int mo4434c(@NonNull View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo4736d() {
            return 0;
        }

        /* renamed from: e */
        public void mo4768e(int i, @NonNull View view) {
        }

        /* renamed from: f */
        public abstract void mo4433f(int i);

        /* renamed from: g */
        public abstract void mo4432g(@NonNull View view, int i, int i2);

        /* renamed from: h */
        public abstract void mo4431h(@NonNull View view, float f, float f2);

        /* renamed from: i */
        public abstract boolean mo4430i(int i, @NonNull View view);
    }

    public C1078c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC1081c abstractC1081c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC1081c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2786t = viewGroup;
        this.f2783q = abstractC1081c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2781o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2768b = viewConfiguration.getScaledTouchSlop();
        this.f2779m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2780n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2782p = new OverScroller(context, f2766v);
    }

    /* renamed from: a */
    public final void m11223a() {
        this.f2769c = -1;
        float[] fArr = this.f2770d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2771e, 0.0f);
            Arrays.fill(this.f2772f, 0.0f);
            Arrays.fill(this.f2773g, 0.0f);
            Arrays.fill(this.f2774h, 0);
            Arrays.fill(this.f2775i, 0);
            Arrays.fill(this.f2776j, 0);
            this.f2777k = 0;
        }
        VelocityTracker velocityTracker = this.f2778l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2778l = null;
        }
    }

    /* renamed from: b */
    public final void m11222b(int i, @NonNull View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f2786t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f2784r = view;
        this.f2769c = i;
        this.f2783q.mo4768e(i, view);
        m11208p(1);
    }

    /* renamed from: c */
    public final boolean m11221c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f2774h[i] & i2) != i2 || (0 & i2) == 0 || (this.f2776j[i] & i2) == i2 || (this.f2775i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f2768b;
        if (abs > i3 || abs2 > i3) {
            if (abs < abs2 * 0.5f) {
                this.f2783q.getClass();
            }
            return (this.f2775i[i] & i2) == 0 && abs > ((float) this.f2768b);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m11220d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC1081c abstractC1081c = this.f2783q;
        boolean z = abstractC1081c.mo4434c(view) > 0;
        boolean z2 = abstractC1081c.mo4736d() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f2768b) : z2 && Math.abs(f2) > ((float) this.f2768b);
        }
        float f3 = f2 * f2;
        int i = this.f2768b;
        return f3 + (f * f) > ((float) (i * i));
    }

    /* renamed from: e */
    public final void m11219e(int i) {
        float[] fArr = this.f2770d;
        if (fArr != null) {
            int i2 = this.f2777k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f2771e[i] = 0.0f;
                this.f2772f[i] = 0.0f;
                this.f2773g[i] = 0.0f;
                this.f2774h[i] = 0;
                this.f2775i[i] = 0;
                this.f2776j[i] = 0;
                this.f2777k = (~i3) & i2;
            }
        }
    }

    /* renamed from: f */
    public final int m11218f(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.f2786t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: g */
    public final boolean m11217g() {
        if (this.f2767a == 2) {
            OverScroller overScroller = this.f2782p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2784r.getLeft();
            int top = currY - this.f2784r.getTop();
            if (left != 0) {
                View view = this.f2784r;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2784r;
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2783q.mo4432g(this.f2784r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2786t.post(this.f2787u);
            }
        }
        if (this.f2767a != 2) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: h */
    public final View m11216h(int i, int i2) {
        ViewGroup viewGroup = this.f2786t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2783q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11215i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f2784r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f2784r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f2782p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.m11208p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f2784r
            float r0 = r10.f2780n
            int r0 = (int) r0
            float r6 = r10.f2779m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            androidx.customview.widget.c$c r6 = r10.f2783q
            int r12 = r6.mo4434c(r12)
            int r12 = r10.m11218f(r4, r13, r12)
            int r13 = r6.mo4736d()
            int r13 = r10.m11218f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.m11208p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C1078c.m11215i(int, int, int, int):boolean");
    }

    /* renamed from: j */
    public final boolean m11214j(int i) {
        boolean z;
        if ((this.f2777k & (1 << i)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: k */
    public final void m11213k(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m11223a();
        }
        if (this.f2778l == null) {
            this.f2778l = VelocityTracker.obtain();
        }
        this.f2778l.addMovement(motionEvent);
        int i2 = 0;
        AbstractC1081c abstractC1081c = this.f2783q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f2767a == 1 && pointerId == this.f2769c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f2769c) {
                                                View m11216h = m11216h((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f2784r;
                                                if (m11216h == view && m11205s(pointerId2, view)) {
                                                    i = this.f2769c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        m11212l();
                                    }
                                }
                                m11219e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m11210n(x, y, pointerId3);
                        if (this.f2767a == 0) {
                            m11205s(pointerId3, m11216h((int) x, (int) y));
                            if ((this.f2774h[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i3 = (int) x;
                            int i4 = (int) y;
                            View view2 = this.f2784r;
                            if (view2 != null && i3 >= view2.getLeft() && i3 < view2.getRight() && i4 >= view2.getTop() && i4 < view2.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                m11205s(pointerId3, this.f2784r);
                                return;
                            }
                            return;
                        }
                    } else if (this.f2767a == 1) {
                        this.f2785s = true;
                        abstractC1081c.mo4431h(this.f2784r, 0.0f, 0.0f);
                        this.f2785s = false;
                        if (this.f2767a == 1) {
                            m11208p(0);
                        }
                    }
                } else {
                    if (this.f2767a == 1) {
                        if (m11214j(this.f2769c)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2769c);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f2772f;
                            int i5 = this.f2769c;
                            int i6 = (int) (x2 - fArr[i5]);
                            int i7 = (int) (y2 - this.f2773g[i5]);
                            int left = this.f2784r.getLeft() + i6;
                            int top = this.f2784r.getTop() + i7;
                            int left2 = this.f2784r.getLeft();
                            int top2 = this.f2784r.getTop();
                            if (i6 != 0) {
                                left = abstractC1081c.mo4436a(this.f2784r, left);
                                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                                this.f2784r.offsetLeftAndRight(left - left2);
                            }
                            if (i7 != 0) {
                                top = abstractC1081c.mo4435b(this.f2784r, top);
                                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                                this.f2784r.offsetTopAndBottom(top - top2);
                            }
                            if (i6 != 0 || i7 != 0) {
                                abstractC1081c.mo4432g(this.f2784r, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i2 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (m11214j(pointerId4)) {
                                float x3 = motionEvent.getX(i2);
                                float y3 = motionEvent.getY(i2);
                                float f = x3 - this.f2770d[pointerId4];
                                float f2 = y3 - this.f2771e[pointerId4];
                                m11211m(f, f2, pointerId4);
                                if (this.f2767a != 1) {
                                    View m11216h2 = m11216h((int) x3, (int) y3);
                                    if (m11220d(m11216h2, f, f2) && m11205s(pointerId4, m11216h2)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    m11209o(motionEvent);
                    return;
                }
            } else if (this.f2767a == 1) {
                m11212l();
            }
            m11223a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m11216h3 = m11216h((int) x4, (int) y4);
        m11210n(x4, y4, pointerId5);
        m11205s(pointerId5, m11216h3);
        if ((this.f2774h[pointerId5] & 0) == 0) {
            return;
        }
        abstractC1081c.getClass();
    }

    /* renamed from: l */
    public final void m11212l() {
        VelocityTracker velocityTracker = this.f2778l;
        float f = this.f2779m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f2778l.getXVelocity(this.f2769c);
        float abs = Math.abs(xVelocity);
        float f2 = this.f2780n;
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f2778l.getYVelocity(this.f2769c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f2) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f2785s = true;
        this.f2783q.mo4431h(this.f2784r, xVelocity, f3);
        this.f2785s = false;
        if (this.f2767a == 1) {
            m11208p(0);
        }
    }

    /* renamed from: m */
    public final void m11211m(float f, float f2, int i) {
        boolean m11221c = m11221c(f, f2, i, 1);
        if (m11221c(f2, f, i, 4)) {
            m11221c |= true;
        }
        if (m11221c(f, f2, i, 2)) {
            m11221c |= true;
        }
        if (m11221c(f2, f, i, 8)) {
            m11221c |= true;
        }
        if (m11221c) {
            int[] iArr = this.f2775i;
            iArr[i] = iArr[i] | m11221c;
            this.f2783q.getClass();
        }
    }

    /* renamed from: n */
    public final void m11210n(float f, float f2, int i) {
        float[] fArr = this.f2770d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2771e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2772f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2773g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2774h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2775i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2776j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2770d = fArr2;
            this.f2771e = fArr3;
            this.f2772f = fArr4;
            this.f2773g = fArr5;
            this.f2774h = iArr;
            this.f2775i = iArr2;
            this.f2776j = iArr3;
        }
        float[] fArr9 = this.f2770d;
        this.f2772f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f2771e;
        this.f2773g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f2774h;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.f2786t;
        int left = viewGroup.getLeft();
        int i6 = this.f2781o;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f2777k |= 1 << i;
    }

    /* renamed from: o */
    public final void m11209o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m11214j(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2772f[pointerId] = x;
                this.f2773g[pointerId] = y;
            }
        }
    }

    /* renamed from: p */
    public final void m11208p(int i) {
        this.f2786t.removeCallbacks(this.f2787u);
        if (this.f2767a != i) {
            this.f2767a = i;
            this.f2783q.mo4433f(i);
            if (this.f2767a == 0) {
                this.f2784r = null;
            }
        }
    }

    /* renamed from: q */
    public final boolean m11207q(int i, int i2) {
        if (this.f2785s) {
            return m11215i(i, i2, (int) this.f2778l.getXVelocity(this.f2769c), (int) this.f2778l.getYVelocity(this.f2769c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if ((r18.f2774h[r2] & 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (r13 != r12) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
        if ((r18.f2774h[r1] & 0) != 0) goto L28;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11206r(@androidx.annotation.NonNull android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C1078c.m11206r(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public final boolean m11205s(int i, View view) {
        if (view == this.f2784r && this.f2769c == i) {
            return true;
        }
        if (view == null || !this.f2783q.mo4430i(i, view)) {
            return false;
        }
        this.f2769c = i;
        m11222b(i, view);
        return true;
    }
}

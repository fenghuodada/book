package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;

@VisibleForTesting
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public final class C1630l extends RecyclerView.AbstractC1578j implements RecyclerView.InterfaceC1582n {

    /* renamed from: C */
    public static final int[] f3933C = {16842919};

    /* renamed from: D */
    public static final int[] f3934D = new int[0];

    /* renamed from: A */
    public int f3935A;

    /* renamed from: B */
    public final RunnableC1631a f3936B;

    /* renamed from: a */
    public final int f3937a;

    /* renamed from: b */
    public final int f3938b;

    /* renamed from: c */
    public final StateListDrawable f3939c;

    /* renamed from: d */
    public final Drawable f3940d;

    /* renamed from: e */
    public final int f3941e;

    /* renamed from: f */
    public final int f3942f;

    /* renamed from: g */
    public final StateListDrawable f3943g;

    /* renamed from: h */
    public final Drawable f3944h;

    /* renamed from: i */
    public final int f3945i;

    /* renamed from: j */
    public final int f3946j;
    @VisibleForTesting

    /* renamed from: k */
    public int f3947k;
    @VisibleForTesting

    /* renamed from: l */
    public int f3948l;
    @VisibleForTesting

    /* renamed from: m */
    public float f3949m;
    @VisibleForTesting

    /* renamed from: n */
    public int f3950n;
    @VisibleForTesting

    /* renamed from: o */
    public int f3951o;
    @VisibleForTesting

    /* renamed from: p */
    public float f3952p;

    /* renamed from: s */
    public RecyclerView f3955s;

    /* renamed from: z */
    public final ValueAnimator f3962z;

    /* renamed from: q */
    public int f3953q = 0;

    /* renamed from: r */
    public int f3954r = 0;

    /* renamed from: t */
    public boolean f3956t = false;

    /* renamed from: u */
    public boolean f3957u = false;

    /* renamed from: v */
    public int f3958v = 0;

    /* renamed from: w */
    public int f3959w = 0;

    /* renamed from: x */
    public final int[] f3960x = new int[2];

    /* renamed from: y */
    public final int[] f3961y = new int[2];

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    public class RunnableC1631a implements Runnable {
        public RunnableC1631a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1630l c1630l = C1630l.this;
            int i = c1630l.f3935A;
            ValueAnimator valueAnimator = c1630l.f3962z;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            c1630l.f3935A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes.dex */
    public class C1632b extends RecyclerView.AbstractC1583o {
        public C1632b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
        /* renamed from: b */
        public final void mo4582b(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C1630l c1630l = C1630l.this;
            int computeVerticalScrollRange = c1630l.f3955s.computeVerticalScrollRange();
            int i3 = c1630l.f3954r;
            int i4 = computeVerticalScrollRange - i3;
            int i5 = c1630l.f3937a;
            if (i4 > 0 && i3 >= i5) {
                z = true;
            } else {
                z = false;
            }
            c1630l.f3956t = z;
            int computeHorizontalScrollRange = c1630l.f3955s.computeHorizontalScrollRange();
            int i6 = c1630l.f3953q;
            if (computeHorizontalScrollRange - i6 > 0 && i6 >= i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1630l.f3957u = z2;
            boolean z3 = c1630l.f3956t;
            if (!z3 && !z2) {
                if (c1630l.f3958v != 0) {
                    c1630l.m10132i(0);
                    return;
                }
                return;
            }
            if (z3) {
                float f = i3;
                c1630l.f3948l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                c1630l.f3947k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (c1630l.f3957u) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i6;
                c1630l.f3951o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                c1630l.f3950n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
            }
            int i7 = c1630l.f3958v;
            if (i7 == 0 || i7 == 1) {
                c1630l.m10132i(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* loaded from: classes.dex */
    public class C1633c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f3965a = false;

        public C1633c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3965a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f3965a) {
                this.f3965a = false;
                return;
            }
            C1630l c1630l = C1630l.this;
            if (((Float) c1630l.f3962z.getAnimatedValue()).floatValue() == 0.0f) {
                c1630l.f3935A = 0;
                c1630l.m10132i(0);
                return;
            }
            c1630l.f3935A = 2;
            c1630l.f3955s.invalidate();
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    /* loaded from: classes.dex */
    public class C1634d implements ValueAnimator.AnimatorUpdateListener {
        public C1634d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1630l c1630l = C1630l.this;
            c1630l.f3939c.setAlpha(floatValue);
            c1630l.f3940d.setAlpha(floatValue);
            c1630l.f3955s.invalidate();
        }
    }

    public C1630l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3962z = ofFloat;
        this.f3935A = 0;
        RunnableC1631a runnableC1631a = new RunnableC1631a();
        this.f3936B = runnableC1631a;
        C1632b c1632b = new C1632b();
        this.f3939c = stateListDrawable;
        this.f3940d = drawable;
        this.f3943g = stateListDrawable2;
        this.f3944h = drawable2;
        this.f3941e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3942f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3945i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3946j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3937a = i2;
        this.f3938b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1633c());
        ofFloat.addUpdateListener(new C1634d());
        RecyclerView recyclerView2 = this.f3955s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView2.f3679m;
                if (layoutManager != null) {
                    layoutManager.mo10237c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList<RecyclerView.AbstractC1578j> arrayList = recyclerView2.f3685p;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.m10394N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f3955s;
                recyclerView3.f3687q.remove(this);
                if (recyclerView3.f3689r == this) {
                    recyclerView3.f3689r = null;
                }
                ArrayList arrayList2 = this.f3955s.f3680m0;
                if (arrayList2 != null) {
                    arrayList2.remove(c1632b);
                }
                this.f3955s.removeCallbacks(runnableC1631a);
            }
            this.f3955s = recyclerView;
            if (recyclerView != null) {
                recyclerView.m10370g(this);
                this.f3955s.f3687q.add(this);
                this.f3955s.m10369h(c1632b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1582n
    /* renamed from: a */
    public final boolean mo10137a(@NonNull MotionEvent motionEvent) {
        int i = this.f3958v;
        if (i == 1) {
            boolean m10134g = m10134g(motionEvent.getX(), motionEvent.getY());
            boolean m10135f = m10135f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (m10134g || m10135f)) {
                if (m10135f) {
                    this.f3959w = 1;
                    this.f3952p = (int) motionEvent.getX();
                } else if (m10134g) {
                    this.f3959w = 2;
                    this.f3949m = (int) motionEvent.getY();
                }
                m10132i(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1582n
    /* renamed from: b */
    public final void mo10136b(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: e */
    public final void mo67e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1594v c1594v) {
        int i;
        if (this.f3953q == this.f3955s.getWidth() && this.f3954r == this.f3955s.getHeight()) {
            if (this.f3935A != 0) {
                if (this.f3956t) {
                    int i2 = this.f3953q;
                    int i3 = this.f3941e;
                    int i4 = i2 - i3;
                    int i5 = this.f3948l;
                    int i6 = this.f3947k;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = this.f3939c;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    int i8 = this.f3954r;
                    int i9 = this.f3942f;
                    Drawable drawable = this.f3940d;
                    drawable.setBounds(0, 0, i9, i8);
                    RecyclerView recyclerView2 = this.f3955s;
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    boolean z = true;
                    if (ViewCompat.C0815e.m11742d(recyclerView2) != 1) {
                        z = false;
                    }
                    if (z) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i = -i3;
                    } else {
                        canvas.translate(i4, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        i = -i4;
                    }
                    canvas.translate(i, -i7);
                }
                if (this.f3957u) {
                    int i10 = this.f3954r;
                    int i11 = this.f3945i;
                    int i12 = i10 - i11;
                    int i13 = this.f3951o;
                    int i14 = this.f3950n;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable2 = this.f3943g;
                    stateListDrawable2.setBounds(0, 0, i14, i11);
                    int i16 = this.f3953q;
                    int i17 = this.f3946j;
                    Drawable drawable2 = this.f3944h;
                    drawable2.setBounds(0, 0, i16, i17);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(i15, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i15, -i12);
                    return;
                }
                return;
            }
            return;
        }
        this.f3953q = this.f3955s.getWidth();
        this.f3954r = this.f3955s.getHeight();
        m10132i(0);
    }

    @VisibleForTesting
    /* renamed from: f */
    public final boolean m10135f(float f, float f2) {
        if (f2 >= this.f3954r - this.f3945i) {
            int i = this.f3951o;
            int i2 = this.f3950n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: g */
    public final boolean m10134g(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.f3955s;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f3941e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f3953q - i) {
            return false;
        }
        int i2 = this.f3948l;
        int i3 = this.f3947k / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m10133h(int i) {
        RecyclerView recyclerView = this.f3955s;
        RunnableC1631a runnableC1631a = this.f3936B;
        recyclerView.removeCallbacks(runnableC1631a);
        this.f3955s.postDelayed(runnableC1631a, i);
    }

    /* renamed from: i */
    public final void m10132i(int i) {
        int i2;
        StateListDrawable stateListDrawable = this.f3939c;
        if (i == 2 && this.f3958v != 2) {
            stateListDrawable.setState(f3933C);
            this.f3955s.removeCallbacks(this.f3936B);
        }
        if (i == 0) {
            this.f3955s.invalidate();
        } else {
            m10131j();
        }
        if (this.f3958v == 2 && i != 2) {
            stateListDrawable.setState(f3934D);
            i2 = 1200;
        } else {
            if (i == 1) {
                i2 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.f3958v = i;
        }
        m10133h(i2);
        this.f3958v = i;
    }

    /* renamed from: j */
    public final void m10131j() {
        int i = this.f3935A;
        ValueAnimator valueAnimator = this.f3962z;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.f3935A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r9 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r5 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1582n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1630l.onTouchEvent(android.view.MotionEvent):void");
    }
}

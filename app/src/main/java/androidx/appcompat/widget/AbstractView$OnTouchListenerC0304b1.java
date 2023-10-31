package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0231p;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0304b1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f1110a;

    /* renamed from: b */
    public final int f1111b;

    /* renamed from: c */
    public final int f1112c;

    /* renamed from: d */
    public final View f1113d;

    /* renamed from: e */
    public RunnableC0305a f1114e;

    /* renamed from: f */
    public RunnableC0306b f1115f;

    /* renamed from: g */
    public boolean f1116g;

    /* renamed from: h */
    public int f1117h;

    /* renamed from: i */
    public final int[] f1118i = new int[2];

    /* renamed from: androidx.appcompat.widget.b1$a */
    /* loaded from: classes.dex */
    public class RunnableC0305a implements Runnable {
        public RunnableC0305a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0304b1.this.f1113d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.b1$b */
    /* loaded from: classes.dex */
    public class RunnableC0306b implements Runnable {
        public RunnableC0306b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractView$OnTouchListenerC0304b1 abstractView$OnTouchListenerC0304b1 = AbstractView$OnTouchListenerC0304b1.this;
            abstractView$OnTouchListenerC0304b1.m12713a();
            View view = abstractView$OnTouchListenerC0304b1.f1113d;
            if (view.isEnabled() && !view.isLongClickable() && abstractView$OnTouchListenerC0304b1.mo12456c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                abstractView$OnTouchListenerC0304b1.f1116g = true;
            }
        }
    }

    public AbstractView$OnTouchListenerC0304b1(View view) {
        this.f1113d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1110a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1111b = tapTimeout;
        this.f1112c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m12713a() {
        RunnableC0306b runnableC0306b = this.f1115f;
        View view = this.f1113d;
        if (runnableC0306b != null) {
            view.removeCallbacks(runnableC0306b);
        }
        RunnableC0305a runnableC0305a = this.f1114e;
        if (runnableC0305a != null) {
            view.removeCallbacks(runnableC0305a);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0231p mo12457b();

    /* renamed from: c */
    public abstract boolean mo12456c();

    /* renamed from: d */
    public boolean mo12700d() {
        InterfaceC0231p mo12457b = mo12457b();
        if (mo12457b == null || !mo12457b.mo12653a()) {
            return true;
        }
        mo12457b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1116g = false;
        this.f1117h = -1;
        RunnableC0305a runnableC0305a = this.f1114e;
        if (runnableC0305a != null) {
            this.f1113d.removeCallbacks(runnableC0305a);
        }
    }
}

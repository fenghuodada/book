package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.C0559f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InterfaceC0920g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* loaded from: classes.dex */
public final class C0554e extends ConstraintLayout implements InterfaceC0920g0 {

    /* renamed from: K */
    public static final /* synthetic */ int f1876K = 0;

    /* renamed from: A */
    public boolean f1877A;

    /* renamed from: B */
    public ArrayList<C0553d> f1878B;

    /* renamed from: C */
    public ArrayList<C0553d> f1879C;

    /* renamed from: D */
    public CopyOnWriteArrayList<InterfaceC0557c> f1880D;

    /* renamed from: E */
    public int f1881E;

    /* renamed from: F */
    public float f1882F;

    /* renamed from: G */
    public boolean f1883G;

    /* renamed from: H */
    public C0556b f1884H;

    /* renamed from: I */
    public boolean f1885I;

    /* renamed from: J */
    public EnumC0558d f1886J;

    /* renamed from: q */
    public float f1887q;

    /* renamed from: r */
    public int f1888r;

    /* renamed from: s */
    public int f1889s;

    /* renamed from: t */
    public int f1890t;

    /* renamed from: u */
    public float f1891u;

    /* renamed from: v */
    public float f1892v;

    /* renamed from: w */
    public long f1893w;

    /* renamed from: x */
    public float f1894x;

    /* renamed from: y */
    public InterfaceC0557c f1895y;

    /* renamed from: z */
    public C0551b f1896z;

    /* renamed from: androidx.constraintlayout.motion.widget.e$a */
    /* loaded from: classes.dex */
    public class RunnableC0555a implements Runnable {
        public RunnableC0555a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0554e.this.f1884H.m12185a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.e$b */
    /* loaded from: classes.dex */
    public class C0556b {

        /* renamed from: a */
        public float f1898a = Float.NaN;

        /* renamed from: b */
        public float f1899b = Float.NaN;

        /* renamed from: c */
        public int f1900c = -1;

        /* renamed from: d */
        public int f1901d = -1;

        public C0556b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
            if (r5 == null) goto L18;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12185a() {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0554e.C0556b.m12185a():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0557c {
        /* renamed from: a */
        void mo12184a();

        /* renamed from: b */
        void mo12183b();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.e$d */
    /* loaded from: classes.dex */
    public enum EnumC0558d {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: A */
    public final void m12190A(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.f1884H == null) {
                this.f1884H = new C0556b();
            }
            this.f1884H.f1901d = i;
            return;
        }
        int i2 = this.f1889s;
        if (i2 != i && this.f1888r != i && this.f1890t != i) {
            this.f1890t = i;
            if (i2 != -1) {
                m12186z(i2, i);
                this.f1892v = 0.0f;
                return;
            }
            this.f1894x = 1.0f;
            this.f1891u = 0.0f;
            this.f1892v = 0.0f;
            this.f1893w = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0100, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010e, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010f, code lost:
        r17.f1889s = r2;
        r7 = r6;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0554e.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f1889s;
    }

    public ArrayList<C0559f.C0560a> getDefinedTransitions() {
        return null;
    }

    public C0551b getDesignTool() {
        if (this.f1896z == null) {
            this.f1896z = new C0551b();
        }
        return this.f1896z;
    }

    public int getEndState() {
        return this.f1890t;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1892v;
    }

    public C0559f getScene() {
        return null;
    }

    public int getStartState() {
        return this.f1888r;
    }

    public float getTargetPosition() {
        return this.f1894x;
    }

    public Bundle getTransitionState() {
        if (this.f1884H == null) {
            this.f1884H = new C0556b();
        }
        C0556b c0556b = this.f1884H;
        C0554e c0554e = C0554e.this;
        c0556b.f1901d = c0554e.f1890t;
        c0556b.f1900c = c0554e.f1888r;
        c0556b.f1899b = c0554e.getVelocity();
        c0556b.f1898a = c0554e.getProgress();
        C0556b c0556b2 = this.f1884H;
        c0556b2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c0556b2.f1898a);
        bundle.putFloat("motion.velocity", c0556b2.f1899b);
        bundle.putInt("motion.StartState", c0556b2.f1900c);
        bundle.putInt("motion.EndState", c0556b2.f1901d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return 0.0f;
    }

    public float getVelocity() {
        return this.f1887q;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: j */
    public final void mo2713j(int i, @NonNull View view) {
    }

    @Override // androidx.core.view.InterfaceC0920g0
    /* renamed from: k */
    public final void mo11312k(@NonNull View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i == 0 && i2 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public final void mo2712l(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: m */
    public final boolean mo2711m(@NonNull View view, @NonNull View view2, int i, int i2) {
        return false;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: n */
    public final void mo2710n(@NonNull View view, @NonNull View view2, int i, int i2) {
        getNanoTime();
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: o */
    public final void mo2709o(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        C0556b c0556b = this.f1884H;
        if (c0556b != null) {
            if (this.f1885I) {
                post(new RunnableC0555a());
            } else {
                c0556b.m12185a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1883G = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.f1883G = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0553d) {
            C0553d c0553d = (C0553d) view;
            if (this.f1880D == null) {
                this.f1880D = new CopyOnWriteArrayList<>();
            }
            this.f1880D.add(c0553d);
            if (c0553d.f1872i) {
                if (this.f1878B == null) {
                    this.f1878B = new ArrayList<>();
                }
                this.f1878B.add(c0553d);
            }
            if (c0553d.f1873j) {
                if (this.f1879C == null) {
                    this.f1879C = new ArrayList<>();
                }
                this.f1879C.add(c0553d);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C0553d> arrayList = this.f1878B;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C0553d> arrayList2 = this.f1879C;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i = this.f1889s;
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f1885I = z;
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C0553d> arrayList = this.f1879C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1879C.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C0553d> arrayList = this.f1878B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1878B.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f1884H == null) {
                this.f1884H = new C0556b();
            }
            this.f1884H.f1898a = f;
            return;
        }
        EnumC0558d enumC0558d = EnumC0558d.FINISHED;
        EnumC0558d enumC0558d2 = EnumC0558d.MOVING;
        if (i <= 0) {
            if (this.f1892v == 1.0f && this.f1889s == this.f1890t) {
                setState(enumC0558d2);
            }
            this.f1889s = this.f1888r;
            if (this.f1892v != 0.0f) {
                return;
            }
        } else if (f >= 1.0f) {
            if (this.f1892v == 0.0f && this.f1889s == this.f1888r) {
                setState(enumC0558d2);
            }
            this.f1889s = this.f1890t;
            if (this.f1892v != 1.0f) {
                return;
            }
        } else {
            this.f1889s = -1;
            setState(enumC0558d2);
            return;
        }
        setState(enumC0558d);
    }

    public void setScene(C0559f c0559f) {
        m12173s();
        throw null;
    }

    public void setStartState(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.f1884H == null) {
                this.f1884H = new C0556b();
            }
            C0556b c0556b = this.f1884H;
            c0556b.f1900c = i;
            c0556b.f1901d = i;
            return;
        }
        this.f1889s = i;
    }

    public void setState(EnumC0558d enumC0558d) {
        EnumC0558d enumC0558d2 = EnumC0558d.FINISHED;
        if (enumC0558d == enumC0558d2 && this.f1889s == -1) {
            return;
        }
        EnumC0558d enumC0558d3 = this.f1886J;
        this.f1886J = enumC0558d;
        EnumC0558d enumC0558d4 = EnumC0558d.MOVING;
        if (enumC0558d3 == enumC0558d4 && enumC0558d == enumC0558d4) {
            m12189w();
        }
        int ordinal = enumC0558d3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (enumC0558d == enumC0558d4) {
                m12189w();
            }
            if (enumC0558d != enumC0558d2) {
                return;
            }
        } else if (ordinal != 2 || enumC0558d != enumC0558d2) {
            return;
        }
        m12188x();
    }

    public void setTransition(int i) {
    }

    public void setTransition(C0559f.C0560a c0560a) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(InterfaceC0557c interfaceC0557c) {
        this.f1895y = interfaceC0557c;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1884H == null) {
            this.f1884H = new C0556b();
        }
        C0556b c0556b = this.f1884H;
        c0556b.getClass();
        c0556b.f1898a = bundle.getFloat("motion.progress");
        c0556b.f1899b = bundle.getFloat("motion.velocity");
        c0556b.f1900c = bundle.getInt("motion.StartState");
        c0556b.f1901d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f1884H.m12185a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: t */
    public final void mo12172t(int i) {
        this.f1921k = null;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C0550a.m12195a(context, this.f1888r) + "->" + C0550a.m12195a(context, this.f1890t) + " (pos:" + this.f1892v + " Dpos/Dt:" + this.f1887q;
    }

    /* renamed from: w */
    public final void m12189w() {
        CopyOnWriteArrayList<InterfaceC0557c> copyOnWriteArrayList;
        if ((this.f1895y == null && ((copyOnWriteArrayList = this.f1880D) == null || copyOnWriteArrayList.isEmpty())) || this.f1882F == this.f1891u) {
            return;
        }
        if (this.f1881E != -1) {
            InterfaceC0557c interfaceC0557c = this.f1895y;
            if (interfaceC0557c != null) {
                interfaceC0557c.mo12183b();
            }
            CopyOnWriteArrayList<InterfaceC0557c> copyOnWriteArrayList2 = this.f1880D;
            if (copyOnWriteArrayList2 != null) {
                Iterator<InterfaceC0557c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo12183b();
                }
            }
        }
        this.f1881E = -1;
        this.f1882F = this.f1891u;
        InterfaceC0557c interfaceC0557c2 = this.f1895y;
        if (interfaceC0557c2 != null) {
            interfaceC0557c2.mo12184a();
        }
        CopyOnWriteArrayList<InterfaceC0557c> copyOnWriteArrayList3 = this.f1880D;
        if (copyOnWriteArrayList3 != null) {
            Iterator<InterfaceC0557c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo12184a();
            }
        }
    }

    /* renamed from: x */
    public final void m12188x() {
        CopyOnWriteArrayList<InterfaceC0557c> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC0557c> copyOnWriteArrayList2;
        if ((this.f1895y == null && ((copyOnWriteArrayList2 = this.f1880D) == null || copyOnWriteArrayList2.isEmpty())) || this.f1881E != -1) {
            if (this.f1895y == null && ((copyOnWriteArrayList = this.f1880D) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.f1881E = this.f1889s;
        throw null;
    }

    /* renamed from: y */
    public final void m12187y(float f, float f2) {
        if (!super.isAttachedToWindow()) {
            if (this.f1884H == null) {
                this.f1884H = new C0556b();
            }
            C0556b c0556b = this.f1884H;
            c0556b.f1898a = f;
            c0556b.f1899b = f2;
            return;
        }
        setProgress(f);
        setState(EnumC0558d.MOVING);
        this.f1887q = f2;
    }

    /* renamed from: z */
    public final void m12186z(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f1884H == null) {
                this.f1884H = new C0556b();
            }
            C0556b c0556b = this.f1884H;
            c0556b.f1900c = i;
            c0556b.f1901d = i2;
        }
    }
}

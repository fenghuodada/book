package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.C0511i;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.views.C8955b;
import com.kongzue.dialogx.util.views.RunnableC8963e;
import com.kongzue.dialogx.util.views.RunnableC8964f;
import com.kongzue.dialogx.util.views.RunnableC8965g;

/* renamed from: com.kongzue.dialogx.dialogs.x */
/* loaded from: classes3.dex */
public final class RunnableC8913x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16993a;

    /* renamed from: b */
    public final /* synthetic */ C8897o.C8899b f16994b;

    /* renamed from: com.kongzue.dialogx.dialogs.x$a */
    /* loaded from: classes3.dex */
    public class RunnableC8914a implements Runnable {

        /* renamed from: com.kongzue.dialogx.dialogs.x$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC8915a implements Runnable {
            public RunnableC8915a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8897o.C8899b c8899b = RunnableC8913x.this.f16994b;
                if (C8897o.this.f16959D > -1) {
                    c8899b.m2895a(null);
                }
            }
        }

        public RunnableC8914a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC8913x runnableC8913x = RunnableC8913x.this;
            C8897o.this.getClass();
            C8905q c8905q = new C8905q();
            C8897o.C8899b c8899b = runnableC8913x.f16994b;
            C8897o c8897o = C8897o.this;
            try {
                C1484n c1484n = c8905q.f17044a;
                AbstractC1464h.EnumC1468b enumC1468b = c1484n.f3453c;
                AbstractC1464h.EnumC1468b enumC1468b2 = AbstractC1464h.EnumC1468b.CREATED;
                if (enumC1468b != enumC1468b2) {
                    c1484n.m10532h(enumC1468b2);
                }
            } catch (Exception unused) {
            }
            c8899b.m2892d();
            long j = C8897o.this.f16957B;
            if (j > 0) {
                c8899b.f16974e.postDelayed(new RunnableC8915a(), j);
            }
        }
    }

    /* renamed from: com.kongzue.dialogx.dialogs.x$b */
    /* loaded from: classes3.dex */
    public class RunnableC8916b implements Runnable {
        public RunnableC8916b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8897o.C8899b c8899b = RunnableC8913x.this.f16994b;
            if (C8897o.this.f16959D > -1) {
                c8899b.m2895a(null);
            }
        }
    }

    public RunnableC8913x(C8897o.C8899b c8899b, int i) {
        this.f16994b = c8899b;
        this.f16993a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8897o.C8899b c8899b = this.f16994b;
        C8897o c8897o = C8897o.this;
        int i = this.f16993a;
        c8897o.f16959D = C0511i.m12337b(i);
        if (c8899b.f16974e == null) {
            return;
        }
        int m12337b = C0511i.m12337b(i);
        if (m12337b != 0) {
            if (m12337b != 1) {
                if (m12337b != 2) {
                    if (m12337b == 3) {
                        C8955b c8955b = c8899b.f16974e;
                        if (c8955b.f17099a == 4) {
                            c8955b.m2831d(1.0f);
                            c8955b.f17124z = new RunnableC8965g(c8955b);
                        } else {
                            c8955b.m2832c(3, new DecelerateInterpolator(2.0f));
                        }
                    }
                } else {
                    C8955b c8955b2 = c8899b.f16974e;
                    if (c8955b2.f17099a == 4) {
                        c8955b2.m2831d(1.0f);
                        c8955b2.f17124z = new RunnableC8964f(c8955b2);
                    } else {
                        c8955b2.m2832c(2, new AccelerateInterpolator(2.0f));
                    }
                }
            } else {
                C8955b c8955b3 = c8899b.f16974e;
                if (c8955b3.f17099a == 4) {
                    c8955b3.m2831d(1.0f);
                    c8955b3.f17124z = new RunnableC8963e(c8955b3);
                } else {
                    c8955b3.m2832c(1, new AccelerateDecelerateInterpolator());
                }
            }
            RelativeLayout relativeLayout = c8899b.f16973d;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                c8899b.f16974e.f17097A = new RunnableC8914a();
                return;
            }
            C8897o c8897o2 = C8897o.this;
            c8897o2.getClass();
            try {
                C1484n c1484n = new C8905q().f17044a;
                AbstractC1464h.EnumC1468b enumC1468b = c1484n.f3453c;
                AbstractC1464h.EnumC1468b enumC1468b2 = AbstractC1464h.EnumC1468b.CREATED;
                if (enumC1468b != enumC1468b2) {
                    c1484n.m10532h(enumC1468b2);
                }
            } catch (Exception unused) {
            }
            c8899b.m2892d();
            long j = c8897o2.f16957B;
            if (j > 0) {
                BaseDialog.m2885A(new RunnableC8916b(), j);
                return;
            }
            return;
        }
        C8955b c8955b4 = c8899b.f16974e;
        c8955b4.f17098B = false;
        c8955b4.f17115q = 0;
        c8955b4.f17119u = 0;
        c8955b4.f17120v = 0;
        c8955b4.f17099a = 0;
        ValueAnimator valueAnimator = c8955b4.f17102d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = c8955b4.f17103e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c8955b4.f17110l = false;
        c8955b4.m2833b();
    }
}

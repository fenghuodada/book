package com.kongzue.dialogx.dialogs;

import android.view.View;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.kongzue.dialogx.dialogs.r */
/* loaded from: classes3.dex */
public final class C8906r extends DialogXBaseRelativeLayout.AbstractC8951d {

    /* renamed from: a */
    public final /* synthetic */ C8897o.C8899b f16986a;

    /* renamed from: com.kongzue.dialogx.dialogs.r$a */
    /* loaded from: classes3.dex */
    public class RunnableC8907a implements Runnable {
        public RunnableC8907a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8906r c8906r = C8906r.this;
            if (C8897o.this.m2871k() == null) {
                return;
            }
            C8897o.C8899b c8899b = c8906r.f16986a;
            C8897o c8897o = C8897o.this;
            if (c8897o.f16967y == null) {
                c8897o.f16967y = new C8912w(c8899b);
            }
            c8897o.f16967y.m2890b(c8897o);
            C8897o.this.getClass();
            C8897o.this.getClass();
            C8905q c8905q = new C8905q();
            C8897o c8897o2 = C8897o.this;
            try {
                C1484n c1484n = c8905q.f17044a;
                AbstractC1464h.EnumC1468b enumC1468b = c1484n.f3453c;
                AbstractC1464h.EnumC1468b enumC1468b2 = AbstractC1464h.EnumC1468b.CREATED;
                if (enumC1468b != enumC1468b2) {
                    c1484n.m10532h(enumC1468b2);
                }
            } catch (Exception unused) {
            }
            C8897o.this.getClass();
            C8897o.this.m2884B(AbstractC1464h.EnumC1468b.RESUMED);
        }
    }

    public C8906r(C8897o.C8899b c8899b) {
        this.f16986a = c8899b;
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AbstractC8951d
    /* renamed from: a */
    public final void mo2836a() {
        AbstractC1464h.EnumC1468b enumC1468b = AbstractC1464h.EnumC1468b.DESTROYED;
        C8897o.C8899b c8899b = this.f16986a;
        C8897o.this.f17019h = false;
        try {
            C1484n c1484n = new C8905q().f17044a;
            if (c1484n.f3453c != enumC1468b) {
                c1484n.m10532h(enumC1468b);
            }
        } catch (Exception unused) {
        }
        C8897o c8897o = C8897o.this;
        c8897o.getClass();
        WeakReference<C8897o.C8899b> weakReference = c8897o.f16963H;
        if (weakReference != null) {
            weakReference.clear();
        }
        c8897o.f16963H = null;
        WeakReference<View> weakReference2 = c8897o.f16962G;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        c8897o.f16962G = null;
        WeakReference<C8897o> weakReference3 = C8897o.f16955J;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        C8897o.f16955J = null;
        c8897o.m2884B(enumC1468b);
        System.gc();
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AbstractC8951d
    /* renamed from: b */
    public final void mo2835b() {
        C8897o.C8899b c8899b = this.f16986a;
        C8897o c8897o = C8897o.this;
        c8897o.f17019h = true;
        c8897o.getClass();
        C8897o.this.m2884B(AbstractC1464h.EnumC1468b.CREATED);
        c8899b.f16971b.setAlpha(0.0f);
        c8899b.f16972c.post(new RunnableC8907a());
    }
}

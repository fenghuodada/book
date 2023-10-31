package com.kongzue.dialogx.dialogs;

import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.style.C8941a;
import java.lang.ref.WeakReference;

/* renamed from: com.kongzue.dialogx.dialogs.m */
/* loaded from: classes3.dex */
public final class RunnableC8895m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8897o f16952a;

    public RunnableC8895m(C8897o c8897o) {
        this.f16952a = c8897o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8897o c8897o = this.f16952a;
        c8897o.f17020i.getClass();
        C8941a c8941a = c8897o.f17020i;
        c8941a.getClass();
        c8897o.mo2862t();
        c8941a.getClass();
        c8897o.mo2862t();
        c8897o.f16963H = new WeakReference<>(new C8897o.C8899b());
        if (c8897o.m2904F() != null) {
            c8897o.m2904F().m2893c();
            if (c8897o.m2902H() != null) {
                c8897o.m2902H().setTag(c8897o);
                BaseDialog.m2883C(c8897o.m2902H());
            }
        }
    }
}

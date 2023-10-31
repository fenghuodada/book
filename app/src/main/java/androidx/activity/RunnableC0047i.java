package androidx.activity;

import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.C1492u;
import androidx.lifecycle.InterfaceC1483m;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.activity.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0047i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f91a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1483m f92b;

    public /* synthetic */ RunnableC0047i(InterfaceC1483m interfaceC1483m, int i) {
        this.f91a = i;
        this.f92b = interfaceC1483m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f91a;
        InterfaceC1483m interfaceC1483m = this.f92b;
        switch (i) {
            case 0:
                DialogC0048j.m13057a((DialogC0048j) interfaceC1483m);
                return;
            default:
                C1492u this$0 = (C1492u) interfaceC1483m;
                C1492u c1492u = C1492u.f3464i;
                C10843j.m430f(this$0, "this$0");
                int i2 = this$0.f3466b;
                C1484n c1484n = this$0.f3470f;
                if (i2 == 0) {
                    this$0.f3467c = true;
                    c1484n.m10534f(AbstractC1464h.EnumC1465a.ON_PAUSE);
                }
                if (this$0.f3465a == 0 && this$0.f3467c) {
                    c1484n.m10534f(AbstractC1464h.EnumC1465a.ON_STOP);
                    this$0.f3468d = true;
                    return;
                }
                return;
        }
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.activity.result.InterfaceC0056b;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.exoplayer2.C6989k0;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.AbstractC7238h;
import com.permissionx.guolindev.request.C8983m;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C6558q implements InterfaceC6608b.InterfaceC6609a, C6989k0.InterfaceC6994e, AbstractC6749g.InterfaceC6750a, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f10359b;

    @Override // com.google.android.exoplayer2.decoder.AbstractC6749g.InterfaceC6750a
    /* renamed from: a */
    public final void mo6015a(AbstractC6749g abstractC6749g) {
        AbstractC7207a abstractC7207a = (AbstractC7207a) this.f10359b;
        AbstractC7238h abstractC7238h = (AbstractC7238h) abstractC6749g;
        synchronized (abstractC7207a.f10931b) {
            boolean z = false;
            abstractC7238h.f10915a = 0;
            abstractC7238h.f13153c = null;
            int i = abstractC7207a.f10937h;
            abstractC7207a.f10937h = i + 1;
            abstractC7207a.f10935f[i] = abstractC7238h;
            if (!abstractC7207a.f10932c.isEmpty() && abstractC7207a.f10937h > 0) {
                z = true;
            }
            if (z) {
                abstractC7207a.f10931b.notify();
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        return Integer.valueOf(((InterfaceC6574d) this.f10359b).mo6245b());
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f10359b;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8983m(this$0, (Boolean) obj));
    }
}

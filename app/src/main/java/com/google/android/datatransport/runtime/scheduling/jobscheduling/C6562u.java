package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.permissionx.guolindev.request.C8985o;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C6562u implements InterfaceC6608b.InterfaceC6609a, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f10379b;

    public /* synthetic */ C6562u(Object obj) {
        this.f10379b = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        C6563v c6563v = (C6563v) this.f10379b;
        for (AbstractC6522n abstractC6522n : c6563v.f10381b.mo6242p()) {
            c6563v.f10382c.mo6259a(abstractC6522n, 1);
        }
        return null;
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f10379b;
        C0054a c0054a = (C0054a) obj;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8985o(this$0));
    }
}

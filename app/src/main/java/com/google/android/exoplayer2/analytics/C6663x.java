package com.google.android.exoplayer2.analytics;

import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import com.google.android.exoplayer2.util.C7417m;
import com.permissionx.guolindev.request.C8988r;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.exoplayer2.analytics.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C6663x implements C7417m.InterfaceC7418a, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f10590b;

    public /* synthetic */ C6663x(Object obj) {
        this.f10590b = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).m6147v();
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f10590b;
        C0054a c0054a = (C0054a) obj;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8988r(this$0));
    }
}

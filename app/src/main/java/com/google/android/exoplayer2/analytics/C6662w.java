package com.google.android.exoplayer2.analytics;

import androidx.activity.result.C0054a;
import androidx.activity.result.InterfaceC0056b;
import com.google.android.datatransport.InterfaceC6465e;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import com.google.android.exoplayer2.text.cea.AbstractC7218d;
import com.google.android.exoplayer2.util.C7417m;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import com.permissionx.guolindev.request.C8990t;
import com.permissionx.guolindev.request.C8991u;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.google.android.exoplayer2.analytics.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C6662w implements C7417m.InterfaceC7418a, AbstractC6749g.InterfaceC6750a, InterfaceC6465e, InterfaceC0056b {

    /* renamed from: b */
    public final /* synthetic */ Object f10589b;

    public /* synthetic */ C6662w(Object obj) {
        this.f10589b = obj;
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC6749g.InterfaceC6750a
    /* renamed from: a */
    public final void mo6015a(AbstractC6749g abstractC6749g) {
        AbstractC7218d abstractC7218d = (AbstractC7218d) this.f10589b;
        AbstractC7218d.C7220b c7220b = (AbstractC7218d.C7220b) abstractC6749g;
        abstractC7218d.getClass();
        c7220b.f10915a = 0;
        c7220b.f13153c = null;
        abstractC7218d.f13091b.add(c7220b);
    }

    @Override // com.google.android.datatransport.InterfaceC6465e
    public final Object apply(Object obj) {
        return EventGDTLogger.m3294a((EventGDTLogger) this.f10589b, (SessionEvent) obj);
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).m6179c0();
    }

    @Override // androidx.activity.result.InterfaceC0056b
    public final void onActivityResult(Object obj) {
        C8991u this$0 = (C8991u) this.f10589b;
        C0054a c0054a = (C0054a) obj;
        int i = C8991u.f17160l;
        C10843j.m430f(this$0, "this$0");
        this$0.m2825j(new C8990t(this$0));
    }
}

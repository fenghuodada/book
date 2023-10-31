package com.vungle.warren.utility.platform;

import android.webkit.WebSettings;
import androidx.core.util.InterfaceC0797a;
import com.vungle.warren.C9963q1;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.persistence.C9919c;

/* renamed from: com.vungle.warren.utility.platform.a */
/* loaded from: classes3.dex */
public final class RunnableC10098a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0797a f20331a;

    /* renamed from: b */
    public final /* synthetic */ C10099b f20332b;

    public RunnableC10098a(C10099b c10099b, C9963q1 c9963q1) {
        this.f20332b = c10099b;
        this.f20331a = c9963q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10099b c10099b = this.f20332b;
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c10099b.f20334b);
        InterfaceC0797a interfaceC0797a = this.f20331a;
        interfaceC0797a.accept(defaultUserAgent);
        try {
            c10099b.getClass();
            C9867g c9867g = new C9867g("userAgent");
            c9867g.m1445d(defaultUserAgent, "userAgent");
            c10099b.f20335c.m1376w(c9867g);
        } catch (C9919c.C9920a unused) {
            interfaceC0797a.accept(null);
        }
    }
}

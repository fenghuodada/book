package com.applovin.adview;

import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1481l;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.C2791o;
import com.applovin.impl.adview.activity.p010b.AbstractC2688a;
import com.applovin.impl.sdk.C3214m;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements InterfaceC1481l {

    /* renamed from: a */
    private final C3214m f6228a;

    /* renamed from: b */
    private final AtomicBoolean f6229b = new AtomicBoolean(true);

    /* renamed from: c */
    private AbstractC2688a f6230c;

    /* renamed from: d */
    private C2791o f6231d;

    public AppLovinFullscreenAdViewObserver(AbstractC1464h abstractC1464h, C2791o c2791o, C3214m c3214m) {
        this.f6231d = c2791o;
        this.f6228a = c3214m;
        abstractC1464h.mo10539a(this);
    }

    @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_DESTROY)
    public void onDestroy() {
        C2791o c2791o = this.f6231d;
        if (c2791o != null) {
            c2791o.m8895e();
            this.f6231d = null;
        }
        AbstractC2688a abstractC2688a = this.f6230c;
        if (abstractC2688a != null) {
            abstractC2688a.mo9052h();
            this.f6230c.mo9069k();
            this.f6230c = null;
        }
    }

    @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_PAUSE)
    public void onPause() {
        AbstractC2688a abstractC2688a = this.f6230c;
        if (abstractC2688a != null) {
            abstractC2688a.mo9107g();
            this.f6230c.mo9053e();
        }
    }

    @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_RESUME)
    public void onResume() {
        AbstractC2688a abstractC2688a;
        if (this.f6229b.getAndSet(false) || (abstractC2688a = this.f6230c) == null) {
            return;
        }
        abstractC2688a.mo9108f();
        this.f6230c.mo9063a(0L);
    }

    @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_STOP)
    public void onStop() {
        AbstractC2688a abstractC2688a = this.f6230c;
        if (abstractC2688a != null) {
            abstractC2688a.m9137j();
        }
    }

    public void setPresenter(AbstractC2688a abstractC2688a) {
        this.f6230c = abstractC2688a;
    }
}

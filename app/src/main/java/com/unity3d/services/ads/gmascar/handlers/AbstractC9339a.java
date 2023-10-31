package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.gmascar.utils.C9346a;
import com.unity3d.services.core.misc.C9554a;
import com.unity3d.services.core.misc.InterfaceC9556b;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9339a implements IScarAdListenerWrapper {

    /* renamed from: a */
    protected final ScarAdMetadata f18243a;

    /* renamed from: b */
    protected final C9554a<GMAEvent> f18244b;

    /* renamed from: c */
    protected final C9346a f18245c = new C9346a();

    /* renamed from: com.unity3d.services.ads.gmascar.handlers.a$a */
    /* loaded from: classes3.dex */
    public class C9340a implements InterfaceC9556b<GMAEvent> {
        public C9340a() {
        }

        @Override // com.unity3d.services.core.misc.InterfaceC9556b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo2003a(GMAEvent gMAEvent) {
            AbstractC9339a.this.f18245c.m2435a(gMAEvent, new Object[0]);
        }
    }

    public AbstractC9339a(ScarAdMetadata scarAdMetadata, C9554a<GMAEvent> c9554a) {
        this.f18243a = scarAdMetadata;
        this.f18244b = c9554a;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        this.f18245c.m2435a(GMAEvent.AD_CLOSED, new Object[0]);
        this.f18244b.m2004e();
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdFailedToLoad(int i, String str) {
        this.f18245c.m2435a(GMAEvent.LOAD_ERROR, this.f18243a.getPlacementId(), this.f18243a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdLoaded() {
        this.f18245c.m2435a(GMAEvent.AD_LOADED, this.f18243a.getPlacementId(), this.f18243a.getQueryId());
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdOpened() {
        C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.AD_STARTED, new Object[0]);
        this.f18244b.m2008a(new C9340a());
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdSkipped() {
        this.f18245c.m2435a(GMAEvent.AD_SKIPPED, new Object[0]);
    }
}

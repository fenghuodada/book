package com.unity3d.services.ads.gmascar;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.gmascar.adapters.C9325a;
import com.unity3d.services.ads.gmascar.bridges.C9326a;
import com.unity3d.services.ads.gmascar.bridges.C9329c;
import com.unity3d.services.ads.gmascar.bridges.C9331d;
import com.unity3d.services.ads.gmascar.bridges.C9334e;
import com.unity3d.services.ads.gmascar.finder.C9336a;
import com.unity3d.services.ads.gmascar.finder.C9337b;
import com.unity3d.services.ads.gmascar.finder.C9338c;
import com.unity3d.services.ads.gmascar.handlers.C9341b;
import com.unity3d.services.ads.gmascar.handlers.C9342c;
import com.unity3d.services.ads.gmascar.handlers.C9343d;
import com.unity3d.services.ads.gmascar.handlers.C9344e;
import com.unity3d.services.ads.gmascar.utils.C9346a;
import com.unity3d.services.core.misc.C9554a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.timer.C9612b;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.unity3d.services.ads.gmascar.a */
/* loaded from: classes3.dex */
public class C9324a {

    /* renamed from: a */
    private IScarAdapter f18216a;

    /* renamed from: b */
    private final C9334e f18217b;

    /* renamed from: c */
    private final C9338c f18218c;

    /* renamed from: d */
    private final C9331d f18219d;

    /* renamed from: e */
    private final C9329c f18220e;

    /* renamed from: f */
    private final C9326a f18221f;

    /* renamed from: g */
    private final C9337b f18222g;

    /* renamed from: h */
    private final C9336a f18223h;

    /* renamed from: i */
    private final C9344e f18224i;

    /* renamed from: j */
    private final C9325a f18225j;

    /* renamed from: k */
    private final C9346a f18226k;

    public C9324a() {
        C9334e c9334e = new C9334e();
        this.f18217b = c9334e;
        C9329c c9329c = new C9329c();
        this.f18220e = c9329c;
        C9331d c9331d = new C9331d();
        this.f18219d = c9331d;
        C9326a c9326a = new C9326a();
        this.f18221f = c9326a;
        this.f18224i = new C9344e();
        this.f18225j = new C9325a();
        C9337b c9337b = new C9337b(c9334e, c9331d, c9329c, c9326a);
        this.f18222g = c9337b;
        C9336a c9336a = new C9336a(c9334e, c9331d, c9329c, c9326a);
        this.f18223h = c9336a;
        this.f18218c = new C9338c(c9334e, c9337b, c9336a);
        this.f18226k = new C9346a();
    }

    /* renamed from: a */
    private IScarAdapter m2467a() {
        if (this.f18216a == null) {
            this.f18216a = this.f18225j.m2457a(this.f18218c.m2441a(), this.f18224i);
        }
        return this.f18216a;
    }

    /* renamed from: a */
    private C9554a m2465a(Integer num) {
        return new C9554a(new ArrayDeque(Arrays.asList(GMAEvent.FIRST_QUARTILE, GMAEvent.MIDPOINT, GMAEvent.THIRD_QUARTILE, GMAEvent.LAST_QUARTILE)), num, new C9612b());
    }

    /* renamed from: a */
    private void m2466a(ScarAdMetadata scarAdMetadata) {
        this.f18216a.loadInterstitialAd(C9568a.m1959e(), scarAdMetadata, new C9341b(scarAdMetadata, m2465a(scarAdMetadata.getVideoLengthMs())));
    }

    /* renamed from: b */
    private void m2460b(ScarAdMetadata scarAdMetadata) {
        this.f18216a.loadRewardedAd(C9568a.m1959e(), scarAdMetadata, new C9342c(scarAdMetadata, m2465a(scarAdMetadata.getVideoLengthMs())));
    }

    /* renamed from: a */
    public void m2464a(String str, String str2, boolean z) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2);
        IScarAdapter m2467a = m2467a();
        this.f18216a = m2467a;
        if (m2467a != null) {
            m2467a.show(C9568a.m1967a(), str2, str);
        } else {
            this.f18224i.handleError(GMAAdsError.InternalShowError(scarAdMetadata, "Scar Adapter object is null"));
        }
    }

    /* renamed from: a */
    public void m2463a(boolean z, String str, String str2, String str3, String str4, int i) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2, str4, str3, Integer.valueOf(i));
        IScarAdapter m2467a = m2467a();
        this.f18216a = m2467a;
        if (m2467a == null) {
            this.f18224i.handleError(GMAAdsError.InternalLoadError(scarAdMetadata, "Scar Adapter object is null"));
        } else if (z) {
            m2466a(scarAdMetadata);
        } else {
            m2460b(scarAdMetadata);
        }
    }

    /* renamed from: a */
    public void m2462a(String[] strArr, String[] strArr2) {
        this.f18216a = m2467a();
        C9343d c9343d = new C9343d();
        IScarAdapter iScarAdapter = this.f18216a;
        if (iScarAdapter != null) {
            iScarAdapter.getSCARSignals(C9568a.m1959e(), strArr, strArr2, c9343d);
        } else {
            this.f18224i.handleError(GMAAdsError.InternalSignalsError("Could not create SCAR adapter object"));
        }
    }

    /* renamed from: b */
    public void m2461b() {
        this.f18218c.m2439b();
    }

    /* renamed from: c */
    public void m2459c() {
        if (!this.f18222g.m2442a()) {
            this.f18224i.handleError(new GMAAdsError(GMAEvent.SCAR_NOT_PRESENT, new Object[0]));
            return;
        }
        this.f18226k.m2435a(GMAEvent.SCAR_PRESENT, new Object[0]);
        this.f18223h.m2444b();
    }

    /* renamed from: d */
    public boolean m2458d() {
        return this.f18223h.m2443c();
    }
}

package com.iab.omid.library.applovin.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.p048d.C8794e;

/* loaded from: classes3.dex */
public final class AdEvents {
    private final C8773a adSession;

    private AdEvents(C8773a c8773a) {
        this.adSession = c8773a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C8773a c8773a = (C8773a) adSession;
        C8794e.m3038a(adSession, "AdSession is null");
        C8794e.m3033d(c8773a);
        C8794e.m3035b(c8773a);
        AdEvents adEvents = new AdEvents(c8773a);
        c8773a.getAdSessionStatePublisher().m3021a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C8794e.m3035b(this.adSession);
        C8794e.m3031f(this.adSession);
        if (!this.adSession.m3139f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m3139f()) {
            this.adSession.m3144c();
        }
    }

    public void loaded() {
        C8794e.m3034c(this.adSession);
        C8794e.m3031f(this.adSession);
        this.adSession.m3142d();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C8794e.m3038a(vastProperties, "VastProperties is null");
        C8794e.m3034c(this.adSession);
        C8794e.m3031f(this.adSession);
        this.adSession.m3147a(vastProperties.m3132a());
    }
}

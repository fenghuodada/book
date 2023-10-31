package com.applovin.impl.sdk.p028a;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2654b;
import com.applovin.impl.p008a.C2659g;
import com.applovin.impl.p008a.C2663j;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.p008a.EnumC2658f;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.a.g */
/* loaded from: classes.dex */
public class C3053g extends AbstractC3040b {

    /* renamed from: h */
    static final /* synthetic */ boolean f7593h = true;

    /* renamed from: i */
    private final C2649a f7594i;

    /* renamed from: j */
    private final AtomicBoolean f7595j;

    /* renamed from: k */
    private MediaEvents f7596k;

    /* renamed from: l */
    private final VastProperties f7597l;

    /* renamed from: m */
    private final AtomicBoolean f7598m;

    /* renamed from: n */
    private final AtomicBoolean f7599n;

    /* renamed from: o */
    private final AtomicBoolean f7600o;

    /* renamed from: p */
    private final AtomicBoolean f7601p;

    public C3053g(C2649a c2649a) {
        super(c2649a);
        this.f7595j = new AtomicBoolean();
        this.f7598m = new AtomicBoolean();
        this.f7599n = new AtomicBoolean();
        this.f7600o = new AtomicBoolean();
        this.f7601p = new AtomicBoolean();
        this.f7594i = c2649a;
        this.f7597l = c2649a.m9290e() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(f7593h, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) c2649a.m9290e(), f7593h, Position.STANDALONE);
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    @Nullable
    /* renamed from: a */
    public AdSessionConfiguration mo8046a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f7568c.m6854b(this.f7569d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    @Nullable
    /* renamed from: a */
    public AdSessionContext mo8044a(@Nullable WebView webView) {
        EnumC2658f enumC2658f;
        Set<C2663j> set;
        if (f7593h || this.f7594i.m9297aS() != null) {
            ArrayList arrayList = new ArrayList();
            for (C2654b c2654b : this.f7594i.m9297aS().m9252a()) {
                List<C2659g> m9255b = c2654b.m9255b();
                if (!m9255b.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C2659g c2659g : m9255b) {
                        if ("omid".equalsIgnoreCase(c2659g.m9236a())) {
                            arrayList2.add(c2659g);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        set = c2654b.m9253d();
                        enumC2658f = EnumC2658f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        C2665l.m9208a(set, enumC2658f, this.f7567b);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            try {
                                arrayList3.add(new URL(((C2659g) it.next()).m9234b()));
                            } catch (Throwable th) {
                                if (C3349v.m6862a()) {
                                    this.f7568c.m6854b(this.f7569d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String m9254c = c2654b.m9254c();
                            String m9257a = c2654b.m9257a();
                            if (!StringUtils.isValidString(m9254c) || StringUtils.isValidString(m9257a)) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    URL url = (URL) it2.next();
                                    arrayList.add(StringUtils.isValidString(m9254c) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(m9257a, url, m9254c) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                set = c2654b.m9253d();
                enumC2658f = EnumC2658f.FAILED_TO_LOAD_RESOURCE;
                C2665l.m9208a(set, enumC2658f, this.f7567b);
            }
            String m8047e = this.f7567b.m7428al().m8047e();
            if (TextUtils.isEmpty(m8047e)) {
                if (C3349v.m6862a()) {
                    this.f7568c.m6850e(this.f7569d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f7567b.m7428al().m8048d(), m8047e, arrayList, this.f7594i.getOpenMeasurementContentUrl(), this.f7594i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (C3349v.m6862a()) {
                    this.f7568c.m6854b(this.f7569d, "Failed to create ad session context", th2);
                    return null;
                }
                return null;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m8045a(final float f, final boolean z) {
        if (this.f7598m.compareAndSet(false, f7593h)) {
            m8063a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.start(f, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    /* renamed from: a */
    public void mo8042a(AdSession adSession) {
        try {
            this.f7596k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f7568c.m6854b(this.f7569d, "Failed to create media events", th);
            }
        }
    }

    /* renamed from: a */
    public void m8041a(final boolean z) {
        m8063a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    /* renamed from: c */
    public void mo8039c() {
        m8063a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                C3053g c3053g = C3053g.this;
                c3053g.f7572g.loaded(c3053g.f7597l);
            }
        });
    }

    /* renamed from: f */
    public void m8038f() {
        if (this.f7599n.compareAndSet(false, f7593h)) {
            m8063a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.firstQuartile();
                }
            });
        }
    }

    /* renamed from: g */
    public void m8037g() {
        if (this.f7600o.compareAndSet(false, f7593h)) {
            m8063a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.midpoint();
                }
            });
        }
    }

    /* renamed from: h */
    public void m8036h() {
        if (this.f7601p.compareAndSet(false, f7593h)) {
            m8063a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.thirdQuartile();
                }
            });
        }
    }

    /* renamed from: i */
    public void m8035i() {
        m8063a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.complete();
            }
        });
    }

    /* renamed from: j */
    public void m8034j() {
        m8063a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.pause();
            }
        });
    }

    /* renamed from: k */
    public void m8033k() {
        m8063a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.resume();
            }
        });
    }

    /* renamed from: l */
    public void m8032l() {
        if (this.f7595j.compareAndSet(false, f7593h)) {
            m8063a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.bufferStart();
                }
            });
        }
    }

    /* renamed from: m */
    public void m8031m() {
        if (this.f7595j.compareAndSet(f7593h, false)) {
            m8063a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    C3053g.this.f7596k.bufferFinish();
                }
            });
        }
    }

    /* renamed from: n */
    public void m8030n() {
        m8063a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.skipped();
            }
        });
    }

    /* renamed from: o */
    public void m8029o() {
        m8063a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                C3053g.this.f7596k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}

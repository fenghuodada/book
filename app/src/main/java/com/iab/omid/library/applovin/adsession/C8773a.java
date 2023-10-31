package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.p046b.C8778c;
import com.iab.omid.library.applovin.p046b.C8782f;
import com.iab.omid.library.applovin.p048d.C8794e;
import com.iab.omid.library.applovin.p049e.C8796a;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C8799a;
import com.iab.omid.library.applovin.publisher.C8800b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
/* loaded from: classes3.dex */
public class C8773a extends AdSession {

    /* renamed from: a */
    private static final Pattern f16676a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f16677b;

    /* renamed from: c */
    private final AdSessionConfiguration f16678c;

    /* renamed from: e */
    private C8796a f16680e;

    /* renamed from: f */
    private AdSessionStatePublisher f16681f;

    /* renamed from: j */
    private boolean f16685j;

    /* renamed from: k */
    private boolean f16686k;

    /* renamed from: l */
    private PossibleObstructionListener f16687l;

    /* renamed from: d */
    private final List<C8778c> f16679d = new ArrayList();

    /* renamed from: g */
    private boolean f16682g = false;

    /* renamed from: h */
    private boolean f16683h = false;

    /* renamed from: i */
    private final String f16684i = UUID.randomUUID().toString();

    public C8773a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f16678c = adSessionConfiguration;
        this.f16677b = adSessionContext;
        m3143c(null);
        this.f16681f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8799a(adSessionContext.getWebView()) : new C8800b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f16681f.mo3003a();
        C8775a.m3126a().m3125a(this);
        this.f16681f.m3020a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C8778c m3150a(View view) {
        for (C8778c c8778c : this.f16679d) {
            if (c8778c.m3111a().get() == view) {
                return c8778c;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m3149a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f16676a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* renamed from: b */
    private static void m3145b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m3143c(View view) {
        this.f16680e = new C8796a(view);
    }

    /* renamed from: d */
    private void m3141d(View view) {
        Collection<C8773a> m3124b = C8775a.m3126a().m3124b();
        if (m3124b == null || m3124b.isEmpty()) {
            return;
        }
        for (C8773a c8773a : m3124b) {
            if (c8773a != this && c8773a.m3140e() == view) {
                c8773a.f16680e.clear();
            }
        }
    }

    /* renamed from: k */
    private void m3134k() {
        if (this.f16685j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m3133l() {
        if (this.f16686k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C8778c> m3151a() {
        return this.f16679d;
    }

    /* renamed from: a */
    public void m3148a(List<C8796a> list) {
        if (m3146b()) {
            ArrayList arrayList = new ArrayList();
            for (C8796a c8796a : list) {
                View view = c8796a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f16687l.onPossibleObstructionsDetected(this.f16684i, arrayList);
        }
    }

    /* renamed from: a */
    public void m3147a(@NonNull JSONObject jSONObject) {
        m3133l();
        getAdSessionStatePublisher().m3013a(jSONObject);
        this.f16686k = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f16683h) {
            return;
        }
        m3145b(view);
        m3149a(str);
        if (m3150a(view) == null) {
            this.f16679d.add(new C8778c(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: b */
    public boolean m3146b() {
        return this.f16687l != null;
    }

    /* renamed from: c */
    public void m3144c() {
        m3134k();
        getAdSessionStatePublisher().m3006g();
        this.f16685j = true;
    }

    /* renamed from: d */
    public void m3142d() {
        m3133l();
        getAdSessionStatePublisher().m3005h();
        this.f16686k = true;
    }

    /* renamed from: e */
    public View m3140e() {
        return this.f16680e.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f16683h) {
            throw new IllegalStateException("AdSession is finished");
        }
        C8794e.m3038a(errorType, "Error type is null");
        C8794e.m3036a(str, "Message is null");
        getAdSessionStatePublisher().m3019a(errorType, str);
    }

    /* renamed from: f */
    public boolean m3139f() {
        return this.f16682g && !this.f16683h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f16683h) {
            return;
        }
        this.f16680e.clear();
        removeAllFriendlyObstructions();
        this.f16683h = true;
        getAdSessionStatePublisher().m3007f();
        C8775a.m3126a().m3121c(this);
        getAdSessionStatePublisher().mo3000b();
        this.f16681f = null;
        this.f16687l = null;
    }

    /* renamed from: g */
    public boolean m3138g() {
        return this.f16682g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f16684i;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f16681f;
    }

    /* renamed from: h */
    public boolean m3137h() {
        return this.f16683h;
    }

    /* renamed from: i */
    public boolean m3136i() {
        return this.f16678c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean m3135j() {
        return this.f16678c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f16683h) {
            return;
        }
        C8794e.m3038a(view, "AdView is null");
        if (m3140e() == view) {
            return;
        }
        m3143c(view);
        getAdSessionStatePublisher().m3004i();
        m3141d(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f16683h) {
            return;
        }
        this.f16679d.clear();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f16683h) {
            return;
        }
        m3145b(view);
        C8778c m3150a = m3150a(view);
        if (m3150a != null) {
            this.f16679d.remove(m3150a);
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f16687l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f16682g) {
            return;
        }
        this.f16682g = true;
        C8775a.m3126a().m3123b(this);
        this.f16681f.m3023a(C8782f.m3087a().m3081d());
        this.f16681f.mo3002a(this, this.f16677b);
    }
}

package com.iab.omid.library.adcolony.adsession;

import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.motion.widget.C0561g;
import com.iab.omid.library.adcolony.p040a.C8710b;
import com.iab.omid.library.adcolony.p041b.C8728a;
import com.iab.omid.library.adcolony.p041b.C8729b;
import com.iab.omid.library.adcolony.p041b.C8731c;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p041b.C8735g;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.p044e.C8744a;
import com.iab.omid.library.adcolony.publisher.AbstractC8746a;
import com.iab.omid.library.adcolony.publisher.C8747b;
import com.iab.omid.library.adcolony.publisher.C8748c;
import com.iab.omid.library.adcolony.walking.C8751b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.l */
/* loaded from: classes3.dex */
public final class C8722l extends AbstractC8712b {

    /* renamed from: k */
    public static final /* synthetic */ int f16568k = 0;

    /* renamed from: a */
    public final C8714d f16569a;

    /* renamed from: b */
    public final C8713c f16570b;

    /* renamed from: e */
    public AbstractC8746a f16573e;

    /* renamed from: i */
    public boolean f16577i;

    /* renamed from: j */
    public boolean f16578j;

    /* renamed from: c */
    public final ArrayList f16571c = new ArrayList();

    /* renamed from: f */
    public boolean f16574f = false;

    /* renamed from: g */
    public boolean f16575g = false;

    /* renamed from: h */
    public final String f16576h = UUID.randomUUID().toString();

    /* renamed from: d */
    public C8744a f16572d = new C8744a(null);

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public C8722l(C8713c c8713c, C8714d c8714d) {
        AbstractC8746a c8747b;
        this.f16570b = c8713c;
        this.f16569a = c8714d;
        EnumC8715e enumC8715e = EnumC8715e.HTML;
        EnumC8715e enumC8715e2 = c8714d.f16541h;
        if (enumC8715e2 != enumC8715e && enumC8715e2 != EnumC8715e.JAVASCRIPT) {
            c8747b = new C8748c(Collections.unmodifiableMap(c8714d.f16537d), c8714d.f16538e);
        } else {
            c8747b = new C8747b(c8714d.f16535b);
        }
        this.f16573e = c8747b;
        c8747b.mo3168a();
        C8728a.f16591c.f16592a.add(this);
        WebView m3169f = this.f16573e.m3169f();
        JSONObject jSONObject = new JSONObject();
        C8742a.m3174c(jSONObject, "impressionOwner", c8713c.f16529a);
        C8742a.m3174c(jSONObject, "mediaEventsOwner", c8713c.f16530b);
        C8742a.m3174c(jSONObject, "creativeType", c8713c.f16532d);
        C8742a.m3174c(jSONObject, "impressionType", c8713c.f16533e);
        C8742a.m3174c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(c8713c.f16531c));
        C8734f.m3182a(m3169f, "init", jSONObject);
    }

    @Override // com.iab.omid.library.adcolony.adsession.AbstractC8712b
    /* renamed from: a */
    public final void mo3191a(View view, EnumC8717g enumC8717g) {
        if (this.f16575g) {
            return;
        }
        if (view != null) {
            if (m3190c(view) == null) {
                this.f16571c.add(new C8731c(view, enumC8717g));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    /* renamed from: c */
    public final C8731c m3190c(View view) {
        Iterator it = this.f16571c.iterator();
        while (it.hasNext()) {
            C8731c c8731c = (C8731c) it.next();
            if (c8731c.f16598a.get() == view) {
                return c8731c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m3189d(View view) {
        if (this.f16575g) {
            return;
        }
        C0561g.m12182a(view, "AdView is null");
        if (this.f16572d.get() == view) {
            return;
        }
        this.f16572d = new C8744a(view);
        AbstractC8746a abstractC8746a = this.f16573e;
        abstractC8746a.getClass();
        abstractC8746a.f16630e = System.nanoTime();
        abstractC8746a.f16629d = 1;
        Collection<C8722l> unmodifiableCollection = Collections.unmodifiableCollection(C8728a.f16591c.f16592a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (C8722l c8722l : unmodifiableCollection) {
                if (c8722l != this && c8722l.f16572d.get() == view) {
                    c8722l.f16572d.clear();
                }
            }
        }
    }

    /* renamed from: e */
    public final void m3188e() {
        boolean z;
        if (this.f16574f) {
            return;
        }
        this.f16574f = true;
        C8728a c8728a = C8728a.f16591c;
        if (c8728a.f16593b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        c8728a.f16593b.add(this);
        if (!z) {
            C8735g m3181a = C8735g.m3181a();
            m3181a.getClass();
            C8729b c8729b = C8729b.f16594d;
            c8729b.f16597c = m3181a;
            c8729b.f16595a = true;
            c8729b.f16596b = false;
            c8729b.m3183b();
            C8751b.f16637h.getClass();
            C8751b.m3165a();
            C8710b c8710b = m3181a.f16610d;
            c8710b.f16527e = c8710b.m3197a();
            c8710b.m3196b();
            c8710b.f16523a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c8710b);
        }
        C8734f.m3182a(this.f16573e.m3169f(), "setDeviceVolume", Float.valueOf(C8735g.m3181a().f16607a));
        this.f16573e.mo3167b(this, this.f16569a);
    }
}

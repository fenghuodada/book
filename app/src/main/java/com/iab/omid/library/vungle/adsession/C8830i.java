package com.iab.omid.library.vungle.adsession;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import androidx.transition.AbstractC1750f;
import com.iab.omid.library.vungle.p051a.C8820c;
import com.iab.omid.library.vungle.p052b.C8832a;
import com.iab.omid.library.vungle.p052b.C8833b;
import com.iab.omid.library.vungle.p052b.C8838f;
import com.iab.omid.library.vungle.p052b.C8839g;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.p055e.C8848a;
import com.iab.omid.library.vungle.publisher.AbstractC8850a;
import com.iab.omid.library.vungle.publisher.C8851b;
import com.iab.omid.library.vungle.publisher.C8852c;
import com.iab.omid.library.vungle.walking.C8855b;
import com.iab.omid.library.vungle.walking.RunnableC8854a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.adsession.i */
/* loaded from: classes3.dex */
public final class C8830i extends AbstractC1750f {

    /* renamed from: a */
    public final C8823b f16821a;

    /* renamed from: d */
    public AbstractC8850a f16824d;

    /* renamed from: b */
    public final ArrayList f16822b = new ArrayList();

    /* renamed from: e */
    public boolean f16825e = false;

    /* renamed from: f */
    public boolean f16826f = false;

    /* renamed from: g */
    public final String f16827g = UUID.randomUUID().toString();

    /* renamed from: c */
    public C8848a f16823c = new C8848a(null);

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public C8830i(C8822a c8822a, C8823b c8823b) {
        AbstractC8850a c8851b;
        this.f16821a = c8823b;
        EnumC8824c enumC8824c = EnumC8824c.HTML;
        EnumC8824c enumC8824c2 = c8823b.f16805h;
        if (enumC8824c2 != enumC8824c && enumC8824c2 != EnumC8824c.JAVASCRIPT) {
            c8851b = new C8852c(Collections.unmodifiableMap(c8823b.f16801d), c8823b.f16802e);
        } else {
            c8851b = new C8851b(c8823b.f16799b);
        }
        this.f16824d = c8851b;
        c8851b.mo2926a();
        C8832a.f16829c.f16830a.add(this);
        WebView m2927e = this.f16824d.m2927e();
        JSONObject jSONObject = new JSONObject();
        C8846a.m2931c(jSONObject, "impressionOwner", c8822a.f16793a);
        C8846a.m2931c(jSONObject, "mediaEventsOwner", c8822a.f16794b);
        C8846a.m2931c(jSONObject, "creativeType", c8822a.f16796d);
        C8846a.m2931c(jSONObject, "impressionType", c8822a.f16797e);
        C8846a.m2931c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(c8822a.f16795c));
        C8838f.m2937a(m2927e, "init", jSONObject);
    }

    /* renamed from: b */
    public final void m2942b() {
        boolean z;
        if (this.f16826f) {
            return;
        }
        this.f16823c.clear();
        if (!this.f16826f) {
            this.f16822b.clear();
        }
        boolean z2 = true;
        this.f16826f = true;
        C8838f.m2937a(this.f16824d.m2927e(), "finishSession", new Object[0]);
        C8832a c8832a = C8832a.f16829c;
        if (c8832a.f16831b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        c8832a.f16830a.remove(this);
        ArrayList<C8830i> arrayList = c8832a.f16831b;
        arrayList.remove(this);
        if (z) {
            if (arrayList.size() <= 0) {
                z2 = false;
            }
            if (!z2) {
                C8839g m2936a = C8839g.m2936a();
                m2936a.getClass();
                C8855b c8855b = C8855b.f16863g;
                c8855b.getClass();
                Handler handler = C8855b.f16865i;
                if (handler != null) {
                    handler.removeCallbacks(C8855b.f16867k);
                    C8855b.f16865i = null;
                }
                c8855b.f16868a.clear();
                C8855b.f16864h.post(new RunnableC8854a(c8855b));
                C8833b c8833b = C8833b.f16832d;
                c8833b.f16833a = false;
                c8833b.f16834b = false;
                c8833b.f16835c = null;
                C8820c c8820c = m2936a.f16844d;
                c8820c.f16788a.getContentResolver().unregisterContentObserver(c8820c);
            }
        }
        this.f16824d.mo2924d();
        this.f16824d = null;
    }

    /* renamed from: c */
    public final void m2941c(View view) {
        if (this.f16826f) {
            return;
        }
        if (view != null) {
            if (this.f16823c.get() == view) {
                return;
            }
            this.f16823c = new C8848a(view);
            AbstractC8850a abstractC8850a = this.f16824d;
            abstractC8850a.getClass();
            abstractC8850a.f16856c = System.nanoTime();
            abstractC8850a.f16855b = 1;
            Collection<C8830i> unmodifiableCollection = Collections.unmodifiableCollection(C8832a.f16829c.f16830a);
            if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                for (C8830i c8830i : unmodifiableCollection) {
                    if (c8830i != this && c8830i.f16823c.get() == view) {
                        c8830i.f16823c.clear();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("AdView is null");
    }

    /* renamed from: d */
    public final void m2940d() {
        boolean z;
        if (this.f16825e) {
            return;
        }
        this.f16825e = true;
        C8832a c8832a = C8832a.f16829c;
        if (c8832a.f16831b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        c8832a.f16831b.add(this);
        if (!z) {
            C8839g m2936a = C8839g.m2936a();
            m2936a.getClass();
            C8833b c8833b = C8833b.f16832d;
            c8833b.f16835c = m2936a;
            c8833b.f16833a = true;
            c8833b.f16834b = false;
            c8833b.m2938b();
            C8855b.f16863g.getClass();
            C8855b.m2923a();
            C8820c c8820c = m2936a.f16844d;
            c8820c.f16792e = c8820c.m2944a();
            c8820c.m2943b();
            c8820c.f16788a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c8820c);
        }
        C8838f.m2937a(this.f16824d.m2927e(), "setDeviceVolume", Float.valueOf(C8839g.m2936a().f16841a));
        this.f16824d.mo2925b(this, this.f16821a);
    }
}

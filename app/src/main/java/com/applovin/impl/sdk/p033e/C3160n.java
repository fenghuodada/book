package com.applovin.impl.sdk.p033e;

import android.app.Activity;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3127e;
import com.applovin.impl.sdk.C3199j;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.C3333k;
import com.applovin.impl.sdk.utils.C3339p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.n */
/* loaded from: classes.dex */
public class C3160n extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C3214m f8235a;

    public C3160n(C3214m c3214m) {
        super("TaskInitializeSdk", c3214m);
        this.f8235a = c3214m;
    }

    /* renamed from: a */
    private void m7625a() {
        if (this.f8235a.m7484D().m8190a()) {
            return;
        }
        Activity m7426an = this.f8235a.m7426an();
        if (m7426an != null) {
            this.f8235a.m7484D().m8189a(m7426an);
        } else {
            this.f8235a.m7469S().m7619a(new C3189z(this.f8235a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    C3160n.this.f8235a.m7484D().m8189a(C3160n.this.f8235a.m7434af().m8070a());
                }
            }), C3163o.EnumC3165a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    /* renamed from: b */
    private void m7623b() {
        String str;
        if (!this.f8235a.m7409e()) {
            boolean m7797d = this.f8235a.m7477K().m7797d();
            if (m7797d) {
                str = C0484a.m12392a(new StringBuilder(), this.f8235a.m7466V().m7129k().f8637b, " (use this for test devices)");
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            Map<String, Object> m7136d = this.f8235a.m7466V().m7136d();
            Map<String, Object> m7137c = this.f8235a.m7466V().m7137c();
            C3333k c3333k = new C3333k();
            c3333k.m6939a().m6933a("=====AppLovin SDK=====");
            c3333k.m6933a("===SDK Versions===").m6932a("Version", AppLovinSdk.VERSION).m6932a("Plugin Version", this.f8235a.m7456a(C3109b.f8004dz)).m6932a("Ad Review Version", C3127e.m7713a()).m6932a("OM SDK Version", this.f8235a.m7428al().m8049c());
            c3333k.m6933a("===Device Info===").m6932a("OS", Utils.getAndroidOSInfo()).m6932a("GAID", str).m6932a("Model", m7136d.get("model")).m6932a("Locale", m7136d.get("locale")).m6932a("Emulator", m7136d.get("sim")).m6932a("Tablet", m7136d.get("is_tablet"));
            c3333k.m6933a("===App Info===").m6932a("Application ID", m7137c.get("package_name")).m6932a("Target SDK", m7137c.get("target_sdk")).m6932a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
            c3333k.m6933a("===SDK Settings===").m6932a("SDK Key", this.f8235a.m7386z()).m6932a("Mediation Provider", this.f8235a.m7392t()).m6932a("TG", C3339p.m6895a(this.f8235a)).m6932a("Test Mode On", Boolean.valueOf(this.f8235a.m7478J().m8198a())).m6932a("Verbose Logging On", Boolean.valueOf(m7797d));
            c3333k.m6933a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").m6933a(C3199j.m7524a(m7698f()));
            c3333k.m6939a();
            C3349v.m6849f("AppLovinSdk", c3333k.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0148, code lost:
        if (r12.f8235a.m7411d() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a4, code lost:
        if (r12.f8235a.m7411d() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a7, code lost:
        r2 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a8, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        m7705a(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c0, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p033e.C3160n.run():void");
    }
}

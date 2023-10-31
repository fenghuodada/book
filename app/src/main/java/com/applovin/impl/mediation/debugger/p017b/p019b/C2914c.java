package com.applovin.impl.mediation.debugger.p017b.p019b;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.C3290d;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.c */
/* loaded from: classes.dex */
public class C2914c {

    /* renamed from: a */
    private final boolean f7116a;

    /* renamed from: b */
    private final boolean f7117b;

    /* renamed from: c */
    private final boolean f7118c;

    /* renamed from: d */
    private final String f7119d;

    public C2914c(JSONObject jSONObject, C3214m c3214m) {
        this.f7116a = C3290d.m7036a(c3214m.m7476L()).m7037a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 == null) {
            this.f7117b = false;
            this.f7119d = "";
            this.f7118c = C3295h.m7016a();
            return;
        }
        this.f7117b = true;
        this.f7119d = JsonUtils.getString(jSONObject2, "description", "");
        if (C3295h.m7016a()) {
            this.f7118c = true;
            return;
        }
        List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!C3295h.m7011a((String) it.next())) {
                    break;
                }
            }
        }
        this.f7118c = z;
    }

    /* renamed from: a */
    public boolean m8365a() {
        return this.f7117b;
    }

    /* renamed from: b */
    public boolean m8364b() {
        boolean z = this.f7118c;
        return z && (this.f7116a || z);
    }

    /* renamed from: c */
    public String m8363c() {
        return this.f7116a ? this.f7119d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}

package com.adcolony.sdk;

import androidx.constraintlayout.core.C0499a;
import androidx.datastore.preferences.protobuf.C1169e;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.e2 */
/* loaded from: classes.dex */
public final class C2100e2 {

    /* renamed from: a */
    public final String f5097a;

    /* renamed from: b */
    public C2367y1 f5098b;

    public C2100e2(int i, C2367y1 c2367y1, String str) {
        try {
            this.f5097a = str;
            c2367y1 = c2367y1 == null ? new C2367y1() : c2367y1;
            this.f5098b = c2367y1;
            c2367y1.m9451h(i, "m_target");
        } catch (JSONException e) {
            C1169e.m11129c("JSON Error in ADCMessage constructor: " + e.toString(), 0, 0, true);
        }
    }

    /* renamed from: a */
    public final C2100e2 m9641a(C2367y1 c2367y1) {
        try {
            C2100e2 c2100e2 = new C2100e2(this.f5098b.m9452g("m_origin"), c2367y1, "reply");
            c2100e2.f5098b.m9451h(this.f5098b.m9452g("m_id"), "m_id");
            return c2100e2;
        } catch (JSONException e) {
            C2201m0.m9588d().m9689n().m9706d("JSON error in ADCMessage's createReply(): " + e.toString(), 0, 0, true);
            return new C2100e2("JSONException", 0);
        }
    }

    /* renamed from: b */
    public final void m9640b() {
        C2367y1 c2367y1 = this.f5098b;
        if (c2367y1 == null) {
            c2367y1 = new C2367y1();
        }
        C2080d1.m9660h(c2367y1, "m_type", this.f5097a);
        C2201m0.m9588d().m9688o().m9629e(c2367y1);
    }

    public C2100e2(C2367y1 c2367y1) {
        if (c2367y1 == null) {
            try {
                c2367y1 = new C2367y1();
            } catch (JSONException e) {
                StringBuilder m12383b = C0499a.m12383b("JSON Error in ADCMessage constructor: ");
                m12383b.append(e.toString());
                C1169e.m11129c(m12383b.toString(), 0, 0, true);
                return;
            }
        }
        this.f5098b = c2367y1;
        this.f5097a = c2367y1.m9446m("m_type");
    }

    public C2100e2(String str, int i) {
        try {
            this.f5097a = str;
            C2367y1 c2367y1 = new C2367y1();
            this.f5098b = c2367y1;
            c2367y1.m9451h(i, "m_target");
        } catch (JSONException e) {
            C1169e.m11129c("JSON Error in ADCMessage constructor: " + e.toString(), 0, 0, true);
        }
    }
}

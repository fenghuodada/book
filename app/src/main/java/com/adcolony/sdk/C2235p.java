package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.p */
/* loaded from: classes.dex */
public final class C2235p {

    /* renamed from: a */
    public static final List<C2367y1> f5450a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public static boolean m9535a() {
        boolean z;
        List<C2367y1> list = f5450a;
        synchronized (list) {
            z = list.size() != 0;
        }
        return z;
    }

    /* renamed from: b */
    public static void m9534b() {
        C2058b3 m9588d = C2201m0.m9588d();
        m9588d.getClass();
        if (!C2058b3.f4958Z.equals("") && m9588d.f4962D.f5701a) {
            List<C2367y1> list = f5450a;
            synchronized (list) {
                for (C2367y1 c2367y1 : list) {
                    m9533c(c2367y1);
                }
                f5450a.clear();
            }
        }
    }

    /* renamed from: c */
    public static void m9533c(C2367y1 c2367y1) {
        String str;
        C2058b3 m9588d = C2201m0.m9588d();
        m9588d.getClass();
        if (!C2058b3.f4958Z.equals("") && m9588d.f4962D.f5701a) {
            C2367y1 m9439t = c2367y1.m9439t("payload");
            if (C2240p3.f5458F) {
                str = "bb2cf0647ba654d7228dd3f9405bbc6a";
            } else {
                C2201m0.m9588d().getClass();
                str = C2058b3.f4958Z;
            }
            C2080d1.m9660h(m9439t, "api_key", str);
            try {
                c2367y1.m9435x("payload");
                c2367y1.m9456c(m9439t, "payload");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            new C2100e2(1, c2367y1, "AdColony.log_event").m9640b();
            return;
        }
        List<C2367y1> list = f5450a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(c2367y1);
            }
        }
    }
}

package com.adcolony.sdk;

import androidx.constraintlayout.core.C0510h;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.z3 */
/* loaded from: classes.dex */
public final class C2378z3 {

    /* renamed from: a */
    public final int f5702a;

    /* renamed from: b */
    public final ArrayList f5703b = new ArrayList();

    /* renamed from: com.adcolony.sdk.z3$a */
    /* loaded from: classes.dex */
    public static class C2379a {

        /* renamed from: a */
        public final String f5704a;

        /* renamed from: b */
        public final String f5705b;

        /* renamed from: c */
        public final int f5706c;

        /* renamed from: d */
        public final String[] f5707d;

        /* renamed from: e */
        public final String[] f5708e;

        /* renamed from: f */
        public final ArrayList f5709f = new ArrayList();

        /* renamed from: g */
        public final ArrayList f5710g = new ArrayList();

        /* renamed from: h */
        public final C2382d f5711h;

        /* renamed from: i */
        public final HashMap f5712i;

        public C2379a(C2367y1 c2367y1) throws JSONException {
            String[] strArr;
            String[] strArr2;
            C2382d c2382d;
            this.f5704a = c2367y1.m9446m("stream");
            this.f5705b = c2367y1.m9446m("table_name");
            this.f5706c = c2367y1.m9458a("max_rows", 10000);
            C2328v1 m9440s = c2367y1.m9440s("event_types");
            if (m9440s != null) {
                strArr = C2080d1.m9658j(m9440s);
            } else {
                strArr = new String[0];
            }
            this.f5707d = strArr;
            C2328v1 m9440s2 = c2367y1.m9440s("request_types");
            if (m9440s2 != null) {
                strArr2 = C2080d1.m9658j(m9440s2);
            } else {
                strArr2 = new String[0];
            }
            this.f5708e = strArr2;
            for (C2367y1 c2367y12 : c2367y1.m9448k("columns").m9481f()) {
                this.f5709f.add(new C2380b(c2367y12));
            }
            for (C2367y1 c2367y13 : c2367y1.m9448k("indexes").m9481f()) {
                this.f5710g.add(new C2381c(c2367y13, this.f5705b));
            }
            C2367y1 m9438u = c2367y1.m9438u("ttl");
            if (m9438u != null) {
                c2382d = new C2382d(m9438u);
            } else {
                c2382d = null;
            }
            this.f5711h = c2382d;
            this.f5712i = c2367y1.m9439t("queries").m9445n();
        }
    }

    /* renamed from: com.adcolony.sdk.z3$b */
    /* loaded from: classes.dex */
    public static class C2380b {

        /* renamed from: a */
        public final String f5713a;

        /* renamed from: b */
        public final String f5714b;

        /* renamed from: c */
        public final Object f5715c;

        public C2380b(C2367y1 c2367y1) throws JSONException {
            this.f5713a = c2367y1.m9446m("name");
            this.f5714b = c2367y1.m9446m("type");
            this.f5715c = c2367y1.m9437v("default");
        }
    }

    /* renamed from: com.adcolony.sdk.z3$c */
    /* loaded from: classes.dex */
    public static class C2381c {

        /* renamed from: a */
        public final String f5716a;

        /* renamed from: b */
        public final String[] f5717b;

        public C2381c(C2367y1 c2367y1, String str) throws JSONException {
            StringBuilder m12339b = C0510h.m12339b(str, "_");
            m12339b.append(c2367y1.m9446m("name"));
            this.f5716a = m12339b.toString();
            this.f5717b = C2080d1.m9658j(c2367y1.m9448k("columns"));
        }
    }

    /* renamed from: com.adcolony.sdk.z3$d */
    /* loaded from: classes.dex */
    public static class C2382d {

        /* renamed from: a */
        public final long f5718a;

        /* renamed from: b */
        public final String f5719b;

        public C2382d(C2367y1 c2367y1) throws JSONException {
            long j;
            synchronized (c2367y1.f5690a) {
                j = c2367y1.f5690a.getLong("seconds");
            }
            this.f5718a = j;
            this.f5719b = c2367y1.m9446m("column");
        }
    }

    public C2378z3(C2367y1 c2367y1) throws JSONException {
        this.f5702a = c2367y1.m9452g(MediationMetaData.KEY_VERSION);
        for (C2367y1 c2367y12 : c2367y1.m9448k("streams").m9481f()) {
            this.f5703b.add(new C2379a(c2367y12));
        }
    }
}

package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.device.C9509f;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.InterfaceC9558d;
import com.unity3d.services.core.properties.C9572d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.e */
/* loaded from: classes3.dex */
public class C9598e {

    /* renamed from: a */
    private final String f19027a;

    /* renamed from: b */
    private final String f19028b;

    /* renamed from: c */
    private final String f19029c;

    /* renamed from: d */
    private final String f19030d;

    /* renamed from: e */
    private final boolean f19031e;

    /* renamed from: f */
    private String f19032f;

    /* renamed from: g */
    private String f19033g;

    /* renamed from: h */
    private String f19034h;

    /* renamed from: i */
    private String f19035i;

    /* renamed from: j */
    private String f19036j;

    /* renamed from: k */
    private Map<String, String> f19037k;

    /* renamed from: l */
    private final InterfaceC9558d<PrivacyConfig> f19038l;

    /* renamed from: com.unity3d.services.core.request.metrics.e$a */
    /* loaded from: classes3.dex */
    public class C9599a implements InterfaceC9558d<PrivacyConfig> {
        public C9599a() {
        }

        @Override // com.unity3d.services.core.misc.InterfaceC9558d
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo1849a(PrivacyConfig privacyConfig) {
            C9598e.this.f19035i = privacyConfig.getPrivacyStatus().toString().toLowerCase();
        }
    }

    public C9598e() {
        C9599a c9599a = new C9599a();
        this.f19038l = c9599a;
        this.f19027a = C9498b.m2106y();
        this.f19028b = "android";
        this.f19029c = C9572d.m1925o();
        this.f19030d = C9498b.m2163G();
        this.f19035i = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        this.f19031e = C9572d.m1921s();
        PrivacyConfigStorage.getInstance().registerObserver(c9599a);
    }

    /* renamed from: b */
    private boolean m1853b() {
        String str = this.f19032f;
        return str == null || str.isEmpty();
    }

    /* renamed from: c */
    private void m1852c() {
        try {
            C9509f m2085a = C9512i.m2085a(C9512i.EnumC9513a.PUBLIC);
            if (m2085a == null || !m2085a.m2090c()) {
                return;
            }
            this.f19032f = (String) m2085a.get("mediation.name.value");
            this.f19033g = (String) m2085a.get("mediation.version.value");
            this.f19034h = (String) m2085a.get("mediation.adapter_version.value");
        } catch (Exception e) {
            C9549a.m2022a("Failed to refreshMediationData: %s", e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public Map<String, String> m1856a() {
        if (m1853b()) {
            m1852c();
        }
        HashMap hashMap = new HashMap();
        String str = this.f19027a;
        if (str != null) {
            hashMap.put("iso", str);
        }
        String str2 = this.f19028b;
        if (str2 != null) {
            hashMap.put("plt", str2);
        }
        if (this.f19027a != null) {
            hashMap.put("sdk", this.f19029c);
        }
        String str3 = this.f19030d;
        if (str3 != null) {
            hashMap.put("system", str3);
        }
        String str4 = this.f19035i;
        if (str4 != null) {
            hashMap.put("prvc", str4);
        }
        String str5 = this.f19036j;
        if (str5 != null) {
            hashMap.put("src", str5);
        }
        String str6 = this.f19032f;
        if (str6 != null) {
            hashMap.put("m_name", str6);
        }
        String str7 = this.f19033g;
        if (str7 != null) {
            hashMap.put("m_ver", str7);
        }
        String str8 = this.f19034h;
        if (str8 != null) {
            hashMap.put("m_ad_ver", str8);
        }
        Map<String, String> map = this.f19037k;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("tm", String.valueOf(this.f19031e));
        return hashMap;
    }

    /* renamed from: a */
    public void m1855a(Configuration configuration) {
        this.f19036j = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this.f19037k = configuration.getExperiments().getExperimentTags();
        }
    }

    /* renamed from: d */
    public void m1851d() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this.f19038l);
    }
}

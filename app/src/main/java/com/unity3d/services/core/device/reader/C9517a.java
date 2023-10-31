package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C9509f;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.device.reader.pii.C9535b;
import com.unity3d.services.core.device.reader.pii.C9536c;
import com.unity3d.services.core.device.reader.pii.C9541f;
import com.unity3d.services.core.lifecycle.C9543a;
import com.unity3d.services.core.misc.C9560f;
import com.unity3d.services.core.misc.C9562h;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.unity3d.services.core.device.reader.a */
/* loaded from: classes3.dex */
public class C9517a {

    /* renamed from: a */
    private final ConfigurationReader f18843a;

    /* renamed from: b */
    private PrivacyConfigStorage f18844b;

    public C9517a(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        this.f18843a = configurationReader;
        this.f18844b = privacyConfigStorage;
    }

    /* renamed from: b */
    private Experiments m2072b() {
        ConfigurationReader configurationReader = this.f18843a;
        return (configurationReader == null || configurationReader.getCurrentConfiguration() == null) ? new Experiments() : this.f18843a.getCurrentConfiguration().getExperiments();
    }

    /* renamed from: c */
    private C9560f m2071c() {
        return new C9560f(Arrays.asList("privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", "unifiedconfig"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }

    /* renamed from: a */
    public InterfaceC9533p mo2063a() {
        C9509f m2085a = C9512i.m2085a(C9512i.EnumC9513a.PRIVATE);
        C9509f m2085a2 = C9512i.m2085a(C9512i.EnumC9513a.PUBLIC);
        C9562h c9562h = new C9562h(Arrays.asList(m2085a2, m2085a));
        C9521e c9521e = new C9521e(m2085a);
        C9530m c9530m = new C9530m(new C9524h(new C9520d(m2073a(InitRequestType.TOKEN)), C9543a.m2036a()), m2071c(), m2085a, m2085a2);
        C9541f c9541f = new C9541f(c9562h);
        return new C9525i(new C9523g((this.f18844b == null || !m2072b().isPrivacyRequestEnabled()) ? new C9526j(c9530m, new C9536c(c9541f, m2085a, m2072b()), new C9535b()) : new C9528k(c9530m, this.f18844b, new C9535b(), c9541f), c9521e.m2065a()));
    }

    /* renamed from: a */
    public InterfaceC9533p m2073a(InitRequestType initRequestType) {
        return new C9529l(new C9542q(), initRequestType);
    }
}

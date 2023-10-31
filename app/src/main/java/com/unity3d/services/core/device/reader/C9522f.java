package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C9509f;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.misc.C9560f;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.unity3d.services.core.device.reader.f */
/* loaded from: classes3.dex */
public class C9522f extends C9517a {
    public C9522f(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        super(configurationReader, privacyConfigStorage);
    }

    /* renamed from: d */
    private C9560f m2062d() {
        return new C9560f(Arrays.asList("privacy", "gdpr", "unity", "pipl"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "mode"));
    }

    @Override // com.unity3d.services.core.device.reader.C9517a
    /* renamed from: a */
    public InterfaceC9533p mo2063a() {
        C9509f m2085a = C9512i.m2085a(C9512i.EnumC9513a.PRIVATE);
        return new C9523g(new C9530m(m2073a(InitRequestType.PRIVACY), m2062d(), m2085a, C9512i.m2085a(C9512i.EnumC9513a.PUBLIC)), new C9521e(m2085a).m2065a());
    }
}

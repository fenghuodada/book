package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.C9535b;
import com.unity3d.services.core.device.reader.pii.C9541f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.k */
/* loaded from: classes3.dex */
public class C9528k implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18861a;

    /* renamed from: b */
    private final PrivacyConfigStorage f18862b;

    /* renamed from: c */
    private final C9535b f18863c;

    /* renamed from: d */
    private final C9541f f18864d;

    public C9528k(InterfaceC9533p interfaceC9533p, PrivacyConfigStorage privacyConfigStorage, C9535b c9535b, C9541f c9541f) {
        this.f18861a = interfaceC9533p;
        this.f18862b = privacyConfigStorage;
        this.f18863c = c9535b;
        this.f18864d = c9541f;
    }

    /* renamed from: b */
    private Map<String, Object> m2058b() {
        HashMap hashMap = new HashMap();
        String m2055a = this.f18863c.m2055a();
        if (m2055a != null) {
            hashMap.put("unifiedconfig.pii.advertisingTrackingId", m2055a);
        }
        hashMap.put("user.nonBehavioral", Boolean.valueOf(this.f18864d.m2039c()));
        return hashMap;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18861a.mo2037a();
        PrivacyConfigStorage privacyConfigStorage = this.f18862b;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null && this.f18862b.getPrivacyConfig().allowedToSendPii()) {
            mo2037a.putAll(m2058b());
        }
        return mo2037a;
    }
}

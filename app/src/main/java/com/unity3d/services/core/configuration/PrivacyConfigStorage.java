package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.AbstractC9563i;
import com.unity3d.services.core.misc.InterfaceC9558d;

/* loaded from: classes3.dex */
public class PrivacyConfigStorage extends AbstractC9563i<PrivacyConfig> {

    /* renamed from: b */
    private static PrivacyConfigStorage f18769b;

    /* renamed from: c */
    private PrivacyConfig f18770c = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (f18769b == null) {
            f18769b = new PrivacyConfigStorage();
        }
        return f18769b;
    }

    public synchronized PrivacyConfig getPrivacyConfig() {
        return this.f18770c;
    }

    @Override // com.unity3d.services.core.misc.AbstractC9563i
    public synchronized void registerObserver(InterfaceC9558d<PrivacyConfig> interfaceC9558d) {
        super.registerObserver(interfaceC9558d);
        if (this.f18770c.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
            interfaceC9558d.mo1849a(this.f18770c);
        }
    }

    public synchronized void setPrivacyConfig(PrivacyConfig privacyConfig) {
        this.f18770c = privacyConfig;
        m1995a(privacyConfig);
    }
}

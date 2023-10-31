package com.unity3d.services.store.core.configuration;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.store.core.api.Store;

/* loaded from: classes3.dex */
public class StoreModuleConfiguration implements IModuleConfiguration {

    /* renamed from: a */
    private static final Class[] f19199a = {Store.class};

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return f19199a;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initModuleState(Configuration configuration) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        return true;
    }
}

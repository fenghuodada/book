package com.unity3d.services.analytics.core.configuration;

import com.unity3d.services.analytics.core.api.Analytics;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IModuleConfiguration;

/* loaded from: classes3.dex */
public class AnalyticsModuleConfiguration implements IModuleConfiguration {

    /* renamed from: a */
    private static final Class[] f18455a = {Analytics.class};

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return f18455a;
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

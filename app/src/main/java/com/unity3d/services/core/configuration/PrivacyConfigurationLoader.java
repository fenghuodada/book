package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.C9583h;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PrivacyConfigurationLoader implements IConfigurationLoader {

    /* renamed from: a */
    private final IConfigurationLoader f18771a;

    /* renamed from: b */
    private final ConfigurationRequestFactory f18772b;

    /* renamed from: c */
    private final PrivacyConfigStorage f18773c;

    /* renamed from: com.unity3d.services.core.configuration.PrivacyConfigurationLoader$a */
    /* loaded from: classes3.dex */
    public class C9485a implements IPrivacyConfigurationListener {
        public C9485a() {
        }

        @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
        public void onError(String str) {
            C9549a.m2014e("Couldn't fetch privacy configuration: " + str);
            PrivacyConfigurationLoader.this.f18773c.setPrivacyConfig(new PrivacyConfig());
        }

        @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
        public void onSuccess(PrivacyConfig privacyConfig) {
            PrivacyConfigurationLoader.this.f18773c.setPrivacyConfig(privacyConfig);
        }
    }

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader, ConfigurationRequestFactory configurationRequestFactory, PrivacyConfigStorage privacyConfigStorage) {
        this.f18771a = iConfigurationLoader;
        this.f18772b = configurationRequestFactory;
        this.f18773c = privacyConfigStorage;
    }

    /* renamed from: a */
    private void m2196a(IPrivacyConfigurationListener iPrivacyConfigurationListener) throws Exception {
        try {
            C9583h webRequest = this.f18772b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            String m1885n = webRequest.m1885n();
            try {
                if (webRequest.m1889j() / 100 == 2) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new PrivacyConfig(new JSONObject(m1885n)));
                } else {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    iPrivacyConfigurationListener.onError("Privacy request failed with code: " + webRequest.m1889j());
                }
            } catch (Exception unused) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iPrivacyConfigurationListener.onError("Could not create web request: " + e);
        }
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this.f18771a.getLocalConfiguration();
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        if (this.f18773c.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            m2196a(new C9485a());
        }
        this.f18771a.loadConfiguration(iConfigurationLoaderListener);
    }
}

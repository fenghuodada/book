package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.C9583h;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigurationLoader implements IConfigurationLoader {

    /* renamed from: a */
    private final Configuration f18671a;

    /* renamed from: b */
    private final ConfigurationRequestFactory f18672b;

    public ConfigurationLoader(ConfigurationRequestFactory configurationRequestFactory) {
        this.f18671a = configurationRequestFactory.getConfiguration();
        this.f18672b = configurationRequestFactory;
    }

    /* renamed from: a */
    private void m2222a(String str, String str2) {
        if (this.f18671a.getExperiments() == null || !this.f18671a.getExperiments().isTwoStageInitializationEnabled()) {
            return;
        }
        if (str == null || str.isEmpty()) {
            C9604i.m1839a().sendMetric(C9606j.m1814e());
        }
        if (str2 == null || str2.isEmpty()) {
            C9604i.m1839a().sendMetric(C9606j.m1818d());
        }
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this.f18671a;
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        try {
            C9583h webRequest = this.f18672b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didConfigRequestStart();
            String m1885n = webRequest.m1885n();
            if (!(webRequest.m1889j() / 100 == 2)) {
                iConfigurationLoaderListener.onError("Non 2xx HTTP status received from ads configuration request.");
                return;
            }
            try {
                this.f18671a.m2225a(new JSONObject(m1885n), true);
                m2222a(this.f18671a.getUnifiedAuctionToken(), this.f18671a.getStateId());
                iConfigurationLoaderListener.onSuccess(this.f18671a);
            } catch (Exception unused) {
                iConfigurationLoaderListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iConfigurationLoaderListener.onError("Could not create web request: " + e);
        }
    }
}

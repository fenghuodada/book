package com.unity3d.services.core.configuration;

import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.device.reader.C9518b;
import com.unity3d.services.core.device.reader.C9519c;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.C9583h;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ConfigurationRequestFactory {

    /* renamed from: a */
    private final Configuration f18674a;

    /* renamed from: b */
    private final C9517a f18675b;

    public ConfigurationRequestFactory(Configuration configuration, C9517a c9517a) {
        this.f18674a = configuration;
        this.f18675b = c9517a;
    }

    public Configuration getConfiguration() {
        return this.f18674a;
    }

    public C9583h getWebRequest() throws MalformedURLException {
        C9583h c9583h;
        String configUrl = this.f18674a.getConfigUrl();
        if (configUrl != null) {
            StringBuilder sb = new StringBuilder(configUrl);
            Experiments experiments = this.f18674a.getExperiments();
            if (experiments == null || !experiments.isTwoStageInitializationEnabled()) {
                sb.append("?ts=");
                sb.append(System.currentTimeMillis());
                sb.append("&sdkVersion=");
                sb.append(C9572d.m1926n());
                sb.append("&sdkVersionName=");
                sb.append(C9572d.m1925o());
                sb.append("&gameId=");
                sb.append(C9568a.m1958f());
                c9583h = new C9583h(sb.toString(), "GET");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
                c9583h = new C9583h(sb.toString(), "POST", hashMap);
                c9583h.m1898a(new C9519c(new C9518b(this.f18675b.mo2063a())).m2068c());
            }
            C9549a.m2019b("Requesting configuration with: " + ((Object) sb));
            return c9583h;
        }
        throw new MalformedURLException("Base URL is null");
    }
}

package com.unity3d.services.core.webview;

import androidx.activity.result.C0063d;
import androidx.constraintlayout.core.C0499a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.metrics.C9604i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.unity3d.services.core.webview.c */
/* loaded from: classes3.dex */
public class C9646c {

    /* renamed from: a */
    private final String f19160a;

    public C9646c(String str, Configuration configuration) {
        StringBuilder m12383b = C0499a.m12383b("?platform=android" + m1732a("origin", configuration.getWebViewUrl()));
        m12383b.append(m1732a(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion()));
        String sb = m12383b.toString();
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            StringBuilder m12383b2 = C0499a.m12383b(sb);
            m12383b2.append(m1732a("experiments", configuration.getExperiments().getExperimentData().toString()));
            sb = m12383b2.toString();
        }
        StringBuilder m12383b3 = C0499a.m12383b(sb);
        m12383b3.append(m1732a("isNativeCollectingMetrics", String.valueOf(C9604i.m1839a().mo1836a())));
        this.f19160a = C0063d.m13053a(str, m12383b3.toString());
    }

    /* renamed from: a */
    private String m1732a(String str, String str2) {
        if (str2 != null) {
            try {
                return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                C9549a.m2023a(String.format("Unsupported charset when encoding %s", str), e);
            }
        }
        return "";
    }

    /* renamed from: a */
    public String m1733a() {
        return this.f19160a;
    }
}

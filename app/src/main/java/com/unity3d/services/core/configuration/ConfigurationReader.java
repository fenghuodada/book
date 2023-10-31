package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.webview.C9620a;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigurationReader {

    /* renamed from: a */
    private Configuration f18673a;

    /* renamed from: a */
    private Configuration m2221a() {
        Configuration configuration = this.f18673a;
        if (configuration != null) {
            return configuration;
        }
        File file = new File(C9572d.m1929k());
        if (file.exists()) {
            try {
                this.f18673a = new Configuration(new JSONObject(new String(C9564j.m1994a(file))));
            } catch (IOException | JSONException unused) {
                C9549a.m2019b("Unable to read configuration from storage");
                this.f18673a = null;
            }
        }
        return this.f18673a;
    }

    /* renamed from: b */
    private Configuration m2220b() {
        if (C9620a.m1774c() == null) {
            return null;
        }
        return C9620a.m1774c().m1780b();
    }

    public Configuration getCurrentConfiguration() {
        return m2220b() != null ? m2220b() : m2221a();
    }
}

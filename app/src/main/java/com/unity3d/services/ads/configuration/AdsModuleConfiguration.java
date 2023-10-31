package com.unity3d.services.ads.configuration;

import android.os.ConditionVariable;
import com.unity3d.services.ads.C9293a;
import com.unity3d.services.ads.adunit.C9297d;
import com.unity3d.services.ads.adunit.C9301h;
import com.unity3d.services.ads.adunit.C9302i;
import com.unity3d.services.ads.adunit.C9303j;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.api.GMAScar;
import com.unity3d.services.ads.api.Load;
import com.unity3d.services.ads.api.Show;
import com.unity3d.services.ads.api.Token;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.api.WebPlayer;
import com.unity3d.services.ads.token.C9383a;
import com.unity3d.services.ads.token.C9398h;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.C9549a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AdsModuleConfiguration implements IAdsModuleConfiguration {

    /* renamed from: a */
    private InetAddress f18212a;

    /* renamed from: com.unity3d.services.ads.configuration.AdsModuleConfiguration$a */
    /* loaded from: classes3.dex */
    public class C9323a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f18213a;

        /* renamed from: b */
        final /* synthetic */ ConditionVariable f18214b;

        public C9323a(String str, ConditionVariable conditionVariable) {
            this.f18213a = str;
            this.f18214b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                AdsModuleConfiguration.this.f18212a = InetAddress.getByName(this.f18213a);
                this.f18214b.open();
            } catch (Exception e) {
                C9549a.m2023a("Couldn't get address. Host: " + this.f18213a, e);
                this.f18214b.open();
            }
        }
    }

    @Override // com.unity3d.services.ads.configuration.IAdsModuleConfiguration
    public Map<String, Class> getAdUnitViewHandlers() {
        HashMap hashMap = new HashMap();
        hashMap.put("videoplayer", C9301h.class);
        hashMap.put("webplayer", C9302i.class);
        hashMap.put("webview", C9303j.class);
        return hashMap;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{AdUnit.class, VideoPlayer.class, WebPlayer.class, Load.class, Show.class, Token.class, GMAScar.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        C9297d.m2487a(configuration);
        C9293a.m2518a(configuration);
        C9383a.m2397a().m2385b(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        C9398h.m2373a((String) null);
        C9398h.m2375a();
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initModuleState(Configuration configuration) {
        ConditionVariable conditionVariable;
        InetAddress inetAddress;
        C9549a.m2019b("Unity Ads init: checking for ad blockers");
        try {
            String host = new URL(configuration.getConfigUrl()).getHost();
            conditionVariable = new ConditionVariable();
            new C9323a(host, conditionVariable).start();
        } catch (MalformedURLException unused) {
        }
        if (conditionVariable.block(2000L) && (inetAddress = this.f18212a) != null && inetAddress.isLoopbackAddress()) {
            C9549a.m2017c("Unity Ads init: halting init because Unity Ads config resolves to loopback address (due to ad blocker?)");
            return false;
        }
        C9297d.m2487a(configuration);
        C9293a.m2518a(configuration);
        C9383a.m2397a().m2385b(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        C9297d.m2487a(configuration);
        C9293a.m2518a(configuration);
        C9398h.m2375a();
        C9383a.m2397a().m2385b(configuration);
        return true;
    }
}

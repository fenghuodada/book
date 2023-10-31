package com.unity3d.services.core.configuration;

import android.annotation.TargetApi;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.fragment.app.C1431t;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.C9398h;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.cache.C9467a;
import com.unity3d.services.core.connectivity.C9488c;
import com.unity3d.services.core.connectivity.InterfaceC9491e;
import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.device.reader.C9522f;
import com.unity3d.services.core.lifecycle.C9543a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.C9583h;
import com.unity3d.services.core.request.metrics.C9597d;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.WebView;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InitializeThread extends Thread {

    /* renamed from: a */
    private static InitializeThread f18707a;

    /* renamed from: b */
    private AbstractC9484c f18708b;

    /* renamed from: c */
    private String f18709c;

    /* renamed from: d */
    private boolean f18710d = false;

    /* renamed from: e */
    private boolean f18711e = false;

    /* renamed from: f */
    private long f18712f;

    /* loaded from: classes3.dex */
    public static class InitializeStateCheckForCachedWebViewUpdate extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18713a;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super(null);
            this.f18713a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            try {
                byte[] m2206b = InitializeThread.m2206b(new File(C9572d.m1927m()));
                if (C9564j.m1985a(m2206b).equals(this.f18713a.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this.f18713a, new String(m2206b, "UTF-8"));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this.f18713a);
        }

        public Configuration getConfiguration() {
            return this.f18713a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCheckForUpdatedWebView extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18714a;

        /* renamed from: b */
        private byte[] f18715b;

        /* renamed from: c */
        private Configuration f18716c;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super(null);
            this.f18714a = configuration;
            this.f18715b = bArr;
            this.f18716c = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            try {
                String m1985a = C9564j.m1985a(this.f18715b);
                if (!m1985a.equals(this.f18714a.getWebViewHash())) {
                    C9572d.m1948a(this.f18714a);
                }
                if (!TextUtils.isEmpty(m1985a)) {
                    Configuration configuration = this.f18716c;
                    if (configuration != null && configuration.getWebViewHash() != null && this.f18716c.getWebViewHash().equals(m1985a) && C9572d.m1925o().equals(this.f18716c.getSdkVersion())) {
                        return new InitializeStateCreate(this.f18716c, new String(this.f18715b, "UTF-8"));
                    }
                    Configuration configuration2 = this.f18714a;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(m1985a)) {
                        return new InitializeStateCreate(this.f18714a, new String(this.f18715b, "UTF-8"));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this.f18714a, new InitializeStateLoadWeb(this.f18714a));
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCleanCache extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18717a;

        /* renamed from: b */
        private AbstractC9484c f18718b;

        public InitializeStateCleanCache(Configuration configuration, AbstractC9484c abstractC9484c) {
            super(null);
            this.f18717a = configuration;
            this.f18718b = abstractC9484c;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            try {
                File file = new File(C9572d.m1929k());
                File file2 = new File(C9572d.m1927m());
                file.delete();
                file2.delete();
            } catch (Exception e) {
                C9549a.m2017c("Failure trying to clean cache: " + e.getMessage());
            }
            return this.f18718b;
        }

        public Configuration getConfiguration() {
            return this.f18717a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, AbstractC9484c abstractC9484c) {
            super(configuration, abstractC9484c);
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache, com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            try {
                AbstractC9484c execute = super.execute();
                if (execute instanceof InitializeStateError) {
                    return null;
                }
                return execute;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateComplete extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18719a;

        public InitializeStateComplete(Configuration configuration) {
            super(null);
            this.f18719a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            for (String str : this.f18719a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.f18719a.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(this.f18719a);
                }
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateConfig extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18720a;

        /* renamed from: b */
        private Configuration f18721b;

        /* renamed from: c */
        private int f18722c;

        /* renamed from: d */
        private long f18723d;

        /* renamed from: e */
        private int f18724e;

        /* renamed from: f */
        private double f18725f;

        /* renamed from: g */
        private AbstractC9484c f18726g;

        /* renamed from: com.unity3d.services.core.configuration.InitializeThread$InitializeStateConfig$a */
        /* loaded from: classes3.dex */
        public class C9480a implements IConfigurationLoaderListener {

            /* renamed from: a */
            final /* synthetic */ Configuration f18727a;

            public C9480a(Configuration configuration) {
                this.f18727a = configuration;
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(String str) {
                C9604i.m1839a().sendMetric(C9606j.m1830a());
                InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                initializeStateConfig.f18726g = initializeStateConfig.executeLegacy(this.f18727a);
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(Configuration configuration) {
                InitializeStateConfig.this.f18720a = configuration;
                InitializeStateConfig.this.f18720a.saveToDisk();
                if (InitializeStateConfig.this.f18720a.getDelayWebViewUpdate()) {
                    InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                    initializeStateConfig.f18726g = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig.f18720a, InitializeStateConfig.this.f18721b);
                }
                C9398h.m2373a(InitializeStateConfig.this.f18720a.getUnifiedAuctionToken());
                boolean isNativeWebViewCacheEnabled = InitializeStateConfig.this.f18720a.getExperiments().isNativeWebViewCacheEnabled();
                InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                initializeStateConfig2.f18726g = isNativeWebViewCacheEnabled ? new InitializeStateCreateWithRemote(initializeStateConfig2.f18720a) : new InitializeStateLoadCache(initializeStateConfig2.f18720a);
            }
        }

        public InitializeStateConfig(Configuration configuration) {
            super(null);
            this.f18720a = new Configuration(C9572d.m1937d(), configuration.getExperimentsReader());
            this.f18722c = 0;
            this.f18723d = configuration.getRetryDelay();
            this.f18724e = configuration.getMaxRetries();
            this.f18725f = configuration.getRetryScalingFactor();
            this.f18721b = configuration;
            this.f18726g = null;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2015d("Unity Ads init: load configuration from " + C9572d.m1937d());
            return (this.f18720a.getExperiments() == null || !this.f18720a.getExperiments().isTwoStageInitializationEnabled()) ? executeLegacy(this.f18720a) : executeWithLoader();
        }

        public AbstractC9484c executeLegacy(Configuration configuration) {
            try {
                configuration.m2224b();
                if (configuration.getDelayWebViewUpdate()) {
                    return new InitializeStateLoadCacheConfigAndWebView(configuration, this.f18721b);
                }
                AbstractC9484c initializeStateCreateWithRemote = configuration.getExperiments().isNativeWebViewCacheEnabled() ? new InitializeStateCreateWithRemote(configuration) : new InitializeStateLoadCache(configuration);
                this.f18726g = initializeStateCreateWithRemote;
                return initializeStateCreateWithRemote;
            } catch (Exception e) {
                if (this.f18722c < this.f18724e) {
                    this.f18723d = (long) (this.f18723d * this.f18725f);
                    this.f18722c++;
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new InitializeStateRetry(this, this.f18723d);
                }
                return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.f18721b);
            }
        }

        public AbstractC9484c executeWithLoader() {
            PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
            IConfigurationLoader configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(this.f18720a, new C9517a(new ConfigurationReader(), privacyConfigStorage)));
            if (this.f18720a.getExperiments().isPrivacyRequestEnabled()) {
                configurationLoader = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(this.f18720a, new C9522f(new ConfigurationReader(), privacyConfigStorage)), privacyConfigStorage);
            }
            try {
                configurationLoader.loadConfiguration(new C9480a(new Configuration(C9572d.m1937d())));
                return this.f18726g;
            } catch (Exception e) {
                int i = this.f18722c;
                if (i < this.f18724e) {
                    this.f18723d = (long) (this.f18723d * this.f18725f);
                    this.f18722c = i + 1;
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new InitializeStateRetry(this, this.f18723d);
                }
                return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.f18720a);
            }
        }

        public Configuration getConfiguration() {
            return this.f18720a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCreate extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18729a;

        /* renamed from: b */
        private String f18730b;

        public InitializeStateCreate(Configuration configuration, String str) {
            super(null);
            this.f18729a = configuration;
            this.f18730b = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2019b("Unity Ads init: creating webapp");
            Configuration configuration = this.f18729a;
            configuration.setWebViewData(this.f18730b);
            try {
                ErrorState m1789a = C9620a.m1789a(configuration, false);
                if (m1789a == null) {
                    return new InitializeStateComplete(this.f18729a);
                }
                String m1771f = C9620a.m1774c().m1771f() != null ? C9620a.m1774c().m1771f() : "Unity Ads WebApp creation failed";
                C9549a.m2017c(m1771f);
                return new InitializeStateError(m1789a, new Exception(m1771f), this.f18729a);
            } catch (IllegalThreadStateException e) {
                C9549a.m2023a("Illegal Thread", e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.f18729a);
            }
        }

        public Configuration getConfiguration() {
            return this.f18729a;
        }

        public String getWebData() {
            return this.f18730b;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateCreateWithRemote extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18731a;

        public InitializeStateCreateWithRemote(Configuration configuration) {
            super(null);
            this.f18731a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2019b("Unity Ads init: creating webapp");
            try {
                ErrorState m1789a = C9620a.m1789a(this.f18731a, true);
                if (m1789a == null) {
                    return new InitializeStateComplete(this.f18731a);
                }
                String m1771f = C9620a.m1774c().m1771f() != null ? C9620a.m1774c().m1771f() : "Unity Ads WebApp creation failed";
                C9549a.m2017c(m1771f);
                return new InitializeStateError(m1789a, new Exception(m1771f), this.f18731a);
            } catch (IllegalThreadStateException e) {
                C9549a.m2023a("Illegal Thread", e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.f18731a);
            }
        }

        public Configuration getConfiguration() {
            return this.f18731a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateDownloadWebView extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18732a;

        /* renamed from: b */
        private int f18733b;

        /* renamed from: c */
        private long f18734c;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super(null);
            this.f18732a = configuration;
            this.f18733b = 0;
            this.f18734c = configuration.getRetryDelay();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2015d("Unity Ads init: downloading webapp from " + this.f18732a.getWebViewUrl());
            try {
                try {
                    String m1885n = new C9583h(this.f18732a.getWebViewUrl(), "GET", null).m1885n();
                    String webViewHash = this.f18732a.getWebViewHash();
                    if (m1885n == null || webViewHash == null || !C9564j.m1989a(m1885n).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this.f18732a, m1885n);
                } catch (Exception unused) {
                    if (this.f18733b < this.f18732a.getMaxRetries()) {
                        long retryScalingFactor = (long) (this.f18732a.getRetryScalingFactor() * this.f18734c);
                        this.f18734c = retryScalingFactor;
                        this.f18733b++;
                        return new InitializeStateRetry(this, retryScalingFactor);
                    }
                    return null;
                }
            } catch (Exception e) {
                C9549a.m2023a("Malformed URL", e);
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateError extends AbstractC9484c {

        /* renamed from: a */
        ErrorState f18735a;

        /* renamed from: b */
        Exception f18736b;

        /* renamed from: c */
        protected Configuration f18737c;

        public InitializeStateError(ErrorState errorState, Exception exc, Configuration configuration) {
            super(null);
            this.f18735a = errorState;
            this.f18736b = exc;
            this.f18737c = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2017c("Unity Ads init: halting init in " + this.f18735a.getMetricName() + ": " + this.f18736b.getMessage());
            for (String str : this.f18737c.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.f18737c.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(this.f18737c, this.f18735a, this.f18736b.getMessage());
                }
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset, com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9572d.m1947a(C9572d.EnumC9573a.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateInitModules extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18738a;

        public InitializeStateInitModules(Configuration configuration) {
            super(null);
            this.f18738a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            for (String str : this.f18738a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.f18738a.getModuleConfiguration(str);
                if (moduleConfiguration != null && !moduleConfiguration.initModuleState(this.f18738a)) {
                    return new InitializeStateError(ErrorState.InitModules, new Exception("Unity Ads config server resolves to loopback address (due to ad blocker?)"), this.f18738a);
                }
            }
            return new InitializeStateConfig(this.f18738a);
        }

        public Configuration getConfiguration() {
            return this.f18738a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadCache extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18739a;

        public InitializeStateLoadCache(Configuration configuration) {
            super(null);
            this.f18739a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2019b("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] m1994a = C9564j.m1994a(new File(C9572d.m1927m()));
                String m1985a = C9564j.m1985a(m1994a);
                if (m1985a == null || !m1985a.equals(this.f18739a.getWebViewHash())) {
                    return new InitializeStateLoadWeb(this.f18739a);
                }
                try {
                    String str = new String(m1994a, "UTF-8");
                    C9549a.m2015d("Unity Ads init: webapp loaded from local cache");
                    return new InitializeStateCreate(this.f18739a, str);
                } catch (Exception e) {
                    return new InitializeStateError(ErrorState.LoadCache, e, this.f18739a);
                }
            } catch (Exception e2) {
                C9549a.m2019b("Unity Ads init: webapp not found in local cache: " + e2.getMessage());
                return new InitializeStateLoadWeb(this.f18739a);
            }
        }

        public Configuration getConfiguration() {
            return this.f18739a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadCacheConfigAndWebView extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18740a;

        /* renamed from: b */
        private Configuration f18741b;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super(null);
            this.f18740a = configuration;
            this.f18741b = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this.f18740a, InitializeThread.m2206b(new File(C9572d.m1927m())), this.f18741b);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this.f18740a, new InitializeStateLoadWeb(this.f18740a));
            }
        }

        public Configuration getConfiguration() {
            return this.f18740a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadConfigFile extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18742a;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super(null);
            this.f18742a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2019b("Unity Ads init: Loading Config File Parameters");
            File file = new File(C9572d.m1929k());
            try {
                if (file.exists()) {
                    try {
                        Configuration configuration = new Configuration(new JSONObject(new String(C9564j.m1994a(file))));
                        this.f18742a = configuration;
                        return new InitializeStateReset(configuration);
                    } catch (Exception unused) {
                        C9549a.m2019b("Unity Ads init: Using default configuration parameters");
                        return new InitializeStateReset(this.f18742a);
                    }
                }
                return new InitializeStateReset(this.f18742a);
            } catch (Throwable unused2) {
                return new InitializeStateReset(this.f18742a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateLoadWeb extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18743a;

        /* renamed from: b */
        private int f18744b;

        /* renamed from: c */
        private long f18745c;

        /* renamed from: d */
        private int f18746d;

        /* renamed from: e */
        private double f18747e;

        public InitializeStateLoadWeb(Configuration configuration) {
            super(null);
            this.f18743a = configuration;
            this.f18744b = 0;
            this.f18745c = configuration.getRetryDelay();
            this.f18746d = configuration.getMaxRetries();
            this.f18747e = configuration.getRetryScalingFactor();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2015d("Unity Ads init: loading webapp from " + this.f18743a.getWebViewUrl());
            try {
                try {
                    String m1885n = new C9583h(this.f18743a.getWebViewUrl(), "GET", null).m1885n();
                    String webViewHash = this.f18743a.getWebViewHash();
                    if (webViewHash == null || C9564j.m1989a(m1885n).equals(webViewHash)) {
                        if (webViewHash != null) {
                            C9564j.m1993a(new File(C9572d.m1927m()), m1885n);
                        }
                        return new InitializeStateCreate(this.f18743a, m1885n);
                    }
                    return new InitializeStateError(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), this.f18743a);
                } catch (Exception e) {
                    if (this.f18744b < this.f18746d) {
                        this.f18745c = (long) (this.f18745c * this.f18747e);
                        this.f18744b++;
                        InitializeEventsMetricSender.getInstance().onRetryWebview();
                        return new InitializeStateRetry(this, this.f18745c);
                    }
                    return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, e, this, this.f18743a);
                }
            } catch (MalformedURLException e2) {
                C9549a.m2023a("Malformed URL", e2);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, e2, this.f18743a);
            }
        }

        public Configuration getConfiguration() {
            return this.f18743a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateNetworkError extends InitializeStateError implements InterfaceC9491e {

        /* renamed from: d */
        private static int f18748d;

        /* renamed from: e */
        private static long f18749e;

        /* renamed from: f */
        private ErrorState f18750f;

        /* renamed from: g */
        private AbstractC9484c f18751g;

        /* renamed from: h */
        private ConditionVariable f18752h;

        /* renamed from: i */
        private long f18753i;

        /* renamed from: j */
        private int f18754j;

        /* renamed from: k */
        private int f18755k;

        public InitializeStateNetworkError(ErrorState errorState, Exception exc, AbstractC9484c abstractC9484c, Configuration configuration) {
            super(errorState, exc, configuration);
            this.f18750f = errorState;
            f18748d = 0;
            f18749e = 0L;
            this.f18751g = abstractC9484c;
            this.f18753i = configuration.getNetworkErrorTimeout();
            this.f18754j = configuration.getMaximumConnectedEvents();
            this.f18755k = configuration.getConnectedEventThreshold();
        }

        /* renamed from: a */
        private boolean m2199a() {
            return System.currentTimeMillis() - f18749e >= ((long) this.f18755k) && f18748d <= this.f18754j;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateError, com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2017c("Unity Ads init: network error, waiting for connection events");
            this.f18752h = new ConditionVariable();
            C9488c.m2190a(this);
            boolean block = this.f18752h.block(this.f18753i);
            C9488c.m2187b(this);
            return block ? this.f18751g : new InitializeStateError(this.f18750f, new Exception("No connected events within the timeout!"), this.f18737c);
        }

        @Override // com.unity3d.services.core.connectivity.InterfaceC9491e
        public void onConnected() {
            f18748d++;
            C9549a.m2019b("Unity Ads init got connected event");
            if (m2199a()) {
                this.f18752h.open();
            }
            if (f18748d > this.f18754j) {
                C9488c.m2187b(this);
            }
            f18749e = System.currentTimeMillis();
        }

        @Override // com.unity3d.services.core.connectivity.InterfaceC9491e
        public void onDisconnected() {
            C9549a.m2019b("Unity Ads init got disconnected event");
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateReset extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18756a;

        /* renamed from: b */
        private int f18757b;

        /* renamed from: com.unity3d.services.core.configuration.InitializeThread$InitializeStateReset$a */
        /* loaded from: classes3.dex */
        public class RunnableC9481a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C9620a f18758a;

            /* renamed from: b */
            final /* synthetic */ ConditionVariable f18759b;

            public RunnableC9481a(C9620a c9620a, ConditionVariable conditionVariable) {
                this.f18758a = c9620a;
                this.f18759b = conditionVariable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18758a.m1770g().destroy();
                this.f18758a.m1788a((WebView) null);
                this.f18759b.open();
            }
        }

        public InitializeStateReset(Configuration configuration) {
            super(null);
            this.f18756a = configuration;
            this.f18757b = configuration.getResetWebappTimeout();
        }

        @TargetApi(14)
        /* renamed from: a */
        private void m2198a() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (C9568a.m1960d() != null) {
                    C9568a.m1960d().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener(null);
            }
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            boolean z;
            C9549a.m2019b("Unity Ads init: starting init");
            ConditionVariable conditionVariable = new ConditionVariable();
            C9620a m1774c = C9620a.m1774c();
            if (m1774c != null) {
                m1774c.m1767j();
                if (m1774c.m1770g() != null) {
                    C9564j.m1991a(new RunnableC9481a(m1774c, conditionVariable));
                    z = conditionVariable.block(this.f18757b);
                } else {
                    z = true;
                }
                if (!z) {
                    return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Reset failed on opening ConditionVariable"), this.f18756a);
                }
            }
            m2198a();
            C9572d.m1949a((C9467a) null);
            if (C9572d.m1954a() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Cache directory is NULL"), this.f18756a);
            }
            C9572d.m1940b(false);
            for (String str : this.f18756a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.f18756a.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(this.f18756a);
                }
            }
            return new InitializeStateInitModules(this.f18756a);
        }

        public Configuration getConfiguration() {
            return this.f18756a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateRetry extends AbstractC9484c {

        /* renamed from: a */
        AbstractC9484c f18761a;

        /* renamed from: b */
        long f18762b;

        public InitializeStateRetry(AbstractC9484c abstractC9484c, long j) {
            super(null);
            this.f18761a = abstractC9484c;
            this.f18762b = j;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            C9549a.m2019b("Unity Ads init: retrying in " + this.f18762b + " milliseconds");
            try {
                Thread.sleep(this.f18762b);
            } catch (Exception e) {
                C9549a.m2023a("Init retry interrupted", e);
            }
            return this.f18761a;
        }
    }

    /* loaded from: classes3.dex */
    public static class InitializeStateUpdateCache extends AbstractC9484c {

        /* renamed from: a */
        private Configuration f18763a;

        /* renamed from: b */
        private String f18764b;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super(null);
            this.f18763a = configuration;
            this.f18764b = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.AbstractC9484c
        public AbstractC9484c execute() {
            if (this.f18763a != null && this.f18764b != null) {
                try {
                    C9564j.m1993a(new File(C9572d.m1927m()), this.f18764b);
                    C9564j.m1993a(new File(C9572d.m1929k()), this.f18763a.getJSONString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this.f18763a, null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this.f18763a;
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$a */
    /* loaded from: classes3.dex */
    public class RunnableC9482a implements Runnable {
        public RunnableC9482a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9572d.m1950a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$b */
    /* loaded from: classes3.dex */
    public class RunnableC9483b implements Runnable {
        public RunnableC9483b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9572d.m1950a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC9484c {
        private AbstractC9484c() {
        }

        public /* synthetic */ AbstractC9484c(RunnableC9482a runnableC9482a) {
            this();
        }

        public abstract AbstractC9484c execute();
    }

    private InitializeThread(AbstractC9484c abstractC9484c) {
        this.f18708b = abstractC9484c;
    }

    /* renamed from: a */
    private int m2210a() {
        return 15;
    }

    /* renamed from: a */
    private String m2209a(AbstractC9484c abstractC9484c) {
        if (abstractC9484c == null) {
            return null;
        }
        String simpleName = abstractC9484c.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String lowerCase = simpleName.substring(m2210a()).toLowerCase();
        return C1431t.m10577a(new StringBuilder(lowerCase.length() + 7 + 6), "native_", lowerCase, "_state");
    }

    /* renamed from: b */
    private void m2207b(AbstractC9484c abstractC9484c) {
        if (this.f18709c == null || m2204d(abstractC9484c) || this.f18709c.equals("native_retry_state")) {
            return;
        }
        C9604i.m1839a().sendMetric(new C9597d(this.f18709c, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f18712f)), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m2206b(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new IOException("file not found");
        }
        try {
            return C9564j.m1994a(file);
        } catch (IOException unused) {
            throw new IOException("could not read from file");
        }
    }

    /* renamed from: c */
    private void m2205c(AbstractC9484c abstractC9484c) {
        boolean z;
        if (m2204d(abstractC9484c)) {
            z = true;
        } else {
            if (!this.f18711e) {
                this.f18712f = System.nanoTime();
            }
            z = false;
        }
        this.f18711e = z;
        this.f18709c = m2209a(abstractC9484c);
    }

    /* renamed from: d */
    private boolean m2204d(AbstractC9484c abstractC9484c) {
        return abstractC9484c instanceof InitializeStateRetry;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        synchronized (InitializeThread.class) {
            if (f18707a != null) {
                return DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
            } else if (C9572d.m1930j() == null) {
                return DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
            } else {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(C9572d.m1930j()));
                f18707a = initializeThread;
                initializeThread.setName("UnityAdsDownloadThread");
                f18707a.start();
                return DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
            }
        }
    }

    public static synchronized void initialize(Configuration configuration) {
        synchronized (InitializeThread.class) {
            if (f18707a == null) {
                InitializeEventsMetricSender.getInstance().didInitStart();
                C9543a.m2034b();
                InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
                f18707a = initializeThread;
                initializeThread.setName("UnityAdsInitializeThread");
                f18707a.start();
            }
        }
    }

    public static synchronized void reset() {
        synchronized (InitializeThread.class) {
            if (f18707a == null) {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
                f18707a = initializeThread;
                initializeThread.setName("UnityAdsResetThread");
                f18707a.start();
            }
        }
    }

    public void quit() {
        this.f18710d = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        InitializeStateForceReset initializeStateForceReset;
        while (true) {
            try {
                AbstractC9484c abstractC9484c = this.f18708b;
                if (abstractC9484c == null || this.f18710d) {
                    break;
                }
                try {
                    try {
                        m2205c(abstractC9484c);
                        AbstractC9484c execute = this.f18708b.execute();
                        this.f18708b = execute;
                        m2207b(execute);
                    } catch (Exception e) {
                        C9549a.m2023a("Unity Ads SDK encountered an error during initialization, cancel initialization", e);
                        C9564j.m1991a(new RunnableC9482a());
                        initializeStateForceReset = new InitializeStateForceReset();
                        this.f18708b = initializeStateForceReset;
                    }
                } catch (OutOfMemoryError e2) {
                    C9549a.m2023a("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e2));
                    C9564j.m1991a(new RunnableC9483b());
                    initializeStateForceReset = new InitializeStateForceReset();
                    this.f18708b = initializeStateForceReset;
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        f18707a = null;
    }
}

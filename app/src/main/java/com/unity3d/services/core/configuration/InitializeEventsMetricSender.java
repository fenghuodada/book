package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.metrics.C9597d;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {

    /* renamed from: a */
    private static InitializeEventsMetricSender f18697a;

    /* renamed from: b */
    private long f18698b = 0;

    /* renamed from: c */
    private long f18699c = 0;

    /* renamed from: d */
    private long f18700d = 0;

    /* renamed from: e */
    private long f18701e = 0;

    /* renamed from: f */
    private int f18702f = 0;

    /* renamed from: g */
    private int f18703g = 0;

    /* renamed from: h */
    private boolean f18704h = false;

    /* renamed from: i */
    private boolean f18705i = false;

    /* renamed from: com.unity3d.services.core.configuration.InitializeEventsMetricSender$a */
    /* loaded from: classes3.dex */
    public class C9479a extends HashMap<String, String> {
        public C9479a() {
            put("c_retry", String.valueOf(InitializeEventsMetricSender.this.f18702f));
            put("wv_retry", String.valueOf(InitializeEventsMetricSender.this.f18703g));
        }
    }

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    /* renamed from: a */
    private void m2215a() {
        if (this.f18701e == 0) {
            C9549a.m2019b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(C9606j.m1813e(tokenDuration(), getRetryTags()));
        }
    }

    /* renamed from: a */
    private void m2213a(boolean z) {
        if (this.f18699c == 0 || this.f18700d == 0) {
            C9549a.m2019b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(z ? C9606j.m1817d(privacyConfigDuration()) : C9606j.m1821c(privacyConfigDuration()));
        }
    }

    /* renamed from: b */
    private void m2211b(boolean z) {
        if (this.f18698b == 0) {
            C9549a.m2019b("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f18698b));
        Map<String, String> retryTags = getRetryTags();
        sendMetric(z ? C9606j.m1820c(valueOf, retryTags) : C9606j.m1816d(valueOf, retryTags));
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (f18697a == null) {
            f18697a = new InitializeEventsMetricSender();
        }
        return f18697a;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestStart() {
        this.f18701e = System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didInitStart() {
        this.f18698b = System.nanoTime();
        this.f18702f = 0;
        this.f18703g = 0;
        sendMetric(C9606j.m1826b());
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestEnd(boolean z) {
        this.f18700d = System.nanoTime();
        m2213a(z);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestStart() {
        this.f18699c = System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f18698b));
    }

    public Map<String, String> getErrorStateTags(ErrorState errorState) {
        Map<String, String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Map<String, String> getRetryTags() {
        return new C9479a();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long initializationStartTimeStamp() {
        return Long.valueOf(this.f18698b);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryConfig() {
        this.f18702f++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryWebview() {
        this.f18703g++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.f18700d - this.f18699c));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkDidInitialize() {
        if (initializationStartTimeStamp().longValue() == 0) {
            C9549a.m2019b("sdkDidInitialize called before didInitStart, skipping metric");
            return;
        }
        if (!this.f18704h) {
            sendMetric(C9606j.m1824b(duration(), getRetryTags()));
            this.f18704h = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkInitializeFailed(String str, ErrorState errorState) {
        if (this.f18698b == 0) {
            C9549a.m2019b("sdkInitializeFailed called before didInitStart, skipping metric");
            return;
        }
        if (!this.f18704h) {
            sendMetric(C9606j.m1828a(duration(), getErrorStateTags(errorState)));
            this.f18704h = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this.f18705i) {
            m2211b(z);
            if (z) {
                m2215a();
            }
            this.f18705i = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sendMetric(C9597d c9597d) {
        C9604i.m1839a().sendMetric(c9597d);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f18701e));
    }
}

package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PrivacyConfig {

    /* renamed from: a */
    private final PrivacyConfigStatus f18767a;

    public PrivacyConfig() {
        this(PrivacyConfigStatus.UNKNOWN);
    }

    public PrivacyConfig(PrivacyConfigStatus privacyConfigStatus) {
        this.f18767a = privacyConfigStatus;
    }

    public PrivacyConfig(JSONObject jSONObject) {
        this.f18767a = m2197a(jSONObject) ? PrivacyConfigStatus.ALLOWED : PrivacyConfigStatus.DENIED;
    }

    /* renamed from: a */
    private boolean m2197a(JSONObject jSONObject) {
        return jSONObject.optBoolean("pas", false);
    }

    public boolean allowedToSendPii() {
        return this.f18767a.equals(PrivacyConfigStatus.ALLOWED);
    }

    public PrivacyConfigStatus getPrivacyStatus() {
        return this.f18767a;
    }
}

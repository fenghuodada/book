package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import lombok.NonNull;

/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a */
    private final C3214m f7552a;

    public SdkConfigurationImpl(C3214m c3214m) {
        this.f7552a = c3214m;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f7552a.m7396p().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f7552a.m7456a(C3109b.f8025eU);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f7552a.m7456a(C3109b.f8026eV);
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{consentDialogState=" + getConsentDialogState() + ", countryCode=" + getCountryCode() + '}';
    }
}

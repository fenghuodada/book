package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C3199j;
import com.applovin.impl.sdk.C3349v;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean m7515a = C3199j.m7520b().m7515a(context);
        if (m7515a != null) {
            return m7515a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean m7515a = C3199j.m7525a().m7515a(context);
        if (m7515a != null) {
            return m7515a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return C3199j.m7525a().m7515a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean m7515a = C3199j.m7518c().m7515a(context);
        if (m7515a != null) {
            return m7515a.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return C3199j.m7518c().m7515a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "isUserConsentSet()");
        return C3199j.m7520b().m7515a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "setDoNotSell()");
        if (C3199j.m7517c(z, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (C3199j.m7519b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        C3349v.m6849f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (C3199j.m7521a(z, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z), null);
        }
    }
}

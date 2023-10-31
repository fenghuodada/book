package com.applovin.sdk;

import androidx.constraintlayout.motion.widget.C0552c;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdType {

    /* renamed from: a */
    private final String f8961a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType AUTO_INCENTIVIZED = new AppLovinAdType("AUTOREW");
    public static final AppLovinAdType NATIVE = new AppLovinAdType("NATIVE");

    private AppLovinAdType(String str) {
        this.f8961a = str;
    }

    public static AppLovinAdType fromString(String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if ("AUTOREW".equalsIgnoreCase(str)) {
            return AUTO_INCENTIVIZED;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(C0552c.m12192b("Unknown Ad Type: ", str));
    }

    public String getLabel() {
        return this.f8961a.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return getLabel();
    }
}

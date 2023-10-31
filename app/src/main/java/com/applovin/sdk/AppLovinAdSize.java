package com.applovin.sdk;

import androidx.constraintlayout.motion.widget.C0552c;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a */
    private final String f8958a;

    /* renamed from: b */
    private final int f8959b;

    /* renamed from: c */
    private final int f8960c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.f8959b = i;
        this.f8960c = i2;
        this.f8958a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if (!"INTERSTITIAL".equalsIgnoreCase(str) && !"INTER".equalsIgnoreCase(str)) {
            if ("XPROMO".equalsIgnoreCase(str)) {
                return CROSS_PROMO;
            }
            if ("NATIVE".equalsIgnoreCase(str)) {
                return NATIVE;
            }
            throw new IllegalArgumentException(C0552c.m12192b("Unknown Ad Size: ", str));
        }
        return INTERSTITIAL;
    }

    public int getHeight() {
        return this.f8960c;
    }

    public String getLabel() {
        return this.f8958a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f8959b;
    }

    public String toString() {
        return getLabel();
    }
}

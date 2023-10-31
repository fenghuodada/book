package com.applovin.impl.sdk.p029ad;

/* renamed from: com.applovin.impl.sdk.ad.b */
/* loaded from: classes.dex */
public enum EnumC3076b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);
    

    /* renamed from: g */
    private final int f7653g;

    EnumC3076b(int i) {
        this.f7653g = i;
    }

    /* renamed from: a */
    public static EnumC3076b m7997a(int i) {
        return i == 1 ? APPLOVIN_PRIMARY_ZONE : i == 2 ? APPLOVIN_CUSTOM_ZONE : i == 3 ? APPLOVIN_MULTIZONE : i == 4 ? REGULAR_AD_TOKEN : i == 5 ? DECODED_AD_TOKEN_JSON : UNKNOWN;
    }

    /* renamed from: a */
    public int m7998a() {
        return this.f7653g;
    }
}

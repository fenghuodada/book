package com.vungle.warren;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.unity3d.ads.metadata.MediationMetaData;

/* loaded from: classes3.dex */
public final class AdConfig extends C9903o {
    @SerializedName(MediationMetaData.KEY_ORDINAL)

    /* renamed from: d */
    private int f19263d;
    @SerializedName("adOrientation")
    @Orientation

    /* renamed from: e */
    private int f19264e;

    /* renamed from: f */
    public boolean f19265f;

    /* loaded from: classes3.dex */
    public @interface AdOptionsPosition {
    }

    @Keep
    /* loaded from: classes3.dex */
    public enum AdSize {
        VUNGLE_MREC("mrec", 300, 250),
        VUNGLE_DEFAULT("default", -1, -1),
        BANNER("banner", 320, 50),
        BANNER_SHORT("banner_short", 300, 50),
        BANNER_LEADERBOARD("banner_leaderboard", 728, 90);
        
        private final int height;
        private final String name;
        private final int width;

        AdSize(String str, int i, int i2) {
            this.width = i;
            this.height = i2;
            this.name = str;
        }

        public static AdSize fromName(String str) {
            AdSize[] values;
            for (AdSize adSize : values()) {
                if (adSize.name.equals(str)) {
                    return adSize;
                }
            }
            return VUNGLE_DEFAULT;
        }

        public static boolean isBannerAdSize(@NonNull AdSize adSize) {
            return adSize == BANNER || adSize == BANNER_LEADERBOARD || adSize == BANNER_SHORT || adSize == VUNGLE_MREC;
        }

        public static boolean isDefaultAdSize(@NonNull AdSize adSize) {
            return adSize == VUNGLE_DEFAULT || adSize == VUNGLE_MREC;
        }

        public static boolean isNonMrecBannerAdSize(@NonNull AdSize adSize) {
            return adSize != VUNGLE_MREC && isBannerAdSize(adSize);
        }

        public int getHeight() {
            return this.height;
        }

        public String getName() {
            return this.name;
        }

        public int getWidth() {
            return this.width;
        }
    }

    /* loaded from: classes3.dex */
    public @interface Orientation {
    }

    /* loaded from: classes3.dex */
    public @interface Settings {
    }

    public AdConfig() {
        this.f19264e = 2;
    }

    public AdConfig(C9903o c9903o) {
        super(c9903o);
        this.f19264e = 2;
    }

    @Orientation
    /* renamed from: e */
    public final int m1652e() {
        return this.f19264e;
    }

    /* renamed from: f */
    public final int m1651f() {
        return this.f19263d;
    }

    /* renamed from: g */
    public final void m1650g(@Orientation int i) {
        this.f19264e = i;
        this.f19265f = true;
    }

    /* renamed from: h */
    public final void m1649h(int i) {
        this.f19263d = i;
    }
}

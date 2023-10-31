package com.google.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;

    /* renamed from: a */
    public final com.google.android.gms.ads.AdSize f10015a;
    @NonNull
    public static final AdSize SMART_BANNER = new AdSize(-1, -2);
    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50);
    @NonNull
    public static final AdSize IAB_MRECT = new AdSize(300, 250);
    @NonNull
    public static final AdSize IAB_BANNER = new AdSize(468, 60);
    @NonNull
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90);
    @NonNull
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600);

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public AdSize(@NonNull com.google.android.gms.ads.AdSize adSize) {
        this.f10015a = adSize;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof AdSize) {
            return this.f10015a.equals(((AdSize) obj).f10015a);
        }
        return false;
    }

    @Nullable
    public AdSize findBestSize(@NonNull AdSize... adSizeArr) {
        int width;
        int height;
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width2 = getWidth();
        int height2 = getHeight();
        float f = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (width * height) / (width2 * height2);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.f10015a.getHeight();
    }

    public int getHeightInPixels(@NonNull Context context) {
        return this.f10015a.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.f10015a.getWidth();
    }

    public int getWidthInPixels(@NonNull Context context) {
        return this.f10015a.getWidthInPixels(context);
    }

    public int hashCode() {
        return this.f10015a.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f10015a.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.f10015a.isFullWidth();
    }

    public boolean isSizeAppropriate(int i, int i2) {
        float width = getWidth();
        float f = i;
        int i3 = (f > (width * 1.25f) ? 1 : (f == (width * 1.25f) ? 0 : -1));
        int height = getHeight();
        if (i3 > 0 || f < width * 0.8f) {
            return false;
        }
        float f2 = i2;
        float f3 = height;
        return f2 <= 1.25f * f3 && f2 >= f3 * 0.8f;
    }

    @NonNull
    public String toString() {
        return this.f10015a.toString();
    }
}

package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;

/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    @NonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AdSize(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        La:
            r1 = -2
            if (r5 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(C0235r.m12816a("Invalid width for AdSize: ", i));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(C0235r.m12816a("Invalid height for AdSize: ", i2));
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }

    @NonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzc = zzbzm.zzc(context, i, 50, 0);
        zzc.zze = true;
        return zzc;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zza2 = zzbzm.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getCurrentOrientationInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, zzbzm.zza(context, 0));
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            zzbzt.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzc = zzbzm.zzc(context, i, 50, 2);
        zzc.zze = true;
        return zzc;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zza2 = zzbzm.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, zzbzm.zza(context, 2));
    }

    @NonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize zzc = zzbzm.zzc(context, i, 50, 1);
        zzc.zze = true;
        return zzc;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int zza2 = zzbzm.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getPortraitInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, zzbzm.zza(context, 1));
    }

    private static AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzi = i2;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzay.zzb();
            return zzbzm.zzx(context, this.zzc);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i = this.zzb;
        if (i != -3) {
            if (i != -1) {
                zzay.zzb();
                return zzbzm.zzx(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @NonNull
    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i) {
        this.zzg = i;
    }

    public final void zzd(int i) {
        this.zzi = i;
    }

    public final void zze(boolean z) {
        this.zzf = true;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }
}

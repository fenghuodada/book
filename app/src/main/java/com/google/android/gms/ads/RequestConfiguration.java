package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbzt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class RequestConfiguration {
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;
    @Nullable
    private final String zzd;
    private final List zze;
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* loaded from: classes.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;
        @Nullable
        private String zzc = null;
        private final List zzd = new ArrayList();

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        @NonNull
        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                zzbzt.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zza = i;
            } else {
                zzbzt.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            }
            return this;
        }

        @NonNull
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzb = i;
            } else {
                zzbzt.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            }
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, zzh zzhVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = list;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.zzd;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}

package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class AdRequest {
    @NonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final zzdx zza;

    /* loaded from: classes.dex */
    public static class Builder {
        protected final zzdw zza;

        public Builder() {
            zzdw zzdwVar = new zzdw();
            this.zza = zzdwVar;
            zzdwVar.zzv("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @NonNull
        @Deprecated
        public Builder addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
            this.zza.zzq(cls, bundle);
            return this;
        }

        @NonNull
        public Builder addKeyword(@NonNull String str) {
            this.zza.zzs(str);
            return this;
        }

        @NonNull
        public Builder addNetworkExtrasBundle(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
            this.zza.zzt(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @NonNull
        public AdRequest build() {
            return new AdRequest(this);
        }

        @NonNull
        public Builder setAdString(@NonNull String str) {
            this.zza.zzx(str);
            return this;
        }

        @NonNull
        public Builder setContentUrl(@NonNull String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            int length = str.length();
            Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.zza.zzz(str);
            return this;
        }

        @NonNull
        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzB(i);
            return this;
        }

        @NonNull
        public Builder setNeighboringContentUrls(@NonNull List<String> list) {
            if (list == null) {
                zzbzt.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzD(list);
            return this;
        }

        @NonNull
        public Builder setRequestAgent(@NonNull String str) {
            this.zza.zzF(str);
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zza(@NonNull String str) {
            this.zza.zzv(str);
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzb(@NonNull Date date) {
            this.zza.zzy(date);
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzA(i);
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzC(z);
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzG(z);
            return this;
        }
    }

    public AdRequest(@NonNull Builder builder) {
        this.zza = new zzdx(builder.zza, null);
    }

    @Nullable
    public String getAdString() {
        return this.zza.zzj();
    }

    @NonNull
    public String getContentUrl() {
        return this.zza.zzk();
    }

    @Nullable
    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @NonNull
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @NonNull
    public Set<String> getKeywords() {
        return this.zza.zzq();
    }

    @NonNull
    public List<String> getNeighboringContentUrls() {
        return this.zza.zzo();
    }

    @Nullable
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@NonNull Class<T> cls) {
        return this.zza.zzf(cls);
    }

    @NonNull
    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(@NonNull Context context) {
        return this.zza.zzs(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}

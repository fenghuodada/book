package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* loaded from: classes.dex */
    public static final class Builder extends AdRequest.Builder {
        @NonNull
        public Builder addCategoryExclusion(@NonNull String str) {
            this.zza.zzp(str);
            return this;
        }

        @NonNull
        public Builder addCustomTargeting(@NonNull String str, @NonNull String str2) {
            this.zza.zzr(str, str2);
            return this;
        }

        @NonNull
        public Builder addCustomTargeting(@NonNull String str, @NonNull List<String> list) {
            if (list != null) {
                this.zza.zzr(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @NonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @NonNull
        public Builder setPublisherProvidedId(@NonNull String str) {
            this.zza.zzE(str);
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    @NonNull
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @NonNull
    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}

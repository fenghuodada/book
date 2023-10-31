package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzfl;

/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzi zziVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(zzfl zzflVar) {
        this.zza = zzflVar.zza;
        this.zzb = zzflVar.zzb;
        this.zzc = zzflVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}

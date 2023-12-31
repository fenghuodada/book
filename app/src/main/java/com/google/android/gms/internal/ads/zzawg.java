package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzawg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawg> CREATOR = new zzawh();
    @Nullable
    @SafeParcelable.Field(getter = "getContentFileDescriptor", m4845id = 2)
    private ParcelFileDescriptor zza;
    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", m4845id = 3)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "isDownloaded", m4845id = 4)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCachedBytes", m4845id = 5)
    private final long zzd;
    @SafeParcelable.Field(getter = "isGcacheHit", m4845id = 6)
    private final boolean zze;

    public zzawg() {
        this(null, false, false, 0L, false);
    }

    @SafeParcelable.Constructor
    public zzawg(@Nullable @SafeParcelable.Param(m4844id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(m4844id = 3) boolean z, @SafeParcelable.Param(m4844id = 4) boolean z2, @SafeParcelable.Param(m4844id = 5) long j, @SafeParcelable.Param(m4844id = 6) boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzb(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzd());
        SafeParcelWriter.writeBoolean(parcel, 4, zzf());
        SafeParcelWriter.writeLong(parcel, 5, zza());
        SafeParcelWriter.writeBoolean(parcel, 6, zzg());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    @Nullable
    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }
}

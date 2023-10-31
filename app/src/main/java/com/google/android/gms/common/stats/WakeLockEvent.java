package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(m4842id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", m4845id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", m4845id = 11)
    private final int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", m4845id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", m4845id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", m4845id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", m4845id = 5)
    private final int zzg;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingPackages", m4845id = 6)
    private final List zzh;
    @SafeParcelable.Field(getter = "getEventKey", m4845id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", m4845id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", m4845id = 14)
    private final int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", m4845id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", m4845id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", m4845id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", m4845id = 18)
    private final boolean zzo;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) long j, @SafeParcelable.Param(m4844id = 11) int i2, @SafeParcelable.Param(m4844id = 4) String str, @SafeParcelable.Param(m4844id = 5) int i3, @SafeParcelable.Param(m4844id = 6) @Nullable List list, @SafeParcelable.Param(m4844id = 12) String str2, @SafeParcelable.Param(m4844id = 8) long j2, @SafeParcelable.Param(m4844id = 14) int i4, @SafeParcelable.Param(m4844id = 10) String str3, @SafeParcelable.Param(m4844id = 13) String str4, @SafeParcelable.Param(m4844id = 15) float f, @SafeParcelable.Param(m4844id = 16) long j3, @SafeParcelable.Param(m4844id = 17) String str5, @SafeParcelable.Param(m4844id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzc() {
        List list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.zzk;
        String str2 = this.zze;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.zzl;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.zzm;
        String str4 = this.zzf;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.zzo;
        return "\t" + str + "\t" + i + "\t" + join + "\t" + i2 + "\t" + str2 + "\t" + str3 + "\t" + f + "\t" + str5 + "\t" + z;
    }
}

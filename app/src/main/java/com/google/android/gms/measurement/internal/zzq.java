package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20})
/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @Nullable
    @SafeParcelable.Field(m4845id = 2)
    public final String zza;
    @Nullable
    @SafeParcelable.Field(m4845id = 3)
    public final String zzb;
    @Nullable
    @SafeParcelable.Field(m4845id = 4)
    public final String zzc;
    @Nullable
    @SafeParcelable.Field(m4845id = 5)
    public final String zzd;
    @SafeParcelable.Field(m4845id = 6)
    public final long zze;
    @SafeParcelable.Field(m4845id = 7)
    public final long zzf;
    @Nullable
    @SafeParcelable.Field(m4845id = 8)
    public final String zzg;
    @SafeParcelable.Field(defaultValue = "true", m4845id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(m4845id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", m4845id = 11)
    public final long zzj;
    @Nullable
    @SafeParcelable.Field(m4845id = 12)
    public final String zzk;
    @SafeParcelable.Field(m4845id = 13)
    @Deprecated
    public final long zzl;
    @SafeParcelable.Field(m4845id = 14)
    public final long zzm;
    @SafeParcelable.Field(m4845id = 15)
    public final int zzn;
    @SafeParcelable.Field(defaultValue = "true", m4845id = 16)
    public final boolean zzo;
    @SafeParcelable.Field(m4845id = 18)
    public final boolean zzp;
    @Nullable
    @SafeParcelable.Field(m4845id = 19)
    public final String zzq;
    @Nullable
    @SafeParcelable.Field(m4845id = 21)
    public final Boolean zzr;
    @SafeParcelable.Field(m4845id = 22)
    public final long zzs;
    @Nullable
    @SafeParcelable.Field(m4845id = 23)
    public final List zzt;
    @Nullable
    @SafeParcelable.Field(m4845id = 24)
    public final String zzu;
    @SafeParcelable.Field(defaultValue = "", m4845id = 25)
    public final String zzv;
    @SafeParcelable.Field(defaultValue = "", m4845id = 26)
    public final String zzw;
    @Nullable
    @SafeParcelable.Field(m4845id = 27)
    public final String zzx;
    @SafeParcelable.Field(defaultValue = "false", m4845id = 28)
    public final boolean zzy;
    @SafeParcelable.Field(m4845id = 29)
    public final long zzz;

    public zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List list, @Nullable String str8, String str9, String str10, @Nullable String str11, boolean z5, long j7) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = 0L;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j6;
        this.zzt = list;
        this.zzu = null;
        this.zzv = str9;
        this.zzw = str10;
        this.zzx = str11;
        this.zzy = z5;
        this.zzz = j7;
    }

    @SafeParcelable.Constructor
    public zzq(@Nullable @SafeParcelable.Param(m4844id = 2) String str, @Nullable @SafeParcelable.Param(m4844id = 3) String str2, @Nullable @SafeParcelable.Param(m4844id = 4) String str3, @Nullable @SafeParcelable.Param(m4844id = 5) String str4, @SafeParcelable.Param(m4844id = 6) long j, @SafeParcelable.Param(m4844id = 7) long j2, @Nullable @SafeParcelable.Param(m4844id = 8) String str5, @SafeParcelable.Param(m4844id = 9) boolean z, @SafeParcelable.Param(m4844id = 10) boolean z2, @SafeParcelable.Param(m4844id = 11) long j3, @Nullable @SafeParcelable.Param(m4844id = 12) String str6, @SafeParcelable.Param(m4844id = 13) long j4, @SafeParcelable.Param(m4844id = 14) long j5, @SafeParcelable.Param(m4844id = 15) int i, @SafeParcelable.Param(m4844id = 16) boolean z3, @SafeParcelable.Param(m4844id = 18) boolean z4, @Nullable @SafeParcelable.Param(m4844id = 19) String str7, @Nullable @SafeParcelable.Param(m4844id = 21) Boolean bool, @SafeParcelable.Param(m4844id = 22) long j6, @Nullable @SafeParcelable.Param(m4844id = 23) List list, @Nullable @SafeParcelable.Param(m4844id = 24) String str8, @SafeParcelable.Param(m4844id = 25) String str9, @SafeParcelable.Param(m4844id = 26) String str10, @SafeParcelable.Param(m4844id = 27) String str11, @SafeParcelable.Param(m4844id = 28) boolean z5, @SafeParcelable.Param(m4844id = 29) long j7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = j5;
        this.zzn = i;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j6;
        this.zzt = list;
        this.zzu = str8;
        this.zzv = str9;
        this.zzw = str10;
        this.zzx = str11;
        this.zzy = z5;
        this.zzz = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 13, this.zzl);
        SafeParcelWriter.writeLong(parcel, 14, this.zzm);
        SafeParcelWriter.writeInt(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzp);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzr, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzs);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzu, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzy);
        SafeParcelWriter.writeLong(parcel, 29, this.zzz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes3.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @Nullable
    @SafeParcelable.Field(m4845id = 2)
    public String zza;
    @SafeParcelable.Field(m4845id = 3)
    public String zzb;
    @SafeParcelable.Field(m4845id = 4)
    public zzlk zzc;
    @SafeParcelable.Field(m4845id = 5)
    public long zzd;
    @SafeParcelable.Field(m4845id = 6)
    public boolean zze;
    @Nullable
    @SafeParcelable.Field(m4845id = 7)
    public String zzf;
    @Nullable
    @SafeParcelable.Field(m4845id = 8)
    public final zzau zzg;
    @SafeParcelable.Field(m4845id = 9)
    public long zzh;
    @Nullable
    @SafeParcelable.Field(m4845id = 10)
    public zzau zzi;
    @SafeParcelable.Field(m4845id = 11)
    public final long zzj;
    @Nullable
    @SafeParcelable.Field(m4845id = 12)
    public final zzau zzk;

    public zzac(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        this.zza = zzacVar.zza;
        this.zzb = zzacVar.zzb;
        this.zzc = zzacVar.zzc;
        this.zzd = zzacVar.zzd;
        this.zze = zzacVar.zze;
        this.zzf = zzacVar.zzf;
        this.zzg = zzacVar.zzg;
        this.zzh = zzacVar.zzh;
        this.zzi = zzacVar.zzi;
        this.zzj = zzacVar.zzj;
        this.zzk = zzacVar.zzk;
    }

    @SafeParcelable.Constructor
    public zzac(@Nullable @SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) String str2, @SafeParcelable.Param(m4844id = 4) zzlk zzlkVar, @SafeParcelable.Param(m4844id = 5) long j, @SafeParcelable.Param(m4844id = 6) boolean z, @Nullable @SafeParcelable.Param(m4844id = 7) String str3, @Nullable @SafeParcelable.Param(m4844id = 8) zzau zzauVar, @SafeParcelable.Param(m4844id = 9) long j2, @Nullable @SafeParcelable.Param(m4844id = 10) zzau zzauVar2, @SafeParcelable.Param(m4844id = 11) long j3, @Nullable @SafeParcelable.Param(m4844id = 12) zzau zzauVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzlkVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzauVar;
        this.zzh = j2;
        this.zzi = zzauVar2;
        this.zzj = j3;
        this.zzk = zzauVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes.dex */
public final class zzbug extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbug> CREATOR = new zzbuh();
    @SafeParcelable.Field(m4845id = 1)
    public final Bundle zza;
    @SafeParcelable.Field(m4845id = 2)
    public final zzbzz zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final ApplicationInfo zzc;
    @SafeParcelable.Field(m4845id = 4)
    public final String zzd;
    @SafeParcelable.Field(m4845id = 5)
    public final List zze;
    @Nullable
    @SafeParcelable.Field(m4845id = 6)
    public final PackageInfo zzf;
    @SafeParcelable.Field(m4845id = 7)
    public final String zzg;
    @SafeParcelable.Field(m4845id = 9)
    public final String zzh;
    @Nullable
    @SafeParcelable.Field(m4845id = 10)
    public zzfbt zzi;
    @Nullable
    @SafeParcelable.Field(m4845id = 11)
    public String zzj;
    @SafeParcelable.Field(m4845id = 12)
    public final boolean zzk;
    @SafeParcelable.Field(m4845id = 13)
    public final boolean zzl;

    @SafeParcelable.Constructor
    public zzbug(@SafeParcelable.Param(m4844id = 1) Bundle bundle, @SafeParcelable.Param(m4844id = 2) zzbzz zzbzzVar, @SafeParcelable.Param(m4844id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(m4844id = 4) String str, @SafeParcelable.Param(m4844id = 5) List list, @Nullable @SafeParcelable.Param(m4844id = 6) PackageInfo packageInfo, @SafeParcelable.Param(m4844id = 7) String str2, @SafeParcelable.Param(m4844id = 9) String str3, @SafeParcelable.Param(m4844id = 10) zzfbt zzfbtVar, @SafeParcelable.Param(m4844id = 11) String str4, @SafeParcelable.Param(m4844id = 12) boolean z, @SafeParcelable.Param(m4844id = 13) boolean z2) {
        this.zza = bundle;
        this.zzb = zzbzzVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfbtVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

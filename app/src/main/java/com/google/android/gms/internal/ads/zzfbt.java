package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class zzfbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfbt> CREATOR = new zzfbu();
    @Nullable
    public final Context zza;
    public final zzfbq zzb;
    @SafeParcelable.Field(m4845id = 2)
    public final int zzc;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzd;
    @SafeParcelable.Field(m4845id = 4)
    public final int zze;
    @SafeParcelable.Field(m4845id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfbq[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", m4845id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", m4845id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", m4845id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfbt(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) int i3, @SafeParcelable.Param(m4844id = 4) int i4, @SafeParcelable.Param(m4844id = 5) String str, @SafeParcelable.Param(m4844id = 6) int i5, @SafeParcelable.Param(m4844id = 7) int i6) {
        zzfbq[] values = zzfbq.values();
        this.zzh = values;
        int[] zza = zzfbr.zza();
        this.zzl = zza;
        int[] zza2 = zzfbs.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    private zzfbt(@Nullable Context context, zzfbq zzfbqVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfbq.values();
        this.zzl = zzfbr.zza();
        this.zzm = zzfbs.zza();
        this.zza = context;
        this.zzi = zzfbqVar.ordinal();
        this.zzb = zzfbqVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }

    @Nullable
    public static zzfbt zza(zzfbq zzfbqVar, Context context) {
        if (zzfbqVar == zzfbq.Rewarded) {
            return new zzfbt(context, zzfbqVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzge)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgk)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgm)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgo), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgg), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgi));
        } else if (zzfbqVar == zzfbq.Interstitial) {
            return new zzfbt(context, zzfbqVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgf)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgl)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgn)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgp), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgh), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgj));
        } else if (zzfbqVar == zzfbq.AppOpen) {
            return new zzfbt(context, zzfbqVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgv)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgq), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgr), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgt));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(m4845id = 2)
    public final String zza;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzb;
    @SafeParcelable.Field(m4845id = 4)
    public final int zzc;
    @SafeParcelable.Field(m4845id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(m4845id = 6)
    public final int zze;
    @SafeParcelable.Field(m4845id = 7)
    public final int zzf;
    @SafeParcelable.Field(m4845id = 8)
    public final zzq[] zzg;
    @SafeParcelable.Field(m4845id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(m4845id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(m4845id = 11)
    public boolean zzj;
    @SafeParcelable.Field(m4845id = 12)
    public boolean zzk;
    @SafeParcelable.Field(m4845id = 13)
    public boolean zzl;
    @SafeParcelable.Field(m4845id = 14)
    public boolean zzm;
    @SafeParcelable.Field(m4845id = 15)
    public boolean zzn;
    @SafeParcelable.Field(m4845id = 16)
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzq(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzq.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) int i, @SafeParcelable.Param(m4844id = 4) int i2, @SafeParcelable.Param(m4844id = 5) boolean z, @SafeParcelable.Param(m4844id = 6) int i3, @SafeParcelable.Param(m4844id = 7) int i4, @SafeParcelable.Param(m4844id = 8) zzq[] zzqVarArr, @SafeParcelable.Param(m4844id = 9) boolean z2, @SafeParcelable.Param(m4844id = 10) boolean z3, @SafeParcelable.Param(m4844id = 11) boolean z4, @SafeParcelable.Param(m4844id = 12) boolean z5, @SafeParcelable.Param(m4844id = 13) boolean z6, @SafeParcelable.Param(m4844id = 14) boolean z7, @SafeParcelable.Param(m4844id = 15) boolean z8, @SafeParcelable.Param(m4844id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zzf(displayMetrics) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

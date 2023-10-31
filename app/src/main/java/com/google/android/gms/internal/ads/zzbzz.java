package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzz> CREATOR = new zzcaa();
    @SafeParcelable.Field(m4845id = 2)
    public String zza;
    @SafeParcelable.Field(m4845id = 3)
    public int zzb;
    @SafeParcelable.Field(m4845id = 4)
    public int zzc;
    @SafeParcelable.Field(m4845id = 5)
    public boolean zzd;
    @SafeParcelable.Field(m4845id = 6)
    public boolean zze;

    public zzbzz(int i, int i2, boolean z, boolean z2) {
        this(231700000, i2, true, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbzz(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            java.lang.String r0 = "afma-sdk-a-v"
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = androidx.datastore.preferences.protobuf.C1169e.m11130b(r0, r8, r1, r9, r1)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzz.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    public zzbzz(@SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) int i, @SafeParcelable.Param(m4844id = 4) int i2, @SafeParcelable.Param(m4844id = 5) boolean z, @SafeParcelable.Param(m4844id = 6) boolean z2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }

    public static zzbzz zza() {
        return new zzbzz((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, (int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

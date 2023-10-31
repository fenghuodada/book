package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    static final Scope[] zza = new Scope[0];
    static final Feature[] zzb = new Feature[0];
    @SafeParcelable.VersionField(m4842id = 1)
    final int zzc;
    @SafeParcelable.Field(m4845id = 2)
    final int zzd;
    @SafeParcelable.Field(m4845id = 3)
    final int zze;
    @SafeParcelable.Field(m4845id = 4)
    String zzf;
    @Nullable
    @SafeParcelable.Field(m4845id = 5)
    IBinder zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", m4845id = 6)
    Scope[] zzh;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", m4845id = 7)
    Bundle zzi;
    @Nullable
    @SafeParcelable.Field(m4845id = 8)
    Account zzj;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m4845id = 10)
    Feature[] zzk;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m4845id = 11)
    Feature[] zzl;
    @SafeParcelable.Field(m4845id = 12)
    final boolean zzm;
    @SafeParcelable.Field(defaultValue = "0", m4845id = 13)
    final int zzn;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", m4845id = 14)
    boolean zzo;
    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", m4845id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) int i3, @SafeParcelable.Param(m4844id = 4) String str, @Nullable @SafeParcelable.Param(m4844id = 5) IBinder iBinder, @SafeParcelable.Param(m4844id = 6) Scope[] scopeArr, @SafeParcelable.Param(m4844id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(m4844id = 8) Account account, @SafeParcelable.Param(m4844id = 10) Feature[] featureArr, @SafeParcelable.Param(m4844id = 11) Feature[] featureArr2, @SafeParcelable.Param(m4844id = 12) boolean z, @SafeParcelable.Param(m4844id = 13) int i4, @SafeParcelable.Param(m4844id = 14) boolean z2, @Nullable @SafeParcelable.Param(m4844id = 15) String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i < 2) {
            this.zzj = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z;
        this.zzn = i4;
        this.zzo = z2;
        this.zzp = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.zzp;
    }
}

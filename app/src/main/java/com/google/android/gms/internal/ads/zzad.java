package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzad implements Comparator<zzac>, Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzaa();
    @Nullable
    public final String zza;
    public final int zzb;
    private final zzac[] zzc;
    private int zzd;

    public zzad(Parcel parcel) {
        this.zza = parcel.readString();
        zzac[] zzacVarArr = (zzac[]) parcel.createTypedArray(zzac.CREATOR);
        int i = zzfn.zza;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
    }

    private zzad(@Nullable String str, boolean z, zzac... zzacVarArr) {
        this.zza = str;
        zzacVarArr = z ? (zzac[]) zzacVarArr.clone() : zzacVarArr;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
        Arrays.sort(zzacVarArr, this);
    }

    public zzad(@Nullable String str, zzac... zzacVarArr) {
        this(null, true, zzacVarArr);
    }

    public zzad(List list) {
        this(null, false, (zzac[]) list.toArray(new zzac[0]));
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzac zzacVar, zzac zzacVar2) {
        zzac zzacVar3 = zzacVar;
        zzac zzacVar4 = zzacVar2;
        UUID uuid = zzo.zza;
        return uuid.equals(zzacVar3.zza) ? !uuid.equals(zzacVar4.zza) ? 1 : 0 : zzacVar3.zza.compareTo(zzacVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            if (zzfn.zzB(this.zza, zzadVar.zza) && Arrays.equals(this.zzc, zzadVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzac zza(int i) {
        return this.zzc[i];
    }

    @CheckResult
    public final zzad zzb(@Nullable String str) {
        return zzfn.zzB(this.zza, str) ? this : new zzad(str, false, this.zzc);
    }
}

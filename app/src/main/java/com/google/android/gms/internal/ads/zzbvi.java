package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbvi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvi> CREATOR = new zzbvj();
    @SafeParcelable.Field(m4845id = 2)
    public final String zza;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbvi(@SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Nullable
    public static zzbvi zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvi(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvi)) {
            zzbvi zzbviVar = (zzbvi) obj;
            if (Objects.equal(this.zza, zzbviVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbviVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

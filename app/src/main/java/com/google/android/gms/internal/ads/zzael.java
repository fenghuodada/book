package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzael extends zzaef {
    public static final Parcelable.Creator<zzael> CREATOR = new zzaek();
    public final String zza;
    public final byte[] zzb;

    public zzael(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public zzael(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzael.class == obj.getClass()) {
            zzael zzaelVar = (zzael) obj;
            if (zzfn.zzB(this.zza, zzaelVar.zza) && Arrays.equals(this.zzb, zzaelVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        return C0485b.m12391a(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }
}

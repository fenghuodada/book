package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzads extends zzaef {
    public static final Parcelable.Creator<zzads> CREATOR = new zzadr();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzads(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzfn.zza
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzads.<init>(android.os.Parcel):void");
    }

    public zzads(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzads.class == obj.getClass()) {
            zzads zzadsVar = (zzads) obj;
            if (this.zzf.equals(zzadsVar.zzf) && Arrays.equals(this.zza, zzadsVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;

/* loaded from: classes.dex */
public final class zzaep extends zzaef {
    public static final Parcelable.Creator<zzaep> CREATOR = new zzaeo();
    @Nullable
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaep(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzfn.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaep.<init>(android.os.Parcel):void");
    }

    public zzaep(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaep.class == obj.getClass()) {
            zzaep zzaepVar = (zzaep) obj;
            if (this.zzf.equals(zzaepVar.zzf) && zzfn.zzB(this.zza, zzaepVar.zza) && zzfn.zzB(this.zzb, zzaepVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i = hashCode * 31;
        String str2 = this.zzb;
        return ((i + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        return C0485b.m12391a(this.zzf, ": url=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}

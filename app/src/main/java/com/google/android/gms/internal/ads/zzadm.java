package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;

@Deprecated
/* loaded from: classes.dex */
public class zzadm implements zzbz {
    public static final Parcelable.Creator<zzadm> CREATOR = new zzadl();
    public final String zza;
    public final String zzb;

    public zzadm(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzadm(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadm zzadmVar = (zzadm) obj;
            if (this.zza.equals(zzadmVar.zza) && this.zzb.equals(zzadmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return C0758e.m11827a("VC: ", this.zza, "=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbz
    public final void zza(zzbu zzbuVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzbuVar.zzq(this.zzb);
        } else if (c == 1) {
            zzbuVar.zze(this.zzb);
        } else if (c == 2) {
            zzbuVar.zzd(this.zzb);
        } else if (c == 3) {
            zzbuVar.zzc(this.zzb);
        } else if (c != 4) {
        } else {
            zzbuVar.zzh(this.zzb);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzfkd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkd> CREATOR = new zzfke();
    @SafeParcelable.VersionField(m4842id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", m4845id = 2, type = "byte[]")
    private zzaol zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfkd(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaol zzaolVar = this.zzb;
        if (zzaolVar != null || this.zzc == null) {
            if (zzaolVar == null || this.zzc != null) {
                if (zzaolVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaolVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaol zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaol.zze(this.zzc, zzgoi.zza());
                this.zzc = null;
            } catch (zzgpi | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}

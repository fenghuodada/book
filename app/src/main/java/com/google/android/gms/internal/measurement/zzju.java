package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.C0235r;
import androidx.datastore.preferences.protobuf.C1194j;

/* loaded from: classes3.dex */
final class zzju extends zzjx {
    private final int zzc;

    public zzju(byte[] bArr, int i, int i2) {
        super(bArr);
        zzka.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C0235r.m12816a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(C1194j.m11060a("Index > length: ", i, ", ", i2));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.zzc;
    }
}

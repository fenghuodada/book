package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgnh extends zzgnk {
    private final int zzc;
    private final int zzd;

    public zzgnh(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgno.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk, com.google.android.gms.internal.ads.zzgno
    public final byte zza(int i) {
        zzgno.zzy(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgnk, com.google.android.gms.internal.ads.zzgno
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk, com.google.android.gms.internal.ads.zzgno
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk, com.google.android.gms.internal.ads.zzgno
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}

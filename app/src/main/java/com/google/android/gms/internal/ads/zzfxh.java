package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfxh {
    private final zzgjz zza;

    private zzfxh(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
    }

    public static zzfxh zzb(String str, byte[] bArr, int i) {
        zzgjy zza = zzgjz.zza();
        zza.zzb(str);
        zzgno zzgnoVar = zzgno.zzb;
        zza.zzc(zzgno.zzv(bArr, 0, bArr.length));
        int i2 = i - 1;
        zza.zza(i2 != 0 ? i2 != 1 ? zzgla.RAW : zzgla.LEGACY : zzgla.TINK);
        return new zzfxh((zzgjz) zza.zzal());
    }

    public final zzgjz zza() {
        return this.zza;
    }
}

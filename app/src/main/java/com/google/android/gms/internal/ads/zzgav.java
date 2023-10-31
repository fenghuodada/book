package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class zzgav extends zzgdh {
    public zzgav() {
        super(zzgiv.class, new zzgat(zzfww.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzfyd.zze(new zzgav(), true);
            int i = zzgbf.zza;
            zzgbf.zza(zzgds.zzb());
        }
    }

    public static /* bridge */ /* synthetic */ zzgdf zzh(int i, int i2) {
        zzgix zzc = zzgiy.zzc();
        zzc.zza(i);
        return new zzgdf((zzgiy) zzc.zzal(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgau(this, zzgiy.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgiv.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgiv zzgivVar = (zzgiv) zzgqgVar;
        zzgms.zzb(zzgivVar.zza(), 0);
        zzgms.zza(zzgivVar.zzf().zzd());
    }
}

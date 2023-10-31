package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgbf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzgbb
        }, zzgba.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzgbc
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzgbd
        }, zzgas.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzgbe
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzgay zzgayVar;
                int i = zzgbf.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        zzgiv zze2 = zzgiv.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzgax zzgaxVar = new zzgax(null);
                            zzgaxVar.zza(zze2.zzf().zzd());
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzgayVar = zzgay.zzc;
                                    } else if (ordinal != 4) {
                                        int zza3 = zzc2.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                                    }
                                }
                                zzgayVar = zzgay.zzb;
                            } else {
                                zzgayVar = zzgay.zza;
                            }
                            zzgaxVar.zzb(zzgayVar);
                            zzgba zzc3 = zzgaxVar.zzc();
                            zzgaq zzgaqVar = new zzgaq(null);
                            zzgaqVar.zzc(zzc3);
                            zzgaqVar.zzb(zzgmv.zzb(zze2.zzf().zzA(), zzfyeVar));
                            zzgaqVar.zza(((zzgel) zzgenVar).zzf());
                            return zzgaqVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            }
        }, zza2, zzgel.class);
    }

    public static void zza(zzgds zzgdsVar) throws GeneralSecurityException {
        zzgdsVar.zzf(zzc);
        zzgdsVar.zze(zzd);
        zzgdsVar.zzd(zze);
        zzgdsVar.zzc(zzf);
    }
}

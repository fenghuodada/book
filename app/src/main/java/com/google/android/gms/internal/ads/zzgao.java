package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgao {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzgak
        }, zzgaj.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzgal
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzgam
        }, zzgab.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzgan
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzgah zzgahVar;
                int i = zzgao.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        zzgip zze2 = zzgip.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzgag zzgagVar = new zzgag(null);
                            zzgagVar.zzb(zze2.zzf().zzd());
                            zzgagVar.zza(12);
                            zzgagVar.zzc(16);
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzgahVar = zzgah.zzc;
                                    } else if (ordinal != 4) {
                                        int zza3 = zzc2.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                                    }
                                }
                                zzgahVar = zzgah.zzb;
                            } else {
                                zzgahVar = zzgah.zza;
                            }
                            zzgagVar.zzd(zzgahVar);
                            zzgaj zze3 = zzgagVar.zze();
                            zzfzz zzfzzVar = new zzfzz(null);
                            zzfzzVar.zzc(zze3);
                            zzfzzVar.zzb(zzgmv.zzb(zze2.zzf().zzA(), zzfyeVar));
                            zzfzzVar.zza(((zzgel) zzgenVar).zzf());
                            return zzfzzVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
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

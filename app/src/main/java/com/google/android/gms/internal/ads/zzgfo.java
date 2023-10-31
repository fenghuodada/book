package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzgfo {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzgfk
        }, zzgfj.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzgfl
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzgfm
        }, zzgfa.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzgfn
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzgfh zzgfhVar;
                int i = zzgfo.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zzghi zze2 = zzghi.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzgfg zzgfgVar = new zzgfg(null);
                            zzgfgVar.zza(zze2.zzg().zzd());
                            zzgfgVar.zzb(zze2.zzf().zza());
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal == 1) {
                                zzgfhVar = zzgfh.zza;
                            } else if (ordinal == 2) {
                                zzgfhVar = zzgfh.zzc;
                            } else if (ordinal == 3) {
                                zzgfhVar = zzgfh.zzd;
                            } else if (ordinal != 4) {
                                int zza3 = zzc2.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                            } else {
                                zzgfhVar = zzgfh.zzb;
                            }
                            zzgfgVar.zzc(zzgfhVar);
                            zzgfj zzd2 = zzgfgVar.zzd();
                            zzgey zzgeyVar = new zzgey(null);
                            zzgeyVar.zzc(zzd2);
                            zzgeyVar.zza(zzgmv.zzb(zze2.zzg().zzA(), zzfyeVar));
                            zzgeyVar.zzb(((zzgel) zzgenVar).zzf());
                            return zzgeyVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
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

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzggl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzggh
        }, zzggg.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzggi
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzggj
        }, zzgfw.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzggk
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzggd zzggdVar;
                zzgge zzggeVar;
                int i = zzggl.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        zzgjj zzf2 = zzgjj.zzf(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zzf2.zza() == 0) {
                            zzggc zzggcVar = new zzggc(null);
                            zzggcVar.zzb(zzf2.zzh().zzd());
                            zzggcVar.zzc(zzf2.zzg().zza());
                            int zzg = zzf2.zzg().zzg();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int i2 = zzg - 2;
                            if (i2 == 1) {
                                zzggdVar = zzggd.zza;
                            } else if (i2 == 2) {
                                zzggdVar = zzggd.zzd;
                            } else if (i2 == 3) {
                                zzggdVar = zzggd.zzc;
                            } else if (i2 == 4) {
                                zzggdVar = zzggd.zze;
                            } else if (i2 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + zzgjg.zza(zzg));
                            } else {
                                zzggdVar = zzggd.zzb;
                            }
                            zzggcVar.zza(zzggdVar);
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            int ordinal = zzc2.ordinal();
                            if (ordinal == 1) {
                                zzggeVar = zzgge.zza;
                            } else if (ordinal == 2) {
                                zzggeVar = zzgge.zzc;
                            } else if (ordinal == 3) {
                                zzggeVar = zzgge.zzd;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                            } else {
                                zzggeVar = zzgge.zzb;
                            }
                            zzggcVar.zzd(zzggeVar);
                            zzggg zze2 = zzggcVar.zze();
                            zzgfu zzgfuVar = new zzgfu(null);
                            zzgfuVar.zzc(zze2);
                            zzgfuVar.zzb(zzgmv.zzb(zzf2.zzh().zzA(), zzfyeVar));
                            zzgfuVar.zza(((zzgel) zzgenVar).zzf());
                            return zzgfuVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
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

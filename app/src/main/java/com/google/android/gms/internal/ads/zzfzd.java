package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfzd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzfyz
        }, zzfyy.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfza
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzfzb
        }, zzfyp.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzfzc
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzfyv zzfyvVar;
                zzfyw zzfywVar;
                int i = zzfzd.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        zzghr zze2 = zzghr.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzfyu zzfyuVar = new zzfyu(null);
                            zzfyuVar.zza(zze2.zzf().zzh().zzd());
                            zzfyuVar.zzc(zze2.zzg().zzh().zzd());
                            zzfyuVar.zzd(zze2.zzg().zzg().zza());
                            int zzg = zze2.zzg().zzg().zzg();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int i2 = zzg - 2;
                            if (i2 == 1) {
                                zzfyvVar = zzfyv.zza;
                            } else if (i2 == 2) {
                                zzfyvVar = zzfyv.zzd;
                            } else if (i2 == 3) {
                                zzfyvVar = zzfyv.zzc;
                            } else if (i2 == 4) {
                                zzfyvVar = zzfyv.zze;
                            } else if (i2 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + zzgjg.zza(zzg));
                            } else {
                                zzfyvVar = zzfyv.zzb;
                            }
                            zzfyuVar.zzb(zzfyvVar);
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzfywVar = zzfyw.zzc;
                                    } else if (ordinal != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                    }
                                }
                                zzfywVar = zzfyw.zzb;
                            } else {
                                zzfywVar = zzfyw.zza;
                            }
                            zzfyuVar.zze(zzfywVar);
                            zzfyy zzf2 = zzfyuVar.zzf();
                            zzfyn zzfynVar = new zzfyn(null);
                            zzfynVar.zzd(zzf2);
                            zzfynVar.zza(zzgmv.zzb(zze2.zzf().zzh().zzA(), zzfyeVar));
                            zzfynVar.zzb(zzgmv.zzb(zze2.zzg().zzh().zzA(), zzfyeVar));
                            zzfynVar.zzc(((zzgel) zzgenVar).zzf());
                            return zzfynVar.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
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

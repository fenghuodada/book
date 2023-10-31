package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfzx {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzfzt
        }, zzfzs.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfzu
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzfzv
        }, zzfzk.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzfzw
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzfzq zzfzqVar;
                int i = zzfzx.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        zzgig zze2 = zzgig.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzfzp zzfzpVar = new zzfzp(null);
                            zzfzpVar.zzb(zze2.zzg().zzd());
                            zzfzpVar.zza(zze2.zzf().zza());
                            zzfzpVar.zzc(16);
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzfzqVar = zzfzq.zzc;
                                    } else if (ordinal != 4) {
                                        int zza3 = zzc2.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                                    }
                                }
                                zzfzqVar = zzfzq.zzb;
                            } else {
                                zzfzqVar = zzfzq.zza;
                            }
                            zzfzpVar.zzd(zzfzqVar);
                            zzfzs zze3 = zzfzpVar.zze();
                            zzfzi zzfziVar = new zzfzi(null);
                            zzfziVar.zzc(zze3);
                            zzfziVar.zzb(zzgmv.zzb(zze2.zzg().zzA(), zzfyeVar));
                            zzfziVar.zza(((zzgel) zzgenVar).zzf());
                            return zzfziVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
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

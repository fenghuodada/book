package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgci {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzgce
        }, zzgcd.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzgcf
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzgcg
        }, zzgby.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzgcc zzgccVar;
                int i = zzgci.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        zzglg zze2 = zzglg.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzgccVar = zzgcc.zzc;
                                    } else if (ordinal != 4) {
                                        int zza3 = zzc2.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                                    }
                                }
                                zzgccVar = zzgcc.zzb;
                            } else {
                                zzgccVar = zzgcc.zza;
                            }
                            return zzgby.zza(zzgccVar, zzgmv.zzb(zze2.zzf().zzA(), zzfyeVar), ((zzgel) zzgenVar).zzf());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
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

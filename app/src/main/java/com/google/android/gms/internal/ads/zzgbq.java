package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgbq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmu zzb;
    private static final zzgea zzc;
    private static final zzgdw zzd;
    private static final zzgde zze;
    private static final zzgda zzf;

    static {
        zzgmu zza2 = zzgew.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgea.zza(new zzgdy() { // from class: com.google.android.gms.internal.ads.zzgbm
        }, zzgbl.class, zzgem.class);
        zzd = zzgdw.zza(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzgbn
        }, zza2, zzgem.class);
        zze = zzgde.zza(new zzgdc() { // from class: com.google.android.gms.internal.ads.zzgbo
        }, zzgbg.class, zzgel.class);
        zzf = zzgda.zzb(new zzgcy() { // from class: com.google.android.gms.internal.ads.zzgbp
            @Override // com.google.android.gms.internal.ads.zzgcy
            public final zzfxb zza(zzgen zzgenVar, zzfye zzfyeVar) {
                zzgbk zzgbkVar;
                int i = zzgbq.zza;
                if (((zzgel) zzgenVar).zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        zzgjb zze2 = zzgjb.zze(((zzgel) zzgenVar).zze(), zzgoi.zza());
                        if (zze2.zza() == 0) {
                            zzgla zzc2 = ((zzgel) zzgenVar).zzc();
                            zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        zzgbkVar = zzgbk.zzc;
                                    } else if (ordinal != 4) {
                                        int zza3 = zzc2.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                                    }
                                }
                                zzgbkVar = zzgbk.zzb;
                            } else {
                                zzgbkVar = zzgbk.zza;
                            }
                            return zzgbg.zza(zzgbkVar, zzgmv.zzb(zze2.zzf().zzA(), zzfyeVar), ((zzgel) zzgenVar).zzf());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgpi unused) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
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

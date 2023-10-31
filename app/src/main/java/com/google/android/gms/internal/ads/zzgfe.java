package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgfe extends zzgdh {
    private static final zzgee zza = zzgee.zzb(new zzgec() { // from class: com.google.android.gms.internal.ads.zzgfb
        @Override // com.google.android.gms.internal.ads.zzgec
        public final Object zza(zzfxb zzfxbVar) {
            return new zzggt((zzgfa) zzfxbVar);
        }
    }, zzgfa.class, zzgfp.class);

    public zzgfe() {
        super(zzghi.class, new zzgfc(zzfxs.class));
    }

    public static void zzm(boolean z) throws GeneralSecurityException {
        zzfyd.zze(new zzgfe(), true);
        int i = zzgfo.zza;
        zzgfo.zza(zzgds.zzb());
        zzgdr.zza().zze(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgho zzghoVar) throws GeneralSecurityException {
        if (zzghoVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzghoVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgfd(this, zzghl.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzghi.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghi zzghiVar = (zzghi) zzgqgVar;
        zzgms.zzb(zzghiVar.zza(), 0);
        zzo(zzghiVar.zzg().zzd());
        zzn(zzghiVar.zzf());
    }
}

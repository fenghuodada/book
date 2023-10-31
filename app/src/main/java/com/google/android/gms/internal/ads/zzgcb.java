package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgcb extends zzgdh {
    public zzgcb() {
        super(zzglg.class, new zzgbz(zzfww.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgca(this, zzglj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzglg.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzglg zzglgVar = (zzglg) zzgqgVar;
        zzgms.zzb(zzglgVar.zza(), 0);
        if (zzglgVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgbj extends zzgdh {
    public zzgbj() {
        super(zzgjb.class, new zzgbh(zzfww.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgbi(this, zzgje.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgjb.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgjb zzgjbVar = (zzgjb) zzgqgVar;
        zzgms.zzb(zzgjbVar.zza(), 0);
        if (zzgjbVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}

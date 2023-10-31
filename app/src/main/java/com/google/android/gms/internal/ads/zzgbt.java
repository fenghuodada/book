package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgbt extends zzgdh {
    public zzgbt() {
        super(zzgkp.class, new zzgbr(zzfww.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgbs(this, zzgks.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgkp.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgms.zzb(((zzgkp) zzgqgVar).zza(), 0);
    }
}

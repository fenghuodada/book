package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfzg extends zzgdh {
    public zzfzg() {
        super(zzghx.class, new zzfze(zzgmk.class));
    }

    public static final void zzh(zzghx zzghxVar) throws GeneralSecurityException {
        zzgms.zzb(zzghxVar.zza(), 0);
        zzgms.zza(zzghxVar.zzh().zzd());
        zzm(zzghxVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgid zzgidVar) throws GeneralSecurityException {
        if (zzgidVar.zza() < 12 || zzgidVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzfzf(this, zzgia.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzghx.zzf(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzh((zzghx) zzgqgVar);
    }
}

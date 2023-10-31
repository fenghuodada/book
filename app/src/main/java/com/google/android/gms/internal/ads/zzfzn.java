package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfzn extends zzgdh {
    public zzfzn() {
        super(zzgig.class, new zzfzl(zzfww.class));
    }

    public static /* bridge */ /* synthetic */ zzgdf zzg(int i, int i2, int i3) {
        zzgii zzc = zzgij.zzc();
        zzc.zza(i);
        zzgil zzc2 = zzgim.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgim) zzc2.zzal());
        return new zzgdf((zzgij) zzc.zzal(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzfzm(this, zzgij.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgig.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgig zzgigVar = (zzgig) zzgqgVar;
        zzgms.zzb(zzgigVar.zza(), 0);
        zzgms.zza(zzgigVar.zzg().zzd());
        if (zzgigVar.zzf().zza() != 12 && zzgigVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}

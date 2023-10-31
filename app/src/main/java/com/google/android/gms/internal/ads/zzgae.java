package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgae extends zzgdh {
    public zzgae() {
        super(zzgip.class, new zzgac(zzfww.class));
    }

    public static /* bridge */ /* synthetic */ zzgdf zzg(int i, int i2) {
        zzgir zzc = zzgis.zzc();
        zzc.zza(i);
        return new zzgdf((zzgis) zzc.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgad(this, zzgis.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgip.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgip zzgipVar = (zzgip) zzgqgVar;
        zzgms.zzb(zzgipVar.zza(), 0);
        zzgms.zza(zzgipVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final int zzf() {
        return 2;
    }
}

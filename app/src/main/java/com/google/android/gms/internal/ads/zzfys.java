package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfys extends zzgdh {
    public zzfys() {
        super(zzghr.class, new zzfyq(zzfww.class));
    }

    public static /* bridge */ /* synthetic */ zzgdf zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzghz zzc = zzgia.zzc();
        zzgic zzc2 = zzgid.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgid) zzc2.zzal());
        zzc.zza(i);
        zzgjl zzc3 = zzgjm.zzc();
        zzgjo zzc4 = zzgjp.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzgjp) zzc4.zzal());
        zzc3.zza(32);
        zzght zza = zzghu.zza();
        zza.zza((zzgia) zzc.zzal());
        zza.zzb((zzgjm) zzc3.zzal());
        return new zzgdf((zzghu) zza.zzal(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzfyr(this, zzghu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzghr.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghr zzghrVar = (zzghr) zzgqgVar;
        zzgms.zzb(zzghrVar.zza(), 0);
        new zzfzg();
        zzfzg.zzh(zzghrVar.zzf());
        new zzgga();
        zzgga.zzm(zzghrVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final int zzf() {
        return 2;
    }
}

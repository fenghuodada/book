package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgga extends zzgdh {
    private static final zzgee zza = zzgee.zzb(new zzgec() { // from class: com.google.android.gms.internal.ads.zzgfx
        @Override // com.google.android.gms.internal.ads.zzgec
        public final Object zza(zzfxb zzfxbVar) {
            return new zzggu((zzgfw) zzfxbVar);
        }
    }, zzgfw.class, zzgfp.class);

    public zzgga() {
        super(zzgjj.class, new zzgfy(zzfxs.class));
    }

    public static void zzh(boolean z) throws GeneralSecurityException {
        zzfyd.zze(new zzgga(), true);
        int i = zzggl.zza;
        zzggl.zza(zzgds.zzb());
        zzgdr.zza().zze(zza);
    }

    public static final void zzm(zzgjj zzgjjVar) throws GeneralSecurityException {
        zzgms.zzb(zzgjjVar.zza(), 0);
        if (zzgjjVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzo(zzgjjVar.zzg());
    }

    public static /* bridge */ /* synthetic */ zzgdf zzn(int i, int i2, int i3, int i4) {
        zzgjl zzc = zzgjm.zzc();
        zzgjo zzc2 = zzgjp.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzgjp) zzc2.zzal());
        zzc.zza(i);
        return new zzgdf((zzgjm) zzc.zzal(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzgjp zzgjpVar) throws GeneralSecurityException {
        if (zzgjpVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzgjpVar.zzg() - 2;
        if (zzg == 1) {
            if (zzgjpVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 2) {
            if (zzgjpVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 3) {
            if (zzgjpVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzgjpVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (zzgjpVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgdg zza() {
        return new zzgfz(this, zzgjm.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final zzgjt zzb() {
        return zzgjt.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* synthetic */ zzgqg zzc(zzgno zzgnoVar) throws zzgpi {
        return zzgjj.zzf(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final /* bridge */ /* synthetic */ void zze(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzm((zzgjj) zzgqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final int zzf() {
        return 2;
    }
}

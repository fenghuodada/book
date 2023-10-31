package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzgqk implements zzgqz {
    private final zzgqg zza;
    private final zzgrq zzb;
    private final boolean zzc;
    private final zzgoj zzd;

    private zzgqk(zzgrq zzgrqVar, zzgoj zzgojVar, zzgqg zzgqgVar) {
        this.zzb = zzgrqVar;
        this.zzc = zzgojVar.zzh(zzgqgVar);
        this.zzd = zzgojVar;
        this.zza = zzgqgVar;
    }

    public static zzgqk zzc(zzgrq zzgrqVar, zzgoj zzgojVar, zzgqg zzgqgVar) {
        return new zzgqk(zzgrqVar, zzgojVar, zzgqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final int zza(Object obj) {
        zzgrq zzgrqVar = this.zzb;
        int zzb = zzgrqVar.zzb(zzgrqVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final Object zze() {
        zzgqg zzgqgVar = this.zza;
        return zzgqgVar instanceof zzgow ? ((zzgow) zzgqgVar).zzaD() : zzgqgVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzg(Object obj, Object obj2) {
        zzgrb.zzC(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzh(Object obj, zzgqr zzgqrVar, zzgoi zzgoiVar) throws IOException {
        boolean zzO;
        zzgrq zzgrqVar = this.zzb;
        zzgoj zzgojVar = this.zzd;
        Object zzc = zzgrqVar.zzc(obj);
        zzgon zzb = zzgojVar.zzb(obj);
        while (zzgqrVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgqrVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgojVar.zzc(zzgoiVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgojVar.zzf(zzgqrVar, zzc2, zzgoiVar, zzb);
                        } else {
                            zzO = zzgrqVar.zzp(zzc, zzgqrVar);
                        }
                    } else {
                        zzO = zzgqrVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    zzgno zzgnoVar = null;
                    while (zzgqrVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgqrVar.zzd();
                        if (zzd2 == 16) {
                            i = zzgqrVar.zzj();
                            obj2 = zzgojVar.zzc(zzgoiVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgojVar.zzf(zzgqrVar, obj2, zzgoiVar, zzb);
                            } else {
                                zzgnoVar = zzgqrVar.zzp();
                            }
                        } else if (!zzgqrVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgqrVar.zzd() != 12) {
                        throw zzgpi.zzb();
                    } else if (zzgnoVar != null) {
                        if (obj2 != null) {
                            zzgojVar.zzg(zzgnoVar, obj2, zzgoiVar, zzb);
                        } else {
                            zzgrqVar.zzk(zzc, i, zzgnoVar);
                        }
                    }
                }
            } finally {
                zzgrqVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgna zzgnaVar) throws IOException {
        zzgow zzgowVar = (zzgow) obj;
        if (zzgowVar.zzc == zzgrr.zzc()) {
            zzgowVar.zzc = zzgrr.zzf();
        }
        zzgot zzgotVar = (zzgot) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final void zzm(Object obj, zzgoe zzgoeVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}

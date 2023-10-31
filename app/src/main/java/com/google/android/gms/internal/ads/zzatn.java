package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzatn extends zzgow implements zzgqh {
    private static final zzatn zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzatn zzatnVar = new zzatn();
        zzb = zzatnVar;
        zzgow.zzaU(zzatn.class, zzatnVar);
    }

    private zzatn() {
    }

    public static zzatm zze() {
        return (zzatm) zzb.zzaA();
    }

    public static zzatn zzg() {
        return zzb;
    }

    public static zzatn zzh(zzgno zzgnoVar) throws zzgpi {
        return (zzatn) zzgow.zzaE(zzb, zzgnoVar);
    }

    public static zzatn zzi(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzatn) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzl(zzatn zzatnVar, String str) {
        str.getClass();
        zzatnVar.zzd |= 1;
        zzatnVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzatn zzatnVar, long j) {
        zzatnVar.zzd |= 16;
        zzatnVar.zzi = j;
    }

    public static /* synthetic */ void zzn(zzatn zzatnVar, String str) {
        str.getClass();
        zzatnVar.zzd |= 2;
        zzatnVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzatn zzatnVar, long j) {
        zzatnVar.zzd |= 4;
        zzatnVar.zzg = j;
    }

    public static /* synthetic */ void zzp(zzatn zzatnVar, long j) {
        zzatnVar.zzd |= 8;
        zzatnVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzatm(null);
                }
                return new zzatn();
            }
            return zzgow.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}

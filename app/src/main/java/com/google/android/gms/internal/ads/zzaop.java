package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaop extends zzgow implements zzgqh {
    private static final zzaop zzb;
    private int zzd;
    private zzgno zze;
    private zzgno zzf;
    private zzgno zzg;
    private zzgno zzh;

    static {
        zzaop zzaopVar = new zzaop();
        zzb = zzaopVar;
        zzgow.zzaU(zzaop.class, zzaopVar);
    }

    private zzaop() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zze = zzgnoVar;
        this.zzf = zzgnoVar;
        this.zzg = zzgnoVar;
        this.zzh = zzgnoVar;
    }

    public static zzaoo zza() {
        return (zzaoo) zzb.zzaA();
    }

    public static zzaop zzd(byte[] bArr, zzgoi zzgoiVar) throws zzgpi {
        return (zzaop) zzgow.zzaI(zzb, bArr, zzgoiVar);
    }

    public static /* synthetic */ void zzi(zzaop zzaopVar, zzgno zzgnoVar) {
        zzaopVar.zzd |= 1;
        zzaopVar.zze = zzgnoVar;
    }

    public static /* synthetic */ void zzj(zzaop zzaopVar, zzgno zzgnoVar) {
        zzaopVar.zzd |= 2;
        zzaopVar.zzf = zzgnoVar;
    }

    public static /* synthetic */ void zzk(zzaop zzaopVar, zzgno zzgnoVar) {
        zzaopVar.zzd |= 4;
        zzaopVar.zzg = zzgnoVar;
    }

    public static /* synthetic */ void zzl(zzaop zzaopVar, zzgno zzgnoVar) {
        zzaopVar.zzd |= 8;
        zzaopVar.zzh = zzgnoVar;
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
                    return new zzaoo(null);
                }
                return new zzaop();
            }
            return zzgow.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgno zze() {
        return this.zze;
    }

    public final zzgno zzf() {
        return this.zzf;
    }

    public final zzgno zzg() {
        return this.zzh;
    }

    public final zzgno zzh() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgth extends zzgow implements zzgqh {
    private static final zzgth zzb;
    private int zzd;
    private zzgno zze;
    private zzgno zzf;
    private byte zzg = 2;

    static {
        zzgth zzgthVar = new zzgth();
        zzb = zzgthVar;
        zzgow.zzaU(zzgth.class, zzgthVar);
    }

    private zzgth() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zze = zzgnoVar;
        this.zzf = zzgnoVar;
    }

    public static zzgtg zza() {
        return (zzgtg) zzb.zzaA();
    }

    public static /* synthetic */ zzgth zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzgth zzgthVar, zzgno zzgnoVar) {
        zzgthVar.zzd |= 1;
        zzgthVar.zze = zzgnoVar;
    }

    public static /* synthetic */ void zze(zzgth zzgthVar, zzgno zzgnoVar) {
        zzgthVar.zzd |= 2;
        zzgthVar.zzf = zzgnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgtg(null);
                }
                return new zzgth();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}

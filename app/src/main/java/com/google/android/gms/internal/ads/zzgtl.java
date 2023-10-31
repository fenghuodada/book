package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtl extends zzgow implements zzgqh {
    private static final zzgtl zzb;
    private int zzd;
    private zzgtk zze;
    private zzgno zzg;
    private zzgno zzh;
    private int zzi;
    private byte zzj = 2;
    private zzgpf zzf = zzgow.zzaN();

    static {
        zzgtl zzgtlVar = new zzgtl();
        zzb = zzgtlVar;
        zzgow.zzaU(zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zzg = zzgnoVar;
        this.zzh = zzgnoVar;
    }

    public static zzgti zza() {
        return (zzgti) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgtl zzgtlVar, zzgth zzgthVar) {
        zzgthVar.getClass();
        zzgpf zzgpfVar = zzgtlVar.zzf;
        if (!zzgpfVar.zzc()) {
            zzgtlVar.zzf = zzgow.zzaO(zzgpfVar);
        }
        zzgtlVar.zzf.add(zzgthVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgti(null);
                }
                return new zzgtl();
            }
            return zzgow.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgth.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}

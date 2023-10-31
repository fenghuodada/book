package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzghl extends zzgow implements zzgqh {
    private static final zzghl zzb;
    private int zzd;
    private zzgho zze;

    static {
        zzghl zzghlVar = new zzghl();
        zzb = zzghlVar;
        zzgow.zzaU(zzghl.class, zzghlVar);
    }

    private zzghl() {
    }

    public static zzghk zzc() {
        return (zzghk) zzb.zzaA();
    }

    public static zzghl zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzghl) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzh(zzghl zzghlVar, zzgho zzghoVar) {
        zzghoVar.getClass();
        zzghlVar.zze = zzghoVar;
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzghk(null);
                }
                return new zzghl();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgho zzf() {
        zzgho zzghoVar = this.zze;
        return zzghoVar == null ? zzgho.zze() : zzghoVar;
    }
}

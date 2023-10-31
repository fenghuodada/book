package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgkv extends zzgow implements zzgqh {
    private static final zzgkv zzb;
    private int zzd;
    private zzgky zze;

    static {
        zzgkv zzgkvVar = new zzgkv();
        zzb = zzgkvVar;
        zzgow.zzaU(zzgkv.class, zzgkvVar);
    }

    private zzgkv() {
    }

    public static zzgku zzc() {
        return (zzgku) zzb.zzaA();
    }

    public static zzgkv zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgkv) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzh(zzgkv zzgkvVar, zzgky zzgkyVar) {
        zzgkyVar.getClass();
        zzgkvVar.zze = zzgkyVar;
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
                    return new zzgku(null);
                }
                return new zzgkv();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgky zzf() {
        zzgky zzgkyVar = this.zze;
        return zzgkyVar == null ? zzgky.zzd() : zzgkyVar;
    }
}

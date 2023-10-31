package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgij extends zzgow implements zzgqh {
    private static final zzgij zzb;
    private zzgim zzd;
    private int zze;

    static {
        zzgij zzgijVar = new zzgij();
        zzb = zzgijVar;
        zzgow.zzaU(zzgij.class, zzgijVar);
    }

    private zzgij() {
    }

    public static zzgii zzc() {
        return (zzgii) zzb.zzaA();
    }

    public static zzgij zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgij) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzg(zzgij zzgijVar, zzgim zzgimVar) {
        zzgimVar.getClass();
        zzgijVar.zzd = zzgimVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgii(null);
                }
                return new zzgij();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgim zzf() {
        zzgim zzgimVar = this.zzd;
        return zzgimVar == null ? zzgim.zze() : zzgimVar;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzghu extends zzgow implements zzgqh {
    private static final zzghu zzb;
    private zzgia zzd;
    private zzgjm zze;

    static {
        zzghu zzghuVar = new zzghu();
        zzb = zzghuVar;
        zzgow.zzaU(zzghu.class, zzghuVar);
    }

    private zzghu() {
    }

    public static zzght zza() {
        return (zzght) zzb.zzaA();
    }

    public static zzghu zzd(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzghu) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzg(zzghu zzghuVar, zzgia zzgiaVar) {
        zzgiaVar.getClass();
        zzghuVar.zzd = zzgiaVar;
    }

    public static /* synthetic */ void zzh(zzghu zzghuVar, zzgjm zzgjmVar) {
        zzgjmVar.getClass();
        zzghuVar.zze = zzgjmVar;
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
                    return new zzght(null);
                }
                return new zzghu();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgia zze() {
        zzgia zzgiaVar = this.zzd;
        return zzgiaVar == null ? zzgia.zze() : zzgiaVar;
    }

    public final zzgjm zzf() {
        zzgjm zzgjmVar = this.zze;
        return zzgjmVar == null ? zzgjm.zze() : zzgjmVar;
    }
}

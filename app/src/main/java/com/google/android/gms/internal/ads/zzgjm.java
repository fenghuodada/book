package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjm extends zzgow implements zzgqh {
    private static final zzgjm zzb;
    private zzgjp zzd;
    private int zze;
    private int zzf;

    static {
        zzgjm zzgjmVar = new zzgjm();
        zzb = zzgjmVar;
        zzgow.zzaU(zzgjm.class, zzgjmVar);
    }

    private zzgjm() {
    }

    public static zzgjl zzc() {
        return (zzgjl) zzb.zzaA();
    }

    public static zzgjm zze() {
        return zzb;
    }

    public static zzgjm zzf(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgjm) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzh(zzgjm zzgjmVar, zzgjp zzgjpVar) {
        zzgjpVar.getClass();
        zzgjmVar.zzd = zzgjpVar;
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
                    return new zzgjl(null);
                }
                return new zzgjm();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjp zzg() {
        zzgjp zzgjpVar = this.zzd;
        return zzgjpVar == null ? zzgjp.zze() : zzgjpVar;
    }
}

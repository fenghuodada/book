package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgia extends zzgow implements zzgqh {
    private static final zzgia zzb;
    private zzgid zzd;
    private int zze;

    static {
        zzgia zzgiaVar = new zzgia();
        zzb = zzgiaVar;
        zzgow.zzaU(zzgia.class, zzgiaVar);
    }

    private zzgia() {
    }

    public static zzghz zzc() {
        return (zzghz) zzb.zzaA();
    }

    public static zzgia zze() {
        return zzb;
    }

    public static zzgia zzf(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgia) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzh(zzgia zzgiaVar, zzgid zzgidVar) {
        zzgidVar.getClass();
        zzgiaVar.zzd = zzgidVar;
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
                    return new zzghz(null);
                }
                return new zzgia();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgid zzg() {
        zzgid zzgidVar = this.zzd;
        return zzgidVar == null ? zzgid.zze() : zzgidVar;
    }
}

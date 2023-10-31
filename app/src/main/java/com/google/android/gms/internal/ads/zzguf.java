package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzguf extends zzgow implements zzgqh {
    private static final zzguf zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzguf zzgufVar = new zzguf();
        zzb = zzgufVar;
        zzgow.zzaU(zzguf.class, zzgufVar);
    }

    private zzguf() {
    }

    public static zzgue zza() {
        return (zzgue) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzguf zzgufVar, String str) {
        zzgufVar.zzd |= 1;
        zzgufVar.zze = str;
    }

    public static /* synthetic */ void zze(zzguf zzgufVar, long j) {
        zzgufVar.zzd |= 2;
        zzgufVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzguf zzgufVar, boolean z) {
        zzgufVar.zzd |= 4;
        zzgufVar.zzg = z;
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
                    return new zzgue(null);
                }
                return new zzguf();
            }
            return zzgow.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgug.zza, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}

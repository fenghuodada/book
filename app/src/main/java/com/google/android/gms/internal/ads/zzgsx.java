package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgsx extends zzgow implements zzgqh {
    private static final zzgsx zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgsx zzgsxVar = new zzgsx();
        zzb = zzgsxVar;
        zzgow.zzaU(zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static zzgsw zza() {
        return (zzgsw) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgsx zzgsxVar, String str) {
        zzgsxVar.zzd |= 1;
        zzgsxVar.zze = str;
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
                    return new zzgsw(null);
                }
                return new zzgsx();
            }
            return zzgow.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}

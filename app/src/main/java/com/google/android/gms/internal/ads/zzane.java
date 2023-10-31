package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzane extends zzgow implements zzgqh {
    private static final zzane zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzgpf zzp = zzgow.zzaN();

    static {
        zzane zzaneVar = new zzane();
        zzb = zzaneVar;
        zzgow.zzaU(zzane.class, zzaneVar);
    }

    private zzane() {
    }

    public static zzana zza() {
        return (zzana) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzane zzaneVar, long j) {
        zzaneVar.zzd |= 2;
        zzaneVar.zzf = j;
    }

    public static /* synthetic */ void zze(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzd |= 4;
        zzaneVar.zzg = str;
    }

    public static /* synthetic */ void zzf(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzd |= 8;
        zzaneVar.zzh = str;
    }

    public static /* synthetic */ void zzg(zzane zzaneVar, String str) {
        zzaneVar.zzd |= 16;
        zzaneVar.zzi = str;
    }

    public static /* synthetic */ void zzh(zzane zzaneVar, String str) {
        zzaneVar.zzd |= 1024;
        zzaneVar.zzo = str;
    }

    public static /* synthetic */ void zzi(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzd |= 1;
        zzaneVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzane zzaneVar, int i) {
        zzaneVar.zzq = i - 1;
        zzaneVar.zzd |= 2048;
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
                    return new zzana(null);
                }
                return new zzane();
            }
            return zzgow.zzaR(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzanc.class, "zzq", zzand.zza});
        }
        return (byte) 1;
    }
}

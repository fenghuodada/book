package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgud extends zzgow implements zzgqh {
    private static final zzgud zzb;
    private int zzd;
    private int zze;
    private zzgtl zzg;
    private zzgtp zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgpb zzj = zzgow.zzaJ();
    private String zzk = "";
    private zzgpf zzm = zzgow.zzaN();

    static {
        zzgud zzgudVar = new zzgud();
        zzb = zzgudVar;
        zzgow.zzaU(zzgud.class, zzgudVar);
    }

    private zzgud() {
    }

    public static zzguc zzc() {
        return (zzguc) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzgud zzgudVar, int i) {
        zzgudVar.zzd |= 1;
        zzgudVar.zze = i;
    }

    public static /* synthetic */ void zzg(zzgud zzgudVar, String str) {
        str.getClass();
        zzgudVar.zzd |= 2;
        zzgudVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgud zzgudVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgudVar.zzg = zzgtlVar;
        zzgudVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzgud zzgudVar, String str) {
        str.getClass();
        zzgpf zzgpfVar = zzgudVar.zzm;
        if (!zzgpfVar.zzc()) {
            zzgudVar.zzm = zzgow.zzaO(zzgpfVar);
        }
        zzgudVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgud zzgudVar, int i) {
        zzgudVar.zzl = i - 1;
        zzgudVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzn = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzguc(null);
                }
                return new zzgud();
            }
            return zzgow.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgua.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final String zze() {
        return this.zzf;
    }
}

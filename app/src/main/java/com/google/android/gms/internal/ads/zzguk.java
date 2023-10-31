package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzguk extends zzgow implements zzgqh {
    private static final zzguk zzb;
    private zzgtb zzB;
    private zzgst zzD;
    private zzgtu zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private zzgsx zzj;
    private zzgtx zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzguf zzu;
    private boolean zzv;
    private zzguj zzz;
    private byte zzH = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgpf zzk = zzgow.zzaN();
    private zzgpf zzl = zzgow.zzaN();
    private String zzm = "";
    private zzgpf zzp = zzgow.zzaN();
    private String zzq = "";
    private zzgno zzt = zzgno.zzb;
    private String zzw = "";
    private zzgpf zzx = zzgow.zzaN();
    private zzgpf zzy = zzgow.zzaN();
    private zzgpf zzA = zzgow.zzaN();
    private String zzC = "";
    private zzgpf zzE = zzgow.zzaN();

    static {
        zzguk zzgukVar = new zzguk();
        zzb = zzgukVar;
        zzgow.zzaU(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzgsv zza() {
        return (zzgsv) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzguk zzgukVar, String str) {
        str.getClass();
        zzgukVar.zzd |= 4;
        zzgukVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzguk zzgukVar, String str) {
        str.getClass();
        zzgukVar.zzd |= 8;
        zzgukVar.zzh = str;
    }

    public static /* synthetic */ void zzi(zzguk zzgukVar, zzgsx zzgsxVar) {
        zzgsxVar.getClass();
        zzgukVar.zzj = zzgsxVar;
        zzgukVar.zzd |= 32;
    }

    public static /* synthetic */ void zzj(zzguk zzgukVar, zzgud zzgudVar) {
        zzgudVar.getClass();
        zzgpf zzgpfVar = zzgukVar.zzk;
        if (!zzgpfVar.zzc()) {
            zzgukVar.zzk = zzgow.zzaO(zzgpfVar);
        }
        zzgukVar.zzk.add(zzgudVar);
    }

    public static /* synthetic */ void zzk(zzguk zzgukVar, String str) {
        zzgukVar.zzd |= 64;
        zzgukVar.zzm = str;
    }

    public static /* synthetic */ void zzl(zzguk zzgukVar) {
        zzgukVar.zzd &= -65;
        zzgukVar.zzm = zzb.zzm;
    }

    public static /* synthetic */ void zzm(zzguk zzgukVar, zzgtx zzgtxVar) {
        zzgtxVar.getClass();
        zzgukVar.zzn = zzgtxVar;
        zzgukVar.zzd |= 128;
    }

    public static /* synthetic */ void zzn(zzguk zzgukVar, zzguf zzgufVar) {
        zzgufVar.getClass();
        zzgukVar.zzu = zzgufVar;
        zzgukVar.zzd |= 8192;
    }

    public static /* synthetic */ void zzo(zzguk zzgukVar, Iterable iterable) {
        zzgpf zzgpfVar = zzgukVar.zzx;
        if (!zzgpfVar.zzc()) {
            zzgukVar.zzx = zzgow.zzaO(zzgpfVar);
        }
        zzgmx.zzav(iterable, zzgukVar.zzx);
    }

    public static /* synthetic */ void zzp(zzguk zzgukVar, Iterable iterable) {
        zzgpf zzgpfVar = zzgukVar.zzy;
        if (!zzgpfVar.zzc()) {
            zzgukVar.zzy = zzgow.zzaO(zzgpfVar);
        }
        zzgmx.zzav(iterable, zzgukVar.zzy);
    }

    public static /* synthetic */ void zzq(zzguk zzgukVar, int i) {
        zzgukVar.zze = i - 1;
        zzgukVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzH = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgsv(null);
                }
                return new zzguk();
            }
            return zzgow.zzaR(zzb, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001dဌ\u0015", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgud.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgty.zza, "zzf", zzgsu.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzguo.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzguu.class, "zzB", "zzC", "zzD", "zzE", zzgtf.class, "zzF", "zzG", zzguh.zza});
        }
        return Byte.valueOf(this.zzH);
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class zzaol extends zzgow implements zzgqh {
    private static final zzaol zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzaon zzM;
    private zzaog zzaC;
    private long zzaI;
    private zzanx zzaL;
    private zzanz zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzaou zzaW;
    private zzaoi zzae;
    private zzaok zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzaow zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgpf zzaf = zzgow.zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgpf zzaz = zzgow.zzaN();
    private int zzaA = 1000;
    private zzgpf zzaB = zzgow.zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzaol zzaolVar = new zzaol();
        zzb = zzaolVar;
        zzgow.zzaU(zzaol.class, zzaolVar);
    }

    private zzaol() {
    }

    public static /* synthetic */ void zzA(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 134217728;
        zzaolVar.zzH = j;
    }

    public static /* synthetic */ void zzB(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzd |= 268435456;
        zzaolVar.zzI = str;
    }

    public static /* synthetic */ void zzC(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 536870912;
        zzaolVar.zzJ = j;
    }

    public static /* synthetic */ void zzD(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 1073741824;
        zzaolVar.zzK = j;
    }

    public static /* synthetic */ void zzE(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= Integer.MIN_VALUE;
        zzaolVar.zzL = j;
    }

    public static /* synthetic */ void zzF(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 2;
        zzaolVar.zzN = j;
    }

    public static /* synthetic */ void zzG(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 4;
        zzaolVar.zzO = j;
    }

    public static /* synthetic */ void zzH(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 8;
        zzaolVar.zzP = j;
    }

    public static /* synthetic */ void zzI(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 16;
        zzaolVar.zzQ = j;
    }

    public static /* synthetic */ void zzJ(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 32;
        zzaolVar.zzR = j;
    }

    public static /* synthetic */ void zzK(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 64;
        zzaolVar.zzS = j;
    }

    public static /* synthetic */ void zzL(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zze |= 128;
        zzaolVar.zzT = str;
    }

    public static /* synthetic */ void zzM(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zze |= 256;
        zzaolVar.zzU = str;
    }

    public static /* synthetic */ void zzN(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 4096;
        zzaolVar.zzY = j;
    }

    public static /* synthetic */ void zzO(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 8192;
        zzaolVar.zzZ = j;
    }

    public static /* synthetic */ void zzP(zzaol zzaolVar, long j) {
        zzaolVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaolVar.zzaa = j;
    }

    public static /* synthetic */ void zzQ(zzaol zzaolVar, zzaoi zzaoiVar) {
        zzaoiVar.getClass();
        zzaolVar.zzae = zzaoiVar;
        zzaolVar.zze |= 262144;
    }

    public static /* synthetic */ void zzR(zzaol zzaolVar, zzaoi zzaoiVar) {
        zzaoiVar.getClass();
        zzgpf zzgpfVar = zzaolVar.zzaf;
        if (!zzgpfVar.zzc()) {
            zzaolVar.zzaf = zzgow.zzaO(zzgpfVar);
        }
        zzaolVar.zzaf.add(zzaoiVar);
    }

    public static /* synthetic */ void zzS(zzaol zzaolVar) {
        zzaolVar.zzaf = zzgow.zzaN();
    }

    public static /* synthetic */ void zzT(zzaol zzaolVar, zzaok zzaokVar) {
        zzaokVar.getClass();
        zzaolVar.zzag = zzaokVar;
        zzaolVar.zze |= 524288;
    }

    public static /* synthetic */ void zzU(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 2097152;
        zzaolVar.zzai = j;
    }

    public static /* synthetic */ void zzV(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 4194304;
        zzaolVar.zzaj = j;
    }

    public static /* synthetic */ void zzW(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 8388608;
        zzaolVar.zzak = j;
    }

    public static /* synthetic */ void zzX(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 67108864;
        zzaolVar.zzan = j;
    }

    public static /* synthetic */ void zzY(zzaol zzaolVar, long j) {
        zzaolVar.zze |= 134217728;
        zzaolVar.zzao = j;
    }

    public static /* synthetic */ void zzZ(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zze |= 268435456;
        zzaolVar.zzap = str;
    }

    public static zzano zza() {
        return (zzano) zzb.zzaA();
    }

    public static /* synthetic */ void zzaa(zzaol zzaolVar, long j) {
        zzaolVar.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzaolVar.zzaE = j;
    }

    public static /* synthetic */ void zzab(zzaol zzaolVar, long j) {
        zzaolVar.zzf |= 1024;
        zzaolVar.zzaF = j;
    }

    public static /* synthetic */ void zzac(zzaol zzaolVar, long j) {
        zzaolVar.zzf |= 2048;
        zzaolVar.zzaG = j;
    }

    public static /* synthetic */ void zzad(zzaol zzaolVar, long j) {
        zzaolVar.zzf |= 4096;
        zzaolVar.zzaH = j;
    }

    public static /* synthetic */ void zzae(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzf |= 32768;
        zzaolVar.zzaK = str;
    }

    public static /* synthetic */ void zzaf(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzf |= 4194304;
        zzaolVar.zzaR = str;
    }

    public static /* synthetic */ void zzag(zzaol zzaolVar, boolean z) {
        zzaolVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaolVar.zzaT = z;
    }

    public static /* synthetic */ void zzah(zzaol zzaolVar, long j) {
        zzaolVar.zzf |= 67108864;
        zzaolVar.zzaV = j;
    }

    public static /* synthetic */ void zzam(zzaol zzaolVar, int i) {
        zzaolVar.zzW = i - 1;
        zzaolVar.zze |= 1024;
    }

    public static /* synthetic */ void zzan(zzaol zzaolVar, int i) {
        zzaolVar.zzX = i - 1;
        zzaolVar.zze |= 2048;
    }

    public static /* synthetic */ void zzao(zzaol zzaolVar, int i) {
        zzaolVar.zzad = i - 1;
        zzaolVar.zze |= 131072;
    }

    public static /* synthetic */ void zzap(zzaol zzaolVar, int i) {
        zzaolVar.zzaw = i - 1;
        zzaolVar.zzf |= 8;
    }

    public static /* synthetic */ void zzaq(zzaol zzaolVar, int i) {
        zzaolVar.zzax = i - 1;
        zzaolVar.zzf |= 16;
    }

    public static /* synthetic */ void zzar(zzaol zzaolVar, int i) {
        zzaolVar.zzaP = i - 1;
        zzaolVar.zzf |= 1048576;
    }

    public static /* synthetic */ void zzas(zzaol zzaolVar, int i) {
        zzaolVar.zzaS = 5;
        zzaolVar.zzf |= 8388608;
    }

    public static /* synthetic */ zzaol zzc() {
        return zzb;
    }

    public static zzaol zzd() {
        return zzb;
    }

    public static zzaol zze(byte[] bArr, zzgoi zzgoiVar) throws zzgpi {
        return (zzaol) zzgow.zzaI(zzb, bArr, zzgoiVar);
    }

    public static /* synthetic */ void zzi(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzd |= 1;
        zzaolVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzd |= 2;
        zzaolVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 4;
        zzaolVar.zzi = j;
    }

    public static /* synthetic */ void zzl(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 16;
        zzaolVar.zzk = j;
    }

    public static /* synthetic */ void zzm(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 32;
        zzaolVar.zzl = j;
    }

    public static /* synthetic */ void zzn(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 1024;
        zzaolVar.zzq = j;
    }

    public static /* synthetic */ void zzo(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 2048;
        zzaolVar.zzr = j;
    }

    public static /* synthetic */ void zzp(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 8192;
        zzaolVar.zzt = j;
    }

    public static /* synthetic */ void zzq(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaolVar.zzu = j;
    }

    public static /* synthetic */ void zzr(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 32768;
        zzaolVar.zzv = j;
    }

    public static /* synthetic */ void zzs(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 65536;
        zzaolVar.zzw = j;
    }

    public static /* synthetic */ void zzt(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 524288;
        zzaolVar.zzz = j;
    }

    public static /* synthetic */ void zzu(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 1048576;
        zzaolVar.zzA = j;
    }

    public static /* synthetic */ void zzv(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 2097152;
        zzaolVar.zzB = j;
    }

    public static /* synthetic */ void zzw(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzd |= 4194304;
        zzaolVar.zzC = str;
    }

    public static /* synthetic */ void zzx(zzaol zzaolVar, String str) {
        str.getClass();
        zzaolVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaolVar.zzE = str;
    }

    public static /* synthetic */ void zzy(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 33554432;
        zzaolVar.zzF = j;
    }

    public static /* synthetic */ void zzz(zzaol zzaolVar, long j) {
        zzaolVar.zzd |= 67108864;
        zzaolVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int zza = zzanu.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzaor.zza;
                return zzgow.zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001aဌW\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^ဌTÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzant.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaoi.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgpaVar, "zzX", zzgpaVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgpaVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzaoq.zza, "zzas", zzaos.zza, "zzap", "zzat", zzanp.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgpaVar, "zzV", "zzD", "zzax", zzgpaVar, "zzay", "zzaz", zzaoe.class, "zzaA", zzgpaVar, "zzaB", zzanr.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzaob.zza, "zzaW", "zzaX", "zzaY"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzano(null);
            } else {
                return new zzaol();
            }
        }
        return (byte) 1;
    }

    public final zzaou zzf() {
        zzaou zzaouVar = this.zzaW;
        return zzaouVar == null ? zzaou.zzd() : zzaouVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzacq implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzacp
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzacq(0)};
        }
    };
    private final byte[] zzb;
    private final zzfd zzc;
    private final zzaaw zzd;
    private zzaar zze;
    private zzabr zzf;
    private int zzg;
    @Nullable
    private zzca zzh;
    private zzabb zzi;
    private int zzj;
    private int zzk;
    private zzaco zzl;
    private int zzm;
    private long zzn;

    public zzacq() {
        this(0);
    }

    public zzacq(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfd(new byte[32768], 0);
        this.zzd = new zzaaw();
        this.zzg = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.zzF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.zzd.zza;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zze(com.google.android.gms.internal.ads.zzfd r5, boolean r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzabb r0 = r4.zzi
            r0.getClass()
            int r0 = r5.zzc()
        L9:
            int r1 = r5.zzd()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.zzF(r0)
            com.google.android.gms.internal.ads.zzabb r1 = r4.zzi
            int r2 = r4.zzk
            com.google.android.gms.internal.ads.zzaaw r3 = r4.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzaax.zzc(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.zzF(r0)
            com.google.android.gms.internal.ads.zzaaw r5 = r4.zzd
            long r5 = r5.zza
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L5e
        L2d:
            int r6 = r5.zzd()
            int r1 = r4.zzj
            int r6 = r6 - r1
            if (r0 > r6) goto L56
            r5.zzF(r0)
            com.google.android.gms.internal.ads.zzabb r6 = r4.zzi     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.zzk     // Catch: java.lang.IndexOutOfBoundsException -> L44
            com.google.android.gms.internal.ads.zzaaw r2 = r4.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = com.google.android.gms.internal.ads.zzaax.zzc(r5, r6, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r5.zzc()
            int r2 = r5.zzd()
            if (r1 <= r2) goto L50
            goto L53
        L50:
            if (r6 == 0) goto L53
            goto L20
        L53:
            int r0 = r0 + 1
            goto L2d
        L56:
            int r6 = r5.zzd()
            r5.zzF(r6)
            goto L61
        L5e:
            r5.zzF(r0)
        L61:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacq.zze(com.google.android.gms.internal.ads.zzfd, boolean):long");
    }

    private final void zzf() {
        zzabb zzabbVar = this.zzi;
        int i = zzfn.zza;
        this.zzf.zzs((this.zzn * 1000000) / zzabbVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        boolean zzn;
        zzabn zzabmVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzaapVar.zzj();
            long zze = zzaapVar.zze();
            zzca zza2 = zzaay.zza(zzaapVar, true);
            ((zzaae) zzaapVar).zzo((int) (zzaapVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzaae) zzaapVar).zzm(this.zzb, 0, 42, false);
            zzaapVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzfd zzfdVar = new zzfd(4);
            ((zzaae) zzaapVar).zzn(zzfdVar.zzH(), 0, 4, false);
            if (zzfdVar.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzce.zza("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            zzabb zzabbVar = this.zzi;
            do {
                zzaapVar.zzj();
                zzfc zzfcVar = new zzfc(new byte[4], 4);
                zzaae zzaaeVar = (zzaae) zzaapVar;
                zzaaeVar.zzm(zzfcVar.zza, 0, 4, false);
                zzn = zzfcVar.zzn();
                int zzd = zzfcVar.zzd(7);
                int zzd2 = zzfcVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzaaeVar.zzn(bArr, 0, 38, false);
                    zzabbVar = new zzabb(bArr, 4);
                } else if (zzabbVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzd == 3) {
                        zzfd zzfdVar2 = new zzfd(zzd2);
                        zzaaeVar.zzn(zzfdVar2.zzH(), 0, zzd2, false);
                        zzabbVar = zzabbVar.zzf(zzaay.zzb(zzfdVar2));
                    } else if (zzd == 4) {
                        zzfd zzfdVar3 = new zzfd(zzd2);
                        zzaaeVar.zzn(zzfdVar3.zzH(), 0, zzd2, false);
                        zzfdVar3.zzG(4);
                        zzabbVar = zzabbVar.zzg(Arrays.asList(zzabx.zzc(zzfdVar3, false, false).zzb));
                    } else if (zzd == 6) {
                        zzfd zzfdVar4 = new zzfd(zzd2);
                        zzaaeVar.zzn(zzfdVar4.zzH(), 0, zzd2, false);
                        zzfdVar4.zzG(4);
                        zzabbVar = zzabbVar.zze(zzfrr.zzm(zzadk.zzb(zzfdVar4)));
                    } else {
                        zzaaeVar.zzo(zzd2, false);
                    }
                }
                int i2 = zzfn.zza;
                this.zzi = zzabbVar;
            } while (!zzn);
            zzabbVar.getClass();
            this.zzj = Math.max(zzabbVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i == 4) {
            zzaapVar.zzj();
            zzfd zzfdVar5 = new zzfd(2);
            ((zzaae) zzaapVar).zzm(zzfdVar5.zzH(), 0, 2, false);
            int zzo = zzfdVar5.zzo();
            int i3 = zzo >> 2;
            zzaapVar.zzj();
            if (i3 == 16382) {
                this.zzk = zzo;
                zzaar zzaarVar = this.zze;
                int i4 = zzfn.zza;
                long zzf = zzaapVar.zzf();
                long zzd3 = zzaapVar.zzd();
                zzabb zzabbVar2 = this.zzi;
                zzabbVar2.getClass();
                if (zzabbVar2.zzk != null) {
                    zzabmVar = new zzaaz(zzabbVar2, zzf);
                } else if (zzd3 == -1 || zzabbVar2.zzj <= 0) {
                    zzabmVar = new zzabm(zzabbVar2.zza(), 0L);
                } else {
                    zzaco zzacoVar = new zzaco(zzabbVar2, this.zzk, zzf, zzd3);
                    this.zzl = zzacoVar;
                    zzabmVar = zzacoVar.zzb();
                }
                zzaarVar.zzN(zzabmVar);
                this.zzg = 5;
                return 0;
            }
            throw zzce.zza("First frame does not start with sync code.", null);
        } else {
            this.zzf.getClass();
            zzabb zzabbVar3 = this.zzi;
            zzabbVar3.getClass();
            zzaco zzacoVar2 = this.zzl;
            if (zzacoVar2 == null || !zzacoVar2.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzaax.zzb(zzaapVar, zzabbVar3);
                    return 0;
                }
                zzfd zzfdVar6 = this.zzc;
                int zzd4 = zzfdVar6.zzd();
                if (zzd4 < 32768) {
                    int zza3 = zzaapVar.zza(zzfdVar6.zzH(), zzd4, 32768 - zzd4);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzE(zzd4 + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzfd zzfdVar7 = this.zzc;
                int zzc = zzfdVar7.zzc();
                int i5 = this.zzm;
                int i6 = this.zzj;
                if (i5 < i6) {
                    zzfdVar7.zzG(Math.min(i6 - i5, zzfdVar7.zza()));
                }
                long zze2 = zze(this.zzc, z);
                zzfd zzfdVar8 = this.zzc;
                int zzc2 = zzfdVar8.zzc() - zzc;
                zzfdVar8.zzF(zzc);
                zzabp.zzb(this.zzf, this.zzc, zzc2);
                this.zzm += zzc2;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                zzfd zzfdVar9 = this.zzc;
                if (zzfdVar9.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzfdVar9.zza();
                System.arraycopy(zzfdVar9.zzH(), zzfdVar9.zzc(), zzfdVar9.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            return zzacoVar2.zza(zzaapVar, zzabkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zze = zzaarVar;
        this.zzf = zzaarVar.zzv(0, 1);
        zzaarVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaco zzacoVar = this.zzl;
            if (zzacoVar != null) {
                zzacoVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        zzaay.zza(zzaapVar, false);
        zzfd zzfdVar = new zzfd(4);
        ((zzaae) zzaapVar).zzm(zzfdVar.zzH(), 0, 4, false);
        return zzfdVar.zzs() == 1716281667;
    }
}

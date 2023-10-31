package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzafv implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzaft
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzafv(0)};
        }
    };
    private static final zzaec zzb = new zzaec() { // from class: com.google.android.gms.internal.ads.zzafu
    };
    private final zzfd zzc;
    private final zzabh zzd;
    private final zzabd zze;
    private final zzabf zzf;
    private final zzabr zzg;
    private zzaar zzh;
    private zzabr zzi;
    private zzabr zzj;
    private int zzk;
    @Nullable
    private zzca zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzafx zzq;
    private boolean zzr;

    public zzafv() {
        this(0);
    }

    public zzafv(int i) {
        this.zzc = new zzfd(10);
        this.zzd = new zzabh();
        this.zze = new zzabd();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzabf();
        zzaan zzaanVar = new zzaan();
        this.zzg = zzaanVar;
        this.zzj = zzaanVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzaap r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.zzf(com.google.android.gms.internal.ads.zzaap):int");
    }

    private final long zzg(long j) {
        return ((j * 1000000) / this.zzd.zzd) + this.zzm;
    }

    private final zzafx zzh(zzaap zzaapVar, boolean z) throws IOException {
        ((zzaae) zzaapVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzafq(zzaapVar.zzd(), zzaapVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzaap zzaapVar) throws IOException {
        zzafx zzafxVar = this.zzq;
        if (zzafxVar != null) {
            long zzb2 = zzafxVar.zzb();
            if (zzb2 != -1 && zzaapVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzaapVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzaap zzaapVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzaapVar.zzj();
        if (zzaapVar.zzf() == 0) {
            zzca zza2 = this.zzf.zza(zzaapVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i = (int) zzaapVar.zze();
            if (!z) {
                ((zzaae) zzaapVar).zzo(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzj(zzaapVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i2 == 0 || zzi(zze, i2)) && (zzb2 = zzabi.zzb(zze)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i2 = zze;
                    }
                    ((zzaae) zzaapVar).zzl(zzb2 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzce.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzaapVar.zzj();
                        ((zzaae) zzaapVar).zzl(i + i5, false);
                    } else {
                        ((zzaae) zzaapVar).zzo(1, false);
                    }
                    i2 = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzaae) zzaapVar).zzo(i + i4, false);
        } else {
            zzaapVar.zzj();
        }
        this.zzk = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        zzdy.zzb(this.zzi);
        int i = zzfn.zza;
        int zzf = zzf(zzaapVar);
        if (zzf == -1 && (this.zzq instanceof zzafr)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzafr zzafrVar = (zzafr) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzh = zzaarVar;
        zzabr zzv = zzaarVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzafx zzafxVar = this.zzq;
        if (zzafxVar instanceof zzafr) {
            zzafr zzafrVar = (zzafr) zzafxVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        return zzk(zzaapVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }
}

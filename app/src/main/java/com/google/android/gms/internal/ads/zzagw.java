package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzagw implements zzaao, zzabn {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzagt
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzagw(0)};
        }
    };
    private final zzfd zzb;
    private final zzfd zzc;
    private final zzfd zzd;
    private final zzfd zze;
    private final ArrayDeque zzf;
    private final zzagy zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    @Nullable
    private zzfd zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzaar zzr;
    private zzagv[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    @Nullable
    private zzaev zzx;

    public zzagw() {
        this(0);
    }

    public zzagw(int i) {
        this.zzi = 0;
        this.zzg = new zzagy();
        this.zzh = new ArrayList();
        this.zze = new zzfd(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfd(zzew.zza);
        this.zzc = new zzfd(4);
        this.zzd = new zzfd();
        this.zzn = -1;
        this.zzr = zzaar.zza;
        this.zzs = new zzagv[0];
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzahd zzahdVar, long j) {
        int zza2 = zzahdVar.zza(j);
        return zza2 == -1 ? zzahdVar.zzb(j) : zza2;
    }

    private static long zzj(zzahd zzahdVar, long j, long j2) {
        int zzi = zzi(zzahdVar, j);
        return zzi == -1 ? j2 : Math.min(zzahdVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2 A[LOOP:2: B:76:0x019f->B:78:0x01a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r31) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagw.zzl(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r33, com.google.android.gms.internal.ads.zzabk r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagw.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzr = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        zzagv[] zzagvVarArr;
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzagv zzagvVar : this.zzs) {
            zzahd zzahdVar = zzagvVar.zzb;
            int zza2 = zzahdVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzahdVar.zzb(j2);
            }
            zzagvVar.zze = zza2;
            zzabs zzabsVar = zzagvVar.zzd;
            if (zzabsVar != null) {
                zzabsVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        return zzagz.zzb(zzaapVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzagv[] zzagvVarArr = this.zzs;
        if (zzagvVarArr.length == 0) {
            zzabo zzaboVar = zzabo.zza;
            return new zzabl(zzaboVar, zzaboVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzahd zzahdVar = zzagvVarArr[i].zzb;
            int zzi = zzi(zzahdVar, j);
            if (zzi == -1) {
                zzabo zzaboVar2 = zzabo.zza;
                return new zzabl(zzaboVar2, zzaboVar2);
            }
            long j5 = zzahdVar.zzf[zzi];
            j2 = zzahdVar.zzc[zzi];
            if (j5 >= j || zzi >= zzahdVar.zzb - 1 || (zzb = zzahdVar.zzb(j)) == -1 || zzb == zzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzahdVar.zzf[zzb];
                j4 = zzahdVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzagv[] zzagvVarArr2 = this.zzs;
            if (i2 >= zzagvVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzahd zzahdVar2 = zzagvVarArr2[i2].zzb;
                long zzj = zzj(zzahdVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzahdVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzabo zzaboVar3 = new zzabo(j, j2);
        return j3 == -9223372036854775807L ? new zzabl(zzaboVar3, zzaboVar3) : new zzabl(zzaboVar3, new zzabo(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}

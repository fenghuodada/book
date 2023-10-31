package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzud extends zzsu {
    private static final zzbq zza;
    private final zztn[] zzb;
    private final zzcx[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsn zzf;
    private int zzg;
    private long[][] zzh;
    @Nullable
    private zzuc zzi;
    private final zzsw zzj;

    static {
        zzat zzatVar = new zzat();
        zzatVar.zza("MergingMediaSource");
        zza = zzatVar.zzc();
    }

    public zzud(boolean z, boolean z2, zztn... zztnVarArr) {
        zzsw zzswVar = new zzsw();
        this.zzb = zztnVarArr;
        this.zzj = zzswVar;
        this.zzd = new ArrayList(Arrays.asList(zztnVarArr));
        this.zzg = -1;
        this.zzc = new zzcx[zztnVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfsv.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzF(zztj zztjVar) {
        zzub zzubVar = (zzub) zztjVar;
        int i = 0;
        while (true) {
            zztn[] zztnVarArr = this.zzb;
            if (i >= zztnVarArr.length) {
                return;
            }
            zztnVarArr[i].zzF(zzubVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final zztj zzH(zztl zztlVar, zzxm zzxmVar, long j) {
        int length = this.zzb.length;
        zztj[] zztjVarArr = new zztj[length];
        int zza2 = this.zzc[0].zza(zztlVar.zza);
        for (int i = 0; i < length; i++) {
            zztjVarArr[i] = this.zzb[i].zzH(zztlVar.zzc(this.zzc[i].zzf(zza2)), zzxmVar, j - this.zzh[zza2][i]);
        }
        return new zzub(this.zzj, this.zzh[zza2], zztjVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final zzbq zzI() {
        zztn[] zztnVarArr = this.zzb;
        return zztnVarArr.length > 0 ? zztnVarArr[0].zzI() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zzsm
    public final void zzn(@Nullable zzgz zzgzVar) {
        super.zzn(zzgzVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzA(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zzsm
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    @Nullable
    public final /* bridge */ /* synthetic */ zztl zzx(Object obj, zztl zztlVar) {
        if (((Integer) obj).intValue() == 0) {
            return zztlVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zztn
    public final void zzy() throws IOException {
        zzuc zzucVar = this.zzi;
        if (zzucVar != null) {
            throw zzucVar;
        }
        super.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final /* bridge */ /* synthetic */ void zzz(Object obj, zztn zztnVar, zzcx zzcxVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzcxVar.zzb();
            this.zzg = i;
        } else {
            int zzb = zzcxVar.zzb();
            int i2 = this.zzg;
            if (zzb != i2) {
                this.zzi = new zzuc(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(Long.TYPE, i, this.zzc.length);
        }
        this.zzd.remove(zztnVar);
        this.zzc[((Integer) obj).intValue()] = zzcxVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }
}

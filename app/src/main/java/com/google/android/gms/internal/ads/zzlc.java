package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlc extends zzhj {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcx[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlc(Collection collection, zzvf zzvfVar) {
        super(false, zzvfVar);
        int i = 0;
        int size = collection.size();
        this.zzf = new int[size];
        this.zzg = new int[size];
        this.zzh = new zzcx[size];
        this.zzi = new Object[size];
        this.zzj = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzkm zzkmVar = (zzkm) it.next();
            this.zzh[i3] = zzkmVar.zza();
            this.zzg[i3] = i;
            this.zzf[i3] = i2;
            i += this.zzh[i3].zzc();
            i2 += this.zzh[i3].zzb();
            this.zzi[i3] = zzkmVar.zzb();
            this.zzj.put(this.zzi[i3], Integer.valueOf(i3));
            i3++;
        }
        this.zzd = i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final int zzq(int i) {
        return zzfn.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final int zzr(int i) {
        return zzfn.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final zzcx zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Object zzv(int i) {
        return this.zzi[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }
}

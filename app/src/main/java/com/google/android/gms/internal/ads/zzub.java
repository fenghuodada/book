package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class zzub implements zztj, zzti {
    private final zztj[] zza;
    @Nullable
    private zzti zze;
    @Nullable
    private zzvk zzf;
    private final zzsw zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzve zzh = new zzsv(new zzve[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztj[] zzg = new zztj[0];

    public zzub(zzsw zzswVar, long[] jArr, zztj... zztjVarArr) {
        this.zzi = zzswVar;
        this.zza = zztjVarArr;
        for (int i = 0; i < zztjVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zztz(zztjVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zza(long j, zzlh zzlhVar) {
        zztj[] zztjVarArr = this.zzg;
        return (zztjVarArr.length > 0 ? zztjVarArr[0] : this.zza[0]).zza(j, zzlhVar);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzd() {
        zztj[] zztjVarArr;
        zztj[] zztjVarArr2;
        long j = -9223372036854775807L;
        for (zztj zztjVar : this.zzg) {
            long zzd = zztjVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zztj zztjVar2 : this.zzg) {
                        if (zztjVar2 == zztjVar) {
                            break;
                        } else if (zztjVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zztjVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zztj[] zztjVarArr = this.zzg;
            if (i >= zztjVarArr.length) {
                return zze;
            }
            if (zztjVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzf(zzwx[] zzwxVarArr, boolean[] zArr, zzvc[] zzvcVarArr, boolean[] zArr2, long j) {
        int length;
        zzwx zzwxVar;
        int length2 = zzwxVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzwxVarArr.length;
            zzwxVar = null;
            if (i2 >= length) {
                break;
            }
            zzvc zzvcVar = zzvcVarArr[i2];
            Integer num = zzvcVar != null ? (Integer) this.zzb.get(zzvcVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            zzwx zzwxVar2 = zzwxVarArr[i2];
            if (zzwxVar2 != null) {
                String str = zzwxVar2.zze().zzc;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.zzb.clear();
        zzvc[] zzvcVarArr2 = new zzvc[length];
        zzvc[] zzvcVarArr3 = new zzvc[length];
        zzwx[] zzwxVarArr2 = new zzwx[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = i; i4 < zzwxVarArr.length; i4++) {
                zzvcVarArr3[i4] = iArr[i4] == i3 ? zzvcVarArr[i4] : zzwxVar;
                if (iArr2[i4] == i3) {
                    zzwx zzwxVar3 = zzwxVarArr[i4];
                    zzwxVar3.getClass();
                    zzcz zzczVar = (zzcz) this.zzd.get(zzwxVar3.zze());
                    zzczVar.getClass();
                    zzwxVarArr2[i4] = new zzty(zzwxVar3, zzczVar);
                } else {
                    zzwxVarArr2[i4] = zzwxVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zzvc[] zzvcVarArr4 = zzvcVarArr3;
            zzwx[] zzwxVarArr3 = zzwxVarArr2;
            long zzf = this.zza[i3].zzf(zzwxVarArr2, zArr, zzvcVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzwxVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzvc zzvcVar2 = zzvcVarArr4[i6];
                    zzvcVar2.getClass();
                    zzvcVarArr2[i6] = zzvcVar2;
                    this.zzb.put(zzvcVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzdy.zzf(zzvcVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzvcVarArr3 = zzvcVarArr4;
            zzwxVarArr2 = zzwxVarArr3;
            i = 0;
            zzwxVar = null;
        }
        int i7 = i;
        System.arraycopy(zzvcVarArr2, i7, zzvcVarArr, i7, length);
        zztj[] zztjVarArr = (zztj[]) arrayList.toArray(new zztj[i7]);
        this.zzg = zztjVarArr;
        this.zzh = new zzsv(zztjVarArr);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final /* bridge */ /* synthetic */ void zzg(zzve zzveVar) {
        zztj zztjVar = (zztj) zzveVar;
        zzti zztiVar = this.zze;
        zztiVar.getClass();
        zztiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzvk zzh() {
        zzvk zzvkVar = this.zzf;
        zzvkVar.getClass();
        return zzvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final void zzi(zztj zztjVar) {
        this.zzc.remove(zztjVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zztj zztjVar2 : this.zza) {
            i += zztjVar2.zzh().zzc;
        }
        zzcz[] zzczVarArr = new zzcz[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zztj[] zztjVarArr = this.zza;
            if (i2 >= zztjVarArr.length) {
                this.zzf = new zzvk(zzczVarArr);
                zzti zztiVar = this.zze;
                zztiVar.getClass();
                zztiVar.zzi(this);
                return;
            }
            zzvk zzh = zztjVarArr[i2].zzh();
            int i4 = zzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzcz zzb = zzh.zzb(i5);
                zzcz zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                this.zzd.put(zzc, zzb);
                zzczVarArr[i3] = zzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzj(long j, boolean z) {
        for (zztj zztjVar : this.zzg) {
            zztjVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzk() throws IOException {
        for (zztj zztjVar : this.zza) {
            zztjVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzl(zzti zztiVar, long j) {
        this.zze = zztiVar;
        Collections.addAll(this.zzc, this.zza);
        for (zztj zztjVar : this.zza) {
            zztjVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zztj zzn(int i) {
        zztj zztjVar;
        zztj zztjVar2 = this.zza[i];
        if (zztjVar2 instanceof zztz) {
            zztjVar = ((zztz) zztjVar2).zza;
            return zztjVar;
        }
        return zztjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zztj) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

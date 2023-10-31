package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zznw implements zzls {
    private final zzdz zza;
    private final zzcu zzb;
    private final zzcw zzc;
    private final zznv zzd;
    private final SparseArray zze;
    private zzeo zzf;
    private zzcq zzg;
    private zzei zzh;
    private boolean zzi;

    public zznw(zzdz zzdzVar) {
        zzdzVar.getClass();
        this.zza = zzdzVar;
        this.zzf = new zzeo(zzfn.zzt(), zzdzVar, new zzem() { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj, zzah zzahVar) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
        zzcu zzcuVar = new zzcu();
        this.zzb = zzcuVar;
        this.zzc = new zzcw();
        this.zzd = new zznv(zzcuVar);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzW(zznw zznwVar) {
        final zzlt zzU = zznwVar.zzU();
        zznwVar.zzZ(zzU, 1028, new zzel() { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
        zznwVar.zzf.zze();
    }

    private final zzlt zzaa(@Nullable zztl zztlVar) {
        this.zzg.getClass();
        zzcx zza = zztlVar == null ? null : this.zzd.zza(zztlVar);
        if (zztlVar == null || zza == null) {
            int zzd = this.zzg.zzd();
            zzcx zzn = this.zzg.zzn();
            if (zzd >= zzn.zzc()) {
                zzn = zzcx.zza;
            }
            return zzV(zzn, zzd, null);
        }
        return zzV(zza, zza.zzn(zztlVar.zza, this.zzb).zzd, zztlVar);
    }

    private final zzlt zzab(int i, @Nullable zztl zztlVar) {
        zzcq zzcqVar = this.zzg;
        zzcqVar.getClass();
        if (zztlVar != null) {
            return this.zzd.zza(zztlVar) != null ? zzaa(zztlVar) : zzV(zzcx.zza, i, zztlVar);
        }
        zzcx zzn = zzcqVar.zzn();
        if (i >= zzn.zzc()) {
            zzn = zzcx.zza;
        }
        return zzV(zzn, i, null);
    }

    private final zzlt zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzlt zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzlt zzae(@Nullable zzcg zzcgVar) {
        zzbx zzbxVar;
        return (!(zzcgVar instanceof zzia) || (zzbxVar = ((zzia) zzcgVar).zzj) == null) ? zzU() : zzaa(new zztl(zzbxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzA(final String str) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1012, new zzel() { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzB(final zzhs zzhsVar) {
        final zzlt zzac = zzac();
        zzZ(zzac, 1013, new zzel() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzC(final zzhs zzhsVar) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1007, new zzel() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzD(final zzam zzamVar, @Nullable final zzht zzhtVar) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1009, new zzel() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zze(zzlt.this, zzamVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzE(final long j) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1010, new zzel(j) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzF(final Exception exc) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1014, new zzel() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzG(final int i, final long j, final long j2) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1011, new zzel(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzH(final int i, final long j) {
        final zzlt zzac = zzac();
        zzZ(zzac, 1018, new zzel() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzh(zzlt.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzI(final Object obj, final long j) {
        final zzlt zzad = zzad();
        zzZ(zzad, 26, new zzel() { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj2) {
                ((zzlv) obj2).zzn(zzlt.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzJ(final Exception exc) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1030, new zzel() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzK(final String str, final long j, final long j2) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1016, new zzel(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmq
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzL(final String str) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1019, new zzel() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzM(final zzhs zzhsVar) {
        final zzlt zzac = zzac();
        zzZ(zzac, 1020, new zzel() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzo(zzlt.this, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzN(final zzhs zzhsVar) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1015, new zzel() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzO(final long j, final int i) {
        final zzlt zzac = zzac();
        zzZ(zzac, 1021, new zzel(j, i) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzP(final zzam zzamVar, @Nullable final zzht zzhtVar) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1017, new zzel() { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzp(zzlt.this, zzamVar, zzhtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    @CallSuper
    public final void zzQ() {
        zzei zzeiVar = this.zzh;
        zzdy.zzb(zzeiVar);
        zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // java.lang.Runnable
            public final void run() {
                zznw.zzW(zznw.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    @CallSuper
    public final void zzR(zzlv zzlvVar) {
        this.zzf.zzf(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    @CallSuper
    public final void zzS(final zzcq zzcqVar, Looper looper) {
        zzfrr zzfrrVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfrrVar = this.zzd.zzb;
            if (!zzfrrVar.isEmpty()) {
                z = false;
            }
        }
        zzdy.zzf(z);
        zzcqVar.getClass();
        this.zzg = zzcqVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzem() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj, zzah zzahVar) {
                zznw.this.zzX(zzcqVar, (zzlv) obj, zzahVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzT(List list, @Nullable zztl zztlVar) {
        zznv zznvVar = this.zzd;
        zzcq zzcqVar = this.zzg;
        zzcqVar.getClass();
        zznvVar.zzh(list, zztlVar, zzcqVar);
    }

    public final zzlt zzU() {
        return zzaa(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    public final zzlt zzV(zzcx zzcxVar, int i, @Nullable zztl zztlVar) {
        boolean z = true;
        zztl zztlVar2 = true == zzcxVar.zzo() ? null : zztlVar;
        long zza = this.zza.zza();
        if (!zzcxVar.equals(this.zzg.zzn()) || i != this.zzg.zzd()) {
            z = false;
        }
        long j = 0;
        if (zztlVar2 == null || !zztlVar2.zzb()) {
            if (z) {
                j = this.zzg.zzj();
            } else if (!zzcxVar.zzo()) {
                long j2 = zzcxVar.zze(i, this.zzc, 0L).zzm;
                j = zzfn.zzq(0L);
            }
        } else if (z && this.zzg.zzb() == zztlVar2.zzb && this.zzg.zzc() == zztlVar2.zzc) {
            j = this.zzg.zzk();
        }
        return new zzlt(zza, zzcxVar, i, zztlVar2, j, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    public final /* synthetic */ void zzX(zzcq zzcqVar, zzlv zzlvVar, zzah zzahVar) {
        zzlvVar.zzi(zzcqVar, new zzlu(zzahVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzY(final int i, final long j, final long j2) {
        final zzlt zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, 1006, new zzel() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzf(zzlt.this, i, j, j2);
            }
        });
    }

    public final void zzZ(zzlt zzltVar, int i, zzel zzelVar) {
        this.zze.put(i, zzltVar);
        zzeo zzeoVar = this.zzf;
        zzeoVar.zzd(i, zzelVar);
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zza(final zzcm zzcmVar) {
        final zzlt zzU = zzU();
        zzZ(zzU, 13, new zzel() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaf(int i, @Nullable zztl zztlVar, final zzth zzthVar) {
        final zzlt zzab = zzab(i, zztlVar);
        zzZ(zzab, 1004, new zzel() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzg(zzlt.this, zzthVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzag(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        final zzlt zzab = zzab(i, zztlVar);
        zzZ(zzab, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new zzel() { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzah(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        final zzlt zzab = zzab(i, zztlVar);
        zzZ(zzab, 1001, new zzel() { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzai(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar, final IOException iOException, final boolean z) {
        final zzlt zzab = zzab(i, zztlVar);
        zzZ(zzab, 1003, new zzel() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzj(zzlt.this, zztcVar, zzthVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaj(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        final zzlt zzab = zzab(i, zztlVar);
        zzZ(zzab, 1000, new zzel() { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzb(final zzz zzzVar) {
        final zzlt zzU = zzU();
        zzZ(zzU, 29, new zzel() { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzc(final int i, final boolean z) {
        final zzlt zzU = zzU();
        zzZ(zzU, 30, new zzel(i, z) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzd(final boolean z) {
        final zzlt zzU = zzU();
        zzZ(zzU, 3, new zzel(z) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zze(final boolean z) {
        final zzlt zzU = zzU();
        zzZ(zzU, 7, new zzel(z) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzf(@Nullable final zzbq zzbqVar, final int i) {
        final zzlt zzU = zzU();
        zzZ(zzU, 1, new zzel(zzbqVar, i) { // from class: com.google.android.gms.internal.ads.zznf
            public final /* synthetic */ zzbq zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzg(final zzbw zzbwVar) {
        final zzlt zzU = zzU();
        zzZ(zzU, 14, new zzel() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzh(final boolean z, final int i) {
        final zzlt zzU = zzU();
        zzZ(zzU, 5, new zzel(z, i) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzi(final zzci zzciVar) {
        final zzlt zzU = zzU();
        zzZ(zzU, 12, new zzel() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzj(final int i) {
        final zzlt zzU = zzU();
        zzZ(zzU, 4, new zzel() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzk(zzlt.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzk(final int i) {
        final zzlt zzU = zzU();
        zzZ(zzU, 6, new zzel(i) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzl(final zzcg zzcgVar) {
        final zzlt zzae = zzae(zzcgVar);
        zzZ(zzae, 10, new zzel() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzlv) obj).zzl(zzlt.this, zzcgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzm(@Nullable final zzcg zzcgVar) {
        final zzlt zzae = zzae(zzcgVar);
        zzZ(zzae, 10, new zzel() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzn(final boolean z, final int i) {
        final zzlt zzU = zzU();
        zzZ(zzU, -1, new zzel(z, i) { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzo(final zzcp zzcpVar, final zzcp zzcpVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zznv zznvVar = this.zzd;
        zzcq zzcqVar = this.zzg;
        zzcqVar.getClass();
        zznvVar.zzg(zzcqVar);
        final zzlt zzU = zzU();
        zzZ(zzU, 11, new zzel() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
                zzlvVar.zzm(zzlt.this, zzcpVar, zzcpVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzp() {
        final zzlt zzU = zzU();
        zzZ(zzU, -1, new zzel() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzq(final boolean z) {
        final zzlt zzad = zzad();
        zzZ(zzad, 23, new zzel(z) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzr(final int i, final int i2) {
        final zzlt zzad = zzad();
        zzZ(zzad, 24, new zzel(i, i2) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzs(zzcx zzcxVar, final int i) {
        zznv zznvVar = this.zzd;
        zzcq zzcqVar = this.zzg;
        zzcqVar.getClass();
        zznvVar.zzi(zzcqVar);
        final zzlt zzU = zzU();
        zzZ(zzU, 0, new zzel(i) { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzt(final zzdi zzdiVar) {
        final zzlt zzU = zzU();
        zzZ(zzU, 2, new zzel() { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzu(final zzdn zzdnVar) {
        final zzlt zzad = zzad();
        zzZ(zzad, 25, new zzel() { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlt zzltVar = zzlt.this;
                zzdn zzdnVar2 = zzdnVar;
                ((zzlv) obj).zzq(zzltVar, zzdnVar2);
                int i = zzdnVar2.zzc;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzv(final float f) {
        final zzlt zzad = zzad();
        zzZ(zzad, 22, new zzel(f) { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    @CallSuper
    public final void zzw(zzlv zzlvVar) {
        this.zzf.zzb(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzx() {
        if (this.zzi) {
            return;
        }
        final zzlt zzU = zzU();
        this.zzi = true;
        zzZ(zzU, -1, new zzel() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzy(final Exception exc) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1029, new zzel() { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzz(final String str, final long j, final long j2) {
        final zzlt zzad = zzad();
        zzZ(zzad, 1008, new zzel(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmy
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                zzlv zzlvVar = (zzlv) obj;
            }
        });
    }
}

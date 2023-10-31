package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkt implements zztv, zzqm {
    final /* synthetic */ zzkx zza;
    private final zzkv zzb;

    public zzkt(zzkx zzkxVar, zzkv zzkvVar) {
        this.zza = zzkxVar;
        this.zzb = zzkvVar;
    }

    @Nullable
    private final Pair zzf(int i, @Nullable zztl zztlVar) {
        zztl zztlVar2;
        zztl zztlVar3 = null;
        if (zztlVar != null) {
            zzkv zzkvVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkvVar.zzc.size()) {
                    zztlVar2 = null;
                    break;
                } else if (((zztl) zzkvVar.zzc.get(i2)).zzd == zztlVar.zzd) {
                    zztlVar2 = zztlVar.zzc(Pair.create(zzkvVar.zzb, zztlVar.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zztlVar2 == null) {
                return null;
            }
            zztlVar3 = zztlVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztlVar3);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaf(int i, @Nullable zztl zztlVar, final zzth zzthVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztlVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // java.lang.Runnable
                public final void run() {
                    zzls zzlsVar;
                    zzkt zzktVar = zzkt.this;
                    Pair pair = zzf;
                    zzth zzthVar2 = zzthVar;
                    zzlsVar = zzktVar.zza.zzh;
                    zzlsVar.zzaf(((Integer) pair.first).intValue(), (zztl) pair.second, zzthVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzag(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztlVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // java.lang.Runnable
                public final void run() {
                    zzls zzlsVar;
                    zzkt zzktVar = zzkt.this;
                    Pair pair = zzf;
                    zztc zztcVar2 = zztcVar;
                    zzth zzthVar2 = zzthVar;
                    zzlsVar = zzktVar.zza.zzh;
                    zzlsVar.zzag(((Integer) pair.first).intValue(), (zztl) pair.second, zztcVar2, zzthVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzah(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztlVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkp
                @Override // java.lang.Runnable
                public final void run() {
                    zzls zzlsVar;
                    zzkt zzktVar = zzkt.this;
                    Pair pair = zzf;
                    zztc zztcVar2 = zztcVar;
                    zzth zzthVar2 = zzthVar;
                    zzlsVar = zzktVar.zza.zzh;
                    zzlsVar.zzah(((Integer) pair.first).intValue(), (zztl) pair.second, zztcVar2, zzthVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzai(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar, final IOException iOException, final boolean z) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztlVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // java.lang.Runnable
                public final void run() {
                    zzls zzlsVar;
                    zzkt zzktVar = zzkt.this;
                    Pair pair = zzf;
                    zztc zztcVar2 = zztcVar;
                    zzth zzthVar2 = zzthVar;
                    IOException iOException2 = iOException;
                    boolean z2 = z;
                    zzlsVar = zzktVar.zza.zzh;
                    zzlsVar.zzai(((Integer) pair.first).intValue(), (zztl) pair.second, zztcVar2, zzthVar2, iOException2, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaj(int i, @Nullable zztl zztlVar, final zztc zztcVar, final zzth zzthVar) {
        zzei zzeiVar;
        final Pair zzf = zzf(0, zztlVar);
        if (zzf != null) {
            zzeiVar = this.zza.zzi;
            zzeiVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final void run() {
                    zzls zzlsVar;
                    zzkt zzktVar = zzkt.this;
                    Pair pair = zzf;
                    zztc zztcVar2 = zztcVar;
                    zzth zzthVar2 = zzthVar;
                    zzlsVar = zzktVar.zza.zzh;
                    zzlsVar.zzaj(((Integer) pair.first).intValue(), (zztl) pair.second, zztcVar2, zzthVar2);
                }
            });
        }
    }
}

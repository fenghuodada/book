package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkx {
    private final zzof zza;
    private final zzkw zze;
    private final zzls zzh;
    private final zzei zzi;
    private boolean zzj;
    @Nullable
    private zzgz zzk;
    private zzvf zzl = new zzvf(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzkx(zzkw zzkwVar, zzls zzlsVar, zzei zzeiVar, zzof zzofVar) {
        this.zza = zzofVar;
        this.zze = zzkwVar;
        this.zzh = zzlsVar;
        this.zzi = zzeiVar;
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzkv) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzkv zzkvVar) {
        zzku zzkuVar = (zzku) this.zzf.get(zzkvVar);
        if (zzkuVar != null) {
            zzkuVar.zza.zzi(zzkuVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzkv zzkvVar = (zzkv) it.next();
            if (zzkvVar.zzc.isEmpty()) {
                zzq(zzkvVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzkv zzkvVar) {
        if (zzkvVar.zze && zzkvVar.zzc.isEmpty()) {
            zzku zzkuVar = (zzku) this.zzf.remove(zzkvVar);
            zzkuVar.getClass();
            zzkuVar.zza.zzp(zzkuVar.zzb);
            zzkuVar.zza.zzs(zzkuVar.zzc);
            zzkuVar.zza.zzr(zzkuVar.zzc);
            this.zzg.remove(zzkvVar);
        }
    }

    private final void zzt(zzkv zzkvVar) {
        zztg zztgVar = zzkvVar.zza;
        zztm zztmVar = new zztm() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // com.google.android.gms.internal.ads.zztm
            public final void zza(zztn zztnVar, zzcx zzcxVar) {
                zzkx.this.zze(zztnVar, zzcxVar);
            }
        };
        zzkt zzktVar = new zzkt(this, zzkvVar);
        this.zzf.put(zzkvVar, new zzku(zztgVar, zztmVar, zzktVar));
        zztgVar.zzh(new Handler(zzfn.zzt(), null), zzktVar);
        zztgVar.zzg(new Handler(zzfn.zzt(), null), zzktVar);
        zztgVar.zzm(zztmVar, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzkv zzkvVar = (zzkv) this.zzb.remove(i2);
            this.zzd.remove(zzkvVar.zzb);
            zzp(i2, -zzkvVar.zza.zzB().zzc());
            zzkvVar.zze = true;
            if (this.zzj) {
                zzs(zzkvVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcx zzb() {
        if (this.zzb.isEmpty()) {
            return zzcx.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzkv zzkvVar = (zzkv) this.zzb.get(i2);
            zzkvVar.zzd = i;
            i += zzkvVar.zza.zzB().zzc();
        }
        return new zzlc(this.zzb, this.zzl);
    }

    public final /* synthetic */ void zze(zztn zztnVar, zzcx zzcxVar) {
        this.zze.zzh();
    }

    public final void zzf(@Nullable zzgz zzgzVar) {
        zzdy.zzf(!this.zzj);
        this.zzk = zzgzVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzkv zzkvVar = (zzkv) this.zzb.get(i);
            zzt(zzkvVar);
            this.zzg.add(zzkvVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzku zzkuVar : this.zzf.values()) {
            try {
                zzkuVar.zza.zzp(zzkuVar.zzb);
            } catch (RuntimeException e) {
                zzer.zzc("MediaSourceList", "Failed to release child source.", e);
            }
            zzkuVar.zza.zzs(zzkuVar.zzc);
            zzkuVar.zza.zzr(zzkuVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzh(zztj zztjVar) {
        zzkv zzkvVar = (zzkv) this.zzc.remove(zztjVar);
        zzkvVar.getClass();
        zzkvVar.zza.zzF(zztjVar);
        zzkvVar.zzc.remove(((zztd) zztjVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzkvVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcx zzj(int i, List list, zzvf zzvfVar) {
        if (!list.isEmpty()) {
            this.zzl = zzvfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzkv zzkvVar = (zzkv) list.get(i2 - i);
                if (i2 > 0) {
                    zzkv zzkvVar2 = (zzkv) this.zzb.get(i2 - 1);
                    zzcx zzB = zzkvVar2.zza.zzB();
                    zzkvVar.zzc(zzB.zzc() + zzkvVar2.zzd);
                } else {
                    zzkvVar.zzc(0);
                }
                zzp(i2, zzkvVar.zza.zzB().zzc());
                this.zzb.add(i2, zzkvVar);
                this.zzd.put(zzkvVar.zzb, zzkvVar);
                if (this.zzj) {
                    zzt(zzkvVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkvVar);
                    } else {
                        zzq(zzkvVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcx zzk(int i, int i2, int i3, zzvf zzvfVar) {
        zzdy.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcx zzl(int i, int i2, zzvf zzvfVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzl = zzvfVar;
        zzu(i, i2);
        return zzb();
    }

    public final zzcx zzm(List list, zzvf zzvfVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzvfVar);
    }

    public final zzcx zzn(zzvf zzvfVar) {
        int zza = zza();
        if (zzvfVar.zzc() != zza) {
            zzvfVar = zzvfVar.zzf().zzg(0, zza);
        }
        this.zzl = zzvfVar;
        return zzb();
    }

    public final zztj zzo(zztl zztlVar, zzxm zzxmVar, long j) {
        Object obj = zztlVar.zza;
        int i = zzlc.zzc;
        Object obj2 = ((Pair) obj).first;
        zztl zzc = zztlVar.zzc(((Pair) obj).second);
        zzkv zzkvVar = (zzkv) this.zzd.get(obj2);
        zzkvVar.getClass();
        this.zzg.add(zzkvVar);
        zzku zzkuVar = (zzku) this.zzf.get(zzkvVar);
        if (zzkuVar != null) {
            zzkuVar.zza.zzk(zzkuVar.zzb);
        }
        zzkvVar.zzc.add(zzc);
        zztd zzH = zzkvVar.zza.zzH(zzc, zzxmVar, j);
        this.zzc.put(zzH, zzkvVar);
        zzr();
        return zzH;
    }
}

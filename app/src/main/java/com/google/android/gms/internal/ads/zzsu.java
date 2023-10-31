package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class zzsu extends zzsm {
    private final HashMap zza = new HashMap();
    @Nullable
    private Handler zzb;
    @Nullable
    private zzgz zzc;

    public final void zzA(final Object obj, zztn zztnVar) {
        zzdy.zzd(!this.zza.containsKey(obj));
        zztm zztmVar = new zztm() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // com.google.android.gms.internal.ads.zztm
            public final void zza(zztn zztnVar2, zzcx zzcxVar) {
                zzsu.this.zzz(obj, zztnVar2, zzcxVar);
            }
        };
        zzss zzssVar = new zzss(this, obj);
        this.zza.put(obj, new zzst(zztnVar, zztmVar, zzssVar));
        Handler handler = this.zzb;
        handler.getClass();
        zztnVar.zzh(handler, zzssVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zztnVar.zzg(handler2, zzssVar);
        zztnVar.zzm(zztmVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zztnVar.zzi(zztmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @CallSuper
    public final void zzj() {
        for (zzst zzstVar : this.zza.values()) {
            zzstVar.zza.zzi(zzstVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @CallSuper
    public final void zzl() {
        for (zzst zzstVar : this.zza.values()) {
            zzstVar.zza.zzk(zzstVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @CallSuper
    public void zzn(@Nullable zzgz zzgzVar) {
        this.zzc = zzgzVar;
        this.zzb = zzfn.zzs(null);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @CallSuper
    public void zzq() {
        for (zzst zzstVar : this.zza.values()) {
            zzstVar.zza.zzp(zzstVar.zzb);
            zzstVar.zza.zzs(zzstVar.zzc);
            zzstVar.zza.zzr(zzstVar.zzc);
        }
        this.zza.clear();
    }

    public int zzv(Object obj, int i) {
        return 0;
    }

    public long zzw(Object obj, long j) {
        return j;
    }

    @Nullable
    public zztl zzx(Object obj, zztl zztlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    @CallSuper
    public void zzy() throws IOException {
        for (zzst zzstVar : this.zza.values()) {
            zzstVar.zza.zzy();
        }
    }

    public abstract void zzz(Object obj, zztn zztnVar, zzcx zzcxVar);
}

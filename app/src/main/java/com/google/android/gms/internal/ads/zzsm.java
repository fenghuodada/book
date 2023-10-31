package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class zzsm implements zztn {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zztu zzc = new zztu();
    private final zzql zzd = new zzql();
    @Nullable
    private Looper zze;
    @Nullable
    private zzcx zzf;
    @Nullable
    private zzof zzg;

    @Override // com.google.android.gms.internal.ads.zztn
    public /* synthetic */ zzcx zzL() {
        return null;
    }

    public final zzof zzb() {
        zzof zzofVar = this.zzg;
        zzdy.zzb(zzofVar);
        return zzofVar;
    }

    public final zzql zzc(@Nullable zztl zztlVar) {
        return this.zzd.zza(0, zztlVar);
    }

    public final zzql zzd(int i, @Nullable zztl zztlVar) {
        return this.zzd.zza(0, zztlVar);
    }

    public final zztu zze(@Nullable zztl zztlVar) {
        return this.zzc.zza(0, zztlVar);
    }

    public final zztu zzf(int i, @Nullable zztl zztlVar) {
        return this.zzc.zza(0, zztlVar);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzg(Handler handler, zzqm zzqmVar) {
        zzqmVar.getClass();
        this.zzd.zzb(handler, zzqmVar);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzh(Handler handler, zztv zztvVar) {
        zztvVar.getClass();
        this.zzc.zzb(handler, zztvVar);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzi(zztm zztmVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zztmVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzk(zztm zztmVar) {
        this.zze.getClass();
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zztmVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzm(zztm zztmVar, @Nullable zzgz zzgzVar, zzof zzofVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzdy.zzd(z);
        this.zzg = zzofVar;
        zzcx zzcxVar = this.zzf;
        this.zza.add(zztmVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zztmVar);
            zzn(zzgzVar);
        } else if (zzcxVar != null) {
            zzk(zztmVar);
            zztmVar.zza(this, zzcxVar);
        }
    }

    public abstract void zzn(@Nullable zzgz zzgzVar);

    public final void zzo(zzcx zzcxVar) {
        this.zzf = zzcxVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zztm) arrayList.get(i)).zza(this, zzcxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzp(zztm zztmVar) {
        this.zza.remove(zztmVar);
        if (!this.zza.isEmpty()) {
            zzi(zztmVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzr(zzqm zzqmVar) {
        this.zzd.zzc(zzqmVar);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzs(zztv zztvVar) {
        this.zzc.zzh(zztvVar);
    }

    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public /* synthetic */ boolean zzu() {
        return true;
    }
}

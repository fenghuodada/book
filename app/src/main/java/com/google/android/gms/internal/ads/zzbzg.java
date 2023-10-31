package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzbzg implements zzaur {
    @VisibleForTesting
    final zzbzd zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    @VisibleForTesting
    final HashSet zzb = new HashSet();
    @VisibleForTesting
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbze zzf = new zzbze();

    public zzbzg(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzbzd(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final void zza(boolean z) {
        zzbzd zzbzdVar;
        int zzc;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (!z) {
            this.zze.zzt(currentTimeMillis);
            this.zze.zzJ(this.zza.zzd);
            return;
        }
        if (currentTimeMillis - this.zze.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaQ)).longValue()) {
            zzbzdVar = this.zza;
            zzc = -1;
        } else {
            zzbzdVar = this.zza;
            zzc = this.zze.zzc();
        }
        zzbzdVar.zzd = zzc;
        this.zzg = true;
    }

    public final zzbyv zzb(Clock clock, String str) {
        return new zzbyv(clock, this, this.zzf.zza(), str);
    }

    public final String zzc() {
        return this.zzf.zzb();
    }

    public final void zzd(zzbyv zzbyvVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbyvVar);
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzf(zzlVar, j);
        }
    }

    public final void zzj(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzk() {
        return this.zzg;
    }

    public final Bundle zzl(Context context, zzfbg zzfbgVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            zzbzf zzbzfVar = (zzbzf) it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbyv) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfbgVar.zzc(hashSet);
        return bundle;
    }
}

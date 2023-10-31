package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdat {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzewt zzo;

    public final zzdat zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdco(zzaVar, executor));
        return this;
    }

    public final zzdat zzb(zzcvl zzcvlVar, Executor executor) {
        this.zzi.add(new zzdco(zzcvlVar, executor));
        return this;
    }

    public final zzdat zzc(zzcvy zzcvyVar, Executor executor) {
        this.zzl.add(new zzdco(zzcvyVar, executor));
        return this;
    }

    public final zzdat zzd(zzcwc zzcwcVar, Executor executor) {
        this.zzf.add(new zzdco(zzcwcVar, executor));
        return this;
    }

    public final zzdat zze(zzcvi zzcviVar, Executor executor) {
        this.zze.add(new zzdco(zzcviVar, executor));
        return this;
    }

    public final zzdat zzf(zzcww zzcwwVar, Executor executor) {
        this.zzh.add(new zzdco(zzcwwVar, executor));
        return this;
    }

    public final zzdat zzg(zzcxh zzcxhVar, Executor executor) {
        this.zzg.add(new zzdco(zzcxhVar, executor));
        return this;
    }

    public final zzdat zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdco(zzoVar, executor));
        return this;
    }

    public final zzdat zzi(zzcxt zzcxtVar, Executor executor) {
        this.zzm.add(new zzdco(zzcxtVar, executor));
        return this;
    }

    public final zzdat zzj(zzcyd zzcydVar, Executor executor) {
        this.zzb.add(new zzdco(zzcydVar, executor));
        return this;
    }

    public final zzdat zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdco(appEventListener, executor));
        return this;
    }

    public final zzdat zzl(zzdcw zzdcwVar, Executor executor) {
        this.zzd.add(new zzdco(zzdcwVar, executor));
        return this;
    }

    public final zzdat zzm(zzewt zzewtVar) {
        this.zzo = zzewtVar;
        return this;
    }

    public final zzdav zzn() {
        return new zzdav(this, null);
    }
}

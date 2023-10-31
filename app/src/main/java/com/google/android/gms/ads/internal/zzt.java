package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzebr;
import com.google.android.gms.internal.ads.zzebs;

/* loaded from: classes.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbxy zzA;
    private final zzcg zzB;
    private final zzcdg zzC;
    private final zzcat zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfn zze;
    private final zzaa zzf;
    private final zzaus zzg;
    private final zzbzc zzh;
    private final zzab zzi;
    private final zzawf zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbbt zzm;
    private final zzaw zzn;
    private final zzbuo zzo;
    private final zzble zzp;
    private final zzcam zzq;
    private final zzbmp zzr;
    private final zzw zzs;
    private final zzbv zzt;
    private final com.google.android.gms.ads.internal.overlay.zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbnu zzw;
    private final zzbw zzx;
    private final zzebs zzy;
    private final zzawu zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfn zzcfnVar = new zzcfn();
        zzaa zzo = zzaa.zzo(Build.VERSION.SDK_INT);
        zzaus zzausVar = new zzaus();
        zzbzc zzbzcVar = new zzbzc();
        zzab zzabVar = new zzab();
        zzawf zzawfVar = new zzawf();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbbt zzbbtVar = new zzbbt();
        zzaw zzawVar = new zzaw();
        zzbuo zzbuoVar = new zzbuo();
        zzble zzbleVar = new zzble();
        zzcam zzcamVar = new zzcam();
        zzbmp zzbmpVar = new zzbmp();
        zzw zzwVar = new zzw();
        zzbv zzbvVar = new zzbv();
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = new com.google.android.gms.ads.internal.overlay.zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar2 = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbnu zzbnuVar = new zzbnu();
        zzbw zzbwVar = new zzbw();
        zzebr zzebrVar = new zzebr();
        zzawu zzawuVar = new zzawu();
        zzbxy zzbxyVar = new zzbxy();
        zzcg zzcgVar = new zzcg();
        zzcdg zzcdgVar = new zzcdg();
        zzcat zzcatVar = new zzcat();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcfnVar;
        this.zzf = zzo;
        this.zzg = zzausVar;
        this.zzh = zzbzcVar;
        this.zzi = zzabVar;
        this.zzj = zzawfVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbbtVar;
        this.zzn = zzawVar;
        this.zzo = zzbuoVar;
        this.zzp = zzbleVar;
        this.zzq = zzcamVar;
        this.zzr = zzbmpVar;
        this.zzt = zzbvVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar2;
        this.zzw = zzbnuVar;
        this.zzx = zzbwVar;
        this.zzy = zzebrVar;
        this.zzz = zzawuVar;
        this.zzA = zzbxyVar;
        this.zzB = zzcgVar;
        this.zzC = zzcdgVar;
        this.zzD = zzcatVar;
    }

    public static zzebs zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzaus zzb() {
        return zza.zzg;
    }

    public static zzawf zzc() {
        return zza.zzj;
    }

    public static zzawu zzd() {
        return zza.zzz;
    }

    public static zzbbt zze() {
        return zza.zzm;
    }

    public static zzbmp zzf() {
        return zza.zzr;
    }

    public static zzbnu zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzbuo zzm() {
        return zza.zzo;
    }

    public static zzbxy zzn() {
        return zza.zzA;
    }

    public static zzbzc zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzt;
    }

    public static zzbw zzu() {
        return zza.zzx;
    }

    public static zzcg zzv() {
        return zza.zzB;
    }

    public static zzcam zzw() {
        return zza.zzq;
    }

    public static zzcat zzx() {
        return zza.zzD;
    }

    public static zzcdg zzy() {
        return zza.zzC;
    }

    public static zzcfn zzz() {
        return zza.zze;
    }
}

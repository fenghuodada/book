package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeyi implements OnAdMetadataChangedListener, zzcww, zzcvl, zzcvi, zzcvy, zzcxt, zzewt, zzdcw {
    private final zzfbi zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzeyi(zzfbi zzfbiVar) {
        this.zza = zzfbiVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyc
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexo
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvw) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexp
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvw) obj).zze(i);
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzg(i);
            }
        });
    }

    public final void zzb(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final void zzbG(zzewt zzewtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexx
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzl();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzd(zzbvs zzbvsVar) {
        this.zzd.set(zzbvsVar);
    }

    public final void zze(zzbvw zzbvwVar) {
        this.zzc.set(zzbvwVar);
    }

    @Deprecated
    public final void zzf(zzbvc zzbvcVar) {
        this.zze.set(zzbvcVar);
    }

    @Deprecated
    public final void zzg(zzbux zzbuxVar) {
        this.zzg.set(zzbuxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzewk.zza(this.zzh, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(zzbvx zzbvxVar) {
        this.zzf.set(zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        this.zza.zza();
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zzg();
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexr
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexs
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvw) obj).zzg();
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyb
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zzj();
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexy
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzj();
            }
        });
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(final zzbuw zzbuwVar, final String str, final String str2) {
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                zzbuw zzbuwVar2 = zzbuw.this;
                ((zzbvs) obj).zzk(new zzbwg(zzbuwVar2.zzc(), zzbuwVar2.zzb()));
            }
        });
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                zzbuw zzbuwVar2 = zzbuw.this;
                ((zzbvx) obj).zze(new zzbwg(zzbuwVar2.zzc(), zzbuwVar2.zzb()), str, str2);
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyg
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zze(zzbuw.this);
            }
        });
        zzewk.zza(this.zzg, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbux) obj).zze(zzbuw.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzext
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvc) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzbvs) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
    }
}

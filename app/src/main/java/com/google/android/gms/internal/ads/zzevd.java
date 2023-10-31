package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzevd implements zzcvl, zzcxh, zzewt, com.google.android.gms.ads.internal.overlay.zzo, zzcxt, zzcvy, zzdcw {
    private final zzfbi zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzevd zzh = null;

    public zzevd(zzfbi zzfbiVar) {
        this.zza = zzfbiVar;
    }

    public static zzevd zzi(zzevd zzevdVar) {
        zzevd zzevdVar2 = new zzevd(zzevdVar.zza);
        zzevdVar2.zzh = zzevdVar;
        return zzevdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zza(zzeVar);
            return;
        }
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuo
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavu) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavu) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzb();
            return;
        }
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeux
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavy) obj).zzf();
            }
        });
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavy) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final void zzbG(zzewt zzewtVar) {
        this.zzh = (zzevd) zzewtVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzby();
        } else {
            zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeut
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzby();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zze();
        } else {
            zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeva
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzf(i);
        } else {
            zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeus
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzg() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzg();
        } else {
            zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzevc
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((zzcxh) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzh(zzsVar);
        } else {
            zzewk.zza(this.zzg, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeur
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    public final void zzj() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzj();
            return;
        }
        this.zza.zza();
        zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavv) obj).zza();
            }
        });
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((zzavy) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzk(zzeVar);
        } else {
            zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuz
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((zzavy) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzl(final zzavr zzavrVar) {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzl(zzavrVar);
        } else {
            zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeuv
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((zzavu) obj).zzd(zzavr.this);
                }
            });
        }
    }

    public final void zzn(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzp(zzavu zzavuVar) {
        this.zzb.set(zzavuVar);
    }

    public final void zzq(zzavy zzavyVar) {
        this.zzd.set(zzavyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzevd zzevdVar = this.zzh;
        if (zzevdVar != null) {
            zzevdVar.zzr();
        } else {
            zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzevb
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((zzavy) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
    }
}

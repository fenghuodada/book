package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzczp implements AppEventListener, OnAdMetadataChangedListener, zzcvi, com.google.android.gms.ads.internal.client.zza, zzcxt, zzcwc, zzcxh, com.google.android.gms.ads.internal.overlay.zzo, zzcvy, zzdcw {
    private final zzczn zza = new zzczn(this, null);
    @Nullable
    private zzejf zzb;
    @Nullable
    private zzejj zzc;
    @Nullable
    private zzevd zzd;
    @Nullable
    private zzeyi zze;

    public static /* bridge */ /* synthetic */ void zzn(zzczp zzczpVar, zzejf zzejfVar) {
        zzczpVar.zzb = zzejfVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(zzczp zzczpVar, zzevd zzevdVar) {
        zzczpVar.zzd = zzevdVar;
    }

    public static /* bridge */ /* synthetic */ void zzu(zzczp zzczpVar, zzejj zzejjVar) {
        zzczpVar.zzc = zzejjVar;
    }

    public static /* bridge */ /* synthetic */ void zzv(zzczp zzczpVar, zzeyi zzeyiVar) {
        zzczpVar.zze = zzeyiVar;
    }

    private static void zzw(Object obj, zzczo zzczoVar) {
        if (obj != null) {
            zzczoVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).onAdClicked();
            }
        });
        zzw(this.zzc, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejj) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczj
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                zzevd zzevdVar = (zzevd) obj;
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                zzevd zzevdVar = (zzevd) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                zzejf zzejfVar = (zzejf) obj;
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyk
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzbr();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyl
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzby();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzg() {
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final zzczn zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzj();
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcym
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyp
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzm();
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzo();
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(final zzbuw zzbuwVar, final String str, final String str2) {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyo
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                zzejf zzejfVar = (zzejf) obj;
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyq
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzp(zzbuw.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                zzejf zzejfVar = (zzejf) obj;
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcys
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzr();
            }
        });
        zzw(this.zzc, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyt
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejj) obj).zzr();
            }
        });
        zzw(this.zze, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzeyi) obj).zzr();
            }
        });
        zzw(this.zzd, new zzczo() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzevd) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
        zzw(this.zzb, new zzczo() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zza(Object obj) {
                ((zzejf) obj).zzs();
            }
        });
    }
}

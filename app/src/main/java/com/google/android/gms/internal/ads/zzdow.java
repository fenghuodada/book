package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdow implements zzcyd, zzcww, zzcvl, zzcwc, com.google.android.gms.ads.internal.client.zza, zzdap {
    private final zzawx zza;
    private boolean zzb = false;

    public zzdow(zzawx zzawxVar, @Nullable zzexa zzexaVar) {
        this.zza = zzawxVar;
        zzawxVar.zzc(2);
        if (zzexaVar != null) {
            zzawxVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
            return;
        }
        this.zza.zzc(7);
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzawx zzawxVar;
        int i;
        switch (zzeVar.zza) {
            case 1:
                zzawxVar = this.zza;
                i = 101;
                break;
            case 2:
                zzawxVar = this.zza;
                i = 102;
                break;
            case 3:
                zzawxVar = this.zza;
                i = 5;
                break;
            case 4:
                zzawxVar = this.zza;
                i = 103;
                break;
            case 5:
                zzawxVar = this.zza;
                i = 104;
                break;
            case 6:
                zzawxVar = this.zza;
                i = 105;
                break;
            case 7:
                zzawxVar = this.zza;
                i = 106;
                break;
            default:
                zzawxVar = this.zza;
                i = 4;
                break;
        }
        zzawxVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(final zzezr zzezrVar) {
        this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                zzezr zzezrVar2 = zzezr.this;
                zzaxi zzaxiVar = (zzaxi) zzaymVar.zza().zzaB();
                zzaya zzayaVar = (zzaya) zzaymVar.zza().zzd().zzaB();
                zzayaVar.zza(zzezrVar2.zzb.zzb.zzb);
                zzaxiVar.zzb(zzayaVar);
                zzaymVar.zze(zzaxiVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zze(final zzaxs zzaxsVar) {
        this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                zzaymVar.zzf(zzaxs.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzf(final zzaxs zzaxsVar) {
        this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                zzaymVar.zzf(zzaxs.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzi(final zzaxs zzaxsVar) {
        this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                zzaymVar.zzf(zzaxs.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        this.zza.zzc(3);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzdlm implements com.google.android.gms.ads.internal.client.zza, zzbhb, com.google.android.gms.ads.internal.overlay.zzo, zzbhd, com.google.android.gms.ads.internal.overlay.zzz {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbhb zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbhd zzd;
    private com.google.android.gms.ads.internal.overlay.zzz zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhb
    public final synchronized void zza(String str, Bundle bundle) {
        zzbhb zzbhbVar = this.zzb;
        if (zzbhbVar != null) {
            zzbhbVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbF() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbF();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final synchronized void zzbz(String str, @Nullable String str2) {
        zzbhd zzbhdVar = this.zzd;
        if (zzbhdVar != null) {
            zzbhdVar.zzbz(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zze;
        if (zzzVar != null) {
            zzzVar.zzg();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhb zzbhbVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhd zzbhdVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar) {
        this.zza = zzaVar;
        this.zzb = zzbhbVar;
        this.zzc = zzoVar;
        this.zzd = zzbhdVar;
        this.zze = zzzVar;
    }
}

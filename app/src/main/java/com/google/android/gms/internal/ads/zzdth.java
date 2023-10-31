package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdth implements com.google.android.gms.ads.internal.overlay.zzo, zzcgm {
    private final Context zza;
    private final zzbzz zzb;
    private zzdsz zzc;
    private zzcfb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    public zzdth(Context context, zzbzz zzbzzVar) {
        this.zza = context;
        this.zzb = zzbzzVar;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue()) {
            zzbzt.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfba.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            zzbzt.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfba.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziu)).intValue()) {
                    return true;
                }
            }
            zzbzt.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdaVar.zze(zzfba.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzbzt.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                zzdaVar.zze(zzfba.zzd(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Nullable
    public final Activity zzg() {
        zzcfb zzcfbVar = this.zzd;
        if (zzcfbVar == null || zzcfbVar.zzaz()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdsz zzdszVar) {
        this.zzc = zzdszVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbja zzbjaVar, zzbit zzbitVar) {
        if (zzl(zzdaVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcfb zza = zzcfn.zza(this.zza, zzcgq.zza(), "", false, false, null, null, this.zzb, null, null, null, zzawx.zza(), null, null);
                this.zzd = zza;
                zzcgo zzN = zza.zzN();
                if (zzN == null) {
                    zzbzt.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzdaVar.zze(zzfba.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzdaVar;
                zzN.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbjaVar, null, new zzbiz(this.zza), zzbitVar);
                zzN.zzA(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzis));
                com.google.android.gms.ads.internal.zzt.zzi();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            } catch (zzcfm e) {
                zzbzt.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzdaVar.zze(zzfba.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdth.this.zzi(str);
                }
            });
        }
    }
}

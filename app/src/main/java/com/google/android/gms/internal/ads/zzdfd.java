package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class zzdfd implements zzcvi, zzdcf {
    private final zzbxg zza;
    private final Context zzb;
    private final zzbxy zzc;
    @Nullable
    private final View zzd;
    private String zze;
    private final zzaxh zzf;

    public zzdfd(zzbxg zzbxgVar, Context context, zzbxy zzbxyVar, @Nullable View view, zzaxh zzaxhVar) {
        this.zza = zzbxgVar;
        this.zzb = context;
        this.zzc = zzbxyVar;
        this.zzd = view;
        this.zzf = zzaxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzg() {
        if (this.zzf == zzaxh.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        this.zze = String.valueOf(zzd).concat(this.zzf == zzaxh.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    @ParametersAreNonnullByDefault
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbxy zzbxyVar = this.zzc;
                Context context = this.zzb;
                zzbxyVar.zzo(context, zzbxyVar.zza(context), this.zza.zza(), zzbuwVar.zzc(), zzbuwVar.zzb());
            } catch (RemoteException e) {
                zzbzt.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcpg extends zzcpd {
    private final Context zzc;
    private final View zzd;
    @Nullable
    private final zzcfb zze;
    private final zzezg zzf;
    private final zzcrd zzg;
    private final zzdhn zzh;
    private final zzdcy zzi;
    private final zzgvi zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcpg(zzcre zzcreVar, Context context, zzezg zzezgVar, View view, @Nullable zzcfb zzcfbVar, zzcrd zzcrdVar, zzdhn zzdhnVar, zzdcy zzdcyVar, zzgvi zzgviVar, Executor executor) {
        super(zzcreVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfbVar;
        this.zzf = zzezgVar;
        this.zzg = zzcrdVar;
        this.zzh = zzdhnVar;
        this.zzi = zzdcyVar;
        this.zzj = zzgviVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcpg zzcpgVar) {
        zzdhn zzdhnVar = zzcpgVar.zzh;
        if (zzdhnVar.zze() == null) {
            return;
        }
        try {
            zzdhnVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcpgVar.zzj.zzb(), ObjectWrapper.wrap(zzcpgVar.zzc));
        } catch (RemoteException e) {
            zzbzt.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhr)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfaf unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzezg zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfae.zzb(zzqVar);
        }
        zzezf zzezfVar = this.zzb;
        if (zzezfVar.zzad) {
            for (String str : zzezfVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzezg(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzezg) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzezg zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcfb zzcfbVar;
        if (viewGroup == null || (zzcfbVar = this.zze) == null) {
            return;
        }
        zzcfbVar.zzag(zzcgq.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
            @Override // java.lang.Runnable
            public final void run() {
                zzcpg.zzi(zzcpg.this);
            }
        });
        super.zzj();
    }
}

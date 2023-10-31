package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzlp {
    private final Context zza;
    private final Handler zzb;
    private final zzll zzc;
    private final AudioManager zzd;
    @Nullable
    private zzlo zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzlp(Context context, Handler handler, zzll zzllVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzllVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzdy.zzb(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzlo zzloVar = new zzlo(this, null);
        try {
            applicationContext.registerReceiver(zzloVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzloVar;
        } catch (RuntimeException e) {
            zzer.zzf("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzlp zzlpVar) {
        zzlpVar.zzh();
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzer.zzf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void zzh() {
        zzeo zzeoVar;
        final int zzg = zzg(this.zzd, this.zzf);
        final boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg == zzg && this.zzh == zzi) {
            return;
        }
        this.zzg = zzg;
        this.zzh = zzi;
        zzeoVar = ((zzjp) this.zzc).zza.zzl;
        zzeoVar.zzd(30, new zzel() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcn) obj).zzc(zzg, zzi);
            }
        });
        zzeoVar.zzc();
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        return zzfn.zza >= 23 ? audioManager.isStreamMute(i) : zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        int streamMinVolume;
        if (zzfn.zza >= 28) {
            streamMinVolume = this.zzd.getStreamMinVolume(this.zzf);
            return streamMinVolume;
        }
        return 0;
    }

    public final void zze() {
        zzlo zzloVar = this.zze;
        if (zzloVar != null) {
            try {
                this.zza.unregisterReceiver(zzloVar);
            } catch (RuntimeException e) {
                zzer.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        zzlp zzlpVar;
        final zzz zzah;
        zzz zzzVar;
        zzeo zzeoVar;
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzh();
        zzjp zzjpVar = (zzjp) this.zzc;
        zzlpVar = zzjpVar.zza.zzz;
        zzah = zzjt.zzah(zzlpVar);
        zzzVar = zzjpVar.zza.zzab;
        if (zzah.equals(zzzVar)) {
            return;
        }
        zzjpVar.zza.zzab = zzah;
        zzeoVar = zzjpVar.zza.zzl;
        zzeoVar.zzd(29, new zzel() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcn) obj).zzb(zzz.this);
            }
        });
        zzeoVar.zzc();
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class zzcay implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbg zzb;

    public zzcay(zzcbg zzcbgVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcbgVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbh zzcbhVar;
        zzcbh zzcbhVar2;
        zzcbg.zzl(this.zzb, this.zza);
        zzcbg zzcbgVar = this.zzb;
        zzcbhVar = zzcbgVar.zzq;
        if (zzcbhVar != null) {
            zzcbhVar2 = zzcbgVar.zzq;
            zzcbhVar2.zzf();
        }
    }
}

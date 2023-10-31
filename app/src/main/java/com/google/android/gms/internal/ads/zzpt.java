package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class zzpt extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzpw zza;
    final /* synthetic */ zzpu zzb;

    public zzpt(zzpu zzpuVar, zzpw zzpwVar) {
        this.zzb = zzpuVar;
        this.zza = zzpwVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(zzpw.zzB(this.zzb.zza))) {
            zzpw zzpwVar = this.zzb.zza;
            if (zzpw.zzC(zzpwVar) == null || !zzpw.zzE(zzpwVar)) {
                return;
            }
            zzpw.zzC(zzpwVar).zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(zzpw.zzB(this.zzb.zza))) {
            zzpw zzpwVar = this.zzb.zza;
            if (zzpw.zzC(zzpwVar) == null || !zzpw.zzE(zzpwVar)) {
                return;
            }
            zzpw.zzC(zzpwVar).zzb();
        }
    }
}

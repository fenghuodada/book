package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpl {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdo zzi;
    public final boolean zzj = false;

    public zzpl(zzam zzamVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzdo zzdoVar, boolean z) {
        this.zza = zzamVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzdoVar;
    }

    public final long zza(long j) {
        return (j * 1000000) / this.zze;
    }

    public final AudioTrack zzb(boolean z, zzk zzkVar, int i) throws zzov {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        AudioTrack.Builder offloadedPlayback;
        try {
            int i2 = zzfn.zza;
            if (i2 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i).setOffloadedPlayback(this.zzc == 1);
                audioTrack = offloadedPlayback.build();
            } else if (i2 < 21) {
                int i3 = zzkVar.zzc;
                audioTrack = i == 0 ? new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1) : new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i);
            } else {
                AudioAttributes audioAttributes = zzkVar.zza().zza;
                build = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(audioAttributes, build, this.zzh, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzov(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzov(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes.dex */
public final class zzqz implements zzrm {
    private final MediaCodec zza;
    private final zzrf zzb;
    private final zzrd zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zzqz(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzqy zzqyVar) {
        this.zza = mediaCodec;
        this.zzb = new zzrf(handlerThread);
        this.zzc = new zzrd(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ String zzd(int i) {
        return zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i) {
        return zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void zzh(zzqz zzqzVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzqzVar.zzb.zzf(zzqzVar.zza);
        int i2 = zzfn.zza;
        Trace.beginSection("configureCodec");
        zzqzVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzqzVar.zzc.zzg();
        Trace.beginSection("startCodec");
        zzqzVar.zza.start();
        Trace.endSection();
        zzqzVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzs(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @Nullable
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @Nullable
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzk(int i, int i2, zzhf zzhfVar, long j, int i3) {
        this.zzc.zze(i, 0, zzhfVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final boolean zzr() {
        return false;
    }
}

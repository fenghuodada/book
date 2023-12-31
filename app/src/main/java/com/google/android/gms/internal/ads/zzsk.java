package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzsk implements zzrm {
    private final MediaCodec zza;
    @Nullable
    private ByteBuffer[] zzb;
    @Nullable
    private ByteBuffer[] zzc;

    public /* synthetic */ zzsk(MediaCodec mediaCodec, zzsj zzsjVar) {
        this.zza = mediaCodec;
        if (zzfn.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zzfn.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @Nullable
    public final ByteBuffer zzf(int i) {
        return zzfn.zza >= 21 ? this.zza.getInputBuffer(i) : this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @Nullable
    public final ByteBuffer zzg(int i) {
        return zzfn.zza >= 21 ? this.zza.getOutputBuffer(i) : this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzk(int i, int i2, zzhf zzhfVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzhfVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @RequiresApi(21)
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @RequiresApi(23)
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    @RequiresApi(19)
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

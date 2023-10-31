package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface zzrm {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i);

    @Nullable
    ByteBuffer zzg(int i);

    void zzi();

    void zzj(int i, int i2, int i3, long j, int i4);

    void zzk(int i, int i2, zzhf zzhfVar, long j, int i3);

    void zzl();

    @RequiresApi(21)
    void zzm(int i, long j);

    void zzn(int i, boolean z);

    @RequiresApi(23)
    void zzo(Surface surface);

    @RequiresApi(19)
    void zzp(Bundle bundle);

    void zzq(int i);

    boolean zzr();
}

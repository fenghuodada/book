package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface zzoz {
    int zza(zzam zzamVar);

    long zzb(boolean z);

    zzci zzc();

    void zzd(zzam zzamVar, int i, @Nullable int[] iArr) throws zzou;

    void zze();

    void zzf();

    void zzg();

    void zzh();

    void zzi() throws zzoy;

    void zzj();

    void zzk(zzk zzkVar);

    void zzl(int i);

    void zzm(zzl zzlVar);

    void zzn(zzow zzowVar);

    void zzo(zzci zzciVar);

    void zzp(@Nullable zzof zzofVar);

    @RequiresApi(23)
    void zzq(@Nullable AudioDeviceInfo audioDeviceInfo);

    void zzr(boolean z);

    void zzs(float f);

    boolean zzt(ByteBuffer byteBuffer, long j, int i) throws zzov, zzoy;

    boolean zzu();

    boolean zzv();

    boolean zzw(zzam zzamVar);
}

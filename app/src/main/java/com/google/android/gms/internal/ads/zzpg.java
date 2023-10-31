package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes.dex */
final class zzpg {
    @DoNotInline
    public static void zza(AudioTrack audioTrack, @Nullable zzpi zzpiVar) {
        audioTrack.setPreferredDevice(zzpiVar == null ? null : zzpiVar.zza);
    }
}

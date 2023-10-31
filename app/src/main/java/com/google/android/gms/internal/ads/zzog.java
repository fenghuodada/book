package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class zzog {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    public static int zza(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzfn.zzf(i3)).build(), zza);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    @DoNotInline
    public static int[] zzb() {
        zzfru zzfruVar;
        boolean isDirectPlaybackSupported;
        zzfro zzfroVar = new zzfro();
        zzfruVar = zzoh.zzc;
        zzftr it = zzfruVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza);
            if (isDirectPlaybackSupported) {
                zzfroVar.zzf(Integer.valueOf(intValue));
            }
        }
        zzfroVar.zzf((Object) 2);
        Object[] array = zzfroVar.zzi().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}

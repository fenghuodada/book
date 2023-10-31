package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class zzsf implements zzsd {
    private zzsf() {
    }

    public /* synthetic */ zzsf(zzse zzseVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final boolean zze() {
        return false;
    }
}

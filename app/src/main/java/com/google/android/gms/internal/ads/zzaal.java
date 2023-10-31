package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaal {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzam zza(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable zzad zzadVar) {
        zzfc zzfcVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfcVar = new zzfc(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzfcVar = new zzfc(copyOf, length);
            if (copyOf[0] == 31) {
                zzfc zzfcVar2 = new zzfc(copyOf, length);
                while (zzfcVar2.zza() >= 16) {
                    zzfcVar2.zzl(2);
                    zzfcVar.zzf(zzfcVar2.zzd(14), 14);
                }
            }
            zzfcVar.zzi(copyOf, copyOf.length);
        }
        zzfcVar.zzl(60);
        int i3 = zzb[zzfcVar.zzd(6)];
        int i4 = zzc[zzfcVar.zzd(4)];
        int zzd2 = zzfcVar.zzd(5);
        int i5 = zzd2 < 29 ? (zzd[zzd2] * 1000) / 2 : -1;
        zzfcVar.zzl(10);
        int i6 = i3 + (zzfcVar.zzd(2) > 0 ? 1 : 0);
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/vnd.dts");
        zzakVar.zzv(i5);
        zzakVar.zzw(i6);
        zzakVar.zzT(i4);
        zzakVar.zzB(null);
        zzakVar.zzK(str2);
        return zzakVar.zzY();
    }
}

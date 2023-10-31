package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzabx {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @Nullable
    public static zzca zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzfn.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzer.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzadk.zzb(new zzfd(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzer.zzf("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzafd(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzca(arrayList);
    }

    public static zzabu zzc(zzfd zzfdVar, boolean z, boolean z2) throws zzce {
        if (z) {
            zzd(3, zzfdVar, false);
        }
        String zzx = zzfdVar.zzx((int) zzfdVar.zzq(), zzfol.zzc);
        int length = zzx.length();
        long zzq = zzfdVar.zzq();
        String[] strArr = new String[(int) zzq];
        int i = length + 15;
        for (int i2 = 0; i2 < zzq; i2++) {
            String zzx2 = zzfdVar.zzx((int) zzfdVar.zzq(), zzfol.zzc);
            strArr[i2] = zzx2;
            i = i + 4 + zzx2.length();
        }
        if (z2 && (zzfdVar.zzk() & 1) == 0) {
            throw zzce.zza("framing bit expected to be set", null);
        }
        return new zzabu(zzx, strArr, i + 1);
    }

    public static boolean zzd(int i, zzfd zzfdVar, boolean z) throws zzce {
        if (zzfdVar.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzfdVar.zza();
            throw zzce.zza("too short header: " + zza, null);
        } else if (zzfdVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzce.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzfdVar.zzk() == 118 && zzfdVar.zzk() == 111 && zzfdVar.zzk() == 114 && zzfdVar.zzk() == 98 && zzfdVar.zzk() == 105 && zzfdVar.zzk() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzce.zza("expected characters 'vorbis'", null);
        }
    }
}

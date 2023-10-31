package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class zzaas {
    public static int zza(zzaap zzaapVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzaapVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, @Nullable String str) throws zzce {
        if (!z) {
            throw zzce.zza(str, null);
        }
    }

    public static boolean zzc(zzaap zzaapVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzaapVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzaap zzaapVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzaae) zzaapVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaap zzaapVar, int i) throws IOException {
        try {
            ((zzaae) zzaapVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

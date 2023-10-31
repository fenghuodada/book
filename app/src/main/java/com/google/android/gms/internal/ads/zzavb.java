package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzavb {
    @VisibleForTesting
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    @VisibleForTesting
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e) {
            zzbzt.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e2) {
                zzbzt.zzh("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}

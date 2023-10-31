package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class zzgq extends zzfy {
    public final zzgc zzb;
    public final int zzc;

    public zzgq(zzgc zzgcVar, int i, int i2) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzgcVar;
        this.zzc = 1;
    }

    public zzgq(IOException iOException, zzgc zzgcVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzgcVar;
        this.zzc = i2;
    }

    public zzgq(String str, zzgc zzgcVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzgcVar;
        this.zzc = i2;
    }

    public zzgq(String str, @Nullable IOException iOException, zzgc zzgcVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzgcVar;
        this.zzc = i2;
    }

    public static zzgq zza(IOException iOException, zzgc zzgcVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzfof.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzgp(iOException, zzgcVar) : new zzgq(iOException, zzgcVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i;
    }
}

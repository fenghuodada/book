package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzgx extends zzfr {
    private final Resources zza;
    private final String zzb;
    @Nullable
    private Uri zzc;
    @Nullable
    private AssetFileDescriptor zzd;
    @Nullable
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzgx(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzgw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzgw(null, e, AdError.SERVER_ERROR_CODE);
                }
            }
            InputStream inputStream = this.zze;
            int i3 = zzfn.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzgw("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
            }
            long j2 = this.zzf;
            if (j2 != -1) {
                this.zzf = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    @Override // com.google.android.gms.internal.ads.zzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgc r16) throws com.google.android.gms.internal.ads.zzgw {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgx.zzb(com.google.android.gms.internal.ads.zzgc):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws zzgw {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new zzgw(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new zzgw(null, e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new zzgw(null, e3, AdError.SERVER_ERROR_CODE);
        }
    }
}

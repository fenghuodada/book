package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class zzfu extends zzfr {
    private final ContentResolver zza;
    @Nullable
    private Uri zzb;
    @Nullable
    private AssetFileDescriptor zzc;
    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfu(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzft {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzft(e, AdError.SERVER_ERROR_CODE);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzfn.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzft {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = zzgcVar.zza;
                this.zzb = uri;
                zzi(zzgcVar);
                if ("content".equals(zzgcVar.zza.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: ".concat(String.valueOf(uri)));
                    i = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new zzft(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e) {
                        e = e;
                        if (true == (e instanceof FileNotFoundException)) {
                            i = 2005;
                        }
                        throw new zzft(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && zzgcVar.zzf > length) {
                    throw new zzft(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzgcVar.zzf + startOffset) - startOffset;
                if (skip == zzgcVar.zzf) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.zze = -1L;
                            j = -1;
                        } else {
                            j = size - channel.position();
                            this.zze = j;
                            if (j < 0) {
                                throw new zzft(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        j = length - skip;
                        this.zze = j;
                        if (j < 0) {
                            throw new zzft(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j2 = zzgcVar.zzg;
                    if (j2 != -1) {
                        if (j != -1) {
                            j2 = Math.min(j, j2);
                        }
                        this.zze = j2;
                    }
                    this.zzf = true;
                    zzj(zzgcVar);
                    long j3 = zzgcVar.zzg;
                    return j3 != -1 ? j3 : this.zze;
                }
                throw new zzft(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (zzft e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = AdError.SERVER_ERROR_CODE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws zzft {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new zzft(e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new zzft(e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new zzft(e3, AdError.SERVER_ERROR_CODE);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzfq extends zzfr {
    private final AssetManager zza;
    @Nullable
    private Uri zzb;
    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfq(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzfp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzfp(e, AdError.SERVER_ERROR_CODE);
                }
            }
            InputStream inputStream = this.zzc;
            int i3 = zzfn.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zzd;
            if (j2 != -1) {
                this.zzd = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzfp {
        try {
            Uri uri = zzgcVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            zzi(zzgcVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzgcVar.zzf) >= zzgcVar.zzf) {
                long j = zzgcVar.zzg;
                if (j != -1) {
                    this.zzd = j;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzgcVar);
                return this.zzd;
            }
            throw new zzfp(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzfp e) {
            throw e;
        } catch (IOException e2) {
            throw new zzfp(e2, true != (e2 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws zzfp {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzfp(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}

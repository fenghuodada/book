package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzceb extends zzfr {
    private final Context zza;
    private final zzfx zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawj zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzfwb zzo;
    private final AtomicLong zzp;
    private final zzcee zzq;

    public zzceb(Context context, zzfx zzfxVar, String str, int i, zzgz zzgzVar, zzcee zzceeVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfxVar;
        this.zzq = zzceeVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue();
        zzf(zzgzVar);
    }

    private final boolean zzr() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeb)).booleanValue() || this.zzl) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzec)).booleanValue() && !this.zzm;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
            if (!this.zze || this.zzf != null) {
                zzg(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgc r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceb.zzb(com.google.android.gms.internal.ads.zzgc):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.zzg = false;
        this.zzh = null;
        if (!this.zze || this.zzf != null) {
            z = true;
        }
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi == null) {
            return -1L;
        }
        if (this.zzp.get() == -1) {
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcag.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcea
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzceb.this.zzm();
                        }
                    });
                }
            }
            if (!this.zzo.isDone()) {
                return -1L;
            }
            try {
                this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.zzp.get();
    }

    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}

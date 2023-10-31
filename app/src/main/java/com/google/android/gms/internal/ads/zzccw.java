package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzccw implements zzfx {
    private final Context zza;
    private final zzfx zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawj zzi;
    private zzgc zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue();

    public zzccw(Context context, zzfx zzfxVar, String str, int i, zzgz zzgzVar, zzccv zzccvVar) {
        this.zza = context;
        this.zzb = zzfxVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeb)).booleanValue() || this.zzj) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzec)).booleanValue() && !this.zzk;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgcVar.zza;
        this.zzh = uri;
        this.zzm = zzgcVar;
        this.zzi = zzawj.zza(uri);
        zzawg zzawgVar = 0;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdY)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgcVar.zzf;
                this.zzi.zzi = zzfpo.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawgVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            }
            if (zzawgVar != 0 && zzawgVar.zze()) {
                this.zzj = zzawgVar.zzg();
                this.zzk = zzawgVar.zzf();
                if (!zzg()) {
                    this.zzf = zzawgVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgcVar.zzf;
            this.zzi.zzi = zzfpo.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this.zzi.zzg ? zzbbk.zzea : zzbbk.zzdZ)).longValue();
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzawu.zza(this.zza, this.zzi);
            try {
                zzawv zzawvVar = (zzawv) zza.get(longValue, TimeUnit.MILLISECONDS);
                zzawvVar.zzd();
                this.zzj = zzawvVar.zzf();
                this.zzk = zzawvVar.zze();
                zzawvVar.zza();
                if (zzg()) {
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                }
                this.zzf = zzawvVar.zzc();
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            } catch (InterruptedException unused) {
                zza.cancel(false);
                Thread.currentThread().interrupt();
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            } catch (ExecutionException | TimeoutException unused2) {
                zza.cancel(false);
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            }
        }
        if (this.zzi != null) {
            this.zzm = new zzgc(Uri.parse(this.zzi.zza), null, zzgcVar.zze, zzgcVar.zzf, zzgcVar.zzg, null, zzgcVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
            return;
        }
        IOUtils.closeQuietly(inputStream);
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgz zzgzVar) {
    }
}

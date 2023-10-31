package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.concurrent.futures.C0485b;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzcdt extends zzcdn implements zzgz {
    private String zzd;
    private final zzccb zze;
    private boolean zzf;
    private final zzcds zzg;
    private final zzccy zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcdt(zzccc zzcccVar, zzccb zzccbVar) {
        super(zzcccVar);
        this.zze = zzccbVar;
        this.zzg = new zzcds();
        this.zzh = new zzccy();
        this.zzk = new Object();
        this.zzl = (String) zzfov.zzd(zzcccVar != null ? zzcccVar.zzbl() : null).zzb("");
        this.zzm = zzcccVar != null ? zzcccVar.zzf() : 0;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbzm.zze(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcbt.zzs();
        int zzu = zzcbt.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zza(zzfx zzfxVar, zzgc zzgcVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzb(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzc(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzd(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
        if (zzfxVar instanceof zzgk) {
            this.zzg.zzb((zzgk) zzfxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzt(String str) {
        String str2;
        String str3;
        zzcdt zzcdtVar;
        String str4;
        String str5 = str;
        this.zzd = str5;
        String zzm = zzm(str);
        int i = 0;
        try {
            zzgf zzgfVar = new zzgf();
            zzgfVar.zzf(this.zzb);
            zzgfVar.zzc(this.zze.zzd);
            zzgfVar.zzd(this.zze.zzf);
            zzgfVar.zzb(true);
            zzgfVar.zze(this);
            zzfx zza = zzgfVar.zza();
            if (this.zze.zzj) {
                zza = new zzccw(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzgc(Uri.parse(str)));
            zzccc zzcccVar = (zzccc) this.zzc.get();
            if (zzcccVar != null) {
                zzcccVar.zzt(zzm, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzx)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            str2 = "error";
            long j = currentTimeMillis;
            while (true) {
                try {
                    int zza2 = zza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzj(str5, zzm, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    synchronized (this.zzk) {
                        try {
                            if (!this.zzf) {
                                str5 = null;
                                this.zzi.put(bArr, 0, zza2);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            zzcdtVar = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e = e;
                                        str4 = str2;
                                        String m12391a = C0485b.m12391a(e.getClass().getCanonicalName(), ":", e.getMessage());
                                        zzbzt.zzj("Failed to preload url " + str3 + " Exception: " + m12391a);
                                        zzcdtVar.zzg(str3, zzm, str4, m12391a);
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzv();
                        return true;
                    }
                    try {
                        if (!this.zzf) {
                            long currentTimeMillis2 = zzB.currentTimeMillis();
                            if (currentTimeMillis2 - j >= longValue) {
                                zzv();
                                j = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis <= 1000 * longValue2) {
                                i = 0;
                                i2 = 8192;
                                str5 = str;
                            } else {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                        } else {
                            int limit = this.zzi.limit();
                            throw new IOException("Precache abort at " + limit + " bytes");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zzcdtVar = this;
                        str4 = str5;
                        str3 = str;
                        String m12391a2 = C0485b.m12391a(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzbzt.zzj("Failed to preload url " + str3 + " Exception: " + m12391a2);
                        zzcdtVar.zzg(str3, zzm, str4, m12391a2);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str2;
                    String m12391a22 = C0485b.m12391a(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzbzt.zzj("Failed to preload url " + str3 + " Exception: " + m12391a22);
                    zzcdtVar.zzg(str3, zzm, str4, m12391a22);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "error";
        }
    }
}

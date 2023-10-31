package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzcdw extends zzcdn implements zzcbs {
    public static final /* synthetic */ int zzd = 0;
    private zzcbt zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdf zzi;
    private long zzj;
    private long zzk;

    public zzcdw(zzccc zzcccVar, zzccb zzccbVar) {
        super(zzcccVar);
        zzceo zzceoVar = new zzceo(zzcccVar.getContext(), zzccbVar, (zzccc) this.zzc.get(), null);
        zzbzt.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzceoVar;
        zzceoVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzbzm.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.FORWARD_SLASH_STRING + canonicalName + ":" + message;
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdv
            @Override // java.lang.Runnable
            public final void run() {
                zzcdw.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbt zzcbtVar = this.zze;
        if (zzcbtVar != null) {
            zzcbtVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzD(int i, int i2) {
    }

    public final zzcbt zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbt zzcbtVar = this.zze;
        this.zze = null;
        return zzcbtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcdw, com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcdw] */
    /* JADX WARN: Type inference failed for: r3v30 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcdw zzcdwVar;
        zzcdw zzcdwVar2;
        ?? longValue;
        long intValue;
        zzcdw zzcdwVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc = zzc(this.zzf);
        String str3 = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzx)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzw)).intValue();
            zzcdwVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzcdwVar = this;
        }
        synchronized (this) {
            try {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
                long j4 = this.zzj;
                if (currentTimeMillis - j4 <= longValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzz = this.zze.zzz();
                            if (zzz > 0) {
                                long zzv = this.zze.zzv();
                                if (zzv != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzc;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zzcdwVar = this;
                                        str = zzc;
                                    }
                                    try {
                                        zzo(this.zzf, zzc, zzv, zzz, zzv > 0, zzcdwVar != 0 ? this.zze.zzA() : -1L, zzcdwVar != 0 ? this.zze.zzx() : -1L, zzcdwVar != 0 ? this.zze.zzB() : -1L, zzcbt.zzs(), zzcbt.zzu());
                                        zzcdwVar = this;
                                        j = zzv;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        zzcdwVar = this;
                                        str = str2;
                                        throw th;
                                    }
                                    try {
                                        zzcdwVar.zzk = j;
                                        j3 = zzz;
                                        zzcdwVar = zzcdwVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str = str2;
                                        throw th;
                                    }
                                } else {
                                    j = zzv;
                                    j2 = intValue;
                                    str2 = zzc;
                                    zzcdwVar = this;
                                    j3 = zzz;
                                }
                                if (j >= j3) {
                                    zzcdwVar.zzj(zzcdwVar.zzf, str2, j3);
                                } else {
                                    int i = (zzcdwVar.zze.zzw() > j2 ? 1 : (zzcdwVar.zze.zzw() == j2 ? 0 : -1));
                                    zzcdwVar3 = zzcdwVar;
                                    if (i >= 0) {
                                        zzcdwVar3 = zzcdwVar;
                                        if (j > 0) {
                                        }
                                    }
                                }
                                zzcdwVar2 = zzcdwVar;
                            } else {
                                zzcdwVar3 = this;
                            }
                            zzcdwVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzy)).longValue());
                            return;
                        }
                        zzcdwVar2 = this;
                        com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcdwVar2.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = longValue;
                        str = j4;
                    }
                } else {
                    str = zzc;
                    zzcdwVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzcdwVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                zzbzt.zzj("Failed to preload url " + zzcdwVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcdwVar.zzg(zzcdwVar.zzf, str, str4, zzd(str4, e));
                zzcdwVar2 = zzcdwVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcdwVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzi(final boolean z, final long j) {
        final zzccc zzcccVar = (zzccc) this.zzc.get();
        if (zzcccVar != null) {
            zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdu
                @Override // java.lang.Runnable
                public final void run() {
                    zzccc.this.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzk(String str, Exception exc) {
        zzbzt.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzl(String str, Exception exc) {
        zzbzt.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzcdw zzcdwVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        zzcdw zzcdwVar2 = this;
        String str5 = str;
        zzcdwVar2.zzf = str5;
        String str6 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcdwVar2.zze.zzF(uriArr, zzcdwVar2.zzb);
            zzccc zzcccVar = (zzccc) zzcdwVar2.zzc.get();
            if (zzcccVar != null) {
                zzcccVar.zzt(zzc, zzcdwVar2);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzx)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        } else if (zzcdwVar2.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        } else {
                            if (zzcdwVar2.zzh) {
                                break;
                            } else if (!zzcdwVar2.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            } else {
                                long zzz = zzcdwVar2.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = zzcdwVar2.zze.zzv();
                                    if (zzv != j7) {
                                        try {
                                            j = intValue;
                                            long j8 = zzz;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzc;
                                            try {
                                                zzo(str, zzc, zzv, j8, zzv > 0, booleanValue ? zzcdwVar2.zze.zzA() : -1L, booleanValue ? zzcdwVar2.zze.zzx() : -1L, booleanValue ? zzcdwVar2.zze.zzB() : -1L, zzcbt.zzs(), zzcbt.zzu());
                                                j6 = zzv;
                                                j5 = zzz;
                                                str2 = j8;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzcdwVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str7 = str6;
                                                    zzbzt.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzcdwVar.zzg(str2, str3, str7, zzd(str7, e));
                                                    return false;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcdwVar = this;
                                            str2 = str;
                                            str3 = zzc;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str4 = zzc;
                                        j5 = zzz;
                                        j6 = j7;
                                        str2 = intValue;
                                    }
                                    zzcdwVar = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                                    if (zzcdwVar >= 0) {
                                        zzj(str, str4, j5);
                                        break;
                                    }
                                    try {
                                        zzcdw zzcdwVar3 = this;
                                        str2 = str;
                                        str3 = str4;
                                        if (zzcdwVar3.zze.zzw() >= j && zzv > 0) {
                                            break;
                                        }
                                        j3 = j4;
                                        r1 = j6;
                                        zzcdwVar = zzcdwVar3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } else {
                                    j = intValue;
                                    j2 = longValue2;
                                    str2 = str5;
                                    str3 = zzc;
                                    zzcdwVar = zzcdwVar2;
                                    j3 = longValue;
                                    r1 = j7;
                                }
                                try {
                                    try {
                                        zzcdwVar.wait(j3);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r1;
                                        throw th;
                                    }
                                } catch (InterruptedException unused) {
                                    throw new IOException("Wait interrupted.");
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzc;
                        zzcdwVar = zzcdwVar2;
                    }
                }
                longValue = j3;
                zzcdwVar2 = zzcdwVar;
                str5 = str2;
                zzc = str3;
                intValue = j;
                longValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzc;
            zzcdwVar = zzcdwVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv() {
        zzbzt.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzw(String str, String[] strArr, zzcdf zzcdfVar) {
        this.zzf = str;
        this.zzi = zzcdfVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzccc zzcccVar = (zzccc) this.zzc.get();
            if (zzcccVar != null) {
                zzcccVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            zzbzt.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}

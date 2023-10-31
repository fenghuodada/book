package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyl {
    private final zzyx zza;
    private final zzym zzb;
    private Handler zze;
    @Nullable
    private zzdl zzf;
    @Nullable
    private CopyOnWriteArrayList zzg;
    @Nullable
    private zzam zzh;
    private Pair zzi;
    @Nullable
    private Pair zzj;
    private boolean zzm;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private int zzk = -1;
    private boolean zzl = true;
    private final zzdn zzn = zzdn.zza;
    private long zzo = -9223372036854775807L;
    private long zzp = -9223372036854775807L;

    public zzyl(zzyx zzyxVar, zzym zzymVar) {
        this.zza = zzyxVar;
        this.zzb = zzymVar;
    }

    private final void zzp(long j, boolean z) {
        zzdy.zzb(this.zzf);
        this.zzf.zzf();
        this.zzc.remove();
        this.zzb.zzA = SystemClock.elapsedRealtime() * 1000;
        if (j != -2) {
            this.zzb.zzaE();
        }
    }

    public final long zza(long j, long j2) {
        zzdy.zzf(this.zzp != -9223372036854775807L);
        return (j + j2) - this.zzp;
    }

    public final MediaFormat zzb(MediaFormat mediaFormat) {
        Context context;
        if (zzfn.zza >= 29) {
            context = this.zzb.zze;
            if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
        }
        return mediaFormat;
    }

    public final Surface zzc() {
        zzdl zzdlVar = this.zzf;
        zzdlVar.getClass();
        return zzdlVar.zzb();
    }

    public final void zzd() {
        zzdl zzdlVar = this.zzf;
        zzdlVar.getClass();
        zzdlVar.zzh();
        this.zzj = null;
    }

    public final void zze() {
        zzdy.zzb(this.zzf);
        this.zzf.zzc();
        this.zzc.clear();
        this.zze.removeCallbacksAndMessages(null);
        if (this.zzm) {
            this.zzm = false;
        }
    }

    public final void zzf(String str) {
        Context context;
        context = this.zzb.zze;
        int i = 1;
        if (zzfn.zza >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i = zzfof.zzb(str).startsWith("OMX.") ? 5 : Integer.MAX_VALUE;
        }
        this.zzk = i;
    }

    public final void zzg(long j, long j2) {
        long zzaO;
        boolean zzaW;
        long j3;
        zzdy.zzb(this.zzf);
        while (!this.zzc.isEmpty()) {
            boolean z = this.zzb.zzbc() == 2;
            Long l = (Long) this.zzc.peek();
            l.getClass();
            long longValue = l.longValue() + this.zzp;
            zzaO = this.zzb.zzaO(j, j2, SystemClock.elapsedRealtime() * 1000, longValue, z);
            zzaW = this.zzb.zzaW(j, zzaO);
            if (zzaW) {
                zzp(-1L, false);
                return;
            } else if (!z) {
                return;
            } else {
                j3 = this.zzb.zzt;
                if (j == j3 || zzaO > 50000) {
                    return;
                }
                this.zza.zzd(longValue);
                long zza = this.zza.zza(System.nanoTime() + (zzaO * 1000));
                if (zzym.zzaN((zza - System.nanoTime()) / 1000, j2, false)) {
                    zza = -2;
                } else {
                    if (!this.zzd.isEmpty() && longValue > ((Long) ((Pair) this.zzd.peek()).first).longValue()) {
                        this.zzi = (Pair) this.zzd.remove();
                    }
                    zzam zzamVar = (zzam) this.zzi.second;
                    if (this.zzo >= longValue) {
                        this.zzo = -9223372036854775807L;
                        this.zzb.zzaQ(this.zzn);
                    }
                }
                zzp(zza, false);
            }
        }
    }

    public final void zzh() {
        zzdl zzdlVar = this.zzf;
        zzdlVar.getClass();
        zzdlVar.zze();
        this.zzf = null;
        Handler handler = this.zze;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzg;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.zzc.clear();
        this.zzl = true;
    }

    public final void zzi(zzam zzamVar) {
        zzdl zzdlVar = this.zzf;
        zzdlVar.getClass();
        zzan zzanVar = new zzan(zzamVar.zzr, zzamVar.zzs);
        zzanVar.zza(zzamVar.zzv);
        zzanVar.zzb();
        zzdlVar.zzg();
        this.zzh = zzamVar;
        if (this.zzm) {
            this.zzm = false;
        }
    }

    public final void zzj(Surface surface, zzff zzffVar) {
        Pair pair = this.zzj;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzff) this.zzj.second).equals(zzffVar)) {
            return;
        }
        this.zzj = Pair.create(surface, zzffVar);
        if (zzl()) {
            zzdl zzdlVar = this.zzf;
            zzdlVar.getClass();
            zzffVar.zzb();
            zzffVar.zza();
            zzdlVar.zzh();
        }
    }

    public final void zzk(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzg;
        if (copyOnWriteArrayList == null) {
            this.zzg = new CopyOnWriteArrayList(list);
            return;
        }
        copyOnWriteArrayList.clear();
        this.zzg.addAll(list);
    }

    public final boolean zzl() {
        return this.zzf != null;
    }

    public final boolean zzm() {
        Pair pair = this.zzj;
        return pair == null || !((zzff) pair.second).equals(zzff.zza);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 == 6) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzn(com.google.android.gms.internal.ads.zzam r7, long r8) throws com.google.android.gms.internal.ads.zzia {
        /*
            r6 = this;
            boolean r0 = r6.zzl()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdy.zzf(r0)
            boolean r0 = r6.zzl
            r2 = 0
            if (r0 != 0) goto Lf
            return r2
        Lf:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.zzg
            if (r0 != 0) goto L16
            r6.zzl = r2
            return r2
        L16:
            r0 = 0
            android.os.Handler r0 = com.google.android.gms.internal.ads.zzfn.zzs(r0)
            r6.zze = r0
            com.google.android.gms.internal.ads.zzs r0 = r7.zzy
            com.google.android.gms.internal.ads.zzs r3 = com.google.android.gms.internal.ads.zzs.zza
            if (r0 == 0) goto L3c
            int r3 = r0.zzf
            r4 = 7
            r5 = 6
            if (r3 == r4) goto L2c
            if (r3 != r5) goto L3c
            goto L3e
        L2c:
            com.google.android.gms.internal.ads.zzr r3 = r0.zzc()
            r3.zzc(r5)
            com.google.android.gms.internal.ads.zzs r3 = r3.zzd()
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            goto L42
        L3c:
            com.google.android.gms.internal.ads.zzs r0 = com.google.android.gms.internal.ads.zzs.zza
        L3e:
            android.util.Pair r0 = android.util.Pair.create(r0, r0)
        L42:
            boolean r3 = com.google.android.gms.internal.ads.zzym.zzaL()     // Catch: java.lang.Exception -> L8f
            if (r3 != 0) goto L56
            int r3 = r7.zzu     // Catch: java.lang.Exception -> L8f
            if (r3 == 0) goto L56
            java.util.concurrent.CopyOnWriteArrayList r4 = r6.zzg     // Catch: java.lang.Exception -> L8f
            float r3 = (float) r3     // Catch: java.lang.Exception -> L8f
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzyk.zza(r3)     // Catch: java.lang.Exception -> L8f
            r4.add(r2, r3)     // Catch: java.lang.Exception -> L8f
        L56:
            com.google.android.gms.internal.ads.zzdk r2 = com.google.android.gms.internal.ads.zzyk.zzb()     // Catch: java.lang.Exception -> L8f
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.zzg     // Catch: java.lang.Exception -> L8f
            r3.getClass()
            com.google.android.gms.internal.ads.zzv r3 = com.google.android.gms.internal.ads.zzv.zzb     // Catch: java.lang.Exception -> L8f
            java.lang.Object r3 = r0.first     // Catch: java.lang.Exception -> L8f
            com.google.android.gms.internal.ads.zzs r3 = (com.google.android.gms.internal.ads.zzs) r3     // Catch: java.lang.Exception -> L8f
            java.lang.Object r0 = r0.second     // Catch: java.lang.Exception -> L8f
            com.google.android.gms.internal.ads.zzs r0 = (com.google.android.gms.internal.ads.zzs) r0     // Catch: java.lang.Exception -> L8f
            android.os.Handler r0 = r6.zze     // Catch: java.lang.Exception -> L8f
            r0.getClass()     // Catch: java.lang.Exception -> L8f
            com.google.android.gms.internal.ads.zzdl r0 = r2.zza()     // Catch: java.lang.Exception -> L8f
            r6.zzf = r0     // Catch: java.lang.Exception -> L8f
            r6.zzp = r8     // Catch: java.lang.Exception -> L8f
            android.util.Pair r8 = r6.zzj
            if (r8 == 0) goto L8b
            java.lang.Object r9 = r8.second
            com.google.android.gms.internal.ads.zzff r9 = (com.google.android.gms.internal.ads.zzff) r9
            java.lang.Object r8 = r8.first
            android.view.Surface r8 = (android.view.Surface) r8
            r9.zzb()
            r9.zza()
            r0.zzh()
        L8b:
            r6.zzi(r7)
            return r1
        L8f:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzym r9 = r6.zzb
            r0 = 7000(0x1b58, float:9.809E-42)
            com.google.android.gms.internal.ads.zzia r7 = com.google.android.gms.internal.ads.zzym.zzaB(r9, r8, r7, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyl.zzn(com.google.android.gms.internal.ads.zzam, long):boolean");
    }

    public final boolean zzo(zzam zzamVar, long j, boolean z) {
        zzdy.zzb(this.zzf);
        zzdy.zzf(this.zzk != -1);
        zzdy.zzf(!this.zzm);
        if (this.zzf.zza() < this.zzk) {
            this.zzf.zzd();
            Pair pair = this.zzi;
            if (pair == null) {
                this.zzi = Pair.create(Long.valueOf(j), zzamVar);
            } else if (!zzfn.zzB(zzamVar, pair.second)) {
                this.zzd.add(Pair.create(Long.valueOf(j), zzamVar));
            }
            if (z) {
                this.zzm = true;
            }
            return true;
        }
        return false;
    }
}

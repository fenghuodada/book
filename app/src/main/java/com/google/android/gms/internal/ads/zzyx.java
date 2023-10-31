package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzyx {
    private final zzyg zza = new zzyg();
    @Nullable
    private final zzyt zzb;
    @Nullable
    private final zzyw zzc;
    private boolean zzd;
    @Nullable
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzyx(@Nullable Context context) {
        zzyt zzytVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzfn.zza;
            zzytVar = zzyv.zzc(applicationContext);
            if (zzytVar == null) {
                zzytVar = zzyu.zzc(applicationContext);
            }
        } else {
            zzytVar = null;
        }
        this.zzb = zzytVar;
        this.zzc = zzytVar != null ? zzyw.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzyx zzyxVar, Display display) {
        long j;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzyxVar.zzk = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            zzer.zze("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            zzyxVar.zzk = -9223372036854775807L;
        }
        zzyxVar.zzl = j;
    }

    private final void zzk() {
        Surface surface;
        if (zzfn.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzys.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r9.zza.zzb() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzm() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.zzfn.zza
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r9.zze
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.zzyg r0 = r9.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzyg r0 = r9.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r9.zzf
        L1c:
            float r2 = r9.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L58
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzyg r1 = r9.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzyg r1 = r9.zza
            long r3 = r1.zzd()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r4 != 0) goto L68
            com.google.android.gms.internal.ads.zzyg r2 = r9.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            if (r5 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r9.zzg = r0
            r9.zzn(r6)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzfn.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzys.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j3 = this.zzq + (((float) ((this.zzm - this.zzp) * zzc)) / this.zzi);
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzyw zzywVar = this.zzc;
        if (zzywVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j4 = zzywVar.zza;
        if (j4 == -9223372036854775807L) {
            return j;
        }
        long j5 = this.zzk;
        long j6 = (((j - j4) / j5) * j5) + j4;
        if (j <= j6) {
            j2 = j6 - j5;
        } else {
            j2 = j6;
            j6 = j5 + j6;
        }
        long j7 = this.zzl;
        if (j6 - j >= j - j2) {
            j6 = j2;
        }
        return j6 - j7;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzyw zzywVar = this.zzc;
            zzywVar.getClass();
            zzywVar.zzb();
            this.zzb.zzb(new zzyr(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzyt zzytVar = this.zzb;
        if (zzytVar != null) {
            zzytVar.zza();
            zzyw zzywVar = this.zzc;
            zzywVar.getClass();
            zzywVar.zzc();
        }
        zzk();
    }

    public final void zzi(@Nullable Surface surface) {
        if (true == (surface instanceof zzyp)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}

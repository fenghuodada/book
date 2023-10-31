package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zztg extends zzvm {
    private final boolean zzb;
    private final zzcw zzc;
    private final zzcu zzd;
    private zzte zze;
    @Nullable
    private zztd zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztg(zztn zztnVar, boolean z) {
        super(zztnVar);
        boolean z2;
        if (z) {
            zztnVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        zztnVar.zzL();
        this.zze = zzte.zzq(zztnVar.zzI());
    }

    private final Object zzJ(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzte.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzK(long j) {
        zztd zztdVar = this.zzf;
        int zza = this.zze.zza(zztdVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzte zzteVar = this.zze;
        zzcu zzcuVar = this.zzd;
        zzteVar.zzd(zza, zzcuVar, false);
        long j2 = zzcuVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zztdVar.zzs(j);
    }

    public final zzcx zzB() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    @Nullable
    public final zztl zzC(zztl zztlVar) {
        Object obj;
        Object obj2;
        Object obj3 = zztlVar.zza;
        obj = this.zze.zzf;
        if (obj != null) {
            obj2 = this.zze.zzf;
            if (obj2.equals(obj3)) {
                obj3 = zzte.zzd;
            }
        }
        return zztlVar.zzc(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzD(com.google.android.gms.internal.ads.zzcx r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzte r0 = r14.zze
            com.google.android.gms.internal.ads.zzte r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zztd r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzK(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzte r0 = r14.zze
            com.google.android.gms.internal.ads.zzte r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcw.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzte.zzd
            com.google.android.gms.internal.ads.zzte r15 = com.google.android.gms.internal.ads.zzte.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcw r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zztd r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzte r8 = r14.zze
            com.google.android.gms.internal.ads.zztl r5 = r5.zza
            java.lang.Object r5 = r5.zza
            com.google.android.gms.internal.ads.zzcu r9 = r14.zzd
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzte r5 = r14.zze
            com.google.android.gms.internal.ads.zzcw r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcw r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcu r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzte r0 = r14.zze
            com.google.android.gms.internal.ads.zzte r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzte r15 = com.google.android.gms.internal.ads.zzte.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zztd r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzK(r4)
            com.google.android.gms.internal.ads.zztl r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzJ(r0)
            com.google.android.gms.internal.ads.zztl r1 = r15.zzc(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzte r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zztd r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztg.zzD(com.google.android.gms.internal.ads.zzcx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzE() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzA(null, ((zzvm) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zztn
    public final void zzF(zztj zztjVar) {
        ((zztd) zztjVar).zzt();
        if (zztjVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zztn
    /* renamed from: zzG */
    public final zztd zzH(zztl zztlVar, zzxm zzxmVar, long j) {
        zztd zztdVar = new zztd(zztlVar, zzxmVar, j);
        zztdVar.zzu(((zzvm) this).zza);
        if (this.zzh) {
            zztdVar.zzr(zztlVar.zzc(zzJ(zztlVar.zza)));
        } else {
            this.zzf = zztdVar;
            if (!this.zzg) {
                this.zzg = true;
                zzA(null, ((zzvm) this).zza);
            }
        }
        return zztdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zzsm
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zztn
    public final void zzy() {
    }
}

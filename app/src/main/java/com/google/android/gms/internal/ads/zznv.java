package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zznv {
    private final zzcu zza;
    private zzfrr zzb = zzfrr.zzl();
    private zzfru zzc = zzfru.zzd();
    @Nullable
    private zztl zzd;
    private zztl zze;
    private zztl zzf;

    public zznv(zzcu zzcuVar) {
        this.zza = zzcuVar;
    }

    @Nullable
    private static zztl zzj(zzcq zzcqVar, zzfrr zzfrrVar, @Nullable zztl zztlVar, zzcu zzcuVar) {
        zzcx zzn = zzcqVar.zzn();
        int zze = zzcqVar.zze();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zze);
        int zzc = (zzcqVar.zzx() || zzn.zzo()) ? -1 : zzn.zzd(zze, zzcuVar, false).zzc(zzfn.zzo(zzcqVar.zzk()));
        for (int i = 0; i < zzfrrVar.size(); i++) {
            zztl zztlVar2 = (zztl) zzfrrVar.get(i);
            if (zzm(zztlVar2, zzf, zzcqVar.zzx(), zzcqVar.zzb(), zzcqVar.zzc(), zzc)) {
                return zztlVar2;
            }
        }
        if (zzfrrVar.isEmpty() && zztlVar != null) {
            if (zzm(zztlVar, zzf, zzcqVar.zzx(), zzcqVar.zzb(), zzcqVar.zzc(), zzc)) {
                return zztlVar;
            }
        }
        return null;
    }

    private final void zzk(zzfrt zzfrtVar, @Nullable zztl zztlVar, zzcx zzcxVar) {
        if (zztlVar == null) {
            return;
        }
        if (zzcxVar.zza(zztlVar.zza) != -1) {
            zzfrtVar.zza(zztlVar, zzcxVar);
            return;
        }
        zzcx zzcxVar2 = (zzcx) this.zzc.get(zztlVar);
        if (zzcxVar2 != null) {
            zzfrtVar.zza(zztlVar, zzcxVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (com.google.android.gms.internal.ads.zzfou.zza(r3.zzd, r3.zzf) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.zzb.contains(r3.zzd) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        zzk(r0, r3.zzd, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(com.google.android.gms.internal.ads.zzcx r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzfrt r0 = new com.google.android.gms.internal.ads.zzfrt
            r0.<init>()
            com.google.android.gms.internal.ads.zzfrr r1 = r3.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.zztl r1 = r3.zze
            r3.zzk(r0, r1, r4)
            com.google.android.gms.internal.ads.zztl r1 = r3.zzf
            com.google.android.gms.internal.ads.zztl r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfou.zza(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zztl r1 = r3.zzf
            r3.zzk(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.zztl r1 = r3.zzd
            com.google.android.gms.internal.ads.zztl r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfou.zza(r1, r2)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.zztl r1 = r3.zzd
            com.google.android.gms.internal.ads.zztl r2 = r3.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfou.zza(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.google.android.gms.internal.ads.zzfrr r2 = r3.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.google.android.gms.internal.ads.zzfrr r2 = r3.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zztl r2 = (com.google.android.gms.internal.ads.zztl) r2
            r3.zzk(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.google.android.gms.internal.ads.zzfrr r1 = r3.zzb
            com.google.android.gms.internal.ads.zztl r2 = r3.zzd
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.google.android.gms.internal.ads.zztl r1 = r3.zzd
            r3.zzk(r0, r1, r4)
        L5c:
            com.google.android.gms.internal.ads.zzfru r4 = r0.zzc()
            r3.zzc = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zzl(com.google.android.gms.internal.ads.zzcx):void");
    }

    private static boolean zzm(zztl zztlVar, @Nullable Object obj, boolean z, int i, int i2, int i3) {
        if (zztlVar.zza.equals(obj)) {
            if (z) {
                if (zztlVar.zzb != i || zztlVar.zzc != i2) {
                    return false;
                }
            } else if (zztlVar.zzb != -1 || zztlVar.zze != i3) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Nullable
    public final zzcx zza(zztl zztlVar) {
        return (zzcx) this.zzc.get(zztlVar);
    }

    @Nullable
    public final zztl zzb() {
        return this.zzd;
    }

    @Nullable
    public final zztl zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfrr zzfrrVar = this.zzb;
        if (!(zzfrrVar instanceof List)) {
            Iterator<E> it = zzfrrVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (zzfrrVar.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            obj = zzfrrVar.get(zzfrrVar.size() - 1);
        }
        return (zztl) obj;
    }

    @Nullable
    public final zztl zzd() {
        return this.zze;
    }

    @Nullable
    public final zztl zze() {
        return this.zzf;
    }

    public final void zzg(zzcq zzcqVar) {
        this.zzd = zzj(zzcqVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @Nullable zztl zztlVar, zzcq zzcqVar) {
        this.zzb = zzfrr.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zztl) list.get(0);
            zztlVar.getClass();
            this.zzf = zztlVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcqVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcqVar.zzn());
    }

    public final void zzi(zzcq zzcqVar) {
        this.zzd = zzj(zzcqVar, this.zzb, this.zze, this.zza);
        zzl(zzcqVar.zzn());
    }
}

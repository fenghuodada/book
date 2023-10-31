package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzceo extends zzcbt implements zzgz, zzlv {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdz zzc;
    private final zzwv zzd;
    private final zzccb zze;
    private final WeakReference zzf;
    private final zzur zzg;
    @Nullable
    private zzil zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbs zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    @Nullable
    private Integer zzr;
    private final ArrayList zzs;
    @Nullable
    private volatile zzceb zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzbJ)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
        if (r5.zzj == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
        if (r5.zzm == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcef(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
        if (r5.zzi <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzceg(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzceh(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
        if (r5.zzj == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcei(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (r4.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcej(r5, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzceo(android.content.Context r4, com.google.android.gms.internal.ads.zzccb r5, com.google.android.gms.internal.ads.zzccc r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceo.<init>(android.content.Context, com.google.android.gms.internal.ads.zzccb, com.google.android.gms.internal.ads.zzccc, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcbt.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map zze = ((zzgu) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfof.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    @Nullable
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zztn zzudVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzudVar = zzaa(uriArr[0]);
            } else {
                zztn[] zztnVarArr = new zztn[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zztnVarArr[i] = zzaa(uriArr[i]);
                }
                zzudVar = new zzud(false, false, zztnVarArr);
            }
            this.zzh.zzB(zzudVar);
            this.zzh.zzp();
            zzcbt.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzH() {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcbt.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzL(zzcbs zzcbsVar) {
        this.zzk = zzcbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzP(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzwv zzwvVar = this.zzd;
            zzwh zzc = zzwvVar.zzc().zzc();
            zzc.zzo(i, !z);
            zzwvVar.zzj(zzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzR(int i) {
        for (WeakReference weakReference : this.zzu) {
            zzcdy zzcdyVar = (zzcdy) weakReference.get();
            if (zzcdyVar != null) {
                zzcdyVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzS(Surface surface, boolean z) {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzT(float f, boolean z) {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzfx zzW(String str, boolean z) {
        zzccb zzccbVar = this.zze;
        return new zzcer(str, true != z ? null : this, zzccbVar.zzd, zzccbVar.zzf, zzccbVar.zzn, zzccbVar.zzo);
    }

    public final /* synthetic */ zzfx zzX(String str, boolean z) {
        zzccb zzccbVar = this.zze;
        zzcdy zzcdyVar = new zzcdy(str, true != z ? null : this, zzccbVar.zzd, zzccbVar.zzf, zzccbVar.zzi);
        this.zzu.add(new WeakReference(zzcdyVar));
        return zzcdyVar;
    }

    public final /* synthetic */ zzfx zzY(String str, boolean z) {
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzf(str);
        zzgfVar.zze(true != z ? null : this);
        zzgfVar.zzc(this.zze.zzd);
        zzgfVar.zzd(this.zze.zzf);
        zzgfVar.zzb(true);
        return zzgfVar.zza();
    }

    public final /* synthetic */ zzfx zzZ(zzfw zzfwVar) {
        return new zzceb(this.zzb, zzfwVar.zza(), this.zzo, this.zzp, this, new zzcee(this));
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zza(zzfx zzfxVar, zzgc zzgcVar, boolean z, int i) {
        this.zzl += i;
    }

    @VisibleForTesting
    public final zztn zzaa(Uri uri) {
        zzat zzatVar = new zzat();
        zzatVar.zzb(uri);
        zzbq zzc = zzatVar.zzc();
        zzur zzurVar = this.zzg;
        zzurVar.zza(this.zze.zzg);
        return zzurVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z, long j) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            zzcbsVar.zzi(z, j);
        }
    }

    public final /* synthetic */ zzle[] zzac(Handler handler, zzzj zzzjVar, zzot zzotVar, zzvn zzvnVar, zzsl zzslVar) {
        Context context = this.zzb;
        zzrv zzrvVar = zzrv.zzb;
        zzoh zzohVar = zzoh.zza;
        zzdr[] zzdrVarArr = new zzdr[0];
        zzpk zzpkVar = new zzpk();
        if (zzohVar == null && zzohVar == null) {
            throw new NullPointerException("Both parameters are null");
        }
        zzpkVar.zzb(zzohVar);
        zzpkVar.zzc(zzdrVarArr);
        zzpw zzd = zzpkVar.zzd();
        zzrl zzrlVar = zzrl.zza;
        return new zzle[]{new zzqc(context, zzrlVar, zzrvVar, false, handler, zzotVar, zzd), new zzym(this.zzb, zzrlVar, zzrvVar, 0L, false, handler, zzzjVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzb(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzc(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzd(zzfx zzfxVar, zzgc zzgcVar, boolean z) {
        if (zzfxVar instanceof zzgu) {
            synchronized (this.zzq) {
                this.zzs.add((zzgu) zzfxVar);
            }
        } else if (zzfxVar instanceof zzceb) {
            this.zzt = (zzceb) zzfxVar;
            final zzccc zzcccVar = (zzccc) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue() && zzcccVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzccc zzcccVar2 = zzccc.this;
                        Map map = hashMap;
                        int i = zzceo.zza;
                        zzcccVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zze(zzlt zzltVar, zzam zzamVar, @Nullable zzht zzhtVar) {
        zzccc zzcccVar = (zzccc) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue() || zzcccVar == null || zzamVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcccVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzf(zzlt zzltVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzg(zzlt zzltVar, zzth zzthVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzh(zzlt zzltVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzi(zzcq zzcqVar, zzlu zzluVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzj(zzlt zzltVar, zztc zztcVar, zzth zzthVar, IOException iOException, boolean z) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            if (this.zze.zzk) {
                zzcbsVar.zzl("onLoadException", iOException);
            } else {
                zzcbsVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzk(zzlt zzltVar, int i) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            zzcbsVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzl(zzlt zzltVar, zzcg zzcgVar) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            zzcbsVar.zzk("onPlayerError", zzcgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzm(zzlt zzltVar, zzcp zzcpVar, zzcp zzcpVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzn(zzlt zzltVar, Object obj, long j) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            zzcbsVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzo(zzlt zzltVar, zzhs zzhsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzp(zzlt zzltVar, zzam zzamVar, @Nullable zzht zzhtVar) {
        zzccc zzcccVar = (zzccc) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue() || zzcccVar == null || zzamVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
        int i = zzamVar.zzr;
        int i2 = zzamVar.zzs;
        hashMap.put("resolution", i + "x" + i2);
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcccVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzq(zzlt zzltVar, zzdn zzdnVar) {
        zzcbs zzcbsVar = this.zzk;
        if (zzcbsVar != null) {
            zzcbsVar.zzD(zzdnVar.zzc, zzdnVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final long zzz() {
        return this.zzh.zzl();
    }
}

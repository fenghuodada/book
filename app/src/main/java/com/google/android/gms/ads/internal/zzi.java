package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzfkp;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzi implements Runnable, zzaqm {
    @VisibleForTesting
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfit zzi;
    private Context zzj;
    private final Context zzk;
    private zzbzz zzl;
    private final zzbzz zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzbzz zzbzzVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzbzzVar;
        this.zzm = zzbzzVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbbk.zzcb)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfit.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbbk.zzbX)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbbk.zzcc)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzca)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzdd)).booleanValue()) {
            this.zza = zzc();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzcW)).booleanValue()) {
            zzay.zzb();
            if (!zzbzm.zzu()) {
                run();
                return;
            }
        }
        zzcag.zza.execute(this);
    }

    @Nullable
    private final zzaqm zzj() {
        return (zzaqm) (zzi() == 2 ? this.zze : this.zzd).get();
    }

    private final void zzm() {
        zzaqm zzj = zzj();
        if (this.zzc.isEmpty() || zzj == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzj.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzp(boolean z) {
        this.zzd.set(zzaqp.zzu(this.zzl.zza, zzq(this.zzj), z, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzbzz, android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzdd)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbbk.zzaT)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzp(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzaqj zza = zzaqj.zza(this.zzl.zza, zzq(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzp(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzp(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzaqj.zza(this.zzm.zza, zzq(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public final boolean zzc() {
        Context context = this.zzj;
        zzfit zzfitVar = this.zzi;
        zzh zzhVar = new zzh(this);
        return new zzfkp(this.zzj, zzfjv.zzb(context, zzfitVar), zzhVar, ((Boolean) zzba.zzc().zzb(zzbbk.zzbY)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            zzbzt.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzaqm zzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjk)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
            }
            if (zzj != null) {
                zzm();
                return zzj.zzf(zzq(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzg(Context context) {
        zzaqm zzj;
        if (!zzd() || (zzj = zzj()) == null) {
            return "";
        }
        zzm();
        return zzj.zzg(zzq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjj)).booleanValue()) {
            zzaqm zzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjk)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return zzj != null ? zzj.zzh(context, view, activity) : "";
        } else if (zzd()) {
            zzaqm zzj2 = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjk)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return zzj2 != null ? zzj2.zzh(context, view, activity) : "";
        } else {
            return "";
        }
    }

    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzk(MotionEvent motionEvent) {
        zzaqm zzj = zzj();
        if (zzj == null) {
            this.zzc.add(new Object[]{motionEvent});
            return;
        }
        zzm();
        zzj.zzk(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzl(int i, int i2, int i3) {
        zzaqm zzj = zzj();
        if (zzj == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzm();
        zzj.zzl(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqm zzj;
        if (!zzd() || (zzj = zzj()) == null) {
            return;
        }
        zzj.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzo(View view) {
        zzaqm zzj = zzj();
        if (zzj != null) {
            zzj.zzo(view);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzfuq extends zzfuw {
    private static final Logger zza = Logger.getLogger(zzfuq.class.getName());
    @CheckForNull
    private zzfrm zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfuq(zzfrm zzfrmVar, boolean z, boolean z2) {
        super(zzfrmVar.size());
        this.zzb = zzfrmVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzH(int i, Future future) {
        try {
            zzg(i, zzfvr.zzo(future));
        } catch (Error e) {
            e = e;
            zzJ(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzJ(e);
        } catch (ExecutionException e3) {
            zzJ(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzI */
    public final void zzy(@CheckForNull zzfrm zzfrmVar) {
        int zzB = zzB();
        int i = 0;
        zzfoz.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfrmVar != null) {
                zzftr it = zzfrmVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzH(i, future);
                    }
                    i++;
                }
            }
            zzG();
            zzv();
            zzz(2);
        }
    }

    private final void zzJ(Throwable th) {
        th.getClass();
        if (this.zzc && !zze(th) && zzL(zzD(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    @CheckForNull
    public final String zza() {
        zzfrm zzfrmVar = this.zzb;
        return zzfrmVar != null ? "futures=".concat(zzfrmVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        zzfrm zzfrmVar = this.zzb;
        zzz(1);
        if ((zzfrmVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzftr it = zzfrmVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzm = zzm();
        zzm.getClass();
        zzL(set, zzm);
    }

    public abstract void zzg(int i, Object obj);

    public abstract void zzv();

    public final void zzw() {
        zzfrm zzfrmVar = this.zzb;
        zzfrmVar.getClass();
        if (zzfrmVar.isEmpty()) {
            zzv();
        } else if (!this.zzc) {
            final zzfrm zzfrmVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfup
                @Override // java.lang.Runnable
                public final void run() {
                    zzfuq.this.zzy(zzfrmVar2);
                }
            };
            zzftr it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzfwb) it.next()).zzc(runnable, zzfvf.INSTANCE);
            }
        } else {
            zzftr it2 = this.zzb.iterator();
            final int i = 0;
            while (it2.hasNext()) {
                final zzfwb zzfwbVar = (zzfwb) it2.next();
                zzfwbVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfuq.this.zzx(zzfwbVar, i);
                    }
                }, zzfvf.INSTANCE);
                i++;
            }
        }
    }

    public final /* synthetic */ void zzx(zzfwb zzfwbVar, int i) {
        try {
            if (zzfwbVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzH(i, zzfwbVar);
            }
        } finally {
            zzy(null);
        }
    }

    public void zzz(int i) {
        this.zzb = null;
    }
}

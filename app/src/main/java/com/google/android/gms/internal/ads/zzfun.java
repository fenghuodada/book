package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzfun extends zzfvh implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    zzfwb zza;
    @CheckForNull
    Object zzb;

    public zzfun(zzfwb zzfwbVar, Object obj) {
        zzfwbVar.getClass();
        this.zza = zzfwbVar;
        obj.getClass();
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwb zzfwbVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfwbVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfwbVar.isCancelled()) {
            zzt(zzfwbVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfvr.zzo(zzfwbVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zzfwj.zza(th);
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    @CheckForNull
    public final String zza() {
        String str;
        zzfwb zzfwbVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfwbVar != null) {
            str = C0663f.m12005a("inputFuture=[", zzfwbVar.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            String obj2 = obj.toString();
            return str + "function=[" + obj2 + "]";
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    public abstract void zzg(Object obj);
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zztu {
    public final int zza;
    @Nullable
    public final zztl zzb;
    private final CopyOnWriteArrayList zzc;

    public zztu() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zztu(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zztl zztlVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztlVar;
    }

    @CheckResult
    public final zztu zza(int i, @Nullable zztl zztlVar) {
        return new zztu(this.zzc, 0, zztlVar);
    }

    public final void zzb(Handler handler, zztv zztvVar) {
        this.zzc.add(new zztt(handler, zztvVar));
    }

    public final void zzc(final zzth zzthVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            final zztv zztvVar = zzttVar.zzb;
            zzfn.zzE(zzttVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzto
                @Override // java.lang.Runnable
                public final void run() {
                    zztu zztuVar = zztu.this;
                    zztvVar.zzaf(0, zztuVar.zzb, zzthVar);
                }
            });
        }
    }

    public final void zzd(final zztc zztcVar, final zzth zzthVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            final zztv zztvVar = zzttVar.zzb;
            zzfn.zzE(zzttVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztp
                @Override // java.lang.Runnable
                public final void run() {
                    zztu zztuVar = zztu.this;
                    zztvVar.zzag(0, zztuVar.zzb, zztcVar, zzthVar);
                }
            });
        }
    }

    public final void zze(final zztc zztcVar, final zzth zzthVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            final zztv zztvVar = zzttVar.zzb;
            zzfn.zzE(zzttVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzts
                @Override // java.lang.Runnable
                public final void run() {
                    zztu zztuVar = zztu.this;
                    zztvVar.zzah(0, zztuVar.zzb, zztcVar, zzthVar);
                }
            });
        }
    }

    public final void zzf(final zztc zztcVar, final zzth zzthVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            final zztv zztvVar = zzttVar.zzb;
            zzfn.zzE(zzttVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztq
                @Override // java.lang.Runnable
                public final void run() {
                    zztu zztuVar = zztu.this;
                    zztvVar.zzai(0, zztuVar.zzb, zztcVar, zzthVar, iOException, z);
                }
            });
        }
    }

    public final void zzg(final zztc zztcVar, final zzth zzthVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            final zztv zztvVar = zzttVar.zzb;
            zzfn.zzE(zzttVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
                @Override // java.lang.Runnable
                public final void run() {
                    zztu zztuVar = zztu.this;
                    zztvVar.zzaj(0, zztuVar.zzb, zztcVar, zzthVar);
                }
            });
        }
    }

    public final void zzh(zztv zztvVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zztt zzttVar = (zztt) it.next();
            if (zzttVar.zzb == zztvVar) {
                this.zzc.remove(zzttVar);
            }
        }
    }
}

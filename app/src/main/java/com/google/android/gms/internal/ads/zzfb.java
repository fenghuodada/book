package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzfb {
    @Nullable
    private static zzfb zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    @GuardedBy("networkTypeLock")
    private int zze = 0;

    private zzfb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzfa(this, null), intentFilter);
    }

    public static synchronized zzfb zzb(Context context) {
        zzfb zzfbVar;
        synchronized (zzfb.class) {
            if (zza == null) {
                zza = new zzfb(context);
            }
            zzfbVar = zza;
        }
        return zzfbVar;
    }

    public static /* synthetic */ void zzc(zzfb zzfbVar, int i) {
        synchronized (zzfbVar.zzd) {
            if (zzfbVar.zze == i) {
                return;
            }
            zzfbVar.zze = i;
            Iterator it = zzfbVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzxn zzxnVar = (zzxn) weakReference.get();
                if (zzxnVar != null) {
                    zzxnVar.zza.zzk(i);
                } else {
                    zzfbVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzxn zzxnVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzxnVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zzfb zzfbVar = zzfb.this;
                zzxn zzxnVar2 = zzxnVar;
                zzxnVar2.zza.zzk(zzfbVar.zza());
            }
        });
    }
}

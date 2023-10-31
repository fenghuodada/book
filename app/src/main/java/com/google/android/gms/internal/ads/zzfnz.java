package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzfnz {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfno zzc;
    private boolean zzh;
    private final Intent zzi;
    @Nullable
    private ServiceConnection zzm;
    @Nullable
    private IInterface zzn;
    private final zzfmw zzo;
    private final List zze = new ArrayList();
    @GuardedBy("attachedRemoteTasksLock")
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfnr
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfnz.zzj(zzfnz.this);
        }
    };
    @GuardedBy("attachedRemoteTasksLock")
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfnz(Context context, zzfno zzfnoVar, String str, Intent intent, zzfmw zzfmwVar, @Nullable zzfnu zzfnuVar) {
        this.zzb = context;
        this.zzc = zzfnoVar;
        this.zzi = intent;
        this.zzo = zzfmwVar;
    }

    public static /* synthetic */ void zzj(zzfnz zzfnzVar) {
        zzfnzVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfnu zzfnuVar = (zzfnu) zzfnzVar.zzj.get();
        if (zzfnuVar != null) {
            zzfnzVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfnuVar.zza();
        } else {
            zzfnzVar.zzc.zzc("%s : Binder has died.", zzfnzVar.zzd);
            for (zzfnp zzfnpVar : zzfnzVar.zze) {
                zzfnpVar.zzc(zzfnzVar.zzv());
            }
            zzfnzVar.zze.clear();
        }
        synchronized (zzfnzVar.zzg) {
            zzfnzVar.zzw();
        }
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfnz zzfnzVar, final TaskCompletionSource taskCompletionSource) {
        zzfnzVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfnq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfnz.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzp(zzfnz zzfnzVar, zzfnp zzfnpVar) {
        if (zzfnzVar.zzn != null || zzfnzVar.zzh) {
            if (!zzfnzVar.zzh) {
                zzfnpVar.run();
                return;
            }
            zzfnzVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfnzVar.zze.add(zzfnpVar);
            return;
        }
        zzfnzVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        zzfnzVar.zze.add(zzfnpVar);
        zzfny zzfnyVar = new zzfny(zzfnzVar, null);
        zzfnzVar.zzm = zzfnyVar;
        zzfnzVar.zzh = true;
        if (zzfnzVar.zzb.bindService(zzfnzVar.zzi, zzfnyVar, 1)) {
            return;
        }
        zzfnzVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfnzVar.zzh = false;
        for (zzfnp zzfnpVar2 : zzfnzVar.zze) {
            zzfnpVar2.zzc(new zzfoa());
        }
        zzfnzVar.zze.clear();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzfnz zzfnzVar) {
        zzfnzVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfnzVar.zzn.asBinder().linkToDeath(zzfnzVar.zzk, 0);
        } catch (RemoteException e) {
            zzfnzVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzfnz zzfnzVar) {
        zzfnzVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfnzVar.zzn.asBinder().unlinkToDeath(zzfnzVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    @GuardedBy("attachedRemoteTasksLock")
    public final void zzw() {
        for (TaskCompletionSource taskCompletionSource : this.zzf) {
            taskCompletionSource.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    @Nullable
    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfnp zzfnpVar, @Nullable TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfns(this, zzfnpVar.zzb(), taskCompletionSource, zzfnpVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfnt(this));
    }
}

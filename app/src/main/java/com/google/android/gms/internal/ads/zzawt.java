package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzawt {
    @Nullable
    private zzawi zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzawt(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzawt zzawtVar) {
        synchronized (zzawtVar.zzd) {
            zzawi zzawiVar = zzawtVar.zza;
            if (zzawiVar == null) {
                return;
            }
            zzawiVar.disconnect();
            zzawtVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzawj zzawjVar) {
        zzawn zzawnVar = new zzawn(this);
        zzawr zzawrVar = new zzawr(this, zzawjVar, zzawnVar);
        zzaws zzawsVar = new zzaws(this, zzawnVar);
        synchronized (this.zzd) {
            zzawi zzawiVar = new zzawi(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzawrVar, zzawsVar);
            this.zza = zzawiVar;
            zzawiVar.checkAvailabilityAndConnect();
        }
        return zzawnVar;
    }
}

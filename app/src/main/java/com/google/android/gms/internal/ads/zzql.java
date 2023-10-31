package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzql {
    public final int zza;
    @Nullable
    public final zztl zzb;
    private final CopyOnWriteArrayList zzc;

    public zzql() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzql(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zztl zztlVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztlVar;
    }

    @CheckResult
    public final zzql zza(int i, @Nullable zztl zztlVar) {
        return new zzql(this.zzc, 0, zztlVar);
    }

    public final void zzb(Handler handler, zzqm zzqmVar) {
        this.zzc.add(new zzqk(handler, zzqmVar));
    }

    public final void zzc(zzqm zzqmVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqk zzqkVar = (zzqk) it.next();
            if (zzqkVar.zzb == zzqmVar) {
                this.zzc.remove(zzqkVar);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcdg implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    @Nullable
    public final zzcdf zza(zzccc zzcccVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdf zzcdfVar = (zzcdf) it.next();
            if (zzcdfVar.zza == zzcccVar) {
                return zzcdfVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdf zzcdfVar) {
        this.zza.add(zzcdfVar);
    }

    public final void zzc(zzcdf zzcdfVar) {
        this.zza.remove(zzcdfVar);
    }

    public final boolean zzd(zzccc zzcccVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdf zzcdfVar = (zzcdf) it.next();
            if (zzcdfVar.zza == zzcccVar) {
                arrayList.add(zzcdfVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcdf) it2.next()).zzb.zzf();
        }
        return true;
    }
}

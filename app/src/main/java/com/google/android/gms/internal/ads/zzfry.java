package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfry extends zzfps {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfpa zzb;

    public zzfry(Iterator it, zzfpa zzfpaVar) {
        this.zza = it;
        this.zzb = zzfpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}

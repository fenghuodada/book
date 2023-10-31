package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzftk extends zzfqp implements Set {
    public zzftk(Set set, zzfpa zzfpaVar) {
        super(set, zzfpaVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zzftn.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzftn.zza(this);
    }
}

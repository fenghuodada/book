package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfpj implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfpm zzb;

    public zzfpj(zzfpm zzfpmVar, CharSequence charSequence) {
        this.zzb = zzfpmVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfoo.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}

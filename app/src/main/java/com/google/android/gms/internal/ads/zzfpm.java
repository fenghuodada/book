package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfpm {
    private final zzfok zza;
    private final zzfpl zzb;

    private zzfpm(zzfpl zzfplVar) {
        zzfoj zzfojVar = zzfoj.zza;
        this.zzb = zzfplVar;
        this.zza = zzfojVar;
    }

    public static zzfpm zzb(int i) {
        return new zzfpm(new zzfpi(4000));
    }

    public static zzfpm zzc(zzfok zzfokVar) {
        return new zzfpm(new zzfpg(zzfokVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfpj(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

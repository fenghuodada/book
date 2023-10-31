package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfuz extends zzfvb {
    public zzfuz(zzfrm zzfrmVar, boolean z) {
        super(zzfrmVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final /* bridge */ /* synthetic */ Object zzH(List list) {
        ArrayList zza = zzfsf.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfva zzfvaVar = (zzfva) it.next();
            zza.add(zzfvaVar != null ? zzfvaVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}

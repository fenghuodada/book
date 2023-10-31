package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
abstract class zzfvb extends zzfuq {
    @CheckForNull
    private List zza;

    public zzfvb(zzfrm zzfrmVar, boolean z) {
        super(zzfrmVar, true, true);
        List emptyList = zzfrmVar.isEmpty() ? Collections.emptyList() : zzfsf.zza(zzfrmVar.size());
        for (int i = 0; i < zzfrmVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    public abstract Object zzH(List list);

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfva(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}

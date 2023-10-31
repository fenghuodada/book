package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgrc extends zzgrm {
    public zzgrc(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                Map.Entry zzg = zzg(i);
                if (((zzgom) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzgom) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}

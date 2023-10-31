package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.C0063d;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder m13052b = C0063d.m13052b("Invalid long value for ", this.zzb, ": ");
            m13052b.append((String) obj);
            Log.e("PhenotypeFlag", m13052b.toString());
            return null;
        }
    }
}

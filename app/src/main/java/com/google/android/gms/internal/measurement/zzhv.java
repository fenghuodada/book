package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.activity.result.C0063d;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzha.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder m13052b = C0063d.m13052b("Invalid boolean value for ", this.zzb, ": ");
        m13052b.append((String) obj);
        Log.e("PhenotypeFlag", m13052b.toString());
        return null;
    }
}

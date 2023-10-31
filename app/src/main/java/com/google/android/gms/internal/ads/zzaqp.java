package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaqp extends zzaqo {
    public zzaqp(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaqp zzt(String str, Context context, boolean z) {
        zzaqo.zzr(context, false);
        return new zzaqp(context, str, false);
    }

    @Deprecated
    public static zzaqp zzu(String str, Context context, boolean z, int i) {
        zzaqo.zzr(context, z);
        return new zzaqp(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final List zzp(zzarr zzarrVar, Context context, zzano zzanoVar, zzanh zzanhVar) {
        if (zzarrVar.zzk() == null || !((zzaqo) this).zzu) {
            return super.zzp(zzarrVar, context, zzanoVar, null);
        }
        int zza = zzarrVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzarrVar, context, zzanoVar, null));
        arrayList.add(new zzasj(zzarrVar, "IWc1kTmZyjEaYg+Bhy1Ic+NBj3x1Dc7qjnIeXSV6/dJrA8kzK2iK01R5H/P8KgRH", "tqyxGM79wOlAPNBhvtAr5QJDQ+dGmpZ4a1UkwVDI/lw=", zzanoVar, zza, 24));
        return arrayList;
    }
}

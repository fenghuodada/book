package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfhn implements zzfhl {
    private final zzfhl zza;

    public zzfhn(zzfhl zzfhlVar) {
        this.zza = zzfhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhl
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfhl
    public final void zzb(View view, JSONObject jSONObject, zzfhk zzfhkVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfhd zza = zzfhd.zza();
        if (zza != null) {
            Collection<zzfgs> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfgs zzfgsVar : zzb) {
                View zzf = zzfgsVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzfhw.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzfhw.zza((View) arrayList.get(i)) <= zza2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfhkVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}

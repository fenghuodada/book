package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzami extends zzalw {
    @VisibleForTesting
    public static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzala((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}

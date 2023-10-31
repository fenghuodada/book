package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzavc {
    private final int zza;
    private final zzauz zzb = new zzave();

    public zzavc(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzavb zzavbVar = new zzavb();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzava(this));
        for (String str : split) {
            String[] zzb = zzavd.zzb(str, false);
            if (zzb.length != 0) {
                zzavh.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzavbVar.zzb.write(this.zzb.zzb(((zzavg) it.next()).zzb));
            } catch (IOException e) {
                zzbzt.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzavbVar.toString();
    }
}

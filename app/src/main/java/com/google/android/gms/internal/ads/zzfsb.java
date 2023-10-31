package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfsb {
    @CheckForNull
    public static Object zza(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void zzb(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}

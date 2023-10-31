package com.google.android.gms.internal.ads;

import java.util.Collection;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfqq {
    public static boolean zza(Collection collection, @CheckForNull Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

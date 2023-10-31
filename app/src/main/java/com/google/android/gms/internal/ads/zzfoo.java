package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfoo {
    public static final CharSequence zza(@CheckForNull Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder zzb(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                CharSequence zza = zza(it.next());
                while (true) {
                    sb.append(zza);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) str);
                    zza = zza(it.next());
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

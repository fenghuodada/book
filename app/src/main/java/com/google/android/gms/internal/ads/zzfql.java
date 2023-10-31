package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
abstract class zzfql implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzfou.zza(getKey(), entry.getKey()) && zzfou.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return C0485b.m12391a(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}

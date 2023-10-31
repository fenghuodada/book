package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@NullMarked
/* loaded from: classes.dex */
abstract class zzj implements Iterator, p060j$.util.Iterator {
    @CheckForNull
    private Object zza;
    private int zzb = 2;

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 2) {
                        this.zzb = 4;
                        this.zza = zza();
                        if (this.zzb != 3) {
                            this.zzb = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    public abstract Object zza();

    @CanIgnoreReturnValue
    @CheckForNull
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}

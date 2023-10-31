package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0510h;
import androidx.fragment.app.C1431t;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(@NonNull DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator, p060j$.util.Iterator
    @NonNull
    public final T next() {
        if (hasNext()) {
            int i = this.zab + 1;
            this.zab = i;
            if (i == 0) {
                T t = (T) Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t.getClass());
                    throw new IllegalStateException(C1431t.m10577a(new StringBuilder(valueOf.length() + 44), "DataBuffer reference of type ", valueOf, " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException(C0510h.m12340a(46, "Cannot advance the iterator beyond ", this.zab));
    }
}

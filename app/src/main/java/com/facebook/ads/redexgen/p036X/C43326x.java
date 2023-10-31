package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6x */
/* loaded from: assets/audience_network.dex */
public final class C43326x {
    public final Map<Integer, C42906H<AbstractC43457A>> A00;
    @Nullable
    public static C43326x A02 = null;
    public static long A01 = 0;

    public C43326x(Map<Integer, C42906H<AbstractC43457A>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        long j;
        synchronized (C43326x.class) {
            j = A01;
        }
        return j;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C43326x A01() {
        if (A02 == null) {
            A02 = new C43326x(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(C42906H<AbstractC43457A> c42906h, int i) {
        int i2 = 0;
        boolean z = false;
        if (c42906h.A00() == 0) {
            z = true;
            i2 = c42906h.A01().A05();
        }
        int updatedSize = i - i2;
        A01 += (z ? 0 : 4) + updatedSize;
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, C42906H<AbstractC43457A>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i, C42906H<AbstractC43457A> c42906h, int i2) {
        this.A00.put(Integer.valueOf(i), c42906h);
        A02(c42906h, i2);
    }
}

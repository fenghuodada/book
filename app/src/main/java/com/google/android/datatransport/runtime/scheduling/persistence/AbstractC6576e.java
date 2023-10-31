package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.activity.result.C0063d;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
/* loaded from: classes.dex */
public abstract class AbstractC6576e {

    /* renamed from: a */
    public static final C6566a f10409a;

    static {
        String str;
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l2 = 604800000L;
        Integer num3 = 81920;
        if (l == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (num2 == null) {
            str = C0063d.m13053a(str, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            str = C0063d.m13053a(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = C0063d.m13053a(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f10409a = new C6566a(l.longValue(), num.intValue(), num2.intValue(), l2.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public abstract int mo6239a();

    /* renamed from: b */
    public abstract long mo6238b();

    /* renamed from: c */
    public abstract int mo6237c();

    /* renamed from: d */
    public abstract int mo6236d();

    /* renamed from: e */
    public abstract long mo6235e();
}

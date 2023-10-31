package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
/* loaded from: classes.dex */
public abstract class AbstractC6544f {

    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6545a {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC6546a {
        }

        /* renamed from: a */
        public abstract long mo6263a();

        /* renamed from: b */
        public abstract Set<EnumC6547b> mo6262b();

        /* renamed from: c */
        public abstract long mo6261c();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f$b */
    /* loaded from: classes.dex */
    public enum EnumC6547b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public abstract InterfaceC6611a mo6266a();

    /* renamed from: b */
    public final long m6265b(EnumC6464d enumC6464d, long j, int i) {
        long j2;
        long mo6226a = j - mo6266a().mo6226a();
        AbstractC6545a abstractC6545a = mo6264c().get(enumC6464d);
        long mo6263a = abstractC6545a.mo6263a();
        int i2 = i - 1;
        if (mo6263a > 1) {
            j2 = mo6263a;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * mo6263a * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), mo6226a), abstractC6545a.mo6261c());
    }

    /* renamed from: c */
    public abstract Map<EnumC6464d, AbstractC6545a> mo6264c();
}

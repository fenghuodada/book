package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes.dex */
public final class C6539b extends AbstractC6544f {

    /* renamed from: a */
    public final InterfaceC6611a f10316a;

    /* renamed from: b */
    public final Map<EnumC6464d, AbstractC6544f.AbstractC6545a> f10317b;

    public C6539b(InterfaceC6611a interfaceC6611a, Map<EnumC6464d, AbstractC6544f.AbstractC6545a> map) {
        if (interfaceC6611a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f10316a = interfaceC6611a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f10317b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f
    /* renamed from: a */
    public final InterfaceC6611a mo6266a() {
        return this.f10316a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f
    /* renamed from: c */
    public final Map<EnumC6464d, AbstractC6544f.AbstractC6545a> mo6264c() {
        return this.f10317b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6544f) {
            AbstractC6544f abstractC6544f = (AbstractC6544f) obj;
            return this.f10316a.equals(abstractC6544f.mo6266a()) && this.f10317b.equals(abstractC6544f.mo6264c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10316a.hashCode() ^ 1000003) * 1000003) ^ this.f10317b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f10316a + ", values=" + this.f10317b + "}";
    }
}

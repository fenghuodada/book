package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6539b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6540c;
import com.google.android.datatransport.runtime.time.C6613c;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.g */
/* loaded from: classes.dex */
public final class C6535g implements InterfaceC6499b<AbstractC6544f> {

    /* renamed from: a */
    public final InterfaceC10733a<InterfaceC6611a> f10309a = C6613c.C6614a.f10452a;

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        InterfaceC6611a interfaceC6611a = this.f10309a.get();
        HashMap hashMap = new HashMap();
        EnumC6464d enumC6464d = EnumC6464d.DEFAULT;
        C6540c.C6541a c6541a = new C6540c.C6541a();
        Set<AbstractC6544f.EnumC6547b> emptySet = Collections.emptySet();
        if (emptySet != null) {
            c6541a.f10323c = emptySet;
            c6541a.f10321a = 30000L;
            c6541a.f10322b = 86400000L;
            hashMap.put(enumC6464d, c6541a.m6267a());
            EnumC6464d enumC6464d2 = EnumC6464d.HIGHEST;
            C6540c.C6541a c6541a2 = new C6540c.C6541a();
            Set<AbstractC6544f.EnumC6547b> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                c6541a2.f10323c = emptySet2;
                c6541a2.f10321a = 1000L;
                c6541a2.f10322b = 86400000L;
                hashMap.put(enumC6464d2, c6541a2.m6267a());
                EnumC6464d enumC6464d3 = EnumC6464d.VERY_LOW;
                C6540c.C6541a c6541a3 = new C6540c.C6541a();
                Set<AbstractC6544f.EnumC6547b> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    c6541a3.f10323c = emptySet3;
                    c6541a3.f10321a = 86400000L;
                    c6541a3.f10322b = 86400000L;
                    Set<AbstractC6544f.EnumC6547b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC6544f.EnumC6547b.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        c6541a3.f10323c = unmodifiableSet;
                        hashMap.put(enumC6464d3, c6541a3.m6267a());
                        if (interfaceC6611a != null) {
                            if (hashMap.keySet().size() >= EnumC6464d.values().length) {
                                new HashMap();
                                return new C6539b(interfaceC6611a, hashMap);
                            }
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                        throw new NullPointerException("missing required property: clock");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }
}

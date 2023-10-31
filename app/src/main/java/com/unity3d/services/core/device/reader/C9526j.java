package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.reader.pii.C9535b;
import com.unity3d.services.core.device.reader.pii.C9536c;
import com.unity3d.services.core.device.reader.pii.C9539d;
import com.unity3d.services.core.device.reader.pii.EnumC9534a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.j */
/* loaded from: classes3.dex */
public class C9526j implements InterfaceC9533p {

    /* renamed from: a */
    private InterfaceC9533p f18857a;

    /* renamed from: b */
    private C9535b f18858b;

    /* renamed from: c */
    private C9536c f18859c;

    /* renamed from: com.unity3d.services.core.device.reader.j$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9527a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18860a;

        static {
            int[] iArr = new int[EnumC9534a.values().length];
            f18860a = iArr;
            try {
                iArr[EnumC9534a.INCLUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18860a[EnumC9534a.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18860a[EnumC9534a.EXCLUDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C9526j(InterfaceC9533p interfaceC9533p, C9536c c9536c, C9535b c9535b) {
        this.f18857a = interfaceC9533p;
        this.f18859c = c9536c;
        this.f18858b = c9535b;
    }

    /* renamed from: a */
    private Map<String, Object> m2060a(C9539d c9539d) {
        HashMap hashMap = new HashMap();
        String m2055a = this.f18858b.m2055a();
        if (m2055a != null) {
            hashMap.put("unifiedconfig.pii.advertisingTrackingId", m2055a);
        }
        if (c9539d.m2044c() != null) {
            hashMap.put("user.nonBehavioral", c9539d.m2044c());
        }
        return hashMap;
    }

    /* renamed from: b */
    private Map<String, Object> m2059b(C9539d c9539d) {
        return c9539d.m2047a();
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> m2059b;
        Map<String, Object> mo2037a = this.f18857a.mo2037a();
        C9539d m2048f = this.f18859c.m2048f();
        int i = C9527a.f18860a[m2048f.m2045b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                m2059b = m2060a(m2048f);
            }
            return mo2037a;
        }
        m2059b = m2059b(m2048f);
        mo2037a.putAll(m2059b);
        return mo2037a;
    }
}

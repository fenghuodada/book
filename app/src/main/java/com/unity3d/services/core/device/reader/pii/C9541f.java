package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.misc.InterfaceC9557c;

/* renamed from: com.unity3d.services.core.device.reader.pii.f */
/* loaded from: classes3.dex */
public class C9541f {

    /* renamed from: a */
    private final InterfaceC9557c f18887a;

    public C9541f(InterfaceC9557c interfaceC9557c) {
        this.f18887a = interfaceC9557c;
    }

    /* renamed from: a */
    private EnumC9540e m2041a(String str) {
        String str2;
        InterfaceC9557c interfaceC9557c = this.f18887a;
        if (interfaceC9557c != null) {
            Object obj = interfaceC9557c.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
                return EnumC9540e.m2043a(str2);
            }
        }
        str2 = null;
        return EnumC9540e.m2043a(str2);
    }

    /* renamed from: b */
    private EnumC9540e m2040b() {
        return m2041a("privacy.spm.value");
    }

    /* renamed from: d */
    private EnumC9540e m2038d() {
        return m2041a("privacy.mode.value");
    }

    /* renamed from: a */
    public EnumC9540e m2042a() {
        EnumC9540e m2038d = m2038d();
        EnumC9540e enumC9540e = EnumC9540e.NULL;
        if (m2038d == enumC9540e && m2040b() == enumC9540e) {
            return enumC9540e;
        }
        EnumC9540e m2038d2 = m2038d();
        EnumC9540e enumC9540e2 = EnumC9540e.APP;
        if (m2038d2 != enumC9540e2 && m2040b() != enumC9540e2) {
            EnumC9540e m2038d3 = m2038d();
            enumC9540e2 = EnumC9540e.MIXED;
            if (m2038d3 != enumC9540e2 && m2040b() != enumC9540e2) {
                EnumC9540e m2038d4 = m2038d();
                enumC9540e2 = EnumC9540e.NONE;
                if (m2038d4 != enumC9540e2 && m2040b() != enumC9540e2) {
                    return EnumC9540e.UNDEFINED;
                }
            }
        }
        return enumC9540e2;
    }

    /* renamed from: c */
    public boolean m2039c() {
        InterfaceC9557c interfaceC9557c = this.f18887a;
        if (interfaceC9557c != null) {
            Object obj = interfaceC9557c.get("user.nonbehavioral.value");
            if (obj == null) {
                obj = this.f18887a.get("user.nonBehavioral.value");
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }
}

package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.InterfaceC9557c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.pii.c */
/* loaded from: classes3.dex */
public class C9536c {

    /* renamed from: a */
    private final C9541f f18874a;

    /* renamed from: b */
    private final InterfaceC9557c f18875b;

    /* renamed from: c */
    private final Experiments f18876c;

    /* renamed from: com.unity3d.services.core.device.reader.pii.c$a */
    /* loaded from: classes3.dex */
    public class C9537a extends HashMap<String, Object> {
        public C9537a() {
            put("user.nonBehavioral", Boolean.valueOf(C9536c.this.f18874a.m2039c()));
        }
    }

    /* renamed from: com.unity3d.services.core.device.reader.pii.c$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9538b {

        /* renamed from: a */
        static final /* synthetic */ int[] f18878a;

        static {
            int[] iArr = new int[EnumC9540e.values().length];
            f18878a = iArr;
            try {
                iArr[EnumC9540e.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18878a[EnumC9540e.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18878a[EnumC9540e.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C9536c(C9541f c9541f, InterfaceC9557c interfaceC9557c, Experiments experiments) {
        this.f18874a = c9541f;
        this.f18875b = interfaceC9557c;
        this.f18876c = experiments;
    }

    /* renamed from: a */
    private C9539d m2054a() {
        return new C9539d(this.f18876c.isUpdatePiiFields() ? EnumC9534a.UPDATE : EnumC9534a.INCLUDE, m2052b());
    }

    /* renamed from: b */
    private Map<String, Object> m2052b() {
        HashMap hashMap = new HashMap();
        InterfaceC9557c interfaceC9557c = this.f18875b;
        if (interfaceC9557c != null) {
            Object obj = interfaceC9557c.get("unifiedconfig.pii");
            return obj instanceof JSONObject ? C9564j.m1987a(hashMap, (JSONObject) obj, "unifiedconfig.pii.") : hashMap;
        }
        return hashMap;
    }

    /* renamed from: c */
    private HashMap<String, Object> m2051c() {
        return new C9537a();
    }

    /* renamed from: d */
    private C9539d m2050d() {
        if (this.f18874a.m2039c()) {
            return new C9539d(EnumC9534a.INCLUDE, m2051c());
        }
        C9539d m2054a = m2054a();
        m2054a.m2046a(m2051c());
        return m2054a;
    }

    /* renamed from: e */
    private C9539d m2049e() {
        return new C9539d(EnumC9534a.EXCLUDE);
    }

    /* renamed from: f */
    public C9539d m2048f() {
        int i = C9538b.f18878a[this.f18874a.m2042a().ordinal()];
        return (i == 1 || i == 2) ? m2054a() : i != 3 ? m2049e() : m2050d();
    }
}

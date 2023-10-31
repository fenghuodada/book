package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.C9344e;
import com.unity3d.services.store.EnumC9648a;
import com.unity3d.services.store.EnumC9649b;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* renamed from: com.unity3d.services.store.core.a */
/* loaded from: classes3.dex */
public class C9655a {

    /* renamed from: a */
    private final C9344e f19192a;

    public C9655a(C9344e c9344e) {
        this.f19192a = c9344e;
    }

    /* renamed from: a */
    private EnumC9648a m1720a(Exception exc) {
        return exc instanceof NoSuchMethodException ? EnumC9648a.NO_SUCH_METHOD : exc instanceof IllegalAccessException ? EnumC9648a.ILLEGAL_ACCESS : exc instanceof JSONException ? EnumC9648a.JSON_ERROR : exc instanceof InvocationTargetException ? EnumC9648a.INVOCATION_TARGET : exc instanceof ClassNotFoundException ? EnumC9648a.CLASS_NOT_FOUND : EnumC9648a.UNKNOWN_ERROR;
    }

    /* renamed from: a */
    private void m1721a(EnumC9649b enumC9649b, EnumC9648a enumC9648a, int i, Exception exc) {
        this.f19192a.handleError(new C9658c(enumC9649b, exc.getMessage(), Integer.valueOf(i), enumC9648a, exc.getMessage()));
    }

    /* renamed from: a */
    public void m1722a(EnumC9649b enumC9649b, int i, Exception exc) {
        m1721a(enumC9649b, m1720a(exc), i, exc);
    }
}

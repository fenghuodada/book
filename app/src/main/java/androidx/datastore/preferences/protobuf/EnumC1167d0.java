package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* renamed from: androidx.datastore.preferences.protobuf.d0 */
/* loaded from: classes.dex */
public enum EnumC1167d0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1183i.class, AbstractC1183i.f2982b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: a */
    public final Object f2961a;

    EnumC1167d0(Class cls, Serializable serializable) {
        this.f2961a = serializable;
    }
}

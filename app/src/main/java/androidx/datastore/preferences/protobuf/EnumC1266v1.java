package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* renamed from: androidx.datastore.preferences.protobuf.v1 */
/* loaded from: classes.dex */
public enum EnumC1266v1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC1183i.f2982b),
    ENUM(null),
    MESSAGE(null);
    

    /* renamed from: a */
    public final Object f3128a;

    EnumC1266v1(Serializable serializable) {
        this.f3128a = serializable;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
/* loaded from: classes3.dex */
public enum EnumC8206c0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC8228i.class, AbstractC8228i.f15998b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: a */
    public final Object f15967a;

    EnumC8206c0(Class cls, Serializable serializable) {
        this.f15967a = serializable;
    }
}

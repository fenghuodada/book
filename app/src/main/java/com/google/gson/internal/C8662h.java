package com.google.gson.internal;

import com.google.gson.C8693p;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: com.google.gson.internal.h */
/* loaded from: classes3.dex */
public final class C8662h implements InterfaceC8676o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Type f16456a;

    public C8662h(Type type) {
        this.f16456a = type;
    }

    @Override // com.google.gson.internal.InterfaceC8676o
    /* renamed from: a */
    public final Object mo3242a() {
        Type type = this.f16456a;
        if (!(type instanceof ParameterizedType)) {
            throw new C8693p("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C8693p("Invalid EnumSet type: " + type.toString());
    }
}

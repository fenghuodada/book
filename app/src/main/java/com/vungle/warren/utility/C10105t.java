package com.vungle.warren.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* renamed from: com.vungle.warren.utility.t */
/* loaded from: classes3.dex */
public final class C10105t extends ObjectInputStream {

    /* renamed from: a */
    public final List<Class<?>> f20353a;

    public C10105t(FileInputStream fileInputStream, List list) throws IOException {
        super(fileInputStream);
        this.f20353a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        List<Class<?>> list = this.f20353a;
        if (list == null || Number.class.isAssignableFrom(resolveClass) || String.class.equals(resolveClass) || Boolean.class.equals(resolveClass) || resolveClass.isArray() || list.contains(resolveClass)) {
            return resolveClass;
        }
        throw new IOException("Deserialization is not allowed for " + objectStreamClass.getName());
    }
}

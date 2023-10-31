package com.google.gson.reflect;

import com.google.gson.internal.C8593a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.reflect.a */
/* loaded from: classes3.dex */
public class C8696a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    public C8696a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) C8593a.m3277e(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public C8696a(Type type) {
        type.getClass();
        Type m3281a = C8593a.m3281a(type);
        this.type = m3281a;
        this.rawType = (Class<? super T>) C8593a.m3277e(m3281a);
        this.hashCode = m3281a.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static <T> C8696a<T> get(Class<T> cls) {
        return new C8696a<>(cls);
    }

    public static C8696a<?> get(Type type) {
        return new C8696a<>(type);
    }

    public static C8696a<?> getArray(Type type) {
        return new C8696a<>(new C8593a.C8594a(type));
    }

    public static C8696a<?> getParameterized(Type type, Type... typeArr) {
        return new C8696a<>(new C8593a.C8595b(null, type, typeArr));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C8593a.m3281a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> m3277e = C8593a.m3277e(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = m3277e.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                TypeVariable<Class<?>> typeVariable = typeParameters[i];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : m3277e.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(m3277e.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8696a) && C8593a.m3279c(this.type, ((C8696a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(C8696a<?> c8696a) {
        return isAssignableFrom(c8696a.getType());
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(C8593a.m3277e(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(C8593a.m3277e(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
        }
        throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return C8593a.m3274h(this.type);
    }
}

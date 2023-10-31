package com.google.gson.internal;

import com.google.android.material.C7555a;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* renamed from: com.google.gson.internal.a */
/* loaded from: classes3.dex */
public final class C8593a {

    /* renamed from: a */
    public static final Type[] f16329a = new Type[0];

    /* renamed from: com.google.gson.internal.a$a */
    /* loaded from: classes3.dex */
    public static final class C8594a implements GenericArrayType, Serializable {

        /* renamed from: a */
        public final Type f16330a;

        public C8594a(Type type) {
            this.f16330a = C8593a.m3281a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8593a.m3279c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f16330a;
        }

        public final int hashCode() {
            return this.f16330a.hashCode();
        }

        public final String toString() {
            return C8593a.m3274h(this.f16330a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.google.gson.internal.a$b */
    /* loaded from: classes3.dex */
    public static final class C8595b implements ParameterizedType, Serializable {

        /* renamed from: a */
        public final Type f16331a;

        /* renamed from: b */
        public final Type f16332b;

        /* renamed from: c */
        public final Type[] f16333c;

        public C8595b(Type type, Type type2, Type... typeArr) {
            Type m3281a;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C7555a.m4810a(z2);
            }
            if (type == null) {
                m3281a = null;
            } else {
                m3281a = C8593a.m3281a(type);
            }
            this.f16331a = m3281a;
            this.f16332b = C8593a.m3281a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f16333c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.f16333c[i].getClass();
                C8593a.m3280b(this.f16333c[i]);
                Type[] typeArr3 = this.f16333c;
                typeArr3[i] = C8593a.m3281a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8593a.m3279c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f16333c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f16331a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f16332b;
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f16333c) ^ this.f16332b.hashCode();
            Type type = this.f16331a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            Type[] typeArr = this.f16333c;
            int length = typeArr.length;
            Type type = this.f16332b;
            if (length == 0) {
                return C8593a.m3274h(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C8593a.m3274h(type));
            sb.append("<");
            sb.append(C8593a.m3274h(typeArr[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C8593a.m3274h(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.a$c */
    /* loaded from: classes3.dex */
    public static final class C8596c implements WildcardType, Serializable {

        /* renamed from: a */
        public final Type f16334a;

        /* renamed from: b */
        public final Type f16335b;

        public C8596c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C7555a.m4810a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7555a.m4810a(z2);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                C8593a.m3280b(typeArr2[0]);
                C7555a.m4810a(typeArr[0] == Object.class);
                this.f16335b = C8593a.m3281a(typeArr2[0]);
                this.f16334a = Object.class;
                return;
            }
            typeArr[0].getClass();
            C8593a.m3280b(typeArr[0]);
            this.f16335b = null;
            this.f16334a = C8593a.m3281a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8593a.m3279c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f16335b;
            return type != null ? new Type[]{type} : C8593a.f16329a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f16334a};
        }

        public final int hashCode() {
            Type type = this.f16335b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16334a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f16335b;
            if (type != null) {
                return "? super " + C8593a.m3274h(type);
            }
            Type type2 = this.f16334a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C8593a.m3274h(type2);
        }
    }

    /* renamed from: a */
    public static Type m3281a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C8594a(m3281a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C8595b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C8594a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C8596c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: b */
    public static void m3280b(Type type) {
        C7555a.m4810a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: c */
    public static boolean m3279c(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            if (z && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m3279c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    public static Type m3278d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m3278d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m3278d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Class<?> m3277e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C7555a.m4810a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m3277e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m3277e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: f */
    public static Type m3276f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C7555a.m4810a(cls2.isAssignableFrom(cls));
        return m3275g(type, cls, m3278d(type, cls, cls2), new HashSet());
    }

    /* renamed from: g */
    public static Type m3275g(Type type, Class cls, Type type2, HashSet hashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (hashSet.contains(typeVariable)) {
                    return type2;
                }
                hashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type m3278d = m3278d(type, cls, cls2);
                    if (m3278d instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) m3278d).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type m3275g = m3275g(type, cls, componentType, hashSet);
                        if (componentType != m3275g) {
                            return new C8594a(m3275g);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type m3275g2 = m3275g(type, cls, genericComponentType, hashSet);
                    if (genericComponentType != m3275g2) {
                        return new C8594a(m3275g2);
                    }
                    return genericArrayType;
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m3275g3 = m3275g(type, cls, ownerType, hashSet);
                    if (m3275g3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type m3275g4 = m3275g(type, cls, actualTypeArguments[i], hashSet);
                        if (m3275g4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = m3275g4;
                        }
                        i++;
                    }
                    if (z) {
                        return new C8595b(m3275g3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type m3275g5 = m3275g(type, cls, lowerBounds[0], hashSet);
                            wildcardType = wildcardType2;
                            if (m3275g5 != lowerBounds[0]) {
                                if (m3275g5 instanceof WildcardType) {
                                    typeArr2 = ((WildcardType) m3275g5).getLowerBounds();
                                } else {
                                    typeArr2 = new Type[]{m3275g5};
                                }
                                return new C8596c(new Type[]{Object.class}, typeArr2);
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type m3275g6 = m3275g(type, cls, upperBounds[0], hashSet);
                                wildcardType = wildcardType2;
                                if (m3275g6 != upperBounds[0]) {
                                    if (m3275g6 instanceof WildcardType) {
                                        typeArr = ((WildcardType) m3275g6).getUpperBounds();
                                    } else {
                                        typeArr = new Type[]{m3275g6};
                                    }
                                    return new C8596c(typeArr, f16329a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    /* renamed from: h */
    public static String m3274h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

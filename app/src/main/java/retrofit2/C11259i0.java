package retrofit2;

import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.core.C0510h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;

/* renamed from: retrofit2.i0 */
/* loaded from: classes3.dex */
public final class C11259i0 {

    /* renamed from: a */
    public static final Type[] f22015a = new Type[0];

    /* renamed from: retrofit2.i0$a */
    /* loaded from: classes3.dex */
    public static final class C11260a implements GenericArrayType {

        /* renamed from: a */
        public final Type f22016a;

        public C11260a(Type type) {
            this.f22016a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C11259i0.m27b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f22016a;
        }

        public final int hashCode() {
            return this.f22016a.hashCode();
        }

        public final String toString() {
            return C11259i0.m15n(this.f22016a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: retrofit2.i0$b */
    /* loaded from: classes3.dex */
    public static final class C11261b implements ParameterizedType {
        @Nullable

        /* renamed from: a */
        public final Type f22017a;

        /* renamed from: b */
        public final Type f22018b;

        /* renamed from: c */
        public final Type[] f22019c;

        public C11261b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C11259i0.m28a(type3);
            }
            this.f22017a = type;
            this.f22018b = type2;
            this.f22019c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C11259i0.m27b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f22019c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.f22017a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f22018b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f22019c) ^ this.f22018b.hashCode();
            Type type = this.f22017a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f22019c;
            int length = typeArr.length;
            Type type = this.f22018b;
            if (length == 0) {
                return C11259i0.m15n(type);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C11259i0.m15n(type));
            sb.append("<");
            sb.append(C11259i0.m15n(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(C11259i0.m15n(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: retrofit2.i0$c */
    /* loaded from: classes3.dex */
    public static final class C11262c implements WildcardType {

        /* renamed from: a */
        public final Type f22020a;
        @Nullable

        /* renamed from: b */
        public final Type f22021b;

        public C11262c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                C11259i0.m28a(type);
                this.f22021b = null;
                this.f22020a = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            C11259i0.m28a(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f22021b = typeArr2[0];
            this.f22020a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C11259i0.m27b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f22021b;
            return type != null ? new Type[]{type} : C11259i0.f22015a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f22020a};
        }

        public final int hashCode() {
            Type type = this.f22021b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f22020a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f22021b;
            if (type != null) {
                return "? super " + C11259i0.m15n(type);
            }
            Type type2 = this.f22020a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C11259i0.m15n(type2);
        }
    }

    /* renamed from: a */
    public static void m28a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static boolean m27b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m27b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static Type m26c(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m26c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m26c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: d */
    public static Type m25d(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index ", i, " not in range [0,");
        m12536b.append(actualTypeArguments.length);
        m12536b.append(") for ");
        m12536b.append(parameterizedType);
        throw new IllegalArgumentException(m12536b.toString());
    }

    /* renamed from: e */
    public static Class<?> m24e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m24e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m24e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: f */
    public static Type m23f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m17l(type, cls, m26c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static boolean m22g(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m22g(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m22g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: h */
    public static boolean m21h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static IllegalArgumentException m20i(Method method, @Nullable Exception exc, String str, Object... objArr) {
        StringBuilder m12339b = C0510h.m12339b(String.format(str, objArr), "\n    for method ");
        m12339b.append(method.getDeclaringClass().getSimpleName());
        m12339b.append(".");
        m12339b.append(method.getName());
        return new IllegalArgumentException(m12339b.toString(), exc);
    }

    /* renamed from: j */
    public static IllegalArgumentException m19j(Method method, int i, String str, Object... objArr) {
        StringBuilder m12339b = C0510h.m12339b(str, " (parameter #");
        m12339b.append(i + 1);
        m12339b.append(")");
        return m20i(method, null, m12339b.toString(), objArr);
    }

    /* renamed from: k */
    public static IllegalArgumentException m18k(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder m12339b = C0510h.m12339b(str, " (parameter #");
        m12339b.append(i + 1);
        m12339b.append(")");
        return m20i(method, exc, m12339b.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042 A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m17l(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C11259i0.m17l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: m */
    public static void m16m(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: n */
    public static String m15n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

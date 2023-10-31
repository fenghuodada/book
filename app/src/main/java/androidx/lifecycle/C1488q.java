package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import org.jetbrains.annotations.NotNull;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public final class C1488q {
    @NotNull

    /* renamed from: a */
    public static final HashMap f3462a = new HashMap();
    @NotNull

    /* renamed from: b */
    public static final HashMap f3463b = new HashMap();

    /* renamed from: a */
    public static InterfaceC1456e m10529a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            C10843j.m431e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC1456e) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m10528b(Class cls) {
        Constructor constructor;
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        String fullPackage;
        boolean z4;
        boolean z5;
        HashMap hashMap = f3462a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String name = cls.getCanonicalName();
                if (r4 != null) {
                    fullPackage = r4.getName();
                } else {
                    fullPackage = "";
                }
                C10843j.m431e(fullPackage, "fullPackage");
                if (fullPackage.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    C10843j.m431e(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    C10843j.m431e(name, "this as java.lang.String).substring(startIndex)");
                }
                C10843j.m431e(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = C10925n.m394i(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f3463b;
            if (constructor != null) {
                list = C10752h.m486c(constructor);
            } else {
                C1448b c1448b = C1448b.f3413c;
                HashMap hashMap3 = c1448b.f3415b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (((OnLifecycleEvent) declaredMethods[i2].getAnnotation(OnLifecycleEvent.class)) != null) {
                                    c1448b.m10566a(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1481l.class.isAssignableFrom(superclass)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C10843j.m431e(superclass, "superclass");
                        if (m10528b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            C10843j.m433c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    C10843j.m431e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> intrface = interfaces[i3];
                            if (intrface != null && InterfaceC1481l.class.isAssignableFrom(intrface)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C10843j.m431e(intrface, "intrface");
                                if (m10528b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                C10843j.m433c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}

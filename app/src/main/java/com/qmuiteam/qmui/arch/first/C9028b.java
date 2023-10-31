package com.qmuiteam.qmui.arch.first;

import com.qmuiteam.qmui.arch.AbstractActivityC9024f;
import java.util.HashMap;

/* renamed from: com.qmuiteam.qmui.arch.first.b */
/* loaded from: classes3.dex */
public final class C9028b {

    /* renamed from: b */
    public static C9028b f17245b;

    /* renamed from: c */
    public static final C9029a f17246c = new C9029a();

    /* renamed from: a */
    public final HashMap<Class<?>, InterfaceC9027a> f17247a = new HashMap<>();

    /* renamed from: com.qmuiteam.qmui.arch.first.b$a */
    /* loaded from: classes3.dex */
    public class C9029a implements InterfaceC9027a {
        @Override // com.qmuiteam.qmui.arch.first.InterfaceC9027a
        /* renamed from: a */
        public final void mo2798a() {
        }
    }

    /* renamed from: a */
    public final InterfaceC9027a m2799a(Class<? extends AbstractActivityC9024f> cls) {
        HashMap<Class<?>, InterfaceC9027a> hashMap = this.f17247a;
        InterfaceC9027a interfaceC9027a = hashMap.get(cls);
        if (interfaceC9027a != null) {
            return interfaceC9027a;
        }
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return null;
        }
        try {
            Class<?> loadClass = classLoader.loadClass(cls.getName().concat("_FragmentFinder"));
            if (InterfaceC9027a.class.isAssignableFrom(loadClass)) {
                interfaceC9027a = (InterfaceC9027a) loadClass.newInstance();
            }
        } catch (ClassNotFoundException unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null && AbstractActivityC9024f.class.isAssignableFrom(superclass)) {
                interfaceC9027a = m2799a(superclass);
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
        }
        if (interfaceC9027a == null) {
            interfaceC9027a = f17246c;
        }
        hashMap.put(cls, interfaceC9027a);
        return interfaceC9027a;
    }
}

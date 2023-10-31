package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.C1837f;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC1841i {
    @Override // androidx.work.AbstractC1841i
    @NonNull
    /* renamed from: a */
    public final C1837f mo9901a(@NonNull ArrayList arrayList) {
        Object newInstance;
        Object newInstance2;
        C1837f.C1838a c1838a = new C1837f.C1838a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((C1837f) it.next()).f4459a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance2 = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance2, 0, value);
                        value = newInstance2;
                        hashMap.put(str, value);
                    } else {
                        hashMap.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance3 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance3, 0, length);
                            System.arraycopy(value, 0, newInstance3, length, length2);
                            value = newInstance3;
                        } else {
                            newInstance2 = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance2, 0, obj);
                            Array.set(newInstance2, 1, value);
                            value = newInstance2;
                        }
                    } else {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length3 = Array.getLength(obj);
                            newInstance = Array.newInstance(value.getClass(), length3 + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            int length4 = Array.getLength(value);
                            newInstance = Array.newInstance(obj.getClass(), length4 + 1);
                            System.arraycopy(value, 0, newInstance, 0, length4);
                            Array.set(newInstance, length4, obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                        value = newInstance;
                    }
                    hashMap.put(str, value);
                }
            }
        }
        c1838a.m9902a(hashMap);
        C1837f c1837f = new C1837f(c1838a.f4460a);
        C1837f.m9903b(c1837f);
        return c1837f;
    }
}

package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "CollectionToArray")
@SourceDebugExtension({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes3.dex */
public final class C10838e {
    @NotNull

    /* renamed from: a */
    public static final Object[] f21405a = new Object[0];

    @JvmName(name = "toArray")
    @NotNull
    /* renamed from: a */
    public static final Object[] m437a(@NotNull Collection<?> collection) {
        C10843j.m430f(collection, "collection");
        int size = collection.size();
        Object[] objArr = f21405a;
        if (size == 0) {
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                C10843j.m431e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                C10843j.m431e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    @JvmName(name = "toArray")
    @NotNull
    /* renamed from: b */
    public static final Object[] m436b(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        C10843j.m430f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            C10843j.m432d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                C10843j.m431e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                C10843j.m431e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }
}

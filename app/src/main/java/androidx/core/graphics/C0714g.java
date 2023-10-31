package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.C0482i;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.C0770o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

@RequiresApi(24)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
public final class C0714g extends C0721n {

    /* renamed from: a */
    public static final Class<?> f2410a;

    /* renamed from: b */
    public static final Constructor<?> f2411b;

    /* renamed from: c */
    public static final Method f2412c;

    /* renamed from: d */
    public static final Method f2413d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2411b = constructor;
        f2410a = cls;
        f2412c = method2;
        f2413d = method;
    }

    /* renamed from: g */
    public static boolean m11903g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2412c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: a */
    public final Typeface mo11886a(Context context, FontResourcesParserCompat.C0668c c0668c, Resources resources, int i) {
        Object obj;
        FontResourcesParserCompat.C0669d[] c0669dArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f2411b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (FontResourcesParserCompat.C0669d c0669d : c0668c.f2329a) {
            int i2 = c0669d.f2335f;
            File m11875d = C0723o.m11875d(context);
            if (m11875d != null) {
                try {
                    if (C0723o.m11877b(m11875d, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(m11875d);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !m11903g(obj, mappedByteBuffer, c0669d.f2334e, c0669d.f2331b, c0669d.f2332c)) {
                            return null;
                        }
                    }
                } finally {
                    m11875d.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f2410a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2413d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: b */
    public final Typeface mo11885b(Context context, @NonNull C0770o[] c0770oArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = f2411b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0482i c0482i = new C0482i();
        for (C0770o c0770o : c0770oArr) {
            Uri uri = c0770o.f2462a;
            ByteBuffer byteBuffer = (ByteBuffer) c0482i.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = C0723o.m11874e(context, uri);
                c0482i.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m11903g(obj, byteBuffer, c0770o.f2463b, c0770o.f2464c, c0770o.f2465d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f2410a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f2413d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}

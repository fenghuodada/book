package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.C0770o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(26)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.i */
/* loaded from: classes.dex */
public class C0716i extends C0713f {

    /* renamed from: f */
    public final Class<?> f2414f;

    /* renamed from: g */
    public final Constructor<?> f2415g;

    /* renamed from: h */
    public final Method f2416h;

    /* renamed from: i */
    public final Method f2417i;

    /* renamed from: j */
    public final Method f2418j;

    /* renamed from: k */
    public final Method f2419k;

    /* renamed from: l */
    public final Method f2420l;

    public C0716i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m11894m(cls);
            method3 = m11893n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = mo11891o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2414f = cls;
        this.f2415g = constructor;
        this.f2416h = method2;
        this.f2417i = method3;
        this.f2418j = method4;
        this.f2419k = method;
        this.f2420l = method5;
    }

    /* renamed from: m */
    public static Method m11894m(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: n */
    public static Method m11893n(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // androidx.core.graphics.C0713f, androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: a */
    public final Typeface mo11886a(Context context, FontResourcesParserCompat.C0668c c0668c, Resources resources, int i) {
        Object obj;
        FontResourcesParserCompat.C0669d[] c0669dArr;
        FontVariationAxis[] fromFontVariationSettings;
        if (!m11895l()) {
            return super.mo11886a(context, c0668c, resources, i);
        }
        try {
            obj = this.f2415g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (FontResourcesParserCompat.C0669d c0669d : c0668c.f2329a) {
            String str = c0669d.f2330a;
            int i2 = c0669d.f2334e;
            int i3 = c0669d.f2331b;
            boolean z = c0669d.f2332c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0669d.f2333d);
            if (!m11897i(context, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f2419k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!m11896k(obj)) {
            return null;
        }
        return mo11892j(obj);
    }

    @Override // androidx.core.graphics.C0713f, androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: b */
    public final Typeface mo11885b(Context context, @NonNull C0770o[] c0770oArr, int i) {
        Object obj;
        Typeface mo11892j;
        boolean z;
        if (c0770oArr.length < 1) {
            return null;
        }
        if (!m11895l()) {
            C0770o mo11881f = mo11881f(i, c0770oArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo11881f.f2462a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo11881f.f2464c).setItalic(mo11881f.f2465d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0770o c0770o : c0770oArr) {
            if (c0770o.f2466e == 0) {
                Uri uri = c0770o.f2462a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0723o.m11874e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f2415g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = c0770oArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            Method method = this.f2419k;
            if (i2 < length) {
                C0770o c0770o2 = c0770oArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0770o2.f2462a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f2417i.invoke(obj, byteBuffer, Integer.valueOf(c0770o2.f2463b), null, Integer.valueOf(c0770o2.f2464c), Integer.valueOf(c0770o2.f2465d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z2 = true;
                }
                i2++;
                z2 = z2;
            } else if (!z2) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!m11896k(obj) || (mo11892j = mo11892j(obj)) == null) {
                return null;
            } else {
                return Typeface.create(mo11892j, i);
            }
        }
    }

    @Override // androidx.core.graphics.C0721n
    @Nullable
    /* renamed from: d */
    public final Typeface mo11883d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (!m11895l()) {
            return super.mo11883d(context, resources, i, str, i2);
        }
        try {
            obj = this.f2415g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!m11897i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f2419k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!m11896k(obj)) {
            return null;
        } else {
            return mo11892j(obj);
        }
    }

    /* renamed from: i */
    public final boolean m11897i(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2416h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Nullable
    /* renamed from: j */
    public Typeface mo11892j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2414f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2420l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean m11896k(Object obj) {
        try {
            return ((Boolean) this.f2418j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m11895l() {
        Method method = this.f2416h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: o */
    public Method mo11891o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

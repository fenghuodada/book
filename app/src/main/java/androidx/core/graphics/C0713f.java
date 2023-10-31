package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.C0770o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.f */
/* loaded from: classes.dex */
public class C0713f extends C0721n {

    /* renamed from: a */
    public static Class<?> f2405a = null;

    /* renamed from: b */
    public static Constructor<?> f2406b = null;

    /* renamed from: c */
    public static Method f2407c = null;

    /* renamed from: d */
    public static Method f2408d = null;

    /* renamed from: e */
    public static boolean f2409e = false;

    /* renamed from: g */
    public static boolean m11905g(Object obj, String str, int i, boolean z) {
        m11904h();
        try {
            return ((Boolean) f2407c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static void m11904h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f2409e) {
            return;
        }
        f2409e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2406b = constructor;
        f2405a = cls;
        f2407c = method2;
        f2408d = method;
    }

    @Override // androidx.core.graphics.C0721n
    /* renamed from: a */
    public Typeface mo11886a(Context context, FontResourcesParserCompat.C0668c c0668c, Resources resources, int i) {
        FontResourcesParserCompat.C0669d[] c0669dArr;
        m11904h();
        try {
            Object newInstance = f2406b.newInstance(new Object[0]);
            for (FontResourcesParserCompat.C0669d c0669d : c0668c.f2329a) {
                File m11875d = C0723o.m11875d(context);
                if (m11875d == null) {
                    return null;
                }
                try {
                    if (!C0723o.m11877b(m11875d, resources, c0669d.f2335f)) {
                        return null;
                    }
                    if (!m11905g(newInstance, m11875d.getPath(), c0669d.f2331b, c0669d.f2332c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m11875d.delete();
                }
            }
            m11904h();
            try {
                Object newInstance2 = Array.newInstance(f2405a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2408d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.graphics.C0721n
    /* renamed from: b */
    public Typeface mo11885b(Context context, @NonNull C0770o[] c0770oArr, int i) {
        File file;
        String readlink;
        if (c0770oArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo11881f(i, c0770oArr).f2462a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface mo11884c = mo11884c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return mo11884c;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface mo11884c2 = mo11884c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return mo11884c2;
        } catch (IOException unused2) {
            return null;
        }
    }
}

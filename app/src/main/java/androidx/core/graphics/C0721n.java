package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.C0770o;
import java.io.File;
import java.io.InputStream;
import p060j$.util.concurrent.ConcurrentHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.n */
/* loaded from: classes.dex */
public class C0721n {

    /* renamed from: androidx.core.graphics.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0722a<T> {
        /* renamed from: a */
        int mo11880a(T t);

        /* renamed from: b */
        boolean mo11879b(T t);
    }

    public C0721n() {
        new ConcurrentHashMap();
    }

    /* renamed from: e */
    public static <T> T m11882e(T[] tArr, int i, InterfaceC0722a<T> interfaceC0722a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC0722a.mo11880a(t2) - i2) * 2) + (interfaceC0722a.mo11879b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    @Nullable
    /* renamed from: a */
    public Typeface mo11886a(Context context, FontResourcesParserCompat.C0668c c0668c, Resources resources, int i) {
        throw null;
    }

    @Nullable
    /* renamed from: b */
    public Typeface mo11885b(Context context, @NonNull C0770o[] c0770oArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo11884c(Context context, InputStream inputStream) {
        File m11875d = C0723o.m11875d(context);
        if (m11875d == null) {
            return null;
        }
        try {
            if (C0723o.m11876c(inputStream, m11875d)) {
                return Typeface.createFromFile(m11875d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m11875d.delete();
        }
    }

    @Nullable
    /* renamed from: d */
    public Typeface mo11883d(Context context, Resources resources, int i, String str, int i2) {
        File m11875d = C0723o.m11875d(context);
        if (m11875d == null) {
            return null;
        }
        try {
            if (C0723o.m11877b(m11875d, resources, i)) {
                return Typeface.createFromFile(m11875d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m11875d.delete();
        }
    }

    /* renamed from: f */
    public C0770o mo11881f(int i, C0770o[] c0770oArr) {
        return (C0770o) m11882e(c0770oArr, i, new C0720m());
    }
}

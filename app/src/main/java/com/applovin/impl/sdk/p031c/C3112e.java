package com.applovin.impl.sdk.p031c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.e */
/* loaded from: classes.dex */
public final class C3112e {

    /* renamed from: a */
    private static C3214m f8093a;

    /* renamed from: b */
    private static SharedPreferences f8094b;

    /* renamed from: c */
    private final SharedPreferences f8095c;

    public C3112e(C3214m c3214m) {
        this.f8095c = c3214m.m7476L().getSharedPreferences("com.applovin.sdk.preferences." + c3214m.m7386z(), 0);
        if (c3214m.m7409e()) {
            return;
        }
        f8093a = c3214m;
    }

    /* renamed from: a */
    private static SharedPreferences m7793a(Context context) {
        if (f8094b == null) {
            f8094b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f8094b;
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m7783a(String str, @Nullable T t, Class cls, SharedPreferences sharedPreferences) {
        Object string;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    string = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    string = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    string = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0L);
                    }
                    string = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    string = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                } else {
                    string = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                return string != null ? (T) cls.cast(string) : t;
            }
            return t;
        } catch (Throwable th) {
            try {
                if (C3349v.m6862a()) {
                    C3349v.m6852c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                }
                return t;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    /* renamed from: a */
    private static void m7792a(final SharedPreferences.Editor editor) {
        try {
            C3214m c3214m = f8093a;
            if (c3214m != null && ((Boolean) c3214m.m7456a(C3109b.f8014eJ)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                } else if (f8093a.m7469S() != null) {
                    f8093a.m7469S().m7620a(new C3189z(f8093a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            editor.commit();
                        }
                    }), C3163o.EnumC3165a.BACKGROUND);
                }
            }
            editor.apply();
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("SharedPreferencesManager", "Unable to apply changes", th);
            }
        }
    }

    /* renamed from: a */
    public static <T> void m7788a(C3111d<T> c3111d, @Nullable T t, Context context) {
        m7784a(c3111d.m7795a(), t, m7793a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: a */
    public static <T> void m7784a(String str, @Nullable T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                if (C3349v.m6862a()) {
                    C3349v.m6846i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                }
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (!z || z2) {
            return;
        }
        m7792a(editor);
    }

    @Nullable
    /* renamed from: b */
    public static <T> T m7781b(C3111d<T> c3111d, @Nullable T t, Context context) {
        return (T) m7783a(c3111d.m7795a(), t, c3111d.m7794b(), m7793a(context));
    }

    /* renamed from: a */
    public void m7791a(SharedPreferences sharedPreferences) {
        m7792a(sharedPreferences.edit().clear());
    }

    /* renamed from: a */
    public <T> void m7790a(C3111d<T> c3111d) {
        m7792a(this.f8095c.edit().remove(c3111d.m7795a()));
    }

    /* renamed from: a */
    public <T> void m7789a(C3111d<T> c3111d, @Nullable T t) {
        m7787a((C3111d<C3111d<T>>) c3111d, (C3111d<T>) t, this.f8095c);
    }

    /* renamed from: a */
    public <T> void m7787a(C3111d<T> c3111d, @Nullable T t, SharedPreferences sharedPreferences) {
        m7785a(c3111d.m7795a(), (String) t, sharedPreferences);
    }

    /* renamed from: a */
    public <T> void m7786a(String str, @Nullable T t, SharedPreferences.Editor editor) {
        m7784a(str, t, (SharedPreferences) null, editor);
    }

    /* renamed from: a */
    public <T> void m7785a(String str, @Nullable T t, SharedPreferences sharedPreferences) {
        m7784a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    @Nullable
    /* renamed from: b */
    public <T> T m7782b(C3111d<T> c3111d, @Nullable T t) {
        return (T) m7780b((C3111d<C3111d<T>>) c3111d, (C3111d<T>) t, this.f8095c);
    }

    @Nullable
    /* renamed from: b */
    public <T> T m7780b(C3111d<T> c3111d, @Nullable T t, SharedPreferences sharedPreferences) {
        return (T) m7783a(c3111d.m7795a(), t, c3111d.m7794b(), sharedPreferences);
    }
}

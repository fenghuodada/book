package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.b */
/* loaded from: classes.dex */
public final class C0777b {

    /* renamed from: a */
    public static final Method f2487a;

    @RequiresApi(21)
    /* renamed from: androidx.core.text.b$a */
    /* loaded from: classes.dex */
    public static class C0778a {
        @DoNotInline
        /* renamed from: a */
        public static String m11817a(Locale locale) {
            return locale.getScript();
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.core.text.b$b */
    /* loaded from: classes.dex */
    public static class C0779b {
        @DoNotInline
        /* renamed from: a */
        public static ULocale m11816a(Object obj) {
            ULocale addLikelySubtags;
            addLikelySubtags = ULocale.addLikelySubtags((ULocale) obj);
            return addLikelySubtags;
        }

        @DoNotInline
        /* renamed from: b */
        public static ULocale m11815b(Locale locale) {
            ULocale forLocale;
            forLocale = ULocale.forLocale(locale);
            return forLocale;
        }

        @DoNotInline
        /* renamed from: c */
        public static String m11814c(Object obj) {
            String script;
            script = ((ULocale) obj).getScript();
            return script;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f2487a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m11818a(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0779b.m11814c(C0779b.m11816a(C0779b.m11815b(locale)));
        }
        try {
            return C0778a.m11817a((Locale) f2487a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
            return C0778a.m11817a(locale);
        }
    }
}

package androidx.core.p003os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.text.C0777b;
import java.util.Locale;

/* renamed from: androidx.core.os.e */
/* loaded from: classes.dex */
public final class C0735e {

    /* renamed from: b */
    public static final C0735e f2424b = m11860a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC0742j f2425a;

    @RequiresApi(21)
    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes.dex */
    public static class C0736a {

        /* renamed from: a */
        public static final Locale[] f2426a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @DoNotInline
        /* renamed from: a */
        public static Locale m11857a(String str) {
            return Locale.forLanguageTag(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11856b(@NonNull Locale locale, @NonNull Locale locale2) {
            boolean z;
            boolean z2;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f2426a;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (localeArr[i].equals(locale)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                int length2 = localeArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (localeArr[i2].equals(locale2)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    String m11818a = C0777b.m11818a(locale);
                    if (m11818a.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return m11818a.equals(C0777b.m11818a(locale2));
                }
            }
            return false;
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.core.os.e$b */
    /* loaded from: classes.dex */
    public static class C0737b {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m11855a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        /* renamed from: b */
        public static LocaleList m11854b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        @DoNotInline
        /* renamed from: c */
        public static LocaleList m11853c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    public C0735e(InterfaceC0742j interfaceC0742j) {
        this.f2425a = interfaceC0742j;
    }

    @NonNull
    /* renamed from: a */
    public static C0735e m11860a(@NonNull Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0735e(new C0748p(C0737b.m11855a(localeArr)));
        }
        return new C0735e(new C0741i(localeArr));
    }

    @NonNull
    /* renamed from: b */
    public static C0735e m11859b(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return f2424b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C0736a.m11857a(split[i]);
        }
        return m11860a(localeArr);
    }

    @Nullable
    /* renamed from: c */
    public final Locale m11858c(int i) {
        return this.f2425a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0735e) {
            if (this.f2425a.equals(((C0735e) obj).f2425a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2425a.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f2425a.toString();
    }
}

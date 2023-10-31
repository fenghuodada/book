package androidx.core.p003os;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.i */
/* loaded from: classes.dex */
public final class C0741i implements InterfaceC0742j {

    /* renamed from: c */
    public static final Locale[] f2427c = new Locale[0];

    /* renamed from: a */
    public final Locale[] f2428a;
    @NonNull

    /* renamed from: b */
    public final String f2429b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C0741i(@NonNull Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f2428a = f2427c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < localeArr.length; i++) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        sb2.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb2.append('-');
                            sb2.append(locale2.getCountry());
                        }
                        if (i < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                } else {
                    throw new NullPointerException(C0740h.m11849a("list[", i, "] is null"));
                }
            }
            this.f2428a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f2429b = sb;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    /* renamed from: a */
    public final String mo11835a() {
        return this.f2429b;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    @Nullable
    /* renamed from: b */
    public final Object mo11834b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0741i) {
            Locale[] localeArr = ((C0741i) obj).f2428a;
            Locale[] localeArr2 = this.f2428a;
            if (localeArr2.length != localeArr.length) {
                return false;
            }
            for (int i = 0; i < localeArr2.length; i++) {
                if (!localeArr2[i].equals(localeArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f2428a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.f2428a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final boolean isEmpty() {
        return this.f2428a.length == 0;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final int size() {
        return this.f2428a.length;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f2428a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}

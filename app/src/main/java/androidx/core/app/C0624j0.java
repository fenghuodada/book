package androidx.core.app;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.j0 */
/* loaded from: classes.dex */
public final class C0624j0 {
    @Nullable

    /* renamed from: a */
    public final CharSequence f2284a;
    @Nullable

    /* renamed from: b */
    public final IconCompat f2285b;
    @Nullable

    /* renamed from: c */
    public final String f2286c;
    @Nullable

    /* renamed from: d */
    public final String f2287d;

    /* renamed from: e */
    public final boolean f2288e;

    /* renamed from: f */
    public final boolean f2289f;

    @RequiresApi(28)
    /* renamed from: androidx.core.app.j0$a */
    /* loaded from: classes.dex */
    public static class C0625a {
        @DoNotInline
        /* renamed from: a */
        public static C0624j0 m12069a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            C0626b c0626b = new C0626b();
            name = person.getName();
            c0626b.f2290a = name;
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f2391k;
                icon2.getClass();
                int m11950c = IconCompat.C0696a.m11950c(icon2);
                if (m11950c != 2) {
                    if (m11950c != 4) {
                        if (m11950c != 6) {
                            iconCompat = new IconCompat(-1);
                            iconCompat.f2393b = icon2;
                        } else {
                            Uri m11949d = IconCompat.C0696a.m11949d(icon2);
                            m11949d.getClass();
                            String uri2 = m11949d.toString();
                            uri2.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f2393b = uri2;
                        }
                    } else {
                        Uri m11949d2 = IconCompat.C0696a.m11949d(icon2);
                        m11949d2.getClass();
                        String uri3 = m11949d2.toString();
                        uri3.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f2393b = uri3;
                    }
                } else {
                    iconCompat = IconCompat.m11955b(IconCompat.C0696a.m11951b(icon2), IconCompat.C0696a.m11952a(icon2));
                }
            } else {
                iconCompat = null;
            }
            c0626b.f2291b = iconCompat;
            uri = person.getUri();
            c0626b.f2292c = uri;
            key = person.getKey();
            c0626b.f2293d = key;
            isBot = person.isBot();
            c0626b.f2294e = isBot;
            isImportant = person.isImportant();
            c0626b.f2295f = isImportant;
            return new C0624j0(c0626b);
        }

        @DoNotInline
        /* renamed from: b */
        public static Person m12068b(C0624j0 c0624j0) {
            Person.Builder name = new Person.Builder().setName(c0624j0.f2284a);
            Icon icon = null;
            IconCompat iconCompat = c0624j0.f2285b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.C0696a.m11947f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(c0624j0.f2286c).setKey(c0624j0.f2287d).setBot(c0624j0.f2288e).setImportant(c0624j0.f2289f).build();
        }
    }

    /* renamed from: androidx.core.app.j0$b */
    /* loaded from: classes.dex */
    public static class C0626b {
        @Nullable

        /* renamed from: a */
        public CharSequence f2290a;
        @Nullable

        /* renamed from: b */
        public IconCompat f2291b;
        @Nullable

        /* renamed from: c */
        public String f2292c;
        @Nullable

        /* renamed from: d */
        public String f2293d;

        /* renamed from: e */
        public boolean f2294e;

        /* renamed from: f */
        public boolean f2295f;
    }

    public C0624j0(C0626b c0626b) {
        this.f2284a = c0626b.f2290a;
        this.f2285b = c0626b.f2291b;
        this.f2286c = c0626b.f2292c;
        this.f2287d = c0626b.f2293d;
        this.f2288e = c0626b.f2294e;
        this.f2289f = c0626b.f2295f;
    }
}

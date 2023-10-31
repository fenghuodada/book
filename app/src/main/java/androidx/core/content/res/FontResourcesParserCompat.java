package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C0597a;
import androidx.core.provider.C0762h;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class FontResourcesParserCompat {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FetchStrategy {
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$a */
    /* loaded from: classes.dex */
    public static class C0666a {
        @DoNotInline
        /* renamed from: a */
        public static int m12001a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0667b {
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$c */
    /* loaded from: classes.dex */
    public static final class C0668c implements InterfaceC0667b {
        @NonNull

        /* renamed from: a */
        public final C0669d[] f2329a;

        public C0668c(@NonNull C0669d[] c0669dArr) {
            this.f2329a = c0669dArr;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$d */
    /* loaded from: classes.dex */
    public static final class C0669d {
        @NonNull

        /* renamed from: a */
        public final String f2330a;

        /* renamed from: b */
        public final int f2331b;

        /* renamed from: c */
        public final boolean f2332c;

        /* renamed from: d */
        public final String f2333d;

        /* renamed from: e */
        public final int f2334e;

        /* renamed from: f */
        public final int f2335f;

        public C0669d(int i, int i2, int i3, @NonNull String str, @Nullable String str2, boolean z) {
            this.f2330a = str;
            this.f2331b = i;
            this.f2332c = z;
            this.f2333d = str2;
            this.f2334e = i2;
            this.f2335f = i3;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$e */
    /* loaded from: classes.dex */
    public static final class C0670e implements InterfaceC0667b {
        @NonNull

        /* renamed from: a */
        public final C0762h f2336a;

        /* renamed from: b */
        public final int f2337b;

        /* renamed from: c */
        public final int f2338c;
        @Nullable

        /* renamed from: d */
        public final String f2339d;

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
        public C0670e(@NonNull C0762h c0762h, int i, int i2, @Nullable String str) {
            this.f2336a = c0762h;
            this.f2338c = i;
            this.f2337b = i2;
            this.f2339d = str;
        }
    }

    @Nullable
    /* renamed from: a */
    public static InterfaceC0667b m12004a(@NonNull XmlResourceParser xmlResourceParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        int i;
        boolean z;
        int i2;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0597a.f2239b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        m12002c(xmlResourceParser);
                    }
                    return new C0670e(new C0762h(string, string2, string3, m12003b(resourceId, resources)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0597a.f2240c);
                            int i3 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i3 = 1;
                            }
                            int i4 = obtainAttributes2.getInt(i3, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i = 6;
                            } else {
                                i = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i5 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i5 = 3;
                            }
                            int i6 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i6 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i6);
                            int i7 = obtainAttributes2.getInt(i5, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i2 = 5;
                            } else {
                                i2 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i2, 0);
                            String string6 = obtainAttributes2.getString(i2);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                m12002c(xmlResourceParser);
                            }
                            arrayList.add(new C0669d(i4, i7, resourceId2, string6, string5, z));
                        } else {
                            m12002c(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new C0668c((C0669d[]) arrayList.toArray(new C0669d[0]));
                }
            } else {
                m12002c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    /* renamed from: b */
    public static List m12003b(@ArrayRes int i, @NonNull Resources resources) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (C0666a.m12001a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m12002c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}

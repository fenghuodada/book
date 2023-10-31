package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.c */
/* loaded from: classes.dex */
public final class C0673c {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f2350a = new ThreadLocal<>();

    @NonNull
    /* renamed from: a */
    public static ColorStateList m11994a(@NonNull Resources resources, @NonNull XmlResourceParser xmlResourceParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m11993b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m11993b(@androidx.annotation.NonNull android.content.res.Resources r36, @androidx.annotation.NonNull android.content.res.XmlResourceParser r37, @androidx.annotation.NonNull android.util.AttributeSet r38, @androidx.annotation.Nullable android.content.res.Resources.Theme r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0673c.m11993b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}

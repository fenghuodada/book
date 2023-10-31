package kotlin.text;

import androidx.appcompat.widget.C0406q1;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10878c;

@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* renamed from: kotlin.text.a */
/* loaded from: classes3.dex */
public class C10909a {
    @PublishedApi
    /* renamed from: a */
    public static final void m407a(int i) {
        boolean z;
        C10878c c10878c = new C10878c(2, 36);
        if (2 <= i && i <= c10878c.f21423b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("radix ", i, " was not in valid range ");
        m12536b.append(new C10878c(2, 36));
        throw new IllegalArgumentException(m12536b.toString());
    }

    /* renamed from: b */
    public static final boolean m406b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m405c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}

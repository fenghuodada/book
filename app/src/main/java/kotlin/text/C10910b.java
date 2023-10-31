package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.text.b */
/* loaded from: classes3.dex */
public final class C10910b {
    @NotNull

    /* renamed from: a */
    public static final C10910b f21449a = new C10910b();
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final Charset f21450b;
    @Nullable

    /* renamed from: c */
    public static volatile Charset f21451c;
    @Nullable

    /* renamed from: d */
    public static volatile Charset f21452d;

    static {
        Charset forName = Charset.forName("UTF-8");
        C10843j.m431e(forName, "forName(\"UTF-8\")");
        f21450b = forName;
        C10843j.m431e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        C10843j.m431e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        C10843j.m431e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        C10843j.m431e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        C10843j.m431e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}

package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n22#2,3:399\n1#3:402\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n104#1:399,3\n*E\n"})
/* renamed from: kotlin.text.g */
/* loaded from: classes3.dex */
public final class C10918g implements Serializable {
    @NotNull

    /* renamed from: a */
    public final Pattern f21470a;

    public C10918g(@NotNull String str) {
        Pattern compile = Pattern.compile(str);
        C10843j.m431e(compile, "compile(pattern)");
        this.f21470a = compile;
    }

    @NotNull
    public final String toString() {
        String pattern = this.f21470a.toString();
        C10843j.m431e(pattern, "nativePattern.toString()");
        return pattern;
    }
}

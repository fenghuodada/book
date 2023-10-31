package kotlin.internal.jdk7;

import kotlin.internal.C10797a;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.internal.jdk7.a */
/* loaded from: classes3.dex */
public class C10801a extends C10797a {

    @SourceDebugExtension({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a */
    /* loaded from: classes3.dex */
    public static final class C10802a {
        @JvmField
        @Nullable

        /* renamed from: a */
        public static final Integer f21395a;

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L27
                int r2 = r1.intValue()
                if (r2 <= 0) goto L23
                r2 = 1
                goto L24
            L23:
                r2 = 0
            L24:
                if (r2 == 0) goto L27
                r0 = r1
            L27:
                kotlin.internal.jdk7.C10801a.C10802a.f21395a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk7.C10801a.C10802a.<clinit>():void");
        }
    }

    @Override // kotlin.internal.C10797a
    /* renamed from: a */
    public final void mo445a(@NotNull Throwable cause, @NotNull Throwable exception) {
        boolean z;
        C10843j.m430f(cause, "cause");
        C10843j.m430f(exception, "exception");
        Integer num = C10802a.f21395a;
        if (num != null && num.intValue() < 19) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            cause.addSuppressed(exception);
        } else {
            super.mo445a(cause, exception);
        }
    }
}

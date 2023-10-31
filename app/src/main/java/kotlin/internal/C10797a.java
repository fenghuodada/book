package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.AbstractC10873c;
import kotlin.random.C10871b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: kotlin.internal.a */
/* loaded from: classes3.dex */
public class C10797a {

    @SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* renamed from: kotlin.internal.a$a */
    /* loaded from: classes3.dex */
    public static final class C10798a {
        @JvmField
        @Nullable

        /* renamed from: a */
        public static final Method f21391a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            if (kotlin.jvm.internal.C10843j.m435a(r5, java.lang.Throwable.class) != false) goto L11;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C10843j.m431e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Le:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C10843j.m435a(r7, r8)
                if (r7 == 0) goto L35
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C10843j.m431e(r7, r8)
                int r8 = r7.length
                r9 = 1
                if (r8 != r9) goto L2e
                r5 = r7[r3]
            L2e:
                boolean r5 = kotlin.jvm.internal.C10843j.m435a(r5, r0)
                if (r5 == 0) goto L35
                goto L36
            L35:
                r9 = r3
            L36:
                if (r9 == 0) goto L3a
                r5 = r6
                goto L3d
            L3a:
                int r4 = r4 + 1
                goto Le
            L3d:
                kotlin.internal.C10797a.C10798a.f21391a = r5
                int r0 = r1.length
            L40:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = kotlin.jvm.internal.C10843j.m435a(r2, r4)
                if (r2 == 0) goto L51
                goto L54
            L51:
                int r3 = r3 + 1
                goto L40
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.C10797a.C10798a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo445a(@NotNull Throwable cause, @NotNull Throwable exception) {
        C10843j.m430f(cause, "cause");
        C10843j.m430f(exception, "exception");
        Method method = C10798a.f21391a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    /* renamed from: b */
    public AbstractC10873c mo444b() {
        return new C10871b();
    }
}

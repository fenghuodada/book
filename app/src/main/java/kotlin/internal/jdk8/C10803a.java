package kotlin.internal.jdk8;

import kotlin.internal.jdk7.C10801a;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.AbstractC10873c;
import kotlin.random.C10871b;
import kotlin.random.jdk8.C10875a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.internal.jdk8.a */
/* loaded from: classes3.dex */
public class C10803a extends C10801a {

    @SourceDebugExtension({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: kotlin.internal.jdk8.a$a */
    /* loaded from: classes3.dex */
    public static final class C10804a {
        @JvmField
        @Nullable

        /* renamed from: a */
        public static final Integer f21396a;

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
                kotlin.internal.jdk8.C10803a.C10804a.f21396a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk8.C10803a.C10804a.<clinit>():void");
        }
    }

    @Override // kotlin.internal.C10797a
    @NotNull
    /* renamed from: b */
    public final AbstractC10873c mo444b() {
        boolean z;
        Integer num = C10804a.f21396a;
        if (num != null && num.intValue() < 34) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C10875a();
        }
        return new C10871b();
    }
}

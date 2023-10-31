package kotlin.p061io;

import java.io.Closeable;
import kotlin.C10738b;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "CloseableKt")
/* renamed from: kotlin.io.a */
/* loaded from: classes3.dex */
public final class C10805a {
    @SinceKotlin(version = "1.1")
    @PublishedApi
    /* renamed from: a */
    public static final void m443a(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C10738b.m502a(th, th2);
            }
        }
    }
}

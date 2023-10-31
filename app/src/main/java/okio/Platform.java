package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10910b;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m508d2 = {"", "", "toUtf8String", "asUtf8ToByteArray", "R", "", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "-Platform")
/* renamed from: okio.-Platform  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Platform {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String asUtf8ToByteArray) {
        C10843j.m430f(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(C10910b.f21450b);
        C10843j.m431e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m13228synchronized(@NotNull Object lock, @NotNull InterfaceC10809a<? extends R> block) {
        R invoke;
        C10843j.m430f(lock, "lock");
        C10843j.m430f(block, "block");
        synchronized (lock) {
            invoke = block.invoke();
        }
        return invoke;
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] toUtf8String) {
        C10843j.m430f(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, C10910b.f21450b);
    }
}

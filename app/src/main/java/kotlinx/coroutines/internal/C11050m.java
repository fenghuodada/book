package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@JvmInline
@SourceDebugExtension({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.m */
/* loaded from: classes3.dex */
public final class C11050m<E> {
    @NotNull
    /* renamed from: a */
    public static final Object m251a(Object obj, E e) {
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }
}

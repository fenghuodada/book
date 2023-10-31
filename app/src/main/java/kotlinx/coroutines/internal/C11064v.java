package kotlinx.coroutines.internal;

import com.google.android.datatransport.runtime.scheduling.persistence.C6595o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.C10898a;
import kotlin.sequences.C10903e;
import kotlin.sequences.C10904f;
import kotlinx.coroutines.AbstractC11097q1;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.v */
/* loaded from: classes3.dex */
public final class C11064v {
    @JvmField
    @NotNull

    /* renamed from: a */
    public static final AbstractC11097q1 f21674a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.sequences.a] */
    static {
        String str;
        Object next;
        AbstractC11097q1 mo232b;
        int i = C11038h0.f21629a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator m6229a = C6595o.m6229a();
        C10843j.m430f(m6229a, "<this>");
        C10904f c10904f = new C10904f(m6229a);
        if (!(c10904f instanceof C10898a)) {
            c10904f = new C10898a(c10904f);
        }
        List<? extends InterfaceC11063u> m408h = C10903e.m408h(c10904f);
        Iterator it = m408h.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int mo231c = ((InterfaceC11063u) next).mo231c();
                do {
                    Object next2 = it.next();
                    int mo231c2 = ((InterfaceC11063u) next2).mo231c();
                    if (mo231c < mo231c2) {
                        next = next2;
                        mo231c = mo231c2;
                    }
                } while (it.hasNext());
            }
        }
        InterfaceC11063u interfaceC11063u = (InterfaceC11063u) next;
        if (interfaceC11063u != null && (mo232b = interfaceC11063u.mo232b(m408h)) != null) {
            f21674a = mo232b;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}

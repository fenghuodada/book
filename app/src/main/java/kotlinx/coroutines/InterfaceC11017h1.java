package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10820l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.h1 */
/* loaded from: classes3.dex */
public interface InterfaceC11017h1 extends InterfaceC10775f.InterfaceC10778b {

    /* renamed from: c0 */
    public static final /* synthetic */ int f21606c0 = 0;

    /* renamed from: kotlinx.coroutines.h1$a */
    /* loaded from: classes3.dex */
    public static final class C11018a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC11096q0 m296a(InterfaceC11017h1 interfaceC11017h1, boolean z, AbstractC11081m1 abstractC11081m1, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC11017h1.mo189h(z, (i & 2) != 0, abstractC11081m1);
        }
    }

    /* renamed from: kotlinx.coroutines.h1$b */
    /* loaded from: classes3.dex */
    public static final class C11019b implements InterfaceC10775f.InterfaceC10780c<InterfaceC11017h1> {

        /* renamed from: a */
        public static final /* synthetic */ C11019b f21607a = new C11019b();
    }

    /* renamed from: c */
    boolean mo191c();

    @Nullable
    InterfaceC11017h1 getParent();

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: h */
    InterfaceC11096q0 mo189h(boolean z, boolean z2, @NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l);

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: j */
    CancellationException mo188j();

    @InternalCoroutinesApi
    @NotNull
    /* renamed from: k */
    InterfaceC11082n mo187k(@NotNull C11084n1 c11084n1);

    @NotNull
    /* renamed from: m */
    InterfaceC11096q0 mo185m(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l);

    boolean start();

    /* renamed from: y */
    void mo182y(@Nullable CancellationException cancellationException);
}

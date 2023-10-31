package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* renamed from: kotlin.coroutines.jvm.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10786c extends AbstractC10784a {
    @Nullable
    private final InterfaceC10775f _context;
    @Nullable
    private transient InterfaceC10772d<Object> intercepted;

    public AbstractC10786c(@Nullable InterfaceC10772d<Object> interfaceC10772d) {
        this(interfaceC10772d, interfaceC10772d != null ? interfaceC10772d.getContext() : null);
    }

    public AbstractC10786c(@Nullable InterfaceC10772d<Object> interfaceC10772d, @Nullable InterfaceC10775f interfaceC10775f) {
        super(interfaceC10772d);
        this._context = interfaceC10775f;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    @NotNull
    public InterfaceC10775f getContext() {
        InterfaceC10775f interfaceC10775f = this._context;
        C10843j.m433c(interfaceC10775f);
        return interfaceC10775f;
    }

    @NotNull
    public final InterfaceC10772d<Object> intercepted() {
        InterfaceC10772d<Object> interfaceC10772d = this.intercepted;
        if (interfaceC10772d == null) {
            InterfaceC10773e interfaceC10773e = (InterfaceC10773e) getContext().mo195a(InterfaceC10773e.C10774a.f21375a);
            if (interfaceC10773e == null || (interfaceC10772d = interfaceC10773e.mo350e(this)) == null) {
                interfaceC10772d = this;
            }
            this.intercepted = interfaceC10772d;
        }
        return interfaceC10772d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    public void releaseIntercepted() {
        InterfaceC10772d<?> interfaceC10772d = this.intercepted;
        if (interfaceC10772d != null && interfaceC10772d != this) {
            InterfaceC10775f context = getContext();
            int i = InterfaceC10773e.f21374b0;
            InterfaceC10775f.InterfaceC10778b mo195a = context.mo195a(InterfaceC10773e.C10774a.f21375a);
            C10843j.m433c(mo195a);
            ((InterfaceC10773e) mo195a).mo351d(interfaceC10772d);
        }
        this.intercepted = C10785b.f21380a;
    }
}

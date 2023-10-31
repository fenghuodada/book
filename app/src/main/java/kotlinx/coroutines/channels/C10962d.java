package kotlinx.coroutines.channels;

import kotlin.C10868p;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlinx.coroutines.InterfaceC11015h;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11036g0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.channels.d */
/* loaded from: classes3.dex */
public final class C10962d {
    @NotNull

    /* renamed from: a */
    public static final C10966f<Object> f21522a = new C10966f<>(-1, null, null, 0);
    @JvmField

    /* renamed from: b */
    public static final int f21523b = C11036g0.m263b("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c */
    public static final int f21524c = C11036g0.m263b("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    @JvmField
    @NotNull

    /* renamed from: d */
    public static final C11034f0 f21525d = new C11034f0("BUFFERED");
    @NotNull

    /* renamed from: e */
    public static final C11034f0 f21526e = new C11034f0("SHOULD_BUFFER");
    @NotNull

    /* renamed from: f */
    public static final C11034f0 f21527f = new C11034f0("S_RESUMING_BY_RCV");
    @NotNull

    /* renamed from: g */
    public static final C11034f0 f21528g = new C11034f0("RESUMING_BY_EB");
    @NotNull

    /* renamed from: h */
    public static final C11034f0 f21529h = new C11034f0("POISONED");
    @NotNull

    /* renamed from: i */
    public static final C11034f0 f21530i = new C11034f0("DONE_RCV");
    @NotNull

    /* renamed from: j */
    public static final C11034f0 f21531j = new C11034f0("INTERRUPTED_SEND");
    @NotNull

    /* renamed from: k */
    public static final C11034f0 f21532k = new C11034f0("INTERRUPTED_RCV");
    @NotNull

    /* renamed from: l */
    public static final C11034f0 f21533l = new C11034f0("CHANNEL_CLOSED");
    @NotNull

    /* renamed from: m */
    public static final C11034f0 f21534m = new C11034f0("SUSPEND");
    @NotNull

    /* renamed from: n */
    public static final C11034f0 f21535n = new C11034f0("SUSPEND_NO_WAITER");
    @NotNull

    /* renamed from: o */
    public static final C11034f0 f21536o = new C11034f0("FAILED");
    @NotNull

    /* renamed from: p */
    public static final C11034f0 f21537p = new C11034f0("CLOSE_HANDLER_CLOSED");
    @NotNull

    /* renamed from: q */
    public static final C11034f0 f21538q = new C11034f0("CLOSE_HANDLER_INVOKED");
    @NotNull

    /* renamed from: r */
    public static final C11034f0 f21539r = new C11034f0("NO_CLOSE_CAUSE");

    /* renamed from: a */
    public static final <T> boolean m318a(InterfaceC11015h<? super T> interfaceC11015h, T t, InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        C11034f0 mo136g = interfaceC11015h.mo136g(t, interfaceC10820l);
        if (mo136g != null) {
            interfaceC11015h.mo133r(mo136g);
            return true;
        }
        return false;
    }
}

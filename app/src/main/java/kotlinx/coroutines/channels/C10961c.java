package kotlinx.coroutines.channels;

import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10842i;
import kotlin.jvm.internal.C10843j;

/* renamed from: kotlinx.coroutines.channels.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10961c extends C10842i implements InterfaceC10824p<Long, C10966f<Object>, C10966f<Object>> {

    /* renamed from: a */
    public static final C10961c f21521a = new C10961c();

    public C10961c() {
        super(2, C10962d.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final C10966f<Object> invoke(Long l, C10966f<Object> c10966f) {
        long longValue = l.longValue();
        C10966f<Object> c10966f2 = c10966f;
        C10966f<Object> c10966f3 = C10962d.f21522a;
        C10956a<Object> c10956a = c10966f2.f21543e;
        C10843j.m433c(c10956a);
        return new C10966f<>(longValue, c10966f2, c10956a, 0);
    }
}

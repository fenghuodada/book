package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.AbstractC1138d;
import java.util.Map;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.collections.C10765u;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m453f = "Preferences.kt", m452i = {}, m451l = {329}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.preferences.core.e */
/* loaded from: classes.dex */
public final class C1141e extends AbstractC10790f implements InterfaceC10824p<AbstractC1138d, InterfaceC10772d<? super AbstractC1138d>, Object> {

    /* renamed from: a */
    public int f2936a;

    /* renamed from: b */
    public /* synthetic */ Object f2937b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10824p<C1133a, InterfaceC10772d<? super C10868p>, Object> f2938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1141e(InterfaceC10824p<? super C1133a, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p, InterfaceC10772d<? super C1141e> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2938c = interfaceC10824p;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        C1141e c1141e = new C1141e(this.f2938c, interfaceC10772d);
        c1141e.f2937b = obj;
        return c1141e;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(AbstractC1138d abstractC1138d, InterfaceC10772d<? super AbstractC1138d> interfaceC10772d) {
        return ((C1141e) create(abstractC1138d, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.f2936a;
        if (i != 0) {
            if (i == 1) {
                C1133a c1133a = (C1133a) this.f2937b;
                C10864l.m418b(obj);
                return c1133a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10864l.m418b(obj);
        C1133a c1133a2 = new C1133a((Map<AbstractC1138d.C1139a<?>, Object>) C10765u.m462g(((AbstractC1138d) this.f2937b).mo11183a()), false);
        this.f2937b = c1133a2;
        this.f2936a = 1;
        if (this.f2938c.invoke(c1133a2, this) == enumC10782a) {
            return enumC10782a;
        }
        return c1133a2;
    }
}

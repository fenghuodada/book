package androidx.datastore.preferences.core;

import androidx.datastore.core.C1107q;
import androidx.datastore.core.InterfaceC1099i;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.flow.InterfaceC10985b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.preferences.core.b */
/* loaded from: classes.dex */
public final class C1135b implements InterfaceC1099i<AbstractC1138d> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC1099i<AbstractC1138d> f2930a;

    @DebugMetadata(m454c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m453f = "PreferenceDataStoreFactory.kt", m452i = {}, m451l = {85}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    /* renamed from: androidx.datastore.preferences.core.b$a */
    /* loaded from: classes.dex */
    public static final class C1136a extends AbstractC10790f implements InterfaceC10824p<AbstractC1138d, InterfaceC10772d<? super AbstractC1138d>, Object> {

        /* renamed from: a */
        public int f2931a;

        /* renamed from: b */
        public /* synthetic */ Object f2932b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10824p<AbstractC1138d, InterfaceC10772d<? super AbstractC1138d>, Object> f2933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1136a(InterfaceC10824p<? super AbstractC1138d, ? super InterfaceC10772d<? super AbstractC1138d>, ? extends Object> interfaceC10824p, InterfaceC10772d<? super C1136a> interfaceC10772d) {
            super(2, interfaceC10772d);
            this.f2933c = interfaceC10824p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
            C1136a c1136a = new C1136a(this.f2933c, interfaceC10772d);
            c1136a.f2932b = obj;
            return c1136a;
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Object invoke(AbstractC1138d abstractC1138d, InterfaceC10772d<? super AbstractC1138d> interfaceC10772d) {
            return ((C1136a) create(abstractC1138d, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
            int i = this.f2931a;
            if (i != 0) {
                if (i == 1) {
                    C10864l.m418b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C10864l.m418b(obj);
                this.f2931a = 1;
                obj = this.f2933c.invoke((AbstractC1138d) this.f2932b, this);
                if (obj == enumC10782a) {
                    return enumC10782a;
                }
            }
            AbstractC1138d abstractC1138d = (AbstractC1138d) obj;
            ((C1133a) abstractC1138d).f2928b.set(true);
            return abstractC1138d;
        }
    }

    public C1135b(@NotNull C1107q c1107q) {
        this.f2930a = c1107q;
    }

    @Override // androidx.datastore.core.InterfaceC1099i
    @Nullable
    /* renamed from: a */
    public final Object mo11184a(@NotNull InterfaceC10824p<? super AbstractC1138d, ? super InterfaceC10772d<? super AbstractC1138d>, ? extends Object> interfaceC10824p, @NotNull InterfaceC10772d<? super AbstractC1138d> interfaceC10772d) {
        return this.f2930a.mo11184a(new C1136a(interfaceC10824p, null), interfaceC10772d);
    }

    @Override // androidx.datastore.core.InterfaceC1099i
    @NotNull
    public final InterfaceC10985b<AbstractC1138d> getData() {
        return this.f2930a.getData();
    }
}

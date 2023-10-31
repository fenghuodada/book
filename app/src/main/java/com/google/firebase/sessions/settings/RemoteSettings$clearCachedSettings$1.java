package com.google.firebase.sessions.settings;

import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m508d2 = {"Lkotlinx/coroutines/e0;", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", m453f = "RemoteSettings.kt", m452i = {}, m451l = {148}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class RemoteSettings$clearCachedSettings$1 extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$clearCachedSettings$1(RemoteSettings remoteSettings, InterfaceC10772d<? super RemoteSettings$clearCachedSettings$1> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        return new RemoteSettings$clearCachedSettings$1(this.this$0, interfaceC10772d);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull InterfaceC10976e0 interfaceC10976e0, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((RemoteSettings$clearCachedSettings$1) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SettingsCache settingsCache;
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C10864l.m418b(obj);
            settingsCache = this.this$0.settingsCache;
            this.label = 1;
            if (settingsCache.removeConfigs$com_google_firebase_firebase_sessions(this) == enumC10782a) {
                return enumC10782a;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C10864l.m418b(obj);
        }
        return C10868p.f21418a;
    }
}

package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.C1133a;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m508d2 = {"Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", m453f = "SettingsCache.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class SettingsCache$removeConfigs$2 extends AbstractC10790f implements InterfaceC10824p<C1133a, InterfaceC10772d<? super C10868p>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$2(SettingsCache settingsCache, InterfaceC10772d<? super SettingsCache$removeConfigs$2> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this.this$0, interfaceC10772d);
        settingsCache$removeConfigs$2.L$0 = obj;
        return settingsCache$removeConfigs$2;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull C1133a c1133a, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((SettingsCache$removeConfigs$2) create(c1133a, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        if (this.label == 0) {
            C10864l.m418b(obj);
            C1133a c1133a = (C1133a) this.L$0;
            c1133a.m11186c();
            c1133a.f2927a.clear();
            this.this$0.updateSessionConfigs(c1133a);
            return C10868p.f21418a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

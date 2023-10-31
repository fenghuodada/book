package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.SettingsCache", m453f = "SettingsCache.kt", m452i = {}, m451l = {112}, m450m = "updateConfigValue", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class SettingsCache$updateConfigValue$1<T> extends AbstractC10786c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache, InterfaceC10772d<? super SettingsCache$updateConfigValue$1> interfaceC10772d) {
        super(interfaceC10772d);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateConfigValue;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateConfigValue = this.this$0.updateConfigValue(null, null, this);
        return updateConfigValue;
    }
}

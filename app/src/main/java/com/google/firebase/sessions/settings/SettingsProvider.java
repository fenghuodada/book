package com.google.firebase.sessions.settings;

import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.time.C10931a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m508d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "Lkotlin/p;", "updateSettings", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isSettingsStale", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/a;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/a;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface SettingsProvider {

    @Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static boolean isSettingsStale(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object updateSettings(@NotNull SettingsProvider settingsProvider, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return C10868p.f21418a;
        }
    }

    @Nullable
    Double getSamplingRate();

    @Nullable
    Boolean getSessionEnabled();

    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774 */
    C10931a mo13080getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @Nullable
    Object updateSettings(@NotNull InterfaceC10772d<? super C10868p> interfaceC10772d);
}

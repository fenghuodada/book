package com.google.firebase.sessions.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.time.C10931a;
import kotlin.time.C10933c;
import kotlin.time.EnumC10934d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m508d2 = {"Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "metadata", "Landroid/os/Bundle;", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/a;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/a;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class LocalOverrideSettings implements SettingsProvider {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";
    @Deprecated
    @NotNull
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";
    @Deprecated
    @NotNull
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    private final Bundle metadata;

    @Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m508d2 = {"Lcom/google/firebase/sessions/settings/LocalOverrideSettings$Companion;", "", "()V", "SAMPLING_RATE", "", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public LocalOverrideSettings(@NotNull Context context) {
        C10843j.m430f(context, "context");
        Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        if (this.metadata.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.metadata.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        if (this.metadata.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.metadata.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public C10931a mo13080getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey(SESSION_RESTART_TIMEOUT)) {
            return new C10931a(C10933c.m358b(this.metadata.getInt(SESSION_RESTART_TIMEOUT), EnumC10934d.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return SettingsProvider.DefaultImpls.updateSettings(this, interfaceC10772d);
    }
}

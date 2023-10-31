package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.InterfaceC1099i;
import androidx.datastore.preferences.C1130a;
import androidx.datastore.preferences.C1132c;
import androidx.datastore.preferences.core.AbstractC1138d;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10854s;
import kotlin.jvm.internal.C10860y;
import kotlin.properties.InterfaceC10869a;
import kotlin.reflect.InterfaceC10891h;
import kotlin.time.C10931a;
import kotlin.time.C10933c;
import kotlin.time.EnumC10934d;
import kotlinx.coroutines.C10981f0;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.C11156x1;
import kotlinx.coroutines.internal.C11033f;
import kotlinx.coroutines.scheduling.ExecutorC11106b;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aB1\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0019\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006&"}, m508d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "", "samplingRate", "", "isValidSamplingRate", "Lkotlin/time/a;", "sessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "isValidSessionRestartTimeout", "Lkotlin/p;", "updateSettings", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "getSessionsEnabled", "()Z", "sessionsEnabled", "getSamplingRate", "()D", "getSessionRestartTimeout-UwyO8pc", "()J", "<init>", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "Landroid/content/Context;", "context", "Lkotlin/coroutines/f;", "blockingDispatcher", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "(Landroid/content/Context;Lkotlin/coroutines/f;Lkotlin/coroutines/f;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SessionsSettings {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    public static final String SESSION_CONFIGS_NAME = "firebase_session_settings";
    @Deprecated
    @NotNull
    private static final InterfaceC10869a<Context, InterfaceC1099i<AbstractC1138d>> dataStore$delegate;
    @NotNull
    private final SettingsProvider localOverrideSettings;
    @NotNull
    private final SettingsProvider remoteSettings;

    @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m508d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "Landroid/content/Context;", "Landroidx/datastore/core/i;", "Landroidx/datastore/preferences/core/d;", "dataStore$delegate", "Lkotlin/properties/a;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/i;", "dataStore", "", "SESSION_CONFIGS_NAME", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ InterfaceC10891h<Object>[] $$delegatedProperties;

        static {
            C10854s c10854s = new C10854s(Companion.class);
            C10860y.f21411a.getClass();
            $$delegatedProperties = new InterfaceC10891h[]{c10854s};
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC1099i<AbstractC1138d> getDataStore(Context context) {
            return SessionsSettings.dataStore$delegate.mo417a(context, $$delegatedProperties[0]);
        }
    }

    static {
        ExecutorC11106b executorC11106b = C11093p0.f21709b;
        C11156x1 c11156x1 = new C11156x1(null);
        executorC11106b.getClass();
        C11033f m308a = C10981f0.m308a(InterfaceC10775f.C10776a.m460a(executorC11106b, c11156x1));
        C1130a produceMigrations = C1130a.f2919a;
        C10843j.m430f(produceMigrations, "produceMigrations");
        dataStore$delegate = new C1132c(produceMigrations, m308a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionsSettings(@NotNull Context context, @NotNull InterfaceC10775f blockingDispatcher, @NotNull InterfaceC10775f backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(backgroundDispatcher, firebaseInstallationsApi, appInfo, new RemoteSettingsFetcher(appInfo, blockingDispatcher, null, 4, null), Companion.getDataStore(context)));
        C10843j.m430f(context, "context");
        C10843j.m430f(blockingDispatcher, "blockingDispatcher");
        C10843j.m430f(backgroundDispatcher, "backgroundDispatcher");
        C10843j.m430f(firebaseInstallationsApi, "firebaseInstallationsApi");
        C10843j.m430f(appInfo, "appInfo");
    }

    public SessionsSettings(@NotNull SettingsProvider localOverrideSettings, @NotNull SettingsProvider remoteSettings) {
        C10843j.m430f(localOverrideSettings, "localOverrideSettings");
        C10843j.m430f(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo  reason: not valid java name */
    private final boolean m13081isValidSessionRestartTimeoutLRDsOJo(long j) {
        boolean z;
        int i = C10931a.f21479d;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (!C10931a.m361c(j))) {
            return true;
        }
        return false;
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 != null) {
            double doubleValue2 = samplingRate2.doubleValue();
            if (isValidSamplingRate(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc  reason: not valid java name */
    public final long m13082getSessionRestartTimeoutUwyO8pc() {
        C10931a mo13080getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo13080getSessionRestartTimeoutFghU774();
        if (mo13080getSessionRestartTimeoutFghU774 != null) {
            long j = mo13080getSessionRestartTimeoutFghU774.f21480a;
            if (m13081isValidSessionRestartTimeoutLRDsOJo(j)) {
                return j;
            }
        }
        C10931a mo13080getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo13080getSessionRestartTimeoutFghU774();
        if (mo13080getSessionRestartTimeoutFghU7742 != null) {
            long j2 = mo13080getSessionRestartTimeoutFghU7742.f21480a;
            if (m13081isValidSessionRestartTimeoutLRDsOJo(j2)) {
                return j2;
            }
        }
        int i = C10931a.f21479d;
        return C10933c.m358b(30, EnumC10934d.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C10864l.m418b(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.C10864l.m418b(r6)
            goto L4b
        L3a:
            kotlin.C10864l.m418b(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            kotlin.p r6 = kotlin.C10868p.f21418a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.d):java.lang.Object");
    }
}

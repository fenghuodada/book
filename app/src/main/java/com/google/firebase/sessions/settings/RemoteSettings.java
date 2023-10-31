package com.google.firebase.sessions.settings;

import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.InterfaceC1099i;
import androidx.datastore.preferences.core.AbstractC1138d;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.time.C10931a;
import kotlin.time.C10933c;
import kotlin.time.EnumC10934d;
import kotlinx.coroutines.C10975e;
import kotlinx.coroutines.C10981f0;
import kotlinx.coroutines.sync.C11126d;
import kotlinx.coroutines.sync.InterfaceC11123a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B5\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\f\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001f\u0010%\u001a\u0004\u0018\u00010\"8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m508d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "s", "removeForwardSlashesIn", "Lkotlin/p;", "updateSettings", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isSettingsStale", "clearCachedSettings$com_google_firebase_firebase_sessions", "()V", "clearCachedSettings", "Lkotlin/coroutines/f;", "backgroundDispatcher", "Lkotlin/coroutines/f;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lkotlinx/coroutines/sync/a;", "fetchInProgress", "Lkotlinx/coroutines/sync/a;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/a;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/a;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Landroidx/datastore/core/i;", "Landroidx/datastore/preferences/core/d;", "dataStore", "<init>", "(Lkotlin/coroutines/f;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/i;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class RemoteSettings implements SettingsProvider {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    public static final String FORWARD_SLASH_STRING = "/";
    @Deprecated
    @NotNull
    public static final String TAG = "SessionConfigFetcher";
    @NotNull
    private final ApplicationInfo appInfo;
    @NotNull
    private final InterfaceC10775f backgroundDispatcher;
    @NotNull
    private final CrashlyticsSettingsFetcher configsFetcher;
    @NotNull
    private final InterfaceC11123a fetchInProgress;
    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    @NotNull
    private final SettingsCache settingsCache;

    @Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m508d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public RemoteSettings(@NotNull InterfaceC10775f backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo, @NotNull CrashlyticsSettingsFetcher configsFetcher, @NotNull InterfaceC1099i<AbstractC1138d> dataStore) {
        C10843j.m430f(backgroundDispatcher, "backgroundDispatcher");
        C10843j.m430f(firebaseInstallationsApi, "firebaseInstallationsApi");
        C10843j.m430f(appInfo, "appInfo");
        C10843j.m430f(configsFetcher, "configsFetcher");
        C10843j.m430f(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = new SettingsCache(dataStore);
        this.fetchInProgress = new C11126d(false);
    }

    private final String removeForwardSlashesIn(String input) {
        Pattern compile = Pattern.compile(FORWARD_SLASH_STRING);
        C10843j.m431e(compile, "compile(pattern)");
        C10843j.m430f(input, "input");
        String replaceAll = compile.matcher(input).replaceAll("");
        C10843j.m431e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @VisibleForTesting
    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        C10975e.m310a(C10981f0.m308a(this.backgroundDispatcher), null, new RemoteSettings$clearCachedSettings$1(this, null), 3);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public C10931a mo13080getSessionRestartTimeoutFghU774() {
        Integer sessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (sessionRestartTimeout != null) {
            int i = C10931a.f21479d;
            return new C10931a(C10933c.m358b(sessionRestartTimeout.intValue(), EnumC10934d.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:44:0x00a6, B:46:0x00aa, B:50:0x00b8, B:36:0x0080, B:38:0x0088, B:41:0x008e), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:44:0x00a6, B:46:0x00aa, B:50:0x00b8, B:36:0x0080, B:38:0x0088, B:41:0x008e), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:44:0x00a6, B:46:0x00aa, B:50:0x00b8, B:36:0x0080, B:38:0x0088, B:41:0x008e), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(kotlin.coroutines.d):java.lang.Object");
    }
}

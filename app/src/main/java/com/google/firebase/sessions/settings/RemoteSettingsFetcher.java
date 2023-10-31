package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.C10975e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(m509d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m508d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Ljava/net/URL;", "settingsUrl", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/d;", "Lkotlin/p;", "", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;Lkotlin/jvm/functions/p;Lkotlin/jvm/functions/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lkotlin/coroutines/f;", "blockingDispatcher", "Lkotlin/coroutines/f;", "baseUrl", "Ljava/lang/String;", "<init>", "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/f;Ljava/lang/String;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String FIREBASE_PLATFORM = "android";
    @NotNull
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    @NotNull
    private final ApplicationInfo appInfo;
    @NotNull
    private final String baseUrl;
    @NotNull
    private final InterfaceC10775f blockingDispatcher;

    @Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m508d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher$Companion;", "", "()V", "FIREBASE_PLATFORM", "", "FIREBASE_SESSIONS_BASE_URL_STRING", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo appInfo, @NotNull InterfaceC10775f blockingDispatcher, @NotNull String baseUrl) {
        C10843j.m430f(appInfo, "appInfo");
        C10843j.m430f(blockingDispatcher, "blockingDispatcher");
        C10843j.m430f(baseUrl, "baseUrl");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
        this.baseUrl = baseUrl;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, InterfaceC10775f interfaceC10775f, String str, int i, C10839f c10839f) {
        this(applicationInfo, interfaceC10775f, (i & 4) != 0 ? FIREBASE_SESSIONS_BASE_URL_STRING : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(FIREBASE_PLATFORM).appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull InterfaceC10824p<? super JSONObject, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p, @NotNull InterfaceC10824p<? super String, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p2, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object m309b = C10975e.m309b(interfaceC10772d, this.blockingDispatcher, new RemoteSettingsFetcher$doConfigFetch$2(this, map, interfaceC10824p, interfaceC10824p2, null));
        return m309b == EnumC10782a.COROUTINE_SUSPENDED ? m309b : C10868p.f21418a;
    }
}

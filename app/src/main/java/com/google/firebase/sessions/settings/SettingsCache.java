package com.google.firebase.sessions.settings;

import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.InterfaceC1099i;
import androidx.datastore.preferences.core.AbstractC1138d;
import androidx.datastore.preferences.core.C1133a;
import androidx.datastore.preferences.core.C1141e;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10765u;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.AbstractC11138t0;
import kotlinx.coroutines.C10951c;
import kotlinx.coroutines.C11091o1;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.C11137t;
import kotlinx.coroutines.C11160z;
import kotlinx.coroutines.C11164z1;
import kotlinx.coroutines.InterfaceC10954c1;
import kotlinx.coroutines.InterfaceC10976e0;
import kotlinx.coroutines.flow.C10987d;
import kotlinx.coroutines.flow.InterfaceC10985b;
import kotlinx.coroutines.scheduling.C11107c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0015\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J1\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001d\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010)\u001a\u00020\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, m508d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "Landroidx/datastore/preferences/core/d;", "preferences", "Lkotlin/p;", "updateSessionConfigs", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/preferences/core/d$a;", "key", "value", "updateConfigValue", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "()Z", "hasCacheExpired", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "enabled", "updateSettingsEnabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/d;)Ljava/lang/Object;", "rate", "updateSamplingRate", "(Ljava/lang/Double;Lkotlin/coroutines/d;)Ljava/lang/Object;", "timeoutInSeconds", "updateSessionRestartTimeout", "(Ljava/lang/Integer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cacheDurationInSeconds", "updateSessionCacheDuration", "", "cacheUpdatedTime", "updateSessionCacheUpdatedTime", "(Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeConfigs", "Landroidx/datastore/core/i;", "dataStore", "Landroidx/datastore/core/i;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "(Landroidx/datastore/core/i;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SettingsCache {
    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";
    @NotNull
    private final InterfaceC1099i<AbstractC1138d> dataStore;
    private SessionConfigs sessionConfigs;
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    private static final AbstractC1138d.C1139a<Boolean> SESSIONS_ENABLED = new AbstractC1138d.C1139a<>(LocalOverrideSettings.SESSIONS_ENABLED);
    @Deprecated
    @NotNull
    private static final AbstractC1138d.C1139a<Double> SAMPLING_RATE = new AbstractC1138d.C1139a<>(LocalOverrideSettings.SAMPLING_RATE);
    @Deprecated
    @NotNull
    private static final AbstractC1138d.C1139a<Integer> RESTART_TIMEOUT_SECONDS = new AbstractC1138d.C1139a<>("firebase_sessions_restart_timeout");
    @Deprecated
    @NotNull
    private static final AbstractC1138d.C1139a<Integer> CACHE_DURATION_SECONDS = new AbstractC1138d.C1139a<>("firebase_sessions_cache_duration");
    @Deprecated
    @NotNull
    private static final AbstractC1138d.C1139a<Long> CACHE_UPDATED_TIME = new AbstractC1138d.C1139a<>("firebase_sessions_cache_updated_time");

    @Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m508d2 = {"Lkotlinx/coroutines/e0;", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
    @DebugMetadata(m454c = "com.google.firebase.sessions.settings.SettingsCache$1", m453f = "SettingsCache.kt", m452i = {}, m451l = {46}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1 */
    /* loaded from: classes3.dex */
    public static final class C85731 extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {
        Object L$0;
        int label;

        public C85731(InterfaceC10772d<? super C85731> interfaceC10772d) {
            super(2, interfaceC10772d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
            return new C85731(interfaceC10772d);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        @Nullable
        public final Object invoke(@NotNull InterfaceC10976e0 interfaceC10976e0, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return ((C85731) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SettingsCache settingsCache;
            EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    settingsCache = (SettingsCache) this.L$0;
                    C10864l.m418b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C10864l.m418b(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                InterfaceC10985b data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object m307a = C10987d.m307a(data, this);
                if (m307a == enumC10782a) {
                    return enumC10782a;
                }
                settingsCache = settingsCache2;
                obj = m307a;
            }
            settingsCache.updateSessionConfigs(new C1133a((Map<AbstractC1138d.C1139a<?>, Object>) C10765u.m462g(((AbstractC1138d) obj).mo11183a()), true));
            return C10868p.f21418a;
        }
    }

    @Metadata(m509d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m508d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", "", "Landroidx/datastore/preferences/core/d$a;", "", "SESSIONS_ENABLED", "Landroidx/datastore/preferences/core/d$a;", "getSESSIONS_ENABLED", "()Landroidx/datastore/preferences/core/d$a;", "", "SAMPLING_RATE", "getSAMPLING_RATE", "", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "CACHE_DURATION_SECONDS", "getCACHE_DURATION_SECONDS", "", "CACHE_UPDATED_TIME", "getCACHE_UPDATED_TIME", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @NotNull
        public final AbstractC1138d.C1139a<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        @NotNull
        public final AbstractC1138d.C1139a<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        @NotNull
        public final AbstractC1138d.C1139a<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        @NotNull
        public final AbstractC1138d.C1139a<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        @NotNull
        public final AbstractC1138d.C1139a<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }
    }

    public SettingsCache(@NotNull InterfaceC1099i<AbstractC1138d> dataStore) {
        long j;
        C10843j.m430f(dataStore, "dataStore");
        this.dataStore = dataStore;
        InterfaceC10824p c85731 = new C85731(null);
        C10781g c10781g = C10781g.f21377a;
        Thread currentThread = Thread.currentThread();
        InterfaceC10773e.C10774a c10774a = InterfaceC10773e.C10774a.f21375a;
        AbstractC11138t0 m99a = C11164z1.m99a();
        InterfaceC10775f m102a = C11160z.m102a(c10781g, m99a, true);
        C11107c c11107c = C11093p0.f21708a;
        if (m102a != c11107c && m102a.mo195a(c10774a) == null) {
            m102a = m102a.mo190f(c11107c);
        }
        C10951c c10951c = new C10951c(m102a, currentThread, m99a);
        c10951c.m355d0(1, c10951c, c85731);
        AbstractC11138t0 abstractC11138t0 = c10951c.f21503e;
        if (abstractC11138t0 != null) {
            int i = AbstractC11138t0.f21797f;
            abstractC11138t0.m126J(false);
        }
        while (!Thread.interrupted()) {
            if (abstractC11138t0 != null) {
                j = abstractC11138t0.mo123K();
            } else {
                j = Long.MAX_VALUE;
            }
            if (!(!(c10951c.m207M() instanceof InterfaceC10954c1))) {
                LockSupport.parkNanos(c10951c, j);
            } else {
                if (abstractC11138t0 != null) {
                    int i2 = AbstractC11138t0.f21797f;
                    abstractC11138t0.m127I(false);
                }
                Object m172a = C11091o1.m172a(c10951c.m207M());
                C11137t c11137t = m172a instanceof C11137t ? (C11137t) m172a : null;
                if (c11137t == null) {
                    return;
                }
                throw c11137t.f21796a;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c10951c.m181z(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        android.util.Log.w(com.google.firebase.sessions.settings.SettingsCache.TAG, "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.AbstractC1138d.C1139a<T> r6, T r7, kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C10864l.m418b(r8)     // Catch: java.io.IOException -> L48
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.C10864l.m418b(r8)
            androidx.datastore.core.i<androidx.datastore.preferences.core.d> r8 = r5.dataStore     // Catch: java.io.IOException -> L48
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L48
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L48
            r0.label = r3     // Catch: java.io.IOException -> L48
            androidx.datastore.preferences.core.e r6 = new androidx.datastore.preferences.core.e     // Catch: java.io.IOException -> L48
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L48
            java.lang.Object r6 = r8.mo11184a(r6, r0)     // Catch: java.io.IOException -> L48
            if (r6 != r1) goto L5c
            return r1
        L48:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5c:
            kotlin.p r6 = kotlin.C10868p.f21418a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(androidx.datastore.preferences.core.d$a, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(AbstractC1138d abstractC1138d) {
        this.sessionConfigs = new SessionConfigs((Boolean) abstractC1138d.mo11182b(SESSIONS_ENABLED), (Double) abstractC1138d.mo11182b(SAMPLING_RATE), (Integer) abstractC1138d.mo11182b(RESTART_TIMEOUT_SECONDS), (Integer) abstractC1138d.mo11182b(CACHE_DURATION_SECONDS), (Long) abstractC1138d.mo11182b(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            C10843j.m424l("sessionConfigs");
            throw null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 != null) {
            Integer cacheDuration = sessionConfigs2.getCacheDuration();
            return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
        }
        C10843j.m424l("sessionConfigs");
        throw null;
    }

    @VisibleForTesting
    @Nullable
    public final Object removeConfigs$com_google_firebase_firebase_sessions(@NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object mo11184a = this.dataStore.mo11184a(new C1141e(new SettingsCache$removeConfigs$2(this, null), null), interfaceC10772d);
        if (mo11184a == EnumC10782a.COROUTINE_SUSPENDED) {
            return mo11184a;
        }
        return C10868p.f21418a;
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionRestartTimeout();
        }
        C10843j.m424l("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionSamplingRate();
        }
        C10843j.m424l("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionEnabled();
        }
        C10843j.m424l("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object updateConfigValue = updateConfigValue(SAMPLING_RATE, d, interfaceC10772d);
        return updateConfigValue == EnumC10782a.COROUTINE_SUSPENDED ? updateConfigValue : C10868p.f21418a;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object updateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, interfaceC10772d);
        return updateConfigValue == EnumC10782a.COROUTINE_SUSPENDED ? updateConfigValue : C10868p.f21418a;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object updateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l, interfaceC10772d);
        return updateConfigValue == EnumC10782a.COROUTINE_SUSPENDED ? updateConfigValue : C10868p.f21418a;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object updateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, interfaceC10772d);
        return updateConfigValue == EnumC10782a.COROUTINE_SUSPENDED ? updateConfigValue : C10868p.f21418a;
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        Object updateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, interfaceC10772d);
        return updateConfigValue == EnumC10782a.COROUTINE_SUSPENDED ? updateConfigValue : C10868p.f21418a;
    }
}

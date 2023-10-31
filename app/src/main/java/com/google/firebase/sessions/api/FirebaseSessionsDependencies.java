package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.sync.C11126d;
import kotlinx.coroutines.sync.InterfaceC11123a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.util.DesugarCollections;

@Metadata(m509d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RT\u0010\u001c\u001aB\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u0004 \u001b* \u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m508d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "subscriberName", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "getDependency", "Lkotlin/p;", "addDependency", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "register$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "register", "", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "getRegisteredSubscribers", "getSubscriber$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "reset$com_google_firebase_firebase_sessions", "()V", "reset", "", "TAG", "Ljava/lang/String;", "", "kotlin.jvm.PlatformType", "dependencies", "Ljava/util/Map;", "<init>", "Dependency", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseSessionsDependencies {
    @NotNull
    private static final String TAG = "SessionsDependencies";
    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = DesugarCollections.synchronizedMap(new LinkedHashMap());

    @Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m508d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "Lkotlinx/coroutines/sync/a;", "component1", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "component2", "mutex", "subscriber", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlinx/coroutines/sync/a;", "getMutex", "()Lkotlinx/coroutines/sync/a;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "<init>", "(Lkotlinx/coroutines/sync/a;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class Dependency {
        @NotNull
        private final InterfaceC11123a mutex;
        @Nullable
        private SessionSubscriber subscriber;

        public Dependency(@NotNull InterfaceC11123a mutex, @Nullable SessionSubscriber sessionSubscriber) {
            C10843j.m430f(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public /* synthetic */ Dependency(InterfaceC11123a interfaceC11123a, SessionSubscriber sessionSubscriber, int i, C10839f c10839f) {
            this(interfaceC11123a, (i & 2) != 0 ? null : sessionSubscriber);
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, InterfaceC11123a interfaceC11123a, SessionSubscriber sessionSubscriber, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC11123a = dependency.mutex;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(interfaceC11123a, sessionSubscriber);
        }

        @NotNull
        public final InterfaceC11123a component1() {
            return this.mutex;
        }

        @Nullable
        public final SessionSubscriber component2() {
            return this.subscriber;
        }

        @NotNull
        public final Dependency copy(@NotNull InterfaceC11123a mutex, @Nullable SessionSubscriber sessionSubscriber) {
            C10843j.m430f(mutex, "mutex");
            return new Dependency(mutex, sessionSubscriber);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Dependency) {
                Dependency dependency = (Dependency) obj;
                return C10843j.m435a(this.mutex, dependency.mutex) && C10843j.m435a(this.subscriber, dependency.subscriber);
            }
            return false;
        }

        @NotNull
        public final InterfaceC11123a getMutex() {
            return this.mutex;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int hashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return hashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }
    }

    private FirebaseSessionsDependencies() {
    }

    private final Dependency getDependency(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        C10843j.m431e(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(name);
        if (dependency != null) {
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    public final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        C10843j.m430f(subscriberName, "subscriberName");
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d(TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        C10843j.m431e(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(new C11126d(true), null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:21:0x009f). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r2 = r0.L$5
            java.lang.Object r4 = r0.L$4
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.sync.a r5 = (kotlinx.coroutines.sync.InterfaceC11123a) r5
            java.lang.Object r6 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r6
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$0
            java.util.Map r8 = (java.util.Map) r8
            kotlin.C10864l.m418b(r11)
            goto L9f
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L45:
            kotlin.C10864l.m418b(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.C10843j.m431e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = kotlin.collections.C10764t.m468a(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L68:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r6
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.a r5 = r11.getMutex()
            r0.L$0 = r4
            r0.L$1 = r7
            r0.L$2 = r6
            r0.L$3 = r5
            r0.L$4 = r4
            r0.L$5 = r2
            r0.label = r3
            java.lang.Object r11 = r5.mo138c(r0)
            if (r11 != r1) goto L9e
            return r1
        L9e:
            r8 = r4
        L9f:
            r11 = 0
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r9 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lae
            com.google.firebase.sessions.api.SessionSubscriber r6 = r9.getSubscriber$com_google_firebase_firebase_sessions(r6)     // Catch: java.lang.Throwable -> Lae
            r5.mo139b(r11)
            r4.put(r2, r6)
            r4 = r8
            goto L68
        Lae:
            r0 = move-exception
            r5.mo139b(r11)
            throw r0
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.d):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        C10843j.m430f(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void register$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber subscriber) {
        C10843j.m430f(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Log.d(TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        dependency.getMutex().mo139b(null);
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}

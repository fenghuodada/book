package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.datatransport.InterfaceC6467g;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.AbstractC10946b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B7\b\u0000\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m508d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lkotlin/p;", "initiateSessionStart", "(Lcom/google/firebase/sessions/SessionDetails;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "shouldCollectEvents", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "register", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/sessions/ApplicationInfo;", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "Lcom/google/firebase/sessions/EventGDTLogger;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/SessionCoordinator;", "sessionCoordinator", "Lcom/google/firebase/sessions/SessionCoordinator;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lkotlinx/coroutines/b0;", "backgroundDispatcher", "blockingDispatcher", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/g;", "transportFactoryProvider", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlinx/coroutines/b0;Lkotlinx/coroutines/b0;Lcom/google/firebase/inject/Provider;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseSessions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "FirebaseSessions";
    @NotNull
    private final ApplicationInfo applicationInfo;
    @NotNull
    private final EventGDTLogger eventGDTLogger;
    @NotNull
    private final FirebaseApp firebaseApp;
    @NotNull
    private final SessionCoordinator sessionCoordinator;
    @NotNull
    private final SessionGenerator sessionGenerator;
    @NotNull
    private final SessionsSettings sessionSettings;
    @NotNull
    private final TimeProvider timeProvider;

    @Metadata(m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m508d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance$annotations", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "app", "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final FirebaseSessions getInstance() {
            return getInstance(FirebaseKt.getApp(Firebase.INSTANCE));
        }

        @JvmStatic
        @NotNull
        public final FirebaseSessions getInstance(@NotNull FirebaseApp app) {
            C10843j.m430f(app, "app");
            Object obj = app.get(FirebaseSessions.class);
            C10843j.m431e(obj, "app.get(FirebaseSessions::class.java)");
            return (FirebaseSessions) obj;
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull AbstractC10946b0 backgroundDispatcher, @NotNull AbstractC10946b0 blockingDispatcher, @NotNull Provider<InterfaceC6467g> transportFactoryProvider) {
        C10843j.m430f(firebaseApp, "firebaseApp");
        C10843j.m430f(firebaseInstallations, "firebaseInstallations");
        C10843j.m430f(backgroundDispatcher, "backgroundDispatcher");
        C10843j.m430f(blockingDispatcher, "blockingDispatcher");
        C10843j.m430f(transportFactoryProvider, "transportFactoryProvider");
        this.firebaseApp = firebaseApp;
        ApplicationInfo applicationInfo = SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
        this.applicationInfo = applicationInfo;
        Context applicationContext = firebaseApp.getApplicationContext();
        C10843j.m431e(applicationContext, "firebaseApp.applicationContext");
        SessionsSettings sessionsSettings = new SessionsSettings(applicationContext, blockingDispatcher, backgroundDispatcher, firebaseInstallations, applicationInfo);
        this.sessionSettings = sessionsSettings;
        Time time = new Time();
        this.timeProvider = time;
        EventGDTLogger eventGDTLogger = new EventGDTLogger(transportFactoryProvider);
        this.eventGDTLogger = eventGDTLogger;
        this.sessionCoordinator = new SessionCoordinator(firebaseInstallations, eventGDTLogger);
        SessionGenerator sessionGenerator = new SessionGenerator(shouldCollectEvents(), time, null, 4, null);
        this.sessionGenerator = sessionGenerator;
        SessionInitiator sessionInitiator = new SessionInitiator(time, backgroundDispatcher, new SessionInitiateListener() { // from class: com.google.firebase.sessions.FirebaseSessions$sessionInitiateListener$1
            @Override // com.google.firebase.sessions.SessionInitiateListener
            @Nullable
            public Object onInitiateSession(@NotNull SessionDetails sessionDetails, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
                Object initiateSessionStart;
                initiateSessionStart = FirebaseSessions.this.initiateSessionStart(sessionDetails, interfaceC10772d);
                return initiateSessionStart == EnumC10782a.COROUTINE_SUSPENDED ? initiateSessionStart : C10868p.f21418a;
            }
        }, sessionsSettings, sessionGenerator);
        Context applicationContext2 = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(sessionInitiator.m3292x5f1bb3aa());
            return;
        }
        Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext2.getClass() + '.');
    }

    @NotNull
    public static final FirebaseSessions getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    @NotNull
    public static final FirebaseSessions getInstance(@NotNull FirebaseApp firebaseApp) {
        return Companion.getInstance(firebaseApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initiateSessionStart(com.google.firebase.sessions.SessionDetails r12, kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.initiateSessionStart(com.google.firebase.sessions.SessionDetails, kotlin.coroutines.d):java.lang.Object");
    }

    private final boolean shouldCollectEvents() {
        return Math.random() <= this.sessionSettings.getSamplingRate();
    }

    public final void register(@NotNull SessionSubscriber subscriber) {
        C10843j.m430f(subscriber, "subscriber");
        FirebaseSessionsDependencies.INSTANCE.register$com_google_firebase_firebase_sessions(subscriber);
        Log.d(TAG, "Registering Sessions SDK subscriber with name: " + subscriber.getSessionSubscriberName() + ", data collection enabled: " + subscriber.isDataCollectionEnabled());
        if (this.sessionGenerator.getHasGenerateSession()) {
            subscriber.onSessionChanged(new SessionSubscriber.SessionDetails(this.sessionGenerator.getCurrentSession().getSessionId()));
        }
    }
}

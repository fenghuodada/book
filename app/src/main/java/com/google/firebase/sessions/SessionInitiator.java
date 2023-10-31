package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.ranges.C10881f;
import kotlin.ranges.C10882g;
import kotlin.time.C10931a;
import kotlin.time.C10932b;
import kotlin.time.C10933c;
import kotlinx.coroutines.C10975e;
import kotlinx.coroutines.C10981f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m508d2 = {"Lcom/google/firebase/sessions/SessionInitiator;", "", "Lkotlin/p;", "initiateSession", "appBackgrounded", "appForegrounded", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "Lkotlin/coroutines/f;", "backgroundDispatcher", "Lkotlin/coroutines/f;", "Lcom/google/firebase/sessions/SessionInitiateListener;", "sessionInitiateListener", "Lcom/google/firebase/sessions/SessionInitiateListener;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "Lkotlin/time/a;", "backgroundTime", "J", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getActivityLifecycleCallbacks$com_google_firebase_firebase_sessions", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/coroutines/f;Lcom/google/firebase/sessions/SessionInitiateListener;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;)V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SessionInitiator {
    @NotNull
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    @NotNull
    private final InterfaceC10775f backgroundDispatcher;
    private long backgroundTime;
    @NotNull
    private final SessionGenerator sessionGenerator;
    @NotNull
    private final SessionInitiateListener sessionInitiateListener;
    @NotNull
    private final SessionsSettings sessionsSettings;
    @NotNull
    private final TimeProvider timeProvider;

    public SessionInitiator(@NotNull TimeProvider timeProvider, @NotNull InterfaceC10775f backgroundDispatcher, @NotNull SessionInitiateListener sessionInitiateListener, @NotNull SessionsSettings sessionsSettings, @NotNull SessionGenerator sessionGenerator) {
        C10843j.m430f(timeProvider, "timeProvider");
        C10843j.m430f(backgroundDispatcher, "backgroundDispatcher");
        C10843j.m430f(sessionInitiateListener, "sessionInitiateListener");
        C10843j.m430f(sessionsSettings, "sessionsSettings");
        C10843j.m430f(sessionGenerator, "sessionGenerator");
        this.timeProvider = timeProvider;
        this.backgroundDispatcher = backgroundDispatcher;
        this.sessionInitiateListener = sessionInitiateListener;
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.backgroundTime = timeProvider.mo13079elapsedRealtimeUwyO8pc();
        initiateSession();
        this.activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.google.firebase.sessions.SessionInitiator$activityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                C10843j.m430f(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
                C10843j.m430f(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                C10843j.m430f(activity, "activity");
                SessionInitiator.this.appBackgrounded();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                C10843j.m430f(activity, "activity");
                SessionInitiator.this.appForegrounded();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                C10843j.m430f(activity, "activity");
                C10843j.m430f(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
                C10843j.m430f(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                C10843j.m430f(activity, "activity");
            }
        };
    }

    private final void initiateSession() {
        C10975e.m310a(C10981f0.m308a(this.backgroundDispatcher), null, new SessionInitiator$initiateSession$1(this, this.sessionGenerator.generateNewSession(), null), 3);
    }

    public final void appBackgrounded() {
        this.backgroundTime = this.timeProvider.mo13079elapsedRealtimeUwyO8pc();
    }

    public final void appForegrounded() {
        long j;
        long j2;
        long mo13079elapsedRealtimeUwyO8pc = this.timeProvider.mo13079elapsedRealtimeUwyO8pc();
        long j3 = this.backgroundTime;
        int i = C10931a.f21479d;
        long j4 = ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
        int i2 = C10932b.f21481a;
        if (C10931a.m361c(mo13079elapsedRealtimeUwyO8pc)) {
            if (!(!C10931a.m361c(j4)) && (j4 ^ mo13079elapsedRealtimeUwyO8pc) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
        } else if (C10931a.m361c(j4)) {
            mo13079elapsedRealtimeUwyO8pc = j4;
        } else {
            int i3 = ((int) mo13079elapsedRealtimeUwyO8pc) & 1;
            boolean z = false;
            if (i3 == (((int) j4) & 1)) {
                long j5 = (mo13079elapsedRealtimeUwyO8pc >> 1) + (j4 >> 1);
                if (i3 == 0) {
                    z = true;
                }
                if (z) {
                    if (!new C10881f(-4611686018426999999L, 4611686018426999999L).m414a(j5)) {
                        mo13079elapsedRealtimeUwyO8pc = C10933c.m359a(j5 / 1000000);
                    }
                    mo13079elapsedRealtimeUwyO8pc = j5 << 1;
                } else if (new C10881f(-4611686018426L, 4611686018426L).m414a(j5)) {
                    j5 *= 1000000;
                    mo13079elapsedRealtimeUwyO8pc = j5 << 1;
                } else {
                    mo13079elapsedRealtimeUwyO8pc = C10933c.m359a(C10882g.m413a(j5));
                }
            } else {
                if (i3 == 1) {
                    z = true;
                }
                if (z) {
                    j = mo13079elapsedRealtimeUwyO8pc >> 1;
                    j2 = j4 >> 1;
                } else {
                    long j6 = mo13079elapsedRealtimeUwyO8pc >> 1;
                    j = j4 >> 1;
                    j2 = j6;
                }
                mo13079elapsedRealtimeUwyO8pc = C10931a.m363a(j, j2);
            }
        }
        if (C10931a.m362b(mo13079elapsedRealtimeUwyO8pc, this.sessionsSettings.m13082getSessionRestartTimeoutUwyO8pc()) > 0) {
            initiateSession();
        }
    }

    @NotNull
    /* renamed from: getActivityLifecycleCallbacks$com_google_firebase_firebase_sessions */
    public final Application.ActivityLifecycleCallbacks m3292x5f1bb3aa() {
        return this.activityLifecycleCallbacks;
    }
}

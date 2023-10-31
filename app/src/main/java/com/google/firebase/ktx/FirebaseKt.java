package com.google.firebase.ktx;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.AbstractC10946b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b\u001a\"\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\nH\u0082\b\"\u0014\u0010\u000f\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\t\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m508d2 = {"Lcom/google/firebase/ktx/Firebase;", "", "name", "Lcom/google/firebase/FirebaseApp;", "app", "Landroid/content/Context;", "context", "initialize", "Lcom/google/firebase/FirebaseOptions;", "options", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/firebase/components/Component;", "Lkotlinx/coroutines/b0;", "coroutineDispatcher", "LIBRARY_NAME", "Ljava/lang/String;", "getApp", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseApp;", "getOptions", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseOptions;", "com.google.firebase-firebase-common-ktx"}, m507k = 2, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-core-ktx";

    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase, @NotNull String name) {
        C10843j.m430f(firebase, "<this>");
        C10843j.m430f(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        C10843j.m431e(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<AbstractC10946b0> coroutineDispatcher() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase) {
        C10843j.m430f(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        C10843j.m431e(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase) {
        C10843j.m430f(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        C10843j.m431e(options, "Firebase.app.options");
        return options;
    }

    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        C10843j.m430f(firebase, "<this>");
        C10843j.m430f(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions options) {
        C10843j.m430f(firebase, "<this>");
        C10843j.m430f(context, "context");
        C10843j.m430f(options, "options");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, options);
        C10843j.m431e(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions options, @NotNull String name) {
        C10843j.m430f(firebase, "<this>");
        C10843j.m430f(context, "context");
        C10843j.m430f(options, "options");
        C10843j.m430f(name, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, options, name);
        C10843j.m431e(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}

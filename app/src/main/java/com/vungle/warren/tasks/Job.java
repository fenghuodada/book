package com.vungle.warren.tasks;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public interface Job {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Result {
        public static final int FAILURE = 1;
        public static final int RESCHEDULE = 2;
        public static final int SUCCESS = 0;
    }

    /* renamed from: a */
    int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e);
}

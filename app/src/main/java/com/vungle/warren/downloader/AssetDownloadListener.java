package com.vungle.warren.downloader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: classes3.dex */
public interface AssetDownloadListener {

    /* loaded from: classes3.dex */
    public static class DownloadError {
        @ErrorReason

        /* renamed from: a */
        public final int f19442a;

        /* renamed from: b */
        public final int f19443b;

        /* renamed from: c */
        public final Throwable f19444c;

        /* loaded from: classes3.dex */
        public @interface ErrorReason {
            public static final int CONNECTION_ERROR = 0;
            public static final int DISK_ERROR = 2;
            public static final int FILE_NOT_FOUND_ERROR = 3;
            public static final int INTERNAL_ERROR = 4;
            public static final int REQUEST_ERROR = 1;
        }

        public DownloadError(int i, Throwable th, int i2) {
            this.f19443b = i;
            this.f19444c = th;
            this.f19442a = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static class Progress {
        @ProgressStatus

        /* renamed from: a */
        public int f19445a;

        /* renamed from: b */
        public int f19446b;

        /* loaded from: classes3.dex */
        public @interface ProgressStatus {
            public static final int CANCELLED = 3;
            public static final int DONE = 4;
            public static final int IN_PROGRESS = 1;
            public static final int LOST_CONNECTION = 5;
            public static final int PAUSED = 2;
            public static final int STARTED = 0;
            public static final int STATE_CHANGED = 6;
        }
    }

    /* renamed from: a */
    void mo1510a(@NonNull File file, @NonNull DownloadRequest downloadRequest);

    /* renamed from: b */
    void mo1509b();

    /* renamed from: c */
    void mo1508c(@NonNull DownloadError downloadError, @Nullable DownloadRequest downloadRequest);
}
